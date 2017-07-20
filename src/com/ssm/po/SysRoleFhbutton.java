package com.ssm.po;

public class SysRoleFhbutton {
    private String rbId;

    private String roleId;

    private String buttonId;
    
    private SysRole sysRole;
    
    private SysFhbutton sysFhbutton;

    public String getRbId() {
        return rbId;
    }

    public void setRbId(String rbId) {
        this.rbId = rbId == null ? null : rbId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getButtonId() {
        return buttonId;
    }

    public void setButtonId(String buttonId) {
        this.buttonId = buttonId == null ? null : buttonId.trim();
    }

	public SysRole getSysRole() {
		return sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}

	public SysFhbutton getSysFhbutton() {
		return sysFhbutton;
	}

	public void setSysFhbutton(SysFhbutton sysFhbutton) {
		this.sysFhbutton = sysFhbutton;
	}
    
}