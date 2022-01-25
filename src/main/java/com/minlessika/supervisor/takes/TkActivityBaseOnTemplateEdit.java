package com.minlessika.supervisor.takes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.takes.Request;
import org.takes.rq.RqHref;
import org.takes.rq.form.RqFormSmart;
import org.takes.rs.xe.XeChain;
import org.takes.rs.xe.XeDirectives;
import org.takes.rs.xe.XeSource;
import org.xembly.Directive;

import com.minlessika.sdk.datasource.Base;
import com.minlessika.sdk.takes.TkForm;
import com.minlessika.supervisor.domain.ActivityTemplate;
import com.minlessika.supervisor.domain.ActivityTemplates;
import com.minlessika.supervisor.domain.Supervisor;
import com.minlessika.supervisor.domain.impl.PxSupervisor;
import com.minlessika.supervisor.xe.XeActivityParam;
import com.minlessika.supervisor.xe.XeActivityTemplate;
import com.minlessika.supervisor.xe.XePeriodicity;
import com.minlessika.supervisor.xe.XeSupervisor;

public final class TkActivityBaseOnTemplateEdit extends TkForm {

	public TkActivityBaseOnTemplateEdit(final Base base) {
		super(base);
	}

	@Override
	protected String xslFormPath() {
		return "/xsl/activity_base_on_template_edit.xsl";
	}

	@Override
	protected Iterable<XeSource> contentToShow(final Request req, final XeSource itemToShow) throws IOException {
		
		final Supervisor module = new PxSupervisor(base, req);
		
		List<XeSource> content = new ArrayList<>();
		content.add(new XePeriodicity());
		content.add(new XeSupervisor(module));
		content.add(itemToShow);
		
		return content;
	}

	@Override
	protected XeSource newItemToShow(final Request req) throws IOException {
		Supervisor module = new PxSupervisor(base, req);		
		ActivityTemplates templates = module.activityTemplates();
		Long templateId = Long.parseLong(new RqHref.Smart(req).single("template"));
		
		ActivityTemplate template = templates.get(templateId);
		XeSource xeItem = new XeActivityTemplate("item", template); 
		
		return new XeChain(
				xeItem,
				new XeActivityParam(template.params())
		);
	}
	
	@Override
	protected XeSource preItemDataToShow(final Long id, final Request req) throws IOException {
		return XeSource.EMPTY;
	}

	@Override
	protected XeSource postItemDataToShow(Long id, Request req, RqFormSmart form, final Iterable<Directive> dir) throws IOException {
		return new XeDirectives(dir);
	}	
}
