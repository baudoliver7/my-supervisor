/*
 * This file is generated by jOOQ.
 */
package com.supervisor.generated.jooq.tables.records;


import com.supervisor.generated.jooq.tables.Sequence;

import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SequenceRecord extends UpdatableRecordImpl<SequenceRecord> implements Record14<LocalDateTime, UUID, LocalDateTime, UUID, UUID, String, UUID, Integer, Long, Integer, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sequence.creation_date</code>.
     */
    public void setCreationDate(LocalDateTime value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.sequence.creation_date</code>.
     */
    public LocalDateTime getCreationDate() {
        return (LocalDateTime) get(0);
    }

    /**
     * Setter for <code>public.sequence.creator_id</code>.
     */
    public void setCreatorId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.sequence.creator_id</code>.
     */
    public UUID getCreatorId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.sequence.last_modification_date</code>.
     */
    public void setLastModificationDate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.sequence.last_modification_date</code>.
     */
    public LocalDateTime getLastModificationDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.sequence.last_modifier_id</code>.
     */
    public void setLastModifierId(UUID value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.sequence.last_modifier_id</code>.
     */
    public UUID getLastModifierId() {
        return (UUID) get(3);
    }

    /**
     * Setter for <code>public.sequence.owner_id</code>.
     */
    public void setOwnerId(UUID value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.sequence.owner_id</code>.
     */
    public UUID getOwnerId() {
        return (UUID) get(4);
    }

    /**
     * Setter for <code>public.sequence.tag</code>.
     */
    public void setTag(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.sequence.tag</code>.
     */
    public String getTag() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.sequence.id</code>.
     */
    public void setId(UUID value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.sequence.id</code>.
     */
    public UUID getId() {
        return (UUID) get(6);
    }

    /**
     * Setter for <code>public.sequence.step</code>.
     */
    public void setStep(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.sequence.step</code>.
     */
    public Integer getStep() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.sequence.next_number</code>.
     */
    public void setNextNumber(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.sequence.next_number</code>.
     */
    public Long getNextNumber() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>public.sequence.size</code>.
     */
    public void setSize(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.sequence.size</code>.
     */
    public Integer getSize() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.sequence.name</code>.
     */
    public void setName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.sequence.name</code>.
     */
    public String getName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.sequence.prefix</code>.
     */
    public void setPrefix(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.sequence.prefix</code>.
     */
    public String getPrefix() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.sequence.suffix</code>.
     */
    public void setSuffix(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.sequence.suffix</code>.
     */
    public String getSuffix() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.sequence.code</code>.
     */
    public void setCode(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.sequence.code</code>.
     */
    public String getCode() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<LocalDateTime, UUID, LocalDateTime, UUID, UUID, String, UUID, Integer, Long, Integer, String, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<LocalDateTime, UUID, LocalDateTime, UUID, UUID, String, UUID, Integer, Long, Integer, String, String, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<LocalDateTime> field1() {
        return Sequence.SEQUENCE.CREATION_DATE;
    }

    @Override
    public Field<UUID> field2() {
        return Sequence.SEQUENCE.CREATOR_ID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Sequence.SEQUENCE.LAST_MODIFICATION_DATE;
    }

    @Override
    public Field<UUID> field4() {
        return Sequence.SEQUENCE.LAST_MODIFIER_ID;
    }

    @Override
    public Field<UUID> field5() {
        return Sequence.SEQUENCE.OWNER_ID;
    }

    @Override
    public Field<String> field6() {
        return Sequence.SEQUENCE.TAG;
    }

    @Override
    public Field<UUID> field7() {
        return Sequence.SEQUENCE.ID;
    }

    @Override
    public Field<Integer> field8() {
        return Sequence.SEQUENCE.STEP;
    }

    @Override
    public Field<Long> field9() {
        return Sequence.SEQUENCE.NEXT_NUMBER;
    }

    @Override
    public Field<Integer> field10() {
        return Sequence.SEQUENCE.SIZE;
    }

    @Override
    public Field<String> field11() {
        return Sequence.SEQUENCE.NAME;
    }

    @Override
    public Field<String> field12() {
        return Sequence.SEQUENCE.PREFIX;
    }

    @Override
    public Field<String> field13() {
        return Sequence.SEQUENCE.SUFFIX;
    }

    @Override
    public Field<String> field14() {
        return Sequence.SEQUENCE.CODE;
    }

    @Override
    public LocalDateTime component1() {
        return getCreationDate();
    }

    @Override
    public UUID component2() {
        return getCreatorId();
    }

    @Override
    public LocalDateTime component3() {
        return getLastModificationDate();
    }

    @Override
    public UUID component4() {
        return getLastModifierId();
    }

    @Override
    public UUID component5() {
        return getOwnerId();
    }

    @Override
    public String component6() {
        return getTag();
    }

    @Override
    public UUID component7() {
        return getId();
    }

    @Override
    public Integer component8() {
        return getStep();
    }

    @Override
    public Long component9() {
        return getNextNumber();
    }

    @Override
    public Integer component10() {
        return getSize();
    }

    @Override
    public String component11() {
        return getName();
    }

    @Override
    public String component12() {
        return getPrefix();
    }

    @Override
    public String component13() {
        return getSuffix();
    }

    @Override
    public String component14() {
        return getCode();
    }

    @Override
    public LocalDateTime value1() {
        return getCreationDate();
    }

    @Override
    public UUID value2() {
        return getCreatorId();
    }

    @Override
    public LocalDateTime value3() {
        return getLastModificationDate();
    }

    @Override
    public UUID value4() {
        return getLastModifierId();
    }

    @Override
    public UUID value5() {
        return getOwnerId();
    }

    @Override
    public String value6() {
        return getTag();
    }

    @Override
    public UUID value7() {
        return getId();
    }

    @Override
    public Integer value8() {
        return getStep();
    }

    @Override
    public Long value9() {
        return getNextNumber();
    }

    @Override
    public Integer value10() {
        return getSize();
    }

    @Override
    public String value11() {
        return getName();
    }

    @Override
    public String value12() {
        return getPrefix();
    }

    @Override
    public String value13() {
        return getSuffix();
    }

    @Override
    public String value14() {
        return getCode();
    }

    @Override
    public SequenceRecord value1(LocalDateTime value) {
        setCreationDate(value);
        return this;
    }

    @Override
    public SequenceRecord value2(UUID value) {
        setCreatorId(value);
        return this;
    }

    @Override
    public SequenceRecord value3(LocalDateTime value) {
        setLastModificationDate(value);
        return this;
    }

    @Override
    public SequenceRecord value4(UUID value) {
        setLastModifierId(value);
        return this;
    }

    @Override
    public SequenceRecord value5(UUID value) {
        setOwnerId(value);
        return this;
    }

    @Override
    public SequenceRecord value6(String value) {
        setTag(value);
        return this;
    }

    @Override
    public SequenceRecord value7(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SequenceRecord value8(Integer value) {
        setStep(value);
        return this;
    }

    @Override
    public SequenceRecord value9(Long value) {
        setNextNumber(value);
        return this;
    }

    @Override
    public SequenceRecord value10(Integer value) {
        setSize(value);
        return this;
    }

    @Override
    public SequenceRecord value11(String value) {
        setName(value);
        return this;
    }

    @Override
    public SequenceRecord value12(String value) {
        setPrefix(value);
        return this;
    }

    @Override
    public SequenceRecord value13(String value) {
        setSuffix(value);
        return this;
    }

    @Override
    public SequenceRecord value14(String value) {
        setCode(value);
        return this;
    }

    @Override
    public SequenceRecord values(LocalDateTime value1, UUID value2, LocalDateTime value3, UUID value4, UUID value5, String value6, UUID value7, Integer value8, Long value9, Integer value10, String value11, String value12, String value13, String value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SequenceRecord
     */
    public SequenceRecord() {
        super(Sequence.SEQUENCE);
    }

    /**
     * Create a detached, initialised SequenceRecord
     */
    public SequenceRecord(LocalDateTime creationDate, UUID creatorId, LocalDateTime lastModificationDate, UUID lastModifierId, UUID ownerId, String tag, UUID id, Integer step, Long nextNumber, Integer size, String name, String prefix, String suffix, String code) {
        super(Sequence.SEQUENCE);

        setCreationDate(creationDate);
        setCreatorId(creatorId);
        setLastModificationDate(lastModificationDate);
        setLastModifierId(lastModifierId);
        setOwnerId(ownerId);
        setTag(tag);
        setId(id);
        setStep(step);
        setNextNumber(nextNumber);
        setSize(size);
        setName(name);
        setPrefix(prefix);
        setSuffix(suffix);
        setCode(code);
    }
}