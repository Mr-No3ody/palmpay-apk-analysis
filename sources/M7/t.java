package M7;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.ScreenFooter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScreenFooter f5854a;

    public t(ScreenFooter screenFooter) {
        this.f5854a = screenFooter;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onSlide(View bottomSheet, float f10) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        float fMax = Math.max(f10, 0.0f);
        ScreenFooter screenFooter = this.f5854a;
        screenFooter.f25317d = fMax;
        if (screenFooter.f25316c) {
            return;
        }
        screenFooter.d(screenFooter.f25315b, screenFooter.getReactHeight(), ScreenFooter.c(screenFooter, screenFooter.f25317d), screenFooter.f25318e);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onStateChanged(View bottomSheet, int i7) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6) {
            ScreenFooter screenFooter = this.f5854a;
            if (i7 == 3 || i7 == 4 || i7 == 6) {
                screenFooter.d(screenFooter.f25315b, screenFooter.getReactHeight(), screenFooter.g(i7), screenFooter.f25318e);
            }
            int i10 = ScreenFooter.f25313i;
            screenFooter.getClass();
        }
    }
}
