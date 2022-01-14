package com.minlessika.sdk.pgsql.metadata;

import com.minlessika.sdk.pgsql.type.PgDate;

public final class PgDateField extends PgFieldMetadata {

	public PgDateField(
			final Integer order, 
			final String entityName, 
			final String name, 
			final String label
	) {
		super(order, entityName, name, new PgDate(), label);
	}
}
