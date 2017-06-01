package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class History
{
    private UUID wellId;
    public UUID getWellId() {
        return wellId;
    }

    private UUID id;
    public UUID getID() {
        return id;
    }

    private String wellName;
    public String getWellName() {
        return wellName;
    }

    private String status;
    public String getStatus() {
        return status;
    }

    private Date statusDate;
    public Date getStatusDate() {
        return statusDate;
    }

    private String orginization;
    public String getOrginization() {
        return orginization;
    }

    private String field;
    public String getField() {
        return field;
    }

    private Date effectiveDate;
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    private String comments;
    public String getComments() {
        return comments;
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
