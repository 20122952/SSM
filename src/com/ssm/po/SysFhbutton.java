package com.ssm.po;

public class SysFhbutton {
    private String fhbuttonId;

    private String name;

    private String qxName;

    private String bz;

    public String getFhbuttonId() {
        return fhbuttonId;
    }

    public void setFhbuttonId(String fhbuttonId) {
        this.fhbuttonId = fhbuttonId == null ? null : fhbuttonId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getQxName() {
        return qxName;
    }

    public void setQxName(String qxName) {
        this.qxName = qxName == null ? null : qxName.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }
}