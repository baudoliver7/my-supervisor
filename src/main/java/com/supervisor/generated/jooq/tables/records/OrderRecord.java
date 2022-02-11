/*
 * This file is generated by jOOQ.
 */
package com.supervisor.generated.jooq.tables.records;


import com.supervisor.generated.jooq.tables.Order;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderRecord extends UpdatableRecordImpl<OrderRecord> implements Record21<LocalDateTime, UUID, LocalDateTime, UUID, UUID, String, UUID, UUID, UUID, String, String, LocalDate, UUID, UUID, Double, Double, UUID, Double, UUID, String, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.order.creation_date</code>.
     */
    public void setCreationDate(LocalDateTime value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.order.creation_date</code>.
     */
    public LocalDateTime getCreationDate() {
        return (LocalDateTime) get(0);
    }

    /**
     * Setter for <code>public.order.creator_id</code>.
     */
    public void setCreatorId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.order.creator_id</code>.
     */
    public UUID getCreatorId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.order.last_modification_date</code>.
     */
    public void setLastModificationDate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.order.last_modification_date</code>.
     */
    public LocalDateTime getLastModificationDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.order.last_modifier_id</code>.
     */
    public void setLastModifierId(UUID value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.order.last_modifier_id</code>.
     */
    public UUID getLastModifierId() {
        return (UUID) get(3);
    }

    /**
     * Setter for <code>public.order.owner_id</code>.
     */
    public void setOwnerId(UUID value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.order.owner_id</code>.
     */
    public UUID getOwnerId() {
        return (UUID) get(4);
    }

    /**
     * Setter for <code>public.order.tag</code>.
     */
    public void setTag(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.order.tag</code>.
     */
    public String getTag() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.order.id</code>.
     */
    public void setId(UUID value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.order.id</code>.
     */
    public UUID getId() {
        return (UUID) get(6);
    }

    /**
     * Setter for <code>public.order.customer_address_id</code>.
     */
    public void setCustomerAddressId(UUID value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.order.customer_address_id</code>.
     */
    public UUID getCustomerAddressId() {
        return (UUID) get(7);
    }

    /**
     * Setter for <code>public.order.supplier_address_id</code>.
     */
    public void setSupplierAddressId(UUID value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.order.supplier_address_id</code>.
     */
    public UUID getSupplierAddressId() {
        return (UUID) get(8);
    }

    /**
     * Setter for <code>public.order.type</code>.
     */
    public void setType(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.order.type</code>.
     */
    public String getType() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.order.reference</code>.
     */
    public void setReference(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.order.reference</code>.
     */
    public String getReference() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.order.publishing_date</code>.
     */
    public void setPublishingDate(LocalDate value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.order.publishing_date</code>.
     */
    public LocalDate getPublishingDate() {
        return (LocalDate) get(11);
    }

    /**
     * Setter for <code>public.order.customer_id</code>.
     */
    public void setCustomerId(UUID value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.order.customer_id</code>.
     */
    public UUID getCustomerId() {
        return (UUID) get(12);
    }

    /**
     * Setter for <code>public.order.supplier_id</code>.
     */
    public void setSupplierId(UUID value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.order.supplier_id</code>.
     */
    public UUID getSupplierId() {
        return (UUID) get(13);
    }

    /**
     * Setter for <code>public.order.vat_amount</code>.
     */
    public void setVatAmount(Double value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.order.vat_amount</code>.
     */
    public Double getVatAmount() {
        return (Double) get(14);
    }

    /**
     * Setter for <code>public.order.total_amount</code>.
     */
    public void setTotalAmount(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.order.total_amount</code>.
     */
    public Double getTotalAmount() {
        return (Double) get(15);
    }

    /**
     * Setter for <code>public.order.billing_currency_id</code>.
     */
    public void setBillingCurrencyId(UUID value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.order.billing_currency_id</code>.
     */
    public UUID getBillingCurrencyId() {
        return (UUID) get(16);
    }

    /**
     * Setter for <code>public.order.exchange_rate</code>.
     */
    public void setExchangeRate(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.order.exchange_rate</code>.
     */
    public Double getExchangeRate() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>public.order.currency_id</code>.
     */
    public void setCurrencyId(UUID value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.order.currency_id</code>.
     */
    public UUID getCurrencyId() {
        return (UUID) get(18);
    }

    /**
     * Setter for <code>public.order.description</code>.
     */
    public void setDescription(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.order.description</code>.
     */
    public String getDescription() {
        return (String) get(19);
    }

    /**
     * Setter for <code>public.order.amount</code>.
     */
    public void setAmount(Double value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.order.amount</code>.
     */
    public Double getAmount() {
        return (Double) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<LocalDateTime, UUID, LocalDateTime, UUID, UUID, String, UUID, UUID, UUID, String, String, LocalDate, UUID, UUID, Double, Double, UUID, Double, UUID, String, Double> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<LocalDateTime, UUID, LocalDateTime, UUID, UUID, String, UUID, UUID, UUID, String, String, LocalDate, UUID, UUID, Double, Double, UUID, Double, UUID, String, Double> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<LocalDateTime> field1() {
        return Order.ORDER.CREATION_DATE;
    }

    @Override
    public Field<UUID> field2() {
        return Order.ORDER.CREATOR_ID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Order.ORDER.LAST_MODIFICATION_DATE;
    }

    @Override
    public Field<UUID> field4() {
        return Order.ORDER.LAST_MODIFIER_ID;
    }

    @Override
    public Field<UUID> field5() {
        return Order.ORDER.OWNER_ID;
    }

    @Override
    public Field<String> field6() {
        return Order.ORDER.TAG;
    }

    @Override
    public Field<UUID> field7() {
        return Order.ORDER.ID;
    }

    @Override
    public Field<UUID> field8() {
        return Order.ORDER.CUSTOMER_ADDRESS_ID;
    }

    @Override
    public Field<UUID> field9() {
        return Order.ORDER.SUPPLIER_ADDRESS_ID;
    }

    @Override
    public Field<String> field10() {
        return Order.ORDER.TYPE;
    }

    @Override
    public Field<String> field11() {
        return Order.ORDER.REFERENCE;
    }

    @Override
    public Field<LocalDate> field12() {
        return Order.ORDER.PUBLISHING_DATE;
    }

    @Override
    public Field<UUID> field13() {
        return Order.ORDER.CUSTOMER_ID;
    }

    @Override
    public Field<UUID> field14() {
        return Order.ORDER.SUPPLIER_ID;
    }

    @Override
    public Field<Double> field15() {
        return Order.ORDER.VAT_AMOUNT;
    }

    @Override
    public Field<Double> field16() {
        return Order.ORDER.TOTAL_AMOUNT;
    }

    @Override
    public Field<UUID> field17() {
        return Order.ORDER.BILLING_CURRENCY_ID;
    }

    @Override
    public Field<Double> field18() {
        return Order.ORDER.EXCHANGE_RATE;
    }

    @Override
    public Field<UUID> field19() {
        return Order.ORDER.CURRENCY_ID;
    }

    @Override
    public Field<String> field20() {
        return Order.ORDER.DESCRIPTION;
    }

    @Override
    public Field<Double> field21() {
        return Order.ORDER.AMOUNT;
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
    public UUID component8() {
        return getCustomerAddressId();
    }

    @Override
    public UUID component9() {
        return getSupplierAddressId();
    }

    @Override
    public String component10() {
        return getType();
    }

    @Override
    public String component11() {
        return getReference();
    }

    @Override
    public LocalDate component12() {
        return getPublishingDate();
    }

    @Override
    public UUID component13() {
        return getCustomerId();
    }

    @Override
    public UUID component14() {
        return getSupplierId();
    }

    @Override
    public Double component15() {
        return getVatAmount();
    }

    @Override
    public Double component16() {
        return getTotalAmount();
    }

    @Override
    public UUID component17() {
        return getBillingCurrencyId();
    }

    @Override
    public Double component18() {
        return getExchangeRate();
    }

    @Override
    public UUID component19() {
        return getCurrencyId();
    }

    @Override
    public String component20() {
        return getDescription();
    }

    @Override
    public Double component21() {
        return getAmount();
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
    public UUID value8() {
        return getCustomerAddressId();
    }

    @Override
    public UUID value9() {
        return getSupplierAddressId();
    }

    @Override
    public String value10() {
        return getType();
    }

    @Override
    public String value11() {
        return getReference();
    }

    @Override
    public LocalDate value12() {
        return getPublishingDate();
    }

    @Override
    public UUID value13() {
        return getCustomerId();
    }

    @Override
    public UUID value14() {
        return getSupplierId();
    }

    @Override
    public Double value15() {
        return getVatAmount();
    }

    @Override
    public Double value16() {
        return getTotalAmount();
    }

    @Override
    public UUID value17() {
        return getBillingCurrencyId();
    }

    @Override
    public Double value18() {
        return getExchangeRate();
    }

    @Override
    public UUID value19() {
        return getCurrencyId();
    }

    @Override
    public String value20() {
        return getDescription();
    }

    @Override
    public Double value21() {
        return getAmount();
    }

    @Override
    public OrderRecord value1(LocalDateTime value) {
        setCreationDate(value);
        return this;
    }

    @Override
    public OrderRecord value2(UUID value) {
        setCreatorId(value);
        return this;
    }

    @Override
    public OrderRecord value3(LocalDateTime value) {
        setLastModificationDate(value);
        return this;
    }

    @Override
    public OrderRecord value4(UUID value) {
        setLastModifierId(value);
        return this;
    }

    @Override
    public OrderRecord value5(UUID value) {
        setOwnerId(value);
        return this;
    }

    @Override
    public OrderRecord value6(String value) {
        setTag(value);
        return this;
    }

    @Override
    public OrderRecord value7(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public OrderRecord value8(UUID value) {
        setCustomerAddressId(value);
        return this;
    }

    @Override
    public OrderRecord value9(UUID value) {
        setSupplierAddressId(value);
        return this;
    }

    @Override
    public OrderRecord value10(String value) {
        setType(value);
        return this;
    }

    @Override
    public OrderRecord value11(String value) {
        setReference(value);
        return this;
    }

    @Override
    public OrderRecord value12(LocalDate value) {
        setPublishingDate(value);
        return this;
    }

    @Override
    public OrderRecord value13(UUID value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public OrderRecord value14(UUID value) {
        setSupplierId(value);
        return this;
    }

    @Override
    public OrderRecord value15(Double value) {
        setVatAmount(value);
        return this;
    }

    @Override
    public OrderRecord value16(Double value) {
        setTotalAmount(value);
        return this;
    }

    @Override
    public OrderRecord value17(UUID value) {
        setBillingCurrencyId(value);
        return this;
    }

    @Override
    public OrderRecord value18(Double value) {
        setExchangeRate(value);
        return this;
    }

    @Override
    public OrderRecord value19(UUID value) {
        setCurrencyId(value);
        return this;
    }

    @Override
    public OrderRecord value20(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public OrderRecord value21(Double value) {
        setAmount(value);
        return this;
    }

    @Override
    public OrderRecord values(LocalDateTime value1, UUID value2, LocalDateTime value3, UUID value4, UUID value5, String value6, UUID value7, UUID value8, UUID value9, String value10, String value11, LocalDate value12, UUID value13, UUID value14, Double value15, Double value16, UUID value17, Double value18, UUID value19, String value20, Double value21) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderRecord
     */
    public OrderRecord() {
        super(Order.ORDER);
    }

    /**
     * Create a detached, initialised OrderRecord
     */
    public OrderRecord(LocalDateTime creationDate, UUID creatorId, LocalDateTime lastModificationDate, UUID lastModifierId, UUID ownerId, String tag, UUID id, UUID customerAddressId, UUID supplierAddressId, String type, String reference, LocalDate publishingDate, UUID customerId, UUID supplierId, Double vatAmount, Double totalAmount, UUID billingCurrencyId, Double exchangeRate, UUID currencyId, String description, Double amount) {
        super(Order.ORDER);

        setCreationDate(creationDate);
        setCreatorId(creatorId);
        setLastModificationDate(lastModificationDate);
        setLastModifierId(lastModifierId);
        setOwnerId(ownerId);
        setTag(tag);
        setId(id);
        setCustomerAddressId(customerAddressId);
        setSupplierAddressId(supplierAddressId);
        setType(type);
        setReference(reference);
        setPublishingDate(publishingDate);
        setCustomerId(customerId);
        setSupplierId(supplierId);
        setVatAmount(vatAmount);
        setTotalAmount(totalAmount);
        setBillingCurrencyId(billingCurrencyId);
        setExchangeRate(exchangeRate);
        setCurrencyId(currencyId);
        setDescription(description);
        setAmount(amount);
    }
}