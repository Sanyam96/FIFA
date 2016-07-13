package com.example.sanyam.fifa;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Sanyam on 11-07-2016.
 */
public class teamDataResponse {
    Boolean success;
    String expires;
    String expiresSource;
    String lastModified;
    @SerializedName("data")
    ArrayList<perTeamData> perTeamDataData;

    public teamDataResponse(Boolean success, String expires, String expiresSource, String lastModified, ArrayList<perTeamData> perTeamDataData) {
        this.success = success;
        this.expires = expires;
        this.expiresSource = expiresSource;
        this.lastModified = lastModified;
        this.perTeamDataData = perTeamDataData;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public String getExpiresSource() {
        return expiresSource;
    }

    public void setExpiresSource(String expiresSource) {
        this.expiresSource = expiresSource;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public ArrayList<perTeamData> getPerTeamDataData() {
        return perTeamDataData;
    }

    public void setPerTeamDataData(ArrayList<perTeamData> perTeamDataData) {
        this.perTeamDataData = perTeamDataData;
    }
}
