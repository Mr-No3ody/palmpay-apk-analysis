package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15689a;

    public Guideline(Context context) {
        super(context);
        this.f15689a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean filter) {
        this.f15689a = filter;
    }

    public void setGuidelineBegin(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f15689a && layoutParams.f15636a == margin) {
            return;
        }
        layoutParams.f15636a = margin;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f15689a && layoutParams.f15638b == margin) {
            return;
        }
        layoutParams.f15638b = margin;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f15689a && layoutParams.f15639c == ratio) {
            return;
        }
        layoutParams.f15639c = ratio;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public Guideline(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15689a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15689a = true;
        super.setVisibility(8);
    }
}
