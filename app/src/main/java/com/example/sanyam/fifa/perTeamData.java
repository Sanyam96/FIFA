package com.example.sanyam.fifa;

/**
 * Created by Sanyam on 11-07-2016.
 */
public class perTeamData {
    String c_TeamNatioShort;
    String c_Group;
    String n_GroupPosition;
    String c_HomeColor;
    String c_AwayColor;
    int n_TeamID;
    String c_LogoImage;
    String c_Team_en;
    String n_WorldRanking;

    public perTeamData(String c_TeamNatioShort, String c_Group, String n_GroupPosition, String c_HomeColor, String c_AwayColor, int n_TeamID, String c_LogoImage, String c_Team_en, String n_WorldRanking) {
        this.c_TeamNatioShort = c_TeamNatioShort;
        this.c_Group = c_Group;
        this.n_GroupPosition = n_GroupPosition;
        this.c_HomeColor = c_HomeColor;
        this.c_AwayColor = c_AwayColor;
        this.n_TeamID = n_TeamID;
        this.c_LogoImage = c_LogoImage;
        this.c_Team_en = c_Team_en;
        this.n_WorldRanking = n_WorldRanking;
    }

    public String getC_TeamNatioShort() {
        return c_TeamNatioShort;
    }

    public void setC_TeamNatioShort(String c_TeamNatioShort) {
        this.c_TeamNatioShort = c_TeamNatioShort;
    }

    public String getC_Group() {
        return c_Group;
    }

    public void setC_Group(String c_Group) {
        this.c_Group = c_Group;
    }

    public String getN_GroupPosition() {
        return n_GroupPosition;
    }

    public void setN_GroupPosition(String n_GroupPosition) {
        this.n_GroupPosition = n_GroupPosition;
    }

    public String getC_HomeColor() {
        return c_HomeColor;
    }

    public void setC_HomeColor(String c_HomeColor) {
        this.c_HomeColor = c_HomeColor;
    }

    public String getC_AwayColor() {
        return c_AwayColor;
    }

    public void setC_AwayColor(String c_AwayColor) {
        this.c_AwayColor = c_AwayColor;
    }

    public int getN_TeamID() {
        return n_TeamID;
    }

    public void setN_TeamID(int n_TeamID) {
        this.n_TeamID = n_TeamID;
    }

    public String getC_LogoImage() {
        return c_LogoImage;
    }

    public void setC_LogoImage(String c_LogoImage) {
        this.c_LogoImage = c_LogoImage;
    }

    public String getC_Team_en() {
        return c_Team_en;
    }

    public void setC_Team_en(String c_Team_en) {
        this.c_Team_en = c_Team_en;
    }

    public String getN_WorldRanking() {
        return n_WorldRanking;
    }

    public void setN_WorldRanking(String n_WorldRanking) {
        this.n_WorldRanking = n_WorldRanking;
    }
}
