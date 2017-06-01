package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class Well
{
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

    private String wellName;
    public String getWellName() {
        return wellName;
    }

    private String api;
    public String getAPI() {
        return api;
    }

    private String wellType;
    public String getWellType() {
        return wellType;
    }

    private String wellStatus;
    public String getWellStatus() {
        return wellStatus;
    }

    private String currentOperator;
    public String getCurrentOperator() {
        return currentOperator;
    }

    private String originalOperator;
    public String getOriginalOperator() {
        return originalOperator;
    }

    private String field;
    public String getField() {
        return field;
    }

    private String county;
    public String getCounty() {
        return county;
    }

    private String state;
    public String getState() {
        return state;
    }

    private String country;
    public String getCountry() {
        return country;
    }

    private String wellBoreProfile;
    public String getWellBoreProfile() {
        return wellBoreProfile;
    }

    private Float latitude;
    public Float getLatitude() {
        return latitude;
    }

    private Float longitude;
    public Float getLongitude() {
        return longitude;
    }

    private Float bhLatitude;
    public Float getBHLatitude() {
        return bhLatitude;
    }

    private Float bhLongitude;
    public Float getBHLongitude() {
        return bhLongitude;
    }

    private Date permitDate;
    public Date getPermitDate() {
        return permitDate;
    }

    private Date spudDate;
    public Date getSpudDate() {
        return spudDate;
    }

    private Date completionDate;
    public Date getCompletionDate() {
        return completionDate;
    }

    private Date firstProdDate;
    public Date getFirstProdDate() {
        return firstProdDate;
    }

    private Float measuredDepth;
    public Float getMeasuredDepth() {
        return measuredDepth;
    }

    private Float trueVerticalDepth;
    public Float getTrueVerticalDepth() {
        return trueVerticalDepth;
    }

    private Float lateralLength;
    public Float getLateralLength() {
        return lateralLength;
    }

    private String basin;
    public String getBasin() {
        return basin;
    }

    private String play;
    public String getPlay() {
        return play;
    }

    private String grid1;
    public String getGrid1() {
        return grid1;
    }

    private String grid2;
    public String getGrid2() {
        return grid2;
    }

    private String grid3;
    public String getGrid3() {
        return grid3;
    }

    private String grid4;
    public String getGrid4() {
        return grid4;
    }

    private String grid5;
    public String getGrid5() {
        return grid5;
    }

    private String stateID;
    public String getStateID() {
        return stateID;
    }

    private String stateIDDesc;
    public String getStateIDDesc() {
        return stateIDDesc;
    }

    private String thermalMaturity;
    public String getThermalMaturity() {
        return thermalMaturity;
    }

    private UUID id;
    public UUID getID() {
        return id;
    }

    private Date plugDate;
    public Date getPlugDate() {
        return plugDate;
    }

    private String permitNumber;
    public String getPermitNumber() {
        return permitNumber;
    }

    private String lease;
    public String getLease() {
        return lease;
    }

    private String leaseID;
    public String getLeaseID() {
        return leaseID;
    }

    private String footages;
    public String getFootages() {
        return footages;
    }

    private String quarter;
    public String getQuarter() {
        return quarter;
    }

    private Integer groundElevation;
    public Integer getGroundElevation() {
        return groundElevation;
    }

    private Integer drillingFloorElevation;
    public Integer getDrillingFloorElevation() {
        return drillingFloorElevation;
    }

    private Integer kellyBushingElevation;
    public Integer getKellyBushingElevation() {
        return kellyBushingElevation;
    }

    private String comments;
    public String getComments() {
        return comments;
    }

    private Date testDate;
    public Date getTestDate() {
        return testDate;
    }

    private String primaryFormation;
    public String getPrimaryFormation() {
        return primaryFormation;
    }

}
