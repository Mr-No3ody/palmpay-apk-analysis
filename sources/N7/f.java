package N7;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.q0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetDelegate f6113a;

    public f(SheetDelegate sheetDelegate) {
        this.f6113a = sheetDelegate;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onSlide(View bottomSheet, float f10) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onStateChanged(View bottomSheet, int i7) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (i7 == 4 && q0.h(null, bottomSheet.getRootWindowInsets()).f16277a.p(8)) {
            bottomSheet.requestFocus();
            int i10 = SheetDelegate.f25393p;
            InputMethodManager inputMethodManagerC = this.f6113a.c();
            if (inputMethodManagerC != null) {
                inputMethodManagerC.hideSoftInputFromWindow(bottomSheet.getWindowToken(), 0);
            }
        }
    }
}
