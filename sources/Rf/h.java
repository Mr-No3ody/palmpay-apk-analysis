package Rf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class h {
    public static final void a(boolean z3, Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (z3) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}
