package androidx.core.view;

import android.view.View;
import android.view.Window;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: loaded from: classes.dex */
public class r0 extends org.chromium.support_lib_boundary.util.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Window f16283p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1052d f16284q;

    public r0(Window window, C1052d c1052d) {
        this.f16283p = window;
        this.f16284q = c1052d;
    }

    @Override // org.chromium.support_lib_boundary.util.b
    public final void G(int i7) {
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                if (i10 == 1) {
                    q0(4);
                } else if (i10 == 2) {
                    q0(2);
                } else if (i10 == 8) {
                    ((C1052d) this.f16284q.f16209b).a();
                }
            }
        }
    }

    @Override // org.chromium.support_lib_boundary.util.b
    public final boolean N() {
        return (this.f16283p.getDecorView().getSystemUiVisibility() & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0;
    }

    @Override // org.chromium.support_lib_boundary.util.b
    public final void d0(boolean z3) {
        if (!z3) {
            r0(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            return;
        }
        Window window = this.f16283p;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        q0(UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }

    @Override // org.chromium.support_lib_boundary.util.b
    public final void h0() {
        this.f16283p.getDecorView().setTag(356039078, 2);
        r0(2048);
        q0(4096);
    }

    @Override // org.chromium.support_lib_boundary.util.b
    public final void k0(int i7) {
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                if (i10 == 1) {
                    r0(4);
                    this.f16283p.clearFlags(1024);
                } else if (i10 == 2) {
                    r0(2);
                } else if (i10 == 8) {
                    ((C1052d) this.f16284q.f16209b).b();
                }
            }
        }
    }

    public final void q0(int i7) {
        View decorView = this.f16283p.getDecorView();
        decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
    }

    public final void r0(int i7) {
        View decorView = this.f16283p.getDecorView();
        decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
    }
}
