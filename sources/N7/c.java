package N7;

import Gb.z;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.bottomsheet.DimmingView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Screen f6102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DimmingView f6103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f6104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ValueAnimator f6107f;

    public c(Screen screen, DimmingView viewToAnimate, float f10) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(viewToAnimate, "viewToAnimate");
        this.f6102a = screen;
        this.f6103b = viewToAnimate;
        this.f6104c = a(screen.getSheetLargestUndimmedDetentIndex());
        float fA = a(kotlin.ranges.b.c(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().f6120a.size() - 1));
        this.f6105d = fA;
        this.f6106e = fA - this.f6104c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f10);
        valueAnimatorOfFloat.setDuration(1L);
        valueAnimatorOfFloat.addUpdateListener(new z(this, 2));
        this.f6107f = valueAnimatorOfFloat;
    }

    public final float a(int i7) {
        Screen screen = this.f6102a;
        int size = screen.getSheetDetents().f6120a.size();
        if (size == 1) {
            return (i7 == -1 || i7 != 0) ? -1.0f : 1.0f;
        }
        if (size == 2) {
            if (i7 == -1) {
                return -1.0f;
            }
            if (i7 != 0) {
                return i7 != 1 ? -1.0f : 1.0f;
            }
            return 0.0f;
        }
        if (size != 3 || i7 == -1) {
            return -1.0f;
        }
        if (i7 == 0) {
            return 0.0f;
        }
        if (i7 != 1) {
            return i7 != 2 ? -1.0f : 1.0f;
        }
        BottomSheetBehavior<Screen> sheetBehavior = screen.getSheetBehavior();
        Intrinsics.e(sheetBehavior);
        return sheetBehavior.getHalfExpandedRatio();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onSlide(View bottomSheet, float f10) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        float f11 = this.f6104c;
        if (f11 >= f10 || f10 >= this.f6105d) {
            return;
        }
        this.f6107f.setCurrentFraction((f10 - f11) / this.f6106e);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onStateChanged(View bottomSheet, int i7) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (i7 == 1 || i7 == 2) {
            Screen screen = this.f6102a;
            this.f6104c = a(screen.getSheetLargestUndimmedDetentIndex());
            float fA = a(kotlin.ranges.b.c(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().f6120a.size() - 1));
            this.f6105d = fA;
            this.f6106e = fA - this.f6104c;
        }
    }
}
