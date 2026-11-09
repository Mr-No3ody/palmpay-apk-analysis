package com.flexibank.sdk.cashier.bean;

import C0.G;
import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0092\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R$\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R$\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R$\u0010\"\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR$\u00102\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)\"\u0004\b4\u0010+R$\u00105\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u000e\u001a\u0004\b6\u0010\u0010\"\u0004\b7\u0010\u0012R$\u00108\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u000e\u001a\u0004\b9\u0010\u0010\"\u0004\b:\u0010\u0012R$\u0010;\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR$\u0010>\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u000e\u001a\u0004\b?\u0010\u0010\"\u0004\b@\u0010\u0012R$\u0010A\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\bR$\u0010D\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006\"\u0004\bF\u0010\bR$\u0010G\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006\"\u0004\bI\u0010\bR$\u0010J\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006\"\u0004\bL\u0010\bR$\u0010M\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006\"\u0004\bO\u0010\bR$\u0010P\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006\"\u0004\bR\u0010\bR$\u0010S\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010\bR$\u0010V\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006\"\u0004\bX\u0010\bR$\u0010Y\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010\u0004\u001a\u0004\bZ\u0010\u0006\"\u0004\b[\u0010\bR$\u0010\\\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010\u0006\"\u0004\b^\u0010\bR$\u0010`\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010\u0004\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR$\u0010i\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010\u0004\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR$\u0010l\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010'\u001a\u0004\bm\u0010)\"\u0004\bn\u0010+R$\u0010o\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010\u0004\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR$\u0010r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010\u0004\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR$\u0010u\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010\u0004\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\bR$\u0010x\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010\u0004\u001a\u0004\by\u0010\u0006\"\u0004\bz\u0010\bR$\u0010{\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010a\u001a\u0004\b|\u0010c\"\u0004\b}\u0010eR%\u0010~\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010'\u001a\u0004\b\u007f\u0010)\"\u0005\b\u0080\u0001\u0010+R(\u0010\u0081\u0001\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010'\u001a\u0005\b\u0082\u0001\u0010)\"\u0005\b\u0083\u0001\u0010+R(\u0010\u0084\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010\u000e\u001a\u0005\b\u0085\u0001\u0010\u0010\"\u0005\b\u0086\u0001\u0010\u0012R(\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010\u0004\u001a\u0005\b\u0088\u0001\u0010\u0006\"\u0005\b\u0089\u0001\u0010\bR(\u0010\u008a\u0001\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010a\u001a\u0005\b\u008a\u0001\u0010c\"\u0005\b\u008b\u0001\u0010eR(\u0010\u008c\u0001\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010a\u001a\u0005\b\u008d\u0001\u0010c\"\u0005\b\u008e\u0001\u0010eR(\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010\u0004\u001a\u0005\b\u0090\u0001\u0010\u0006\"\u0005\b\u0091\u0001\u0010\b¨\u0006\u0093\u0001"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierCouponItem;", "Landroid/os/Parcelable;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "couponType", "h", "t", "", "nominaValue", "Ljava/lang/Long;", "m", "()Ljava/lang/Long;", "setNominaValue", "(Ljava/lang/Long;)V", "limitAmt", "l", "setLimitAmt", "couponName", "g", "setCouponName", "createTime", "getCreateTime", "setCreateTime", "updateTime", "getUpdateTime", "setUpdateTime", "startTime", "p", "setStartTime", "endTime", "j", "setEndTime", "", "appSource", "Ljava/lang/Integer;", "getAppSource", "()Ljava/lang/Integer;", "setAppSource", "(Ljava/lang/Integer;)V", "actName", "getActName", "setActName", "actNo", "getActNo", "setActNo", "busRes", "getBusRes", "setBusRes", "consumeAmt", "getConsumeAmt", "setConsumeAmt", "consumeTime", "getConsumeTime", "setConsumeTime", "couponCode", "getCouponCode", "setCouponCode", "couponId", "f", "s", "couponSubhead", "getCouponSubhead", "setCouponSubhead", "createId", "getCreateId", "setCreateId", "limtType", "getLimtType", "setLimtType", "orderNo", "getOrderNo", "setOrderNo", "reqSn", "getReqSn", "setReqSn", "spreaderId", "getSpreaderId", "setSpreaderId", "spuCode", "getSpuCode", "setSpuCode", "status", "getStatus", "setStatus", "transType", "getTransType", "setTransType", "updateId", "getUpdateId", "setUpdateId", "", "layoutExpand", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "u", "(Ljava/lang/Boolean;)V", "limitStores", "getLimitStores", "setLimitStores", "couponDesc", "d", "setCouponDesc", "useLimitType", "getUseLimitType", "setUseLimitType", "qrCode", "getQrCode", "setQrCode", "useAccountType", "getUseAccountType", "setUseAccountType", "androidLinkUrl", "getAndroidLinkUrl", "setAndroidLinkUrl", "couponIcon", "e", "setCouponIcon", "showOnlyMeErrors", "o", "setShowOnlyMeErrors", "preferentialDays", "n", "setPreferentialDays", "discountRate", "i", "setDiscountRate", "systemTime", "getSystemTime", "setSystemTime", "remark", "getRemark", "setRemark", "isUsable", "setUsable", "available", "c", "r", "unavailableReason", "q", "setUnavailableReason", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCashierCouponItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCashierCouponItem> CREATOR;

    @Nullable
    private String actName;

    @Nullable
    private String actNo;

    @Nullable
    private String androidLinkUrl;

    @Nullable
    private Integer appSource;

    @Nullable
    private Boolean available;

    @Nullable
    private Integer busRes;

    @Nullable
    private Long consumeAmt;

    @Nullable
    private Long consumeTime;

    @Nullable
    private String couponCode;

    @Nullable
    private String couponDesc;

    @Nullable
    private String couponIcon;

    @Nullable
    private Long couponId;

    @Nullable
    private String couponName;

    @Nullable
    private String couponSubhead;

    @Nullable
    private String couponType;

    @Nullable
    private String createId;

    @Nullable
    private Long createTime;

    @Nullable
    private Integer discountRate;

    @Nullable
    private Long endTime;

    @Nullable
    private String id;

    @Nullable
    private Boolean isUsable;

    @Nullable
    private Boolean layoutExpand;

    @Nullable
    private Long limitAmt;

    @Nullable
    private String limitStores;

    @Nullable
    private String limtType;

    @Nullable
    private Long nominaValue;

    @Nullable
    private String orderNo;

    @Nullable
    private Integer preferentialDays;

    @Nullable
    private String qrCode;

    @Nullable
    private String remark;

    @Nullable
    private String reqSn;

    @Nullable
    private Boolean showOnlyMeErrors;

    @Nullable
    private String spreaderId;

    @Nullable
    private String spuCode;

    @Nullable
    private Long startTime;

    @Nullable
    private String status;

    @Nullable
    private Long systemTime;

    @Nullable
    private String transType;

    @Nullable
    private String unavailableReason;

    @Nullable
    private String updateId;

    @Nullable
    private Long updateTime;

    @Nullable
    private String useAccountType;

    @Nullable
    private Integer useLimitType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierCouponItem$a;", "", "<init>", "()V", "", "COUPON_TYPE_DISCOUNT", "Ljava/lang/String;", "COUPON_TYPE_GOODS", "COUPON_TYPE_DAYS", "COUPON_TYPE_RECHARGE", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FlexiBankCashierCouponItem> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCashierCouponItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf4 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf6 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf8 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string6 = parcel.readString();
            Long lValueOf9 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string19 = parcel.readString();
            Integer num = numValueOf3;
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            boolean z3 = false;
            String string22 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf10 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Boolean bool = boolValueOf2;
            Integer num2 = numValueOf5;
            String string23 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                boolValueOf4 = Boolean.valueOf(z3);
            }
            return new FlexiBankCashierCouponItem(string, string2, lValueOf, lValueOf2, string3, lValueOf3, lValueOf4, lValueOf5, lValueOf6, numValueOf, string4, string5, numValueOf2, lValueOf7, lValueOf8, string6, lValueOf9, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, boolValueOf, string17, string18, num, string19, string20, string21, string22, bool, numValueOf4, num2, lValueOf10, string23, boolValueOf3, boolValueOf4, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCashierCouponItem[] newArray(int i7) {
            return new FlexiBankCashierCouponItem[i7];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public FlexiBankCashierCouponItem() {
        this(0);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCouponDesc() {
        return this.couponDesc;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCouponIcon() {
        return this.couponIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCashierCouponItem)) {
            return false;
        }
        FlexiBankCashierCouponItem flexiBankCashierCouponItem = (FlexiBankCashierCouponItem) obj;
        return Intrinsics.c(this.id, flexiBankCashierCouponItem.id) && Intrinsics.c(this.couponType, flexiBankCashierCouponItem.couponType) && Intrinsics.c(this.nominaValue, flexiBankCashierCouponItem.nominaValue) && Intrinsics.c(this.limitAmt, flexiBankCashierCouponItem.limitAmt) && Intrinsics.c(this.couponName, flexiBankCashierCouponItem.couponName) && Intrinsics.c(this.createTime, flexiBankCashierCouponItem.createTime) && Intrinsics.c(this.updateTime, flexiBankCashierCouponItem.updateTime) && Intrinsics.c(this.startTime, flexiBankCashierCouponItem.startTime) && Intrinsics.c(this.endTime, flexiBankCashierCouponItem.endTime) && Intrinsics.c(this.appSource, flexiBankCashierCouponItem.appSource) && Intrinsics.c(this.actName, flexiBankCashierCouponItem.actName) && Intrinsics.c(this.actNo, flexiBankCashierCouponItem.actNo) && Intrinsics.c(this.busRes, flexiBankCashierCouponItem.busRes) && Intrinsics.c(this.consumeAmt, flexiBankCashierCouponItem.consumeAmt) && Intrinsics.c(this.consumeTime, flexiBankCashierCouponItem.consumeTime) && Intrinsics.c(this.couponCode, flexiBankCashierCouponItem.couponCode) && Intrinsics.c(this.couponId, flexiBankCashierCouponItem.couponId) && Intrinsics.c(this.couponSubhead, flexiBankCashierCouponItem.couponSubhead) && Intrinsics.c(this.createId, flexiBankCashierCouponItem.createId) && Intrinsics.c(this.limtType, flexiBankCashierCouponItem.limtType) && Intrinsics.c(this.orderNo, flexiBankCashierCouponItem.orderNo) && Intrinsics.c(this.reqSn, flexiBankCashierCouponItem.reqSn) && Intrinsics.c(this.spreaderId, flexiBankCashierCouponItem.spreaderId) && Intrinsics.c(this.spuCode, flexiBankCashierCouponItem.spuCode) && Intrinsics.c(this.status, flexiBankCashierCouponItem.status) && Intrinsics.c(this.transType, flexiBankCashierCouponItem.transType) && Intrinsics.c(this.updateId, flexiBankCashierCouponItem.updateId) && Intrinsics.c(this.layoutExpand, flexiBankCashierCouponItem.layoutExpand) && Intrinsics.c(this.limitStores, flexiBankCashierCouponItem.limitStores) && Intrinsics.c(this.couponDesc, flexiBankCashierCouponItem.couponDesc) && Intrinsics.c(this.useLimitType, flexiBankCashierCouponItem.useLimitType) && Intrinsics.c(this.qrCode, flexiBankCashierCouponItem.qrCode) && Intrinsics.c(this.useAccountType, flexiBankCashierCouponItem.useAccountType) && Intrinsics.c(this.androidLinkUrl, flexiBankCashierCouponItem.androidLinkUrl) && Intrinsics.c(this.couponIcon, flexiBankCashierCouponItem.couponIcon) && Intrinsics.c(this.showOnlyMeErrors, flexiBankCashierCouponItem.showOnlyMeErrors) && Intrinsics.c(this.preferentialDays, flexiBankCashierCouponItem.preferentialDays) && Intrinsics.c(this.discountRate, flexiBankCashierCouponItem.discountRate) && Intrinsics.c(this.systemTime, flexiBankCashierCouponItem.systemTime) && Intrinsics.c(this.remark, flexiBankCashierCouponItem.remark) && Intrinsics.c(this.isUsable, flexiBankCashierCouponItem.isUsable) && Intrinsics.c(this.available, flexiBankCashierCouponItem.available) && Intrinsics.c(this.unavailableReason, flexiBankCashierCouponItem.unavailableReason);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getCouponId() {
        return this.couponId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCouponName() {
        return this.couponName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCouponType() {
        return this.couponType;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.couponType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l5 = this.nominaValue;
        int iHashCode3 = (iHashCode2 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.limitAmt;
        int iHashCode4 = (iHashCode3 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str3 = this.couponName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l8 = this.createTime;
        int iHashCode6 = (iHashCode5 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l10 = this.updateTime;
        int iHashCode7 = (iHashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.startTime;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.endTime;
        int iHashCode9 = (iHashCode8 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num = this.appSource;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.actName;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actNo;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.busRes;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l13 = this.consumeAmt;
        int iHashCode14 = (iHashCode13 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.consumeTime;
        int iHashCode15 = (iHashCode14 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str6 = this.couponCode;
        int iHashCode16 = (iHashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l15 = this.couponId;
        int iHashCode17 = (iHashCode16 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str7 = this.couponSubhead;
        int iHashCode18 = (iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.createId;
        int iHashCode19 = (iHashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.limtType;
        int iHashCode20 = (iHashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.orderNo;
        int iHashCode21 = (iHashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.reqSn;
        int iHashCode22 = (iHashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.spreaderId;
        int iHashCode23 = (iHashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.spuCode;
        int iHashCode24 = (iHashCode23 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.status;
        int iHashCode25 = (iHashCode24 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.transType;
        int iHashCode26 = (iHashCode25 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.updateId;
        int iHashCode27 = (iHashCode26 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool = this.layoutExpand;
        int iHashCode28 = (iHashCode27 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str17 = this.limitStores;
        int iHashCode29 = (iHashCode28 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.couponDesc;
        int iHashCode30 = (iHashCode29 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Integer num3 = this.useLimitType;
        int iHashCode31 = (iHashCode30 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str19 = this.qrCode;
        int iHashCode32 = (iHashCode31 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.useAccountType;
        int iHashCode33 = (iHashCode32 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.androidLinkUrl;
        int iHashCode34 = (iHashCode33 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.couponIcon;
        int iHashCode35 = (iHashCode34 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Boolean bool2 = this.showOnlyMeErrors;
        int iHashCode36 = (iHashCode35 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.preferentialDays;
        int iHashCode37 = (iHashCode36 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.discountRate;
        int iHashCode38 = (iHashCode37 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l16 = this.systemTime;
        int iHashCode39 = (iHashCode38 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str23 = this.remark;
        int iHashCode40 = (iHashCode39 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Boolean bool3 = this.isUsable;
        int iHashCode41 = (iHashCode40 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.available;
        int iHashCode42 = (iHashCode41 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str24 = this.unavailableReason;
        return iHashCode42 + (str24 != null ? str24.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getDiscountRate() {
        return this.discountRate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getLayoutExpand() {
        return this.layoutExpand;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Long getLimitAmt() {
        return this.limitAmt;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Long getNominaValue() {
        return this.nominaValue;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Integer getPreferentialDays() {
        return this.preferentialDays;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Boolean getShowOnlyMeErrors() {
        return this.showOnlyMeErrors;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getUnavailableReason() {
        return this.unavailableReason;
    }

    public final void r() {
        this.available = Boolean.FALSE;
    }

    public final void s(Long l5) {
        this.couponId = l5;
    }

    public final void t(String str) {
        this.couponType = str;
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.couponType;
        Long l5 = this.nominaValue;
        Long l6 = this.limitAmt;
        String str3 = this.couponName;
        Long l8 = this.createTime;
        Long l10 = this.updateTime;
        Long l11 = this.startTime;
        Long l12 = this.endTime;
        Integer num = this.appSource;
        String str4 = this.actName;
        String str5 = this.actNo;
        Integer num2 = this.busRes;
        Long l13 = this.consumeAmt;
        Long l14 = this.consumeTime;
        String str6 = this.couponCode;
        Long l15 = this.couponId;
        String str7 = this.couponSubhead;
        String str8 = this.createId;
        String str9 = this.limtType;
        String str10 = this.orderNo;
        String str11 = this.reqSn;
        String str12 = this.spreaderId;
        String str13 = this.spuCode;
        String str14 = this.status;
        String str15 = this.transType;
        String str16 = this.updateId;
        Boolean bool = this.layoutExpand;
        String str17 = this.limitStores;
        String str18 = this.couponDesc;
        Integer num3 = this.useLimitType;
        String str19 = this.qrCode;
        String str20 = this.useAccountType;
        String str21 = this.androidLinkUrl;
        String str22 = this.couponIcon;
        Boolean bool2 = this.showOnlyMeErrors;
        Integer num4 = this.preferentialDays;
        Integer num5 = this.discountRate;
        Long l16 = this.systemTime;
        String str23 = this.remark;
        Boolean bool3 = this.isUsable;
        Boolean bool4 = this.available;
        String str24 = this.unavailableReason;
        StringBuilder sbF = F.f("FlexiBankCashierCouponItem(id=", str, ", couponType=", str2, ", nominaValue=");
        q0.w(sbF, l5, ", limitAmt=", l6, ", couponName=");
        sbF.append(str3);
        sbF.append(", createTime=");
        sbF.append(l8);
        sbF.append(", updateTime=");
        q0.w(sbF, l10, ", startTime=", l11, ", endTime=");
        sbF.append(l12);
        sbF.append(", appSource=");
        sbF.append(num);
        sbF.append(", actName=");
        u.x(sbF, str4, ", actNo=", str5, ", busRes=");
        sbF.append(num2);
        sbF.append(", consumeAmt=");
        sbF.append(l13);
        sbF.append(", consumeTime=");
        sbF.append(l14);
        sbF.append(", couponCode=");
        sbF.append(str6);
        sbF.append(", couponId=");
        sbF.append(l15);
        sbF.append(", couponSubhead=");
        sbF.append(str7);
        sbF.append(", createId=");
        u.x(sbF, str8, ", limtType=", str9, ", orderNo=");
        u.x(sbF, str10, ", reqSn=", str11, ", spreaderId=");
        u.x(sbF, str12, ", spuCode=", str13, ", status=");
        u.x(sbF, str14, ", transType=", str15, ", updateId=");
        sbF.append(str16);
        sbF.append(", layoutExpand=");
        sbF.append(bool);
        sbF.append(", limitStores=");
        u.x(sbF, str17, ", couponDesc=", str18, ", useLimitType=");
        sbF.append(num3);
        sbF.append(", qrCode=");
        sbF.append(str19);
        sbF.append(", useAccountType=");
        u.x(sbF, str20, ", androidLinkUrl=", str21, ", couponIcon=");
        sbF.append(str22);
        sbF.append(", showOnlyMeErrors=");
        sbF.append(bool2);
        sbF.append(", preferentialDays=");
        sbF.append(num4);
        sbF.append(", discountRate=");
        sbF.append(num5);
        sbF.append(", systemTime=");
        sbF.append(l16);
        sbF.append(", remark=");
        sbF.append(str23);
        sbF.append(", isUsable=");
        sbF.append(bool3);
        sbF.append(", available=");
        sbF.append(bool4);
        sbF.append(", unavailableReason=");
        return G.r(sbF, str24, ")");
    }

    public final void u(Boolean bool) {
        this.layoutExpand = bool;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.couponType);
        Long l5 = this.nominaValue;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        Long l6 = this.limitAmt;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
        dest.writeString(this.couponName);
        Long l8 = this.createTime;
        if (l8 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l8);
        }
        Long l10 = this.updateTime;
        if (l10 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l10);
        }
        Long l11 = this.startTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l11);
        }
        Long l12 = this.endTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l12);
        }
        Integer num = this.appSource;
        if (num == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num);
        }
        dest.writeString(this.actName);
        dest.writeString(this.actNo);
        Integer num2 = this.busRes;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num2);
        }
        Long l13 = this.consumeAmt;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l13);
        }
        Long l14 = this.consumeTime;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l14);
        }
        dest.writeString(this.couponCode);
        Long l15 = this.couponId;
        if (l15 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l15);
        }
        dest.writeString(this.couponSubhead);
        dest.writeString(this.createId);
        dest.writeString(this.limtType);
        dest.writeString(this.orderNo);
        dest.writeString(this.reqSn);
        dest.writeString(this.spreaderId);
        dest.writeString(this.spuCode);
        dest.writeString(this.status);
        dest.writeString(this.transType);
        dest.writeString(this.updateId);
        Boolean bool = this.layoutExpand;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool);
        }
        dest.writeString(this.limitStores);
        dest.writeString(this.couponDesc);
        Integer num3 = this.useLimitType;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num3);
        }
        dest.writeString(this.qrCode);
        dest.writeString(this.useAccountType);
        dest.writeString(this.androidLinkUrl);
        dest.writeString(this.couponIcon);
        Boolean bool2 = this.showOnlyMeErrors;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool2);
        }
        Integer num4 = this.preferentialDays;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num4);
        }
        Integer num5 = this.discountRate;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num5);
        }
        Long l16 = this.systemTime;
        if (l16 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l16);
        }
        dest.writeString(this.remark);
        Boolean bool3 = this.isUsable;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool3);
        }
        Boolean bool4 = this.available;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool4);
        }
        dest.writeString(this.unavailableReason);
    }

    public FlexiBankCashierCouponItem(String str, String str2, Long l5, Long l6, String str3, Long l8, Long l10, Long l11, Long l12, Integer num, String str4, String str5, Integer num2, Long l13, Long l14, String str6, Long l15, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, String str18, Integer num3, String str19, String str20, String str21, String str22, Boolean bool2, Integer num4, Integer num5, Long l16, String str23, Boolean bool3, Boolean bool4, String str24) {
        this.id = str;
        this.couponType = str2;
        this.nominaValue = l5;
        this.limitAmt = l6;
        this.couponName = str3;
        this.createTime = l8;
        this.updateTime = l10;
        this.startTime = l11;
        this.endTime = l12;
        this.appSource = num;
        this.actName = str4;
        this.actNo = str5;
        this.busRes = num2;
        this.consumeAmt = l13;
        this.consumeTime = l14;
        this.couponCode = str6;
        this.couponId = l15;
        this.couponSubhead = str7;
        this.createId = str8;
        this.limtType = str9;
        this.orderNo = str10;
        this.reqSn = str11;
        this.spreaderId = str12;
        this.spuCode = str13;
        this.status = str14;
        this.transType = str15;
        this.updateId = str16;
        this.layoutExpand = bool;
        this.limitStores = str17;
        this.couponDesc = str18;
        this.useLimitType = num3;
        this.qrCode = str19;
        this.useAccountType = str20;
        this.androidLinkUrl = str21;
        this.couponIcon = str22;
        this.showOnlyMeErrors = bool2;
        this.preferentialDays = num4;
        this.discountRate = num5;
        this.systemTime = l16;
        this.remark = str23;
        this.isUsable = bool3;
        this.available = bool4;
        this.unavailableReason = str24;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FlexiBankCashierCouponItem(int i7) {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        this(null, null, 0L, 0L, null, 0L, 0L, 0L, 0L, 0, null, null, 0, 0L, 0L, null, 0L, null, null, null, null, null, null, null, null, null, null, bool, null, null, 0, null, null, null, null, bool, 0, 0, 0L, null, bool2, bool2, null);
    }
}
