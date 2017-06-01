package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class Injection
{
    private UUID wellId;
    public UUID getWellId() {
        return wellId;
    }

    private UUID id;
    public UUID getID() {
        return id;
    }

    private Date reportDate;
    public Date getReportDate() {
        return reportDate;
    }

    private float waterInjection;
    public float getWaterInjection() {
        return waterInjection;
    }

    private float gasInjection;
    public float getGasInjection() {
        return gasInjection;
    }

    private float cO2Injection;
    public float getCO2Injection() {
        return cO2Injection;
    }

    private float otherInjection;
    public float getOtherInjection() {
        return otherInjection;
    }

    private Float tubingPressure;
    public Float getTubingPressure() {
        return tubingPressure;
    }

    private String lease;
    public String getLease() {
        return lease;
    }

    private String operator;
    public String getOperator() {
        return operator;
    }

    private String field;
    public String getField() {
        return field;
    }

    private String formation;
    public String getFormation() {
        return formation;
    }

    private Date dateCreated;
    public Date getDateCreated() {
        return dateCreated;
    }

    private Date dateLastModified;
    public Date getDateLastModified() {
        return dateLastModified;
    }

}
