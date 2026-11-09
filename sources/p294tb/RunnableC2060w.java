package p294tb;

import Ya.g;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.a;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayResultActivity;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanRepaymentListFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideDoubleOpenFragment;
import com.transsnet.palmpay.util.ToastUtils;
import p297te.h;
import p335w5.b;

/* JADX INFO: renamed from: tb.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC2060w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42522b;

    public /* synthetic */ RunnableC2060w(Object obj, int i7) {
        this.f42521a = i7;
        this.f42522b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f42522b;
        switch (this.f42521a) {
            case 0:
                a aVar = (a) obj;
                aVar.showLoadingDialog(false);
                ToastUtils.showLong(aVar.getString(g.cs_oc_install_plugin_failed), new Object[0]);
                break;
            case 1:
                int i7 = CLRepaymentResultActivity.f29111q0;
                ((CLRepaymentResultActivity) obj).n();
                break;
            case 2:
                ((h) obj).f42614a.onBackPressed();
                break;
            case 3:
                int i10 = OcRepayResultActivity.f29829u0;
                ((OcRepayResultActivity) obj).m();
                break;
            case 4:
                ((b) obj).a();
                break;
            case 5:
                DevLoadingModule.hide$lambda$1((DevLoadingModule) obj);
                break;
            case 6:
                ((ValueAnimator) obj).start();
                break;
            case 7:
                ((p377z5.h) obj).f44461b.b();
                break;
            case 8:
                LoanHomeFragment.a aVar2 = LoanHomeFragment.f30338Z;
                LoanRepaymentListFragment loanRepaymentListFragmentW = ((LoanHomeFragment) obj).w();
                if (loanRepaymentListFragmentW != null) {
                    loanRepaymentListFragmentW.v(false, true);
                }
                break;
            default:
                AnimatorSet animatorSet = ((OcGuideDoubleOpenFragment) obj).f30419k0;
                if (animatorSet != null) {
                    animatorSet.start();
                }
                break;
        }
    }
}
