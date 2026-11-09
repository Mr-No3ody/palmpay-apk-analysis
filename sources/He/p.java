package He;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearSmoothScroller;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends LinearSmoothScroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3907a;

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        return this.f3907a / displayMetrics.densityDpi;
    }
}
