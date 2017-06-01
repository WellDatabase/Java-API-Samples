package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class Test
{
    private UUID id;
    public UUID getID() {
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

    private String completionID;
    public String getCompletionID() {
        return completionID;
    }

    private String stateID;
    public String getStateID() {
        return stateID;
    }

    private Date testDate;
    public Date getTestDate() {
        return testDate;
    }

    private String liftingMethod;
    public String getLiftingMethod() {
        return liftingMethod;
    }

    private String testHours;
    public String getTestHours() {
        return testHours;
    }

    private Float testOil;
    public Float getTestOil() {
        return testOil;
    }

    private Float dailyOil;
    public Float getDailyOil() {
        return dailyOil;
    }

    private Float oilGravity;
    public Float getOilGravity() {
        return oilGravity;
    }

    private Float testGas;
    public Float getTestGas() {
        return testGas;
    }

    private Float dailyGas;
    public Float getDailyGas() {
        return dailyGas;
    }

    private String dryGasGravity;
    public String getDryGasGravity() {
        return dryGasGravity;
    }

    private Float mixtureGravity;
    public Float getMixtureGravity() {
        return mixtureGravity;
    }

    private Float testWater;
    public Float getTestWater() {
        return testWater;
    }

    private Float dailyWater;
    public Float getDailyWater() {
        return dailyWater;
    }

    private Float gOR;
    public Float getGOR() {
        return gOR;
    }

    private String chokeSize;
    public String getChokeSize() {
        return chokeSize;
    }

    private String meterPressure;
    public String getMeterPressure() {
        return meterPressure;
    }

    private Float wellHeadFlowTemp;
    public Float getWellHeadFlowTemp() {
        return wellHeadFlowTemp;
    }

    private Float shutInPressure;
    public Float getShutInPressure() {
        return shutInPressure;
    }

    private Float shutInTemp;
    public Float getShutInTemp() {
        return shutInTemp;
    }

}
