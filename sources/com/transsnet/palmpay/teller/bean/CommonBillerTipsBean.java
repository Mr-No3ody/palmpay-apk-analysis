package com.transsnet.palmpay.teller.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/CommonBillerTipsBean;", "", "<init>", "()V", "billerId", "", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "billerName", "getBillerName", "setBillerName", "billerTipsDto", "Lcom/transsnet/palmpay/teller/bean/CommonBillerTipsBean$BillerTips;", "getBillerTipsDto", "()Lcom/transsnet/palmpay/teller/bean/CommonBillerTipsBean$BillerTips;", "setBillerTipsDto", "(Lcom/transsnet/palmpay/teller/bean/CommonBillerTipsBean$BillerTips;)V", "BillerTips", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommonBillerTipsBean {

    @Nullable
    private String billerId;

    @Nullable
    private String billerName;

    @Nullable
    private BillerTips billerTipsDto;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/CommonBillerTipsBean$BillerTips;", "", "<init>", "()V", "userGroup", "", "getUserGroup", "()Ljava/lang/String;", "setUserGroup", "(Ljava/lang/String;)V", "icon", "getIcon", "setIcon", "darkIcon", "getDarkIcon", "setDarkIcon", "tipsText", "getTipsText", "setTipsText", "fontColor", "getFontColor", "setFontColor", "androidLink", "getAndroidLink", "setAndroidLink", "iosLink", "getIosLink", "setIosLink", "h5Link", "getH5Link", "setH5Link", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BillerTips {

        @Nullable
        private String androidLink;

        @Nullable
        private String darkIcon;

        @Nullable
        private String fontColor;

        @Nullable
        private String h5Link;

        @Nullable
        private String icon;

        @Nullable
        private String iosLink;

        @Nullable
        private String tipsText;

        @Nullable
        private String userGroup;

        @Nullable
        public final String getAndroidLink() {
            return this.androidLink;
        }

        @Nullable
        public final String getDarkIcon() {
            return this.darkIcon;
        }

        @Nullable
        public final String getFontColor() {
            return this.fontColor;
        }

        @Nullable
        public final String getH5Link() {
            return this.h5Link;
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
        public final String getTipsText() {
            return this.tipsText;
        }

        @Nullable
        public final String getUserGroup() {
            return this.userGroup;
        }

        public final void setAndroidLink(@Nullable String str) {
            this.androidLink = str;
        }

        public final void setDarkIcon(@Nullable String str) {
            this.darkIcon = str;
        }

        public final void setFontColor(@Nullable String str) {
            this.fontColor = str;
        }

        public final void setH5Link(@Nullable String str) {
            this.h5Link = str;
        }

        public final void setIcon(@Nullable String str) {
            this.icon = str;
        }

        public final void setIosLink(@Nullable String str) {
            this.iosLink = str;
        }

        public final void setTipsText(@Nullable String str) {
            this.tipsText = str;
        }

        public final void setUserGroup(@Nullable String str) {
            this.userGroup = str;
        }
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final BillerTips getBillerTipsDto() {
        return this.billerTipsDto;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setBillerTipsDto(@Nullable BillerTips billerTips) {
        this.billerTipsDto = billerTips;
    }
}
