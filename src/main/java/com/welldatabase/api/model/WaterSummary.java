package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class WaterSummary
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

    private String sampleMethod;
    public String getSampleMethod() {
        return sampleMethod;
    }

    private String wellType;
    public String getWellType() {
        return wellType;
    }

    private Integer elevation;
    public Integer getElevation() {
        return elevation;
    }

    private Double depth;
    public Double getDepth() {
        return depth;
    }

    private Double upperPerf;
    public Double getUpperPerf() {
        return upperPerf;
    }

    private Double lowerPerf;
    public Double getLowerPerf() {
        return lowerPerf;
    }

    private String formation;
    public String getFormation() {
        return formation;
    }

    private String basin;
    public String getBasin() {
        return basin;
    }

    private String lithology;
    public String getLithology() {
        return lithology;
    }

    private String uSGSRegion;
    public String getUSGSRegion() {
        return uSGSRegion;
    }

    private String uSGSProvince;
    public String getUSGSProvince() {
        return uSGSProvince;
    }

    private String geologicalPeriod;
    public String getGeologicalPeriod() {
        return geologicalPeriod;
    }

    private String geologicalEra;
    public String getGeologicalEra() {
        return geologicalEra;
    }

    private String geologicalEpoch;
    public String getGeologicalEpoch() {
        return geologicalEpoch;
    }

    private Float temp_F_;
    public Float getTemp_F_() {
        return temp_F_;
    }

    private Float specificGravity;
    public Float getSpecificGravity() {
        return specificGravity;
    }

    private Float specificGravityTemp_F_;
    public Float getSpecificGravityTemp_F_() {
        return specificGravityTemp_F_;
    }

    private Float resistivity_Ohm_;
    public Float getResistivity_Ohm_() {
        return resistivity_Ohm_;
    }

    private Float resistivityTemp_F_;
    public Float getResistivityTemp_F_() {
        return resistivityTemp_F_;
    }

    private Float pressure_psi_;
    public Float getPressure_psi_() {
        return pressure_psi_;
    }

    private String porosity_;
    public String getPorosity_() {
        return porosity_;
    }

    private Float pH;
    public Float getpH() {
        return pH;
    }

    private Float pHTemp_F_;
    public Float getpHTemp_F_() {
        return pHTemp_F_;
    }

    private Float totalSuspendedSolids;
    public Float getTotalSuspendedSolids() {
        return totalSuspendedSolids;
    }

    private Float totalDisolvedSolids;
    public Float getTotalDisolvedSolids() {
        return totalDisolvedSolids;
    }

    private Float chargeBalanceofMajorIons_;
    public Float getChargeBalanceofMajorIons_() {
        return chargeBalanceofMajorIons_;
    }

    private String remarks;
    public String getRemarks() {
        return remarks;
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
