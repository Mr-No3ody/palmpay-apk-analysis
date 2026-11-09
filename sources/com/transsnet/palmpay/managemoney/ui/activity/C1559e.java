package com.transsnet.palmpay.managemoney.ui.activity;

import android.app.Dialog;
import androidx.core.view.KeyEventDispatcher$Component;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.palmpay.core.callback.HomeAcCallback;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1559e implements AdShowCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32233b;

    public /* synthetic */ C1559e(Object obj, int i7) {
        this.f32232a = i7;
        this.f32233b = obj;
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public final void showCallback(Dialog dialog) {
        Object obj = this.f32233b;
        int i7 = this.f32232a;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        switch (i7) {
            case 0:
                super.showCallback(dialog);
                int i10 = CashBoxMainActivity.f32040e;
                ((CashBoxMainActivity) obj).showDialog(dialog, 99);
                break;
            default:
                LoanHomeFragment.a aVar = LoanHomeFragment.f30338Z;
                LoanHomeFragment loanHomeFragment = (LoanHomeFragment) obj;
                if (loanHomeFragment.t) {
                    loanHomeFragment.A();
                } else {
                    loanHomeFragment.t = true;
                    F6.d.h("LoanHomeLoggedFragment", 5, "showAdDialog >>> shown");
                    dialog.setOnDismissListener(new p310ub.K(loanHomeFragment, 2));
                    KeyEventDispatcher$Component activity = loanHomeFragment.getActivity();
                    if (activity instanceof HomeAcCallback) {
                        ((HomeAcCallback) activity).showDialog(dialog, 93);
                    } else {
                        try {
                            if (!dialog.isShowing()) {
                                dialog.show();
                            }
                        } catch (Exception e10) {
                            F6.d.c("LoanHomeLoggedFragment", "showAdDialogByHost: ", e10);
                            loanHomeFragment.A();
                        }
                    }
                }
                break;
        }
    }
}
