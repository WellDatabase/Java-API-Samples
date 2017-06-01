package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class Perf
{
    private UUID id;
    public UUID getID() {
        return id;
    }

    private Integer simpleId;
    public Integer getSimpleId() {
        return simpleId;
    }

    private UUID wellId;
    public UUID getWellId() {
        return wellId;
    }

    private String completionID;
    public String getCompletionID() {
        return completionID;
    }

    private Date perfDate;
    public Date getPerfDate() {
        return perfDate;
    }

    private Float upperPerf;
    public Float getUpperPerf() {
        return upperPerf;
    }

    private Float lowerPerf;
    public Float getLowerPerf() {
        return lowerPerf;
    }

    private Date dateCreated;
    public Date getDateCreated() {
        return dateCreated;
    }

    private Date dateLastModified;
    public Date getDateLastModified() {
        return dateLastModified;
    }

    private String reservoir;
    public String getReservoir() {
        return reservoir;
    }

    private String comments;
    public String getComments() {
        return comments;
    }

}
