package O3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010!\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R$\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR$\u0010'\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R$\u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\b\"\u0004\b,\u0010\nR$\u0010-\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\b\"\u0004\b/\u0010\nR$\u00100\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR$\u00103\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR$\u00106\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001a\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR$\u00109\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001a\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR$\u0010<\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\b\"\u0004\b>\u0010\nR\u0019\u0010?\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0019\u0010A\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006J"}, d2 = {"LO3/k;", "", "<init>", "()V", "", "orderNo", "Ljava/lang/String;", "getOrderNo", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "transType", "getTransType", "k", "subTransTypeCode", "getSubTransTypeCode", "j", "", "orderAmount", "Ljava/lang/Long;", "getOrderAmount", "()Ljava/lang/Long;", "e", "(Ljava/lang/Long;)V", "", "isRedeemPoint", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "i", "(Ljava/lang/Boolean;)V", "isUseCoupon", "a", "m", "couponId", "getCouponId", "d", "orderType", "getOrderType", "setOrderType", "couponAmount", "getCouponAmount", "c", "payeeAccountType", "getPayeeAccountType", "g", "payerAccountType", "getPayerAccountType", "h", "useDiscount", "getUseDiscount", "n", "useReturnPoint", "getUseReturnPoint", "setUseReturnPoint", "useBonus", "getUseBonus", "l", "usePayDiscount", "getUsePayDiscount", "o", "calculationExtInfo", "getCalculationExtInfo", "b", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "getCountryCode", FirebaseAnalytics.Param.CURRENCY, "getCurrency", "", "buyEarlyRefundByTime", "I", "getBuyEarlyRefundByTime", "()I", "setBuyEarlyRefundByTime", "(I)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {
    private int buyEarlyRefundByTime;

    @Nullable
    private String calculationExtInfo;

    @Nullable
    private final String countryCode;

    @Nullable
    private Long couponAmount;

    @Nullable
    private Long couponId;

    @Nullable
    private final String currency;

    @Nullable
    private Boolean isRedeemPoint;

    @Nullable
    private Boolean isUseCoupon;

    @Nullable
    private Long orderAmount = 0L;

    @Nullable
    private String orderNo;

    @Nullable
    private String orderType;

    @Nullable
    private String payeeAccountType;

    @Nullable
    private String payerAccountType;

    @Nullable
    private String subTransTypeCode;

    @Nullable
    private String transType;

    @Nullable
    private Boolean useBonus;

    @Nullable
    private Boolean useDiscount;

    @Nullable
    private Boolean usePayDiscount;

    @Nullable
    private Boolean useReturnPoint;

    public k() {
        Boolean bool = Boolean.FALSE;
        this.isRedeemPoint = bool;
        this.isUseCoupon = bool;
        this.orderType = "999";
        this.couponAmount = 0L;
        this.useDiscount = bool;
        this.useReturnPoint = bool;
        this.useBonus = bool;
        this.usePayDiscount = bool;
        this.countryCode = com.flexibank.sdk.k.f22325i;
        this.currency = "NGN";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getIsUseCoupon() {
        return this.isUseCoupon;
    }

    public final void b(String str) {
        this.calculationExtInfo = str;
    }

    public final void c(Long l5) {
        this.couponAmount = l5;
    }

    public final void d(Long l5) {
        this.couponId = l5;
    }

    public final void e(Long l5) {
        this.orderAmount = l5;
    }

    public final void f(String str) {
        this.orderNo = str;
    }

    public final void g(String str) {
        this.payeeAccountType = str;
    }

    public final void h(String str) {
        this.payerAccountType = str;
    }

    public final void i(Boolean bool) {
        this.isRedeemPoint = bool;
    }

    public final void j(String str) {
        this.subTransTypeCode = str;
    }

    public final void k(String str) {
        this.transType = str;
    }

    public final void l() {
        this.useBonus = Boolean.FALSE;
    }

    public final void m(Boolean bool) {
        this.isUseCoupon = bool;
    }

    public final void n(Boolean bool) {
        this.useDiscount = bool;
    }

    public final void o() {
        this.usePayDiscount = Boolean.TRUE;
    }
}
