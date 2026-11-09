package com.transsnet.palmpay.send_money.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\t¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/RecentlyCompensationBean;", "", "<init>", "()V", "compensationIcon", "", "getCompensationIcon", "()Ljava/lang/String;", "setCompensationIcon", "(Ljava/lang/String;)V", "darkCompensationIcon", "getDarkCompensationIcon", "setDarkCompensationIcon", "title", "getTitle", "setTitle", "payeeName", "getPayeeName", "setPayeeName", "desc", "getDesc", "setDesc", "buttonDesc", "getButtonDesc", "setButtonDesc", "remainingTimeDesc", "getRemainingTimeDesc", "setRemainingTimeDesc", "remainTime", "", "getRemainTime", "()Ljava/lang/Long;", "setRemainTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "jumpUrl", "getJumpUrl", "setJumpUrl", "pointColor", "getPointColor", "setPointColor", "darkPointColor", "getDarkPointColor", "setDarkPointColor", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RecentlyCompensationBean {

    @Nullable
    private String buttonDesc;

    @Nullable
    private String compensationIcon;

    @Nullable
    private String darkCompensationIcon;

    @Nullable
    private String darkPointColor;

    @Nullable
    private String desc;

    @Nullable
    private String jumpUrl;

    @Nullable
    private String payeeName;

    @Nullable
    private String pointColor;

    @Nullable
    private Long remainTime;

    @Nullable
    private String remainingTimeDesc;

    @Nullable
    private String title;

    @Nullable
    public final String getButtonDesc() {
        return this.buttonDesc;
    }

    @Nullable
    public final String getCompensationIcon() {
        return this.compensationIcon;
    }

    @Nullable
    public final String getDarkCompensationIcon() {
        return this.darkCompensationIcon;
    }

    @Nullable
    public final String getDarkPointColor() {
        return this.darkPointColor;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getPayeeName() {
        return this.payeeName;
    }

    @Nullable
    public final String getPointColor() {
        return this.pointColor;
    }

    @Nullable
    public final Long getRemainTime() {
        return this.remainTime;
    }

    @Nullable
    public final String getRemainingTimeDesc() {
        return this.remainingTimeDesc;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setButtonDesc(@Nullable String str) {
        this.buttonDesc = str;
    }

    public final void setCompensationIcon(@Nullable String str) {
        this.compensationIcon = str;
    }

    public final void setDarkCompensationIcon(@Nullable String str) {
        this.darkCompensationIcon = str;
    }

    public final void setDarkPointColor(@Nullable String str) {
        this.darkPointColor = str;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setPayeeName(@Nullable String str) {
        this.payeeName = str;
    }

    public final void setPointColor(@Nullable String str) {
        this.pointColor = str;
    }

    public final void setRemainTime(@Nullable Long l5) {
        this.remainTime = l5;
    }

    public final void setRemainingTimeDesc(@Nullable String str) {
        this.remainingTimeDesc = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
