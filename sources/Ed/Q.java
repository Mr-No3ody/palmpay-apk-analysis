package Ed;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeFragment f2341b;

    public /* synthetic */ Q(TransferToBankHomeFragment transferToBankHomeFragment, int i7) {
        this.f2340a = i7;
        this.f2341b = transferToBankHomeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CoordinatorLayout coordinatorLayout;
        switch (this.f2340a) {
            case 0:
                Integer num = (Integer) obj;
                TransferToBankHomeFragment transferToBankHomeFragment = this.f2341b;
                p223od.q qVar = (p223od.q) transferToBankHomeFragment.f27335j;
                if (qVar != null) {
                    qVar.f40456X.setCurrentItem((num != null && num.intValue() == 1) ? 2 : 0, true);
                }
                try {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.f(new Fade());
                    transitionSet.i(350L);
                    p223od.q qVar2 = (p223od.q) transferToBankHomeFragment.f27335j;
                    if (qVar2 != null && (coordinatorLayout = qVar2.f40462e) != null) {
                        androidx.transition.X.a(coordinatorLayout, transitionSet);
                    }
                    break;
                } catch (Exception unused) {
                }
                break;
            default:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                TransferToBankHomeFragment transferToBankHomeFragment2 = this.f2341b;
                transferToBankHomeFragment2.f33774A = it;
                if (it != null) {
                    it.setOnClickListener(new N(transferToBankHomeFragment2, 0));
                }
                break;
        }
        return Unit.f38893a;
    }
}
