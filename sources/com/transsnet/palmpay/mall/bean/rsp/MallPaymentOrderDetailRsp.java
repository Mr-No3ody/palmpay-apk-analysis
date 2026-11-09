package com.transsnet.palmpay.mall.bean.rsp;

import C0.G;
import N8.q0;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003Jù\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u0003HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\rHÖ\u0001J\t\u0010<\u001a\u00020\u0006HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/transsnet/palmpay/mall/bean/rsp/MallPaymentOrderDetailRsp;", "", "createTime", "", "orderAmount", "orderNo", "", "paymentOrderNo", "payAmount", "payFee", "payId", "paySuccessTime", "payType", "", "payerAccountId", "payerAccountType", "payerBankCode", "payerBankName", "payerBankUrl", "payerCardNo", "platformFee", "platformVat", "returnPoint", "transType", "taxFee", "orderStatus", "orderStatusDesc", "errorMessage", "couponAmount", "<init>", "(JJLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;JILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JILjava/lang/String;Ljava/lang/String;J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "", "other", "hashCode", "toString", "module_mall_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MallPaymentOrderDetailRsp {

    @JvmField
    public final long couponAmount;

    @JvmField
    public final long createTime;

    @JvmField
    @NotNull
    public final String errorMessage;

    @JvmField
    public final long orderAmount;

    @JvmField
    @NotNull
    public final String orderNo;

    @JvmField
    public final int orderStatus;

    @JvmField
    @NotNull
    public final String orderStatusDesc;

    @JvmField
    public final long payAmount;

    @JvmField
    public final long payFee;

    @JvmField
    @NotNull
    public final String payId;

    @JvmField
    public final long paySuccessTime;

    @JvmField
    public final int payType;

    @JvmField
    @NotNull
    public final String payerAccountId;

    @JvmField
    public final int payerAccountType;

    @JvmField
    @NotNull
    public final String payerBankCode;

    @JvmField
    @NotNull
    public final String payerBankName;

    @JvmField
    @NotNull
    public final String payerBankUrl;

    @JvmField
    @NotNull
    public final String payerCardNo;

    @JvmField
    @NotNull
    public final String paymentOrderNo;

    @JvmField
    public final long platformFee;

    @JvmField
    public final long platformVat;

    @JvmField
    public final long returnPoint;

    @JvmField
    public final long taxFee;

    @JvmField
    @NotNull
    public final String transType;

    public MallPaymentOrderDetailRsp(long j6, long j10, @NotNull String orderNo, @NotNull String paymentOrderNo, long j11, long j12, @NotNull String payId, long j13, int i7, @NotNull String payerAccountId, int i10, @NotNull String payerBankCode, @NotNull String payerBankName, @NotNull String payerBankUrl, @NotNull String payerCardNo, long j14, long j15, long j16, @NotNull String transType, long j17, int i11, @NotNull String orderStatusDesc, @NotNull String errorMessage, long j18) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(paymentOrderNo, "paymentOrderNo");
        Intrinsics.checkNotNullParameter(payId, "payId");
        Intrinsics.checkNotNullParameter(payerAccountId, "payerAccountId");
        Intrinsics.checkNotNullParameter(payerBankCode, "payerBankCode");
        Intrinsics.checkNotNullParameter(payerBankName, "payerBankName");
        Intrinsics.checkNotNullParameter(payerBankUrl, "payerBankUrl");
        Intrinsics.checkNotNullParameter(payerCardNo, "payerCardNo");
        Intrinsics.checkNotNullParameter(transType, "transType");
        Intrinsics.checkNotNullParameter(orderStatusDesc, "orderStatusDesc");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.createTime = j6;
        this.orderAmount = j10;
        this.orderNo = orderNo;
        this.paymentOrderNo = paymentOrderNo;
        this.payAmount = j11;
        this.payFee = j12;
        this.payId = payId;
        this.paySuccessTime = j13;
        this.payType = i7;
        this.payerAccountId = payerAccountId;
        this.payerAccountType = i10;
        this.payerBankCode = payerBankCode;
        this.payerBankName = payerBankName;
        this.payerBankUrl = payerBankUrl;
        this.payerCardNo = payerCardNo;
        this.platformFee = j14;
        this.platformVat = j15;
        this.returnPoint = j16;
        this.transType = transType;
        this.taxFee = j17;
        this.orderStatus = i11;
        this.orderStatusDesc = orderStatusDesc;
        this.errorMessage = errorMessage;
        this.couponAmount = j18;
    }

    public static /* synthetic */ MallPaymentOrderDetailRsp copy$default(MallPaymentOrderDetailRsp mallPaymentOrderDetailRsp, long j6, long j10, String str, String str2, long j11, long j12, String str3, long j13, int i7, String str4, int i10, String str5, String str6, String str7, String str8, long j14, long j15, long j16, String str9, long j17, int i11, String str10, String str11, long j18, int i12, Object obj) {
        long j19;
        String str12;
        String str13;
        long j20 = (i12 & 1) != 0 ? mallPaymentOrderDetailRsp.createTime : j6;
        long j21 = (i12 & 2) != 0 ? mallPaymentOrderDetailRsp.orderAmount : j10;
        String str14 = (i12 & 4) != 0 ? mallPaymentOrderDetailRsp.orderNo : str;
        String str15 = (i12 & 8) != 0 ? mallPaymentOrderDetailRsp.paymentOrderNo : str2;
        long j22 = (i12 & 16) != 0 ? mallPaymentOrderDetailRsp.payAmount : j11;
        long j23 = (i12 & 32) != 0 ? mallPaymentOrderDetailRsp.payFee : j12;
        String str16 = (i12 & 64) != 0 ? mallPaymentOrderDetailRsp.payId : str3;
        long j24 = (i12 & 128) != 0 ? mallPaymentOrderDetailRsp.paySuccessTime : j13;
        int i13 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? mallPaymentOrderDetailRsp.payType : i7;
        long j25 = j20;
        String str17 = (i12 & 512) != 0 ? mallPaymentOrderDetailRsp.payerAccountId : str4;
        int i14 = (i12 & 1024) != 0 ? mallPaymentOrderDetailRsp.payerAccountType : i10;
        String str18 = str17;
        String str19 = (i12 & 2048) != 0 ? mallPaymentOrderDetailRsp.payerBankCode : str5;
        String str20 = (i12 & 4096) != 0 ? mallPaymentOrderDetailRsp.payerBankName : str6;
        String str21 = (i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? mallPaymentOrderDetailRsp.payerBankUrl : str7;
        String str22 = (i12 & 16384) != 0 ? mallPaymentOrderDetailRsp.payerCardNo : str8;
        long j26 = (i12 & 32768) != 0 ? mallPaymentOrderDetailRsp.platformFee : j14;
        long j27 = (i12 & 65536) != 0 ? mallPaymentOrderDetailRsp.platformVat : j15;
        long j28 = (i12 & 131072) != 0 ? mallPaymentOrderDetailRsp.returnPoint : j16;
        String str23 = (i12 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? mallPaymentOrderDetailRsp.transType : str9;
        long j29 = (i12 & 524288) != 0 ? mallPaymentOrderDetailRsp.taxFee : j17;
        int i15 = (i12 & 1048576) != 0 ? mallPaymentOrderDetailRsp.orderStatus : i11;
        String str24 = (i12 & 2097152) != 0 ? mallPaymentOrderDetailRsp.orderStatusDesc : str10;
        int i16 = i15;
        String str25 = (i12 & 4194304) != 0 ? mallPaymentOrderDetailRsp.errorMessage : str11;
        if ((i12 & 8388608) != 0) {
            str13 = str24;
            str12 = str25;
            j19 = mallPaymentOrderDetailRsp.couponAmount;
        } else {
            j19 = j18;
            str12 = str25;
            str13 = str24;
        }
        return mallPaymentOrderDetailRsp.copy(j25, j21, str14, str15, j22, j23, str16, j24, i13, str18, i14, str19, str20, str21, str22, j26, j27, j28, str23, j29, i16, str13, str12, j19);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPayerAccountId() {
        return this.payerAccountId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getPayerAccountType() {
        return this.payerAccountType;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPayerBankCode() {
        return this.payerBankCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPayerBankName() {
        return this.payerBankName;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPayerBankUrl() {
        return this.payerBankUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPayerCardNo() {
        return this.payerCardNo;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getPlatformFee() {
        return this.platformFee;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getPlatformVat() {
        return this.platformVat;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final long getReturnPoint() {
        return this.returnPoint;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getOrderAmount() {
        return this.orderAmount;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final long getTaxFee() {
        return this.taxFee;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getOrderStatus() {
        return this.orderStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getOrderStatusDesc() {
        return this.orderStatusDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final long getCouponAmount() {
        return this.couponAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentOrderNo() {
        return this.paymentOrderNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPayAmount() {
        return this.payAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getPayFee() {
        return this.payFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPayId() {
        return this.payId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getPaySuccessTime() {
        return this.paySuccessTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getPayType() {
        return this.payType;
    }

    @NotNull
    public final MallPaymentOrderDetailRsp copy(long createTime, long orderAmount, @NotNull String orderNo, @NotNull String paymentOrderNo, long payAmount, long payFee, @NotNull String payId, long paySuccessTime, int payType, @NotNull String payerAccountId, int payerAccountType, @NotNull String payerBankCode, @NotNull String payerBankName, @NotNull String payerBankUrl, @NotNull String payerCardNo, long platformFee, long platformVat, long returnPoint, @NotNull String transType, long taxFee, int orderStatus, @NotNull String orderStatusDesc, @NotNull String errorMessage, long couponAmount) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(paymentOrderNo, "paymentOrderNo");
        Intrinsics.checkNotNullParameter(payId, "payId");
        Intrinsics.checkNotNullParameter(payerAccountId, "payerAccountId");
        Intrinsics.checkNotNullParameter(payerBankCode, "payerBankCode");
        Intrinsics.checkNotNullParameter(payerBankName, "payerBankName");
        Intrinsics.checkNotNullParameter(payerBankUrl, "payerBankUrl");
        Intrinsics.checkNotNullParameter(payerCardNo, "payerCardNo");
        Intrinsics.checkNotNullParameter(transType, "transType");
        Intrinsics.checkNotNullParameter(orderStatusDesc, "orderStatusDesc");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new MallPaymentOrderDetailRsp(createTime, orderAmount, orderNo, paymentOrderNo, payAmount, payFee, payId, paySuccessTime, payType, payerAccountId, payerAccountType, payerBankCode, payerBankName, payerBankUrl, payerCardNo, platformFee, platformVat, returnPoint, transType, taxFee, orderStatus, orderStatusDesc, errorMessage, couponAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MallPaymentOrderDetailRsp)) {
            return false;
        }
        MallPaymentOrderDetailRsp mallPaymentOrderDetailRsp = (MallPaymentOrderDetailRsp) other;
        return this.createTime == mallPaymentOrderDetailRsp.createTime && this.orderAmount == mallPaymentOrderDetailRsp.orderAmount && Intrinsics.c(this.orderNo, mallPaymentOrderDetailRsp.orderNo) && Intrinsics.c(this.paymentOrderNo, mallPaymentOrderDetailRsp.paymentOrderNo) && this.payAmount == mallPaymentOrderDetailRsp.payAmount && this.payFee == mallPaymentOrderDetailRsp.payFee && Intrinsics.c(this.payId, mallPaymentOrderDetailRsp.payId) && this.paySuccessTime == mallPaymentOrderDetailRsp.paySuccessTime && this.payType == mallPaymentOrderDetailRsp.payType && Intrinsics.c(this.payerAccountId, mallPaymentOrderDetailRsp.payerAccountId) && this.payerAccountType == mallPaymentOrderDetailRsp.payerAccountType && Intrinsics.c(this.payerBankCode, mallPaymentOrderDetailRsp.payerBankCode) && Intrinsics.c(this.payerBankName, mallPaymentOrderDetailRsp.payerBankName) && Intrinsics.c(this.payerBankUrl, mallPaymentOrderDetailRsp.payerBankUrl) && Intrinsics.c(this.payerCardNo, mallPaymentOrderDetailRsp.payerCardNo) && this.platformFee == mallPaymentOrderDetailRsp.platformFee && this.platformVat == mallPaymentOrderDetailRsp.platformVat && this.returnPoint == mallPaymentOrderDetailRsp.returnPoint && Intrinsics.c(this.transType, mallPaymentOrderDetailRsp.transType) && this.taxFee == mallPaymentOrderDetailRsp.taxFee && this.orderStatus == mallPaymentOrderDetailRsp.orderStatus && Intrinsics.c(this.orderStatusDesc, mallPaymentOrderDetailRsp.orderStatusDesc) && Intrinsics.c(this.errorMessage, mallPaymentOrderDetailRsp.errorMessage) && this.couponAmount == mallPaymentOrderDetailRsp.couponAmount;
    }

    public int hashCode() {
        return Long.hashCode(this.couponAmount) + G.c(G.c(u.b(this.orderStatus, q0.b(G.c(q0.b(q0.b(q0.b(G.c(G.c(G.c(G.c(u.b(this.payerAccountType, G.c(u.b(this.payType, q0.b(G.c(q0.b(q0.b(G.c(G.c(q0.b(Long.hashCode(this.createTime) * 31, 31, this.orderAmount), 31, this.orderNo), 31, this.paymentOrderNo), 31, this.payAmount), 31, this.payFee), 31, this.payId), 31, this.paySuccessTime), 31), 31, this.payerAccountId), 31), 31, this.payerBankCode), 31, this.payerBankName), 31, this.payerBankUrl), 31, this.payerCardNo), 31, this.platformFee), 31, this.platformVat), 31, this.returnPoint), 31, this.transType), 31, this.taxFee), 31), 31, this.orderStatusDesc), 31, this.errorMessage);
    }

    @NotNull
    public String toString() {
        long j6 = this.createTime;
        long j10 = this.orderAmount;
        String str = this.orderNo;
        String str2 = this.paymentOrderNo;
        long j11 = this.payAmount;
        long j12 = this.payFee;
        String str3 = this.payId;
        long j13 = this.paySuccessTime;
        int i7 = this.payType;
        String str4 = this.payerAccountId;
        int i10 = this.payerAccountType;
        String str5 = this.payerBankCode;
        String str6 = this.payerBankName;
        String str7 = this.payerBankUrl;
        String str8 = this.payerCardNo;
        long j14 = this.platformFee;
        long j15 = this.platformVat;
        long j16 = this.returnPoint;
        String str9 = this.transType;
        long j17 = this.taxFee;
        int i11 = this.orderStatus;
        String str10 = this.orderStatusDesc;
        String str11 = this.errorMessage;
        long j18 = this.couponAmount;
        StringBuilder sbR = u.r(j6, "MallPaymentOrderDetailRsp(createTime=", ", orderAmount=");
        sbR.append(j10);
        sbR.append(", orderNo=");
        sbR.append(str);
        u.w(sbR, ", paymentOrderNo=", str2, ", payAmount=");
        sbR.append(j11);
        u.v(sbR, ", payFee=", j12, ", payId=");
        sbR.append(str3);
        sbR.append(", paySuccessTime=");
        sbR.append(j13);
        sbR.append(", payType=");
        sbR.append(i7);
        sbR.append(", payerAccountId=");
        sbR.append(str4);
        sbR.append(", payerAccountType=");
        sbR.append(i10);
        sbR.append(", payerBankCode=");
        sbR.append(str5);
        u.x(sbR, ", payerBankName=", str6, ", payerBankUrl=", str7);
        u.w(sbR, ", payerCardNo=", str8, ", platformFee=");
        sbR.append(j14);
        u.v(sbR, ", platformVat=", j15, ", returnPoint=");
        sbR.append(j16);
        sbR.append(", transType=");
        sbR.append(str9);
        u.v(sbR, ", taxFee=", j17, ", orderStatus=");
        sbR.append(i11);
        sbR.append(", orderStatusDesc=");
        sbR.append(str10);
        sbR.append(", errorMessage=");
        sbR.append(str11);
        sbR.append(", couponAmount=");
        sbR.append(j18);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ MallPaymentOrderDetailRsp(long j6, long j10, String str, String str2, long j11, long j12, String str3, long j13, int i7, String str4, int i10, String str5, String str6, String str7, String str8, long j14, long j15, long j16, String str9, long j17, int i11, String str10, String str11, long j18, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j6, j10, str, str2, j11, j12, str3, j13, i7, str4, i10, str5, str6, str7, str8, j14, j15, j16, str9, j17, i11, str10, str11, (i12 & 8388608) != 0 ? 0L : j18);
    }
}
