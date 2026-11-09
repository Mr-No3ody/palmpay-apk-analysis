package androidx.core.view;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f10, float f11, boolean z3);

    boolean dispatchNestedPreFling(float f10, float f11);

    boolean dispatchNestedPreScroll(int i7, int i10, @Nullable int[] iArr, @Nullable int[] iArr2);

    boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, @Nullable int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z3);

    boolean startNestedScroll(int i7);

    void stopNestedScroll();
}
