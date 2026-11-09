package O3;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R$\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"LO3/c;", "", "<init>", "()V", "", "feePlusVat", "Ljava/lang/Long;", "getFeePlusVat", "()Ljava/lang/Long;", "b", "(Ljava/lang/Long;)V", "orderAmount", "getOrderAmount", "c", "", "transType", "Ljava/lang/String;", "getTransType", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "subTransTypeCode", "getSubTransTypeCode", "e", "useAccountType", "getUseAccountType", "g", "orderNo", "getOrderNo", "d", "calculationExtInfo", "getCalculationExtInfo", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Nullable
    private String calculationExtInfo;

    @Nullable
    private Long feePlusVat;

    @Nullable
    private Long orderAmount;

    @Nullable
    private String orderNo;

    @Nullable
    private String subTransTypeCode;

    @Nullable
    private String transType;

    @Nullable
    private String useAccountType;

    public final void a(String str) {
        this.calculationExtInfo = str;
    }

    public final void b(Long l5) {
        this.feePlusVat = l5;
    }

    public final void c(Long l5) {
        this.orderAmount = l5;
    }

    public final void d(String str) {
        this.orderNo = str;
    }

    public final void e(String str) {
        this.subTransTypeCode = str;
    }

    public final void f(String str) {
        this.transType = str;
    }

    public final void g(String str) {
        this.useAccountType = str;
    }
}
