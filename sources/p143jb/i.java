package p143jb;

import O6.c;
import Ya.d;
import Ya.g;
import android.text.TextUtils;
import androidx.fragment.app.E;
import com.transsnet.palmpay.credit.ui.fragment.LoanCreditFragment;
import com.transsnet.palmpay.util.SPUtils;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f38530b;

    public /* synthetic */ i(o oVar, int i7) {
        this.f38529a = i7;
        this.f38530b = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        E activity;
        switch (this.f38529a) {
            case 0:
                o oVar = this.f38530b;
                Integer num = oVar.f38548f;
                if ((num != null ? num.intValue() : 0) < o.h()) {
                    WeakReference weakReference = oVar.f38544b;
                    if (weakReference == null) {
                        Intrinsics.n("mLoanCreditFragmentRef");
                        throw null;
                    }
                    LoanCreditFragment loanCreditFragment = (LoanCreditFragment) weakReference.get();
                    if (loanCreditFragment != null && (activity = loanCreditFragment.getActivity()) != null) {
                        c cVar = new c(activity);
                        cVar.f6615v = L6.i.ppFlexiCashDialogTheme;
                        cVar.f6607m = d.cs_failed_sorry_icon;
                        cVar.f6596b = O6.d.f("Sorry");
                        cVar.b(g.cs_cl_credit_bind_failed_tips);
                        cVar.d(g.cs_confirm, null);
                        cVar.g();
                    }
                } else {
                    SPUtils.get().put("credit_bind_times", TextUtils.join("_", C1850q.h(String.valueOf(System.currentTimeMillis()), String.valueOf(o.h() + 1))));
                    oVar.m(oVar.f38546d);
                }
                return Unit.f38893a;
            case 1:
                this.f38530b.x();
                return Unit.f38893a;
            default:
                o oVar2 = this.f38530b;
                oVar2.m(oVar2.f38546d);
                return Unit.f38893a;
        }
    }
}
