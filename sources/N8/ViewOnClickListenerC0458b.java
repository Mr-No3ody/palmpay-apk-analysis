package N8;

import android.view.View;
import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.ui.activity.EnableCashBoxAutoSaveActivity;
import com.transsnet.palmpay.account.ui.viewmodel.CashBoxAutoSaveViewModel;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import kotlin.jvm.internal.Intrinsics;
import p097g9.C1713k;

/* JADX INFO: renamed from: N8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0458b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnableCashBoxAutoSaveActivity f6195b;

    public /* synthetic */ ViewOnClickListenerC0458b(EnableCashBoxAutoSaveActivity enableCashBoxAutoSaveActivity, int i7) {
        this.f6194a = i7;
        this.f6195b = enableCashBoxAutoSaveActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EnableCashBoxAutoSaveActivity enableCashBoxAutoSaveActivity = this.f6195b;
        switch (this.f6194a) {
            case 0:
                EnableCashBoxAutoSaveActivity.a aVar = EnableCashBoxAutoSaveActivity.f25851j;
                Pa.n0.g().l("CashBoxAutoSaveSkipButton");
                enableCashBoxAutoSaveActivity.n(enableCashBoxAutoSaveActivity.f25854e);
                break;
            case 1:
                EnableCashBoxAutoSaveActivity.a aVar2 = EnableCashBoxAutoSaveActivity.f25851j;
                Pa.n0.g().l("CashBoxAutoSaveConfirmButton");
                if (enableCashBoxAutoSaveActivity.f25855f != 1) {
                    enableCashBoxAutoSaveActivity.n(enableCashBoxAutoSaveActivity.f25854e);
                } else {
                    Bc.D d2 = enableCashBoxAutoSaveActivity.f25852c;
                    if (d2 != null) {
                        ((PpButton) d2.f625p).b(true);
                    }
                    CashBoxAutoSaveViewModel cashBoxAutoSaveViewModel = (CashBoxAutoSaveViewModel) enableCashBoxAutoSaveActivity.l();
                    if (cashBoxAutoSaveViewModel != null) {
                        Intrinsics.checkNotNullParameter(GetCustomerServiceUrlReq.ENTER_TYPE_SIGNUP, "source");
                        p140j8.f.s(cashBoxAutoSaveViewModel, new C1713k(1, null), cashBoxAutoSaveViewModel.f26416g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    }
                }
                break;
            case 2:
                EnableCashBoxAutoSaveActivity.a aVar3 = EnableCashBoxAutoSaveActivity.f25851j;
                Pa.n0.g().l("CashBoxAutoSaveBackButton");
                enableCashBoxAutoSaveActivity.n(enableCashBoxAutoSaveActivity.f25854e);
                break;
            case 3:
                enableCashBoxAutoSaveActivity.f25855f = 1;
                Bc.D d10 = enableCashBoxAutoSaveActivity.f25852c;
                Intrinsics.e(d10);
                TextView tv1 = d10.f619e;
                Intrinsics.checkNotNullExpressionValue(tv1, "tv1");
                enableCashBoxAutoSaveActivity.m(tv1);
                break;
            default:
                enableCashBoxAutoSaveActivity.f25855f = 0;
                Bc.D d11 = enableCashBoxAutoSaveActivity.f25852c;
                Intrinsics.e(d11);
                TextView tv2 = d11.f620f;
                Intrinsics.checkNotNullExpressionValue(tv2, "tv2");
                enableCashBoxAutoSaveActivity.m(tv2);
                break;
        }
    }
}
