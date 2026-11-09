package O3;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010\nR\"\u0010$\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R$\u0010'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR$\u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\b\"\u0004\b,\u0010\nR$\u0010-\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\b\"\u0004\b/\u0010\nR$\u00100\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\b\"\u0004\b2\u0010\nR$\u00103\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\b\"\u0004\b5\u0010\nR\"\u00107\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010=\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\b\"\u0004\b?\u0010\nR$\u0010@\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\b\"\u0004\bB\u0010\nR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010G\"\u0004\bL\u0010IR\"\u0010M\u001a\u00020C8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010E\u001a\u0004\bN\u0010G\"\u0004\bO\u0010I¨\u0006P"}, d2 = {"LO3/e;", "Ljava/io/Serializable;", "<init>", "()V", "", "orderNo", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "orderType", "e", "setOrderType", "payId", "getPayId", "r", "subPayId", "getSubPayId", "u", "url", "i", "y", "verifyCode", "getVerifyCode", "z", "", "verifyMethod", "I", "j", "()I", "A", "(I)V", "payRouteId", "getPayRouteId", "s", "queryMaxSec", "getQueryMaxSec", "t", "channelTransactionId", "getChannelTransactionId", "k", "token", "getToken", "w", "otpReference", "f", "p", "bankName", "getBankName", "setBankName", "bankCardNo", "a", "setBankCardNo", "", "endFlag", "Z", "getEndFlag", "()Z", "l", "(Z)V", "subTransTypeCode", "getSubTransTypeCode", "v", "transType", "h", "x", "", "payAmount", "J", "g", "()J", "q", "(J)V", "orderAmount", "c", "n", "feeAmount", "b", "m", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements Serializable {

    @Nullable
    private String bankCardNo;

    @Nullable
    private String bankName;

    @Nullable
    private String channelTransactionId;
    private boolean endFlag;

    @Expose(deserialize = false, serialize = false)
    private long feeAmount;

    @Expose(deserialize = false, serialize = false)
    private long orderAmount;

    @Nullable
    private String orderNo;

    @Nullable
    private String orderType = "999";

    @Nullable
    private String otpReference;

    @Expose(deserialize = false, serialize = false)
    private long payAmount;

    @Nullable
    private String payId;

    @Nullable
    private String payRouteId;
    private int queryMaxSec;

    @Nullable
    private String subPayId;

    @Nullable
    private String subTransTypeCode;

    @Nullable
    private String token;

    @Expose(deserialize = false)
    @Nullable
    private String transType;

    @Nullable
    private String url;

    @Nullable
    private String verifyCode;
    private int verifyMethod;

    public final void A(int i7) {
        this.verifyMethod = i7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBankCardNo() {
        return this.bankCardNo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFeeAmount() {
        return this.feeAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getOrderAmount() {
        return this.orderAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOtpReference() {
        return this.otpReference;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getPayAmount() {
        return this.payAmount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getVerifyMethod() {
        return this.verifyMethod;
    }

    public final void k(String str) {
        this.channelTransactionId = str;
    }

    public final void l(boolean z3) {
        this.endFlag = z3;
    }

    public final void m(long j6) {
        this.feeAmount = j6;
    }

    public final void n(long j6) {
        this.orderAmount = j6;
    }

    public final void o(String str) {
        this.orderNo = str;
    }

    public final void p(String str) {
        this.otpReference = str;
    }

    public final void q(long j6) {
        this.payAmount = j6;
    }

    public final void r(String str) {
        this.payId = str;
    }

    public final void s(String str) {
        this.payRouteId = str;
    }

    public final void t(int i7) {
        this.queryMaxSec = i7;
    }

    public final void u(String str) {
        this.subPayId = str;
    }

    public final void v(String str) {
        this.subTransTypeCode = str;
    }

    public final void w(String str) {
        this.token = str;
    }

    public final void x(String str) {
        this.transType = str;
    }

    public final void y(String str) {
        this.url = str;
    }

    public final void z(String str) {
        this.verifyCode = str;
    }
}
