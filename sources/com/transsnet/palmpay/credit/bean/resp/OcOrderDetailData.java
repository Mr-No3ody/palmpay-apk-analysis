package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b=\u0018\u00002\u00020\u0001Bó\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010,\u001a\u00020\u0007\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0007\u0012\b\u00101\u001a\u0004\u0018\u00010\u0005\u0012\b\u00102\u001a\u0004\u0018\u00010\u0005\u0012\b\u00103\u001a\u0004\u0018\u00010\u0005\u0012\b\u00104\u001a\u0004\u0018\u00010\u0005\u0012\b\u00105\u001a\u0004\u0018\u000106\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b8\u00109R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010<\u001a\u0004\bA\u0010;R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bF\u0010@R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bG\u0010@R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bH\u0010@R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bI\u0010@R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010>R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010<\u001a\u0004\bK\u0010;R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bL\u0010@R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bM\u0010@R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bN\u0010@R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bO\u0010@R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bP\u0010@R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010<\u001a\u0004\bQ\u0010;R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010<\u001a\u0004\bR\u0010;R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bS\u0010@R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bT\u0010@R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bU\u0010@R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bV\u0010@R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bW\u0010@R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bX\u0010@R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010<\u001a\u0004\bY\u0010;R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010@R\u0013\u0010 \u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b[\u0010@R\u0013\u0010!\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010@R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b]\u0010@R\u0013\u0010#\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b^\u0010@R\u0013\u0010$\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b_\u0010@R\u0013\u0010%\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b`\u0010@R\u0013\u0010&\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\ba\u0010@R\u0013\u0010'\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bb\u0010@R\u0013\u0010(\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bc\u0010@R\u0015\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010<\u001a\u0004\bd\u0010;R\u0011\u0010*\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\be\u0010>R\u0015\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010<\u001a\u0004\bf\u0010;R\u0011\u0010,\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bg\u0010@R\u0015\u0010-\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010E\u001a\u0004\bh\u0010DR\u0015\u0010.\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010E\u001a\u0004\bi\u0010DR\u0015\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010<\u001a\u0004\bj\u0010;R\u0013\u00100\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bk\u0010@R\u0015\u00101\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010E\u001a\u0004\bl\u0010DR\u0015\u00102\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010E\u001a\u0004\bm\u0010DR\u0015\u00103\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010E\u001a\u0004\bn\u0010DR\u0015\u00104\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010E\u001a\u0004\bo\u0010DR\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0015\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010<\u001a\u0004\br\u0010;¨\u0006s"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcOrderDetailData;", "", "accountType", "", "amount", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "approval_result", "authorizationCode", "billId", "bizDesc", "cardNo", "cause", "cid", "createTime", "credit_limit_postpay", FirebaseAnalytics.Param.CURRENCY, "decision_list", "decision_set", "decision_set_name", "errorMsg", "freeze_code", "freeze_time", "id", "inputParam", "merchantName", "merchantNo", "mobileNo", "msg", "operationType", "originOrderNo", "originPayId", "outputParam", "overpayAppId", "overpayMAccountId", "overpayMOrderNo", "overpayMerchantName", "overpayMerchantNo", "payId", "reference", "status", "updateTime", "verifyMethod", "payTypeName", "penalty", "extensionServiceFee", "installmentTerm", "installmentOrderNo", "interest", "overpaymentAmount", "principal", "repaymentAmount", "amountInfo", "Lcom/transsnet/palmpay/credit/bean/resp/TopUpOrderDetailRsp$DataBean$AmountInfoBean;", "settleStatus", "<init>", "(Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/transsnet/palmpay/credit/bean/resp/TopUpOrderDetailRsp$DataBean$AmountInfoBean;Ljava/lang/Integer;)V", "getAccountType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAmount", "()J", "getAppId", "()Ljava/lang/String;", "getApproval_result", "getAuthorizationCode", "getBillId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBizDesc", "getCardNo", "getCause", "getCid", "getCreateTime", "getCredit_limit_postpay", "getCurrency", "getDecision_list", "getDecision_set", "getDecision_set_name", "getErrorMsg", "getFreeze_code", "getFreeze_time", "getId", "getInputParam", "getMerchantName", "getMerchantNo", "getMobileNo", "getMsg", "getOperationType", "getOriginOrderNo", "getOriginPayId", "getOutputParam", "getOverpayAppId", "getOverpayMAccountId", "getOverpayMOrderNo", "getOverpayMerchantName", "getOverpayMerchantNo", "getPayId", "getReference", "getStatus", "getUpdateTime", "getVerifyMethod", "getPayTypeName", "getPenalty", "getExtensionServiceFee", "getInstallmentTerm", "getInstallmentOrderNo", "getInterest", "getOverpaymentAmount", "getPrincipal", "getRepaymentAmount", "getAmountInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/TopUpOrderDetailRsp$DataBean$AmountInfoBean;", "getSettleStatus", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcOrderDetailData {

    @Nullable
    private final Integer accountType;
    private final long amount;

    @Nullable
    private final TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfo;

    @Nullable
    private final String appId;

    @Nullable
    private final Integer approval_result;

    @Nullable
    private final String authorizationCode;

    @Nullable
    private final Long billId;

    @Nullable
    private final String bizDesc;

    @Nullable
    private final String cardNo;

    @Nullable
    private final String cause;

    @Nullable
    private final String cid;
    private final long createTime;

    @Nullable
    private final Integer credit_limit_postpay;

    @Nullable
    private final String currency;

    @Nullable
    private final String decision_list;

    @Nullable
    private final String decision_set;

    @Nullable
    private final String decision_set_name;

    @Nullable
    private final String errorMsg;

    @Nullable
    private final Long extensionServiceFee;

    @Nullable
    private final Integer freeze_code;

    @Nullable
    private final Integer freeze_time;

    @Nullable
    private final String id;

    @Nullable
    private final String inputParam;

    @Nullable
    private final String installmentOrderNo;

    @Nullable
    private final Integer installmentTerm;

    @Nullable
    private final Long interest;

    @Nullable
    private final String merchantName;

    @Nullable
    private final String merchantNo;

    @Nullable
    private final String mobileNo;

    @Nullable
    private final String msg;

    @Nullable
    private final Integer operationType;

    @Nullable
    private final String originOrderNo;

    @Nullable
    private final String originPayId;

    @Nullable
    private final String outputParam;

    @Nullable
    private final String overpayAppId;

    @Nullable
    private final String overpayMAccountId;

    @Nullable
    private final String overpayMOrderNo;

    @Nullable
    private final String overpayMerchantName;

    @Nullable
    private final String overpayMerchantNo;

    @Nullable
    private final Long overpaymentAmount;

    @Nullable
    private final String payId;

    @NotNull
    private final String payTypeName;

    @Nullable
    private final Long penalty;

    @Nullable
    private final Long principal;

    @Nullable
    private final String reference;

    @Nullable
    private final Long repaymentAmount;

    @Nullable
    private final Integer settleStatus;

    @Nullable
    private final Integer status;
    private final long updateTime;

    @Nullable
    private final Integer verifyMethod;

    public OcOrderDetailData(@Nullable Integer num, long j6, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable Long l5, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j10, @Nullable Integer num3, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable Integer num6, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable Integer num7, long j11, @Nullable Integer num8, @NotNull String payTypeName, @Nullable Long l6, @Nullable Long l8, @Nullable Integer num9, @Nullable String str28, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable TopUpOrderDetailRsp.DataBean.AmountInfoBean amountInfoBean, @Nullable Integer num10) {
        Intrinsics.checkNotNullParameter(payTypeName, "payTypeName");
        this.accountType = num;
        this.amount = j6;
        this.appId = str;
        this.approval_result = num2;
        this.authorizationCode = str2;
        this.billId = l5;
        this.bizDesc = str3;
        this.cardNo = str4;
        this.cause = str5;
        this.cid = str6;
        this.createTime = j10;
        this.credit_limit_postpay = num3;
        this.currency = str7;
        this.decision_list = str8;
        this.decision_set = str9;
        this.decision_set_name = str10;
        this.errorMsg = str11;
        this.freeze_code = num4;
        this.freeze_time = num5;
        this.id = str12;
        this.inputParam = str13;
        this.merchantName = str14;
        this.merchantNo = str15;
        this.mobileNo = str16;
        this.msg = str17;
        this.operationType = num6;
        this.originOrderNo = str18;
        this.originPayId = str19;
        this.outputParam = str20;
        this.overpayAppId = str21;
        this.overpayMAccountId = str22;
        this.overpayMOrderNo = str23;
        this.overpayMerchantName = str24;
        this.overpayMerchantNo = str25;
        this.payId = str26;
        this.reference = str27;
        this.status = num7;
        this.updateTime = j11;
        this.verifyMethod = num8;
        this.payTypeName = payTypeName;
        this.penalty = l6;
        this.extensionServiceFee = l8;
        this.installmentTerm = num9;
        this.installmentOrderNo = str28;
        this.interest = l10;
        this.overpaymentAmount = l11;
        this.principal = l12;
        this.repaymentAmount = l13;
        this.amountInfo = amountInfoBean;
        this.settleStatus = num10;
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    public final long getAmount() {
        return this.amount;
    }

    @Nullable
    public final TopUpOrderDetailRsp.DataBean.AmountInfoBean getAmountInfo() {
        return this.amountInfo;
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final Integer getApproval_result() {
        return this.approval_result;
    }

    @Nullable
    public final String getAuthorizationCode() {
        return this.authorizationCode;
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
    public final String getCause() {
        return this.cause;
    }

    @Nullable
    public final String getCid() {
        return this.cid;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final Integer getCredit_limit_postpay() {
        return this.credit_limit_postpay;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDecision_list() {
        return this.decision_list;
    }

    @Nullable
    public final String getDecision_set() {
        return this.decision_set;
    }

    @Nullable
    public final String getDecision_set_name() {
        return this.decision_set_name;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final Long getExtensionServiceFee() {
        return this.extensionServiceFee;
    }

    @Nullable
    public final Integer getFreeze_code() {
        return this.freeze_code;
    }

    @Nullable
    public final Integer getFreeze_time() {
        return this.freeze_time;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getInputParam() {
        return this.inputParam;
    }

    @Nullable
    public final String getInstallmentOrderNo() {
        return this.installmentOrderNo;
    }

    @Nullable
    public final Integer getInstallmentTerm() {
        return this.installmentTerm;
    }

    @Nullable
    public final Long getInterest() {
        return this.interest;
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
    public final String getMobileNo() {
        return this.mobileNo;
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
    public final String getOriginOrderNo() {
        return this.originOrderNo;
    }

    @Nullable
    public final String getOriginPayId() {
        return this.originPayId;
    }

    @Nullable
    public final String getOutputParam() {
        return this.outputParam;
    }

    @Nullable
    public final String getOverpayAppId() {
        return this.overpayAppId;
    }

    @Nullable
    public final String getOverpayMAccountId() {
        return this.overpayMAccountId;
    }

    @Nullable
    public final String getOverpayMOrderNo() {
        return this.overpayMOrderNo;
    }

    @Nullable
    public final String getOverpayMerchantName() {
        return this.overpayMerchantName;
    }

    @Nullable
    public final String getOverpayMerchantNo() {
        return this.overpayMerchantNo;
    }

    @Nullable
    public final Long getOverpaymentAmount() {
        return this.overpaymentAmount;
    }

    @Nullable
    public final String getPayId() {
        return this.payId;
    }

    @NotNull
    public final String getPayTypeName() {
        return this.payTypeName;
    }

    @Nullable
    public final Long getPenalty() {
        return this.penalty;
    }

    @Nullable
    public final Long getPrincipal() {
        return this.principal;
    }

    @Nullable
    public final String getReference() {
        return this.reference;
    }

    @Nullable
    public final Long getRepaymentAmount() {
        return this.repaymentAmount;
    }

    @Nullable
    public final Integer getSettleStatus() {
        return this.settleStatus;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final Integer getVerifyMethod() {
        return this.verifyMethod;
    }
}
