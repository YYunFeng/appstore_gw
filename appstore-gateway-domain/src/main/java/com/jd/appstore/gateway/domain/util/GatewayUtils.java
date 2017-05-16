package com.jd.appstore.gateway.domain.util;

import java.text.DecimalFormat;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-14
 * Time: 下午12:00
 * To change this template use File | Settings | File Templates.
 */
public class GatewayUtils {

    /**
     * 格式化文件大小   g
     *
     * @param size
     * @return String
     */
    public static String formatSize(Integer size) {
        String sizestring = null;
        DecimalFormat dfsmall = new DecimalFormat("0");
        DecimalFormat df = new DecimalFormat("0.00");
        double d = size;
        if ((d / 1024) < 1024) {
            if ((d / 1000) < 1000) {
                sizestring = dfsmall.format(d / 1024) + "KB";
            } else {
                sizestring = df.format(d / (1024 * 1024)) + "MB";
            }
        } else if (d / (1024 * 1024) < 1024) {
            sizestring = df.format(d / (1024 * 1024)) + "MB";
        } else {
            sizestring = df.format(d / (1024 * 1024 * 1024)) + "GB";
        }
        return sizestring;
    }

    /**
     * 根据记录总数和每页显示数计算总页数
     * @param count
     * @param pageSize
     * @return
     */
    public static Integer getTotalPage(Integer count, Integer pageSize) {
        return (count + pageSize - 1) / pageSize;
    }
}
