package com.transsnet.palmpay.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/bean/CouponPackageOrderBean;", "", "orderNo", "", "memberId", "couponId", "", "orderStatus", "", "payerAccountType", "transType", "beneficiaryAccount", "beneficiaryName", "orderStatusDesc", "payAmount", "payId", "payFinishTime", "couponName", "payResultLinkUrl", "payResultBanner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Long;", "Ljava/lang/Integer;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CouponPackageOrderBean {

    @JvmField
    @Nullable
    public final String beneficiaryAccount;

    @JvmField
    @Nullable
    public final String beneficiaryName;

    @JvmField
    @Nullable
    public final Long couponId;

    @JvmField
    @Nullable
    public final String couponName;

    @JvmField
    @Nullable
    public final String memberId;

    @JvmField
    @Nullable
    public final String orderNo;

    @JvmField
    @Nullable
    public final Integer orderStatus;

    @JvmField
    @Nullable
    public final String orderStatusDesc;

    @JvmField
    @Nullable
    public final Long payAmount;

    @JvmField
    @Nullable
    public final Long payFinishTime;

    @JvmField
    @Nullable
    public final String payId;

    @JvmField
    @Nullable
    public final String payResultBanner;

    @JvmField
    @Nullable
    public final String payResultLinkUrl;

    @JvmField
    @Nullable
    public final Integer payerAccountType;

    @JvmField
    @Nullable
    public final String transType;

    public CouponPackageOrderBean(@Nullable String str, @Nullable String str2, @Nullable Long l5, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l6, @Nullable String str7, @Nullable Long l8, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.orderNo = str;
        this.memberId = str2;
        this.couponId = l5;
        this.orderStatus = num;
        this.payerAccountType = num2;
        this.transType = str3;
        this.beneficiaryAccount = str4;
        this.beneficiaryName = str5;
        this.orderStatusDesc = str6;
        this.payAmount = l6;
        this.payId = str7;
        this.payFinishTime = l8;
        this.couponName = str8;
        this.payResultLinkUrl = str9;
        this.payResultBanner = str10;
    }
}
