package com.transsnet.palmpay.airtime.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeCashbackInfoDataBean;", "", "<init>", "()V", "itemId", "", "getItemId", "()Ljava/lang/String;", "setItemId", "(Ljava/lang/String;)V", "network", "getNetwork", "setNetwork", "discountAmountText", "getDiscountAmountText", "setDiscountAmountText", "rewardsText", "getRewardsText", "setRewardsText", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AirtimeCashbackInfoDataBean {

    @Nullable
    private String discountAmountText;

    @Nullable
    private String itemId;

    @Nullable
    private String network;

    @Nullable
    private String rewardsText;

    @Nullable
    public final String getDiscountAmountText() {
        return this.discountAmountText;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getNetwork() {
        return this.network;
    }

    @Nullable
    public final String getRewardsText() {
        return this.rewardsText;
    }

    public final void setDiscountAmountText(@Nullable String str) {
        this.discountAmountText = str;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setNetwork(@Nullable String str) {
        this.network = str;
    }

    public final void setRewardsText(@Nullable String str) {
        this.rewardsText = str;
    }
}
