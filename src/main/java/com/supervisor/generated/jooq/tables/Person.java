/*
 * This file is generated by jOOQ.
 */
package com.supervisor.generated.jooq.tables;


import com.supervisor.generated.jooq.Keys;
import com.supervisor.generated.jooq.Public;
import com.supervisor.generated.jooq.tables.records.PersonRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Person extends TableImpl<PersonRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.person</code>
     */
    public static final Person PERSON = new Person();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PersonRecord> getRecordType() {
        return PersonRecord.class;
    }

    /**
     * The column <code>public.person.creation_date</code>.
     */
    public final TableField<PersonRecord, LocalDateTime> CREATION_DATE = createField(DSL.name("creation_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.person.creator_id</code>.
     */
    public final TableField<PersonRecord, UUID> CREATOR_ID = createField(DSL.name("creator_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.person.last_modification_date</code>.
     */
    public final TableField<PersonRecord, LocalDateTime> LAST_MODIFICATION_DATE = createField(DSL.name("last_modification_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.person.last_modifier_id</code>.
     */
    public final TableField<PersonRecord, UUID> LAST_MODIFIER_ID = createField(DSL.name("last_modifier_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.person.owner_id</code>.
     */
    public final TableField<PersonRecord, UUID> OWNER_ID = createField(DSL.name("owner_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.person.tag</code>.
     */
    public final TableField<PersonRecord, String> TAG = createField(DSL.name("tag"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.person.id</code>.
     */
    public final TableField<PersonRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.person.name</code>.
     */
    public final TableField<PersonRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.person.preferred_language_id</code>.
     */
    public final TableField<PersonRecord, UUID> PREFERRED_LANGUAGE_ID = createField(DSL.name("preferred_language_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.person.billing_address_id</code>.
     */
    public final TableField<PersonRecord, UUID> BILLING_ADDRESS_ID = createField(DSL.name("billing_address_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.person.preferred_currency_id</code>.
     */
    public final TableField<PersonRecord, UUID> PREFERRED_CURRENCY_ID = createField(DSL.name("preferred_currency_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.person.is_company</code>.
     */
    public final TableField<PersonRecord, Boolean> IS_COMPANY = createField(DSL.name("is_company"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.person.photo</code>.
     */
    public final TableField<PersonRecord, String> PHOTO = createField(DSL.name("photo"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.person.time_zone_id</code>.
     */
    public final TableField<PersonRecord, String> TIME_ZONE_ID = createField(DSL.name("time_zone_id"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.person.address_id</code>.
     */
    public final TableField<PersonRecord, UUID> ADDRESS_ID = createField(DSL.name("address_id"), SQLDataType.UUID.nullable(false), this, "");

    private Person(Name alias, Table<PersonRecord> aliased) {
        this(alias, aliased, null);
    }

    private Person(Name alias, Table<PersonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.person</code> table reference
     */
    public Person(String alias) {
        this(DSL.name(alias), PERSON);
    }

    /**
     * Create an aliased <code>public.person</code> table reference
     */
    public Person(Name alias) {
        this(alias, PERSON);
    }

    /**
     * Create a <code>public.person</code> table reference
     */
    public Person() {
        this(DSL.name("person"), null);
    }

    public <O extends Record> Person(Table<O> child, ForeignKey<O, PersonRecord> key) {
        super(child, key, PERSON);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<PersonRecord> getPrimaryKey() {
        return Keys.PERSON_PKEY;
    }

    @Override
    public List<ForeignKey<PersonRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PERSON__PERSON_PREFERRED_LANGUAGE_ID_FKEY, Keys.PERSON__PERSON_BILLING_ADDRESS_ID_FKEY, Keys.PERSON__PERSON_PREFERRED_CURRENCY_ID_FKEY, Keys.PERSON__PERSON_ADDRESS_ID_FKEY);
    }

    private transient Language _language;
    private transient BillingAddress _billingAddress;
    private transient Currency _currency;
    private transient Address _address;

    /**
     * Get the implicit join path to the <code>public.language</code> table.
     */
    public Language language() {
        if (_language == null)
            _language = new Language(this, Keys.PERSON__PERSON_PREFERRED_LANGUAGE_ID_FKEY);

        return _language;
    }

    /**
     * Get the implicit join path to the <code>public.billing_address</code>
     * table.
     */
    public BillingAddress billingAddress() {
        if (_billingAddress == null)
            _billingAddress = new BillingAddress(this, Keys.PERSON__PERSON_BILLING_ADDRESS_ID_FKEY);

        return _billingAddress;
    }

    /**
     * Get the implicit join path to the <code>public.currency</code> table.
     */
    public Currency currency() {
        if (_currency == null)
            _currency = new Currency(this, Keys.PERSON__PERSON_PREFERRED_CURRENCY_ID_FKEY);

        return _currency;
    }

    /**
     * Get the implicit join path to the <code>public.address</code> table.
     */
    public Address address() {
        if (_address == null)
            _address = new Address(this, Keys.PERSON__PERSON_ADDRESS_ID_FKEY);

        return _address;
    }

    @Override
    public Person as(String alias) {
        return new Person(DSL.name(alias), this);
    }

    @Override
    public Person as(Name alias) {
        return new Person(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(String name) {
        return new Person(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(Name name) {
        return new Person(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<LocalDateTime, UUID, LocalDateTime, UUID, UUID, String, UUID, String, UUID, UUID, UUID, Boolean, String, String, UUID> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}