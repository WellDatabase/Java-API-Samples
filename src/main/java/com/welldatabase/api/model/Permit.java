package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class Permit
{
    private UUID id;
    public UUID getID() {
        return id;
    }

    private UUID wellId;
    public UUID getWellId() {
        return wellId;
    }

    private String permitID;
    public String getPermitID() {
        return permitID;
    }

    private Date submittedDate;
    public Date getSubmittedDate() {
        return submittedDate;
    }

    private Date approvedDate;
    public Date getApprovedDate() {
        return approvedDate;
    }

    private Date expiredDate;
    public Date getExpiredDate() {
        return expiredDate;
    }

    private Date amendedDate;
    public Date getAmendedDate() {
        return amendedDate;
    }

    private String permitStatus;
    public String getPermitStatus() {
        return permitStatus;
    }

    private String permitPurpose;
    public String getPermitPurpose() {
        return permitPurpose;
    }

    private String filedBy;
    public String getFiledBy() {
        return filedBy;
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
