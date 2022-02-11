/*
 * This file is generated by jOOQ.
 */
package com.supervisor.generated.jooq.tables;


import com.supervisor.generated.jooq.Keys;
import com.supervisor.generated.jooq.Public;
import com.supervisor.generated.jooq.tables.records.PaymentRequestRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class PaymentRequest extends TableImpl<PaymentRequestRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.payment_request</code>
     */
    public static final PaymentRequest PAYMENT_REQUEST = new PaymentRequest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentRequestRecord> getRecordType() {
        return PaymentRequestRecord.class;
    }

    /**
     * The column <code>public.payment_request.creation_date</code>.
     */
    public final TableField<PaymentRequestRecord, LocalDateTime> CREATION_DATE = createField(DSL.name("creation_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.payment_request.creator_id</code>.
     */
    public final TableField<PaymentRequestRecord, UUID> CREATOR_ID = createField(DSL.name("creator_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.payment_request.last_modification_date</code>.
     */
    public final TableField<PaymentRequestRecord, LocalDateTime> LAST_MODIFICATION_DATE = createField(DSL.name("last_modification_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.payment_request.last_modifier_id</code>.
     */
    public final TableField<PaymentRequestRecord, UUID> LAST_MODIFIER_ID = createField(DSL.name("last_modifier_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.payment_request.owner_id</code>.
     */
    public final TableField<PaymentRequestRecord, UUID> OWNER_ID = createField(DSL.name("owner_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.payment_request.tag</code>.
     */
    public final TableField<PaymentRequestRecord, String> TAG = createField(DSL.name("tag"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.payment_request.id</code>.
     */
    public final TableField<PaymentRequestRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.payment_request.amount</code>.
     */
    public final TableField<PaymentRequestRecord, Double> AMOUNT = createField(DSL.name("amount"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.payment_request.metadata</code>.
     */
    public final TableField<PaymentRequestRecord, String> METADATA = createField(DSL.name("metadata"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.payment_request.reference</code>.
     */
    public final TableField<PaymentRequestRecord, String> REFERENCE = createField(DSL.name("reference"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.payment_request.order_id</code>.
     */
    public final TableField<PaymentRequestRecord, UUID> ORDER_ID = createField(DSL.name("order_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.payment_request.status</code>.
     */
    public final TableField<PaymentRequestRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.payment_request.object</code>.
     */
    public final TableField<PaymentRequestRecord, String> OBJECT = createField(DSL.name("object"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.payment_request.notes</code>.
     */
    public final TableField<PaymentRequestRecord, String> NOTES = createField(DSL.name("notes"), SQLDataType.VARCHAR, this, "");

    private PaymentRequest(Name alias, Table<PaymentRequestRecord> aliased) {
        this(alias, aliased, null);
    }

    private PaymentRequest(Name alias, Table<PaymentRequestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.payment_request</code> table reference
     */
    public PaymentRequest(String alias) {
        this(DSL.name(alias), PAYMENT_REQUEST);
    }

    /**
     * Create an aliased <code>public.payment_request</code> table reference
     */
    public PaymentRequest(Name alias) {
        this(alias, PAYMENT_REQUEST);
    }

    /**
     * Create a <code>public.payment_request</code> table reference
     */
    public PaymentRequest() {
        this(DSL.name("payment_request"), null);
    }

    public <O extends Record> PaymentRequest(Table<O> child, ForeignKey<O, PaymentRequestRecord> key) {
        super(child, key, PAYMENT_REQUEST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<PaymentRequestRecord> getPrimaryKey() {
        return Keys.PAYMENT_REQUEST_PKEY;
    }

    @Override
    public List<ForeignKey<PaymentRequestRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PAYMENT_REQUEST__PAYMENT_REQUEST_ORDER_ID_FKEY);
    }

    private transient Order _order;

    /**
     * Get the implicit join path to the <code>public.order</code> table.
     */
    public Order order() {
        if (_order == null)
            _order = new Order(this, Keys.PAYMENT_REQUEST__PAYMENT_REQUEST_ORDER_ID_FKEY);

        return _order;
    }

    @Override
    public PaymentRequest as(String alias) {
        return new PaymentRequest(DSL.name(alias), this);
    }

    @Override
    public PaymentRequest as(Name alias) {
        return new PaymentRequest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentRequest rename(String name) {
        return new PaymentRequest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentRequest rename(Name name) {
        return new PaymentRequest(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<LocalDateTime, UUID, LocalDateTime, UUID, UUID, String, UUID, Double, String, String, UUID, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}