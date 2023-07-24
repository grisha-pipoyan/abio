package com.brutus.abio.data.entity;

import jakarta.persistence.Entity;

@Entity
public class OrderDetailsDTO extends AbstractEntity {

    private String orderDateTime;
    private String deliveryRegionName;
    private Integer deliveryPrice;
    private String address;
    private String date;
    private String time;
    private String comment;
    private String first_name;
    private String last_name;
    private String email;
    private String mobileNo;
    private Integer totalPrice;
    private String paymentType;
    private boolean payed;
    private boolean confirmed;
    private boolean notified;
    private boolean saleDocCreated;

    public String getOrderDateTime() {
        return orderDateTime;
    }
    public void setOrderDateTime(String orderDateTime) {
        this.orderDateTime = orderDateTime;
    }
    public String getDeliveryRegionName() {
        return deliveryRegionName;
    }
    public void setDeliveryRegionName(String deliveryRegionName) {
        this.deliveryRegionName = deliveryRegionName;
    }
    public Integer getDeliveryPrice() {
        return deliveryPrice;
    }
    public void setDeliveryPrice(Integer deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public Integer getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public boolean isPayed() {
        return payed;
    }
    public void setPayed(boolean payed) {
        this.payed = payed;
    }
    public boolean isConfirmed() {
        return confirmed;
    }
    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
    public boolean isNotified() {
        return notified;
    }
    public void setNotified(boolean notified) {
        this.notified = notified;
    }
    public boolean isSaleDocCreated() {
        return saleDocCreated;
    }
    public void setSaleDocCreated(boolean saleDocCreated) {
        this.saleDocCreated = saleDocCreated;
    }

}
