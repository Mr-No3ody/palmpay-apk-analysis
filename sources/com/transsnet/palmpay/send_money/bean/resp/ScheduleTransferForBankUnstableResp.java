package com.transsnet.palmpay.send_money.bean.resp;

import com.transsnet.palmpay.send_money.bean.ScheduleTransferPaymentBean;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR.\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\u001c\u0010!\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR\u001e\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010+\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)¨\u0006."}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableResp;", "", "<init>", "()V", "feeDesc", "", "getFeeDesc", "()Ljava/lang/String;", "setFeeDesc", "(Ljava/lang/String;)V", "tips", "getTips", "setTips", "processTime", "getProcessTime", "setProcessTime", "paymentList", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/send_money/bean/ScheduleTransferPaymentBean;", "Lkotlin/collections/ArrayList;", "getPaymentList", "()Ljava/util/ArrayList;", "setPaymentList", "(Ljava/util/ArrayList;)V", "topContent", "getTopContent", "setTopContent", "bottomContent", "getBottomContent", "setBottomContent", "bottomBoldContent", "getBottomBoldContent", "setBottomBoldContent", "iconUrl", "getIconUrl", "setIconUrl", "minAmount", "", "getMinAmount", "()Ljava/lang/Long;", "setMinAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "maxAmount", "getMaxAmount", "setMaxAmount", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTransferForBankUnstableResp {

    @Nullable
    private String bottomBoldContent;

    @Nullable
    private String bottomContent;

    @Nullable
    private String feeDesc;

    @Nullable
    private String iconUrl;

    @Nullable
    private Long maxAmount;

    @Nullable
    private Long minAmount;

    @Nullable
    private ArrayList<ScheduleTransferPaymentBean> paymentList;

    @Nullable
    private String processTime;

    @Nullable
    private String tips;

    @Nullable
    private String topContent;

    @Nullable
    public final String getBottomBoldContent() {
        return this.bottomBoldContent;
    }

    @Nullable
    public final String getBottomContent() {
        return this.bottomContent;
    }

    @Nullable
    public final String getFeeDesc() {
        return this.feeDesc;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final Long getMaxAmount() {
        return this.maxAmount;
    }

    @Nullable
    public final Long getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    public final ArrayList<ScheduleTransferPaymentBean> getPaymentList() {
        return this.paymentList;
    }

    @Nullable
    public final String getProcessTime() {
        return this.processTime;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    public final String getTopContent() {
        return this.topContent;
    }

    public final void setBottomBoldContent(@Nullable String str) {
        this.bottomBoldContent = str;
    }

    public final void setBottomContent(@Nullable String str) {
        this.bottomContent = str;
    }

    public final void setFeeDesc(@Nullable String str) {
        this.feeDesc = str;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setMaxAmount(@Nullable Long l5) {
        this.maxAmount = l5;
    }

    public final void setMinAmount(@Nullable Long l5) {
        this.minAmount = l5;
    }

    public final void setPaymentList(@Nullable ArrayList<ScheduleTransferPaymentBean> arrayList) {
        this.paymentList = arrayList;
    }

    public final void setProcessTime(@Nullable String str) {
        this.processTime = str;
    }

    public final void setTips(@Nullable String str) {
        this.tips = str;
    }

    public final void setTopContent(@Nullable String str) {
        this.topContent = str;
    }
}
