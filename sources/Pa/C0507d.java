package Pa;

import androidx.recyclerview.widget.LinearSmoothScroller;

/* JADX INFO: renamed from: Pa.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0507d extends LinearSmoothScroller {
    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateDtToFit(int i7, int i10, int i11, int i12, int i13) {
        return ((i11 + i12) / 2) - ((i7 + i10) / 2);
    }
}
