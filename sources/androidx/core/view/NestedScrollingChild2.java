package androidx.core.view;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface NestedScrollingChild2 extends NestedScrollingChild {
    boolean dispatchNestedPreScroll(int i7, int i10, @Nullable int[] iArr, @Nullable int[] iArr2, int i11);

    boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, @Nullable int[] iArr, int i13);

    boolean hasNestedScrollingParent(int i7);

    boolean startNestedScroll(int i7, int i10);

    void stopNestedScroll(int i7);
}
