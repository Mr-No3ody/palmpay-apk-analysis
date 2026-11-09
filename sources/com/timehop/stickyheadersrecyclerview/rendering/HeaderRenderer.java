package com.timehop.stickyheadersrecyclerview.rendering;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.timehop.stickyheadersrecyclerview.calculation.DimensionCalculator;
import com.timehop.stickyheadersrecyclerview.util.OrientationProvider;

/* JADX INFO: loaded from: classes3.dex */
public class HeaderRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DimensionCalculator f25561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrientationProvider f25562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f25563c;

    public HeaderRenderer(OrientationProvider orientationProvider) {
        DimensionCalculator dimensionCalculator = new DimensionCalculator();
        this.f25563c = new Rect();
        this.f25562b = orientationProvider;
        this.f25561a = dimensionCalculator;
    }

    public void drawHeader(RecyclerView recyclerView, Canvas canvas, View view, Rect rect) {
        canvas.save();
        if (recyclerView.getLayoutManager().getClipToPadding()) {
            DimensionCalculator dimensionCalculator = this.f25561a;
            Rect rect2 = this.f25563c;
            dimensionCalculator.initMargins(rect2, view);
            if (this.f25562b.getOrientation(recyclerView) == 1) {
                rect2.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), (recyclerView.getWidth() - recyclerView.getPaddingRight()) - rect2.right, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                rect2.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - rect2.bottom);
            }
            canvas.clipRect(rect2);
        }
        canvas.translate(rect.left, rect.top);
        view.draw(canvas);
        canvas.restore();
    }
}
