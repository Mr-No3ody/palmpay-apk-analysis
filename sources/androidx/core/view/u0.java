package androidx.core.view;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: loaded from: classes.dex */
public class u0 extends org.chromium.support_lib_boundary.util.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WindowInsetsController f16292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1052d f16293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Window f16294r;

    public u0(WindowInsetsController windowInsetsController, C1052d c1052d) {
        this.f16292p = windowInsetsController;
        this.f16293q = c1052d;
    }

    @Override // org.chromium.support_lib_boundary.util.b
    public final void G(int i7) {
        if ((i7 & 8) != 0) {
            ((C1052d) this.f16293q.f16209b).a();
        }
        this.f16292p.hide(i7 & (-9));
    }

    @Override // org.chromium.support_lib_boundary.util.b
    public boolean N() {
        this.f16292p.setSystemBarsAppearance(0, 0);
        return (this.f16292p.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // org.chromium.support_lib_boundary.util.b
    public final void c0(boolean z3) {
        Window window = this.f16294r;
        if (z3) {
            if (window != null) {
                q0(16);
            }
            this.f16292p.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                r0(16);
            }
            this.f16292p.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // org.chromium.support_lib_boundary.util.b
    public final void d0(boolean z3) {
        Window window = this.f16294r;
        if (z3) {
            if (window != null) {
                q0(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            }
            this.f16292p.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                r0(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            }
            this.f16292p.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // org.chromium.support_lib_boundary.util.b
    public void h0() {
        Window window = this.f16294r;
        if (window == null) {
            this.f16292p.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        r0(2048);
        q0(4096);
    }

    @Override // org.chromium.support_lib_boundary.util.b
    public final void k0(int i7) {
        if ((i7 & 8) != 0) {
            ((C1052d) this.f16293q.f16209b).b();
        }
        this.f16292p.show(i7 & (-9));
    }

    public final void q0(int i7) {
        View decorView = this.f16294r.getDecorView();
        decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
    }

    public final void r0(int i7) {
        View decorView = this.f16294r.getDecorView();
        decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
    }

    public u0(Window window, C1052d c1052d) {
        this(window.getInsetsController(), c1052d);
        this.f16294r = window;
    }
}
