/*
 * This file is generated by jOOQ.
 */
package com.supervisor.generated.jooq.tables;


import com.supervisor.generated.jooq.Keys;
import com.supervisor.generated.jooq.Public;
import com.supervisor.generated.jooq.tables.records.PlanRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class Plan extends TableImpl<PlanRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.plan</code>
     */
    public static final Plan PLAN = new Plan();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlanRecord> getRecordType() {
        return PlanRecord.class;
    }

    /**
     * The column <code>public.plan.creation_date</code>.
     */
    public final TableField<PlanRecord, LocalDateTime> CREATION_DATE = createField(DSL.name("creation_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.plan.creator_id</code>.
     */
    public final TableField<PlanRecord, UUID> CREATOR_ID = createField(DSL.name("creator_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.plan.last_modification_date</code>.
     */
    public final TableField<PlanRecord, LocalDateTime> LAST_MODIFICATION_DATE = createField(DSL.name("last_modification_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.plan.last_modifier_id</code>.
     */
    public final TableField<PlanRecord, UUID> LAST_MODIFIER_ID = createField(DSL.name("last_modifier_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.plan.owner_id</code>.
     */
    public final TableField<PlanRecord, UUID> OWNER_ID = createField(DSL.name("owner_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.plan.tag</code>.
     */
    public final TableField<PlanRecord, String> TAG = createField(DSL.name("tag"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.plan.id</code>.
     */
    public final TableField<PlanRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.plan.preferred</code>.
     */
    public final TableField<PlanRecord, Boolean> PREFERRED = createField(DSL.name("preferred"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.plan.no</code>.
     */
    public final TableField<PlanRecord, Integer> NO = createField(DSL.name("no"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.plan.profile_id</code>.
     */
    public final TableField<PlanRecord, UUID> PROFILE_ID = createField(DSL.name("profile_id"), SQLDataType.UUID.nullable(false), this, "");

    private Plan(Name alias, Table<PlanRecord> aliased) {
        this(alias, aliased, null);
    }

    private Plan(Name alias, Table<PlanRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.plan</code> table reference
     */
    public Plan(String alias) {
        this(DSL.name(alias), PLAN);
    }

    /**
     * Create an aliased <code>public.plan</code> table reference
     */
    public Plan(Name alias) {
        this(alias, PLAN);
    }

    /**
     * Create a <code>public.plan</code> table reference
     */
    public Plan() {
        this(DSL.name("plan"), null);
    }

    public <O extends Record> Plan(Table<O> child, ForeignKey<O, PlanRecord> key) {
        super(child, key, PLAN);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<PlanRecord> getPrimaryKey() {
        return Keys.PLAN_PKEY;
    }

    @Override
    public List<ForeignKey<PlanRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PLAN__PLAN_ID_FKEY, Keys.PLAN__PLAN_PROFILE_ID_FKEY);
    }

    private transient Product _product;
    private transient Profile _profile;

    /**
     * Get the implicit join path to the <code>public.product</code> table.
     */
    public Product product() {
        if (_product == null)
            _product = new Product(this, Keys.PLAN__PLAN_ID_FKEY);

        return _product;
    }

    /**
     * Get the implicit join path to the <code>public.profile</code> table.
     */
    public Profile profile() {
        if (_profile == null)
            _profile = new Profile(this, Keys.PLAN__PLAN_PROFILE_ID_FKEY);

        return _profile;
    }

    @Override
    public Plan as(String alias) {
        return new Plan(DSL.name(alias), this);
    }

    @Override
    public Plan as(Name alias) {
        return new Plan(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Plan rename(String name) {
        return new Plan(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Plan rename(Name name) {
        return new Plan(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<LocalDateTime, UUID, LocalDateTime, UUID, UUID, String, UUID, Boolean, Integer, UUID> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}