package com.transsnet.palmpay.core.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BÛ\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0006\u0012\u0006\u0010)\u001a\u00020\b\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010+\u001a\u00020\b\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00105\u001a\u00020\u0006\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00107\u001a\u00020\u0006\u0012\u0006\u00108\u001a\u00020\u0006\u0012\u0006\u00109\u001a\u00020\u0006\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010<\u001a\u00020\u0006\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010@\u001a\u00020\u0006\u0012\u0006\u0010A\u001a\u00020\u0006\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010D\u001a\u00020\b\u0012\b\u0010E\u001a\u0004\u0018\u00010F¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010+\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00105\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00107\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00108\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00109\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010<\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010@\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010A\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010C\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010D\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/transsnet/palmpay/core/bean/RequestMoneyCancelDataBean;", "", "status", "", "statusDesc", "amount", "", "businessType", "", "createTime", "deductAmount", "deductPoint", "expireTime", "flag", "orderId", "orderStatus", "orderStatusDesc", "originalOrderId", "payAmount", "payFee", "payType", "platformFee", "platformVat", "recipientAccountId", "recipientAmount", "recipientBankAccount", "recipientBankCode", "recipientBankName", "recipientBankUrl", "recipientFee", "recipientFirstName", "recipientMiddleName", "recipientHeadImage", "recipientLastName", "recipientMemberId", "recipientNickname", "recipientPhone", "recipientRemark", "faqLink", "recipientTaxFee", "redeemPoint", "refundFlag", "sendAccountId", "sendAccountType", "sendMemberId", "senderBankCard", "senderBankCode", "senderBankName", "senderBankUrl", "senderHeadImage", "senderNickname", "senderPhone", "senderRemark", "taxFee", "transScene", "updateTime", "recipientAddPoint", "recipientDeductPoint", "errorCode", "errorMessage", "returnAmount", "partnerName", "partnerPhone", "couponId", "couponAmount", "discountAmount", "pendingCouponRemark", "payId", "payerAccountType", "orderStatusInfo", "Lcom/transsnet/palmpay/core/bean/BillProcessDetail;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JIJJJJILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JJIJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;ILcom/transsnet/palmpay/core/bean/BillProcessDetail;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestMoneyCancelDataBean {

    @JvmField
    public long amount;

    @JvmField
    public int businessType;

    @JvmField
    public long couponAmount;

    @JvmField
    @Nullable
    public String couponId;

    @JvmField
    public long createTime;

    @JvmField
    public long deductAmount;

    @JvmField
    public long deductPoint;

    @JvmField
    public long discountAmount;

    @JvmField
    @Nullable
    public String errorCode;

    @JvmField
    @Nullable
    public String errorMessage;

    @JvmField
    public long expireTime;

    @JvmField
    @Nullable
    public String faqLink;

    @JvmField
    public int flag;

    @JvmField
    @Nullable
    public String orderId;

    @JvmField
    public int orderStatus;

    @JvmField
    @Nullable
    public String orderStatusDesc;

    @JvmField
    @Nullable
    public BillProcessDetail orderStatusInfo;

    @JvmField
    @Nullable
    public String originalOrderId;

    @JvmField
    @Nullable
    public String partnerName;

    @JvmField
    @Nullable
    public String partnerPhone;

    @JvmField
    public long payAmount;

    @JvmField
    public long payFee;

    @JvmField
    @Nullable
    public String payId;

    @JvmField
    public int payType;

    @JvmField
    public int payerAccountType;

    @JvmField
    @Nullable
    public String pendingCouponRemark;

    @JvmField
    public long platformFee;

    @JvmField
    public long platformVat;

    @JvmField
    @Nullable
    public String recipientAccountId;

    @JvmField
    public long recipientAddPoint;

    @JvmField
    public long recipientAmount;

    @JvmField
    @Nullable
    public String recipientBankAccount;

    @JvmField
    @Nullable
    public String recipientBankCode;

    @JvmField
    @Nullable
    public String recipientBankName;

    @JvmField
    @Nullable
    public String recipientBankUrl;

    @JvmField
    public long recipientDeductPoint;

    @JvmField
    public long recipientFee;

    @JvmField
    @Nullable
    public String recipientFirstName;

    @JvmField
    @Nullable
    public String recipientHeadImage;

    @JvmField
    @Nullable
    public String recipientLastName;

    @JvmField
    @Nullable
    public String recipientMemberId;

    @JvmField
    @Nullable
    public String recipientMiddleName;

    @JvmField
    @Nullable
    public String recipientNickname;

    @JvmField
    @Nullable
    public String recipientPhone;

    @JvmField
    @Nullable
    public String recipientRemark;

    @JvmField
    public long recipientTaxFee;

    @JvmField
    public long redeemPoint;

    @JvmField
    public int refundFlag;

    @JvmField
    public long returnAmount;

    @JvmField
    @Nullable
    public String sendAccountId;

    @JvmField
    public int sendAccountType;

    @JvmField
    @Nullable
    public String sendMemberId;

    @JvmField
    @Nullable
    public String senderBankCard;

    @JvmField
    @Nullable
    public String senderBankCode;

    @JvmField
    @Nullable
    public String senderBankName;

    @JvmField
    @Nullable
    public String senderBankUrl;

    @JvmField
    @Nullable
    public String senderHeadImage;

    @JvmField
    @Nullable
    public String senderNickname;

    @JvmField
    @Nullable
    public String senderPhone;

    @JvmField
    @Nullable
    public String senderRemark;

    @JvmField
    @Nullable
    public String status;

    @JvmField
    @Nullable
    public String statusDesc;

    @JvmField
    public long taxFee;

    @JvmField
    @Nullable
    public String transScene;

    @JvmField
    public long updateTime;

    public RequestMoneyCancelDataBean(@Nullable String str, @Nullable String str2, long j6, int i7, long j10, long j11, long j12, long j13, int i10, @Nullable String str3, int i11, @Nullable String str4, @Nullable String str5, long j14, long j15, int i12, long j16, long j17, @Nullable String str6, long j18, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, long j19, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, long j20, long j21, int i13, @Nullable String str20, int i14, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, long j22, @Nullable String str30, long j23, long j24, long j25, @Nullable String str31, @Nullable String str32, long j26, @Nullable String str33, @Nullable String str34, @Nullable String str35, long j27, long j28, @Nullable String str36, @Nullable String str37, int i15, @Nullable BillProcessDetail billProcessDetail) {
        this.status = str;
        this.statusDesc = str2;
        this.amount = j6;
        this.businessType = i7;
        this.createTime = j10;
        this.deductAmount = j11;
        this.deductPoint = j12;
        this.expireTime = j13;
        this.flag = i10;
        this.orderId = str3;
        this.orderStatus = i11;
        this.orderStatusDesc = str4;
        this.originalOrderId = str5;
        this.payAmount = j14;
        this.payFee = j15;
        this.payType = i12;
        this.platformFee = j16;
        this.platformVat = j17;
        this.recipientAccountId = str6;
        this.recipientAmount = j18;
        this.recipientBankAccount = str7;
        this.recipientBankCode = str8;
        this.recipientBankName = str9;
        this.recipientBankUrl = str10;
        this.recipientFee = j19;
        this.recipientFirstName = str11;
        this.recipientMiddleName = str12;
        this.recipientHeadImage = str13;
        this.recipientLastName = str14;
        this.recipientMemberId = str15;
        this.recipientNickname = str16;
        this.recipientPhone = str17;
        this.recipientRemark = str18;
        this.faqLink = str19;
        this.recipientTaxFee = j20;
        this.redeemPoint = j21;
        this.refundFlag = i13;
        this.sendAccountId = str20;
        this.sendAccountType = i14;
        this.sendMemberId = str21;
        this.senderBankCard = str22;
        this.senderBankCode = str23;
        this.senderBankName = str24;
        this.senderBankUrl = str25;
        this.senderHeadImage = str26;
        this.senderNickname = str27;
        this.senderPhone = str28;
        this.senderRemark = str29;
        this.taxFee = j22;
        this.transScene = str30;
        this.updateTime = j23;
        this.recipientAddPoint = j24;
        this.recipientDeductPoint = j25;
        this.errorCode = str31;
        this.errorMessage = str32;
        this.returnAmount = j26;
        this.partnerName = str33;
        this.partnerPhone = str34;
        this.couponId = str35;
        this.couponAmount = j27;
        this.discountAmount = j28;
        this.pendingCouponRemark = str36;
        this.payId = str37;
        this.payerAccountType = i15;
        this.orderStatusInfo = billProcessDetail;
    }
}
