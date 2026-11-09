package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface ItemTouchUIUtil {
    @SuppressLint({"UnknownNullness"})
    void clearView(View view);

    @SuppressLint({"UnknownNullness"})
    void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i7, boolean z3);

    @SuppressLint({"UnknownNullness"})
    void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i7, boolean z3);

    @SuppressLint({"UnknownNullness"})
    void onSelected(View view);
}
