package p294tb;

import N8.q0;
import Pa.i0;
import Pa.n0;
import android.view.KeyEvent;
import androidx.activity.z;
import androidx.fragment.app.Z;
import com.swmansion.rnscreens.CustomSearchView;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLDoubleResultRetainDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42416b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(KeyEvent.Callback callback, int i7) {
        super(true);
        this.f42415a = i7;
        this.f42416b = callback;
    }

    @Override // androidx.activity.z
    public final void handleOnBackPressed() {
        switch (this.f42415a) {
            case 0:
                n0.g().m(K.class.getSimpleName().concat("_element_click"), "CashResultReturn", "");
                CLOpenResultActivity cLOpenResultActivity = (CLOpenResultActivity) this.f42416b;
                int i7 = 0;
                if (cLOpenResultActivity.f28972L0) {
                    new CLDoubleResultRetainDialog(cLOpenResultActivity, i7, 2, null).show();
                    cLOpenResultActivity.v(false);
                } else {
                    q0.u("/main/home");
                }
                cLOpenResultActivity.f28972L0 = false;
                break;
            case 1:
                ((CustomSearchView) this.f42416b).setIconified(true);
                break;
            case 2:
                PalmPayLevelV2Activity palmPayLevelV2Activity = (PalmPayLevelV2Activity) this.f42416b;
                if (!palmPayLevelV2Activity.isTaskRoot()) {
                    palmPayLevelV2Activity.finish();
                } else {
                    i0.H(null);
                }
                break;
            default:
                Z z3 = (Z) this.f42416b;
                z3.y(true);
                if (!z3.f17074h.isEnabled()) {
                    z3.f17073g.d();
                } else {
                    z3.U();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Z z3) {
        super(false);
        this.f42415a = 3;
        this.f42416b = z3;
    }
}
