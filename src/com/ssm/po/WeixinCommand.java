package com.ssm.po;

public class WeixinCommand {
    private String commandId;

    private String keyword;

    private String commandcode;

    private String createtime;

    private Integer status;

    private String bz;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId == null ? null : commandId.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getCommandcode() {
        return commandcode;
    }

    public void setCommandcode(String commandcode) {
        this.commandcode = commandcode == null ? null : commandcode.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }
}