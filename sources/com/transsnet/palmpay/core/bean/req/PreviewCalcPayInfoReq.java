package com.transsnet.palmpay.core.bean.req;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.palmpay.core.base.BaseApplication;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/PreviewCalcPayInfoReq;", "", "<init>", "()V", "orderNo", "", "transType", "subTransTypeCode", "orderAmount", "", "Ljava/lang/Long;", "isRedeemPoint", "", "Ljava/lang/Boolean;", "isUseCoupon", "couponId", "orderType", "payType", "", "Ljava/lang/Integer;", "couponAmount", "payeeAccountType", "payerAccountType", "useDiscount", "useBonus", "usePayDiscount", "calculationExtInfo", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, FirebaseAnalytics.Param.CURRENCY, "buyEarlyRefundByTime", "combinationPaymentMethodFlag", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewCalcPayInfoReq {

    @JvmField
    public int buyEarlyRefundByTime;

    @JvmField
    @Nullable
    public String calculationExtInfo;

    @JvmField
    @Nullable
    public Boolean combinationPaymentMethodFlag;

    @JvmField
    @Nullable
    public final String countryCode;

    @JvmField
    @Nullable
    public Long couponAmount;

    @JvmField
    @Nullable
    public Long couponId;

    @JvmField
    @Nullable
    public final String currency;

    @JvmField
    @Nullable
    public Boolean isRedeemPoint;

    @JvmField
    @Nullable
    public Boolean isUseCoupon;

    @JvmField
    @Nullable
    public Long orderAmount = 0L;

    @JvmField
    @Nullable
    public String orderNo;

    @JvmField
    @Nullable
    public String orderType;

    @JvmField
    @Nullable
    public Integer payType;

    @JvmField
    @Nullable
    public String payeeAccountType;

    @JvmField
    @Nullable
    public String payerAccountType;

    @JvmField
    @Nullable
    public String subTransTypeCode;

    @JvmField
    @Nullable
    public String transType;

    @JvmField
    @Nullable
    public Boolean useBonus;

    @JvmField
    @Nullable
    public Boolean useDiscount;

    @JvmField
    @Nullable
    public Boolean usePayDiscount;

    public PreviewCalcPayInfoReq() {
        Boolean bool = Boolean.FALSE;
        this.isRedeemPoint = bool;
        this.isUseCoupon = bool;
        this.payType = 0;
        this.couponAmount = 0L;
        this.useDiscount = bool;
        this.useBonus = bool;
        this.usePayDiscount = bool;
        this.countryCode = BaseApplication.getCountryLocale();
        this.currency = BaseApplication.getCurrency();
        this.combinationPaymentMethodFlag = bool;
    }
}
