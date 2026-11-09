package O3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\bE\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R$\u0010%\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R$\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\r\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R$\u0010+\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\r\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R$\u0010.\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\r\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011R$\u00101\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\r\u001a\u0004\b2\u0010\u000f\"\u0004\b3\u0010\u0011R\"\u00104\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\b\"\u0004\b6\u0010\nR$\u00107\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\r\u001a\u0004\b8\u0010\u000f\"\u0004\b9\u0010\u0011R$\u0010:\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\r\u001a\u0004\b;\u0010\u000f\"\u0004\b<\u0010\u0011R$\u0010=\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\r\u001a\u0004\b>\u0010\u000f\"\u0004\b?\u0010\u0011R$\u0010@\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\r\u001a\u0004\bA\u0010\u000f\"\u0004\bB\u0010\u0011R\"\u0010C\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u001d\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R$\u0010F\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\r\u001a\u0004\bG\u0010\u000f\"\u0004\bH\u0010\u0011R$\u0010I\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\r\u001a\u0004\bJ\u0010\u000f\"\u0004\bK\u0010\u0011R$\u0010L\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\r\u001a\u0004\bM\u0010\u000f\"\u0004\bN\u0010\u0011R$\u0010O\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010U\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010P\u001a\u0004\bV\u0010R\"\u0004\bW\u0010TR$\u0010X\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010\r\u001a\u0004\bY\u0010\u000f\"\u0004\bZ\u0010\u0011R$\u0010[\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\r\u001a\u0004\b\\\u0010\u000f\"\u0004\b]\u0010\u0011R$\u0010^\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010\r\u001a\u0004\b_\u0010\u000f\"\u0004\b`\u0010\u0011R$\u0010b\u001a\u0004\u0018\u00010a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010\r¨\u0006i"}, d2 = {"LO3/i;", "Ljava/io/Serializable;", "<init>", "()V", "", "amount", "J", "a", "()J", "c", "(J)V", "", FirebaseAnalytics.Param.CURRENCY, "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "orderNo", "getOrderNo", "g", "orderType", "getOrderType", "setOrderType", "transType", "getTransType", "r", "", "payType", "I", "getPayType", "()I", "h", "(I)V", "payerAccountId", "getPayerAccountId", "i", "payerCardCvv", "getPayerCardCvv", "l", "payerCardPin", "getPayerCardPin", "p", "payerCardExpiryMon", "getPayerCardExpiryMon", "m", "payerCardExpiryYear", "getPayerCardExpiryYear", "n", "payerCardNo", "getPayerCardNo", "o", "fee", "b", "f", "payerBankAccountNo", "getPayerBankAccountNo", "setPayerBankAccountNo", "payerBankCode", "getPayerBankCode", "j", "payerMessage", "getPayerMessage", "setPayerMessage", "payerBankName", "getPayerBankName", "k", "reUseable", "getReUseable", "q", "walletChannel", "getWalletChannel", "s", "walletPhone", "getWalletPhone", "t", "installmentId", "getInstallmentId", "setInstallmentId", "couponId", "Ljava/lang/Long;", "getCouponId", "()Ljava/lang/Long;", "setCouponId", "(Ljava/lang/Long;)V", "businessDiscountAmount", "getBusinessDiscountAmount", "setBusinessDiscountAmount", "cacheKey", "getCacheKey", "d", "bankName", "getBankName", "setBankName", "bankUrl", "getBankUrl", "setBankUrl", "LW3/b;", "bankCardExtInfo", "LW3/b;", "getBankCardExtInfo", "()LW3/b;", "setBankCardExtInfo", "(LW3/b;)V", "metaInfo", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements Serializable {
    private long amount;

    @Nullable
    private W3.b bankCardExtInfo;

    @Nullable
    private String bankName;

    @Nullable
    private String bankUrl;

    @Nullable
    private Long businessDiscountAmount;

    @Nullable
    private String cacheKey;

    @Nullable
    private Long couponId;

    @Nullable
    private String currency;
    private long fee;

    @Nullable
    private String installmentId;

    @Nullable
    private String orderNo;
    private int payType;

    @Nullable
    private String payerAccountId;

    @Nullable
    private String payerBankAccountNo;

    @Nullable
    private String payerBankCode;

    @Nullable
    private String payerBankName;

    @Nullable
    private String payerCardCvv;

    @Nullable
    private String payerCardExpiryMon;

    @Nullable
    private String payerCardExpiryYear;

    @Nullable
    private String payerCardNo;

    @Nullable
    private String payerCardPin;

    @Nullable
    private String payerMessage;
    private int reUseable;

    @Nullable
    private String transType;

    @Nullable
    private String walletChannel;

    @Nullable
    private String walletPhone;

    @Nullable
    private String orderType = "999";

    @Nullable
    private String metaInfo = "1";

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFee() {
        return this.fee;
    }

    public final void c(long j6) {
        this.amount = j6;
    }

    public final void d(String str) {
        this.cacheKey = str;
    }

    public final void e() {
        this.currency = "NGN";
    }

    public final void f(long j6) {
        this.fee = j6;
    }

    public final void g(String str) {
        this.orderNo = str;
    }

    public final void h(int i7) {
        this.payType = i7;
    }

    public final void i(String str) {
        this.payerAccountId = str;
    }

    public final void j(String str) {
        this.payerBankCode = str;
    }

    public final void k(String str) {
        this.payerBankName = str;
    }

    public final void l(String str) {
        this.payerCardCvv = str;
    }

    public final void m(String str) {
        this.payerCardExpiryMon = str;
    }

    public final void n(String str) {
        this.payerCardExpiryYear = str;
    }

    public final void o(String str) {
        this.payerCardNo = str;
    }

    public final void p(String str) {
        this.payerCardPin = str;
    }

    public final void q(int i7) {
        this.reUseable = i7;
    }

    public final void r(String str) {
        this.transType = str;
    }

    public final void s(String str) {
        this.walletChannel = str;
    }

    public final void t(String str) {
        this.walletPhone = str;
    }
}
