package com.minlessika.membership.takes;

import com.minlessika.membership.domain.Membership;
import com.minlessika.membership.domain.impl.DmMembership;
import com.minlessika.membership.xe.XeUser;
import com.minlessika.sdk.datasource.Base;
import com.minlessika.sdk.takes.TkForm;
import org.takes.Request;
import org.takes.rq.RqHref;
import org.takes.rq.form.RqFormSmart;
import org.takes.rs.xe.XeSource;
import org.xembly.Directive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class TkAdminChangePasswordEdit extends TkForm {

	public TkAdminChangePasswordEdit(Base base) {
		super(base);
	}

	@Override
	protected String xslFormPath() {
		return "/com/membership/xsl/admin_change_password_edit.xsl";
	}

	@Override
	protected Iterable<XeSource> contentToShow(Request req, XeSource itemToShow) throws IOException {
		
		new RqAdminAuth(base, req);
		
		final Membership module = new DmMembership(base, req);
		final Long userId = Long.parseLong(new RqHref.Smart(req).single("user"));
		List<XeSource> content = new ArrayList<>();
		content.add(new XeUser(module.users().get(userId)));
		content.add(itemToShow);
		
		return content;
	}

	@Override
	protected XeSource newItemToShow(Request req) throws IOException {
		return XeSource.EMPTY;
	}
	
	@Override
	protected XeSource preItemDataToShow(Long id, Request req) throws IOException {
		return XeSource.EMPTY;
	}

	@Override
	protected XeSource postItemDataToShow(Long id, Request req, RqFormSmart form, final Iterable<Directive> dir) throws IOException {
		return XeSource.EMPTY;
	}
}