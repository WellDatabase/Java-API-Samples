package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class FracIngredient
{
    private UUID id;
    public UUID getID() {
        return id;
    }

    private Date dateLastModified;
    public Date getDateLastModified() {
        return dateLastModified;
    }

    private Date dateCreated;
    public Date getDateCreated() {
        return dateCreated;
    }

    private UUID wellId;
    public UUID getWellId() {
        return wellId;
    }

    private String completionID;
    public String getCompletionID() {
        return completionID;
    }

    private String tradeName;
    public String getTradeName() {
        return tradeName;
    }

    private String supplier;
    public String getSupplier() {
        return supplier;
    }

    private String purpose;
    public String getPurpose() {
        return purpose;
    }

    private String name;
    public String getName() {
        return name;
    }

    private Float maxConcentrationInAdditive;
    public Float getMaxConcentrationInAdditive() {
        return maxConcentrationInAdditive;
    }

    private Float massIngredient;
    public Float getMassIngredient() {
        return massIngredient;
    }

    private Boolean hasMSDS;
    public Boolean getHasMSDS() {
        return hasMSDS;
    }

    private Float concentrationInFracFluid;
    public Float getConcentrationInFracFluid() {
        return concentrationInFracFluid;
    }

    private String comment;
    public String getComment() {
        return comment;
    }

    private String cASNumber;
    public String getCASNumber() {
        return cASNumber;
    }

    private UUID fFID;
    public UUID getFFID() {
        return fFID;
    }

}
