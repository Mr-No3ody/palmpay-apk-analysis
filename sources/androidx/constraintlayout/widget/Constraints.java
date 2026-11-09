package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f15675a;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public m getConstraintSet() {
        if (this.f15675a == null) {
            this.f15675a = new m();
        }
        m mVar = this.f15675a;
        mVar.getClass();
        int childCount = getChildCount();
        HashMap map = mVar.f15858f;
        map.clear();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (mVar.f15857e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id2))) {
                map.put(Integer.valueOf(id2), new h());
            }
            h hVar = (h) map.get(Integer.valueOf(id2));
            if (hVar != null) {
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    hVar.d(id2, layoutParams);
                    if (constraintHelper instanceof Barrier) {
                        i iVar = hVar.f15747e;
                        iVar.i0 = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        iVar.f15789g0 = barrier.getType();
                        iVar.f15794j0 = barrier.getReferencedIds();
                        iVar.f15791h0 = barrier.getMargin();
                    }
                }
                hVar.d(id2, layoutParams);
            }
        }
        return this.f15675a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attrs) {
        super(context, attrs);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* JADX INFO: renamed from: A0, reason: collision with root package name */
        public final float f15676A0;

        /* JADX INFO: renamed from: B0, reason: collision with root package name */
        public final float f15677B0;

        /* JADX INFO: renamed from: C0, reason: collision with root package name */
        public final float f15678C0;

        /* JADX INFO: renamed from: D0, reason: collision with root package name */
        public final float f15679D0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final float f15680r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f15681s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final float f15682t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final float f15683u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public final float f15684v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final float f15685w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final float f15686x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final float f15687y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public final float f15688z0;

        public LayoutParams() {
            super(-2, -2);
            this.f15680r0 = 1.0f;
            this.f15681s0 = false;
            this.f15682t0 = 0.0f;
            this.f15683u0 = 0.0f;
            this.f15684v0 = 0.0f;
            this.f15685w0 = 0.0f;
            this.f15686x0 = 1.0f;
            this.f15687y0 = 1.0f;
            this.f15688z0 = 0.0f;
            this.f15676A0 = 0.0f;
            this.f15677B0 = 0.0f;
            this.f15678C0 = 0.0f;
            this.f15679D0 = 0.0f;
        }

        public LayoutParams(Context c6, AttributeSet attrs) {
            super(c6, attrs);
            this.f15680r0 = 1.0f;
            this.f15681s0 = false;
            this.f15682t0 = 0.0f;
            this.f15683u0 = 0.0f;
            this.f15684v0 = 0.0f;
            this.f15685w0 = 0.0f;
            this.f15686x0 = 1.0f;
            this.f15687y0 = 1.0f;
            this.f15688z0 = 0.0f;
            this.f15676A0 = 0.0f;
            this.f15677B0 = 0.0f;
            this.f15678C0 = 0.0f;
            this.f15679D0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = c6.obtainStyledAttributes(attrs, p.ConstraintSet);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.ConstraintSet_android_alpha) {
                    this.f15680r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15680r0);
                } else if (index == p.ConstraintSet_android_elevation) {
                    this.f15682t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15682t0);
                    this.f15681s0 = true;
                } else if (index == p.ConstraintSet_android_rotationX) {
                    this.f15684v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15684v0);
                } else if (index == p.ConstraintSet_android_rotationY) {
                    this.f15685w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15685w0);
                } else if (index == p.ConstraintSet_android_rotation) {
                    this.f15683u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15683u0);
                } else if (index == p.ConstraintSet_android_scaleX) {
                    this.f15686x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15686x0);
                } else if (index == p.ConstraintSet_android_scaleY) {
                    this.f15687y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15687y0);
                } else if (index == p.ConstraintSet_android_transformPivotX) {
                    this.f15688z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15688z0);
                } else if (index == p.ConstraintSet_android_transformPivotY) {
                    this.f15676A0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15676A0);
                } else if (index == p.ConstraintSet_android_translationX) {
                    this.f15677B0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15677B0);
                } else if (index == p.ConstraintSet_android_translationY) {
                    this.f15678C0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15678C0);
                } else if (index == p.ConstraintSet_android_translationZ) {
                    this.f15679D0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15679D0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
