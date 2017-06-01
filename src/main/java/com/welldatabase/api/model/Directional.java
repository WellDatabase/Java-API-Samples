package com.welldatabase.api.model;

import java.util.Date;
import java.util.UUID;

public class Directional
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

    private String fileNumber;
    public String getFileNumber() {
        return fileNumber;
    }

    private String leg;
    public String getLeg() {
        return leg;
    }

    private Float measuredDepth;
    public Float getMeasuredDepth() {
        return measuredDepth;
    }

    private Float incline;
    public Float getIncline() {
        return incline;
    }

    private Float azimuth;
    public Float getAzimuth() {
        return azimuth;
    }

    private Float tVD;
    public Float getTVD() {
        return tVD;
    }

    private Float ftNS;
    public Float getFtNS() {
        return ftNS;
    }

    private String nS;
    public String getNS() {
        return nS;
    }

    private Float ftEW;
    public Float getftEW() {
        return ftEW;
    }

    private String eW;
    public String getEW() {
        return eW;
    }

    private Float latitude;
    public Float getLatitude() {
        return latitude;
    }

    private Float longitude;
    public Float getLongitude() {
        return longitude;
    }

}
