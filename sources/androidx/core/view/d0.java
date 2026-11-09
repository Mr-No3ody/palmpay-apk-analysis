package androidx.core.view;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f16210a;

    public d0(int i7, Interpolator interpolator, long j6) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16210a = new b0(Va.a.i(i7, interpolator, j6));
        } else {
            this.f16210a = new Z(i7, interpolator, j6);
        }
    }
}
