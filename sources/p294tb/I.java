package p294tb;

import C0.AbstractC0130w;
import C0.P;
import N8.q0;
import Pa.i0;
import Pa.n0;
import Ya.e;
import androidx.activity.z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.navigation.fragment.NavHostFragment;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;
import com.transsnet.palmpay.credit.ui.activity.transferbyloan.TransferByLoanActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLDoubleResultRetainDialog;
import com.transsnet.palmpay.credit.ui.dialog.TransferByLoanSheet;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42413b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(Object obj, int i7) {
        super(true);
        this.f42412a = i7;
        this.f42413b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.z
    public final void handleOnBackPressed() {
        Z childFragmentManager;
        int i7 = 0;
        Object[] objArr = 0;
        Object obj = this.f42413b;
        switch (this.f42412a) {
            case 0:
                n0.g().m(I.class.getSimpleName().concat("_element_click"), "CashResultReturn", "");
                CLOpenResultActivity cLOpenResultActivity = (CLOpenResultActivity) obj;
                if (cLOpenResultActivity.f28972L0) {
                    new CLDoubleResultRetainDialog(cLOpenResultActivity, i7, 2, objArr == true ? 1 : 0).show();
                    cLOpenResultActivity.v(true);
                } else {
                    q0.u("/main/home");
                }
                cLOpenResultActivity.f28972L0 = false;
                break;
            case 1:
                ((AbstractC0130w) obj).j();
                break;
            case 2:
                P p3 = ((PalmPayLevelUpTier3V2Activity) obj).f25916a;
                if (p3 == null || !p3.j()) {
                    if (!ActivityUtils.isActivityExistsInStack((Class<?>) PalmPayLevelV2Activity.class)) {
                        i0.H(null);
                    } else {
                        ActivityUtils.finishToActivity((Class<?>) PalmPayLevelV2Activity.class, false);
                    }
                }
                break;
            case 3:
                ((Function1) obj).invoke(this);
                break;
            default:
                TransferByLoanActivity.a aVar = TransferByLoanActivity.f29927e;
                TransferByLoanActivity transferByLoanActivity = (TransferByLoanActivity) obj;
                Fragment fragmentD = transferByLoanActivity.getSupportFragmentManager().D(e.navHostFragment);
                NavHostFragment navHostFragment = fragmentD instanceof NavHostFragment ? (NavHostFragment) fragmentD : null;
                Fragment fragment = (navHostFragment == null || (childFragmentManager = navHostFragment.getChildFragmentManager()) == null) ? null : childFragmentManager.f17090y;
                TransferByLoanSheet transferByLoanSheet = fragment instanceof TransferByLoanSheet ? (TransferByLoanSheet) fragment : null;
                if (transferByLoanSheet == null) {
                    transferByLoanActivity.finish();
                } else {
                    transferByLoanSheet.x();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC0130w abstractC0130w) {
        super(false);
        this.f42412a = 1;
        this.f42413b = abstractC0130w;
    }
}
