package androidx.recyclerview.widget;

import I0.c;
import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.E;
import androidx.core.view.N;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class ItemTouchUIUtilImpl implements ItemTouchUIUtil {
    static final ItemTouchUIUtil INSTANCE = new ItemTouchUIUtilImpl();

    private static float findMaxElevation(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            if (childAt != view) {
                WeakHashMap weakHashMap = N.f16168a;
                float fE = E.e(childAt);
                if (fE > f10) {
                    f10 = fE;
                }
            }
        }
        return f10;
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void clearView(@NonNull View view) {
        Object tag = view.getTag(c.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = N.f16168a;
            E.l(view, fFloatValue);
        }
        view.setTag(c.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f10, float f11, int i7, boolean z3) {
        if (z3 && view.getTag(c.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = N.f16168a;
            Float fValueOf = Float.valueOf(E.e(view));
            E.l(view, findMaxElevation(recyclerView, view) + 1.0f);
            view.setTag(c.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f10, float f11, int i7, boolean z3) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onSelected(@NonNull View view) {
    }
}
