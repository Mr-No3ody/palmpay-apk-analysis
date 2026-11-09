package com.transsnet.palmpay.credit.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/OcBillInstallmentBillData;", "", "bizDesc", "", "cardNo", "orderNo", "paidAmount", "", "payId", "spreadPrincipal", "spreadRepaymentPlanList", "", "Lcom/transsnet/palmpay/credit/bean/rsp/BillSpreadRepaymentPlan;", "spreadServiceFee", "spreadTerm", "", "unpaidAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;)V", "getBizDesc", "()Ljava/lang/String;", "getCardNo", "getOrderNo", "getPaidAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPayId", "getSpreadPrincipal", "getSpreadRepaymentPlanList", "()Ljava/util/List;", "getSpreadServiceFee", "getSpreadTerm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnpaidAmount", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcBillInstallmentBillData {

    @Nullable
    private final String bizDesc;

    @Nullable
    private final String cardNo;

    @Nullable
    private final String orderNo;

    @Nullable
    private final Long paidAmount;

    @Nullable
    private final String payId;

    @Nullable
    private final Long spreadPrincipal;

    @Nullable
    private final List<BillSpreadRepaymentPlan> spreadRepaymentPlanList;

    @Nullable
    private final Long spreadServiceFee;

    @Nullable
    private final Integer spreadTerm;

    @Nullable
    private final Long unpaidAmount;

    public OcBillInstallmentBillData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l5, @Nullable String str4, @Nullable Long l6, @Nullable List<BillSpreadRepaymentPlan> list, @Nullable Long l8, @Nullable Integer num, @Nullable Long l10) {
        this.bizDesc = str;
        this.cardNo = str2;
        this.orderNo = str3;
        this.paidAmount = l5;
        this.payId = str4;
        this.spreadPrincipal = l6;
        this.spreadRepaymentPlanList = list;
        this.spreadServiceFee = l8;
        this.spreadTerm = num;
        this.unpaidAmount = l10;
    }

    @Nullable
    public final String getBizDesc() {
        return this.bizDesc;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final Long getPaidAmount() {
        return this.paidAmount;
    }

    @Nullable
    public final String getPayId() {
        return this.payId;
    }

    @Nullable
    public final Long getSpreadPrincipal() {
        return this.spreadPrincipal;
    }

    @Nullable
    public final List<BillSpreadRepaymentPlan> getSpreadRepaymentPlanList() {
        return this.spreadRepaymentPlanList;
    }

    @Nullable
    public final Long getSpreadServiceFee() {
        return this.spreadServiceFee;
    }

    @Nullable
    public final Integer getSpreadTerm() {
        return this.spreadTerm;
    }

    @Nullable
    public final Long getUnpaidAmount() {
        return this.unpaidAmount;
    }
}
