package androidx.core.view;

import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends r0 {
    @Override // org.chromium.support_lib_boundary.util.b
    public final void c0(boolean z3) {
        if (!z3) {
            r0(16);
            return;
        }
        Window window = this.f16283p;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        q0(16);
    }
}
