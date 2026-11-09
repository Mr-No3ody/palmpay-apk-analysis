package com.transsnet.palmpay.airtime.bean;

import com.transsnet.palmpay.airtime.bean.rsp.AirtimeCashbackInfoDataBean;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/AirtimeExtraItemInfoBean;", "", "<init>", "()V", "billerId", "", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "itemTipsList", "", "Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeCashbackInfoDataBean;", "getItemTipsList", "()Ljava/util/List;", "airtimeCustomizedSpotVO", "Lcom/transsnet/palmpay/airtime/bean/AirtimeSpecialRechargeItem;", "getAirtimeCustomizedSpotVO", "()Lcom/transsnet/palmpay/airtime/bean/AirtimeSpecialRechargeItem;", "lastRechargeAmount", "", "getLastRechargeAmount", "()Ljava/lang/Long;", "setLastRechargeAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AirtimeExtraItemInfoBean {

    @Nullable
    private final AirtimeSpecialRechargeItem airtimeCustomizedSpotVO;

    @Nullable
    private String billerId;

    @Nullable
    private final List<AirtimeCashbackInfoDataBean> itemTipsList;

    @Nullable
    private Long lastRechargeAmount;

    @Nullable
    public final AirtimeSpecialRechargeItem getAirtimeCustomizedSpotVO() {
        return this.airtimeCustomizedSpotVO;
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final List<AirtimeCashbackInfoDataBean> getItemTipsList() {
        return this.itemTipsList;
    }

    @Nullable
    public final Long getLastRechargeAmount() {
        return this.lastRechargeAmount;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setLastRechargeAmount(@Nullable Long l5) {
        this.lastRechargeAmount = l5;
    }
}
