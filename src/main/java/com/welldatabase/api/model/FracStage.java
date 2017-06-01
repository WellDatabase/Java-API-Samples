package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class FracStage
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

    private Date stimDate;
    public Date getStimDate() {
        return stimDate;
    }

    private Integer stageNumber;
    public Integer getStageNumber() {
        return stageNumber;
    }

    private String stageDescription;
    public String getStageDescription() {
        return stageDescription;
    }

    private Float top;
    public Float getTop() {
        return top;
    }

    private Float bottom;
    public Float getBottom() {
        return bottom;
    }

    private String fracType;
    public String getFracType() {
        return fracType;
    }

    private String fluidType;
    public String getFluidType() {
        return fluidType;
    }

    private String baseFluid;
    public String getBaseFluid() {
        return baseFluid;
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

    private Float fracGradient;
    public Float getFracGradient() {
        return fracGradient;
    }

}
