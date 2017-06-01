package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class WaterChemical
{
    private UUID wellId;
    public UUID getWellId() {
        return wellId;
    }

    private String uSGSID;
    public String getUSGSID() {
        return uSGSID;
    }

    private Date completionDate;
    public Date getCompletionDate() {
        return completionDate;
    }

    private Date sampleDate;
    public Date getSampleDate() {
        return sampleDate;
    }

    private Date analysisDate;
    public Date getAnalysisDate() {
        return analysisDate;
    }

    private Float specificGracity;
    public Float getSpecificGracity() {
        return specificGracity;
    }

    private String chemical;
    public String getChemical() {
        return chemical;
    }

    private String units;
    public String getUnits() {
        return units;
    }

    private String amount;
    public String getAmount() {
        return amount;
    }

    private String amountmg_L;
    public String getAmountmg_L() {
        return amountmg_L;
    }

    private UUID id;
    public UUID getID() {
        return id;
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
