package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.core.view.C1052d;
import androidx.core.view.r0;
import androidx.core.view.s0;
import androidx.core.view.u0;
import androidx.core.view.v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class q extends u {
    @Override // androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void setUp(@NotNull M statusBarStyle, @NotNull M navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z3, boolean z8) {
        org.chromium.support_lib_boundary.util.b s0Var;
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        io.fastkv.n.K(window, false);
        window.setStatusBarColor(z3 ? statusBarStyle.f12012b : statusBarStyle.f12011a);
        window.setNavigationBarColor(z8 ? navigationBarStyle.f12012b : navigationBarStyle.f12011a);
        C1052d c1052d = new C1052d(view, 4);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            s0Var = new v0(window, c1052d);
        } else if (i7 >= 30) {
            s0Var = new u0(window, c1052d);
        } else {
            s0Var = i7 >= 26 ? new s0(window, c1052d) : new r0(window, c1052d);
        }
        s0Var.d0(!z3);
        s0Var.c0(!z8);
    }
}
