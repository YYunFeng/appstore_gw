package com.jd.appstore.gateway.domain.obj;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-27
 * Time: 下午12:56
 * To change this template use File | Settings | File Templates.
 */
public class ClientVersionObj {

    private Integer versionCode;
    private String version;
    private String intro;
    private Integer clientType;
    private String packageUrl;
    private Integer valid;
    private Boolean needUpdate;


    public Boolean getNeedUpdate() {
        return needUpdate;
    }

    public void setNeedUpdate(Boolean needUpdate) {
        this.needUpdate = needUpdate;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public String getPackageUrl() {
        return packageUrl;
    }

    public void setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }
}
