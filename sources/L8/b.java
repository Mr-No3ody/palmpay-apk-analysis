package L8;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearSmoothScroller;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends LinearSmoothScroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f5559a;

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        return this.f5559a / displayMetrics.densityDpi;
    }
}
