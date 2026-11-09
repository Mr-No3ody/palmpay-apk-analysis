package p052da;

import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: da.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1648u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1650w f35816b;

    public /* synthetic */ C1648u(C1650w c1650w, int i7) {
        this.f35815a = i7;
        this.f35816b = c1650w;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CashierPaymentMethodBean item = (CashierPaymentMethodBean) obj;
        switch (this.f35815a) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "item");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(item, "item");
                break;
            default:
                Intrinsics.checkNotNullParameter(item, "item");
                break;
        }
        return Boolean.valueOf(this.f35816b.d(item));
    }
}
