package Uc;

import com.transsnet.palmpay.p2pcash.ui.atm.TransactionDetailPage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class G0 extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionDetailPage f9550b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G0(TransactionDetailPage transactionDetailPage, int i7) {
        super(null);
        this.f9549a = i7;
        this.f9550b = transactionDetailPage;
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        TransactionDetailPage transactionDetailPage = this.f9550b;
        int i7 = this.f9549a;
        Intrinsics.checkNotNullParameter(property, "property");
        switch (i7) {
            case 0:
                int i10 = TransactionDetailPage.f32922v;
                transactionDetailPage.p().b();
                transactionDetailPage.p().a();
                transactionDetailPage.p().c();
                break;
            default:
                int i11 = TransactionDetailPage.f32922v;
                transactionDetailPage.p().b();
                transactionDetailPage.p().a();
                transactionDetailPage.p().c();
                break;
        }
    }
}
