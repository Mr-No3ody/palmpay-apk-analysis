package com.transsnet.palmpay.teller.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/BettingAcmountItemData;", "", "<init>", "()V", "amountOption", "", "getAmountOption", "()Ljava/lang/Long;", "setAmountOption", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "amountId", "", "getAmountId", "()Ljava/lang/String;", "setAmountId", "(Ljava/lang/String;)V", "discountText", "getDiscountText", "setDiscountText", "cornerMarkUrl", "getCornerMarkUrl", "setCornerMarkUrl", "darkCornerMarkUrl", "getDarkCornerMarkUrl", "setDarkCornerMarkUrl", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingAcmountItemData {

    @Nullable
    private Long amountOption = 0L;

    @Nullable
    private String amountId = "";

    @Nullable
    private String discountText = "";

    @Nullable
    private String cornerMarkUrl = "";

    @Nullable
    private String darkCornerMarkUrl = "";

    @Nullable
    public final String getAmountId() {
        return this.amountId;
    }

    @Nullable
    public final Long getAmountOption() {
        return this.amountOption;
    }

    @Nullable
    public final String getCornerMarkUrl() {
        return this.cornerMarkUrl;
    }

    @Nullable
    public final String getDarkCornerMarkUrl() {
        return this.darkCornerMarkUrl;
    }

    @Nullable
    public final String getDiscountText() {
        return this.discountText;
    }

    public final void setAmountId(@Nullable String str) {
        this.amountId = str;
    }

    public final void setAmountOption(@Nullable Long l5) {
        this.amountOption = l5;
    }

    public final void setCornerMarkUrl(@Nullable String str) {
        this.cornerMarkUrl = str;
    }

    public final void setDarkCornerMarkUrl(@Nullable String str) {
        this.darkCornerMarkUrl = str;
    }

    public final void setDiscountText(@Nullable String str) {
        this.discountText = str;
    }
}
