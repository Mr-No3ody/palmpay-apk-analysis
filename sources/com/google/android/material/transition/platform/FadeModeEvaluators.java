package com.google.android.material.transition.platform;

import C0.G;
import androidx.annotation.RequiresApi;
import com.horcrux.svg.d0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
class FadeModeEvaluators {
    private static final FadeModeEvaluator IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f11, f12, f10));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f11, f12, f10), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f11, f12, f10), TransitionUtils.lerp(0, 255, f11, f12, f10));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            float fE = d0.e(f12, f11, f13, f11);
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f11, fE, f10), TransitionUtils.lerp(0, 255, fE, f12, f10));
        }
    };

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i7, boolean z3) {
        if (i7 == 0) {
            return z3 ? IN : OUT;
        }
        if (i7 == 1) {
            return z3 ? OUT : IN;
        }
        if (i7 == 2) {
            return CROSS;
        }
        if (i7 == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException(G.m(i7, "Invalid fade mode: "));
    }
}
