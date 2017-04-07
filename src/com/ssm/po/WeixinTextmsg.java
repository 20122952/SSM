package com.ssm.po;

public class WeixinTextmsg {
    private String textmsgId;

    private String keyword;

    private String content;

    private String createtime;

    private Integer status;

    private String bz;

    public String getTextmsgId() {
        return textmsgId;
    }

    public void setTextmsgId(String textmsgId) {
        this.textmsgId = textmsgId == null ? null : textmsgId.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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