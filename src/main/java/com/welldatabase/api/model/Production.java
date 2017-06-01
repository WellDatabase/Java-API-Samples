package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class Production
{
    private UUID id;
    public UUID getId() {
        return id;
    }

    private UUID wellId;
    public UUID getWellId() {
        return wellId;
    }

    private Date dateCreated;
    public Date getDateCreated() {
        return dateCreated;
    }

    private Date dateLastModified;
    public Date getDateLastModified() {
        return dateLastModified;
    }

    private Date reportDate;
    public Date getReportDate() {
        return reportDate;
    }

    private Integer days;
    public Integer getDays() {
        return days;
    }

    private String lease;
    public String getLease() {
        return lease;
    }

    private String operator;
    public String getOperator() {
        return operator;
    }

    private Integer wellsInLease;
    public Integer getWellsInLease() {
        return wellsInLease;
    }

    private String field;
    public String getField() {
        return field;
    }

    private String formation;
    public String getFormation() {
        return formation;
    }

    private Float totalOil;
    public Float getTotalOil() {
        return totalOil;
    }

    private Float leaseOilAllowable;
    public Float getLeaseOilAllowable() {
        return leaseOilAllowable;
    }

    private Float wellOilAllowable;
    public Float getWellOilAllowable() {
        return wellOilAllowable;
    }

    private Float wellOil;
    public Float getWellOil() {
        return wellOil;
    }

    private Float totalGas;
    public Float getTotalGas() {
        return totalGas;
    }

    private Float leaseGasAllowable;
    public Float getLeaseGasAllowable() {
        return leaseGasAllowable;
    }

    private Float wellGasAllowable;
    public Float getWellGasAllowable() {
        return wellGasAllowable;
    }

    private Float wellGas;
    public Float getWellGas() {
        return wellGas;
    }

    private Float totalWater;
    public Float getTotalWater() {
        return totalWater;
    }

    private Float wellWater;
    public Float getWellWater() {
        return wellWater;
    }

    private Float gOR;
    public Float getGOR() {
        return gOR;
    }

    private Integer reportMonth;
    public Integer getReportMonth() {
        return reportMonth;
    }

    private Integer reportYear;
    public Integer getReportYear() {
        return reportYear;
    }

}
