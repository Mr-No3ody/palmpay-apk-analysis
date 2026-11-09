package p382zb;

import com.transsnet.palmpay.credit.ui.fragment.LoanProductListFragment;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zb.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2182z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoanProductListFragment f44632b;

    public /* synthetic */ C2182z(LoanProductListFragment loanProductListFragment, int i7) {
        this.f44631a = i7;
        this.f44632b = loanProductListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LoanProductListFragment loanProductListFragment = this.f44632b;
        OcHomeFinanceViewModel it = (OcHomeFinanceViewModel) obj;
        switch (this.f44631a) {
            case 0:
                LoanProductListFragment.a aVar = LoanProductListFragment.f30354p;
                Intrinsics.checkNotNullParameter(it, "it");
                loanProductListFragment.f27333i = it;
                break;
            default:
                LoanProductListFragment.a aVar2 = LoanProductListFragment.f30354p;
                Intrinsics.checkNotNullParameter(it, "it");
                loanProductListFragment.f27333i = it;
                break;
        }
        return Unit.f38893a;
    }
}
