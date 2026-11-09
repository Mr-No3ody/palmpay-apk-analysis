package p102ge;

import L6.b;
import O6.c;
import Pa.r0;
import android.os.Trace;
import androidx.activity.u;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.util.SPUtils;
import p025ba.k;
import p054dd.d;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f37237b;

    public /* synthetic */ w(HomeActivity homeActivity, int i7) {
        this.f37236a = i7;
        this.f37237b = homeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 1;
        int i10 = 0;
        HomeActivity homeActivity = this.f37237b;
        switch (this.f37236a) {
            case 0:
                Trace.beginSection("delayInit");
                try {
                    HomeActivity.a aVar = HomeActivity.f34463H;
                    homeActivity.t();
                    homeActivity.runOnUiThread(new w(homeActivity, i7));
                    homeActivity.runOnUiThread(new w(homeActivity, 2));
                    homeActivity.runOnUiThread(new w(homeActivity, 3));
                    return;
                } finally {
                    Trace.endSection();
                }
            case 1:
                homeActivity.setNavigationBarColor(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, homeActivity));
                return;
            case 2:
                HomeActivity.a aVar2 = HomeActivity.f34463H;
                u.a(homeActivity.getOnBackPressedDispatcher(), homeActivity, new C1745s(homeActivity, i10));
                return;
            default:
                HomeActivity.a aVar3 = HomeActivity.f34463H;
                if (r0.T0()) {
                    boolean z3 = r0.J0(homeActivity.getApplication().getResources()) == 32;
                    boolean zV0 = r0.V0();
                    boolean zZ0 = r0.Z0();
                    boolean z8 = SPUtils.get().getBoolean("key_home_dialog_dark_mode", false);
                    if (!z3 || zV0 || zZ0 || z8 || !BaseApplication.hasLogin()) {
                        return;
                    }
                    c cVar = new c(homeActivity);
                    cVar.f6598d = "Your system is detected to be in dark mode. Would you like PalmPay to sync and enable it?";
                    cVar.d(k.core_confirm, new d(8));
                    cVar.c(k.core_cancel, null);
                    homeActivity.showDialog(cVar.g(), 98);
                    SPUtils.get().put("key_home_dialog_dark_mode", true);
                    return;
                }
                return;
        }
    }
}
