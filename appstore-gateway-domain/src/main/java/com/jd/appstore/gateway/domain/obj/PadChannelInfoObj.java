package com.jd.appstore.gateway.domain.obj;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-29
 * Time: 下午3:32
 * To change this template use File | Settings | File Templates.
 */
public class PadChannelInfoObj {
      private Integer  id;
      private String cname;
      private String intro;
      private String gw;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getGw() {
        return gw;
    }

    public void setGw(String gw) {
        this.gw = gw;
    }
}
