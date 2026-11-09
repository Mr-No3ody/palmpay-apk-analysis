package Ce;

import android.app.Dialog;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ce.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0174p implements AdShowCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f1511b;

    public /* synthetic */ C0174p(HomeActivity homeActivity, int i7) {
        this.f1510a = i7;
        this.f1511b = homeActivity;
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public final void showCallback(Dialog dialog) {
        switch (this.f1510a) {
            case 0:
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                HomeActivity homeActivity = this.f1511b;
                if (homeActivity != null) {
                    homeActivity.p().showDialog(dialog, 95);
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                HomeActivity homeActivity2 = this.f1511b;
                if (homeActivity2 != null) {
                    homeActivity2.p().showDialog(dialog, 94);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                HomeActivity homeActivity3 = this.f1511b;
                if (homeActivity3 != null) {
                    homeActivity3.p().showDialog(dialog, 102);
                }
                break;
        }
    }
}
