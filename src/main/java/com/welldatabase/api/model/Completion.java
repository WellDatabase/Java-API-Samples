package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class Completion
{
    private UUID id;
    public UUID getID() {
        return id;
    }

    private UUID wellId;
    public UUID getWellId() {
        return wellId;
    }

    private String completionID;
    public String getCompletionID() {
        return completionID;
    }

    private Date dateCreated;
    public Date getDateCreated() {
        return dateCreated;
    }

    private Date dateLastModified;
    public Date getDateLastModified() {
        return dateLastModified;
    }

    private Date completionDate;
    public Date getCompletionDate() {
        return completionDate;
    }

    private String operator;
    public String getOperator() {
        return operator;
    }

    private String wellName;
    public String getWellName() {
        return wellName;
    }

    private String leaseName;
    public String getLeaseName() {
        return leaseName;
    }

    private String leaseId;
    public String getLeaseId() {
        return leaseId;
    }

    private String district;
    public String getDistrict() {
        return district;
    }

    private String wellNumber;
    public String getWellNumber() {
        return wellNumber;
    }

    private Integer upperPerf;
    public Integer getUpperPerf() {
        return upperPerf;
    }

    private Integer lowerPerf;
    public Integer getLowerPerf() {
        return lowerPerf;
    }

    private Integer upperPerfTVD;
    public Integer getUpperPerfTVD() {
        return upperPerfTVD;
    }

    private Integer lowerPerfTVD;
    public Integer getLowerPerfTVD() {
        return lowerPerfTVD;
    }

    private Float iPOil;
    public Float getIPOil() {
        return iPOil;
    }

    private Float iPGas;
    public Float getIPGas() {
        return iPGas;
    }

    private Float iPWater;
    public Float getIPWater() {
        return iPWater;
    }

    private String completionType;
    public String getCompletionType() {
        return completionType;
    }

    private String electricLogRunType;
    public String getElectricLogRunType() {
        return electricLogRunType;
    }

    private Float plugBackMD;
    public Float getPlugBackMD() {
        return plugBackMD;
    }

    private Float plugBackTVD;
    public Float getPlugBackTVD() {
        return plugBackTVD;
    }

    private Float leaseAcreage;
    public Float getLeaseAcreage() {
        return leaseAcreage;
    }

    private String formation;
    public String getFormation() {
        return formation;
    }

}
