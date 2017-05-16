package com.jd.appstore.gateway.domain.obj;

import com.jd.appstore.gateway.domain.dao.Saler;

import java.util.List;

/**
 * YYF on 2015/4/3.
 */
public class ChannelObj {
    private Integer channelType;
    private String channel;
    private List<Saler> list;

    public Integer getChannelType() {
        return channelType;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public List<Saler> getList() {
        return list;
    }

    public void setList(List<Saler> list) {
        this.list = list;
    }
}
