package com.transsnet.palmpay.custom_view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes4.dex */
public class ReboundScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final /* synthetic */ int f31096J0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f31097A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f31098B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f31099C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final boolean f31100D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final boolean f31101E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final Rect f31102F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public float f31103G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f31104H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f31105I0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f31106y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public View f31107z0;

    public ReboundScrollView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31106y0 = 100;
        this.f31102F0 = new Rect();
        this.f31104H0 = false;
        this.f31105I0 = false;
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvReboundScrollView, i7, 0);
            this.f31106y0 = typedArrayObtainStyledAttributes.getInt(x.CvReboundScrollView_cv_rs_animation_time, 200);
            this.f31100D0 = typedArrayObtainStyledAttributes.getBoolean(x.CvReboundScrollView_cv_rs_can_pull_up, true);
            this.f31101E0 = typedArrayObtainStyledAttributes.getBoolean(x.CvReboundScrollView_cv_rs_can_pull_down, true);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void d(int i7) {
        super.d(i7 / 2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.f31107z0 == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            Rect rect = this.f31102F0;
            if (action == 1) {
                if (this.f31099C0) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f31107z0.getTop(), rect.top);
                    valueAnimatorOfInt.setDuration(this.f31106y0);
                    valueAnimatorOfInt.setInterpolator(new OvershootInterpolator());
                    valueAnimatorOfInt.addUpdateListener(new Gb.z(this, 8));
                    valueAnimatorOfInt.addListener(new G7.j(this, 9));
                    valueAnimatorOfInt.start();
                    this.f31098B0 = false;
                    this.f31097A0 = false;
                    this.f31099C0 = false;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f31099C0) {
                        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(this.f31107z0.getTop(), rect.top);
                        valueAnimatorOfInt2.setDuration(this.f31106y0);
                        valueAnimatorOfInt2.setInterpolator(new OvershootInterpolator());
                        valueAnimatorOfInt2.addUpdateListener(new Gb.z(this, 8));
                        valueAnimatorOfInt2.addListener(new G7.j(this, 9));
                        valueAnimatorOfInt2.start();
                        this.f31098B0 = false;
                        this.f31097A0 = false;
                        this.f31099C0 = false;
                    }
                }
            } else if (this.f31098B0 || this.f31097A0) {
                int y8 = (int) (motionEvent.getY() - this.f31103G0);
                boolean z8 = this.f31098B0;
                if ((z8 && y8 > 0) || (((z3 = this.f31097A0) && y8 < 0) || (z3 && z8))) {
                    int iCos = (int) (Math.cos((((double) (y8 / rect.height())) * 3.141592653589793d) / 3.0d) * 0.30000001192092896d * ((double) y8));
                    this.f31107z0.layout(rect.left, rect.top + iCos, rect.right, rect.bottom + iCos);
                    this.f31099C0 = true;
                }
            } else {
                this.f31103G0 = motionEvent.getY();
                this.f31098B0 = this.f31101E0 ? this.f31104H0 : false;
                this.f31097A0 = this.f31100D0 ? this.f31105I0 : false;
            }
        } else {
            this.f31098B0 = this.f31101E0 ? this.f31104H0 : false;
            this.f31097A0 = this.f31100D0 ? this.f31105I0 : false;
            this.f31103G0 = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        if (getChildCount() > 0) {
            this.f31107z0 = getChildAt(0);
        }
        View view = this.f31107z0;
        if (view == null) {
            return;
        }
        this.f31102F0.set(view.getLeft(), this.f31107z0.getTop(), this.f31107z0.getRight(), this.f31107z0.getBottom());
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onOverScrolled(int i7, int i10, boolean z3, boolean z8) {
        super.onOverScrolled(i7, i10, z3, z8);
        F6.d.h("ReboundScrollView", 2, "scrollY = " + i10 + ", clampedY = " + z8);
        if (z8) {
            if (i10 == 0) {
                this.f31104H0 = z8;
                this.f31105I0 = false;
            } else {
                this.f31104H0 = false;
                this.f31105I0 = z8;
            }
        }
    }

    public ReboundScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReboundScrollView(Context context) {
        this(context, null);
    }
}
