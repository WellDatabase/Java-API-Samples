package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class Stimulation
{
    private UUID id;
    public UUID getID() {
        return id;
    }

    private UUID wellId;
    public UUID getWellId() {
        return wellId;
    }

    private UUID fFID;
    public UUID getFFID() {
        return fFID;
    }

    private String completionID;
    public String getCompletionID() {
        return completionID;
    }

    private String stateID;
    public String getStateID() {
        return stateID;
    }

    private Date dateLastModified;
    public Date getDateLastModified() {
        return dateLastModified;
    }

    private Date dateCreated;
    public Date getDateCreated() {
        return dateCreated;
    }

    private Date stimDate;
    public Date getStimDate() {
        return stimDate;
    }

    private Date startDate;
    public Date getStartDate() {
        return startDate;
    }

    private Date endDate;
    public Date getEndDate() {
        return endDate;
    }

    private String operator;
    public String getOperator() {
        return operator;
    }

    private String serviceCompany;
    public String getServiceCompany() {
        return serviceCompany;
    }

    private Float top;
    public Float getTop() {
        return top;
    }

    private Float bottom;
    public Float getBottom() {
        return bottom;
    }

    private Integer topTVD;
    public Integer getTopTVD() {
        return topTVD;
    }

    private Integer bottomTVD;
    public Integer getBottomTVD() {
        return bottomTVD;
    }

    private Integer plugBackDepth;
    public Integer getPlugBackDepth() {
        return plugBackDepth;
    }

    private String formation;
    public String getFormation() {
        return formation;
    }

    private String holeType;
    public String getHoleType() {
        return holeType;
    }

    private String fracType;
    public String getFracType() {
        return fracType;
    }

    private Integer numberOfStages;
    public Integer getNumberOfStages() {
        return numberOfStages;
    }

    private String fluidType;
    public String getFluidType() {
        return fluidType;
    }

    private String baseFluid;
    public String getBaseFluid() {
        return baseFluid;
    }

    private Float totalBaseWaterVolumeGallons;
    public Float getTotalBaseWaterVolumeGallons() {
        return totalBaseWaterVolumeGallons;
    }

    private Float totalBaseNonWaterVolumeGallons;
    public Float getTotalBaseNonWaterVolumeGallons() {
        return totalBaseNonWaterVolumeGallons;
    }

    private Float totalBaseWaterMass;
    public Float getTotalBaseWaterMass() {
        return totalBaseWaterMass;
    }

    private Float totalFracFluidVolume;
    public Float getTotalFracFluidVolume() {
        return totalFracFluidVolume;
    }

    private Float totalFracFluidMass;
    public Float getTotalFracFluidMass() {
        return totalFracFluidMass;
    }

    private Float totalCO2Volume;
    public Float getTotalCO2Volume() {
        return totalCO2Volume;
    }

    private Float totalN2Volume;
    public Float getTotalN2Volume() {
        return totalN2Volume;
    }

    private Float totalProppantMass;
    public Float getTotalProppantMass() {
        return totalProppantMass;
    }

    private Boolean massCalculated;
    public Boolean getMassCalculated() {
        return massCalculated;
    }

    private String primaryPropantAmount;
    public String getPrimaryPropantAmount() {
        return primaryPropantAmount;
    }

    private String primaryProppantMaterial;
    public String getPrimaryProppantMaterial() {
        return primaryProppantMaterial;
    }

    private Boolean acidTreatmentPresent;
    public Boolean getAcidTreatmentPresent() {
        return acidTreatmentPresent;
    }

    private String acidType;
    public String getAcidType() {
        return acidType;
    }

    private Float acidConcentration;
    public Float getAcidConcentration() {
        return acidConcentration;
    }

    private String acidVolume;
    public String getAcidVolume() {
        return acidVolume;
    }

    private String crosslinkFluid;
    public String getCrosslinkFluid() {
        return crosslinkFluid;
    }

    private Boolean surfactantPresent;
    public Boolean getSurfactantPresent() {
        return surfactantPresent;
    }

    private String surfactant;
    public String getSurfactant() {
        return surfactant;
    }

    private Boolean scaleInhibitorPresent;
    public Boolean getScaleInhibitorPresent() {
        return scaleInhibitorPresent;
    }

    private Boolean clayControlPresent;
    public Boolean getClayControlPresent() {
        return clayControlPresent;
    }

    private String clayControlAgent;
    public String getClayControlAgent() {
        return clayControlAgent;
    }

    private Boolean celluloseBased;
    public Boolean getCelluloseBased() {
        return celluloseBased;
    }

    private Boolean breakerPresent;
    public Boolean getBreakerPresent() {
        return breakerPresent;
    }

    private Boolean energizerPresent;
    public Boolean getEnergizerPresent() {
        return energizerPresent;
    }

    private String energizer;
    public String getEnergizer() {
        return energizer;
    }

    private Boolean radioactiveTracerPresent;
    public Boolean getRadioactiveTracerPresent() {
        return radioactiveTracerPresent;
    }

    private String radioactiveTracer;
    public String getRadioactiveTracer() {
        return radioactiveTracer;
    }

    private Boolean chemicalTracerPresent;
    public Boolean getChemicalTracerPresent() {
        return chemicalTracerPresent;
    }

    private String chemicalTracer;
    public String getChemicalTracer() {
        return chemicalTracer;
    }

    private Float breakdownPressure;
    public Float getBreakdownPressure() {
        return breakdownPressure;
    }

    private Float averageTreatmentPressure;
    public Float getAverageTreatmentPressure() {
        return averageTreatmentPressure;
    }

    private Float averageTreatmentRate;
    public Float getAverageTreatmentRate() {
        return averageTreatmentRate;
    }

    private Float maxTreatmentPressure;
    public Float getMaxTreatmentPressure() {
        return maxTreatmentPressure;
    }

    private Float shutInPressure;
    public Float getShutInPressure() {
        return shutInPressure;
    }

    private Float fiveMinShutInPressure;
    public Float getFiveMinShutInPressure() {
        return fiveMinShutInPressure;
    }

    private Float bottomHolePressure;
    public Float getBottomHolePressure() {
        return bottomHolePressure;
    }

    private Float fracGradient;
    public Float getFracGradient() {
        return fracGradient;
    }

    private String comments;
    public String getComments() {
        return comments;
    }

}
