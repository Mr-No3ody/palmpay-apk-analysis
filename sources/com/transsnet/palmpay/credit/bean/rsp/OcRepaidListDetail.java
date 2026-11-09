package com.transsnet.palmpay.credit.bean.rsp;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b$\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010(\u001a\u0004\b*\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010(\u001a\u0004\b-\u0010'R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b.\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b0\u0010\u001bR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010(\u001a\u0004\b1\u0010'¨\u00062"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/OcRepaidListDetail;", "", "amount", "", "billId", "bizDesc", "", "cardNo", "createTime", FirebaseAnalytics.Param.CURRENCY, "merchantName", "merchantNo", "msg", "operationType", "", "pageNum", "pageSize", "payId", "reference", "status", "updateTime", "installmentOrderNo", "repaymentDateStamp", "installmentType", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBillId", "getBizDesc", "()Ljava/lang/String;", "getCardNo", "getCreateTime", "getCurrency", "getMerchantName", "getMerchantNo", "getMsg", "getOperationType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageNum", "getPageSize", "getPayId", "getReference", "getStatus", "getUpdateTime", "getInstallmentOrderNo", "getRepaymentDateStamp", "getInstallmentType", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepaidListDetail {

    @Nullable
    private final Long amount;

    @Nullable
    private final Long billId;

    @Nullable
    private final String bizDesc;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Long createTime;

    @Nullable
    private final String currency;

    @Nullable
    private final String installmentOrderNo;

    @Nullable
    private final Integer installmentType;

    @Nullable
    private final String merchantName;

    @Nullable
    private final String merchantNo;

    @Nullable
    private final String msg;

    @Nullable
    private final Integer operationType;

    @Nullable
    private final Integer pageNum;

    @Nullable
    private final Integer pageSize;

    @Nullable
    private final String payId;

    @Nullable
    private final String reference;

    @Nullable
    private final Long repaymentDateStamp;

    @Nullable
    private final Integer status;

    @Nullable
    private final Long updateTime;

    public OcRepaidListDetail(@Nullable Long l5, @Nullable Long l6, @Nullable String str, @Nullable String str2, @Nullable Long l8, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str7, @Nullable String str8, @Nullable Integer num4, @Nullable Long l10, @Nullable String str9, @Nullable Long l11, @Nullable Integer num5) {
        this.amount = l5;
        this.billId = l6;
        this.bizDesc = str;
        this.cardNo = str2;
        this.createTime = l8;
        this.currency = str3;
        this.merchantName = str4;
        this.merchantNo = str5;
        this.msg = str6;
        this.operationType = num;
        this.pageNum = num2;
        this.pageSize = num3;
        this.payId = str7;
        this.reference = str8;
        this.status = num4;
        this.updateTime = l10;
        this.installmentOrderNo = str9;
        this.repaymentDateStamp = l11;
        this.installmentType = num5;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final Long getBillId() {
        return this.billId;
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
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getInstallmentOrderNo() {
        return this.installmentOrderNo;
    }

    @Nullable
    public final Integer getInstallmentType() {
        return this.installmentType;
    }

    @Nullable
    public final String getMerchantName() {
        return this.merchantName;
    }

    @Nullable
    public final String getMerchantNo() {
        return this.merchantNo;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final Integer getOperationType() {
        return this.operationType;
    }

    @Nullable
    public final Integer getPageNum() {
        return this.pageNum;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final String getPayId() {
        return this.payId;
    }

    @Nullable
    public final String getReference() {
        return this.reference;
    }

    @Nullable
    public final Long getRepaymentDateStamp() {
        return this.repaymentDateStamp;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }
}
