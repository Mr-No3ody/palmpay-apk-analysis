package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q.f f15426a = new Q.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q.f f15427b = new Q.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.widget.m f15428c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.widget.m f15429d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f15432g;

    public r(MotionLayout motionLayout) {
        this.f15432g = motionLayout;
    }

    public static void c(Q.f fVar, Q.f fVar2) {
        Q.e jVar;
        ArrayList<Q.e> arrayList = fVar.f7517u0;
        HashMap map = new HashMap();
        map.put(fVar, fVar2);
        fVar2.f7517u0.clear();
        fVar2.g(fVar, map);
        for (Q.e eVar : arrayList) {
            if (eVar instanceof Q.a) {
                jVar = new Q.a();
            } else if (eVar instanceof Q.i) {
                jVar = new Q.i();
            } else if (eVar instanceof Q.h) {
                jVar = new Q.h();
            } else if (eVar instanceof Q.l) {
                jVar = new Q.l();
            } else {
                jVar = eVar instanceof Helper ? new Q.j() : new Q.e();
            }
            fVar2.f7517u0.add(jVar);
            Q.e eVar2 = jVar.f7454V;
            if (eVar2 != null) {
                ((Q.f) eVar2).f7517u0.remove(jVar);
                jVar.D();
            }
            jVar.f7454V = fVar2;
            map.put(eVar, jVar);
        }
        for (Q.e eVar3 : arrayList) {
            ((Q.e) map.get(eVar3)).g(eVar3, map);
        }
    }

    public static Q.e d(Q.f fVar, View view) {
        if (fVar.f7472h0 == view) {
            return fVar;
        }
        ArrayList arrayList = fVar.f7517u0;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Q.e eVar = (Q.e) arrayList.get(i7);
            if (eVar.f7472h0 == view) {
                return eVar;
            }
        }
        return null;
    }

    public final void a() {
        int i7;
        SparseArray sparseArray;
        int[] iArr;
        int i10;
        Interpolator interpolatorLoadInterpolator;
        MotionLayout motionLayout = this.f15432g;
        int childCount = motionLayout.getChildCount();
        motionLayout.f15305p.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = motionLayout.getChildAt(i11);
            m mVar = new m(childAt);
            int id2 = childAt.getId();
            iArr2[i11] = id2;
            sparseArray2.put(id2, mVar);
            motionLayout.f15305p.put(childAt, mVar);
        }
        int i12 = 0;
        while (i12 < childCount) {
            View childAt2 = motionLayout.getChildAt(i12);
            m mVar2 = (m) motionLayout.f15305p.get(childAt2);
            if (mVar2 == null) {
                i7 = childCount;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i10 = i12;
            } else {
                androidx.constraintlayout.widget.m mVar3 = this.f15428c;
                v vVar = mVar2.f15386f;
                if (mVar3 != null) {
                    Q.e eVarD = d(this.f15426a, childAt2);
                    if (eVarD != null) {
                        Rect rectC = MotionLayout.c(motionLayout, eVarD);
                        androidx.constraintlayout.widget.m mVar4 = this.f15428c;
                        int width = motionLayout.getWidth();
                        iArr = iArr2;
                        int height = motionLayout.getHeight();
                        i10 = i12;
                        int i13 = mVar4.f15855c;
                        sparseArray = sparseArray2;
                        if (i13 != 0) {
                            m.j(rectC, mVar2.f15381a, i13, width, height);
                        }
                        vVar.f15451c = 0.0f;
                        vVar.f15452d = 0.0f;
                        mVar2.i(vVar);
                        i7 = childCount;
                        vVar.e(rectC.left, rectC.top, rectC.width(), rectC.height());
                        androidx.constraintlayout.widget.h hVarK = mVar4.k(mVar2.f15383c);
                        vVar.a(hVarK);
                        androidx.constraintlayout.widget.j jVar = hVarK.f15746d;
                        mVar2.f15392l = jVar.f15823g;
                        mVar2.f15388h.c(rectC, mVar4, i13, mVar2.f15383c);
                        mVar2.f15375B = hVarK.f15748f.f15844i;
                        mVar2.f15377D = jVar.f15826j;
                        mVar2.f15378E = jVar.f15825i;
                        Context context = mVar2.f15382b.getContext();
                        int i14 = jVar.f15828l;
                        String str = jVar.f15827k;
                        int i15 = jVar.f15829m;
                        if (i14 == -2) {
                            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i15);
                        } else if (i14 == -1) {
                            interpolatorLoadInterpolator = new l(O.e.d(str), 0);
                        } else if (i14 == 0) {
                            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                        } else if (i14 == 1) {
                            interpolatorLoadInterpolator = new AccelerateInterpolator();
                        } else if (i14 == 2) {
                            interpolatorLoadInterpolator = new DecelerateInterpolator();
                        } else if (i14 != 4) {
                            interpolatorLoadInterpolator = i14 != 5 ? null : new OvershootInterpolator();
                        } else {
                            interpolatorLoadInterpolator = new BounceInterpolator();
                        }
                        mVar2.f15379F = interpolatorLoadInterpolator;
                    } else {
                        i7 = childCount;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i10 = i12;
                        if (motionLayout.f15281Q != 0) {
                            Log.e("MotionLayout", J3.a.p() + "no widget for  " + J3.a.s(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                } else {
                    i7 = childCount;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i10 = i12;
                }
                if (this.f15429d != null) {
                    Q.e eVarD2 = d(this.f15427b, childAt2);
                    if (eVarD2 != null) {
                        Rect rectC2 = MotionLayout.c(motionLayout, eVarD2);
                        androidx.constraintlayout.widget.m mVar5 = this.f15429d;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        int i16 = mVar5.f15855c;
                        if (i16 != 0) {
                            m.j(rectC2, mVar2.f15381a, i16, width2, height2);
                            rectC2 = mVar2.f15381a;
                        }
                        v vVar2 = mVar2.f15387g;
                        vVar2.f15451c = 1.0f;
                        vVar2.f15452d = 1.0f;
                        mVar2.i(vVar2);
                        vVar2.e(rectC2.left, rectC2.top, rectC2.width(), rectC2.height());
                        vVar2.a(mVar5.k(mVar2.f15383c));
                        mVar2.f15389i.c(rectC2, mVar5, i16, mVar2.f15383c);
                    } else if (motionLayout.f15281Q != 0) {
                        Log.e("MotionLayout", J3.a.p() + "no widget for  " + J3.a.s(childAt2) + " (" + childAt2.getClass().getName() + ")");
                    }
                }
            }
            i12 = i10 + 1;
            iArr2 = iArr;
            sparseArray2 = sparseArray;
            childCount = i7;
        }
        int[] iArr3 = iArr2;
        int i17 = childCount;
        int i18 = 0;
        while (true) {
            SparseArray sparseArray3 = sparseArray2;
            if (i18 >= i17) {
                return;
            }
            sparseArray2 = sparseArray3;
            m mVar6 = (m) sparseArray2.get(iArr3[i18]);
            int i19 = mVar6.f15386f.f15459p;
            if (i19 != -1) {
                m mVar7 = (m) sparseArray2.get(i19);
                mVar6.f15386f.g(mVar7, mVar7.f15386f);
                mVar6.f15387g.g(mVar7, mVar7.f15387g);
            }
            i18++;
        }
    }

    public final void b(int i7, int i10) {
        MotionLayout motionLayout = this.f15432g;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.f15299f == motionLayout.getStartState()) {
            Q.f fVar = this.f15427b;
            androidx.constraintlayout.widget.m mVar = this.f15429d;
            motionLayout.resolveSystem(fVar, optimizationLevel, (mVar == null || mVar.f15855c == 0) ? i7 : i10, (mVar == null || mVar.f15855c == 0) ? i10 : i7);
            androidx.constraintlayout.widget.m mVar2 = this.f15428c;
            if (mVar2 != null) {
                Q.f fVar2 = this.f15426a;
                int i11 = mVar2.f15855c;
                int i12 = i11 == 0 ? i7 : i10;
                if (i11 == 0) {
                    i7 = i10;
                }
                motionLayout.resolveSystem(fVar2, optimizationLevel, i12, i7);
                return;
            }
            return;
        }
        androidx.constraintlayout.widget.m mVar3 = this.f15428c;
        if (mVar3 != null) {
            Q.f fVar3 = this.f15426a;
            int i13 = mVar3.f15855c;
            motionLayout.resolveSystem(fVar3, optimizationLevel, i13 == 0 ? i7 : i10, i13 == 0 ? i10 : i7);
        }
        Q.f fVar4 = this.f15427b;
        androidx.constraintlayout.widget.m mVar4 = this.f15429d;
        int i14 = (mVar4 == null || mVar4.f15855c == 0) ? i7 : i10;
        if (mVar4 == null || mVar4.f15855c == 0) {
            i7 = i10;
        }
        motionLayout.resolveSystem(fVar4, optimizationLevel, i14, i7);
    }

    public final void e(androidx.constraintlayout.widget.m mVar, androidx.constraintlayout.widget.m mVar2) {
        this.f15428c = mVar;
        this.f15429d = mVar2;
        this.f15426a = new Q.f();
        this.f15427b = new Q.f();
        Q.f fVar = this.f15426a;
        MotionLayout motionLayout = this.f15432g;
        BasicMeasure$Measurer basicMeasure$Measurer = ((ConstraintLayout) motionLayout).mLayoutWidget.f7521y0;
        fVar.f7521y0 = basicMeasure$Measurer;
        fVar.f7519w0.f7869f = basicMeasure$Measurer;
        Q.f fVar2 = this.f15427b;
        BasicMeasure$Measurer basicMeasure$Measurer2 = ((ConstraintLayout) motionLayout).mLayoutWidget.f7521y0;
        fVar2.f7521y0 = basicMeasure$Measurer2;
        fVar2.f7519w0.f7869f = basicMeasure$Measurer2;
        this.f15426a.f7517u0.clear();
        this.f15427b.f7517u0.clear();
        c(((ConstraintLayout) motionLayout).mLayoutWidget, this.f15426a);
        c(((ConstraintLayout) motionLayout).mLayoutWidget, this.f15427b);
        if (motionLayout.f15259A > 0.5d) {
            if (mVar != null) {
                g(this.f15426a, mVar);
            }
            g(this.f15427b, mVar2);
        } else {
            g(this.f15427b, mVar2);
            if (mVar != null) {
                g(this.f15426a, mVar);
            }
        }
        this.f15426a.f7522z0 = motionLayout.isRtl();
        Q.f fVar3 = this.f15426a;
        fVar3.f7518v0.t(fVar3);
        this.f15427b.f7522z0 = motionLayout.isRtl();
        Q.f fVar4 = this.f15427b;
        fVar4.f7518v0.t(fVar4);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            int i7 = layoutParams.width;
            Q.d dVar = Q.d.f7429b;
            if (i7 == -2) {
                this.f15426a.N(dVar);
                this.f15427b.N(dVar);
            }
            if (layoutParams.height == -2) {
                this.f15426a.O(dVar);
                this.f15427b.O(dVar);
            }
        }
    }

    public final void f() {
        HashMap map;
        MotionLayout motionLayout = this.f15432g;
        int i7 = motionLayout.f15301i;
        int i10 = motionLayout.f15302j;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        motionLayout.f15280P0 = mode;
        motionLayout.f15282Q0 = mode2;
        motionLayout.getOptimizationLevel();
        b(i7, i10);
        int i11 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            b(i7, i10);
            motionLayout.f15275L0 = this.f15426a.r();
            motionLayout.f15277M0 = this.f15426a.l();
            motionLayout.f15278N0 = this.f15427b.r();
            int iL = this.f15427b.l();
            motionLayout.f15279O0 = iL;
            motionLayout.f15273K0 = (motionLayout.f15275L0 == motionLayout.f15278N0 && motionLayout.f15277M0 == iL) ? false : true;
        }
        int i12 = motionLayout.f15275L0;
        int i13 = motionLayout.f15277M0;
        int i14 = motionLayout.f15280P0;
        if (i14 == Integer.MIN_VALUE || i14 == 0) {
            i12 = (int) ((motionLayout.f15283R0 * (motionLayout.f15278N0 - i12)) + i12);
        }
        int i15 = motionLayout.f15282Q0;
        if (i15 == Integer.MIN_VALUE || i15 == 0) {
            i13 = (int) ((motionLayout.f15283R0 * (motionLayout.f15279O0 - i13)) + i13);
        }
        Q.f fVar = this.f15426a;
        motionLayout.resolveMeasuredDimension(i7, i10, i12, i13, fVar.f7509I0 || this.f15427b.f7509I0, fVar.f7510J0 || this.f15427b.f7510J0);
        int childCount = motionLayout.getChildCount();
        motionLayout.Z0.a();
        motionLayout.f15274L = true;
        SparseArray sparseArray = new SparseArray();
        int i16 = 0;
        while (true) {
            map = motionLayout.f15305p;
            if (i16 >= childCount) {
                break;
            }
            View childAt = motionLayout.getChildAt(i16);
            sparseArray.put(childAt.getId(), (m) map.get(childAt));
            i16++;
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        x xVar = motionLayout.f15290a.f15485c;
        int i17 = xVar != null ? xVar.f15480p : -1;
        if (i17 != -1) {
            for (int i18 = 0; i18 < childCount; i18++) {
                m mVar = (m) map.get(motionLayout.getChildAt(i18));
                if (mVar != null) {
                    mVar.f15374A = i17;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[map.size()];
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            m mVar2 = (m) map.get(motionLayout.getChildAt(i20));
            int i21 = mVar2.f15386f.f15459p;
            if (i21 != -1) {
                sparseBooleanArray.put(i21, true);
                iArr[i19] = mVar2.f15386f.f15459p;
                i19++;
            }
        }
        if (motionLayout.f15265D0 != null) {
            for (int i22 = 0; i22 < i19; i22++) {
                m mVar3 = (m) map.get(motionLayout.findViewById(iArr[i22]));
                if (mVar3 != null) {
                    motionLayout.f15290a.f(mVar3);
                }
            }
            Iterator it = motionLayout.f15265D0.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).onPreSetup(motionLayout, map);
            }
            for (int i23 = 0; i23 < i19; i23++) {
                m mVar4 = (m) map.get(motionLayout.findViewById(iArr[i23]));
                if (mVar4 != null) {
                    mVar4.k(width, height, motionLayout.getNanoTime());
                }
            }
        } else {
            for (int i24 = 0; i24 < i19; i24++) {
                m mVar5 = (m) map.get(motionLayout.findViewById(iArr[i24]));
                if (mVar5 != null) {
                    motionLayout.f15290a.f(mVar5);
                    mVar5.k(width, height, motionLayout.getNanoTime());
                }
            }
        }
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt2 = motionLayout.getChildAt(i25);
            m mVar6 = (m) map.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && mVar6 != null) {
                motionLayout.f15290a.f(mVar6);
                mVar6.k(width, height, motionLayout.getNanoTime());
            }
        }
        x xVar2 = motionLayout.f15290a.f15485c;
        float f10 = xVar2 != null ? xVar2.f15473i : 0.0f;
        if (f10 != 0.0f) {
            boolean z3 = ((double) f10) < 0.0d;
            float fAbs = Math.abs(f10);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i26 = 0; i26 < childCount; i26++) {
                m mVar7 = (m) map.get(motionLayout.getChildAt(i26));
                if (!Float.isNaN(mVar7.f15392l)) {
                    for (int i27 = 0; i27 < childCount; i27++) {
                        m mVar8 = (m) map.get(motionLayout.getChildAt(i27));
                        if (!Float.isNaN(mVar8.f15392l)) {
                            fMin = Math.min(fMin, mVar8.f15392l);
                            fMax = Math.max(fMax, mVar8.f15392l);
                        }
                    }
                    while (i11 < childCount) {
                        m mVar9 = (m) map.get(motionLayout.getChildAt(i11));
                        if (!Float.isNaN(mVar9.f15392l)) {
                            mVar9.f15394n = 1.0f / (1.0f - fAbs);
                            if (z3) {
                                mVar9.f15393m = fAbs - (((fMax - mVar9.f15392l) / (fMax - fMin)) * fAbs);
                            } else {
                                mVar9.f15393m = fAbs - (((mVar9.f15392l - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i11++;
                    }
                    return;
                }
                v vVar = mVar7.f15387g;
                float f11 = vVar.f15453e;
                float f12 = vVar.f15454f;
                float f13 = z3 ? f12 - f11 : f12 + f11;
                fMin2 = Math.min(fMin2, f13);
                fMax2 = Math.max(fMax2, f13);
            }
            while (i11 < childCount) {
                m mVar10 = (m) map.get(motionLayout.getChildAt(i11));
                v vVar2 = mVar10.f15387g;
                float f14 = vVar2.f15453e;
                float f15 = vVar2.f15454f;
                float f16 = z3 ? f15 - f14 : f15 + f14;
                mVar10.f15394n = 1.0f / (1.0f - fAbs);
                mVar10.f15393m = fAbs - (((f16 - fMin2) * fAbs) / (fMax2 - fMin2));
                i11++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(Q.f fVar, androidx.constraintlayout.widget.m mVar) {
        androidx.constraintlayout.widget.h hVar;
        androidx.constraintlayout.widget.h hVar2;
        SparseArray<Q.e> sparseArray = new SparseArray<>();
        Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
        sparseArray.clear();
        sparseArray.put(0, fVar);
        MotionLayout motionLayout = this.f15432g;
        sparseArray.put(motionLayout.getId(), fVar);
        if (mVar != null && mVar.f15855c != 0) {
            Q.f fVar2 = this.f15427b;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z3 = MotionLayout.f1;
            motionLayout.resolveSystem(fVar2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        for (Q.e eVar : fVar.f7517u0) {
            eVar.f7475j0 = true;
            sparseArray.put(eVar.f7472h0.getId(), eVar);
        }
        for (Q.e eVar2 : fVar.f7517u0) {
            View view = eVar2.f7472h0;
            int id2 = view.getId();
            HashMap map = mVar.f15858f;
            if (map.containsKey(Integer.valueOf(id2)) && (hVar2 = (androidx.constraintlayout.widget.h) map.get(Integer.valueOf(id2))) != null) {
                hVar2.a(layoutParams);
            }
            eVar2.P(mVar.k(view.getId()).f15747e.f15781c);
            eVar2.M(mVar.k(view.getId()).f15747e.f15782d);
            if (view instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) view;
                int id3 = constraintHelper.getId();
                HashMap map2 = mVar.f15858f;
                if (map2.containsKey(Integer.valueOf(id3)) && (hVar = (androidx.constraintlayout.widget.h) map2.get(Integer.valueOf(id3))) != null && (eVar2 instanceof Q.j)) {
                    constraintHelper.k(hVar, (Q.j) eVar2, layoutParams, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).p();
                }
            }
            layoutParams.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z8 = MotionLayout.f1;
            motionLayout.applyConstraintsFromLayoutParams(false, view, eVar2, layoutParams, sparseArray);
            if (mVar.k(view.getId()).f15745c.f15832c == 1) {
                eVar2.i0 = view.getVisibility();
            } else {
                eVar2.i0 = mVar.k(view.getId()).f15745c.f15831b;
            }
        }
        for (Q.e eVar3 : fVar.f7517u0) {
            if (eVar3 instanceof Q.m) {
                ConstraintHelper constraintHelper2 = (ConstraintHelper) eVar3.f7472h0;
                Helper helper = (Helper) eVar3;
                constraintHelper2.o(helper, sparseArray);
                Q.m mVar2 = (Q.m) helper;
                for (int i7 = 0; i7 < mVar2.f7569v0; i7++) {
                    Q.e eVar4 = mVar2.f7568u0[i7];
                    if (eVar4 != null) {
                        eVar4.f7439G = true;
                    }
                }
            }
        }
    }
}
