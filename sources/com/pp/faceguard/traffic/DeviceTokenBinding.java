package com.pp.faceguard.traffic;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceTokenBinding {
    private final String bindingId;
    private final String deviceId;
    private final String message;
    private final Long reportedAt;
    private final String status;
    private final String userId;

    public DeviceTokenBinding(String str, String str2, String str3, String str4, String str5, Long l5) {
        this.bindingId = str;
        this.status = str2;
        this.message = str3;
        this.userId = str4;
        this.deviceId = str5;
        this.reportedAt = l5;
    }

    public String getBindingId() {
        return this.bindingId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    @Deprecated
    public String getMemberId() {
        return this.userId;
    }

    public String getMessage() {
        return this.message;
    }

    public Long getReportedAt() {
        return this.reportedAt;
    }

    public String getStatus() {
        return this.status;
    }

    public String getUserId() {
        return this.userId;
    }
}
