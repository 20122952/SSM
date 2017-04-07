package com.ssm.po;

public class SysCreatecode {
    private String createcodeId;

    private String packagename;

    private String objectname;

    private String tablename;

    private String fieldlist;

    private String createtime;

    private String title;

    public String getCreatecodeId() {
        return createcodeId;
    }

    public void setCreatecodeId(String createcodeId) {
        this.createcodeId = createcodeId == null ? null : createcodeId.trim();
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename == null ? null : packagename.trim();
    }

    public String getObjectname() {
        return objectname;
    }

    public void setObjectname(String objectname) {
        this.objectname = objectname == null ? null : objectname.trim();
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    public String getFieldlist() {
        return fieldlist;
    }

    public void setFieldlist(String fieldlist) {
        this.fieldlist = fieldlist == null ? null : fieldlist.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}