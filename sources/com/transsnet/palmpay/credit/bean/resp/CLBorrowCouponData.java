package com.transsnet.palmpay.credit.bean.resp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \\2\u00020\u0001:\u0001\\BÝ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\f\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\t\u0012\b\u0010%\u001a\u0004\u0018\u00010\f\u0012\b\u0010&\u001a\u0004\u0018\u00010\t\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b(\u0010)B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020+¢\u0006\u0004\b(\u0010,J\u0018\u0010X\u001a\u00020Y2\u0006\u0010*\u001a\u00020+2\u0006\u0010Z\u001a\u00020\tH\u0016J\b\u0010[\u001a\u00020\tH\u0016R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00108\u001a\u0004\b9\u00107R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010<\u001a\u0004\b=\u0010;R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u00103R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010<\u001a\u0004\bA\u0010;R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u00103R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u00103R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00108\u001a\u0004\bD\u00107R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00108\u001a\u0004\bE\u00107R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010<\u001a\u0004\bF\u0010;R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u00103R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010<\u001a\u0004\bH\u0010;R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u00103R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u00103R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u00103R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u00103R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010<\u001a\u0004\bM\u0010;R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u00103R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u00103R\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u00103R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u00103R\u0015\u0010\"\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010<\u001a\u0004\bR\u0010;R\u0013\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u00103R\u0015\u0010$\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00108\u001a\u0004\bT\u00107R\u0015\u0010%\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010<\u001a\u0004\bU\u0010;R\u0015\u0010&\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00108\u001a\u0004\bV\u00107R\u0013\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bW\u00103¨\u0006]"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowCouponData;", "Landroid/os/Parcelable;", "expend", "", "actName", "", "actNo", "androidLinkUrl", "appSource", "", "busRes", "consumeAmt", "", "consumeTime", "couponCode", "couponDesc", "couponIcon", "couponId", "couponName", "couponSubhead", "discountType", "deductionExpenses", "endTime", "iosLinkUrl", "limitAmt", "limitMerchantNo", "limitMicroPartner", "limitStores", "limitType", "nominaValue", "phone", "reqSn", "ruleDescription", "spuCode", "startTime", "status", "useLimitType", "actualDiscountAmount", "couponDiscountInfo", "couponType", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getExpend", "()Ljava/lang/Boolean;", "setExpend", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getActName", "()Ljava/lang/String;", "getActNo", "getAndroidLinkUrl", "getAppSource", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBusRes", "getConsumeAmt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getConsumeTime", "getCouponCode", "getCouponDesc", "getCouponIcon", "getCouponId", "getCouponName", "getCouponSubhead", "getDiscountType", "getDeductionExpenses", "getEndTime", "getIosLinkUrl", "getLimitAmt", "getLimitMerchantNo", "getLimitMicroPartner", "getLimitStores", "getLimitType", "getNominaValue", "getPhone", "getReqSn", "getRuleDescription", "getSpuCode", "getStartTime", "getStatus", "getUseLimitType", "getActualDiscountAmount", "getCouponDiscountInfo", "getCouponType", "writeToParcel", "", "flags", "describeContents", "CREATOR", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLBorrowCouponData implements Parcelable {
    public static final int CL_BORROW_COUPON_FREE_DAYS = 1;
    public static final int CL_BORROW_COUPON_RATE = 2;

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String actName;

    @Nullable
    private final String actNo;

    @Nullable
    private final Long actualDiscountAmount;

    @Nullable
    private final String androidLinkUrl;

    @Nullable
    private final Integer appSource;

    @Nullable
    private final Integer busRes;

    @Nullable
    private final Long consumeAmt;

    @Nullable
    private final Long consumeTime;

    @Nullable
    private final String couponCode;

    @Nullable
    private final String couponDesc;

    @Nullable
    private final Integer couponDiscountInfo;

    @Nullable
    private final String couponIcon;

    @Nullable
    private final Long couponId;

    @Nullable
    private final String couponName;

    @Nullable
    private final String couponSubhead;

    @Nullable
    private final String couponType;

    @Nullable
    private final Integer deductionExpenses;

    @Nullable
    private final Integer discountType;

    @Nullable
    private final Long endTime;

    @Nullable
    private Boolean expend;

    @Nullable
    private final String iosLinkUrl;

    @Nullable
    private final Long limitAmt;

    @Nullable
    private final String limitMerchantNo;

    @Nullable
    private final String limitMicroPartner;

    @Nullable
    private final String limitStores;

    @Nullable
    private final String limitType;

    @Nullable
    private final Long nominaValue;

    @Nullable
    private final String phone;

    @Nullable
    private final String reqSn;

    @Nullable
    private final String ruleDescription;

    @Nullable
    private final String spuCode;

    @Nullable
    private final Long startTime;

    @Nullable
    private final String status;

    @Nullable
    private final Integer useLimitType;

    /* JADX INFO: renamed from: com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u001d\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowCouponData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowCouponData;", "<init>", "()V", "CL_BORROW_COUPON_FREE_DAYS", "", "CL_BORROW_COUPON_RATE", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "(I)[Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowCouponData;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CLBorrowCouponData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CLBorrowCouponData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CLBorrowCouponData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CLBorrowCouponData[] newArray(int size) {
            return new CLBorrowCouponData[size];
        }
    }

    public CLBorrowCouponData(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l5, @Nullable Long l6, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l8, @Nullable String str7, @Nullable String str8, @Nullable Integer num3, @Nullable Integer num4, @Nullable Long l10, @Nullable String str9, @Nullable Long l11, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Long l12, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable Long l13, @Nullable String str18, @Nullable Integer num5, @Nullable Long l14, @Nullable Integer num6, @Nullable String str19) {
        this.expend = bool;
        this.actName = str;
        this.actNo = str2;
        this.androidLinkUrl = str3;
        this.appSource = num;
        this.busRes = num2;
        this.consumeAmt = l5;
        this.consumeTime = l6;
        this.couponCode = str4;
        this.couponDesc = str5;
        this.couponIcon = str6;
        this.couponId = l8;
        this.couponName = str7;
        this.couponSubhead = str8;
        this.discountType = num3;
        this.deductionExpenses = num4;
        this.endTime = l10;
        this.iosLinkUrl = str9;
        this.limitAmt = l11;
        this.limitMerchantNo = str10;
        this.limitMicroPartner = str11;
        this.limitStores = str12;
        this.limitType = str13;
        this.nominaValue = l12;
        this.phone = str14;
        this.reqSn = str15;
        this.ruleDescription = str16;
        this.spuCode = str17;
        this.startTime = l13;
        this.status = str18;
        this.useLimitType = num5;
        this.actualDiscountAmount = l14;
        this.couponDiscountInfo = num6;
        this.couponType = str19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getActName() {
        return this.actName;
    }

    @Nullable
    public final String getActNo() {
        return this.actNo;
    }

    @Nullable
    public final Long getActualDiscountAmount() {
        return this.actualDiscountAmount;
    }

    @Nullable
    public final String getAndroidLinkUrl() {
        return this.androidLinkUrl;
    }

    @Nullable
    public final Integer getAppSource() {
        return this.appSource;
    }

    @Nullable
    public final Integer getBusRes() {
        return this.busRes;
    }

    @Nullable
    public final Long getConsumeAmt() {
        return this.consumeAmt;
    }

    @Nullable
    public final Long getConsumeTime() {
        return this.consumeTime;
    }

    @Nullable
    public final String getCouponCode() {
        return this.couponCode;
    }

    @Nullable
    public final String getCouponDesc() {
        return this.couponDesc;
    }

    @Nullable
    public final Integer getCouponDiscountInfo() {
        return this.couponDiscountInfo;
    }

    @Nullable
    public final String getCouponIcon() {
        return this.couponIcon;
    }

    @Nullable
    public final Long getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final String getCouponName() {
        return this.couponName;
    }

    @Nullable
    public final String getCouponSubhead() {
        return this.couponSubhead;
    }

    @Nullable
    public final String getCouponType() {
        return this.couponType;
    }

    @Nullable
    public final Integer getDeductionExpenses() {
        return this.deductionExpenses;
    }

    @Nullable
    public final Integer getDiscountType() {
        return this.discountType;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Boolean getExpend() {
        return this.expend;
    }

    @Nullable
    public final String getIosLinkUrl() {
        return this.iosLinkUrl;
    }

    @Nullable
    public final Long getLimitAmt() {
        return this.limitAmt;
    }

    @Nullable
    public final String getLimitMerchantNo() {
        return this.limitMerchantNo;
    }

    @Nullable
    public final String getLimitMicroPartner() {
        return this.limitMicroPartner;
    }

    @Nullable
    public final String getLimitStores() {
        return this.limitStores;
    }

    @Nullable
    public final String getLimitType() {
        return this.limitType;
    }

    @Nullable
    public final Long getNominaValue() {
        return this.nominaValue;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getReqSn() {
        return this.reqSn;
    }

    @Nullable
    public final String getRuleDescription() {
        return this.ruleDescription;
    }

    @Nullable
    public final String getSpuCode() {
        return this.spuCode;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getUseLimitType() {
        return this.useLimitType;
    }

    public final void setExpend(@Nullable Boolean bool) {
        this.expend = bool;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.expend);
        parcel.writeString(this.actName);
        parcel.writeString(this.actNo);
        parcel.writeString(this.androidLinkUrl);
        parcel.writeValue(this.appSource);
        parcel.writeValue(this.busRes);
        parcel.writeValue(this.consumeAmt);
        parcel.writeValue(this.consumeTime);
        parcel.writeString(this.couponCode);
        parcel.writeString(this.couponDesc);
        parcel.writeString(this.couponIcon);
        parcel.writeValue(this.couponId);
        parcel.writeString(this.couponName);
        parcel.writeString(this.couponSubhead);
        parcel.writeValue(this.discountType);
        parcel.writeValue(this.deductionExpenses);
        parcel.writeValue(this.endTime);
        parcel.writeString(this.iosLinkUrl);
        parcel.writeValue(this.limitAmt);
        parcel.writeString(this.limitMerchantNo);
        parcel.writeString(this.limitMicroPartner);
        parcel.writeString(this.limitStores);
        parcel.writeString(this.limitType);
        parcel.writeValue(this.nominaValue);
        parcel.writeString(this.phone);
        parcel.writeString(this.reqSn);
        parcel.writeString(this.ruleDescription);
        parcel.writeString(this.spuCode);
        parcel.writeValue(this.startTime);
        parcel.writeString(this.status);
        parcel.writeValue(this.useLimitType);
        parcel.writeValue(this.actualDiscountAmount);
        parcel.writeValue(this.couponDiscountInfo);
        parcel.writeString(this.couponType);
    }

    public /* synthetic */ CLBorrowCouponData(Boolean bool, String str, String str2, String str3, Integer num, Integer num2, Long l5, Long l6, String str4, String str5, String str6, Long l8, String str7, String str8, Integer num3, Integer num4, Long l10, String str9, Long l11, String str10, String str11, String str12, String str13, Long l12, String str14, String str15, String str16, String str17, Long l13, String str18, Integer num5, Long l14, Integer num6, String str19, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? Boolean.FALSE : bool, str, str2, str3, num, num2, l5, l6, str4, str5, str6, l8, str7, str8, num3, num4, l10, str9, l11, str10, str11, str12, str13, l12, str14, str15, str16, str17, l13, str18, num5, l14, num6, str19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CLBorrowCouponData(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Object value = parcel.readValue(Boolean.TYPE.getClassLoader());
        Boolean bool = value instanceof Boolean ? (Boolean) value : null;
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        Class cls = Integer.TYPE;
        Object value2 = parcel.readValue(cls.getClassLoader());
        Integer num = value2 instanceof Integer ? (Integer) value2 : null;
        Object value3 = parcel.readValue(cls.getClassLoader());
        Integer num2 = value3 instanceof Integer ? (Integer) value3 : null;
        Class cls2 = Long.TYPE;
        Object value4 = parcel.readValue(cls2.getClassLoader());
        Long l5 = value4 instanceof Long ? (Long) value4 : null;
        Object value5 = parcel.readValue(cls2.getClassLoader());
        Long l6 = value5 instanceof Long ? (Long) value5 : null;
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        Object value6 = parcel.readValue(cls2.getClassLoader());
        Long l8 = value6 instanceof Long ? (Long) value6 : null;
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        Object value7 = parcel.readValue(cls.getClassLoader());
        Integer num3 = value7 instanceof Integer ? (Integer) value7 : null;
        Object value8 = parcel.readValue(cls.getClassLoader());
        Integer num4 = value8 instanceof Integer ? (Integer) value8 : null;
        Object value9 = parcel.readValue(cls2.getClassLoader());
        Integer num5 = num4;
        Long l10 = value9 instanceof Long ? (Long) value9 : null;
        String string9 = parcel.readString();
        Object value10 = parcel.readValue(cls2.getClassLoader());
        Long l11 = l10;
        Long l12 = value10 instanceof Long ? (Long) value10 : null;
        String string10 = parcel.readString();
        String string11 = parcel.readString();
        String string12 = parcel.readString();
        String string13 = parcel.readString();
        Object value11 = parcel.readValue(cls2.getClassLoader());
        Long l13 = l12;
        Long l14 = value11 instanceof Long ? (Long) value11 : null;
        String string14 = parcel.readString();
        String string15 = parcel.readString();
        String string16 = parcel.readString();
        String string17 = parcel.readString();
        Object value12 = parcel.readValue(cls2.getClassLoader());
        Long l15 = l14;
        Long l16 = value12 instanceof Long ? (Long) value12 : null;
        String string18 = parcel.readString();
        Object value13 = parcel.readValue(cls.getClassLoader());
        Long l17 = l16;
        Integer num6 = value13 instanceof Integer ? (Integer) value13 : null;
        Object value14 = parcel.readValue(cls2.getClassLoader());
        Integer num7 = num6;
        Long l18 = value14 instanceof Long ? (Long) value14 : null;
        Object value15 = parcel.readValue(cls.getClassLoader());
        this(bool, string, string2, string3, num, num2, l5, l6, string4, string5, string6, l8, string7, string8, num3, num5, l11, string9, l13, string10, string11, string12, string13, l15, string14, string15, string16, string17, l17, string18, num7, l18, value15 instanceof Integer ? (Integer) value15 : null, parcel.readString());
    }
}
