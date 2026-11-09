package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class c implements BasicMeasure$Measurer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f15708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f15715h;

    public c(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f15715h = constraintLayout;
        this.f15708a = constraintLayout2;
    }

    public static boolean a(int i7, int i10, int i11) {
        if (i7 == i10) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i7);
        View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i11 == size;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer
    public final void didMeasures() {
        ConstraintLayout constraintLayout = this.f15708a;
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            if (childAt instanceof Placeholder) {
                Placeholder placeholder = (Placeholder) childAt;
                if (placeholder.f15691b != null) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) placeholder.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) placeholder.f15691b.getLayoutParams();
                    Q.e eVar = layoutParams2.f15666q0;
                    eVar.i0 = 0;
                    Q.e eVar2 = layoutParams.f15666q0;
                    Q.d dVar = eVar2.f7453U[0];
                    Q.d dVar2 = Q.d.f7428a;
                    if (dVar != dVar2) {
                        eVar2.P(eVar.r());
                    }
                    Q.e eVar3 = layoutParams.f15666q0;
                    if (eVar3.f7453U[1] != dVar2) {
                        eVar3.M(layoutParams2.f15666q0.l());
                    }
                    layoutParams2.f15666q0.i0 = 8;
                }
            }
        }
        int size = constraintLayout.mConstraintHelpers.size();
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((ConstraintHelper) constraintLayout.mConstraintHelpers.get(i10)).getClass();
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer
    public final void measure(Q.e eVar, R.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i7;
        boolean z3;
        int measuredWidth;
        int baseline;
        int i10;
        if (eVar == null) {
            return;
        }
        if (eVar.i0 == 8 && !eVar.f7438F) {
            bVar.f7856e = 0;
            bVar.f7857f = 0;
            bVar.f7858g = 0;
            return;
        }
        if (eVar.f7454V == null) {
            return;
        }
        Q.d dVar = bVar.f7852a;
        Q.d dVar2 = bVar.f7853b;
        int i11 = bVar.f7854c;
        int i12 = bVar.f7855d;
        int i13 = this.f15709b + this.f15710c;
        int i14 = this.f15711d;
        View view = eVar.f7472h0;
        int iOrdinal = dVar.ordinal();
        Q.c cVar = eVar.f7444L;
        Q.c cVar2 = eVar.f7442J;
        if (iOrdinal == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else if (iOrdinal == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f15713f, i14, -2);
        } else if (iOrdinal == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f15713f, i14, -2);
            boolean z8 = eVar.f7490r == 1;
            int i15 = bVar.f7861j;
            if (i15 == 1 || i15 == 2) {
                boolean z10 = view.getMeasuredHeight() == eVar.l();
                if (bVar.f7861j == 2 || !z8 || ((z8 && z10) || (view instanceof Placeholder) || eVar.B())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.r(), 1073741824);
                }
            }
        } else if (iOrdinal != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i16 = this.f15713f;
            int i17 = cVar2 != null ? cVar2.f7425g : 0;
            if (cVar != null) {
                i17 += cVar.f7425g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i16, i14 + i17, -1);
        }
        int iOrdinal2 = dVar2.ordinal();
        if (iOrdinal2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else if (iOrdinal2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f15714g, i13, -2);
        } else if (iOrdinal2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f15714g, i13, -2);
            boolean z11 = eVar.f7492s == 1;
            int i18 = bVar.f7861j;
            if (i18 == 1 || i18 == 2) {
                boolean z12 = view.getMeasuredWidth() == eVar.r();
                if (bVar.f7861j == 2 || !z11 || ((z11 && z12) || (view instanceof Placeholder) || eVar.C())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.l(), 1073741824);
                }
            }
        } else if (iOrdinal2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i19 = this.f15714g;
            int i20 = cVar2 != null ? eVar.f7443K.f7425g : 0;
            if (cVar != null) {
                i20 += eVar.f7445M.f7425g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i19, i13 + i20, -1);
        }
        Q.f fVar = (Q.f) eVar.f7454V;
        ConstraintLayout constraintLayout = this.f15715h;
        if (fVar != null && Q.k.c(constraintLayout.mOptimizationLevel, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) && view.getMeasuredWidth() == eVar.r() && view.getMeasuredWidth() < fVar.r() && view.getMeasuredHeight() == eVar.l() && view.getMeasuredHeight() < fVar.l() && view.getBaseline() == eVar.c0 && !eVar.A() && a(eVar.f7440H, iMakeMeasureSpec, eVar.r()) && a(eVar.f7441I, iMakeMeasureSpec2, eVar.l())) {
            bVar.f7856e = eVar.r();
            bVar.f7857f = eVar.l();
            bVar.f7858g = eVar.c0;
            return;
        }
        Q.d dVar3 = Q.d.f7430c;
        boolean z13 = dVar == dVar3;
        boolean z14 = dVar2 == dVar3;
        Q.d dVar4 = Q.d.f7431d;
        Q.d dVar5 = Q.d.f7428a;
        boolean z15 = dVar2 == dVar4 || dVar2 == dVar5;
        boolean z16 = dVar == dVar4 || dVar == dVar5;
        boolean z17 = z13 && eVar.f7457Y > 0.0f;
        boolean z18 = z14 && eVar.f7457Y > 0.0f;
        if (view == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        int i21 = bVar.f7861j;
        if (i21 != 1 && i21 != 2 && z13 && eVar.f7490r == 0 && z14 && eVar.f7492s == 0) {
            z3 = false;
            measuredWidth = 0;
            baseline = 0;
            i10 = -1;
            iMax = 0;
        } else {
            if ((view instanceof VirtualLayout) && (eVar instanceof Q.m)) {
                ((VirtualLayout) view).q((Q.m) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            eVar.f7440H = iMakeMeasureSpec;
            eVar.f7441I = iMakeMeasureSpec2;
            eVar.f7469g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i22 = eVar.f7495u;
            int iMax2 = i22 > 0 ? Math.max(i22, measuredWidth2) : measuredWidth2;
            int i23 = eVar.f7496v;
            if (i23 > 0) {
                iMax2 = Math.min(i23, iMax2);
            }
            int i24 = eVar.f7498x;
            iMax = i24 > 0 ? Math.max(i24, measuredHeight) : measuredHeight;
            boolean z19 = z16;
            int i25 = eVar.f7499y;
            if (i25 > 0) {
                iMax = Math.min(i25, iMax);
            }
            if (!Q.k.c(constraintLayout.mOptimizationLevel, 1)) {
                if (z17 && z15) {
                    iMax2 = (int) ((iMax * eVar.f7457Y) + 0.5f);
                } else if (z18 && z19) {
                    iMax = (int) ((iMax2 / eVar.f7457Y) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z3 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    i7 = 1073741824;
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                } else {
                    i7 = 1073741824;
                }
                if (measuredHeight != iMax) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i7);
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                eVar.f7440H = iMakeMeasureSpec;
                eVar.f7441I = iMakeMeasureSpec2;
                z3 = false;
                eVar.f7469g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i10 = -1;
        }
        boolean z20 = baseline != i10 ? true : z3;
        if (measuredWidth != bVar.f7854c || iMax != bVar.f7855d) {
            z3 = true;
        }
        bVar.f7860i = z3;
        boolean z21 = layoutParams.c0 ? true : z20;
        if (z21 && baseline != -1 && eVar.c0 != baseline) {
            bVar.f7860i = true;
        }
        bVar.f7856e = measuredWidth;
        bVar.f7857f = iMax;
        bVar.f7859h = z21;
        bVar.f7858g = baseline;
    }
}
