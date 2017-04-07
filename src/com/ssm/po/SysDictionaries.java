package com.ssm.po;

public class SysDictionaries {
    private String dictionariesId;

    private String name;

    private String nameEn;

    private String bianma;

    private Integer orderBy;

    private String parentId;

    private String bz;

    private String tbsname;

    public String getDictionariesId() {
        return dictionariesId;
    }

    public void setDictionariesId(String dictionariesId) {
        this.dictionariesId = dictionariesId == null ? null : dictionariesId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getBianma() {
        return bianma;
    }

    public void setBianma(String bianma) {
        this.bianma = bianma == null ? null : bianma.trim();
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getTbsname() {
        return tbsname;
    }

    public void setTbsname(String tbsname) {
        this.tbsname = tbsname == null ? null : tbsname.trim();
    }
}