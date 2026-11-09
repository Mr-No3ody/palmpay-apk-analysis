package com.transsnet.palmpay.airtime.bean.rsp;

import com.transsnet.palmpay.airtime.bean.AirtimeSpecialRechargeItem;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR.\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeDefaultCashbackInfoDataBean;", "", "<init>", "()V", "billerId", "", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "tipsList", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeCashbackInfoDataBean;", "Lkotlin/collections/ArrayList;", "getTipsList", "()Ljava/util/ArrayList;", "setTipsList", "(Ljava/util/ArrayList;)V", "airtimeCustomizedSpotVO", "Lcom/transsnet/palmpay/airtime/bean/AirtimeSpecialRechargeItem;", "getAirtimeCustomizedSpotVO", "()Lcom/transsnet/palmpay/airtime/bean/AirtimeSpecialRechargeItem;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AirtimeDefaultCashbackInfoDataBean {

    @Nullable
    private final AirtimeSpecialRechargeItem airtimeCustomizedSpotVO;

    @Nullable
    private String billerId;

    @Nullable
    private ArrayList<AirtimeCashbackInfoDataBean> tipsList;

    @Nullable
    public final AirtimeSpecialRechargeItem getAirtimeCustomizedSpotVO() {
        return this.airtimeCustomizedSpotVO;
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final ArrayList<AirtimeCashbackInfoDataBean> getTipsList() {
        return this.tipsList;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setTipsList(@Nullable ArrayList<AirtimeCashbackInfoDataBean> arrayList) {
        this.tipsList = arrayList;
    }
}
