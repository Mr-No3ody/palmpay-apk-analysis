package com.transsnet.palmpay.account.bean.rsp;

/* JADX INFO: loaded from: classes3.dex */
public class QueryDeviceRsp {
    private String appVersion;
    private String brand;
    private String deviceInfo;
    private String deviceModel;
    private int deviceStatus;
    private String deviceVersion;
    public String fcmToken;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f25782id;
    private String imei;
    private long lastLoggedOnTime;
    private int masterFlag;
    private String memberId;
    private String nickName;
    private int receiveNotificationsFlag;
    private String resolution;

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public int getDeviceStatus() {
        return this.deviceStatus;
    }

    public String getDeviceVersion() {
        return this.deviceVersion;
    }

    public int getId() {
        return this.f25782id;
    }

    public String getImei() {
        return this.imei;
    }

    public long getLastLoggedOnTime() {
        return this.lastLoggedOnTime;
    }

    public int getMasterFlag() {
        return this.masterFlag;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public String getNickName() {
        return this.nickName;
    }

    public int getReceiveNotificationsFlag() {
        return this.receiveNotificationsFlag;
    }

    public String getResolution() {
        return this.resolution;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setDeviceInfo(String str) {
        this.deviceInfo = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setDeviceStatus(int i7) {
        this.deviceStatus = i7;
    }

    public void setDeviceVersion(String str) {
        this.deviceVersion = str;
    }

    public void setId(int i7) {
        this.f25782id = i7;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public void setLastLoggedOnTime(long j6) {
        this.lastLoggedOnTime = j6;
    }

    public void setMasterFlag(int i7) {
        this.masterFlag = i7;
    }

    public void setMemberId(String str) {
        this.memberId = str;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setReceiveNotificationsFlag(int i7) {
        this.receiveNotificationsFlag = i7;
    }

    public void setResolution(String str) {
        this.resolution = str;
    }
}
