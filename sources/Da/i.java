package Da;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.C1052d;
import androidx.core.view.r0;
import androidx.core.view.s0;
import androidx.core.view.u0;
import androidx.core.view.v0;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f1756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1757c;

    public /* synthetic */ i(Activity activity, String str, int i7) {
        this.f1755a = i7;
        this.f1756b = activity;
        this.f1757c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.chromium.support_lib_boundary.util.b s0Var;
        switch (this.f1755a) {
            case 0:
                PPRNBridge.showFlexiCashLoaing$lambda$38$lambda$37(this.f1756b, this.f1757c);
                break;
            case 1:
                Activity activity = this.f1756b;
                View decorView = activity.getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                Window window = activity.getWindow();
                C1052d c1052d = new C1052d(decorView, 4);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 35) {
                    s0Var = new v0(window, c1052d);
                } else if (i7 >= 30) {
                    s0Var = new u0(window, c1052d);
                } else {
                    s0Var = i7 >= 26 ? new s0(window, c1052d) : new r0(window, c1052d);
                }
                s0Var.d0(this.f1757c.equals("dark"));
                break;
            case 2:
                StatusBarModule.setStyle$lambda$2(this.f1756b, this.f1757c);
                break;
            default:
                ((CustomActionCallback) this.f1756b).goBack(this.f1757c);
                break;
        }
    }
}
