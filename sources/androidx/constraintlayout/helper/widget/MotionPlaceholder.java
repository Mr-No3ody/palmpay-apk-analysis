package androidx.constraintlayout.helper.widget;

import Q.l;
import Q.m;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.widget.VirtualLayout;

/* JADX INFO: loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {
    public MotionPlaceholder(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        this.f15605d = new l();
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i7, int i10) {
        q(null, i7, i10);
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

    public MotionPlaceholder(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MotionPlaceholder(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void o(Helper helper, SparseArray sparseArray) {
    }
}
