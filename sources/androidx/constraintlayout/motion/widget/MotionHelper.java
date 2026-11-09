package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionHelperInterface {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15256j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15257o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f15258p;
    public View[] t;

    public MotionHelper(Context context) {
        super(context);
        this.f15256j = false;
        this.f15257o = false;
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public float getProgress() {
        return this.f15258p;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isDecorator() {
        return this instanceof MotionEffect;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public final boolean isUseOnHide() {
        return this.f15257o;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public final boolean isUsedOnShow() {
        return this.f15256j;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.p.MotionHelper);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == androidx.constraintlayout.widget.p.MotionHelper_onShow) {
                    this.f15256j = typedArrayObtainStyledAttributes.getBoolean(index, this.f15256j);
                } else if (index == androidx.constraintlayout.widget.p.MotionHelper_onHide) {
                    this.f15257o = typedArrayObtainStyledAttributes.getBoolean(index, this.f15257o);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public final void onFinishedMotionScene(MotionLayout motionLayout) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public final void onPostDraw(Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public final void onPreDraw(Canvas canvas) {
    }

    public void onPreSetup(MotionLayout motionLayout, HashMap map) {
    }

    public void onTransitionChange(MotionLayout motionLayout, int i7, int i10, float f10) {
    }

    public void onTransitionCompleted(MotionLayout motionLayout, int i7) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void onTransitionStarted(MotionLayout motionLayout, int i7, int i10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void onTransitionTrigger(MotionLayout motionLayout, int i7, boolean z3, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public void setProgress(float progress) {
        this.f15258p = progress;
        int i7 = 0;
        if (this.f15603b > 0) {
            this.t = i((ConstraintLayout) getParent());
            while (i7 < this.f15603b) {
                View view = this.t[i7];
                i7++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i7 < childCount) {
            boolean z3 = viewGroup.getChildAt(i7) instanceof MotionHelper;
            i7++;
        }
    }

    public MotionHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15256j = false;
        this.f15257o = false;
        j(attrs);
    }

    public MotionHelper(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15256j = false;
        this.f15257o = false;
        j(attrs);
    }
}
