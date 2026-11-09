package androidx.constraintlayout.motion.widget;

import N8.q0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    public static boolean f1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f15259A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f15260A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f15261B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ArrayList f15262B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f15263C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ArrayList f15264C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public ArrayList f15265D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public CopyOnWriteArrayList f15266E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f15267F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public long f15268G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f15269H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public float f15270H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f15271I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public float f15272J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f15273K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f15274L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f15275L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TransitionListener f15276M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f15277M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public int f15278N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f15279O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f15280P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f15281Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f15282Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public float f15283R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final O.e f15284S0;
    public boolean T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public t f15285U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public androidx.camera.video.internal.encoder.o f15286V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public final Rect f15287W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public boolean f15288X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public u f15289Y0;
    public final r Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f15290a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f15291a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f15292b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final RectF f15293b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f15294c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public View f15295c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15296d;
    public Matrix d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15297e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final ArrayList f15298e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15300g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15302j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public q f15303k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15304o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f15305p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f15306p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T.a f15307q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final p f15308r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public C1028a f15309s0;
    public long t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f15310t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f15311u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f15312v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f15313v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f15314w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f15315w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f15316x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public long f15317y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public float f15318z0;

    public interface MotionTracker {
        void addMovement(MotionEvent event);

        void clear();

        void computeCurrentVelocity(int units);

        void computeCurrentVelocity(int units, float maxVelocity);

        float getXVelocity();

        float getXVelocity(int id2);

        float getYVelocity();

        float getYVelocity(int id2);

        void recycle();
    }

    public interface TransitionListener {
        void onTransitionChange(MotionLayout motionLayout, int startId, int endId, float progress);

        void onTransitionCompleted(MotionLayout motionLayout, int currentId);

        void onTransitionStarted(MotionLayout motionLayout, int startId, int endId);

        void onTransitionTrigger(MotionLayout motionLayout, int triggerId, boolean positive, float progress);
    }

    public MotionLayout(@NonNull Context context) {
        super(context);
        this.f15294c = null;
        this.f15296d = 0.0f;
        this.f15297e = -1;
        this.f15299f = -1;
        this.f15300g = -1;
        this.f15301i = 0;
        this.f15302j = 0;
        this.f15304o = true;
        this.f15305p = new HashMap();
        this.t = 0L;
        this.f15312v = 1.0f;
        this.f15314w = 0.0f;
        this.f15259A = 0.0f;
        this.f15263C = 0.0f;
        this.f15274L = false;
        this.f15281Q = 0;
        this.f15306p0 = false;
        this.f15307q0 = new T.a();
        this.f15308r0 = new p(this);
        this.f15313v0 = false;
        this.f15260A0 = false;
        this.f15262B0 = null;
        this.f15264C0 = null;
        this.f15265D0 = null;
        this.f15266E0 = null;
        this.f15267F0 = 0;
        this.f15268G0 = -1L;
        this.f15270H0 = 0.0f;
        this.f15271I0 = 0;
        this.f15272J0 = 0.0f;
        this.f15273K0 = false;
        this.f15284S0 = new O.e(1);
        this.T0 = false;
        this.f15286V0 = null;
        new HashMap();
        this.f15287W0 = new Rect();
        this.f15288X0 = false;
        this.f15289Y0 = u.f15440a;
        this.Z0 = new r(this);
        this.f15291a1 = false;
        this.f15293b1 = new RectF();
        this.f15295c1 = null;
        this.d1 = null;
        this.f15298e1 = new ArrayList();
        q(null);
    }

    public static Rect c(MotionLayout motionLayout, Q.e eVar) {
        int iT = eVar.t();
        Rect rect = motionLayout.f15287W0;
        rect.top = iT;
        rect.left = eVar.s();
        rect.right = eVar.r() + rect.left;
        rect.bottom = eVar.l() + rect.top;
        return rect;
    }

    public final void A(int i7, int i10) {
        if (super.isAttachedToWindow()) {
            B(i7, i10);
            return;
        }
        if (this.f15285U0 == null) {
            this.f15285U0 = new t(this);
        }
        this.f15285U0.f15438d = i7;
    }

    public final void B(int i7, int i10) {
        C4.a aVar;
        y yVar = this.f15290a;
        if (yVar != null && (aVar = yVar.f15484b) != null) {
            int i11 = this.f15299f;
            float f10 = -1;
            androidx.constraintlayout.widget.r rVar = (androidx.constraintlayout.widget.r) ((SparseArray) aVar.f1156c).get(i7);
            if (rVar != null) {
                ArrayList arrayList = rVar.f15862b;
                int i12 = rVar.f15863c;
                if (f10 != -1.0f && f10 != -1.0f) {
                    Iterator it = arrayList.iterator();
                    androidx.constraintlayout.widget.s sVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (sVar != null) {
                                i11 = sVar.f15868e;
                                break;
                            } else {
                                i11 = i12;
                                break;
                            }
                        }
                        androidx.constraintlayout.widget.s sVar2 = (androidx.constraintlayout.widget.s) it.next();
                        if (sVar2.a(f10, f10)) {
                            if (i11 == sVar2.f15868e) {
                                break;
                            } else {
                                sVar = sVar2;
                            }
                        }
                    }
                } else if (i12 != i11) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            i11 = i12;
                            break;
                        }
                    } while (i11 != ((androidx.constraintlayout.widget.s) it2.next()).f15868e);
                }
            } else {
                i11 = i7;
            }
            if (i11 != -1) {
                i7 = i11;
            }
        }
        int i13 = this.f15299f;
        if (i13 == i7) {
            return;
        }
        if (this.f15297e == i7) {
            h(0.0f);
            if (i10 > 0) {
                this.f15312v = i10 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f15300g == i7) {
            h(1.0f);
            if (i10 > 0) {
                this.f15312v = i10 / 1000.0f;
                return;
            }
            return;
        }
        this.f15300g = i7;
        if (i13 != -1) {
            v(i13, i7);
            h(1.0f);
            this.f15259A = 0.0f;
            x();
            if (i10 > 0) {
                this.f15312v = i10 / 1000.0f;
                return;
            }
            return;
        }
        this.f15306p0 = false;
        this.f15263C = 1.0f;
        this.f15314w = 0.0f;
        this.f15259A = 0.0f;
        this.f15261B = getNanoTime();
        this.t = getNanoTime();
        this.f15269H = false;
        this.f15292b = null;
        if (i10 == -1) {
            this.f15312v = this.f15290a.c() / 1000.0f;
        }
        this.f15297e = -1;
        this.f15290a.p(-1, this.f15300g);
        SparseArray sparseArray = new SparseArray();
        if (i10 == 0) {
            this.f15312v = this.f15290a.c() / 1000.0f;
        } else if (i10 > 0) {
            this.f15312v = i10 / 1000.0f;
        }
        int childCount = getChildCount();
        HashMap map = this.f15305p;
        map.clear();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            map.put(childAt, new m(childAt));
            sparseArray.put(childAt.getId(), (m) map.get(childAt));
        }
        this.f15274L = true;
        androidx.constraintlayout.widget.m mVarB = this.f15290a.b(i7);
        r rVar2 = this.Z0;
        rVar2.e(null, mVarB);
        t();
        rVar2.a();
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            m mVar = (m) map.get(childAt2);
            if (mVar != null) {
                v vVar = mVar.f15386f;
                vVar.f15451c = 0.0f;
                vVar.f15452d = 0.0f;
                vVar.e(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                k kVar = mVar.f15388h;
                kVar.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                kVar.f15361c = childAt2.getVisibility();
                kVar.f15359a = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                kVar.f15362d = childAt2.getElevation();
                kVar.f15363e = childAt2.getRotation();
                kVar.f15364f = childAt2.getRotationX();
                kVar.f15365g = childAt2.getRotationY();
                kVar.f15366i = childAt2.getScaleX();
                kVar.f15367j = childAt2.getScaleY();
                kVar.f15368o = childAt2.getPivotX();
                kVar.f15369p = childAt2.getPivotY();
                kVar.t = childAt2.getTranslationX();
                kVar.f15370v = childAt2.getTranslationY();
                kVar.f15371w = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f15265D0 != null) {
            for (int i16 = 0; i16 < childCount; i16++) {
                m mVar2 = (m) map.get(getChildAt(i16));
                if (mVar2 != null) {
                    this.f15290a.f(mVar2);
                }
            }
            Iterator it3 = this.f15265D0.iterator();
            while (it3.hasNext()) {
                ((MotionHelper) it3.next()).onPreSetup(this, map);
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                m mVar3 = (m) map.get(getChildAt(i17));
                if (mVar3 != null) {
                    mVar3.k(width, height, getNanoTime());
                }
            }
        } else {
            for (int i18 = 0; i18 < childCount; i18++) {
                m mVar4 = (m) map.get(getChildAt(i18));
                if (mVar4 != null) {
                    this.f15290a.f(mVar4);
                    mVar4.k(width, height, getNanoTime());
                }
            }
        }
        x xVar = this.f15290a.f15485c;
        float f11 = xVar != null ? xVar.f15473i : 0.0f;
        if (f11 != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i19 = 0; i19 < childCount; i19++) {
                v vVar2 = ((m) map.get(getChildAt(i19))).f15387g;
                float f12 = vVar2.f15454f + vVar2.f15453e;
                fMin = Math.min(fMin, f12);
                fMax = Math.max(fMax, f12);
            }
            for (int i20 = 0; i20 < childCount; i20++) {
                m mVar5 = (m) map.get(getChildAt(i20));
                v vVar3 = mVar5.f15387g;
                float f13 = vVar3.f15453e;
                float f14 = vVar3.f15454f;
                mVar5.f15394n = 1.0f / (1.0f - f11);
                mVar5.f15393m = f11 - ((((f13 + f14) - fMin) * f11) / (fMax - fMin));
            }
        }
        this.f15314w = 0.0f;
        this.f15259A = 0.0f;
        this.f15274L = true;
        invalidate();
    }

    public final void C(int i7, androidx.constraintlayout.widget.m mVar) {
        y yVar = this.f15290a;
        if (yVar != null) {
            yVar.f15489g.put(i7, mVar);
        }
        this.Z0.e(this.f15290a.b(this.f15297e), this.f15290a.b(this.f15300g));
        t();
        if (this.f15299f == i7) {
            mVar.b(this);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r26v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v26 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v7 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r31) {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public int[] getConstraintSetIds() {
        y yVar = this.f15290a;
        if (yVar == null) {
            return null;
        }
        SparseArray sparseArray = yVar.f15489g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = sparseArray.keyAt(i7);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f15299f;
    }

    public ArrayList<x> getDefinedTransitions() {
        y yVar = this.f15290a;
        if (yVar == null) {
            return null;
        }
        return yVar.f15486d;
    }

    public C1028a getDesignTool() {
        if (this.f15309s0 == null) {
            this.f15309s0 = new C1028a(this);
        }
        return this.f15309s0;
    }

    public int getEndState() {
        return this.f15300g;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f15259A;
    }

    public y getScene() {
        return this.f15290a;
    }

    public int getStartState() {
        return this.f15297e;
    }

    public float getTargetPosition() {
        return this.f15263C;
    }

    public Bundle getTransitionState() {
        if (this.f15285U0 == null) {
            this.f15285U0 = new t(this);
        }
        t tVar = this.f15285U0;
        MotionLayout motionLayout = tVar.f15439e;
        tVar.f15438d = motionLayout.f15300g;
        tVar.f15437c = motionLayout.f15297e;
        tVar.f15436b = motionLayout.getVelocity();
        tVar.f15435a = motionLayout.getProgress();
        t tVar2 = this.f15285U0;
        tVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", tVar2.f15435a);
        bundle.putFloat("motion.velocity", tVar2.f15436b);
        bundle.putInt("motion.StartState", tVar2.f15437c);
        bundle.putInt("motion.EndState", tVar2.f15438d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        y yVar = this.f15290a;
        if (yVar != null) {
            this.f15312v = yVar.c() / 1000.0f;
        }
        return (long) (this.f15312v * 1000.0f);
    }

    public float getVelocity() {
        return this.f15296d;
    }

    public final void h(float f10) {
        y yVar = this.f15290a;
        if (yVar == null) {
            return;
        }
        float f11 = this.f15259A;
        float f12 = this.f15314w;
        if (f11 != f12 && this.f15269H) {
            this.f15259A = f12;
        }
        float f13 = this.f15259A;
        if (f13 == f10) {
            return;
        }
        this.f15306p0 = false;
        this.f15263C = f10;
        this.f15312v = yVar.c() / 1000.0f;
        setProgress(this.f15263C);
        this.f15292b = null;
        this.f15294c = this.f15290a.e();
        this.f15269H = false;
        this.t = getNanoTime();
        this.f15274L = true;
        this.f15314w = f13;
        this.f15259A = f13;
        invalidate();
    }

    public final void i() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            m mVar = (m) this.f15305p.get(getChildAt(i7));
            if (mVar != null) {
                "button".equals(J3.a.s(mVar.f15382b));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0178  */
    /* JADX WARN: Code duplicated, block: B:102:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:148:0x0214  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0 A[PHI: r3
      0x00e0: PHI (r3v13 float) = (r3v12 float), (r3v14 float), (r3v14 float) binds: [B:49:0x00ae, B:60:0x00d4, B:62:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x010b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0114  */
    /* JADX WARN: Code duplicated, block: B:89:0x0132  */
    /* JADX WARN: Code duplicated, block: B:92:0x0147  */
    /* JADX WARN: Code duplicated, block: B:93:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x0152  */
    /* JADX WARN: Code duplicated, block: B:99:0x0169  */
    public final void j(boolean z3) {
        boolean z8;
        char c6;
        u uVar;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i7;
        float f10;
        int i10;
        int i11;
        int i12;
        View childAt;
        m mVar;
        boolean z10;
        if (this.f15261B == -1) {
            this.f15261B = getNanoTime();
        }
        float f11 = this.f15259A;
        float f12 = 0.0f;
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f15299f = -1;
        }
        boolean z11 = false;
        if (this.f15260A0 || (this.f15274L && (z3 || this.f15263C != f11))) {
            float fSignum = Math.signum(this.f15263C - f11);
            long nanoTime2 = getNanoTime();
            n nVar = this.f15292b;
            float f13 = nVar == null ? (((nanoTime2 - this.f15261B) * fSignum) * 1.0E-9f) / this.f15312v : 0.0f;
            float f14 = this.f15259A + f13;
            if (this.f15269H) {
                f14 = this.f15263C;
            }
            if ((fSignum <= 0.0f || f14 < this.f15263C) && (fSignum > 0.0f || f14 > this.f15263C)) {
                z8 = false;
            } else {
                f14 = this.f15263C;
                this.f15274L = false;
                z8 = true;
            }
            this.f15259A = f14;
            this.f15314w = f14;
            this.f15261B = nanoTime2;
            if (nVar == null || z8) {
                this.f15296d = f13;
            } else {
                if (this.f15306p0) {
                    float interpolation2 = nVar.getInterpolation((nanoTime2 - this.t) * 1.0E-9f);
                    n nVar2 = this.f15292b;
                    T.a aVar = this.f15307q0;
                    if (nVar2 == aVar) {
                        c6 = aVar.f8912c.isStopped() ? (char) 2 : (char) 1;
                    } else {
                        c6 = 0;
                    }
                    this.f15259A = interpolation2;
                    this.f15261B = nanoTime2;
                    n nVar3 = this.f15292b;
                    if (nVar3 != null) {
                        float fA = nVar3.a();
                        this.f15296d = fA;
                        if (Math.abs(fA) * this.f15312v <= 1.0E-5f && c6 == 2) {
                            this.f15274L = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.f15259A = 1.0f;
                            this.f15274L = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f14 = interpolation2;
                        } else {
                            this.f15259A = 0.0f;
                            this.f15274L = false;
                            f14 = 0.0f;
                        }
                    } else {
                        f14 = interpolation2;
                    }
                } else {
                    float interpolation3 = nVar.getInterpolation(f14);
                    n nVar4 = this.f15292b;
                    if (nVar4 != null) {
                        this.f15296d = nVar4.a();
                    } else {
                        this.f15296d = ((nVar4.getInterpolation(f14 + f13) - interpolation3) * fSignum) / f13;
                    }
                    f14 = interpolation3;
                }
                if (Math.abs(this.f15296d) > 1.0E-5f) {
                    setState(u.f15442c);
                }
                uVar = u.f15443d;
                if (c6 != 1) {
                    if ((fSignum <= 0.0f && f14 >= this.f15263C) || (fSignum <= 0.0f && f14 <= this.f15263C)) {
                        f14 = this.f15263C;
                        this.f15274L = false;
                    }
                    if (f14 < 1.0f || f14 <= 0.0f) {
                        this.f15274L = false;
                        setState(uVar);
                    }
                }
                childCount = getChildCount();
                this.f15260A0 = false;
                nanoTime = getNanoTime();
                this.f15283R0 = f14;
                interpolator = this.f15294c;
                if (interpolator == null) {
                    interpolation = f14;
                } else {
                    interpolation = interpolator.getInterpolation(f14);
                }
                interpolator2 = this.f15294c;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f15312v) + f14);
                    this.f15296d = interpolation4;
                    this.f15296d = interpolation4 - this.f15294c.getInterpolation(f14);
                }
                i7 = 0;
                while (i7 < childCount) {
                    childAt = getChildAt(i7);
                    mVar = (m) this.f15305p.get(childAt);
                    if (mVar != null) {
                        this.f15260A0 = mVar.h(interpolation, nanoTime, this.f15284S0, childAt) | this.f15260A0;
                    }
                    i7++;
                    f12 = f12;
                }
                f10 = f12;
                boolean z12 = (fSignum <= 0.0f && f14 >= this.f15263C) || (fSignum <= f10 && f14 <= this.f15263C);
                if (!this.f15260A0 && !this.f15274L && z12) {
                    setState(uVar);
                }
                if (this.f15273K0) {
                    requestLayout();
                }
                this.f15260A0 = (!z12) | this.f15260A0;
                if (f14 <= f10 && (i12 = this.f15297e) != -1 && this.f15299f != i12) {
                    this.f15299f = i12;
                    this.f15290a.b(i12).a(this);
                    setState(uVar);
                    z11 = true;
                }
                if (f14 >= 1.0d) {
                    i10 = this.f15299f;
                    i11 = this.f15300g;
                    if (i10 != i11) {
                        this.f15299f = i11;
                        this.f15290a.b(i11).a(this);
                        setState(uVar);
                        z11 = true;
                    }
                }
                if (!this.f15260A0 || this.f15274L) {
                    invalidate();
                } else if ((fSignum > 0.0f && f14 == 1.0f) || (fSignum < f10 && f14 == f10)) {
                    setState(uVar);
                }
                if (!this.f15260A0 && !this.f15274L && ((fSignum > 0.0f && f14 == 1.0f) || (fSignum < f10 && f14 == f10))) {
                    r();
                }
            }
            c6 = 0;
            if (Math.abs(this.f15296d) > 1.0E-5f) {
                setState(u.f15442c);
            }
            uVar = u.f15443d;
            if (c6 != 1) {
                if (fSignum <= 0.0f) {
                    f14 = this.f15263C;
                    this.f15274L = false;
                } else {
                    f14 = this.f15263C;
                    this.f15274L = false;
                }
                if (f14 < 1.0f) {
                    this.f15274L = false;
                    setState(uVar);
                } else {
                    this.f15274L = false;
                    setState(uVar);
                }
            }
            childCount = getChildCount();
            this.f15260A0 = false;
            nanoTime = getNanoTime();
            this.f15283R0 = f14;
            interpolator = this.f15294c;
            if (interpolator == null) {
                interpolation = f14;
            } else {
                interpolation = interpolator.getInterpolation(f14);
            }
            interpolator2 = this.f15294c;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f15312v) + f14);
                this.f15296d = interpolation5;
                this.f15296d = interpolation5 - this.f15294c.getInterpolation(f14);
            }
            i7 = 0;
            while (i7 < childCount) {
                childAt = getChildAt(i7);
                mVar = (m) this.f15305p.get(childAt);
                if (mVar != null) {
                    this.f15260A0 = mVar.h(interpolation, nanoTime, this.f15284S0, childAt) | this.f15260A0;
                }
                i7++;
                f12 = f12;
            }
            f10 = f12;
            if (fSignum <= 0.0f) {
            }
            if (!this.f15260A0) {
                setState(uVar);
            }
            if (this.f15273K0) {
                requestLayout();
            }
            this.f15260A0 = (!z12) | this.f15260A0;
            if (f14 <= f10) {
                this.f15299f = i12;
                this.f15290a.b(i12).a(this);
                setState(uVar);
                z11 = true;
            }
            if (f14 >= 1.0d) {
                i10 = this.f15299f;
                i11 = this.f15300g;
                if (i10 != i11) {
                    this.f15299f = i11;
                    this.f15290a.b(i11).a(this);
                    setState(uVar);
                    z11 = true;
                }
            }
            if (this.f15260A0) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f15260A0) {
                r();
            }
        } else {
            f10 = 0.0f;
        }
        float f15 = this.f15259A;
        if (f15 < 1.0f) {
            if (f15 <= f10) {
                int i13 = this.f15299f;
                int i14 = this.f15297e;
                z10 = i13 == i14 ? z11 : true;
                this.f15299f = i14;
            }
            this.f15291a1 |= z11;
            if (z11 && !this.T0) {
                requestLayout();
            }
            this.f15314w = this.f15259A;
        }
        int i15 = this.f15299f;
        int i16 = this.f15300g;
        z10 = i15 == i16 ? z11 : true;
        this.f15299f = i16;
        z11 = z10;
        this.f15291a1 |= z11;
        if (z11) {
            requestLayout();
        }
        this.f15314w = this.f15259A;
    }

    public final void k() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f15276M == null && ((copyOnWriteArrayList = this.f15266E0) == null || copyOnWriteArrayList.isEmpty())) || this.f15272J0 == this.f15314w) {
            return;
        }
        if (this.f15271I0 != -1) {
            TransitionListener transitionListener = this.f15276M;
            if (transitionListener != null) {
                transitionListener.onTransitionStarted(this, this.f15297e, this.f15300g);
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f15266E0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    ((TransitionListener) it.next()).onTransitionStarted(this, this.f15297e, this.f15300g);
                }
            }
        }
        this.f15271I0 = -1;
        float f10 = this.f15314w;
        this.f15272J0 = f10;
        TransitionListener transitionListener2 = this.f15276M;
        if (transitionListener2 != null) {
            transitionListener2.onTransitionChange(this, this.f15297e, this.f15300g, f10);
        }
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.f15266E0;
        if (copyOnWriteArrayList3 != null) {
            Iterator it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                ((TransitionListener) it2.next()).onTransitionChange(this, this.f15297e, this.f15300g, this.f15314w);
            }
        }
    }

    public final void l() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f15276M != null || ((copyOnWriteArrayList = this.f15266E0) != null && !copyOnWriteArrayList.isEmpty())) && this.f15271I0 == -1) {
            this.f15271I0 = this.f15299f;
            ArrayList arrayList = this.f15298e1;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) q0.i(1, arrayList)).intValue() : -1;
            int i7 = this.f15299f;
            if (iIntValue != i7 && i7 != -1) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        s();
        androidx.camera.video.internal.encoder.o oVar = this.f15286V0;
        if (oVar != null) {
            oVar.run();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i7) {
        x xVar;
        if (i7 == 0) {
            this.f15290a = null;
            return;
        }
        try {
            y yVar = new y(getContext(), this, i7);
            this.f15290a = yVar;
            int i10 = -1;
            if (this.f15299f == -1) {
                this.f15299f = yVar.h();
                this.f15297e = this.f15290a.h();
                x xVar2 = this.f15290a.f15485c;
                if (xVar2 != null) {
                    i10 = xVar2.f15467c;
                }
                this.f15300g = i10;
            }
            if (!super.isAttachedToWindow()) {
                this.f15290a = null;
                return;
            }
            try {
                Display display = getDisplay();
                if (display != null) {
                    display.getRotation();
                }
                y yVar2 = this.f15290a;
                if (yVar2 != null) {
                    androidx.constraintlayout.widget.m mVarB = yVar2.b(this.f15299f);
                    this.f15290a.n(this);
                    ArrayList arrayList = this.f15265D0;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((MotionHelper) it.next()).getClass();
                        }
                    }
                    if (mVarB != null) {
                        mVarB.b(this);
                    }
                    this.f15297e = this.f15299f;
                }
                r();
                t tVar = this.f15285U0;
                if (tVar != null) {
                    if (this.f15288X0) {
                        post(new o(this, 0));
                        return;
                    } else {
                        tVar.a();
                        return;
                    }
                }
                y yVar3 = this.f15290a;
                if (yVar3 == null || (xVar = yVar3.f15485c) == null || xVar.f15478n != 4) {
                    return;
                }
                x();
                setState(u.f15441b);
                setState(u.f15442c);
            } catch (Exception e10) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e10);
            }
        } catch (Exception e11) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e11);
        }
    }

    public final void m(int i7, float f10, float f11, float f12, float[] fArr) {
        View viewById = getViewById(i7);
        m mVar = (m) this.f15305p.get(viewById);
        if (mVar != null) {
            mVar.f(f10, f11, f12, fArr);
            viewById.getY();
        } else {
            if (viewById == null) {
                return;
            }
            viewById.getContext().getResources().getResourceName(i7);
        }
    }

    public final androidx.constraintlayout.widget.m n(int i7) {
        y yVar = this.f15290a;
        if (yVar == null) {
            return null;
        }
        return yVar.b(i7);
    }

    public final x o(int i7) {
        for (x xVar : this.f15290a.f15486d) {
            if (xVar.f15465a == i7) {
                return xVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        x xVar;
        int i7;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        y yVar = this.f15290a;
        if (yVar != null && (i7 = this.f15299f) != -1) {
            androidx.constraintlayout.widget.m mVarB = yVar.b(i7);
            this.f15290a.n(this);
            ArrayList arrayList = this.f15265D0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((MotionHelper) it.next()).getClass();
                }
            }
            if (mVarB != null) {
                mVarB.b(this);
            }
            this.f15297e = this.f15299f;
        }
        r();
        t tVar = this.f15285U0;
        if (tVar != null) {
            if (this.f15288X0) {
                post(new o(this, 1));
                return;
            } else {
                tVar.a();
                return;
            }
        }
        y yVar2 = this.f15290a;
        if (yVar2 == null || (xVar = yVar2.f15485c) == null || xVar.f15478n != 4) {
            return;
        }
        x();
        setState(u.f15441b);
        setState(u.f15442c);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fc  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        A a3;
        int i7;
        RectF rectFB;
        MotionLayout motionLayout;
        int currentState;
        y yVar = this.f15290a;
        if (yVar == null || !this.f15304o) {
            return false;
        }
        E2.a aVar = yVar.f15499q;
        if (aVar == null || (currentState = (motionLayout = (MotionLayout) aVar.f2183b).getCurrentState()) == -1) {
            z3 = false;
        } else {
            HashSet hashSet = (HashSet) aVar.f2184c;
            ArrayList<C> arrayList = (ArrayList) aVar.f2185d;
            if (hashSet == null) {
                aVar.f2184c = new HashSet();
                for (C c6 : arrayList) {
                    int childCount = motionLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = motionLayout.getChildAt(i10);
                        if (c6.b(childAt)) {
                            childAt.getId();
                            ((HashSet) aVar.f2184c).add(childAt);
                        }
                    }
                }
            }
            float x3 = motionEvent.getX();
            float y8 = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList arrayList2 = (ArrayList) aVar.f2186e;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (B b7 : (ArrayList) aVar.f2186e) {
                    if (action != 1) {
                        if (action != 2) {
                            b7.getClass();
                        } else {
                            View view = b7.f15219c.f15382b;
                            Rect rect2 = b7.f15228l;
                            view.getHitRect(rect2);
                            if (!rect2.contains((int) x3, (int) y8) && !b7.f15224h) {
                                b7.b();
                            }
                        }
                    } else if (!b7.f15224h) {
                        b7.b();
                    }
                }
            }
            z3 = false;
            if (action == 0 || action == 1) {
                androidx.constraintlayout.widget.m mVarN = motionLayout.n(currentState);
                for (C c10 : arrayList) {
                    int i11 = c10.f15231b;
                    if (i11 == 1) {
                        if (action == 0) {
                            for (View view2 : (HashSet) aVar.f2184c) {
                                if (c10.b(view2)) {
                                    view2.getHitRect(rect);
                                    if (rect.contains((int) x3, (int) y8)) {
                                        c10.a(aVar, (MotionLayout) aVar.f2183b, currentState, mVarN, view2);
                                    }
                                }
                            }
                        }
                    } else if (i11 == 2) {
                        if (action == 1) {
                            while (r2.hasNext()) {
                                if (c10.b(view2)) {
                                    view2.getHitRect(rect);
                                    if (rect.contains((int) x3, (int) y8)) {
                                        c10.a(aVar, (MotionLayout) aVar.f2183b, currentState, mVarN, view2);
                                    }
                                }
                            }
                        }
                    } else if (i11 == 3 && action == 0) {
                        while (r2.hasNext()) {
                            if (c10.b(view2)) {
                                view2.getHitRect(rect);
                                if (rect.contains((int) x3, (int) y8)) {
                                    c10.a(aVar, (MotionLayout) aVar.f2183b, currentState, mVarN, view2);
                                }
                            }
                        }
                    }
                }
            }
        }
        x xVar = this.f15290a.f15485c;
        if (xVar == null || xVar.f15479o || (a3 = xVar.f15476l) == null) {
            return z3;
        }
        if ((motionEvent.getAction() == 0 && (rectFB = a3.b(this, new RectF())) != null && !rectFB.contains(motionEvent.getX(), motionEvent.getY())) || (i7 = a3.f15196e) == -1) {
            return z3;
        }
        View view3 = this.f15295c1;
        if (view3 == null || view3.getId() != i7) {
            this.f15295c1 = findViewById(i7);
        }
        View view4 = this.f15295c1;
        if (view4 == null) {
            return z3;
        }
        RectF rectF = this.f15293b1;
        rectF.set(view4.getLeft(), this.f15295c1.getTop(), this.f15295c1.getRight(), this.f15295c1.getBottom());
        return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || p((float) this.f15295c1.getLeft(), (float) this.f15295c1.getTop(), this.f15295c1, motionEvent)) ? z3 : onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) throws Throwable {
        MotionLayout motionLayout;
        this.T0 = true;
        try {
            if (this.f15290a == null) {
                super.onLayout(z3, i7, i10, i11, i12);
                this.T0 = false;
                return;
            }
            motionLayout = this;
            int i13 = i11 - i7;
            int i14 = i12 - i10;
            try {
                if (motionLayout.f15310t0 != i13 || motionLayout.f15311u0 != i14) {
                    t();
                    j(true);
                }
                motionLayout.f15310t0 = i13;
                motionLayout.f15311u0 = i14;
                motionLayout.T0 = false;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            motionLayout = this;
        }
        Throwable th3 = th;
        motionLayout.T0 = false;
        throw th3;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z3;
        if (this.f15290a == null) {
            super.onMeasure(i7, i10);
            return;
        }
        boolean z8 = true;
        boolean z10 = (this.f15301i == i7 && this.f15302j == i10) ? false : true;
        if (this.f15291a1) {
            this.f15291a1 = false;
            r();
            s();
            z10 = true;
        }
        if (this.mDirtyHierarchy) {
            z10 = true;
        }
        this.f15301i = i7;
        this.f15302j = i10;
        int iH = this.f15290a.h();
        x xVar = this.f15290a.f15485c;
        int i11 = xVar == null ? -1 : xVar.f15467c;
        r rVar = this.Z0;
        if ((!z10 && iH == rVar.f15430e && i11 == rVar.f15431f) || this.f15297e == -1) {
            if (z10) {
                super.onMeasure(i7, i10);
            }
            z3 = true;
        } else {
            super.onMeasure(i7, i10);
            rVar.e(this.f15290a.b(iH), this.f15290a.b(i11));
            rVar.f();
            rVar.f15430e = iH;
            rVar.f15431f = i11;
            z3 = false;
        }
        if (this.f15273K0 || z3) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iR = this.mLayoutWidget.r() + getPaddingRight() + getPaddingLeft();
            int iL = this.mLayoutWidget.l() + paddingBottom;
            int i12 = this.f15280P0;
            if (i12 == Integer.MIN_VALUE || i12 == 0) {
                int i13 = this.f15275L0;
                iR = (int) ((this.f15283R0 * (this.f15278N0 - i13)) + i13);
                requestLayout();
            }
            int i14 = this.f15282Q0;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                int i15 = this.f15277M0;
                iL = (int) ((this.f15283R0 * (this.f15279O0 - i15)) + i15);
                requestLayout();
            }
            setMeasuredDimension(iR, iL);
        }
        float fSignum = Math.signum(this.f15263C - this.f15259A);
        long nanoTime = getNanoTime();
        n nVar = this.f15292b;
        float interpolation = this.f15259A + (!(nVar instanceof T.a) ? (((nanoTime - this.f15261B) * fSignum) * 1.0E-9f) / this.f15312v : 0.0f);
        if (this.f15269H) {
            interpolation = this.f15263C;
        }
        if ((fSignum <= 0.0f || interpolation < this.f15263C) && (fSignum > 0.0f || interpolation > this.f15263C)) {
            z8 = false;
        } else {
            interpolation = this.f15263C;
        }
        if (nVar != null && !z8) {
            interpolation = this.f15306p0 ? nVar.getInterpolation((nanoTime - this.t) * 1.0E-9f) : nVar.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f15263C) || (fSignum <= 0.0f && interpolation <= this.f15263C)) {
            interpolation = this.f15263C;
        }
        this.f15283R0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f15294c;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f10 = interpolation;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            m mVar = (m) this.f15305p.get(childAt);
            if (mVar != null) {
                mVar.h(f10, nanoTime2, this.f15284S0, childAt);
            }
        }
        if (this.f15273K0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr, int i11) {
        x xVar;
        boolean z3;
        float f10;
        A a3;
        float f11;
        A a10;
        A a11;
        A a12;
        int i12;
        y yVar = this.f15290a;
        if (yVar == null || (xVar = yVar.f15485c) == null || (z3 = xVar.f15479o)) {
            return;
        }
        int i13 = -1;
        if (z3 || (a12 = xVar.f15476l) == null || (i12 = a12.f15196e) == -1 || view.getId() == i12) {
            x xVar2 = yVar.f15485c;
            if ((xVar2 == null || (a11 = xVar2.f15476l) == null) ? false : a11.f15211u) {
                A a13 = xVar.f15476l;
                if (a13 != null && (a13.f15213w & 4) != 0) {
                    i13 = i10;
                }
                float f12 = this.f15314w;
                if ((f12 == 1.0f || f12 == 0.0f) && view.canScrollVertically(i13)) {
                    return;
                }
            }
            A a14 = xVar.f15476l;
            if (a14 == null || (a14.f15213w & 1) == 0) {
                f10 = 0.0f;
            } else {
                float f13 = i7;
                float f14 = i10;
                x xVar3 = yVar.f15485c;
                if (xVar3 == null || (a10 = xVar3.f15476l) == null) {
                    f10 = 0.0f;
                    f11 = 0.0f;
                } else {
                    f10 = 0.0f;
                    a10.f15209r.m(a10.f15195d, a10.f15209r.getProgress(), a10.f15199h, a10.f15198g, a10.f15205n);
                    float f15 = a10.f15202k;
                    float[] fArr = a10.f15205n;
                    if (f15 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f11 = (f13 * f15) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f11 = (f14 * a10.f15203l) / fArr[1];
                    }
                }
                float f16 = this.f15259A;
                if ((f16 <= f10 && f11 < f10) || (f16 >= 1.0f && f11 > f10)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new X6.a(view, 18));
                    return;
                }
            }
            float f17 = this.f15314w;
            long nanoTime = getNanoTime();
            float f18 = i7;
            this.f15315w0 = f18;
            float f19 = i10;
            this.f15316x0 = f19;
            this.f15318z0 = (float) ((nanoTime - this.f15317y0) * 1.0E-9d);
            this.f15317y0 = nanoTime;
            x xVar4 = yVar.f15485c;
            if (xVar4 != null && (a3 = xVar4.f15476l) != null) {
                MotionLayout motionLayout = a3.f15209r;
                float progress = motionLayout.getProgress();
                if (!a3.f15204m) {
                    a3.f15204m = true;
                    motionLayout.setProgress(progress);
                }
                a3.f15209r.m(a3.f15195d, progress, a3.f15199h, a3.f15198g, a3.f15205n);
                float f20 = a3.f15202k;
                float[] fArr2 = a3.f15205n;
                if (Math.abs((a3.f15203l * fArr2[1]) + (f20 * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f21 = a3.f15202k;
                float fMax = Math.max(Math.min(progress + (f21 != f10 ? (f18 * f21) / fArr2[0] : (f19 * a3.f15203l) / fArr2[1]), 1.0f), f10);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f17 != this.f15314w) {
                iArr[0] = i7;
                iArr[1] = i10;
            }
            j(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f15313v0 = true;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i7, int i10) {
        this.f15317y0 = getNanoTime();
        this.f15318z0 = 0.0f;
        this.f15315w0 = 0.0f;
        this.f15316x0 = 0.0f;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        A a3;
        y yVar = this.f15290a;
        if (yVar != null) {
            boolean zIsRtl = isRtl();
            yVar.f15498p = zIsRtl;
            x xVar = yVar.f15485c;
            if (xVar == null || (a3 = xVar.f15476l) == null) {
                return;
            }
            a3.c(zIsRtl);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i7, int i10) {
        x xVar;
        A a3;
        y yVar = this.f15290a;
        return (yVar == null || (xVar = yVar.f15485c) == null || (a3 = xVar.f15476l) == null || (a3.f15213w & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i7) {
        A a3;
        y yVar = this.f15290a;
        if (yVar != null) {
            float f10 = this.f15318z0;
            if (f10 == 0.0f) {
                return;
            }
            float f11 = this.f15315w0 / f10;
            float f12 = this.f15316x0 / f10;
            x xVar = yVar.f15485c;
            if (xVar == null || (a3 = xVar.f15476l) == null) {
                return;
            }
            a3.f15204m = false;
            MotionLayout motionLayout = a3.f15209r;
            float progress = motionLayout.getProgress();
            a3.f15209r.m(a3.f15195d, progress, a3.f15199h, a3.f15198g, a3.f15205n);
            float f13 = a3.f15202k;
            float[] fArr = a3.f15205n;
            float f14 = f13 != 0.0f ? (f11 * f13) / fArr[0] : (f12 * a3.f15203l) / fArr[1];
            if (!Float.isNaN(f14)) {
                progress += f14 / 3.0f;
            }
            if (progress != 0.0f) {
                boolean z3 = progress != 1.0f;
                int i10 = a3.f15194c;
                if ((i10 != 3) && z3) {
                    motionLayout.w(((double) progress) >= 0.5d ? 1.0f : 0.0f, f14, i10);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x021a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0220  */
    /* JADX WARN: Code duplicated, block: B:111:0x0224  */
    /* JADX WARN: Code duplicated, block: B:117:0x023c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0245  */
    /* JADX WARN: Code duplicated, block: B:121:0x0253  */
    /* JADX WARN: Code duplicated, block: B:124:0x0258  */
    /* JADX WARN: Code duplicated, block: B:126:0x0271  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:135:0x0327  */
    /* JADX WARN: Code duplicated, block: B:136:0x032a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0330  */
    /* JADX WARN: Code duplicated, block: B:141:0x033b  */
    /* JADX WARN: Code duplicated, block: B:143:0x033f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0347  */
    /* JADX WARN: Code duplicated, block: B:146:0x034e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0354  */
    /* JADX WARN: Code duplicated, block: B:150:0x037a  */
    /* JADX WARN: Code duplicated, block: B:153:0x039e  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:159:0x03da  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:163:0x0411  */
    /* JADX WARN: Code duplicated, block: B:165:0x0442  */
    /* JADX WARN: Code duplicated, block: B:167:0x0447  */
    /* JADX WARN: Code duplicated, block: B:168:0x047e A[PHI: r8 r9
      0x047e: PHI (r8v12 float) = (r8v4 float), (r8v27 float) binds: [B:166:0x0445, B:164:0x0437] A[DONT_GENERATE, DONT_INLINE]
      0x047e: PHI (r9v34 float) = (r9v29 float), (r9v40 float) binds: [B:166:0x0445, B:164:0x0437] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:170:0x0499  */
    /* JADX WARN: Code duplicated, block: B:171:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:174:0x04db  */
    /* JADX WARN: Code duplicated, block: B:176:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:179:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:204:0x054c  */
    /* JADX WARN: Code duplicated, block: B:206:0x0554  */
    /* JADX WARN: Code duplicated, block: B:208:0x055a  */
    /* JADX WARN: Code duplicated, block: B:209:0x055f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0570  */
    /* JADX WARN: Code duplicated, block: B:212:0x057f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0582  */
    /* JADX WARN: Code duplicated, block: B:217:0x0587  */
    /* JADX WARN: Code duplicated, block: B:219:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:221:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:223:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:226:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:227:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:230:0x0604  */
    /* JADX WARN: Code duplicated, block: B:233:0x060f  */
    /* JADX WARN: Code duplicated, block: B:234:0x0613  */
    /* JADX WARN: Code duplicated, block: B:237:0x0627  */
    /* JADX WARN: Code duplicated, block: B:240:0x0630  */
    /* JADX WARN: Code duplicated, block: B:243:0x063f  */
    /* JADX WARN: Code duplicated, block: B:245:0x0645  */
    /* JADX WARN: Code duplicated, block: B:247:0x064b  */
    /* JADX WARN: Code duplicated, block: B:250:0x0665  */
    /* JADX WARN: Code duplicated, block: B:251:0x066b  */
    /* JADX WARN: Code duplicated, block: B:253:0x0674  */
    /* JADX WARN: Code duplicated, block: B:255:0x0685  */
    /* JADX WARN: Code duplicated, block: B:257:0x069e  */
    /* JADX WARN: Code duplicated, block: B:258:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:261:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:262:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:265:0x06df  */
    /* JADX WARN: Code duplicated, block: B:267:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:270:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:295:0x0739  */
    /* JADX WARN: Code duplicated, block: B:297:0x073f  */
    /* JADX WARN: Code duplicated, block: B:299:0x0745  */
    /* JADX WARN: Code duplicated, block: B:300:0x0749  */
    /* JADX WARN: Code duplicated, block: B:303:0x076b  */
    /* JADX WARN: Code duplicated, block: B:307:0x077a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x xVar;
        s sVar;
        int i7;
        A a3;
        s sVar2;
        boolean z3;
        u uVar;
        float[] fArr;
        MotionLayout motionLayout;
        int action;
        float xVelocity;
        float yVelocity;
        float progress;
        int i10;
        char c6;
        char c10;
        float f10;
        float f11;
        float f12;
        float fAbs;
        float f13;
        int i11;
        float rawY;
        float rawX;
        float progress2;
        int i12;
        char c11;
        char c12;
        float f14;
        float fMax;
        float progress3;
        float xVelocity2;
        float yVelocity2;
        float f15;
        int action2;
        int[] iArr;
        float progress4;
        int i13;
        int i14;
        float right;
        float f16;
        int top2;
        int bottom;
        int i15;
        float degrees;
        float f17;
        int i16;
        float width;
        float height;
        int i17;
        int i18;
        View viewFindViewById;
        float rawX2;
        float rawY2;
        double dAtan2;
        float fAtan2;
        float progress5;
        boolean z8;
        int i19;
        float f18;
        ?? r18;
        float fMax2;
        float progress6;
        MotionEvent motionEvent2;
        x xVar2;
        int iK;
        Iterator it;
        y yVar = this.f15290a;
        if (yVar == null || !this.f15304o || !yVar.q()) {
            return super.onTouchEvent(motionEvent);
        }
        y yVar2 = this.f15290a;
        x xVar3 = yVar2.f15485c;
        if (xVar3 != null && xVar3.f15479o) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        RectF rectF = new RectF();
        s sVar3 = yVar2.f15497o;
        MotionLayout motionLayout2 = yVar2.f15483a;
        if (sVar3 == null) {
            motionLayout2.getClass();
            s sVar4 = s.f15433b;
            sVar4.f15434a = VelocityTracker.obtain();
            yVar2.f15497o = sVar4;
        }
        yVar2.f15497o.addMovement(motionEvent);
        if (currentState != -1) {
            int action3 = motionEvent.getAction();
            if (action3 == 0) {
                yVar2.f15500r = motionEvent.getRawX();
                yVar2.f15501s = motionEvent.getRawY();
                yVar2.f15494l = motionEvent;
                yVar2.f15495m = false;
                A a10 = yVar2.f15485c.f15476l;
                if (a10 != null) {
                    RectF rectFA = a10.a(motionLayout2, rectF);
                    if (rectFA == null || rectFA.contains(yVar2.f15494l.getX(), yVar2.f15494l.getY())) {
                        RectF rectFB = yVar2.f15485c.f15476l.b(motionLayout2, rectF);
                        if (rectFB == null || rectFB.contains(yVar2.f15494l.getX(), yVar2.f15494l.getY())) {
                            yVar2.f15496n = false;
                        } else {
                            yVar2.f15496n = true;
                        }
                        A a11 = yVar2.f15485c.f15476l;
                        float f19 = yVar2.f15500r;
                        float f20 = yVar2.f15501s;
                        a11.f15207p = f19;
                        a11.f15208q = f20;
                    } else {
                        yVar2.f15494l = null;
                        yVar2.f15495m = true;
                    }
                }
            } else if (action3 == 2 && !yVar2.f15495m) {
                float rawY3 = motionEvent.getRawY() - yVar2.f15501s;
                float rawX3 = motionEvent.getRawX() - yVar2.f15500r;
                if ((rawX3 != 0.0d || rawY3 != 0.0d) && (motionEvent2 = yVar2.f15494l) != null) {
                    if (currentState != -1) {
                        C4.a aVar = yVar2.f15484b;
                        if (aVar == null || (iK = aVar.k(currentState)) == -1) {
                            iK = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (x xVar4 : yVar2.f15486d) {
                            if (xVar4.f15468d == iK || xVar4.f15467c == iK) {
                                arrayList.add(xVar4);
                            }
                        }
                        RectF rectF2 = new RectF();
                        Iterator it2 = arrayList.iterator();
                        float f21 = 0.0f;
                        xVar2 = null;
                        while (it2.hasNext()) {
                            x xVar5 = (x) it2.next();
                            if (xVar5.f15479o) {
                                it = it2;
                            } else {
                                A a12 = xVar5.f15476l;
                                if (a12 != null) {
                                    a12.c(yVar2.f15498p);
                                    RectF rectFB2 = xVar5.f15476l.b(motionLayout2, rectF2);
                                    if (rectFB2 != null) {
                                        it = it2;
                                        if (!rectFB2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        }
                                    } else {
                                        it = it2;
                                    }
                                    RectF rectFA2 = xVar5.f15476l.a(motionLayout2, rectF2);
                                    if (rectFA2 == null || rectFA2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        A a13 = xVar5.f15476l;
                                        float fAtan3 = (a13.f15203l * rawY3) + (a13.f15202k * rawX3);
                                        if (a13.f15201j) {
                                            float x3 = motionEvent2.getX();
                                            xVar5.f15476l.getClass();
                                            float f22 = x3 - 0.5f;
                                            float y8 = motionEvent2.getY();
                                            xVar5.f15476l.getClass();
                                            float f23 = y8 - 0.5f;
                                            fAtan3 = ((float) (Math.atan2(rawY3 + f23, rawX3 + f22) - Math.atan2(f22, f23))) * 10.0f;
                                        }
                                        float f24 = fAtan3 * (xVar5.f15467c == currentState ? -1.0f : 1.1f);
                                        if (f24 > f21) {
                                            f21 = f24;
                                            xVar2 = xVar5;
                                        }
                                        it2 = it;
                                        rectF2 = rectF2;
                                        rawY3 = rawY3;
                                        rawX3 = rawX3;
                                    }
                                } else {
                                    rectF2 = rectF2;
                                    it = it2;
                                    f21 = f21;
                                    rawY3 = rawY3;
                                    rawX3 = rawX3;
                                }
                                f21 = f21;
                                it2 = it;
                                rectF2 = rectF2;
                                rawY3 = rawY3;
                                rawX3 = rawX3;
                            }
                            it2 = it;
                        }
                    } else {
                        xVar2 = yVar2.f15485c;
                    }
                    if (xVar2 != null) {
                        setTransition(xVar2);
                        RectF rectFB3 = yVar2.f15485c.f15476l.b(motionLayout2, rectF);
                        yVar2.f15496n = (rectFB3 == null || rectFB3.contains(yVar2.f15494l.getX(), yVar2.f15494l.getY())) ? false : true;
                        A a14 = yVar2.f15485c.f15476l;
                        float f25 = yVar2.f15500r;
                        float f26 = yVar2.f15501s;
                        a14.f15207p = f25;
                        a14.f15208q = f26;
                        a14.f15204m = false;
                    }
                    if (!yVar2.f15495m) {
                        xVar = yVar2.f15485c;
                        if (xVar != null) {
                            sVar2 = yVar2.f15497o;
                            z3 = a3.f15201j;
                            uVar = u.f15443d;
                            fArr = a3.f15205n;
                            motionLayout = a3.f15209r;
                            if (z3) {
                                sVar2.addMovement(motionEvent);
                                action2 = motionEvent.getAction();
                                if (action2 != 0) {
                                    iArr = a3.f15206o;
                                    if (action2 == 1) {
                                        a3.f15204m = false;
                                        sVar2.computeCurrentVelocity(16);
                                        float xVelocity3 = sVar2.getXVelocity();
                                        float yVelocity3 = sVar2.getYVelocity();
                                        progress4 = motionLayout.getProgress();
                                        float width2 = motionLayout.getWidth() / 2.0f;
                                        float height2 = motionLayout.getHeight() / 2.0f;
                                        i13 = a3.f15200i;
                                        if (i13 != -1) {
                                            View viewFindViewById2 = motionLayout.findViewById(i13);
                                            motionLayout.getLocationOnScreen(iArr);
                                            right = iArr[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                                            f16 = iArr[1];
                                            top2 = viewFindViewById2.getTop();
                                            bottom = viewFindViewById2.getBottom();
                                        } else {
                                            i14 = a3.f15195d;
                                            if (i14 != -1) {
                                                View viewFindViewById3 = motionLayout.findViewById(((m) motionLayout.f15305p.get(motionLayout.findViewById(i14))).f15386f.f15459p);
                                                motionLayout.getLocationOnScreen(iArr);
                                                right = iArr[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
                                                f16 = iArr[1];
                                                top2 = viewFindViewById3.getTop();
                                                bottom = viewFindViewById3.getBottom();
                                            } else {
                                                float rawX4 = motionEvent.getRawX() - width2;
                                                float rawY4 = motionEvent.getRawY() - height2;
                                                double degrees2 = Math.toDegrees(Math.atan2(rawY4, rawX4));
                                                i15 = a3.f15195d;
                                                if (i15 != -1) {
                                                    a3.f15209r.m(i15, progress4, a3.f15199h, a3.f15198g, a3.f15205n);
                                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                                } else {
                                                    fArr[1] = 360.0f;
                                                }
                                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY4, xVelocity3 + rawX4)) - degrees2)) * 62.5f;
                                                if (Float.isNaN(degrees)) {
                                                    f17 = progress4;
                                                } else {
                                                    f17 = (((degrees * 3.0f) * a3.f15212v) / fArr[1]) + progress4;
                                                }
                                                if (f17 == 0.0f) {
                                                    if (0.0f < f17) {
                                                        motionLayout.setState(uVar);
                                                    } else {
                                                        motionLayout.setState(uVar);
                                                    }
                                                } else if (0.0f < f17) {
                                                    motionLayout.setState(uVar);
                                                } else {
                                                    motionLayout.setState(uVar);
                                                }
                                            }
                                        }
                                        float f27 = right;
                                        height2 = ((bottom + top2) / 2.0f) + f16;
                                        width2 = f27;
                                        float rawX5 = motionEvent.getRawX() - width2;
                                        float rawY5 = motionEvent.getRawY() - height2;
                                        double degrees3 = Math.toDegrees(Math.atan2(rawY5, rawX5));
                                        i15 = a3.f15195d;
                                        if (i15 != -1) {
                                            a3.f15209r.m(i15, progress4, a3.f15199h, a3.f15198g, a3.f15205n);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY5, xVelocity3 + rawX5)) - degrees3)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f17 = (((degrees * 3.0f) * a3.f15212v) / fArr[1]) + progress4;
                                        } else {
                                            f17 = progress4;
                                        }
                                        if (f17 == 0.0f) {
                                            if (0.0f < f17) {
                                                motionLayout.setState(uVar);
                                            } else {
                                                motionLayout.setState(uVar);
                                            }
                                        } else if (0.0f < f17) {
                                            motionLayout.setState(uVar);
                                        } else {
                                            motionLayout.setState(uVar);
                                        }
                                    } else if (action2 == 2) {
                                        motionEvent.getRawY();
                                        motionEvent.getRawX();
                                        width = motionLayout.getWidth() / 2.0f;
                                        height = motionLayout.getHeight() / 2.0f;
                                        i17 = a3.f15200i;
                                        if (i17 != -1) {
                                            View viewFindViewById4 = motionLayout.findViewById(i17);
                                            motionLayout.getLocationOnScreen(iArr);
                                            float right2 = iArr[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                            height = ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f) + iArr[1];
                                            width = right2;
                                        } else {
                                            i18 = a3.f15195d;
                                            if (i18 != -1) {
                                                viewFindViewById = motionLayout.findViewById(((m) motionLayout.f15305p.get(motionLayout.findViewById(i18))).f15386f.f15459p);
                                                if (viewFindViewById == null) {
                                                    Log.e("TouchResponse", "could not find view to animate to");
                                                } else {
                                                    motionLayout.getLocationOnScreen(iArr);
                                                    width = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                                    height = iArr[1] + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                                }
                                            }
                                        }
                                        rawX2 = motionEvent.getRawX() - width;
                                        rawY2 = motionEvent.getRawY() - height;
                                        dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                                        fAtan2 = (float) (((dAtan2 - Math.atan2(a3.f15208q - height, a3.f15207p - width)) * 180.0d) / 3.141592653589793d);
                                        if (fAtan2 > 330.0f) {
                                            fAtan2 -= 360.0f;
                                        } else if (fAtan2 < -330.0f) {
                                            fAtan2 += 360.0f;
                                        }
                                        if (Math.abs(fAtan2) <= 0.01d) {
                                            progress5 = motionLayout.getProgress();
                                            if (a3.f15204m) {
                                                z8 = true;
                                            } else {
                                                z8 = true;
                                                a3.f15204m = true;
                                                motionLayout.setProgress(progress5);
                                            }
                                            i19 = a3.f15195d;
                                            if (i19 != -1) {
                                                boolean z10 = z8;
                                                f18 = progress5;
                                                a3.f15209r.m(i19, f18, a3.f15199h, a3.f15198g, a3.f15205n);
                                                fArr[z10 ? 1 : 0] = (float) Math.toDegrees(fArr[z10 ? 1 : 0]);
                                                r18 = z10;
                                            } else {
                                                f18 = progress5;
                                                boolean z11 = z8;
                                                fArr[z11 ? 1 : 0] = 360.0f;
                                                r18 = z11;
                                            }
                                            fMax2 = Math.max(Math.min(((a3.f15212v * fAtan2) / fArr[r18]) + f18, 1.0f), 0.0f);
                                            progress6 = motionLayout.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    motionLayout.i();
                                                } else {
                                                    motionLayout.i();
                                                }
                                                motionLayout.setProgress(fMax2);
                                                sVar2.computeCurrentVelocity(1000);
                                                float xVelocity4 = sVar2.getXVelocity();
                                                double yVelocity4 = sVar2.getYVelocity();
                                                double d2 = xVelocity4;
                                                motionLayout.f15296d = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity4, d2) - dAtan2) * Math.hypot(yVelocity4, d2)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                motionLayout.f15296d = 0.0f;
                                            }
                                            a3.f15207p = motionEvent.getRawX();
                                            a3.f15208q = motionEvent.getRawY();
                                        } else {
                                            progress5 = motionLayout.getProgress();
                                            if (a3.f15204m) {
                                                z8 = true;
                                                a3.f15204m = true;
                                                motionLayout.setProgress(progress5);
                                            } else {
                                                z8 = true;
                                            }
                                            i19 = a3.f15195d;
                                            if (i19 != -1) {
                                                boolean z12 = z8;
                                                f18 = progress5;
                                                a3.f15209r.m(i19, f18, a3.f15199h, a3.f15198g, a3.f15205n);
                                                fArr[z12 ? 1 : 0] = (float) Math.toDegrees(fArr[z12 ? 1 : 0]);
                                                r18 = z12;
                                            } else {
                                                f18 = progress5;
                                                boolean z13 = z8;
                                                fArr[z13 ? 1 : 0] = 360.0f;
                                                r18 = z13;
                                            }
                                            fMax2 = Math.max(Math.min(((a3.f15212v * fAtan2) / fArr[r18]) + f18, 1.0f), 0.0f);
                                            progress6 = motionLayout.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    motionLayout.i();
                                                } else {
                                                    motionLayout.i();
                                                }
                                                motionLayout.setProgress(fMax2);
                                                sVar2.computeCurrentVelocity(1000);
                                                float xVelocity5 = sVar2.getXVelocity();
                                                double yVelocity5 = sVar2.getYVelocity();
                                                double d10 = xVelocity5;
                                                motionLayout.f15296d = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity5, d10) - dAtan2) * Math.hypot(yVelocity5, d10)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                motionLayout.f15296d = 0.0f;
                                            }
                                            a3.f15207p = motionEvent.getRawX();
                                            a3.f15208q = motionEvent.getRawY();
                                        }
                                    }
                                } else {
                                    a3.f15207p = motionEvent.getRawX();
                                    a3.f15208q = motionEvent.getRawY();
                                    a3.f15204m = false;
                                }
                            } else {
                                sVar2.addMovement(motionEvent);
                                action = motionEvent.getAction();
                                if (action == 0) {
                                    a3.f15207p = motionEvent.getRawX();
                                    a3.f15208q = motionEvent.getRawY();
                                    a3.f15204m = false;
                                } else if (action == 1) {
                                    a3.f15204m = false;
                                    sVar2.computeCurrentVelocity(1000);
                                    xVelocity = sVar2.getXVelocity();
                                    yVelocity = sVar2.getYVelocity();
                                    progress = motionLayout.getProgress();
                                    i10 = a3.f15195d;
                                    if (i10 != -1) {
                                        a3.f15209r.m(i10, progress, a3.f15199h, a3.f15198g, a3.f15205n);
                                        c6 = 1;
                                        c10 = 0;
                                    } else {
                                        float fMin = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                        c6 = 1;
                                        fArr[1] = a3.f15203l * fMin;
                                        c10 = 0;
                                        fArr[0] = fMin * a3.f15202k;
                                    }
                                    f10 = a3.f15202k;
                                    f11 = fArr[c10];
                                    f12 = fArr[c6];
                                    if (f10 != 0.0f) {
                                        fAbs = xVelocity / f11;
                                    } else {
                                        fAbs = yVelocity / f12;
                                    }
                                    if (Float.isNaN(fAbs)) {
                                        f13 = progress;
                                    } else {
                                        f13 = (fAbs / 3.0f) + progress;
                                    }
                                    if (f13 == 0.0f) {
                                        if (0.0f < f13) {
                                            motionLayout.setState(uVar);
                                        } else {
                                            motionLayout.setState(uVar);
                                        }
                                    } else if (0.0f < f13) {
                                        motionLayout.setState(uVar);
                                    } else {
                                        motionLayout.setState(uVar);
                                    }
                                } else if (action == 2) {
                                    rawY = motionEvent.getRawY() - a3.f15208q;
                                    rawX = motionEvent.getRawX() - a3.f15207p;
                                    if (Math.abs((a3.f15203l * rawY) + (a3.f15202k * rawX)) <= a3.f15214x) {
                                        progress2 = motionLayout.getProgress();
                                        if (!a3.f15204m) {
                                            a3.f15204m = true;
                                            motionLayout.setProgress(progress2);
                                        }
                                        i12 = a3.f15195d;
                                        if (i12 != -1) {
                                            a3.f15209r.m(i12, progress2, a3.f15199h, a3.f15198g, a3.f15205n);
                                            c11 = 1;
                                            c12 = 0;
                                        } else {
                                            float fMin2 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                            c11 = 1;
                                            fArr[1] = a3.f15203l * fMin2;
                                            c12 = 0;
                                            fArr[0] = fMin2 * a3.f15202k;
                                        }
                                        if (Math.abs(((a3.f15203l * fArr[c11]) + (a3.f15202k * fArr[c12])) * a3.f15212v) < 0.01d) {
                                            fArr[0] = 0.01f;
                                            fArr[c11] = 0.01f;
                                        }
                                        if (a3.f15202k != 0.0f) {
                                            f14 = rawX / fArr[0];
                                        } else {
                                            f14 = rawY / fArr[c11];
                                        }
                                        fMax = Math.max(Math.min(progress2 + f14, 1.0f), 0.0f);
                                        if (a3.f15194c == 6) {
                                            fMax = Math.max(fMax, 0.01f);
                                        }
                                        if (a3.f15194c == 7) {
                                            fMax = Math.min(fMax, 0.99f);
                                        }
                                        progress3 = motionLayout.getProgress();
                                        if (fMax != progress3) {
                                            if (progress3 != 0.0f) {
                                                motionLayout.i();
                                            } else {
                                                motionLayout.i();
                                            }
                                            motionLayout.setProgress(fMax);
                                            sVar2.computeCurrentVelocity(1000);
                                            xVelocity2 = sVar2.getXVelocity();
                                            yVelocity2 = sVar2.getYVelocity();
                                            if (a3.f15202k != 0.0f) {
                                                f15 = xVelocity2 / fArr[0];
                                            } else {
                                                f15 = yVelocity2 / fArr[1];
                                            }
                                            motionLayout.f15296d = f15;
                                        } else {
                                            motionLayout.f15296d = 0.0f;
                                        }
                                        a3.f15207p = motionEvent.getRawX();
                                        a3.f15208q = motionEvent.getRawY();
                                    } else {
                                        progress2 = motionLayout.getProgress();
                                        if (!a3.f15204m) {
                                            a3.f15204m = true;
                                            motionLayout.setProgress(progress2);
                                        }
                                        i12 = a3.f15195d;
                                        if (i12 != -1) {
                                            a3.f15209r.m(i12, progress2, a3.f15199h, a3.f15198g, a3.f15205n);
                                            c11 = 1;
                                            c12 = 0;
                                        } else {
                                            float fMin3 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                            c11 = 1;
                                            fArr[1] = a3.f15203l * fMin3;
                                            c12 = 0;
                                            fArr[0] = fMin3 * a3.f15202k;
                                        }
                                        if (Math.abs(((a3.f15203l * fArr[c11]) + (a3.f15202k * fArr[c12])) * a3.f15212v) < 0.01d) {
                                            fArr[0] = 0.01f;
                                            fArr[c11] = 0.01f;
                                        }
                                        if (a3.f15202k != 0.0f) {
                                            f14 = rawX / fArr[0];
                                        } else {
                                            f14 = rawY / fArr[c11];
                                        }
                                        fMax = Math.max(Math.min(progress2 + f14, 1.0f), 0.0f);
                                        if (a3.f15194c == 6) {
                                            fMax = Math.max(fMax, 0.01f);
                                        }
                                        if (a3.f15194c == 7) {
                                            fMax = Math.min(fMax, 0.99f);
                                        }
                                        progress3 = motionLayout.getProgress();
                                        if (fMax != progress3) {
                                            if (progress3 != 0.0f) {
                                                motionLayout.i();
                                            } else {
                                                motionLayout.i();
                                            }
                                            motionLayout.setProgress(fMax);
                                            sVar2.computeCurrentVelocity(1000);
                                            xVelocity2 = sVar2.getXVelocity();
                                            yVelocity2 = sVar2.getYVelocity();
                                            if (a3.f15202k != 0.0f) {
                                                f15 = xVelocity2 / fArr[0];
                                            } else {
                                                f15 = yVelocity2 / fArr[1];
                                            }
                                            motionLayout.f15296d = f15;
                                        } else {
                                            motionLayout.f15296d = 0.0f;
                                        }
                                        a3.f15207p = motionEvent.getRawX();
                                        a3.f15208q = motionEvent.getRawY();
                                    }
                                }
                            }
                        }
                        yVar2.f15500r = motionEvent.getRawX();
                        yVar2.f15501s = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            sVar.recycle();
                            yVar2.f15497o = null;
                            i7 = this.f15299f;
                            if (i7 != -1) {
                                yVar2.a(this, i7);
                            }
                        }
                    }
                }
            } else if (!yVar2.f15495m) {
                xVar = yVar2.f15485c;
                if (xVar != null) {
                    sVar2 = yVar2.f15497o;
                    z3 = a3.f15201j;
                    uVar = u.f15443d;
                    fArr = a3.f15205n;
                    motionLayout = a3.f15209r;
                    if (z3) {
                        sVar2.addMovement(motionEvent);
                        action2 = motionEvent.getAction();
                        if (action2 != 0) {
                            iArr = a3.f15206o;
                            if (action2 == 1) {
                                a3.f15204m = false;
                                sVar2.computeCurrentVelocity(16);
                                float xVelocity6 = sVar2.getXVelocity();
                                float yVelocity6 = sVar2.getYVelocity();
                                progress4 = motionLayout.getProgress();
                                float width3 = motionLayout.getWidth() / 2.0f;
                                float height3 = motionLayout.getHeight() / 2.0f;
                                i13 = a3.f15200i;
                                if (i13 != -1) {
                                    View viewFindViewById5 = motionLayout.findViewById(i13);
                                    motionLayout.getLocationOnScreen(iArr);
                                    right = iArr[0] + ((viewFindViewById5.getRight() + viewFindViewById5.getLeft()) / 2.0f);
                                    f16 = iArr[1];
                                    top2 = viewFindViewById5.getTop();
                                    bottom = viewFindViewById5.getBottom();
                                } else {
                                    i14 = a3.f15195d;
                                    if (i14 != -1) {
                                        View viewFindViewById6 = motionLayout.findViewById(((m) motionLayout.f15305p.get(motionLayout.findViewById(i14))).f15386f.f15459p);
                                        motionLayout.getLocationOnScreen(iArr);
                                        right = iArr[0] + ((viewFindViewById6.getRight() + viewFindViewById6.getLeft()) / 2.0f);
                                        f16 = iArr[1];
                                        top2 = viewFindViewById6.getTop();
                                        bottom = viewFindViewById6.getBottom();
                                    } else {
                                        float rawX6 = motionEvent.getRawX() - width3;
                                        float rawY6 = motionEvent.getRawY() - height3;
                                        double degrees4 = Math.toDegrees(Math.atan2(rawY6, rawX6));
                                        i15 = a3.f15195d;
                                        if (i15 != -1) {
                                            a3.f15209r.m(i15, progress4, a3.f15199h, a3.f15198g, a3.f15205n);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity6 + rawY6, xVelocity6 + rawX6)) - degrees4)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f17 = (((degrees * 3.0f) * a3.f15212v) / fArr[1]) + progress4;
                                        } else {
                                            f17 = progress4;
                                        }
                                        if (f17 == 0.0f) {
                                            if (0.0f < f17) {
                                                motionLayout.setState(uVar);
                                            } else {
                                                motionLayout.setState(uVar);
                                            }
                                        } else if (0.0f < f17) {
                                            motionLayout.setState(uVar);
                                        } else {
                                            motionLayout.setState(uVar);
                                        }
                                    }
                                }
                                float f28 = right;
                                height3 = ((bottom + top2) / 2.0f) + f16;
                                width3 = f28;
                                float rawX7 = motionEvent.getRawX() - width3;
                                float rawY7 = motionEvent.getRawY() - height3;
                                double degrees5 = Math.toDegrees(Math.atan2(rawY7, rawX7));
                                i15 = a3.f15195d;
                                if (i15 != -1) {
                                    a3.f15209r.m(i15, progress4, a3.f15199h, a3.f15198g, a3.f15205n);
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    fArr[1] = 360.0f;
                                }
                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity6 + rawY7, xVelocity6 + rawX7)) - degrees5)) * 62.5f;
                                if (Float.isNaN(degrees)) {
                                    f17 = (((degrees * 3.0f) * a3.f15212v) / fArr[1]) + progress4;
                                } else {
                                    f17 = progress4;
                                }
                                if (f17 == 0.0f) {
                                    if (0.0f < f17) {
                                        motionLayout.setState(uVar);
                                    } else {
                                        motionLayout.setState(uVar);
                                    }
                                } else if (0.0f < f17) {
                                    motionLayout.setState(uVar);
                                } else {
                                    motionLayout.setState(uVar);
                                }
                            } else if (action2 == 2) {
                                motionEvent.getRawY();
                                motionEvent.getRawX();
                                width = motionLayout.getWidth() / 2.0f;
                                height = motionLayout.getHeight() / 2.0f;
                                i17 = a3.f15200i;
                                if (i17 != -1) {
                                    View viewFindViewById7 = motionLayout.findViewById(i17);
                                    motionLayout.getLocationOnScreen(iArr);
                                    float right3 = iArr[0] + ((viewFindViewById7.getRight() + viewFindViewById7.getLeft()) / 2.0f);
                                    height = ((viewFindViewById7.getBottom() + viewFindViewById7.getTop()) / 2.0f) + iArr[1];
                                    width = right3;
                                } else {
                                    i18 = a3.f15195d;
                                    if (i18 != -1) {
                                        viewFindViewById = motionLayout.findViewById(((m) motionLayout.f15305p.get(motionLayout.findViewById(i18))).f15386f.f15459p);
                                        if (viewFindViewById == null) {
                                            Log.e("TouchResponse", "could not find view to animate to");
                                        } else {
                                            motionLayout.getLocationOnScreen(iArr);
                                            width = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                            height = iArr[1] + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                        }
                                    }
                                }
                                rawX2 = motionEvent.getRawX() - width;
                                rawY2 = motionEvent.getRawY() - height;
                                dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                                fAtan2 = (float) (((dAtan2 - Math.atan2(a3.f15208q - height, a3.f15207p - width)) * 180.0d) / 3.141592653589793d);
                                if (fAtan2 > 330.0f) {
                                    fAtan2 -= 360.0f;
                                } else if (fAtan2 < -330.0f) {
                                    fAtan2 += 360.0f;
                                }
                                if (Math.abs(fAtan2) <= 0.01d) {
                                    progress5 = motionLayout.getProgress();
                                    if (a3.f15204m) {
                                        z8 = true;
                                        a3.f15204m = true;
                                        motionLayout.setProgress(progress5);
                                    } else {
                                        z8 = true;
                                    }
                                    i19 = a3.f15195d;
                                    if (i19 != -1) {
                                        boolean z14 = z8;
                                        f18 = progress5;
                                        a3.f15209r.m(i19, f18, a3.f15199h, a3.f15198g, a3.f15205n);
                                        fArr[z14 ? 1 : 0] = (float) Math.toDegrees(fArr[z14 ? 1 : 0]);
                                        r18 = z14;
                                    } else {
                                        f18 = progress5;
                                        boolean z15 = z8;
                                        fArr[z15 ? 1 : 0] = 360.0f;
                                        r18 = z15;
                                    }
                                    fMax2 = Math.max(Math.min(((a3.f15212v * fAtan2) / fArr[r18]) + f18, 1.0f), 0.0f);
                                    progress6 = motionLayout.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            motionLayout.i();
                                        } else {
                                            motionLayout.i();
                                        }
                                        motionLayout.setProgress(fMax2);
                                        sVar2.computeCurrentVelocity(1000);
                                        float xVelocity7 = sVar2.getXVelocity();
                                        double yVelocity7 = sVar2.getYVelocity();
                                        double d11 = xVelocity7;
                                        motionLayout.f15296d = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity7, d11) - dAtan2) * Math.hypot(yVelocity7, d11)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout.f15296d = 0.0f;
                                    }
                                    a3.f15207p = motionEvent.getRawX();
                                    a3.f15208q = motionEvent.getRawY();
                                } else {
                                    progress5 = motionLayout.getProgress();
                                    if (a3.f15204m) {
                                        z8 = true;
                                        a3.f15204m = true;
                                        motionLayout.setProgress(progress5);
                                    } else {
                                        z8 = true;
                                    }
                                    i19 = a3.f15195d;
                                    if (i19 != -1) {
                                        boolean z16 = z8;
                                        f18 = progress5;
                                        a3.f15209r.m(i19, f18, a3.f15199h, a3.f15198g, a3.f15205n);
                                        fArr[z16 ? 1 : 0] = (float) Math.toDegrees(fArr[z16 ? 1 : 0]);
                                        r18 = z16;
                                    } else {
                                        f18 = progress5;
                                        boolean z17 = z8;
                                        fArr[z17 ? 1 : 0] = 360.0f;
                                        r18 = z17;
                                    }
                                    fMax2 = Math.max(Math.min(((a3.f15212v * fAtan2) / fArr[r18]) + f18, 1.0f), 0.0f);
                                    progress6 = motionLayout.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            motionLayout.i();
                                        } else {
                                            motionLayout.i();
                                        }
                                        motionLayout.setProgress(fMax2);
                                        sVar2.computeCurrentVelocity(1000);
                                        float xVelocity8 = sVar2.getXVelocity();
                                        double yVelocity8 = sVar2.getYVelocity();
                                        double d12 = xVelocity8;
                                        motionLayout.f15296d = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity8, d12) - dAtan2) * Math.hypot(yVelocity8, d12)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout.f15296d = 0.0f;
                                    }
                                    a3.f15207p = motionEvent.getRawX();
                                    a3.f15208q = motionEvent.getRawY();
                                }
                            }
                        } else {
                            a3.f15207p = motionEvent.getRawX();
                            a3.f15208q = motionEvent.getRawY();
                            a3.f15204m = false;
                        }
                    } else {
                        sVar2.addMovement(motionEvent);
                        action = motionEvent.getAction();
                        if (action == 0) {
                            a3.f15207p = motionEvent.getRawX();
                            a3.f15208q = motionEvent.getRawY();
                            a3.f15204m = false;
                        } else if (action == 1) {
                            a3.f15204m = false;
                            sVar2.computeCurrentVelocity(1000);
                            xVelocity = sVar2.getXVelocity();
                            yVelocity = sVar2.getYVelocity();
                            progress = motionLayout.getProgress();
                            i10 = a3.f15195d;
                            if (i10 != -1) {
                                a3.f15209r.m(i10, progress, a3.f15199h, a3.f15198g, a3.f15205n);
                                c6 = 1;
                                c10 = 0;
                            } else {
                                float fMin4 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                c6 = 1;
                                fArr[1] = a3.f15203l * fMin4;
                                c10 = 0;
                                fArr[0] = fMin4 * a3.f15202k;
                            }
                            f10 = a3.f15202k;
                            f11 = fArr[c10];
                            f12 = fArr[c6];
                            if (f10 != 0.0f) {
                                fAbs = xVelocity / f11;
                            } else {
                                fAbs = yVelocity / f12;
                            }
                            if (Float.isNaN(fAbs)) {
                                f13 = (fAbs / 3.0f) + progress;
                            } else {
                                f13 = progress;
                            }
                            if (f13 == 0.0f) {
                                if (0.0f < f13) {
                                    motionLayout.setState(uVar);
                                } else {
                                    motionLayout.setState(uVar);
                                }
                            } else if (0.0f < f13) {
                                motionLayout.setState(uVar);
                            } else {
                                motionLayout.setState(uVar);
                            }
                        } else if (action == 2) {
                            rawY = motionEvent.getRawY() - a3.f15208q;
                            rawX = motionEvent.getRawX() - a3.f15207p;
                            if (Math.abs((a3.f15203l * rawY) + (a3.f15202k * rawX)) <= a3.f15214x) {
                                progress2 = motionLayout.getProgress();
                                if (!a3.f15204m) {
                                    a3.f15204m = true;
                                    motionLayout.setProgress(progress2);
                                }
                                i12 = a3.f15195d;
                                if (i12 != -1) {
                                    a3.f15209r.m(i12, progress2, a3.f15199h, a3.f15198g, a3.f15205n);
                                    c11 = 1;
                                    c12 = 0;
                                } else {
                                    float fMin5 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                    c11 = 1;
                                    fArr[1] = a3.f15203l * fMin5;
                                    c12 = 0;
                                    fArr[0] = fMin5 * a3.f15202k;
                                }
                                if (Math.abs(((a3.f15203l * fArr[c11]) + (a3.f15202k * fArr[c12])) * a3.f15212v) < 0.01d) {
                                    fArr[0] = 0.01f;
                                    fArr[c11] = 0.01f;
                                }
                                if (a3.f15202k != 0.0f) {
                                    f14 = rawX / fArr[0];
                                } else {
                                    f14 = rawY / fArr[c11];
                                }
                                fMax = Math.max(Math.min(progress2 + f14, 1.0f), 0.0f);
                                if (a3.f15194c == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (a3.f15194c == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = motionLayout.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != 0.0f) {
                                        motionLayout.i();
                                    } else {
                                        motionLayout.i();
                                    }
                                    motionLayout.setProgress(fMax);
                                    sVar2.computeCurrentVelocity(1000);
                                    xVelocity2 = sVar2.getXVelocity();
                                    yVelocity2 = sVar2.getYVelocity();
                                    if (a3.f15202k != 0.0f) {
                                        f15 = xVelocity2 / fArr[0];
                                    } else {
                                        f15 = yVelocity2 / fArr[1];
                                    }
                                    motionLayout.f15296d = f15;
                                } else {
                                    motionLayout.f15296d = 0.0f;
                                }
                                a3.f15207p = motionEvent.getRawX();
                                a3.f15208q = motionEvent.getRawY();
                            } else {
                                progress2 = motionLayout.getProgress();
                                if (!a3.f15204m) {
                                    a3.f15204m = true;
                                    motionLayout.setProgress(progress2);
                                }
                                i12 = a3.f15195d;
                                if (i12 != -1) {
                                    a3.f15209r.m(i12, progress2, a3.f15199h, a3.f15198g, a3.f15205n);
                                    c11 = 1;
                                    c12 = 0;
                                } else {
                                    float fMin6 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                    c11 = 1;
                                    fArr[1] = a3.f15203l * fMin6;
                                    c12 = 0;
                                    fArr[0] = fMin6 * a3.f15202k;
                                }
                                if (Math.abs(((a3.f15203l * fArr[c11]) + (a3.f15202k * fArr[c12])) * a3.f15212v) < 0.01d) {
                                    fArr[0] = 0.01f;
                                    fArr[c11] = 0.01f;
                                }
                                if (a3.f15202k != 0.0f) {
                                    f14 = rawX / fArr[0];
                                } else {
                                    f14 = rawY / fArr[c11];
                                }
                                fMax = Math.max(Math.min(progress2 + f14, 1.0f), 0.0f);
                                if (a3.f15194c == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (a3.f15194c == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = motionLayout.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != 0.0f) {
                                        motionLayout.i();
                                    } else {
                                        motionLayout.i();
                                    }
                                    motionLayout.setProgress(fMax);
                                    sVar2.computeCurrentVelocity(1000);
                                    xVelocity2 = sVar2.getXVelocity();
                                    yVelocity2 = sVar2.getYVelocity();
                                    if (a3.f15202k != 0.0f) {
                                        f15 = xVelocity2 / fArr[0];
                                    } else {
                                        f15 = yVelocity2 / fArr[1];
                                    }
                                    motionLayout.f15296d = f15;
                                } else {
                                    motionLayout.f15296d = 0.0f;
                                }
                                a3.f15207p = motionEvent.getRawX();
                                a3.f15208q = motionEvent.getRawY();
                            }
                        }
                    }
                }
                yVar2.f15500r = motionEvent.getRawX();
                yVar2.f15501s = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    sVar.recycle();
                    yVar2.f15497o = null;
                    i7 = this.f15299f;
                    if (i7 != -1) {
                        yVar2.a(this, i7);
                    }
                }
            }
        } else if (!yVar2.f15495m) {
            xVar = yVar2.f15485c;
            if (xVar != null && (a3 = xVar.f15476l) != null && !yVar2.f15496n) {
                sVar2 = yVar2.f15497o;
                z3 = a3.f15201j;
                uVar = u.f15443d;
                fArr = a3.f15205n;
                motionLayout = a3.f15209r;
                if (z3) {
                    sVar2.addMovement(motionEvent);
                    action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        iArr = a3.f15206o;
                        if (action2 == 1) {
                            a3.f15204m = false;
                            sVar2.computeCurrentVelocity(16);
                            float xVelocity9 = sVar2.getXVelocity();
                            float yVelocity9 = sVar2.getYVelocity();
                            progress4 = motionLayout.getProgress();
                            float width4 = motionLayout.getWidth() / 2.0f;
                            float height4 = motionLayout.getHeight() / 2.0f;
                            i13 = a3.f15200i;
                            if (i13 != -1) {
                                View viewFindViewById8 = motionLayout.findViewById(i13);
                                motionLayout.getLocationOnScreen(iArr);
                                right = iArr[0] + ((viewFindViewById8.getRight() + viewFindViewById8.getLeft()) / 2.0f);
                                f16 = iArr[1];
                                top2 = viewFindViewById8.getTop();
                                bottom = viewFindViewById8.getBottom();
                            } else {
                                i14 = a3.f15195d;
                                if (i14 != -1) {
                                    View viewFindViewById9 = motionLayout.findViewById(((m) motionLayout.f15305p.get(motionLayout.findViewById(i14))).f15386f.f15459p);
                                    motionLayout.getLocationOnScreen(iArr);
                                    right = iArr[0] + ((viewFindViewById9.getRight() + viewFindViewById9.getLeft()) / 2.0f);
                                    f16 = iArr[1];
                                    top2 = viewFindViewById9.getTop();
                                    bottom = viewFindViewById9.getBottom();
                                } else {
                                    float rawX8 = motionEvent.getRawX() - width4;
                                    float rawY8 = motionEvent.getRawY() - height4;
                                    double degrees6 = Math.toDegrees(Math.atan2(rawY8, rawX8));
                                    i15 = a3.f15195d;
                                    if (i15 != -1) {
                                        a3.f15209r.m(i15, progress4, a3.f15199h, a3.f15198g, a3.f15205n);
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        fArr[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity9 + rawY8, xVelocity9 + rawX8)) - degrees6)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f17 = (((degrees * 3.0f) * a3.f15212v) / fArr[1]) + progress4;
                                    } else {
                                        f17 = progress4;
                                    }
                                    if (f17 == 0.0f && f17 != 1.0f && (i16 = a3.f15194c) != 3) {
                                        float fAbs2 = (degrees * a3.f15212v) / fArr[1];
                                        float f29 = ((double) f17) < 0.5d ? 0.0f : 1.0f;
                                        if (i16 == 6) {
                                            if (progress4 + fAbs2 < 0.0f) {
                                                fAbs2 = Math.abs(fAbs2);
                                            }
                                            f29 = 1.0f;
                                        }
                                        if (a3.f15194c == 7) {
                                            if (progress4 + fAbs2 > 1.0f) {
                                                fAbs2 = -Math.abs(fAbs2);
                                            }
                                            f29 = 0.0f;
                                        }
                                        motionLayout.w(f29, fAbs2 * 3.0f, a3.f15194c);
                                        if (0.0f >= progress4 || 1.0f <= progress4) {
                                            motionLayout.setState(uVar);
                                        }
                                    } else if (0.0f < f17 || 1.0f <= f17) {
                                        motionLayout.setState(uVar);
                                    }
                                }
                            }
                            float f210 = right;
                            height4 = ((bottom + top2) / 2.0f) + f16;
                            width4 = f210;
                            float rawX9 = motionEvent.getRawX() - width4;
                            float rawY9 = motionEvent.getRawY() - height4;
                            double degrees7 = Math.toDegrees(Math.atan2(rawY9, rawX9));
                            i15 = a3.f15195d;
                            if (i15 != -1) {
                                a3.f15209r.m(i15, progress4, a3.f15199h, a3.f15198g, a3.f15205n);
                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                            } else {
                                fArr[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity9 + rawY9, xVelocity9 + rawX9)) - degrees7)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f17 = (((degrees * 3.0f) * a3.f15212v) / fArr[1]) + progress4;
                            } else {
                                f17 = progress4;
                            }
                            if (f17 == 0.0f) {
                                if (0.0f < f17) {
                                    motionLayout.setState(uVar);
                                } else {
                                    motionLayout.setState(uVar);
                                }
                            } else if (0.0f < f17) {
                                motionLayout.setState(uVar);
                            } else {
                                motionLayout.setState(uVar);
                            }
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            width = motionLayout.getWidth() / 2.0f;
                            height = motionLayout.getHeight() / 2.0f;
                            i17 = a3.f15200i;
                            if (i17 != -1) {
                                View viewFindViewById10 = motionLayout.findViewById(i17);
                                motionLayout.getLocationOnScreen(iArr);
                                float right4 = iArr[0] + ((viewFindViewById10.getRight() + viewFindViewById10.getLeft()) / 2.0f);
                                height = ((viewFindViewById10.getBottom() + viewFindViewById10.getTop()) / 2.0f) + iArr[1];
                                width = right4;
                            } else {
                                i18 = a3.f15195d;
                                if (i18 != -1) {
                                    viewFindViewById = motionLayout.findViewById(((m) motionLayout.f15305p.get(motionLayout.findViewById(i18))).f15386f.f15459p);
                                    if (viewFindViewById == null) {
                                        Log.e("TouchResponse", "could not find view to animate to");
                                    } else {
                                        motionLayout.getLocationOnScreen(iArr);
                                        width = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                        height = iArr[1] + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                    }
                                }
                            }
                            rawX2 = motionEvent.getRawX() - width;
                            rawY2 = motionEvent.getRawY() - height;
                            dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                            fAtan2 = (float) (((dAtan2 - Math.atan2(a3.f15208q - height, a3.f15207p - width)) * 180.0d) / 3.141592653589793d);
                            if (fAtan2 > 330.0f) {
                                fAtan2 -= 360.0f;
                            } else if (fAtan2 < -330.0f) {
                                fAtan2 += 360.0f;
                            }
                            if (Math.abs(fAtan2) <= 0.01d || a3.f15204m) {
                                progress5 = motionLayout.getProgress();
                                if (a3.f15204m) {
                                    z8 = true;
                                    a3.f15204m = true;
                                    motionLayout.setProgress(progress5);
                                } else {
                                    z8 = true;
                                }
                                i19 = a3.f15195d;
                                if (i19 != -1) {
                                    boolean z18 = z8;
                                    f18 = progress5;
                                    a3.f15209r.m(i19, f18, a3.f15199h, a3.f15198g, a3.f15205n);
                                    fArr[z18 ? 1 : 0] = (float) Math.toDegrees(fArr[z18 ? 1 : 0]);
                                    r18 = z18;
                                } else {
                                    f18 = progress5;
                                    boolean z19 = z8;
                                    fArr[z19 ? 1 : 0] = 360.0f;
                                    r18 = z19;
                                }
                                fMax2 = Math.max(Math.min(((a3.f15212v * fAtan2) / fArr[r18]) + f18, 1.0f), 0.0f);
                                progress6 = motionLayout.getProgress();
                                if (fMax2 != progress6) {
                                    if (progress6 != 0.0f || progress6 == 1.0f) {
                                        motionLayout.i();
                                    }
                                    motionLayout.setProgress(fMax2);
                                    sVar2.computeCurrentVelocity(1000);
                                    float xVelocity10 = sVar2.getXVelocity();
                                    double yVelocity10 = sVar2.getYVelocity();
                                    double d13 = xVelocity10;
                                    motionLayout.f15296d = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity10, d13) - dAtan2) * Math.hypot(yVelocity10, d13)) / Math.hypot(rawX2, rawY2)));
                                } else {
                                    motionLayout.f15296d = 0.0f;
                                }
                                a3.f15207p = motionEvent.getRawX();
                                a3.f15208q = motionEvent.getRawY();
                            }
                        }
                    } else {
                        a3.f15207p = motionEvent.getRawX();
                        a3.f15208q = motionEvent.getRawY();
                        a3.f15204m = false;
                    }
                } else {
                    sVar2.addMovement(motionEvent);
                    action = motionEvent.getAction();
                    if (action == 0) {
                        a3.f15207p = motionEvent.getRawX();
                        a3.f15208q = motionEvent.getRawY();
                        a3.f15204m = false;
                    } else if (action == 1) {
                        a3.f15204m = false;
                        sVar2.computeCurrentVelocity(1000);
                        xVelocity = sVar2.getXVelocity();
                        yVelocity = sVar2.getYVelocity();
                        progress = motionLayout.getProgress();
                        i10 = a3.f15195d;
                        if (i10 != -1) {
                            a3.f15209r.m(i10, progress, a3.f15199h, a3.f15198g, a3.f15205n);
                            c6 = 1;
                            c10 = 0;
                        } else {
                            float fMin7 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                            c6 = 1;
                            fArr[1] = a3.f15203l * fMin7;
                            c10 = 0;
                            fArr[0] = fMin7 * a3.f15202k;
                        }
                        f10 = a3.f15202k;
                        f11 = fArr[c10];
                        f12 = fArr[c6];
                        if (f10 != 0.0f) {
                            fAbs = xVelocity / f11;
                        } else {
                            fAbs = yVelocity / f12;
                        }
                        if (Float.isNaN(fAbs)) {
                            f13 = (fAbs / 3.0f) + progress;
                        } else {
                            f13 = progress;
                        }
                        if (f13 == 0.0f && f13 != 1.0f && (i11 = a3.f15194c) != 3) {
                            float f30 = ((double) f13) < 0.5d ? 0.0f : 1.0f;
                            if (i11 == 6) {
                                if (progress + fAbs < 0.0f) {
                                    fAbs = Math.abs(fAbs);
                                }
                                f30 = 1.0f;
                            }
                            if (a3.f15194c == 7) {
                                if (progress + fAbs > 1.0f) {
                                    fAbs = -Math.abs(fAbs);
                                }
                                f30 = 0.0f;
                            }
                            motionLayout.w(f30, fAbs, a3.f15194c);
                            if (0.0f >= progress || 1.0f <= progress) {
                                motionLayout.setState(uVar);
                            }
                        } else if (0.0f < f13 || 1.0f <= f13) {
                            motionLayout.setState(uVar);
                        }
                    } else if (action == 2) {
                        rawY = motionEvent.getRawY() - a3.f15208q;
                        rawX = motionEvent.getRawX() - a3.f15207p;
                        if (Math.abs((a3.f15203l * rawY) + (a3.f15202k * rawX)) <= a3.f15214x || a3.f15204m) {
                            progress2 = motionLayout.getProgress();
                            if (!a3.f15204m) {
                                a3.f15204m = true;
                                motionLayout.setProgress(progress2);
                            }
                            i12 = a3.f15195d;
                            if (i12 != -1) {
                                a3.f15209r.m(i12, progress2, a3.f15199h, a3.f15198g, a3.f15205n);
                                c11 = 1;
                                c12 = 0;
                            } else {
                                float fMin8 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                c11 = 1;
                                fArr[1] = a3.f15203l * fMin8;
                                c12 = 0;
                                fArr[0] = fMin8 * a3.f15202k;
                            }
                            if (Math.abs(((a3.f15203l * fArr[c11]) + (a3.f15202k * fArr[c12])) * a3.f15212v) < 0.01d) {
                                fArr[0] = 0.01f;
                                fArr[c11] = 0.01f;
                            }
                            if (a3.f15202k != 0.0f) {
                                f14 = rawX / fArr[0];
                            } else {
                                f14 = rawY / fArr[c11];
                            }
                            fMax = Math.max(Math.min(progress2 + f14, 1.0f), 0.0f);
                            if (a3.f15194c == 6) {
                                fMax = Math.max(fMax, 0.01f);
                            }
                            if (a3.f15194c == 7) {
                                fMax = Math.min(fMax, 0.99f);
                            }
                            progress3 = motionLayout.getProgress();
                            if (fMax != progress3) {
                                if (progress3 != 0.0f || progress3 == 1.0f) {
                                    motionLayout.i();
                                }
                                motionLayout.setProgress(fMax);
                                sVar2.computeCurrentVelocity(1000);
                                xVelocity2 = sVar2.getXVelocity();
                                yVelocity2 = sVar2.getYVelocity();
                                if (a3.f15202k != 0.0f) {
                                    f15 = xVelocity2 / fArr[0];
                                } else {
                                    f15 = yVelocity2 / fArr[1];
                                }
                                motionLayout.f15296d = f15;
                            } else {
                                motionLayout.f15296d = 0.0f;
                            }
                            a3.f15207p = motionEvent.getRawX();
                            a3.f15208q = motionEvent.getRawY();
                        }
                    }
                }
            }
            yVar2.f15500r = motionEvent.getRawX();
            yVar2.f15501s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (sVar = yVar2.f15497o) != null) {
                sVar.recycle();
                yVar2.f15497o = null;
                i7 = this.f15299f;
                if (i7 != -1) {
                    yVar2.a(this, i7);
                }
            }
        }
        x xVar6 = this.f15290a.f15485c;
        if ((xVar6.f15482r & 4) != 0) {
            return xVar6.f15476l.f15204m;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f15266E0 == null) {
                this.f15266E0 = new CopyOnWriteArrayList();
            }
            this.f15266E0.add(motionHelper);
            if (motionHelper.f15256j) {
                if (this.f15262B0 == null) {
                    this.f15262B0 = new ArrayList();
                }
                this.f15262B0.add(motionHelper);
            }
            if (motionHelper.f15257o) {
                if (this.f15264C0 == null) {
                    this.f15264C0 = new ArrayList();
                }
                this.f15264C0.add(motionHelper);
            }
            if (motionHelper.isDecorator()) {
                if (this.f15265D0 == null) {
                    this.f15265D0 = new ArrayList();
                }
                this.f15265D0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f15262B0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f15264C0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final boolean p(float f10, float f11, View view, MotionEvent motionEvent) {
        boolean z3;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z3 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z3 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (p((childAt.getLeft() + f10) - view.getScrollX(), (childAt.getTop() + f11) - view.getScrollY(), childAt, motionEvent)) {
                z3 = true;
                break;
            }
            childCount--;
        }
        if (!z3) {
            float right = (view.getRight() + f10) - view.getLeft();
            float bottom = (view.getBottom() + f11) - view.getTop();
            RectF rectF = this.f15293b1;
            rectF.set(f10, f11, right, bottom);
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f12 = -f10;
                float f13 = -f11;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f12, f13);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f12, -f13);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f12, f13);
                    if (this.d1 == null) {
                        this.d1 = new Matrix();
                    }
                    matrix.invert(this.d1);
                    motionEventObtain.transform(this.d1);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z3;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i7) {
        this.mConstraintLayoutSpec = null;
    }

    public final void q(AttributeSet attributeSet) {
        y yVar;
        f1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.p.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z3 = true;
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == androidx.constraintlayout.widget.p.MotionLayout_layoutDescription) {
                    this.f15290a = new y(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == androidx.constraintlayout.widget.p.MotionLayout_currentState) {
                    this.f15299f = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == androidx.constraintlayout.widget.p.MotionLayout_motionProgress) {
                    this.f15263C = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f15274L = true;
                } else if (index == androidx.constraintlayout.widget.p.MotionLayout_applyMotionScene) {
                    z3 = typedArrayObtainStyledAttributes.getBoolean(index, z3);
                } else if (index == androidx.constraintlayout.widget.p.MotionLayout_showPaths) {
                    if (this.f15281Q == 0) {
                        this.f15281Q = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == androidx.constraintlayout.widget.p.MotionLayout_motionDebug) {
                    this.f15281Q = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f15290a == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z3) {
                this.f15290a = null;
            }
        }
        if (this.f15281Q != 0) {
            y yVar2 = this.f15290a;
            if (yVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iH = yVar2.h();
                y yVar3 = this.f15290a;
                androidx.constraintlayout.widget.m mVarB = yVar3.b(yVar3.h());
                J3.a.r(iH, getContext());
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (mVarB.l(childAt.getId()) == null) {
                        J3.a.s(childAt);
                    }
                }
                Integer[] numArr = (Integer[]) mVarB.f15858f.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i11 = 0; i11 < length; i11++) {
                    iArr[i11] = numArr[i11].intValue();
                }
                for (int i12 = 0; i12 < length; i12++) {
                    int i13 = iArr[i12];
                    J3.a.r(i13, getContext());
                    findViewById(iArr[i12]);
                    int i14 = mVarB.k(i13).f15747e.f15782d;
                    int i15 = mVarB.k(i13).f15747e.f15781c;
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (x xVar : this.f15290a.f15486d) {
                    x xVar2 = this.f15290a.f15485c;
                    if (xVar.f15468d == xVar.f15467c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i16 = xVar.f15468d;
                    int i17 = xVar.f15467c;
                    String strR = J3.a.r(i16, getContext());
                    String strR2 = J3.a.r(i17, getContext());
                    if (sparseIntArray.get(i16) == i17) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strR + "->" + strR2);
                    }
                    if (sparseIntArray2.get(i17) == i16) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strR + "->" + strR2);
                    }
                    sparseIntArray.put(i16, i17);
                    sparseIntArray2.put(i17, i16);
                    if (this.f15290a.b(i16) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + strR);
                    }
                    if (this.f15290a.b(i17) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + strR);
                    }
                }
            }
        }
        if (this.f15299f != -1 || (yVar = this.f15290a) == null) {
            return;
        }
        this.f15299f = yVar.h();
        this.f15297e = this.f15290a.h();
        x xVar3 = this.f15290a.f15485c;
        this.f15300g = xVar3 != null ? xVar3.f15467c : -1;
    }

    public final void r() {
        x xVar;
        A a3;
        View viewFindViewById;
        y yVar = this.f15290a;
        if (yVar == null) {
            return;
        }
        if (yVar.a(this, this.f15299f)) {
            requestLayout();
            return;
        }
        int i7 = this.f15299f;
        if (i7 != -1) {
            y yVar2 = this.f15290a;
            ArrayList<x> arrayList = yVar2.f15486d;
            for (x xVar2 : arrayList) {
                if (xVar2.f15477m.size() > 0) {
                    Iterator it = xVar2.f15477m.iterator();
                    while (it.hasNext()) {
                        ((w) it.next()).b(this);
                    }
                }
            }
            ArrayList<x> arrayList2 = yVar2.f15488f;
            for (x xVar3 : arrayList2) {
                if (xVar3.f15477m.size() > 0) {
                    Iterator it2 = xVar3.f15477m.iterator();
                    while (it2.hasNext()) {
                        ((w) it2.next()).b(this);
                    }
                }
            }
            for (x xVar4 : arrayList) {
                if (xVar4.f15477m.size() > 0) {
                    Iterator it3 = xVar4.f15477m.iterator();
                    while (it3.hasNext()) {
                        ((w) it3.next()).a(this, i7, xVar4);
                    }
                }
            }
            for (x xVar5 : arrayList2) {
                if (xVar5.f15477m.size() > 0) {
                    Iterator it4 = xVar5.f15477m.iterator();
                    while (it4.hasNext()) {
                        ((w) it4.next()).a(this, i7, xVar5);
                    }
                }
            }
        }
        if (!this.f15290a.q() || (xVar = this.f15290a.f15485c) == null || (a3 = xVar.f15476l) == null) {
            return;
        }
        int i10 = a3.f15195d;
        if (i10 != -1) {
            MotionLayout motionLayout = a3.f15209r;
            viewFindViewById = motionLayout.findViewById(i10);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + J3.a.r(a3.f15195d, motionLayout.getContext()));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new D8.a(1));
            nestedScrollView.setOnScrollChangeListener(new z());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        y yVar;
        x xVar;
        if (!this.f15273K0 && this.f15299f == -1 && (yVar = this.f15290a) != null && (xVar = yVar.f15485c) != null) {
            int i7 = xVar.f15481q;
            if (i7 == 0) {
                return;
            }
            if (i7 == 2) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    ((m) this.f15305p.get(getChildAt(i10))).f15384d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final void s() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.f15276M == null && ((copyOnWriteArrayList = this.f15266E0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.f15298e1;
        for (Integer num : arrayList) {
            TransitionListener transitionListener = this.f15276M;
            if (transitionListener != null) {
                transitionListener.onTransitionCompleted(this, num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f15266E0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    ((TransitionListener) it.next()).onTransitionCompleted(this, num.intValue());
                }
            }
        }
        arrayList.clear();
    }

    public void setDebugMode(int debugMode) {
        this.f15281Q = debugMode;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean delayedApply) {
        this.f15288X0 = delayedApply;
    }

    public void setInteractionEnabled(boolean enabled) {
        this.f15304o = enabled;
    }

    public void setInterpolatedProgress(float pos) {
        if (this.f15290a != null) {
            setState(u.f15442c);
            Interpolator interpolatorE = this.f15290a.e();
            if (interpolatorE != null) {
                setProgress(interpolatorE.getInterpolation(pos));
                return;
            }
        }
        setProgress(pos);
    }

    public void setOnHide(float progress) {
        ArrayList arrayList = this.f15264C0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((MotionHelper) this.f15264C0.get(i7)).setProgress(progress);
            }
        }
    }

    public void setOnShow(float progress) {
        ArrayList arrayList = this.f15262B0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((MotionHelper) this.f15262B0.get(i7)).setProgress(progress);
            }
        }
    }

    public void setProgress(float pos) {
        if (pos >= 0.0f) {
            int i7 = (pos > 1.0f ? 1 : (pos == 1.0f ? 0 : -1));
        }
        if (!super.isAttachedToWindow()) {
            if (this.f15285U0 == null) {
                this.f15285U0 = new t(this);
            }
            this.f15285U0.f15435a = pos;
            return;
        }
        u uVar = u.f15443d;
        u uVar2 = u.f15442c;
        if (pos <= 0.0f) {
            if (this.f15259A == 1.0f && this.f15299f == this.f15300g) {
                setState(uVar2);
            }
            this.f15299f = this.f15297e;
            if (this.f15259A == 0.0f) {
                setState(uVar);
            }
        } else if (pos >= 1.0f) {
            if (this.f15259A == 0.0f && this.f15299f == this.f15297e) {
                setState(uVar2);
            }
            this.f15299f = this.f15300g;
            if (this.f15259A == 1.0f) {
                setState(uVar);
            }
        } else {
            this.f15299f = -1;
            setState(uVar2);
        }
        if (this.f15290a == null) {
            return;
        }
        this.f15269H = true;
        this.f15263C = pos;
        this.f15314w = pos;
        this.f15261B = -1L;
        this.t = -1L;
        this.f15292b = null;
        this.f15274L = true;
        invalidate();
    }

    public void setScene(y scene) {
        A a3;
        this.f15290a = scene;
        boolean zIsRtl = isRtl();
        scene.f15498p = zIsRtl;
        x xVar = scene.f15485c;
        if (xVar != null && (a3 = xVar.f15476l) != null) {
            a3.c(zIsRtl);
        }
        t();
    }

    public void setStartState(int beginId) {
        if (super.isAttachedToWindow()) {
            this.f15299f = beginId;
            return;
        }
        if (this.f15285U0 == null) {
            this.f15285U0 = new t(this);
        }
        t tVar = this.f15285U0;
        tVar.f15437c = beginId;
        tVar.f15438d = beginId;
    }

    public void setState(u newState) {
        u uVar = u.f15443d;
        if (newState == uVar && this.f15299f == -1) {
            return;
        }
        u uVar2 = this.f15289Y0;
        this.f15289Y0 = newState;
        u uVar3 = u.f15442c;
        if (uVar2 == uVar3 && newState == uVar3) {
            k();
        }
        int iOrdinal = uVar2.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && newState == uVar) {
                l();
                return;
            }
            return;
        }
        if (newState == uVar3) {
            k();
        }
        if (newState == uVar) {
            l();
        }
    }

    public void setTransition(int transitionId) {
        float f10;
        if (this.f15290a != null) {
            x xVarO = o(transitionId);
            this.f15297e = xVarO.f15468d;
            this.f15300g = xVarO.f15467c;
            if (!super.isAttachedToWindow()) {
                if (this.f15285U0 == null) {
                    this.f15285U0 = new t(this);
                }
                t tVar = this.f15285U0;
                tVar.f15437c = this.f15297e;
                tVar.f15438d = this.f15300g;
                return;
            }
            int i7 = this.f15299f;
            if (i7 == this.f15297e) {
                f10 = 0.0f;
            } else {
                f10 = i7 == this.f15300g ? 1.0f : Float.NaN;
            }
            y yVar = this.f15290a;
            yVar.f15485c = xVarO;
            A a3 = xVarO.f15476l;
            if (a3 != null) {
                a3.c(yVar.f15498p);
            }
            this.Z0.e(this.f15290a.b(this.f15297e), this.f15290a.b(this.f15300g));
            t();
            if (this.f15259A != f10) {
                if (f10 == 0.0f) {
                    i();
                    this.f15290a.b(this.f15297e).b(this);
                } else if (f10 == 1.0f) {
                    i();
                    this.f15290a.b(this.f15300g).b(this);
                }
            }
            this.f15259A = Float.isNaN(f10) ? 0.0f : f10;
            if (!Float.isNaN(f10)) {
                setProgress(f10);
            } else {
                J3.a.p();
                y();
            }
        }
    }

    public void setTransitionDuration(int milliseconds) {
        y yVar = this.f15290a;
        if (yVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        x xVar = yVar.f15485c;
        if (xVar != null) {
            xVar.f15472h = Math.max(milliseconds, 8);
        } else {
            yVar.f15492j = milliseconds;
        }
    }

    public void setTransitionListener(TransitionListener listener) {
        this.f15276M = listener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f15285U0 == null) {
            this.f15285U0 = new t(this);
        }
        t tVar = this.f15285U0;
        tVar.getClass();
        tVar.f15435a = bundle.getFloat("motion.progress");
        tVar.f15436b = bundle.getFloat("motion.velocity");
        tVar.f15437c = bundle.getInt("motion.StartState");
        tVar.f15438d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.f15285U0.a();
        }
    }

    public final void t() {
        this.Z0.f();
        invalidate();
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return J3.a.r(this.f15297e, context) + "->" + J3.a.r(this.f15300g, context) + " (pos:" + this.f15259A + " Dpos/Dt:" + this.f15296d;
    }

    public final void u(float f10, float f11) {
        if (!super.isAttachedToWindow()) {
            if (this.f15285U0 == null) {
                this.f15285U0 = new t(this);
            }
            t tVar = this.f15285U0;
            tVar.f15435a = f10;
            tVar.f15436b = f11;
            return;
        }
        setProgress(f10);
        setState(u.f15442c);
        this.f15296d = f11;
        if (f11 != 0.0f) {
            h(f11 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f10 == 0.0f || f10 == 1.0f) {
                return;
            }
            h(f10 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public final void v(int i7, int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.f15285U0 == null) {
                this.f15285U0 = new t(this);
            }
            t tVar = this.f15285U0;
            tVar.f15437c = i7;
            tVar.f15438d = i10;
            return;
        }
        y yVar = this.f15290a;
        if (yVar != null) {
            this.f15297e = i7;
            this.f15300g = i10;
            yVar.p(i7, i10);
            this.Z0.e(this.f15290a.b(i7), this.f15290a.b(i10));
            t();
            this.f15259A = 0.0f;
            y();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    /* JADX WARN: Code duplicated, block: B:84:0x012d  */
    public final void w(float f10, float f11, int i7) {
        y yVar;
        x xVar;
        int i10;
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        A a3;
        A a10;
        A a11;
        A a12;
        A a13;
        x xVar2;
        A a14;
        A a15;
        x xVar3;
        float f16;
        A a16;
        if (this.f15290a == null || this.f15259A == f10) {
            return;
        }
        this.f15306p0 = true;
        this.t = getNanoTime();
        float fC = this.f15290a.c() / 1000.0f;
        this.f15312v = fC;
        this.f15263C = f10;
        this.f15274L = true;
        T.a aVar = this.f15307q0;
        float f17 = 0.0f;
        float f18 = 1.0f;
        if (i7 == 0 || i7 == 1 || i7 == 2) {
            if (i7 != 1 || i7 == 7) {
                f18 = 0.0f;
            } else if (i7 != 2 && i7 != 6) {
                f18 = f10;
            }
            yVar = this.f15290a;
            xVar = yVar.f15485c;
            if (xVar != null || (a15 = xVar.f15476l) == null) {
                i10 = 0;
            } else {
                i10 = a15.f15191D;
            }
            if (i10 == 0) {
                float f19 = this.f15259A;
                float fG = yVar.g();
                xVar2 = this.f15290a.f15485c;
                if (xVar2 != null && (a14 = xVar2.f15476l) != null) {
                    f17 = a14.f15210s;
                }
                this.f15307q0.b(f19, f18, f11, fC, fG, f17);
            } else {
                float f20 = this.f15259A;
                if (xVar != null || (a13 = xVar.f15476l) == null) {
                    f12 = 0.0f;
                } else {
                    f12 = a13.f15216z;
                }
                if (xVar != null || (a12 = xVar.f15476l) == null) {
                    f13 = 0.0f;
                } else {
                    f13 = a12.f15188A;
                }
                if (xVar != null || (a11 = xVar.f15476l) == null) {
                    f14 = 0.0f;
                } else {
                    f14 = a11.f15215y;
                }
                if (xVar != null || (a10 = xVar.f15476l) == null) {
                    f15 = 0.0f;
                } else {
                    f15 = a10.f15189B;
                }
                if (xVar != null || (a3 = xVar.f15476l) == null) {
                    i11 = 0;
                } else {
                    i11 = a3.f15190C;
                }
                if (aVar.f8911b == null) {
                    O.i iVar = new O.i();
                    iVar.f6500a = 0.5d;
                    iVar.f6508i = 0;
                    aVar.f8911b = iVar;
                }
                O.i iVar2 = aVar.f8911b;
                aVar.f8912c = iVar2;
                iVar2.f6502c = f18;
                iVar2.f6500a = f14;
                iVar2.f6504e = f20;
                iVar2.f6501b = f13;
                iVar2.f6506g = f12;
                iVar2.f6507h = f15;
                iVar2.f6508i = i11;
                iVar2.f6503d = 0.0f;
            }
            int i12 = this.f15299f;
            this.f15263C = f18;
            this.f15299f = i12;
            this.f15292b = aVar;
        } else {
            p pVar = this.f15308r0;
            if (i7 == 4) {
                float f21 = this.f15259A;
                float fG2 = this.f15290a.g();
                pVar.f15408a = f11;
                pVar.f15409b = f21;
                pVar.f15410c = fG2;
                this.f15292b = pVar;
            } else if (i7 == 5) {
                float f22 = this.f15259A;
                float fG3 = this.f15290a.g();
                if (f11 > 0.0f) {
                    float f23 = f11 / fG3;
                    if (((f11 * f23) - (((fG3 * f23) * f23) / 2.0f)) + f22 > 1.0f) {
                        float f24 = this.f15259A;
                        float fG4 = this.f15290a.g();
                        pVar.f15408a = f11;
                        pVar.f15409b = f24;
                        pVar.f15410c = fG4;
                        this.f15292b = pVar;
                    } else {
                        float f25 = this.f15259A;
                        float f26 = this.f15312v;
                        float fG5 = this.f15290a.g();
                        xVar3 = this.f15290a.f15485c;
                        if (xVar3 != null || (a16 = xVar3.f15476l) == null) {
                            f16 = 0.0f;
                        } else {
                            f16 = a16.f15210s;
                        }
                        this.f15307q0.b(f25, f10, f11, f26, fG5, f16);
                        this.f15296d = 0.0f;
                        int i13 = this.f15299f;
                        this.f15263C = f10;
                        this.f15299f = i13;
                        this.f15292b = aVar;
                    }
                } else {
                    float f27 = (-f11) / fG3;
                    if ((((fG3 * f27) * f27) / 2.0f) + (f11 * f27) + f22 < 0.0f) {
                        float f28 = this.f15259A;
                        float fG6 = this.f15290a.g();
                        pVar.f15408a = f11;
                        pVar.f15409b = f28;
                        pVar.f15410c = fG6;
                        this.f15292b = pVar;
                    } else {
                        float f29 = this.f15259A;
                        float f210 = this.f15312v;
                        float fG7 = this.f15290a.g();
                        xVar3 = this.f15290a.f15485c;
                        if (xVar3 != null) {
                            f16 = 0.0f;
                        } else {
                            f16 = 0.0f;
                        }
                        this.f15307q0.b(f29, f10, f11, f210, fG7, f16);
                        this.f15296d = 0.0f;
                        int i14 = this.f15299f;
                        this.f15263C = f10;
                        this.f15299f = i14;
                        this.f15292b = aVar;
                    }
                }
            } else if (i7 == 6 || i7 == 7) {
                if (i7 != 1) {
                    f18 = 0.0f;
                } else {
                    f18 = 0.0f;
                }
                yVar = this.f15290a;
                xVar = yVar.f15485c;
                if (xVar != null) {
                    i10 = 0;
                } else {
                    i10 = 0;
                }
                if (i10 == 0) {
                    float f110 = this.f15259A;
                    float fG8 = yVar.g();
                    xVar2 = this.f15290a.f15485c;
                    if (xVar2 != null) {
                        f17 = a14.f15210s;
                    }
                    this.f15307q0.b(f110, f18, f11, fC, fG8, f17);
                } else {
                    float f211 = this.f15259A;
                    if (xVar != null) {
                        f12 = 0.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    if (xVar != null) {
                        f13 = 0.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    if (xVar != null) {
                        f14 = 0.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    if (xVar != null) {
                        f15 = 0.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    if (xVar != null) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                    }
                    if (aVar.f8911b == null) {
                        O.i iVar3 = new O.i();
                        iVar3.f6500a = 0.5d;
                        iVar3.f6508i = 0;
                        aVar.f8911b = iVar3;
                    }
                    O.i iVar4 = aVar.f8911b;
                    aVar.f8912c = iVar4;
                    iVar4.f6502c = f18;
                    iVar4.f6500a = f14;
                    iVar4.f6504e = f211;
                    iVar4.f6501b = f13;
                    iVar4.f6506g = f12;
                    iVar4.f6507h = f15;
                    iVar4.f6508i = i11;
                    iVar4.f6503d = 0.0f;
                }
                int i15 = this.f15299f;
                this.f15263C = f18;
                this.f15299f = i15;
                this.f15292b = aVar;
            }
        }
        this.f15269H = false;
        this.t = getNanoTime();
        invalidate();
    }

    public final void x() {
        h(1.0f);
        this.f15286V0 = null;
    }

    public final void y() {
        h(0.0f);
    }

    public final void z(int i7) {
        if (super.isAttachedToWindow()) {
            B(i7, -1);
            return;
        }
        if (this.f15285U0 == null) {
            this.f15285U0 = new t(this);
        }
        this.f15285U0.f15438d = i7;
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        if (this.f15313v0 || i7 != 0 || i10 != 0) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }
        this.f15313v0 = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i7, int i10, int i11) {
        setState(u.f15441b);
        this.f15299f = i7;
        this.f15297e = -1;
        this.f15300g = -1;
        androidx.constraintlayout.widget.f fVar = this.mConstraintLayoutSpec;
        if (fVar != null) {
            fVar.b(i10, i11, i7);
            return;
        }
        y yVar = this.f15290a;
        if (yVar != null) {
            yVar.b(i7).b(this);
        }
    }

    public void setTransition(x transition) {
        A a3;
        y yVar = this.f15290a;
        yVar.f15485c = transition;
        if (transition != null && (a3 = transition.f15476l) != null) {
            a3.c(yVar.f15498p);
        }
        setState(u.f15441b);
        int i7 = this.f15299f;
        x xVar = this.f15290a.f15485c;
        if (i7 == (xVar == null ? -1 : xVar.f15467c)) {
            this.f15259A = 1.0f;
            this.f15314w = 1.0f;
            this.f15263C = 1.0f;
        } else {
            this.f15259A = 0.0f;
            this.f15314w = 0.0f;
            this.f15263C = 0.0f;
        }
        this.f15261B = (transition.f15482r & 1) != 0 ? -1L : getNanoTime();
        int iH = this.f15290a.h();
        y yVar2 = this.f15290a;
        x xVar2 = yVar2.f15485c;
        int i10 = xVar2 != null ? xVar2.f15467c : -1;
        if (iH == this.f15297e && i10 == this.f15300g) {
            return;
        }
        this.f15297e = iH;
        this.f15300g = i10;
        yVar2.p(iH, i10);
        androidx.constraintlayout.widget.m mVarB = this.f15290a.b(this.f15297e);
        androidx.constraintlayout.widget.m mVarB2 = this.f15290a.b(this.f15300g);
        r rVar = this.Z0;
        rVar.e(mVarB, mVarB2);
        int i11 = this.f15297e;
        int i12 = this.f15300g;
        rVar.f15430e = i11;
        rVar.f15431f = i12;
        rVar.f();
        t();
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.f15294c = null;
        this.f15296d = 0.0f;
        this.f15297e = -1;
        this.f15299f = -1;
        this.f15300g = -1;
        this.f15301i = 0;
        this.f15302j = 0;
        this.f15304o = true;
        this.f15305p = new HashMap();
        this.t = 0L;
        this.f15312v = 1.0f;
        this.f15314w = 0.0f;
        this.f15259A = 0.0f;
        this.f15263C = 0.0f;
        this.f15274L = false;
        this.f15281Q = 0;
        this.f15306p0 = false;
        this.f15307q0 = new T.a();
        this.f15308r0 = new p(this);
        this.f15313v0 = false;
        this.f15260A0 = false;
        this.f15262B0 = null;
        this.f15264C0 = null;
        this.f15265D0 = null;
        this.f15266E0 = null;
        this.f15267F0 = 0;
        this.f15268G0 = -1L;
        this.f15270H0 = 0.0f;
        this.f15271I0 = 0;
        this.f15272J0 = 0.0f;
        this.f15273K0 = false;
        this.f15284S0 = new O.e(1);
        this.T0 = false;
        this.f15286V0 = null;
        new HashMap();
        this.f15287W0 = new Rect();
        this.f15288X0 = false;
        this.f15289Y0 = u.f15440a;
        this.Z0 = new r(this);
        this.f15291a1 = false;
        this.f15293b1 = new RectF();
        this.f15295c1 = null;
        this.d1 = null;
        this.f15298e1 = new ArrayList();
        q(attrs);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15294c = null;
        this.f15296d = 0.0f;
        this.f15297e = -1;
        this.f15299f = -1;
        this.f15300g = -1;
        this.f15301i = 0;
        this.f15302j = 0;
        this.f15304o = true;
        this.f15305p = new HashMap();
        this.t = 0L;
        this.f15312v = 1.0f;
        this.f15314w = 0.0f;
        this.f15259A = 0.0f;
        this.f15263C = 0.0f;
        this.f15274L = false;
        this.f15281Q = 0;
        this.f15306p0 = false;
        this.f15307q0 = new T.a();
        this.f15308r0 = new p(this);
        this.f15313v0 = false;
        this.f15260A0 = false;
        this.f15262B0 = null;
        this.f15264C0 = null;
        this.f15265D0 = null;
        this.f15266E0 = null;
        this.f15267F0 = 0;
        this.f15268G0 = -1L;
        this.f15270H0 = 0.0f;
        this.f15271I0 = 0;
        this.f15272J0 = 0.0f;
        this.f15273K0 = false;
        this.f15284S0 = new O.e(1);
        this.T0 = false;
        this.f15286V0 = null;
        new HashMap();
        this.f15287W0 = new Rect();
        this.f15288X0 = false;
        this.f15289Y0 = u.f15440a;
        this.Z0 = new r(this);
        this.f15291a1 = false;
        this.f15293b1 = new RectF();
        this.f15295c1 = null;
        this.d1 = null;
        this.f15298e1 = new ArrayList();
        q(attrs);
    }
}
