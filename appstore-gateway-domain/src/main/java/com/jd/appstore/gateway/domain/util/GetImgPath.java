package com.jd.appstore.gateway.domain.util;

import com.jd.appstore.gateway.domain.enumtype.PicResolutionEnum;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-21
 * Time: 下午4:27
 * To change this template use File | Settings | File Templates.
 */
public class GetImgPath {

    public static String getImgPath(Integer linkType, boolean isAppLogo) {
        String imgPath = null;
        if (linkType.intValue() == 0 && !isAppLogo) {
            imgPath = PicResolutionEnum.COVER.getPrefix();
        }
        if (linkType.intValue() == 1 && !isAppLogo) {
            imgPath = PicResolutionEnum.TOPICIMAGE.getPrefix();
        }
        if (linkType.intValue() == 2 && !isAppLogo) {
            imgPath = PicResolutionEnum.CATEGORYIMAGE.getPrefix();
        }
        if (isAppLogo) {
            imgPath = PicResolutionEnum.RECIMAGE.getPrefix();
        }
        return imgPath;
    }
}
