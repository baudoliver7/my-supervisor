package com.minlessika.supervisor.takes;

import java.util.logging.Level;

import org.takes.facets.flash.RsFlash;
import org.takes.facets.forward.RsForward;
import org.takes.rq.RqHref;

import com.minlessika.membership.takes.RqUser;
import com.minlessika.sdk.datasource.Base;
import com.minlessika.sdk.takes.TkBaseWrap;
import com.minlessika.supervisor.domain.Activities;
import com.minlessika.supervisor.domain.Activity;
import com.minlessika.supervisor.domain.Supervisor;
import com.minlessika.supervisor.domain.impl.PxSupervisor;

public final class TkActivityDelete extends TkBaseWrap {

	public TkActivityDelete(Base base) {
		super(
				base, 
				req -> {
					final Supervisor module = new PxSupervisor(base, req);
					final Activities myActivities = module.activities();
					
					final Long id = Long.parseLong(new RqHref.Smart(req).single("id", "0"));			
					if(id == 0)
						throw new IllegalArgumentException("Cet élément n'existe pas !");
					
					Activity item = myActivities.get(id);
					
					if(new RqUser(base, req).notOwn(item)) {
						throw new IllegalArgumentException("Vous ne pouvez pas supprimer une activité partagée !");
					}
					
					if(!item.appOwner().module().equals(Supervisor.NAME))
						throw new IllegalArgumentException("Vous ne pouvez supprimer cette activité que depuis son application propriétaire !"); 
					
					String name = item.name();
					myActivities.remove(item);
								
					return new RsForward(
						new RsFlash(
			                String.format("L'activité %s a été supprimée avec succès !", name),
			                Level.FINE
			            ),
			            "/home"
				    );
				}
		);
	}	
}