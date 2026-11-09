package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.chromium.support_lib_boundary.util.b f16298a;

    public w0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f16298a = new v0(windowInsetsController, new C1052d(windowInsetsController));
        } else {
            this.f16298a = new u0(windowInsetsController, new C1052d(windowInsetsController));
        }
    }

    public w0(View view, Window window) {
        C1052d c1052d = new C1052d(view, 4);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            this.f16298a = new v0(window, c1052d);
            return;
        }
        if (i7 >= 30) {
            this.f16298a = new u0(window, c1052d);
        } else if (i7 >= 26) {
            this.f16298a = new s0(window, c1052d);
        } else {
            this.f16298a = new r0(window, c1052d);
        }
    }
}
