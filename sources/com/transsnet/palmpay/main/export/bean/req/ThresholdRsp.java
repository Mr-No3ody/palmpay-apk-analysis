package com.transsnet.palmpay.main.export.bean.req;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ThresholdRsp {
    private int amountThreshold;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f31989id;
    private String memberId;

    @SerializedName("audit")
    private int thresholdOn;

    public int getAmountThreshold() {
        return this.amountThreshold;
    }

    public int getId() {
        return this.f31989id;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public int getThresholdOn() {
        return this.thresholdOn;
    }

    public void setAmountThreshold(int i7) {
        this.amountThreshold = i7;
    }

    public void setId(int i7) {
        this.f31989id = i7;
    }

    public void setMemberId(String str) {
        this.memberId = str;
    }

    public void setThresholdOn(int i7) {
        this.thresholdOn = i7;
    }
}
