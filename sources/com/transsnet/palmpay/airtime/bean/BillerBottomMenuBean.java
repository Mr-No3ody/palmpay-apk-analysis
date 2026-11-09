package com.transsnet.palmpay.airtime.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/BillerBottomMenuBean;", "", "<init>", "()V", "androidLink", "", "getAndroidLink", "()Ljava/lang/String;", "setAndroidLink", "(Ljava/lang/String;)V", "icon", "getIcon", "setIcon", "darkIcon", "getDarkIcon", "setDarkIcon", "cornerMark", "getCornerMark", "setCornerMark", "darkCornerMark", "getDarkCornerMark", "setDarkCornerMark", "subhead", "getSubhead", "setSubhead", "title", "getTitle", "setTitle", "code", "getCode", "setCode", "iosLink", "getIosLink", "setIosLink", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillerBottomMenuBean {

    @Nullable
    private String androidLink;

    @Nullable
    private String code;

    @Nullable
    private String cornerMark;

    @Nullable
    private String darkCornerMark;

    @Nullable
    private String darkIcon;

    @Nullable
    private String icon;

    @Nullable
    private String iosLink;

    @Nullable
    private String subhead;

    @Nullable
    private String title;

    @Nullable
    public final String getAndroidLink() {
        return this.androidLink;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCornerMark() {
        return this.cornerMark;
    }

    @Nullable
    public final String getDarkCornerMark() {
        return this.darkCornerMark;
    }

    @Nullable
    public final String getDarkIcon() {
        return this.darkIcon;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getIosLink() {
        return this.iosLink;
    }

    @Nullable
    public final String getSubhead() {
        return this.subhead;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setAndroidLink(@Nullable String str) {
        this.androidLink = str;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setCornerMark(@Nullable String str) {
        this.cornerMark = str;
    }

    public final void setDarkCornerMark(@Nullable String str) {
        this.darkCornerMark = str;
    }

    public final void setDarkIcon(@Nullable String str) {
        this.darkIcon = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setIosLink(@Nullable String str) {
        this.iosLink = str;
    }

    public final void setSubhead(@Nullable String str) {
        this.subhead = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
