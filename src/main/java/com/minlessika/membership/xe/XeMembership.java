package com.minlessika.membership.xe;

import com.minlessika.membership.billing.PaymentRequest;
import com.minlessika.membership.billing.PaymentRequestStatus;
import com.minlessika.membership.domain.Membership;
import com.minlessika.sdk.datasource.OrderDirection;
import org.takes.rs.xe.XeSource;
import org.takes.rs.xe.XeWrap;
import org.xembly.Directive;
import org.xembly.Directives;

import java.io.IOException;

public final class XeMembership extends XeWrap {

	public XeMembership(final Membership module) throws IOException {
		this(
			new Directives()
				.append(
                    new XePaymentRequest(
                    		module.user()
                    		      .paymentRequests()
                		          .where(PaymentRequest::status, PaymentRequestStatus.PENDING)
                		          .orderBy(PaymentRequest::id, OrderDirection.DESC)
                    ).toXembly() 
                 ).append(
                         new XeApplication(
                         		module.user().applications()
                         ).toXembly() 
                      )
		);
	}
	
	public XeMembership(final Iterable<Directive> dir) {
		super(new XeSource() {
            @Override
            public Iterable<Directive> toXembly() throws IOException {
                return dir;
            }
        });
	}
}