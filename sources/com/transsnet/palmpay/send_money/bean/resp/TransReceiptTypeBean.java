package com.transsnet.palmpay.send_money.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/TransReceiptTypeBean;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "thumbnail", "getThumbnail", "setThumbnail", "ppThemeImage", "getPpThemeImage", "setPpThemeImage", "outThemeImage", "getOutThemeImage", "setOutThemeImage", "ppWatermarkImage", "getPpWatermarkImage", "setPpWatermarkImage", "outWatermarkImage", "getOutWatermarkImage", "setOutWatermarkImage", "wishes", "getWishes", "setWishes", "slogan", "getSlogan", "setSlogan", "amountTextColor", "getAmountTextColor", "setAmountTextColor", "otherTextColor", "getOtherTextColor", "setOtherTextColor", "isCheck", "", "()Z", "setCheck", "(Z)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransReceiptTypeBean {

    @Nullable
    private String amountTextColor;
    private boolean isCheck;

    @Nullable
    private String name;

    @Nullable
    private String otherTextColor;

    @Nullable
    private String outThemeImage;

    @Nullable
    private String outWatermarkImage;

    @Nullable
    private String ppThemeImage;

    @Nullable
    private String ppWatermarkImage;

    @Nullable
    private String slogan;

    @Nullable
    private String thumbnail;

    @Nullable
    private String wishes;

    @Nullable
    public final String getAmountTextColor() {
        return this.amountTextColor;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOtherTextColor() {
        return this.otherTextColor;
    }

    @Nullable
    public final String getOutThemeImage() {
        return this.outThemeImage;
    }

    @Nullable
    public final String getOutWatermarkImage() {
        return this.outWatermarkImage;
    }

    @Nullable
    public final String getPpThemeImage() {
        return this.ppThemeImage;
    }

    @Nullable
    public final String getPpWatermarkImage() {
        return this.ppWatermarkImage;
    }

    @Nullable
    public final String getSlogan() {
        return this.slogan;
    }

    @Nullable
    public final String getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    public final String getWishes() {
        return this.wishes;
    }

    /* JADX INFO: renamed from: isCheck, reason: from getter */
    public final boolean getIsCheck() {
        return this.isCheck;
    }

    public final void setAmountTextColor(@Nullable String str) {
        this.amountTextColor = str;
    }

    public final void setCheck(boolean z3) {
        this.isCheck = z3;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOtherTextColor(@Nullable String str) {
        this.otherTextColor = str;
    }

    public final void setOutThemeImage(@Nullable String str) {
        this.outThemeImage = str;
    }

    public final void setOutWatermarkImage(@Nullable String str) {
        this.outWatermarkImage = str;
    }

    public final void setPpThemeImage(@Nullable String str) {
        this.ppThemeImage = str;
    }

    public final void setPpWatermarkImage(@Nullable String str) {
        this.ppWatermarkImage = str;
    }

    public final void setSlogan(@Nullable String str) {
        this.slogan = str;
    }

    public final void setThumbnail(@Nullable String str) {
        this.thumbnail = str;
    }

    public final void setWishes(@Nullable String str) {
        this.wishes = str;
    }
}
