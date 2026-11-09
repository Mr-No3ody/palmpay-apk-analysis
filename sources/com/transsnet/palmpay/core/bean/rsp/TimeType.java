package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class TimeType extends CommonResult {
    public static final String ALL_CHANNEL = "all_channel";
    private String channel;
    private String planName;

    public TimeType(String channel, String planName) {
        this.channel = channel;
        this.planName = planName;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getPlanName() {
        return this.planName;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }
}
