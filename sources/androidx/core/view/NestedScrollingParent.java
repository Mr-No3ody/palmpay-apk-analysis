package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(@NonNull View view, float f10, float f11, boolean z3);

    boolean onNestedPreFling(@NonNull View view, float f10, float f11);

    void onNestedPreScroll(@NonNull View view, int i7, int i10, @NonNull int[] iArr);

    void onNestedScroll(@NonNull View view, int i7, int i10, int i11, int i12);

    void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i7);

    boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i7);

    void onStopNestedScroll(@NonNull View view);
}
