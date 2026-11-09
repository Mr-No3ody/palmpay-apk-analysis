package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i7, int i10, boolean z3) {
        this.startAlpha = i7;
        this.endAlpha = i10;
        this.endOnTop = z3;
    }

    public static FadeModeResult endOnTop(int i7, int i10) {
        return new FadeModeResult(i7, i10, true);
    }

    public static FadeModeResult startOnTop(int i7, int i10) {
        return new FadeModeResult(i7, i10, false);
    }
}
