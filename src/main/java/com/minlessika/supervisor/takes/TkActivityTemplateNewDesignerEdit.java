package com.minlessika.supervisor.takes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.takes.Request;
import org.takes.rq.RqHref;
import org.takes.rq.form.RqFormSmart;
import org.takes.rs.xe.XeSource;
import org.xembly.Directive;

import com.minlessika.sdk.datasource.Base;
import com.minlessika.sdk.takes.TkForm;
import com.minlessika.supervisor.domain.ActivityTemplate;
import com.minlessika.supervisor.domain.Supervisor;
import com.minlessika.supervisor.domain.impl.PxSupervisor;
import com.minlessika.supervisor.xe.XeActivityTemplate;
import com.minlessika.supervisor.xe.XeSupervisor;

public final class TkActivityTemplateNewDesignerEdit extends TkForm {

	public TkActivityTemplateNewDesignerEdit(final Base base) {
		super(base);
	}

	@Override
	protected String xslFormPath() {
		return "/xsl/new_activity_template_designer_edit.xsl";
	}

	@Override
	protected Iterable<XeSource> contentToShow(final Request req, final XeSource itemToShow) throws IOException {
		
		final Supervisor module = new PxSupervisor(base, req);
		final Long activityId = Long.parseLong(new RqHref.Smart(req).single("activity"));
		final ActivityTemplate template = module.activityTemplates().get(activityId);
		
		List<XeSource> content = new ArrayList<>();
		content.add(new XeSupervisor(module));
		content.add(new XeActivityTemplate("activity", template));
		content.add(itemToShow);
		
		return content;
	}

	@Override
	protected XeSource preItemDataToShow(final Long id, final Request req) throws IOException {
		return XeSource.EMPTY;
	}

	@Override
	protected XeSource postItemDataToShow(Long id, Request req, RqFormSmart form, final Iterable<Directive> dir) throws IOException {
		return new XeActivityTemplate(dir);
	}	
}
