/*
 * This file is generated by jOOQ.
 */
package com.supervisor.generated.jooq.tables.records;


import com.supervisor.generated.jooq.tables.NumberOrientedSetting;

import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NumberOrientedSettingRecord extends UpdatableRecordImpl<NumberOrientedSettingRecord> implements Record10<LocalDateTime, UUID, LocalDateTime, UUID, UUID, String, UUID, Boolean, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.number_oriented_setting.creation_date</code>.
     */
    public void setCreationDate(LocalDateTime value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.number_oriented_setting.creation_date</code>.
     */
    public LocalDateTime getCreationDate() {
        return (LocalDateTime) get(0);
    }

    /**
     * Setter for <code>public.number_oriented_setting.creator_id</code>.
     */
    public void setCreatorId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.number_oriented_setting.creator_id</code>.
     */
    public UUID getCreatorId() {
        return (UUID) get(1);
    }

    /**
     * Setter for
     * <code>public.number_oriented_setting.last_modification_date</code>.
     */
    public void setLastModificationDate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>public.number_oriented_setting.last_modification_date</code>.
     */
    public LocalDateTime getLastModificationDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.number_oriented_setting.last_modifier_id</code>.
     */
    public void setLastModifierId(UUID value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.number_oriented_setting.last_modifier_id</code>.
     */
    public UUID getLastModifierId() {
        return (UUID) get(3);
    }

    /**
     * Setter for <code>public.number_oriented_setting.owner_id</code>.
     */
    public void setOwnerId(UUID value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.number_oriented_setting.owner_id</code>.
     */
    public UUID getOwnerId() {
        return (UUID) get(4);
    }

    /**
     * Setter for <code>public.number_oriented_setting.tag</code>.
     */
    public void setTag(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.number_oriented_setting.tag</code>.
     */
    public String getTag() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.number_oriented_setting.id</code>.
     */
    public void setId(UUID value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.number_oriented_setting.id</code>.
     */
    public UUID getId() {
        return (UUID) get(6);
    }

    /**
     * Setter for
     * <code>public.number_oriented_setting.manage_evolution_percent</code>.
     */
    public void setManageEvolutionPercent(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>public.number_oriented_setting.manage_evolution_percent</code>.
     */
    public Boolean getManageEvolutionPercent() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>public.number_oriented_setting.unity_symbol</code>.
     */
    public void setUnitySymbol(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.number_oriented_setting.unity_symbol</code>.
     */
    public String getUnitySymbol() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.number_oriented_setting.symbol_position</code>.
     */
    public void setSymbolPosition(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.number_oriented_setting.symbol_position</code>.
     */
    public String getSymbolPosition() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<LocalDateTime, UUID, LocalDateTime, UUID, UUID, String, UUID, Boolean, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<LocalDateTime, UUID, LocalDateTime, UUID, UUID, String, UUID, Boolean, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<LocalDateTime> field1() {
        return NumberOrientedSetting.NUMBER_ORIENTED_SETTING.CREATION_DATE;
    }

    @Override
    public Field<UUID> field2() {
        return NumberOrientedSetting.NUMBER_ORIENTED_SETTING.CREATOR_ID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return NumberOrientedSetting.NUMBER_ORIENTED_SETTING.LAST_MODIFICATION_DATE;
    }

    @Override
    public Field<UUID> field4() {
        return NumberOrientedSetting.NUMBER_ORIENTED_SETTING.LAST_MODIFIER_ID;
    }

    @Override
    public Field<UUID> field5() {
        return NumberOrientedSetting.NUMBER_ORIENTED_SETTING.OWNER_ID;
    }

    @Override
    public Field<String> field6() {
        return NumberOrientedSetting.NUMBER_ORIENTED_SETTING.TAG;
    }

    @Override
    public Field<UUID> field7() {
        return NumberOrientedSetting.NUMBER_ORIENTED_SETTING.ID;
    }

    @Override
    public Field<Boolean> field8() {
        return NumberOrientedSetting.NUMBER_ORIENTED_SETTING.MANAGE_EVOLUTION_PERCENT;
    }

    @Override
    public Field<String> field9() {
        return NumberOrientedSetting.NUMBER_ORIENTED_SETTING.UNITY_SYMBOL;
    }

    @Override
    public Field<String> field10() {
        return NumberOrientedSetting.NUMBER_ORIENTED_SETTING.SYMBOL_POSITION;
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
    public Boolean component8() {
        return getManageEvolutionPercent();
    }

    @Override
    public String component9() {
        return getUnitySymbol();
    }

    @Override
    public String component10() {
        return getSymbolPosition();
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
    public Boolean value8() {
        return getManageEvolutionPercent();
    }

    @Override
    public String value9() {
        return getUnitySymbol();
    }

    @Override
    public String value10() {
        return getSymbolPosition();
    }

    @Override
    public NumberOrientedSettingRecord value1(LocalDateTime value) {
        setCreationDate(value);
        return this;
    }

    @Override
    public NumberOrientedSettingRecord value2(UUID value) {
        setCreatorId(value);
        return this;
    }

    @Override
    public NumberOrientedSettingRecord value3(LocalDateTime value) {
        setLastModificationDate(value);
        return this;
    }

    @Override
    public NumberOrientedSettingRecord value4(UUID value) {
        setLastModifierId(value);
        return this;
    }

    @Override
    public NumberOrientedSettingRecord value5(UUID value) {
        setOwnerId(value);
        return this;
    }

    @Override
    public NumberOrientedSettingRecord value6(String value) {
        setTag(value);
        return this;
    }

    @Override
    public NumberOrientedSettingRecord value7(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public NumberOrientedSettingRecord value8(Boolean value) {
        setManageEvolutionPercent(value);
        return this;
    }

    @Override
    public NumberOrientedSettingRecord value9(String value) {
        setUnitySymbol(value);
        return this;
    }

    @Override
    public NumberOrientedSettingRecord value10(String value) {
        setSymbolPosition(value);
        return this;
    }

    @Override
    public NumberOrientedSettingRecord values(LocalDateTime value1, UUID value2, LocalDateTime value3, UUID value4, UUID value5, String value6, UUID value7, Boolean value8, String value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NumberOrientedSettingRecord
     */
    public NumberOrientedSettingRecord() {
        super(NumberOrientedSetting.NUMBER_ORIENTED_SETTING);
    }

    /**
     * Create a detached, initialised NumberOrientedSettingRecord
     */
    public NumberOrientedSettingRecord(LocalDateTime creationDate, UUID creatorId, LocalDateTime lastModificationDate, UUID lastModifierId, UUID ownerId, String tag, UUID id, Boolean manageEvolutionPercent, String unitySymbol, String symbolPosition) {
        super(NumberOrientedSetting.NUMBER_ORIENTED_SETTING);

        setCreationDate(creationDate);
        setCreatorId(creatorId);
        setLastModificationDate(lastModificationDate);
        setLastModifierId(lastModifierId);
        setOwnerId(ownerId);
        setTag(tag);
        setId(id);
        setManageEvolutionPercent(manageEvolutionPercent);
        setUnitySymbol(unitySymbol);
        setSymbolPosition(symbolPosition);
    }
}