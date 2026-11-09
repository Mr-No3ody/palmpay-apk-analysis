package com.transsnet.palmpay.main.export.bean.req;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ThresholdReq {
    private int amountThreshold;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f31988id;
    private String memberId;
    public String securityVerifyToken;

    @SerializedName("audit")
    private int thresholdOn;

    public int getAmountThreshold() {
        return this.amountThreshold;
    }

    public int getId() {
        return this.f31988id;
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
        this.f31988id = i7;
    }

    public void setMemberId(String str) {
        this.memberId = str;
    }

    public void setThresholdOn(int i7) {
        this.thresholdOn = i7;
    }
}
