package N7;

import O7.M;
import android.view.View;
import androidx.camera.video.u;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetDelegate f6118a;

    public h(SheetDelegate sheetDelegate) {
        this.f6118a = sheetDelegate;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onSlide(View bottomSheet, float f10) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onStateChanged(View bottomSheet, int i7) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        int i10 = SheetDelegate.f25393p;
        SheetDelegate sheetDelegate = this.f6118a;
        sheetDelegate.getClass();
        int i11 = 1;
        boolean z3 = i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6;
        Screen screen = sheetDelegate.f25394a;
        if (z3) {
            int size = screen.getSheetDetents().f6120a.size();
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        throw new IllegalArgumentException(u.h(i7, "[RNScreens] Invalid state ", size, " for detentCount "));
                    }
                    if (i7 == 3) {
                        i11 = 2;
                    } else if (i7 == 4) {
                        i11 = 0;
                    } else if (i7 == 5) {
                        i11 = -1;
                    } else if (i7 != 6) {
                        throw new IllegalArgumentException(u.h(i7, "[RNScreens] Invalid state ", size, " for detentCount "));
                    }
                } else if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            throw new IllegalArgumentException(u.h(i7, "[RNScreens] Invalid state ", size, " for detentCount "));
                        }
                        i11 = -1;
                    } else {
                        i11 = 0;
                    }
                }
            } else if (i7 != 3) {
                if (i7 != 5) {
                    throw new IllegalArgumentException(u.h(i7, "[RNScreens] Invalid state ", size, " for detentCount "));
                }
                i11 = -1;
            } else {
                i11 = 0;
            }
            sheetDelegate.f25400g = i11;
        }
        int i12 = sheetDelegate.f25400g;
        int surfaceId = UIManagerHelper.getSurfaceId(screen.reactContext);
        EventDispatcher reactEventDispatcher = screen.getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new M(surfaceId, screen.getId(), i12, z3));
        }
        if (z3) {
            screen.e();
        }
        if (i7 == 5) {
            Fragment fragment = screen.getFragment();
            Intrinsics.f(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
            ((ScreenStackFragment) fragment).g();
        }
    }
}
