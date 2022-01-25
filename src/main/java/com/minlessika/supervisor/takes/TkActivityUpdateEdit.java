package com.minlessika.supervisor.takes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.takes.Request;
import org.takes.rs.xe.XeAppend;
import org.takes.rs.xe.XeChain;
import org.takes.rs.xe.XeSource;

import com.minlessika.sdk.datasource.Base;
import com.minlessika.sdk.takes.TkForm;
import com.minlessika.supervisor.domain.Activity;
import com.minlessika.supervisor.domain.ActivityTemplate;
import com.minlessika.supervisor.domain.ActivityTemplateRelease;
import com.minlessika.supervisor.domain.Supervisor;
import com.minlessika.supervisor.domain.impl.PxSupervisor;
import com.minlessika.supervisor.xe.XeActivityTemplateRelease;
import com.minlessika.supervisor.xe.XeSupervisor;

public final class TkActivityUpdateEdit extends TkForm {

	public TkActivityUpdateEdit(Base base) {
		super(base);
	}

	@Override
	protected String xslFormPath() {
		return "/xsl/activity_update_edit.xsl";
	}

	@Override
	protected Iterable<XeSource> contentToShow(Request req, XeSource itemToShow) throws IOException {

		final Supervisor module = new PxSupervisor(base, req);

		List<XeSource> content = new ArrayList<>();
		content.add(new XeAppend("menu", "activities"));
		content.add(new XeSupervisor(module));
		content.add(itemToShow);
		
		return content;
	}

	@Override
	protected XeSource preItemDataToShow(Long id, Request req) throws IOException {
		
		final Supervisor module = new PxSupervisor(base, req);
		
		Activity activity = module.activities().get(id);
		if(activity.isUpToDate())
			throw new IllegalArgumentException("L'activité est déjà à jour !");
		
		ActivityTemplate template = activity.templateSrc();
		ActivityTemplateRelease release = template.releases().first();
		
		return new XeChain(
				new XeActivityTemplateRelease("item", release),
				new XeAppend("activity_id", id.toString())
		);
	}
}
