package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class TubingAndPacker
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

    private String tubingSize;
    public String getTubingSize() {
        return tubingSize;
    }

    private Float tubingUpperDepth;
    public Float getTubingUpperDepth() {
        return tubingUpperDepth;
    }

    private Float tubingLowerDepth;
    public Float getTubingLowerDepth() {
        return tubingLowerDepth;
    }

    private Float packerDepth;
    public Float getPackerDepth() {
        return packerDepth;
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
