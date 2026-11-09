package androidx.customview.widget;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f16384a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f16385b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FocusStrategy$BoundsAdapter f16387d;

    public c(boolean z3, FocusStrategy$BoundsAdapter focusStrategy$BoundsAdapter) {
        this.f16386c = z3;
        this.f16387d = focusStrategy$BoundsAdapter;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        FocusStrategy$BoundsAdapter focusStrategy$BoundsAdapter = this.f16387d;
        Rect rect = this.f16384a;
        focusStrategy$BoundsAdapter.obtainBounds(obj, rect);
        Rect rect2 = this.f16385b;
        focusStrategy$BoundsAdapter.obtainBounds(obj2, rect2);
        int i7 = rect.top;
        int i10 = rect2.top;
        if (i7 < i10) {
            return -1;
        }
        if (i7 > i10) {
            return 1;
        }
        int i11 = rect.left;
        int i12 = rect2.left;
        boolean z3 = this.f16386c;
        if (i11 < i12) {
            return z3 ? 1 : -1;
        }
        if (i11 > i12) {
            return z3 ? -1 : 1;
        }
        int i13 = rect.bottom;
        int i14 = rect2.bottom;
        if (i13 < i14) {
            return -1;
        }
        if (i13 > i14) {
            return 1;
        }
        int i15 = rect.right;
        int i16 = rect2.right;
        if (i15 < i16) {
            return z3 ? 1 : -1;
        }
        if (i15 > i16) {
            return z3 ? -1 : 1;
        }
        return 0;
    }
}
