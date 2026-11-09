package p323v9;

import com.transsnet.palmpay.betting.ui.fragment.BettingWithdrawHomeFragment;
import com.transsnet.palmpay.betting.viewmodel.BettingWithDrawViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;
import x9.u;
import x9.x;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BettingWithdrawHomeFragment f43127b;

    public /* synthetic */ b(BettingWithdrawHomeFragment bettingWithdrawHomeFragment, int i7) {
        this.f43126a = i7;
        this.f43127b = bettingWithdrawHomeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BettingWithdrawHomeFragment bettingWithdrawHomeFragment = this.f43127b;
        switch (this.f43126a) {
            case 0:
                bettingWithdrawHomeFragment.A();
                break;
            default:
                BettingWithDrawViewModel bettingWithDrawViewModel = (BettingWithDrawViewModel) bettingWithdrawHomeFragment.f27333i;
                if (bettingWithDrawViewModel != null) {
                    u function = new u(0);
                    Intrinsics.checkNotNullParameter(function, "function");
                    x xVar = new x(1, null);
                    l lVar = bettingWithDrawViewModel.f26785g;
                    lVar.f27356m = function;
                    Unit unit = Unit.f38893a;
                    f.v(bettingWithDrawViewModel, xVar, lVar, 0L);
                }
                break;
        }
        return Unit.f38893a;
    }
}
