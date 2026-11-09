package com.transsnet.palmpay.core.ui.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes3.dex */
public class DragView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f28130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f28131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Callback f28132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Rect f28134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28136g;

    public interface Callback {
        void onDragOver();

        void touchDown();
    }

    public DragView(Context context) {
        super(context);
        this.f28133d = SizeUtils.dp2px(5.0f);
        this.f28134e = null;
        this.f28135f = false;
        this.f28136g = false;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        F6.d.h("DragView", 3, "onInterceptTouchEvent = " + motionEvent.getAction());
        int action = motionEvent.getAction();
        if (action == 0) {
            Callback callback = this.f28132c;
            if (callback != null) {
                callback.touchDown();
            }
            F6.d.h("DragView", 3, "event.getX(): " + motionEvent.getX() + ",getWidth() = " + getWidth());
            this.f28135f = false;
            this.f28136g = false;
            this.f28130a = motionEvent.getX();
            this.f28131b = motionEvent.getY();
        } else {
            if (action == 1) {
                if (this.f28135f) {
                    Rect rect = this.f28134e;
                    Property property = View.TRANSLATION_X;
                    Property property2 = View.TRANSLATION_Y;
                    if (rect != null) {
                        float translationY = getTranslationY();
                        float translationX = getTranslationX();
                        F6.d.h("DragView", 3, "autoMoveBack: " + translationX + " " + translationY);
                        F6.d.h("DragView", 3, "autoMoveBack: getX " + getX() + " " + getY());
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<DragView, Float>) property, translationX, 0.0f);
                        int screenWidth = ScreenUtils.getScreenWidth();
                        int i7 = screenWidth / 2;
                        float x3 = getX() - translationX;
                        z3 = true;
                        float width = ((screenWidth - x3) - getWidth()) - x3;
                        F6.d.h("DragView", 3, "autoMoveBack: initX " + x3);
                        float f10 = (float) i7;
                        if (x3 > f10) {
                            F6.d.h("DragView", 3, "autoMoveBack: Right side " + width);
                            if (getX() < f10) {
                                objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<DragView, Float>) property, translationX, width);
                            }
                        } else {
                            F6.d.h("DragView", 3, "autoMoveBack: Left side " + width);
                            if (getX() > f10) {
                                objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<DragView, Float>) property, translationX, width);
                            }
                        }
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<DragView, Float>) property2, translationY, 0.0f);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setDuration(200L);
                        AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat);
                        Rect rect2 = this.f28134e;
                        if (translationY < rect2.top || translationY > rect2.bottom) {
                            builderPlay.with(objectAnimatorOfFloat2);
                        }
                        animatorSet.start();
                    } else {
                        z3 = true;
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, (Property<DragView, Float>) property, getTranslationX(), 0.0f);
                        objectAnimatorOfFloat3.setDuration(200L);
                        objectAnimatorOfFloat3.start();
                        float translationY2 = getTranslationY();
                        if (translationY2 > 0.0f) {
                            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, (Property<DragView, Float>) property2, translationY2, 0.0f);
                            objectAnimatorOfFloat4.setDuration(200L);
                            objectAnimatorOfFloat4.start();
                        } else {
                            int screenHeight = (int) (ScreenUtils.getScreenHeight() * 0.4f);
                            if (translationY2 < 0.0f && Math.abs(translationY2) > screenHeight) {
                                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this, (Property<DragView, Float>) property2, translationY2, -screenHeight);
                                objectAnimatorOfFloat5.setDuration(200L);
                                objectAnimatorOfFloat5.start();
                            }
                        }
                    }
                    SPUtils.getInstance().put("DragViewY", getTranslationY());
                    Callback callback2 = this.f28132c;
                    if (callback2 != null) {
                        callback2.onDragOver();
                    }
                    if (!this.f28136g) {
                        return z3;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (action != 2) {
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        float x7 = motionEvent.getX() - this.f28130a;
        float y8 = motionEvent.getY() - this.f28131b;
        F6.d.h("DragView", 3, "moveX: " + x7 + ", moveY = " + y8);
        F6.d.h("DragView", 4, "event.getX(): " + motionEvent.getX() + ", mDownX = " + this.f28130a + " event.getY(): " + motionEvent.getY() + ", mDownY = " + this.f28131b);
        if (Math.abs(x7) > r8 && Math.abs(y8) > 0) {
            this.f28135f = true;
            float translationX2 = getTranslationX() + x7;
            float translationY3 = getTranslationY() + y8;
            setTranslationX(translationX2);
            setTranslationY(translationY3);
            float fAbs = Math.abs(translationX2);
            float f11 = this.f28133d;
            if (fAbs >= f11 || Math.abs(translationY3) >= f11) {
                this.f28136g = false;
            } else {
                this.f28136g = true;
            }
            F6.d.h("DragView", 3, "Math.abs(getTranslationX() + moveX) = " + Math.abs(getTranslationX() + x7) + ",  Math.abs(getTranslationY() + moveY) = " + Math.abs(getTranslationY() + y8) + ",  movedShort = " + this.f28136g);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setCallback(Callback callback) {
        this.f28132c = callback;
    }

    public void setMoveAllowedRect(Rect rect) {
        this.f28134e = rect;
    }

    public void setWidth(int width) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
        layoutParams.width = width;
        setLayoutParams(layoutParams);
    }

    public DragView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f28133d = SizeUtils.dp2px(5.0f);
        this.f28134e = null;
        this.f28135f = false;
        this.f28136g = false;
    }
}
