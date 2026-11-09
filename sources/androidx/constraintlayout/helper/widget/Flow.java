package androidx.constraintlayout.helper.widget;

import Q.e;
import Q.h;
import Q.j;
import Q.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.p;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f15159p;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        this.f15159p = new h();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.ConstraintLayout_Layout_android_orientation) {
                    this.f15159p.Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == p.ConstraintLayout_Layout_android_padding) {
                    h hVar = this.f15159p;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar.f7578w0 = dimensionPixelSize;
                    hVar.f7579x0 = dimensionPixelSize;
                    hVar.f7580y0 = dimensionPixelSize;
                    hVar.f7581z0 = dimensionPixelSize;
                } else if (index == p.ConstraintLayout_Layout_android_paddingStart) {
                    h hVar2 = this.f15159p;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar2.f7580y0 = dimensionPixelSize2;
                    hVar2.f7571A0 = dimensionPixelSize2;
                    hVar2.f7572B0 = dimensionPixelSize2;
                } else if (index == p.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f15159p.f7581z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == p.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f15159p.f7571A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == p.ConstraintLayout_Layout_android_paddingTop) {
                    this.f15159p.f7578w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == p.ConstraintLayout_Layout_android_paddingRight) {
                    this.f15159p.f7572B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == p.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f15159p.f7579x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == p.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f15159p.f7556X0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == p.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f15159p.f7541H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == p.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f15159p.f7542I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == p.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f15159p.f7543J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == p.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f15159p.f7545L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == p.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f15159p.f7544K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == p.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f15159p.f7546M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == p.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f15159p.f7547N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == p.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f15159p.f7549P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == p.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f15159p.f7551R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == p.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f15159p.f7550Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == p.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f15159p.f7552S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == p.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f15159p.f7548O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == p.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f15159p.f7554V0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == p.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f15159p.f7555W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == p.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f15159p.T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == p.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f15159p.f7553U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == p.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f15159p.f7557Y0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f15605d = this.f15159p;
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(androidx.constraintlayout.widget.h hVar, j jVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        super.k(hVar, jVar, layoutParams, sparseArray);
        if (jVar instanceof h) {
            h hVar2 = (h) jVar;
            int i7 = layoutParams.f15631V;
            if (i7 != -1) {
                hVar2.Z0 = i7;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(e eVar, boolean z3) {
        h hVar = this.f15159p;
        int i7 = hVar.f7580y0;
        if (i7 > 0 || hVar.f7581z0 > 0) {
            if (z3) {
                hVar.f7571A0 = hVar.f7581z0;
                hVar.f7572B0 = i7;
            } else {
                hVar.f7571A0 = i7;
                hVar.f7572B0 = hVar.f7581z0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i7, int i10) {
        q(this.f15159p, i7, i10);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void q(m mVar, int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            mVar.T(mode, size, mode2, size2);
            setMeasuredDimension(mVar.f7574D0, mVar.f7575E0);
        }
    }

    public void setFirstHorizontalBias(float bias) {
        this.f15159p.f7549P0 = bias;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int style) {
        this.f15159p.f7543J0 = style;
        requestLayout();
    }

    public void setFirstVerticalBias(float bias) {
        this.f15159p.f7550Q0 = bias;
        requestLayout();
    }

    public void setFirstVerticalStyle(int style) {
        this.f15159p.f7544K0 = style;
        requestLayout();
    }

    public void setHorizontalAlign(int align) {
        this.f15159p.f7554V0 = align;
        requestLayout();
    }

    public void setHorizontalBias(float bias) {
        this.f15159p.f7547N0 = bias;
        requestLayout();
    }

    public void setHorizontalGap(int gap) {
        this.f15159p.T0 = gap;
        requestLayout();
    }

    public void setHorizontalStyle(int style) {
        this.f15159p.f7541H0 = style;
        requestLayout();
    }

    public void setLastHorizontalBias(float bias) {
        this.f15159p.f7551R0 = bias;
        requestLayout();
    }

    public void setLastHorizontalStyle(int style) {
        this.f15159p.f7545L0 = style;
        requestLayout();
    }

    public void setLastVerticalBias(float bias) {
        this.f15159p.f7552S0 = bias;
        requestLayout();
    }

    public void setLastVerticalStyle(int style) {
        this.f15159p.f7546M0 = style;
        requestLayout();
    }

    public void setMaxElementsWrap(int max) {
        this.f15159p.f7557Y0 = max;
        requestLayout();
    }

    public void setOrientation(int orientation) {
        this.f15159p.Z0 = orientation;
        requestLayout();
    }

    public void setPadding(int padding) {
        h hVar = this.f15159p;
        hVar.f7578w0 = padding;
        hVar.f7579x0 = padding;
        hVar.f7580y0 = padding;
        hVar.f7581z0 = padding;
        requestLayout();
    }

    public void setPaddingBottom(int paddingBottom) {
        this.f15159p.f7579x0 = paddingBottom;
        requestLayout();
    }

    public void setPaddingLeft(int paddingLeft) {
        this.f15159p.f7571A0 = paddingLeft;
        requestLayout();
    }

    public void setPaddingRight(int paddingRight) {
        this.f15159p.f7572B0 = paddingRight;
        requestLayout();
    }

    public void setPaddingTop(int paddingTop) {
        this.f15159p.f7578w0 = paddingTop;
        requestLayout();
    }

    public void setVerticalAlign(int align) {
        this.f15159p.f7555W0 = align;
        requestLayout();
    }

    public void setVerticalBias(float bias) {
        this.f15159p.f7548O0 = bias;
        requestLayout();
    }

    public void setVerticalGap(int gap) {
        this.f15159p.f7553U0 = gap;
        requestLayout();
    }

    public void setVerticalStyle(int style) {
        this.f15159p.f7542I0 = style;
        requestLayout();
    }

    public void setWrapMode(int mode) {
        this.f15159p.f7556X0 = mode;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Flow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
