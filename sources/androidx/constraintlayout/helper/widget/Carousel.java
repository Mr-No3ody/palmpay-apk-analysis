package androidx.constraintlayout.helper.widget;

import M7.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.A;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.x;
import androidx.constraintlayout.widget.h;
import androidx.constraintlayout.widget.m;
import androidx.constraintlayout.widget.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15129A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15130B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public MotionLayout f15131C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f15132H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f15133L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f15134M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f15135Q;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f15136k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f15137p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f15138q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f15139r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f15140s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f15141t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f15142u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Adapter f15143v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f15144v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f15145w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f15146w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final a f15147x0;

    public interface Adapter {
        int count();

        void onNewItem(int index);

        void populate(View view, int index);
    }

    public Carousel(Context context) {
        super(context);
        this.f15143v = null;
        this.f15145w = new ArrayList();
        this.f15129A = 0;
        this.f15130B = 0;
        this.f15132H = -1;
        this.f15133L = false;
        this.f15134M = -1;
        this.f15135Q = -1;
        this.f15136k0 = -1;
        this.f15137p0 = -1;
        this.f15138q0 = 0.9f;
        this.f15139r0 = 0;
        this.f15140s0 = 4;
        this.f15141t0 = 1;
        this.f15142u0 = 2.0f;
        this.f15144v0 = -1;
        this.f15146w0 = 200;
        this.f15147x0 = new a(this);
    }

    public int getCount() {
        Adapter adapter = this.f15143v;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f15130B;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        A a3;
        A a10;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i7 = 0; i7 < this.f15603b; i7++) {
                int i10 = this.f15602a[i7];
                View viewById = motionLayout.getViewById(i10);
                if (this.f15132H == i10) {
                    this.f15139r0 = i7;
                }
                this.f15145w.add(viewById);
            }
            this.f15131C = motionLayout;
            if (this.f15141t0 == 2) {
                x xVarO = motionLayout.o(this.f15135Q);
                if (xVarO != null && (a10 = xVarO.f15476l) != null) {
                    a10.f15194c = 5;
                }
                x xVarO2 = this.f15131C.o(this.f15134M);
                if (xVarO2 != null && (a3 = xVarO2.f15476l) != null) {
                    a3.f15194c = 5;
                }
            }
            s();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void onTransitionChange(MotionLayout motionLayout, int i7, int i10, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void onTransitionCompleted(MotionLayout motionLayout, int i7) {
        int i10 = this.f15130B;
        this.f15129A = i10;
        if (i7 == this.f15137p0) {
            this.f15130B = i10 + 1;
        } else if (i7 == this.f15136k0) {
            this.f15130B = i10 - 1;
        }
        if (this.f15133L) {
            if (this.f15130B >= this.f15143v.count()) {
                this.f15130B = 0;
            }
            if (this.f15130B < 0) {
                this.f15130B = this.f15143v.count() - 1;
            }
        } else {
            if (this.f15130B >= this.f15143v.count()) {
                this.f15130B = this.f15143v.count() - 1;
            }
            if (this.f15130B < 0) {
                this.f15130B = 0;
            }
        }
        if (this.f15129A != this.f15130B) {
            this.f15131C.post(this.f15147x0);
        }
    }

    public final void q(int i7, boolean z3) {
        MotionLayout motionLayout;
        x xVarO;
        if (i7 == -1 || (motionLayout = this.f15131C) == null || (xVarO = motionLayout.o(i7)) == null || z3 == (!xVarO.f15479o)) {
            return;
        }
        xVarO.f15479o = !z3;
    }

    public final void r(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.Carousel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.Carousel_carousel_firstView) {
                    this.f15132H = typedArrayObtainStyledAttributes.getResourceId(index, this.f15132H);
                } else if (index == p.Carousel_carousel_backwardTransition) {
                    this.f15134M = typedArrayObtainStyledAttributes.getResourceId(index, this.f15134M);
                } else if (index == p.Carousel_carousel_forwardTransition) {
                    this.f15135Q = typedArrayObtainStyledAttributes.getResourceId(index, this.f15135Q);
                } else if (index == p.Carousel_carousel_emptyViewsBehavior) {
                    this.f15140s0 = typedArrayObtainStyledAttributes.getInt(index, this.f15140s0);
                } else if (index == p.Carousel_carousel_previousState) {
                    this.f15136k0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15136k0);
                } else if (index == p.Carousel_carousel_nextState) {
                    this.f15137p0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15137p0);
                } else if (index == p.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f15138q0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15138q0);
                } else if (index == p.Carousel_carousel_touchUpMode) {
                    this.f15141t0 = typedArrayObtainStyledAttributes.getInt(index, this.f15141t0);
                } else if (index == p.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f15142u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15142u0);
                } else if (index == p.Carousel_carousel_infinite) {
                    this.f15133L = typedArrayObtainStyledAttributes.getBoolean(index, this.f15133L);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void s() {
        Adapter adapter = this.f15143v;
        if (adapter == null || this.f15131C == null || adapter.count() == 0) {
            return;
        }
        ArrayList arrayList = this.f15145w;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            int iCount = (this.f15130B + i7) - this.f15139r0;
            if (this.f15133L) {
                if (iCount < 0) {
                    int i10 = this.f15140s0;
                    if (i10 != 4) {
                        t(i10, view);
                    } else {
                        t(0, view);
                    }
                    if (iCount % this.f15143v.count() == 0) {
                        this.f15143v.populate(view, 0);
                    } else {
                        Adapter adapter2 = this.f15143v;
                        adapter2.populate(view, (iCount % this.f15143v.count()) + adapter2.count());
                    }
                } else if (iCount >= this.f15143v.count()) {
                    if (iCount == this.f15143v.count()) {
                        iCount = 0;
                    } else if (iCount > this.f15143v.count()) {
                        iCount %= this.f15143v.count();
                    }
                    int i11 = this.f15140s0;
                    if (i11 != 4) {
                        t(i11, view);
                    } else {
                        t(0, view);
                    }
                    this.f15143v.populate(view, iCount);
                } else {
                    t(0, view);
                    this.f15143v.populate(view, iCount);
                }
            } else if (iCount < 0) {
                t(this.f15140s0, view);
            } else if (iCount >= this.f15143v.count()) {
                t(this.f15140s0, view);
            } else {
                t(0, view);
                this.f15143v.populate(view, iCount);
            }
        }
        int i12 = this.f15144v0;
        if (i12 != -1 && i12 != this.f15130B) {
            this.f15131C.post(new s(this, 14));
        } else if (i12 == this.f15130B) {
            this.f15144v0 = -1;
        }
        if (this.f15134M == -1 || this.f15135Q == -1 || this.f15133L) {
            return;
        }
        int iCount2 = this.f15143v.count();
        if (this.f15130B == 0) {
            q(this.f15134M, false);
        } else {
            q(this.f15134M, true);
            this.f15131C.setTransition(this.f15134M);
        }
        if (this.f15130B == iCount2 - 1) {
            q(this.f15135Q, false);
        } else {
            q(this.f15135Q, true);
            this.f15131C.setTransition(this.f15135Q);
        }
    }

    public void setAdapter(Adapter adapter) {
        this.f15143v = adapter;
    }

    public final void t(int i7, View view) {
        h hVarL;
        MotionLayout motionLayout = this.f15131C;
        if (motionLayout == null) {
            return;
        }
        for (int i10 : motionLayout.getConstraintSetIds()) {
            m mVarN = this.f15131C.n(i10);
            if (mVarN != null && (hVarL = mVarN.l(view.getId())) != null) {
                hVarL.f15745c.f15832c = 1;
                view.setVisibility(i7);
            }
        }
    }

    public Carousel(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15143v = null;
        this.f15145w = new ArrayList();
        this.f15129A = 0;
        this.f15130B = 0;
        this.f15132H = -1;
        this.f15133L = false;
        this.f15134M = -1;
        this.f15135Q = -1;
        this.f15136k0 = -1;
        this.f15137p0 = -1;
        this.f15138q0 = 0.9f;
        this.f15139r0 = 0;
        this.f15140s0 = 4;
        this.f15141t0 = 1;
        this.f15142u0 = 2.0f;
        this.f15144v0 = -1;
        this.f15146w0 = 200;
        this.f15147x0 = new a(this);
        r(context, attrs);
    }

    public Carousel(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15143v = null;
        this.f15145w = new ArrayList();
        this.f15129A = 0;
        this.f15130B = 0;
        this.f15132H = -1;
        this.f15133L = false;
        this.f15134M = -1;
        this.f15135Q = -1;
        this.f15136k0 = -1;
        this.f15137p0 = -1;
        this.f15138q0 = 0.9f;
        this.f15139r0 = 0;
        this.f15140s0 = 4;
        this.f15141t0 = 1;
        this.f15142u0 = 2.0f;
        this.f15144v0 = -1;
        this.f15146w0 = 200;
        this.f15147x0 = new a(this);
        r(context, attrs);
    }
}
