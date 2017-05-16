package com.jd.appstore.gateway.domain.util;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-29
 * Time: 下午4:57
 * To change this template use File | Settings | File Templates.
 */
public class GatewayPath {
    private String logsPath;

    private String exceptionPath;

    private String newLogsPath;

    private String activeFile;

    public String getActiveFile() {
        return activeFile;
    }

    public void setActiveFile(String activeFile) {
        this.activeFile = activeFile;
    }

    public String getNewLogsPath() {
        return newLogsPath;
    }

    public void setNewLogsPath(String newLogsPath) {
        this.newLogsPath = newLogsPath;
    }

    public String getExceptionPath() {
        return exceptionPath;
    }

    public void setExceptionPath(String exceptionPath) {
        this.exceptionPath = exceptionPath;
    }

    public String getLogsPath() {
        return logsPath;
    }

    public void setLogsPath(String logsPath) {
        this.logsPath = logsPath;
    }

}
