package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tbl_retry", schema = "public", catalog = "ucip_db")
public class TblRetryEntity  {
    private Long id;
    private Long tblChargingId;
    private Long smsId;
    private String msisdn;
    private Timestamp ctimestamp;
    private Double amount;
    private Long operatorId;
    private Integer partnerId;
    private String shortCode;
    private Integer responseCode;
    private Integer numOfAttempts;
    private Integer isCharged;
    private String smsText;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tbl_charging_id")
    public Long getTblChargingId() {
        return tblChargingId;
    }

    public void setTblChargingId(Long tblChargingId) {
        this.tblChargingId = tblChargingId;
    }

    @Basic
    @Column(name = "sms_id")
    public Long getSmsId() {
        return smsId;
    }

    public void setSmsId(Long smsId) {
        this.smsId = smsId;
    }

    @Basic
    @Column(name = "msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    @Basic
    @Column(name = "ctimestamp")
    public Timestamp getCtimestamp() {
        return ctimestamp;
    }

    public void setCtimestamp(Timestamp ctimestamp) {
        this.ctimestamp = ctimestamp;
    }

    @Basic
    @Column(name = "amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "operator_id")
    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    @Basic
    @Column(name = "partner_id")
    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    @Basic
    @Column(name = "short_code")
    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    @Basic
    @Column(name = "response_code")
    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    @Basic
    @Column(name = "num_of_attempts")
    public Integer getNumOfAttempts() {
        return numOfAttempts;
    }

    public void setNumOfAttempts(Integer numOfAttempts) {
        this.numOfAttempts = numOfAttempts;
    }

    @Basic
    @Column(name = "is_charged")
    public Integer getIsCharged() {
        return isCharged;
    }

    public void setIsCharged(Integer isCharged) {
        this.isCharged = isCharged;
    }

    @Basic
    @Column(name = "sms_text")
    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String smsText) {
        this.smsText = smsText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblRetryEntity that = (TblRetryEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(tblChargingId, that.tblChargingId) &&
                Objects.equals(smsId, that.smsId) &&
                Objects.equals(msisdn, that.msisdn) &&
                Objects.equals(ctimestamp, that.ctimestamp) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(operatorId, that.operatorId) &&
                Objects.equals(partnerId, that.partnerId) &&
                Objects.equals(shortCode, that.shortCode) &&
                Objects.equals(responseCode, that.responseCode) &&
                Objects.equals(numOfAttempts, that.numOfAttempts) &&
                Objects.equals(isCharged, that.isCharged) &&
                Objects.equals(smsText, that.smsText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tblChargingId, smsId, msisdn, ctimestamp, amount, operatorId, partnerId, shortCode, responseCode, numOfAttempts, isCharged, smsText);
    }
}
