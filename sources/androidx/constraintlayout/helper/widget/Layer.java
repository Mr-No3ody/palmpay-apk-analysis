package androidx.constraintlayout.helper.widget;

import Q.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f15160A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f15161B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f15162C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f15163H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f15164L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f15165M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final boolean f15166Q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15167j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public View[] f15168k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f15169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f15170p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f15171p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f15172q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f15173r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f15174s0;
    public ConstraintLayout t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f15175v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f15176w;

    public Layer(Context context) {
        super(context);
        this.f15167j = Float.NaN;
        this.f15169o = Float.NaN;
        this.f15170p = Float.NaN;
        this.f15175v = 1.0f;
        this.f15176w = 1.0f;
        this.f15160A = Float.NaN;
        this.f15161B = Float.NaN;
        this.f15162C = Float.NaN;
        this.f15163H = Float.NaN;
        this.f15164L = Float.NaN;
        this.f15165M = Float.NaN;
        this.f15166Q = true;
        this.f15168k0 = null;
        this.f15171p0 = 0.0f;
        this.f15172q0 = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.ConstraintLayout_Layout_android_visibility) {
                    this.f15173r0 = true;
                } else if (index == p.ConstraintLayout_Layout_android_elevation) {
                    this.f15174s0 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m() {
        r();
        this.f15160A = Float.NaN;
        this.f15161B = Float.NaN;
        e eVar = ((ConstraintLayout.LayoutParams) getLayoutParams()).f15666q0;
        eVar.P(0);
        eVar.M(0);
        q();
        layout(((int) this.f15164L) - getPaddingLeft(), ((int) this.f15165M) - getPaddingTop(), getPaddingRight() + ((int) this.f15162C), getPaddingBottom() + ((int) this.f15163H));
        s();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n(ConstraintLayout constraintLayout) {
        this.t = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f15170p = rotation;
        } else {
            if (Float.isNaN(this.f15170p)) {
                return;
            }
            this.f15170p = rotation;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t = (ConstraintLayout) getParent();
        if (this.f15173r0 || this.f15174s0) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i7 = 0; i7 < this.f15603b; i7++) {
                View viewById = this.t.getViewById(this.f15602a[i7]);
                if (viewById != null) {
                    if (this.f15173r0) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f15174s0 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final void q() {
        if (this.t == null) {
            return;
        }
        if (this.f15166Q || Float.isNaN(this.f15160A) || Float.isNaN(this.f15161B)) {
            if (!Float.isNaN(this.f15167j) && !Float.isNaN(this.f15169o)) {
                this.f15161B = this.f15169o;
                this.f15160A = this.f15167j;
                return;
            }
            View[] viewArrI = i(this.t);
            int left = viewArrI[0].getLeft();
            int top2 = viewArrI[0].getTop();
            int right = viewArrI[0].getRight();
            int bottom = viewArrI[0].getBottom();
            for (int i7 = 0; i7 < this.f15603b; i7++) {
                View view = viewArrI[i7];
                left = Math.min(left, view.getLeft());
                top2 = Math.min(top2, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f15162C = right;
            this.f15163H = bottom;
            this.f15164L = left;
            this.f15165M = top2;
            if (Float.isNaN(this.f15167j)) {
                this.f15160A = (left + right) / 2;
            } else {
                this.f15160A = this.f15167j;
            }
            if (Float.isNaN(this.f15169o)) {
                this.f15161B = (top2 + bottom) / 2;
            } else {
                this.f15161B = this.f15169o;
            }
        }
    }

    public final void r() {
        int i7;
        if (this.t == null || (i7 = this.f15603b) == 0) {
            return;
        }
        View[] viewArr = this.f15168k0;
        if (viewArr == null || viewArr.length != i7) {
            this.f15168k0 = new View[i7];
        }
        for (int i10 = 0; i10 < this.f15603b; i10++) {
            this.f15168k0[i10] = this.t.getViewById(this.f15602a[i10]);
        }
    }

    public final void s() {
        if (this.t == null) {
            return;
        }
        if (this.f15168k0 == null) {
            r();
        }
        q();
        double radians = Float.isNaN(this.f15170p) ? 0.0d : Math.toRadians(this.f15170p);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f10 = this.f15175v;
        float f11 = f10 * fCos;
        float f12 = this.f15176w;
        float f13 = (-f12) * fSin;
        float f14 = f10 * fSin;
        float f15 = f12 * fCos;
        for (int i7 = 0; i7 < this.f15603b; i7++) {
            View view = this.f15168k0[i7];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f16 = right - this.f15160A;
            float f17 = bottom - this.f15161B;
            float f18 = (((f13 * f17) + (f11 * f16)) - f16) + this.f15171p0;
            float f19 = (((f15 * f17) + (f16 * f14)) - f17) + this.f15172q0;
            view.setTranslationX(f18);
            view.setTranslationY(f19);
            view.setScaleY(this.f15176w);
            view.setScaleX(this.f15175v);
            if (!Float.isNaN(this.f15170p)) {
                view.setRotation(this.f15170p);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        d();
    }

    @Override // android.view.View
    public void setPivotX(float pivotX) {
        this.f15167j = pivotX;
        s();
    }

    @Override // android.view.View
    public void setPivotY(float pivotY) {
        this.f15169o = pivotY;
        s();
    }

    @Override // android.view.View
    public void setRotation(float angle) {
        this.f15170p = angle;
        s();
    }

    @Override // android.view.View
    public void setScaleX(float scaleX) {
        this.f15175v = scaleX;
        s();
    }

    @Override // android.view.View
    public void setScaleY(float scaleY) {
        this.f15176w = scaleY;
        s();
    }

    @Override // android.view.View
    public void setTranslationX(float dx) {
        this.f15171p0 = dx;
        s();
    }

    @Override // android.view.View
    public void setTranslationY(float dy) {
        this.f15172q0 = dy;
        s();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        d();
    }

    public Layer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15167j = Float.NaN;
        this.f15169o = Float.NaN;
        this.f15170p = Float.NaN;
        this.f15175v = 1.0f;
        this.f15176w = 1.0f;
        this.f15160A = Float.NaN;
        this.f15161B = Float.NaN;
        this.f15162C = Float.NaN;
        this.f15163H = Float.NaN;
        this.f15164L = Float.NaN;
        this.f15165M = Float.NaN;
        this.f15166Q = true;
        this.f15168k0 = null;
        this.f15171p0 = 0.0f;
        this.f15172q0 = 0.0f;
    }

    public Layer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15167j = Float.NaN;
        this.f15169o = Float.NaN;
        this.f15170p = Float.NaN;
        this.f15175v = 1.0f;
        this.f15176w = 1.0f;
        this.f15160A = Float.NaN;
        this.f15161B = Float.NaN;
        this.f15162C = Float.NaN;
        this.f15163H = Float.NaN;
        this.f15164L = Float.NaN;
        this.f15165M = Float.NaN;
        this.f15166Q = true;
        this.f15168k0 = null;
        this.f15171p0 = 0.0f;
        this.f15172q0 = 0.0f;
    }
}
