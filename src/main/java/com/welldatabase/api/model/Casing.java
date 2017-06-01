package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;


public class Casing
{
    private UUID id;
    public UUID getID() {
        return id;
    }

    private UUID wellId;
    public UUID getWellId() {
        return wellId;
    }

    private Date completionDate;
    public Date getCompletionDate() {
        return completionDate;
    }

    private String casingType;
    public String getCasingType() {
        return casingType;
    }

    private Float wellboreSize;
    public Float getWellboreSize() {
        return wellboreSize;
    }

    private Float upperSetDepth;
    public Float getUpperSetDepth() {
        return upperSetDepth;
    }

    private Float lowerSetDepth;
    public Float getLowerSetDepth() {
        return lowerSetDepth;
    }

    private Float cementSacks;
    public Float getCementSacks() {
        return cementSacks;
    }

    private Float casingSize;
    public Float getCasingSize() {
        return casingSize;
    }

    private Float casingWeight;
    public Float getCasingWeight() {
        return casingWeight;
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




