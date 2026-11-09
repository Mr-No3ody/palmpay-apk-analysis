package com.transsnet.palmpay.ui.view;

import B5.c;
import F6.d;
import G7.j;
import He.a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.U;
import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.custom_view.ObservableScrollView;

/* JADX INFO: loaded from: classes4.dex */
public class HomeScrollView extends ObservableScrollView {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public float f35293A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public float f35294B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public float f35295C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public DragView f35296D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final a f35297E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public long f35298F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final c f35299G0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public float f35300z0;

    public HomeScrollView(Context context) {
        super(context);
        this.f35299G0 = new c(this, 7);
        a aVar = new a(0, false);
        aVar.f3864b = false;
        this.f35297E0 = aVar;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f35293A0 = 0.0f;
            this.f35300z0 = 0.0f;
            this.f35294B0 = motionEvent.getX();
            this.f35295C0 = motionEvent.getY();
        } else if (action == 2) {
            float x3 = motionEvent.getX();
            float y8 = motionEvent.getY();
            this.f35300z0 = Math.abs(x3 - this.f35294B0) + this.f35300z0;
            float fAbs = Math.abs(y8 - this.f35295C0) + this.f35293A0;
            this.f35293A0 = fAbs;
            this.f35294B0 = x3;
            this.f35295C0 = y8;
            if (this.f35300z0 > fAbs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.transsnet.palmpay.custom_view.ObservableScrollView, androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        if (this.f35296D0 == null || Math.abs(i10 - i12) <= 5) {
            return;
        }
        a aVar = this.f35297E0;
        DragView dragView = this.f35296D0;
        int width = (dragView.getWidth() * 2) / 3;
        if (aVar.f3864b) {
            d.h("HomeScrollView", 3, "start animation bAnimating");
        } else {
            if (((U) aVar.f3866d) != null) {
                d.h("HomeScrollView", 3, "start animation cancel stop animation");
                ((U) aVar.f3866d).b();
            }
            if (((AnimatorSet) aVar.f3865c) == null) {
                aVar.f3864b = true;
                aVar.f3865c = new AnimatorSet();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(dragView, (Property<DragView, Float>) View.TRANSLATION_X, 0.0f, width);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(dragView, (Property<DragView, Float>) View.ALPHA, 1.0f, 0.7f, 0.6f);
                ObjectAnimator.ofFloat(dragView, (Property<DragView, Float>) View.SCALE_X, 1.0f, 0.7f, 0.6f);
                ((AnimatorSet) aVar.f3865c).playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                ((AnimatorSet) aVar.f3865c).setInterpolator(new DecelerateInterpolator());
                ((AnimatorSet) aVar.f3865c).addListener(new j(aVar, 1));
                ((AnimatorSet) aVar.f3865c).setDuration(400L);
                ((AnimatorSet) aVar.f3865c).setStartDelay(50L);
                d.h("HomeScrollView", 3, "start animation");
                ((AnimatorSet) aVar.f3865c).start();
            }
        }
        this.f35298F0 = System.currentTimeMillis();
        c cVar = this.f35299G0;
        removeCallbacks(cVar);
        postDelayed(cVar, 100L);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return zOnTouchEvent;
        }
        c cVar = this.f35299G0;
        removeCallbacks(cVar);
        postDelayed(cVar, 100L);
        return zOnTouchEvent;
    }

    public final void r() {
        DragView dragView = this.f35296D0;
        if (dragView != null) {
            dragView.setTranslationX(0.0f);
            this.f35296D0.setAlpha(1.0f);
            this.f35296D0.setScaleX(1.0f);
            this.f35296D0.setScaleY(1.0f);
            this.f35297E0.j(this.f35296D0);
            removeCallbacks(this.f35299G0);
        }
    }

    public void setDragView(DragView dragView) {
        this.f35296D0 = dragView;
    }

    public HomeScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35299G0 = new c(this, 7);
        a aVar = new a(0, false);
        aVar.f3864b = false;
        this.f35297E0 = aVar;
    }

    public HomeScrollView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f35299G0 = new c(this, 7);
        a aVar = new a(0, false);
        aVar.f3864b = false;
        this.f35297E0 = aVar;
    }
}
