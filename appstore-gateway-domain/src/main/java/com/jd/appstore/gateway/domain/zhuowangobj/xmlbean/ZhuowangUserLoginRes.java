package com.jd.appstore.gateway.domain.zhuowangobj.xmlbean;

/**
 * User: gaoyang
 * Date: 13-2-4
 * Time: 上午10:15
 * To change this template use File | Settings | File Templates.
 */
public class ZhuowangUserLoginRes {

    private Boolean result;
    private String description;
    private String staffId;
    private String loginName;
    private String realName;
    private String departmentId;
    private String password;
    private String status;
    private String sex;
    private String mobile;
    private String email;
    private String createUser;
    private String createDate;
    private String passwordExpireDate;
    private String lastUpdateDate;
    private String cityId;
    private String provinceId;
    private String bossId;
    private String params[];
    private String send_disabled;
    private String recv_disabled;
    private String channelId;
    private String areaProvinceId;
    private String areaCityId;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getPasswordExpireDate() {
        return passwordExpireDate;
    }

    public void setPasswordExpireDate(String passwordExpireDate) {
        this.passwordExpireDate = passwordExpireDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    public String getSend_disabled() {
        return send_disabled;
    }

    public void setSend_disabled(String send_disabled) {
        this.send_disabled = send_disabled;
    }

    public String getRecv_disabled() {
        return recv_disabled;
    }

    public void setRecv_disabled(String recv_disabled) {
        this.recv_disabled = recv_disabled;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getAreaProvinceId() {
        return areaProvinceId;
    }

    public void setAreaProvinceId(String areaProvinceId) {
        this.areaProvinceId = areaProvinceId;
    }

    public String getAreaCityId() {
        return areaCityId;
    }

    public void setAreaCityId(String areaCityId) {
        this.areaCityId = areaCityId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getBossId() {
        return bossId;
    }

    public void setBossId(String bossId) {
        this.bossId = bossId;
    }

    @Override
    public String toString() {
        return "ZhuowangUserLoginRes{" +
                "result=" + result +
                ", description='" + description + '\'' +
                ", staffId='" + staffId + '\'' +
                ", loginName='" + loginName + '\'' +
                ", realName='" + realName + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", sex='" + sex + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createDate='" + createDate + '\'' +
                ", passwordExpireDate='" + passwordExpireDate + '\'' +
                ", lastUpdateDate='" + lastUpdateDate + '\'' +
                ", cityId='" + cityId + '\'' +
                ", provinceId='" + provinceId + '\'' +
                ", bossId='" + bossId + '\'' +
                ", params='" + params + '\'' +
                ", send_disabled='" + send_disabled + '\'' +
                ", recv_disabled='" + recv_disabled + '\'' +
                ", channelId='" + channelId + '\'' +
                ", areaProvinceId='" + areaProvinceId + '\'' +
                ", areaCityId='" + areaCityId + '\'' +
                '}';
    }
}
