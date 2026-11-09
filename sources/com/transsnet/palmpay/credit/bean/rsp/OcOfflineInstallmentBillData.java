package com.transsnet.palmpay.credit.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001f\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b \u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/OcOfflineInstallmentBillData;", "", "cardNo", "", "installmentAmount", "", "installmentRepaymentPlanPOList", "", "Lcom/transsnet/palmpay/credit/bean/rsp/OfflineInstallmentRepaymentPlanPO;", "installmentServiceFee", "installmentTerm", "", "orderNo", "paidAmount", "unpaidAmount", "bizDesc", "payId", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getCardNo", "()Ljava/lang/String;", "getInstallmentAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInstallmentRepaymentPlanPOList", "()Ljava/util/List;", "getInstallmentServiceFee", "getInstallmentTerm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOrderNo", "getPaidAmount", "getUnpaidAmount", "getBizDesc", "getPayId", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcOfflineInstallmentBillData {

    @Nullable
    private final String bizDesc;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Long installmentAmount;

    @Nullable
    private final List<OfflineInstallmentRepaymentPlanPO> installmentRepaymentPlanPOList;

    @Nullable
    private final Long installmentServiceFee;

    @Nullable
    private final Integer installmentTerm;

    @Nullable
    private final String orderNo;

    @Nullable
    private final Long paidAmount;

    @Nullable
    private final String payId;

    @Nullable
    private final Long unpaidAmount;

    public OcOfflineInstallmentBillData(@Nullable String str, @Nullable Long l5, @Nullable List<OfflineInstallmentRepaymentPlanPO> list, @Nullable Long l6, @Nullable Integer num, @Nullable String str2, @Nullable Long l8, @Nullable Long l10, @Nullable String str3, @Nullable String str4) {
        this.cardNo = str;
        this.installmentAmount = l5;
        this.installmentRepaymentPlanPOList = list;
        this.installmentServiceFee = l6;
        this.installmentTerm = num;
        this.orderNo = str2;
        this.paidAmount = l8;
        this.unpaidAmount = l10;
        this.bizDesc = str3;
        this.payId = str4;
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
    public final Long getInstallmentAmount() {
        return this.installmentAmount;
    }

    @Nullable
    public final List<OfflineInstallmentRepaymentPlanPO> getInstallmentRepaymentPlanPOList() {
        return this.installmentRepaymentPlanPOList;
    }

    @Nullable
    public final Long getInstallmentServiceFee() {
        return this.installmentServiceFee;
    }

    @Nullable
    public final Integer getInstallmentTerm() {
        return this.installmentTerm;
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
    public final Long getUnpaidAmount() {
        return this.unpaidAmount;
    }
}
