package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class Formation
{
    private UUID id;
    public UUID getId() {
        return id;
    }

    private UUID wellId;
    public UUID getWellId() {
        return wellId;
    }

    private String formationName;
    public String getFormationName() {
        return formationName;
    }

    private Float topDepth;
    public Float getTopDepth() {
        return topDepth;
    }

    private String comments;
    public String getComments() {
        return comments;
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

}
