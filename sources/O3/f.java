package O3;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u0010 \u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR$\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR$\u0010)\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\"\u0010,\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001a\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001d¨\u0006."}, d2 = {"LO3/f;", "", "<init>", "()V", "", "orderNo", "Ljava/lang/String;", "getOrderNo", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "transType", "getTransType", "h", "subTransTypeCode", "getSubTransTypeCode", "g", "", "orderAmount", "J", "getOrderAmount", "()J", "b", "(J)V", "", "isRedeemPoint", "Z", "()Z", "f", "(Z)V", "isUseCoupon", "i", "usePayDiscount", "getUsePayDiscount", "j", "payeeAccountType", "getPayeeAccountType", "d", "payerAccountType", "getPayerAccountType", "setPayerAccountType", "calculationExtInfo", "getCalculationExtInfo", "a", "isQuickPay", "e", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Nullable
    private String calculationExtInfo;
    private boolean isQuickPay;
    private boolean isRedeemPoint;
    private boolean isUseCoupon;
    private long orderAmount;

    @Nullable
    private String orderNo;

    @Nullable
    private String payeeAccountType;

    @Nullable
    private String payerAccountType;

    @Nullable
    private String subTransTypeCode;

    @Nullable
    private String transType;
    private boolean usePayDiscount;

    public final void a(String str) {
        this.calculationExtInfo = str;
    }

    public final void b(long j6) {
        this.orderAmount = j6;
    }

    public final void c(String str) {
        this.orderNo = str;
    }

    public final void d(String str) {
        this.payeeAccountType = str;
    }

    public final void e(boolean z3) {
        this.isQuickPay = z3;
    }

    public final void f() {
        this.isRedeemPoint = true;
    }

    public final void g(String str) {
        this.subTransTypeCode = str;
    }

    public final void h(String str) {
        this.transType = str;
    }

    public final void i() {
        this.isUseCoupon = true;
    }

    public final void j() {
        this.usePayDiscount = true;
    }
}
