package androidx.constraintlayout.motion.widget;

import C0.G;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.common.base.Ascii;
import com.horcrux.svg.d0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15383c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p059e1.a[] f15390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public O.b f15391k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f15395o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double[] f15396p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double[] f15397q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f15398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f15399s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap f15403x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap f15404y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashMap f15405z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f15381a = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15384d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15385e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f15386f = new v();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f15387g = new v();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f15388h = new k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f15389i = new k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15392l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f15393m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15394n = 1.0f;
    public final float[] t = new float[4];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f15400u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f15401v = new float[1];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f15402w = new ArrayList();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15374A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15375B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f15376C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f15377D = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f15378E = Float.NaN;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Interpolator f15379F = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f15380G = false;

    public m(View view) {
        this.f15382b = view;
        this.f15383c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).getClass();
        }
    }

    public static void j(Rect rect, Rect rect2, int i7, int i10, int i11) {
        if (i7 == 1) {
            int i12 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i11 - ((rect.height() + i12) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i7 == 2) {
            int i13 = rect.left + rect.right;
            rect2.left = i10 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i13 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i7 == 3) {
            int i14 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i14 / 2);
            rect2.top = i11 - ((rect.height() + i14) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i7 != 4) {
            return;
        }
        int i15 = rect.left + rect.right;
        rect2.left = i10 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i15 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final void a(AbstractC1029b abstractC1029b) {
        this.f15402w.add(abstractC1029b);
    }

    public final int b(int[] iArr, float[] fArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrJ = this.f15390j[0].J();
        if (iArr != null) {
            Iterator it = this.f15400u.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                iArr[i7] = ((v) it.next()).f15446A;
                i7++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < dArrJ.length; i11++) {
            this.f15390j[0].w(dArrJ[i11], this.f15396p);
            this.f15386f.c(dArrJ[i11], this.f15395o, this.f15396p, fArr, i10);
            i10 += 2;
        }
        return i10 / 2;
    }

    public final void c(int i7, float[] fArr) {
        int i10 = i7;
        float f10 = 1.0f;
        float f11 = 1.0f / (i10 - 1);
        HashMap map = this.f15404y;
        androidx.constraintlayout.core.motion.utils.b bVar = map == null ? null : (androidx.constraintlayout.core.motion.utils.b) map.get("translationX");
        HashMap map2 = this.f15404y;
        androidx.constraintlayout.core.motion.utils.b bVar2 = map2 == null ? null : (androidx.constraintlayout.core.motion.utils.b) map2.get("translationY");
        HashMap map3 = this.f15405z;
        T.f fVar = map3 == null ? null : (T.f) map3.get("translationX");
        HashMap map4 = this.f15405z;
        T.f fVar2 = map4 != null ? (T.f) map4.get("translationY") : null;
        int i11 = 0;
        while (i11 < i10) {
            float fMin = i11 * f11;
            float f12 = this.f15394n;
            float f13 = 0.0f;
            if (f12 != f10) {
                float f14 = this.f15393m;
                if (fMin < f14) {
                    fMin = 0.0f;
                }
                if (fMin > f14 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f14) * f12, f10);
                }
            }
            double dA = fMin;
            O.e eVar = this.f15386f.f15449a;
            float f15 = Float.NaN;
            for (v vVar : this.f15400u) {
                O.e eVar2 = vVar.f15449a;
                if (eVar2 != null) {
                    float f16 = vVar.f15451c;
                    if (f16 < fMin) {
                        f13 = f16;
                        eVar = eVar2;
                    } else if (Float.isNaN(f15)) {
                        f15 = vVar.f15451c;
                    }
                }
            }
            if (eVar != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                float f17 = f15 - f13;
                dA = (((float) eVar.a((fMin - f13) / f17)) * f17) + f13;
            }
            this.f15390j[0].w(dA, this.f15396p);
            O.b bVar3 = this.f15391k;
            if (bVar3 != null) {
                double[] dArr = this.f15396p;
                if (dArr.length > 0) {
                    bVar3.w(dA, dArr);
                }
            }
            int i12 = i11 * 2;
            this.f15386f.c(dA, this.f15395o, this.f15396p, fArr, i12);
            if (fVar != null) {
                fArr[i12] = fVar.a(fMin) + fArr[i12];
            } else if (bVar != null) {
                fArr[i12] = bVar.a(fMin) + fArr[i12];
            }
            if (fVar2 != null) {
                int i13 = i12 + 1;
                fArr[i13] = fVar2.a(fMin) + fArr[i13];
            } else if (bVar2 != null) {
                int i14 = i12 + 1;
                fArr[i14] = bVar2.a(fMin) + fArr[i14];
            }
            i11++;
            i10 = i7;
            f10 = 1.0f;
        }
    }

    public final float d(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f15394n;
            if (f12 != 1.0d) {
                float f13 = this.f15393m;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        O.e eVar = this.f15386f.f15449a;
        float f14 = Float.NaN;
        for (v vVar : this.f15400u) {
            O.e eVar2 = vVar.f15449a;
            if (eVar2 != null) {
                float f15 = vVar.f15451c;
                if (f15 < f10) {
                    eVar = eVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = vVar.f15451c;
                }
            }
        }
        if (eVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d2 = (f10 - f11) / f16;
            f10 = (((float) eVar.a(d2)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) eVar.b(d2);
            }
        }
        return f10;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r11v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v6 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r13v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v0 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r13v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r13v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v5 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r13v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v6 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r14v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v3 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: float[]
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
    /* JADX WARN: Failed to calculate best type for var: r3v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v3 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r3v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v4 ??, new type: float
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
    /* JADX WARN: Failed to set immutable type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: float
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
    public final void e(double r23, float[] r25, float[] r26) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.m.e(double, float[], float[]):void");
    }

    public final void f(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f15401v;
        float fD = d(f10, fArr2);
        p059e1.a[] aVarArr = this.f15390j;
        int i7 = 0;
        if (aVarArr == null) {
            v vVar = this.f15387g;
            float f13 = vVar.f15453e;
            v vVar2 = this.f15386f;
            float f14 = f13 - vVar2.f15453e;
            float f15 = vVar.f15454f - vVar2.f15454f;
            float f16 = vVar.f15455g - vVar2.f15455g;
            float f17 = (vVar.f15456i - vVar2.f15456i) + f15;
            fArr[0] = ((f16 + f14) * f11) + ((1.0f - f11) * f14);
            fArr[1] = (f17 * f12) + ((1.0f - f12) * f15);
            return;
        }
        double d2 = fD;
        aVarArr[0].B(d2, this.f15397q);
        this.f15390j[0].w(d2, this.f15396p);
        float f18 = fArr2[0];
        while (true) {
            dArr = this.f15397q;
            if (i7 >= dArr.length) {
                break;
            }
            dArr[i7] = dArr[i7] * ((double) f18);
            i7++;
        }
        O.b bVar = this.f15391k;
        if (bVar == null) {
            int[] iArr = this.f15395o;
            double[] dArr2 = this.f15396p;
            this.f15386f.getClass();
            v.f(f11, f12, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.f15396p;
        if (dArr3.length > 0) {
            bVar.w(d2, dArr3);
            this.f15391k.B(d2, this.f15397q);
            int[] iArr2 = this.f15395o;
            double[] dArr4 = this.f15397q;
            double[] dArr5 = this.f15396p;
            this.f15386f.getClass();
            v.f(f11, f12, fArr, iArr2, dArr4, dArr5);
        }
    }

    public final float g(float f10, float f11, int i7) {
        v vVar = this.f15387g;
        float f12 = vVar.f15453e;
        v vVar2 = this.f15386f;
        float f13 = vVar2.f15453e;
        float f14 = f12 - f13;
        float f15 = vVar.f15454f;
        float f16 = vVar2.f15454f;
        float f17 = f15 - f16;
        float f18 = (vVar2.f15455g / 2.0f) + f13;
        float f19 = (vVar2.f15456i / 2.0f) + f16;
        float fHypot = (float) Math.hypot(f14, f17);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f20 = f10 - f18;
        float f21 = f11 - f19;
        if (((float) Math.hypot(f20, f21)) == 0.0f) {
            return 0.0f;
        }
        float f22 = (f21 * f17) + (f20 * f14);
        if (i7 == 0) {
            return f22 / fHypot;
        }
        if (i7 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f22 * f22));
        }
        if (i7 == 2) {
            return f20 / f14;
        }
        if (i7 == 3) {
            return f21 / f14;
        }
        if (i7 == 4) {
            return f20 / f17;
        }
        if (i7 != 5) {
            return 0.0f;
        }
        return f21 / f17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(float f10, long j6, O.e eVar, View view) {
        boolean zB;
        boolean z3;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        T.n nVar = null;
        float fD = d(f10, null);
        int i7 = this.f15377D;
        if (i7 != -1) {
            float f17 = 1.0f / i7;
            float fFloor = ((float) Math.floor(fD / f17)) * f17;
            float f18 = (fD % f17) / f17;
            if (!Float.isNaN(this.f15378E)) {
                f18 = (f18 + this.f15378E) % 1.0f;
            }
            Interpolator interpolator = this.f15379F;
            fD = ((interpolator != null ? interpolator.getInterpolation(f18) : ((double) f18) > 0.5d ? 1.0f : 0.0f) * f17) + fFloor;
        }
        HashMap map = this.f15404y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((T.k) it.next()).d(view, fD);
            }
        }
        HashMap map2 = this.f15403x;
        if (map2 != null) {
            T.n nVar2 = null;
            zB = false;
            for (T.p pVar : map2.values()) {
                if (pVar instanceof T.n) {
                    nVar2 = (T.n) pVar;
                } else {
                    zB |= pVar.b(fD, j6, eVar, view);
                }
            }
            nVar = nVar2;
        } else {
            zB = false;
        }
        p059e1.a[] aVarArr = this.f15390j;
        v vVar = this.f15386f;
        if (aVarArr != null) {
            double d2 = fD;
            aVarArr[0].w(d2, this.f15396p);
            this.f15390j[0].B(d2, this.f15397q);
            O.b bVar = this.f15391k;
            if (bVar != null) {
                double[] dArr = this.f15396p;
                f11 = 1.0f;
                if (dArr.length > 0) {
                    bVar.w(d2, dArr);
                    this.f15391k.B(d2, this.f15397q);
                }
            } else {
                f11 = 1.0f;
            }
            if (this.f15380G) {
                zB = zB;
                d2 = d2;
                f12 = 2.0f;
            } else {
                int[] iArr = this.f15395o;
                double[] dArr2 = this.f15396p;
                f12 = 2.0f;
                double[] dArr3 = this.f15397q;
                boolean z8 = this.f15384d;
                float f19 = vVar.f15453e;
                float f20 = vVar.f15454f;
                float f21 = vVar.f15455g;
                int i10 = 1;
                float f22 = vVar.f15456i;
                if (iArr.length != 0) {
                    f13 = f20;
                    if (vVar.f15447B.length <= iArr[iArr.length - 1]) {
                        int i11 = iArr[iArr.length - 1] + 1;
                        vVar.f15447B = new double[i11];
                        vVar.f15448C = new double[i11];
                    }
                } else {
                    f13 = f20;
                }
                Arrays.fill(vVar.f15447B, Double.NaN);
                for (int i12 = 0; i12 < iArr.length; i12++) {
                    double[] dArr4 = vVar.f15447B;
                    int i13 = iArr[i12];
                    dArr4[i13] = dArr2[i12];
                    vVar.f15448C[i13] = dArr3[i12];
                }
                float f23 = Float.NaN;
                int i14 = 0;
                float f24 = f13;
                float f25 = f21;
                float f26 = 0.0f;
                float f27 = 0.0f;
                float f28 = 0.0f;
                float f29 = 0.0f;
                while (true) {
                    double[] dArr5 = vVar.f15447B;
                    f14 = f22;
                    if (i14 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i14])) {
                        f16 = f19;
                    } else {
                        f16 = f19;
                        float f30 = (float) (Double.isNaN(vVar.f15447B[i14]) ? 0.0d : vVar.f15447B[i14] + 0.0d);
                        float f31 = (float) vVar.f15448C[i14];
                        if (i14 == i10) {
                            f27 = f31;
                            f22 = f14;
                            f19 = f30;
                        } else if (i14 == 2) {
                            f26 = f31;
                            f19 = f16;
                            f22 = f14;
                            f24 = f30;
                        } else if (i14 == 3) {
                            f28 = f31;
                            f19 = f16;
                            f22 = f14;
                            f25 = f30;
                        } else if (i14 == 4) {
                            f29 = f31;
                            f19 = f16;
                            f22 = f30;
                        } else if (i14 == 5) {
                            f19 = f16;
                            f22 = f14;
                            f23 = f30;
                        }
                        i14++;
                        i10 = 1;
                    }
                    f19 = f16;
                    f22 = f14;
                    i14++;
                    i10 = 1;
                }
                float f32 = f19;
                m mVar = vVar.f15460v;
                if (mVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    mVar.e(d2, fArr, fArr2);
                    float f33 = fArr[0];
                    float f34 = fArr[1];
                    float f35 = fArr2[0];
                    float f36 = fArr2[1];
                    double d10 = f33;
                    double d11 = f32;
                    double d12 = f24;
                    float fSin = (float) (((Math.sin(d12) * d11) + d10) - ((double) (f25 / 2.0f)));
                    float fCos = (float) ((((double) f34) - (Math.cos(d12) * d11)) - ((double) (f14 / 2.0f)));
                    double d13 = f27;
                    double dSin = Math.sin(d12) * d13;
                    double dCos = Math.cos(d12) * d11;
                    double d14 = f26;
                    float f37 = (float) ((dCos * d14) + dSin + ((double) f35));
                    float fSin2 = (float) ((Math.sin(d12) * d11 * d14) + (((double) f36) - (Math.cos(d12) * d13)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = f37;
                        dArr3[1] = fSin2;
                    }
                    if (!Float.isNaN(f23)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, f37)) + ((double) f23)));
                    }
                    f15 = fSin;
                    f24 = fCos;
                } else {
                    if (!Float.isNaN(f23)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2((f29 / 2.0f) + f26, (f28 / 2.0f) + f27)) + ((double) f23) + ((double) 0.0f)));
                    }
                    f15 = f32;
                }
                if (view instanceof FloatLayout) {
                    ((FloatLayout) view).layout(f15, f24, f15 + f25, f24 + f14);
                } else {
                    float f38 = f15 + 0.5f;
                    int i15 = (int) f38;
                    float f39 = f24 + 0.5f;
                    int i16 = (int) f39;
                    int i17 = (int) (f38 + f25);
                    int i18 = (int) (f39 + f14);
                    int i19 = i17 - i15;
                    int i20 = i18 - i16;
                    if (i19 != view.getMeasuredWidth() || i20 != view.getMeasuredHeight() || z8) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                    }
                    view.layout(i15, i16, i17, i18);
                }
                this.f15384d = false;
            }
            if (this.f15375B != -1) {
                if (this.f15376C == null) {
                    this.f15376C = ((View) view.getParent()).findViewById(this.f15375B);
                }
                View view2 = this.f15376C;
                if (view2 != null) {
                    float bottom = (this.f15376C.getBottom() + view2.getTop()) / f12;
                    float right = (this.f15376C.getRight() + this.f15376C.getLeft()) / f12;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top2 = bottom - view.getTop();
                        view.setPivotX(left);
                        view.setPivotY(top2);
                    }
                }
            }
            HashMap map3 = this.f15404y;
            if (map3 != null) {
                for (androidx.constraintlayout.core.motion.utils.b bVar2 : map3.values()) {
                    if (bVar2 instanceof T.i) {
                        double[] dArr6 = this.f15397q;
                        if (dArr6.length > 1) {
                            view.setRotation(((T.i) bVar2).a(fD) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (nVar != 0) {
                double[] dArr7 = this.f15397q;
                double d15 = dArr7[0];
                double d16 = dArr7[1];
                T.n nVar3 = nVar;
                view.setRotation(nVar3.a(fD, j6, eVar, view) + ((float) Math.toDegrees(Math.atan2(d16, d15))));
                z3 = zB | nVar3.f8930d;
            } else {
                z3 = zB;
            }
            int i21 = 1;
            while (true) {
                p059e1.a[] aVarArr2 = this.f15390j;
                if (i21 >= aVarArr2.length) {
                    break;
                }
                p059e1.a aVar = aVarArr2[i21];
                float[] fArr3 = this.t;
                aVar.x(d2, fArr3);
                com.palmpay.lib.apm.launchcounter.util.d.O((androidx.constraintlayout.widget.a) vVar.f15461w.get(this.f15398r[i21 - 1]), view, fArr3);
                i21++;
            }
            k kVar = this.f15388h;
            if (kVar.f15360b == 0) {
                if (fD <= 0.0f) {
                    view.setVisibility(kVar.f15361c);
                } else {
                    k kVar2 = this.f15389i;
                    if (fD >= f11) {
                        view.setVisibility(kVar2.f15361c);
                    } else if (kVar2.f15361c != kVar.f15361c) {
                        view.setVisibility(0);
                    }
                }
            }
        } else {
            boolean z10 = zB;
            float f40 = vVar.f15453e;
            v vVar2 = this.f15387g;
            float fE = d0.e(vVar2.f15453e, f40, fD, f40);
            float f41 = vVar.f15454f;
            float fE2 = d0.e(vVar2.f15454f, f41, fD, f41);
            float f42 = vVar.f15455g;
            float f43 = vVar2.f15455g;
            float fE3 = d0.e(f43, f42, fD, f42);
            float f44 = vVar.f15456i;
            float f45 = vVar2.f15456i;
            float f46 = fE + 0.5f;
            int i22 = (int) f46;
            float f47 = fE2 + 0.5f;
            int i23 = (int) f47;
            int i24 = (int) (f46 + fE3);
            int iE = (int) (f47 + d0.e(f45, f44, fD, f44));
            int i25 = i24 - i22;
            int i26 = iE - i23;
            if (f43 != f42 || f45 != f44 || this.f15384d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i25, 1073741824), View.MeasureSpec.makeMeasureSpec(i26, 1073741824));
                this.f15384d = false;
            }
            view.layout(i22, i23, i24, iE);
            z3 = z10;
        }
        HashMap map4 = this.f15405z;
        if (map4 != null) {
            for (T.f fVar : map4.values()) {
                if (fVar instanceof T.d) {
                    double[] dArr8 = this.f15397q;
                    view.setRotation(((T.d) fVar).a(fD) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    fVar.e(view, fD);
                }
            }
        }
        return z3;
    }

    public final void i(v vVar) {
        vVar.e((int) this.f15382b.getX(), (int) this.f15382b.getY(), this.f15382b.getWidth(), this.f15382b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:204:0x062b  */
    /* JADX WARN: Code duplicated, block: B:254:0x0753 A[PHI: r3 r7 r12
      0x0753: PHI (r3v41 java.lang.String) = (r3v40 java.lang.String), (r3v42 java.lang.String) binds: [B:253:0x0751, B:249:0x072f] A[DONT_GENERATE, DONT_INLINE]
      0x0753: PHI (r7v35 java.lang.String) = (r7v34 java.lang.String), (r7v36 java.lang.String) binds: [B:253:0x0751, B:249:0x072f] A[DONT_GENERATE, DONT_INLINE]
      0x0753: PHI (r12v13 java.lang.String) = (r12v12 java.lang.String), (r12v14 java.lang.String) binds: [B:253:0x0751, B:249:0x072f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:316:0x0972  */
    /* JADX WARN: Code duplicated, block: B:678:0x0d28 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x0d20 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:511:0x0cae. Please report as an issue. */
    public final void k(int i7, int i10, long j6) {
        v vVar;
        String str;
        ArrayList arrayList;
        HashSet hashSet;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        HashMap map;
        v vVar2;
        String str8;
        String str9;
        m mVar;
        androidx.constraintlayout.widget.a aVar;
        HashSet hashSet2;
        String str10;
        Iterator it;
        HashMap map2;
        byte b7;
        T.p lVar;
        T.m mVar2;
        T.p pVar;
        androidx.constraintlayout.widget.a aVar2;
        Integer num;
        byte b10;
        Iterator it2;
        ArrayList arrayList2;
        v vVar3;
        HashSet hashSet3;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        v vVar4;
        String str17;
        byte b11;
        byte b12;
        T.g gVar;
        androidx.constraintlayout.core.motion.utils.b gVar2;
        androidx.constraintlayout.widget.a aVar3;
        String str18;
        String str19;
        String str20;
        HashMap map3;
        v vVar5;
        float fMin;
        float fE;
        String str21 = "translationY";
        String str22 = "translationX";
        String str23 = ViewProps.SCALE_Y;
        String str24 = ViewProps.SCALE_X;
        String str25 = "rotationY";
        String str26 = "rotationX";
        String str27 = ReactProgressBarViewManager.PROP_PROGRESS;
        new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet<String> hashSet6 = new HashSet();
        HashMap map4 = new HashMap();
        int i11 = this.f15374A;
        v vVar6 = this.f15386f;
        HashMap map5 = map4;
        if (i11 != -1) {
            vVar6.f15458o = i11;
        }
        k kVar = this.f15388h;
        float f10 = kVar.f15359a;
        v vVar7 = vVar6;
        k kVar2 = this.f15389i;
        if (k.b(f10, kVar2.f15359a)) {
            hashSet5.add("alpha");
        }
        if (k.b(kVar.f15362d, kVar2.f15362d)) {
            hashSet5.add(ViewProps.ELEVATION);
        }
        int i12 = kVar.f15361c;
        int i13 = kVar2.f15361c;
        if (i12 != i13 && kVar.f15360b == 0 && (i12 == 0 || i13 == 0)) {
            hashSet5.add("alpha");
        }
        if (k.b(kVar.f15363e, kVar2.f15363e)) {
            hashSet5.add(ViewProps.ROTATION);
        }
        if (!Float.isNaN(kVar.f15356A) || !Float.isNaN(kVar2.f15356A)) {
            hashSet5.add("transitionPathRotate");
        }
        if (!Float.isNaN(kVar.f15357B) || !Float.isNaN(kVar2.f15357B)) {
            hashSet5.add(ReactProgressBarViewManager.PROP_PROGRESS);
        }
        if (k.b(kVar.f15364f, kVar2.f15364f)) {
            hashSet5.add("rotationX");
        }
        if (k.b(kVar.f15365g, kVar2.f15365g)) {
            hashSet5.add("rotationY");
        }
        if (k.b(kVar.f15368o, kVar2.f15368o)) {
            hashSet5.add("transformPivotX");
        }
        if (k.b(kVar.f15369p, kVar2.f15369p)) {
            hashSet5.add("transformPivotY");
        }
        if (k.b(kVar.f15366i, kVar2.f15366i)) {
            hashSet5.add(ViewProps.SCALE_X);
        }
        if (k.b(kVar.f15367j, kVar2.f15367j)) {
            hashSet5.add(ViewProps.SCALE_Y);
        }
        if (k.b(kVar.t, kVar2.t)) {
            hashSet5.add("translationX");
        }
        if (k.b(kVar.f15370v, kVar2.f15370v)) {
            hashSet5.add("translationY");
        }
        if (k.b(kVar.f15371w, kVar2.f15371w)) {
            hashSet5.add("translationZ");
        }
        m mVar3 = this;
        ArrayList<AbstractC1029b> arrayList3 = mVar3.f15402w;
        v vVar8 = mVar3.f15387g;
        ArrayList arrayList4 = mVar3.f15400u;
        if (arrayList3 != null) {
            for (AbstractC1029b abstractC1029b : arrayList3) {
                String str28 = str26;
                if (abstractC1029b instanceof h) {
                    h hVar = (h) abstractC1029b;
                    v vVar9 = new v();
                    vVar9.f15450b = 0;
                    vVar9.f15457j = Float.NaN;
                    vVar9.f15458o = -1;
                    vVar9.f15459p = -1;
                    vVar9.t = Float.NaN;
                    vVar9.f15460v = null;
                    vVar9.f15461w = new LinkedHashMap();
                    vVar9.f15446A = 0;
                    vVar9.f15447B = new double[18];
                    vVar9.f15448C = new double[18];
                    vVar5 = vVar7;
                    if (vVar5.f15459p != -1) {
                        float f11 = hVar.f15322a / 100.0f;
                        vVar9.f15451c = f11;
                        vVar9.f15450b = hVar.f15348h;
                        vVar9.f15446A = hVar.f15353m;
                        float f12 = Float.isNaN(hVar.f15349i) ? f11 : hVar.f15349i;
                        str20 = str27;
                        float f13 = Float.isNaN(hVar.f15350j) ? f11 : hVar.f15350j;
                        str19 = str24;
                        float f14 = vVar8.f15455g;
                        float f15 = vVar5.f15455g;
                        float f16 = f14 - f15;
                        float f17 = vVar8.f15456i;
                        float f18 = vVar5.f15456i;
                        vVar9.f15452d = vVar9.f15451c;
                        vVar9.f15455g = (int) ((f16 * f12) + f15);
                        vVar9.f15456i = (int) (((f17 - f18) * f13) + f18);
                        int i14 = hVar.f15353m;
                        str18 = str23;
                        if (i14 == 1) {
                            float f19 = Float.isNaN(hVar.f15351k) ? f11 : hVar.f15351k;
                            float f20 = vVar8.f15453e;
                            float f21 = vVar5.f15453e;
                            vVar9.f15453e = d0.e(f20, f21, f19, f21);
                            if (!Float.isNaN(hVar.f15352l)) {
                                f11 = hVar.f15352l;
                            }
                            float f22 = vVar8.f15454f;
                            float f23 = vVar5.f15454f;
                            vVar9.f15454f = d0.e(f22, f23, f11, f23);
                        } else if (i14 != 2) {
                            float f24 = Float.isNaN(hVar.f15351k) ? f11 : hVar.f15351k;
                            float f25 = vVar8.f15453e;
                            float f26 = vVar5.f15453e;
                            vVar9.f15453e = d0.e(f25, f26, f24, f26);
                            if (!Float.isNaN(hVar.f15352l)) {
                                f11 = hVar.f15352l;
                            }
                            float f27 = vVar8.f15454f;
                            float f28 = vVar5.f15454f;
                            vVar9.f15454f = d0.e(f27, f28, f11, f28);
                        } else {
                            if (Float.isNaN(hVar.f15351k)) {
                                float f29 = vVar8.f15453e;
                                float f30 = vVar5.f15453e;
                                fMin = d0.e(f29, f30, f11, f30);
                            } else {
                                fMin = hVar.f15351k * Math.min(f13, f12);
                            }
                            vVar9.f15453e = fMin;
                            if (Float.isNaN(hVar.f15352l)) {
                                float f31 = vVar8.f15454f;
                                float f32 = vVar5.f15454f;
                                fE = d0.e(f31, f32, f11, f32);
                            } else {
                                fE = hVar.f15352l;
                            }
                            vVar9.f15454f = fE;
                        }
                        vVar9.f15459p = vVar5.f15459p;
                        vVar9.f15449a = O.e.d(hVar.f15346f);
                        vVar9.f15458o = hVar.f15347g;
                    } else {
                        str18 = str23;
                        str19 = str24;
                        str20 = str27;
                        int i15 = hVar.f15353m;
                        if (i15 == 1) {
                            float f33 = hVar.f15322a / 100.0f;
                            vVar9.f15451c = f33;
                            vVar9.f15450b = hVar.f15348h;
                            float f34 = Float.isNaN(hVar.f15349i) ? f33 : hVar.f15349i;
                            float f35 = Float.isNaN(hVar.f15350j) ? f33 : hVar.f15350j;
                            float f36 = vVar8.f15455g - vVar5.f15455g;
                            float f37 = vVar8.f15456i - vVar5.f15456i;
                            vVar9.f15452d = vVar9.f15451c;
                            if (!Float.isNaN(hVar.f15351k)) {
                                f33 = hVar.f15351k;
                            }
                            float f38 = vVar5.f15453e;
                            float f39 = vVar5.f15455g;
                            float f40 = (f39 / 2.0f) + f38;
                            float f41 = vVar5.f15454f;
                            float f42 = vVar5.f15456i;
                            float f43 = ((vVar8.f15455g / 2.0f) + vVar8.f15453e) - f40;
                            float f44 = ((vVar8.f15456i / 2.0f) + vVar8.f15454f) - ((f42 / 2.0f) + f41);
                            float f45 = f43 * f33;
                            float f46 = f34 * f36;
                            float f47 = f46 / 2.0f;
                            vVar9.f15453e = (int) ((f38 + f45) - f47);
                            float f48 = f33 * f44;
                            float f49 = f35 * f37;
                            float f50 = f49 / 2.0f;
                            vVar9.f15454f = (int) ((f41 + f48) - f50);
                            vVar9.f15455g = (int) (f39 + f46);
                            vVar9.f15456i = (int) (f42 + f49);
                            float f51 = Float.isNaN(hVar.f15352l) ? 0.0f : hVar.f15352l;
                            vVar9.f15446A = 1;
                            float f52 = (int) ((vVar5.f15453e + f45) - f47);
                            float f53 = (int) ((vVar5.f15454f + f48) - f50);
                            vVar9.f15453e = f52 + ((-f44) * f51);
                            vVar9.f15454f = f53 + (f43 * f51);
                            vVar9.f15459p = vVar9.f15459p;
                            vVar9.f15449a = O.e.d(hVar.f15346f);
                            vVar9.f15458o = hVar.f15347g;
                        } else if (i15 != 2) {
                            float f54 = hVar.f15322a / 100.0f;
                            vVar9.f15451c = f54;
                            vVar9.f15450b = hVar.f15348h;
                            float f55 = Float.isNaN(hVar.f15349i) ? f54 : hVar.f15349i;
                            float f56 = Float.isNaN(hVar.f15350j) ? f54 : hVar.f15350j;
                            float f57 = vVar8.f15455g;
                            float f58 = vVar5.f15455g;
                            float f59 = f57 - f58;
                            float f60 = vVar8.f15456i;
                            float f61 = vVar5.f15456i;
                            float f62 = f60 - f61;
                            vVar9.f15452d = vVar9.f15451c;
                            float f63 = vVar5.f15453e;
                            float f64 = (f58 / 2.0f) + f63;
                            float f65 = vVar5.f15454f;
                            float f66 = ((f57 / 2.0f) + vVar8.f15453e) - f64;
                            float f67 = ((f60 / 2.0f) + vVar8.f15454f) - ((f61 / 2.0f) + f65);
                            float f68 = f59 * f55;
                            float f69 = f68 / 2.0f;
                            vVar9.f15453e = (int) (((f66 * f54) + f63) - f69);
                            float f70 = f62 * f56;
                            float f71 = f70 / 2.0f;
                            vVar9.f15454f = (int) (((f67 * f54) + f65) - f71);
                            vVar9.f15455g = (int) (f58 + f68);
                            vVar9.f15456i = (int) (f61 + f70);
                            float f72 = Float.isNaN(hVar.f15351k) ? f54 : hVar.f15351k;
                            float f73 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            float f74 = f72;
                            float f75 = Float.isNaN(hVar.f15352l) ? f54 : hVar.f15352l;
                            float f76 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            float f77 = f75;
                            vVar9.f15446A = 0;
                            vVar9.f15453e = (int) (((f76 * f67) + ((f74 * f66) + vVar5.f15453e)) - f69);
                            vVar9.f15454f = (int) (((f67 * f77) + ((f66 * f73) + vVar5.f15454f)) - f71);
                            vVar9.f15449a = O.e.d(hVar.f15346f);
                            vVar9.f15458o = hVar.f15347g;
                        } else {
                            float f78 = hVar.f15322a / 100.0f;
                            vVar9.f15451c = f78;
                            vVar9.f15450b = hVar.f15348h;
                            float f79 = Float.isNaN(hVar.f15349i) ? f78 : hVar.f15349i;
                            float f80 = Float.isNaN(hVar.f15350j) ? f78 : hVar.f15350j;
                            float f81 = vVar8.f15455g;
                            float f82 = vVar5.f15455g;
                            float f83 = f81 - f82;
                            float f84 = vVar8.f15456i;
                            float f85 = vVar5.f15456i;
                            float f86 = f84 - f85;
                            vVar9.f15452d = vVar9.f15451c;
                            float f87 = vVar5.f15453e;
                            float f88 = (f82 / 2.0f) + f87;
                            float f89 = vVar5.f15454f;
                            float f90 = (f81 / 2.0f) + vVar8.f15453e;
                            float f91 = ((f84 / 2.0f) + vVar8.f15454f) - ((f85 / 2.0f) + f89);
                            float f92 = f83 * f79;
                            vVar9.f15453e = (int) ((((f90 - f88) * f78) + f87) - (f92 / 2.0f));
                            float f93 = f86 * f80;
                            vVar9.f15454f = (int) (((f91 * f78) + f89) - (f93 / 2.0f));
                            vVar9.f15455g = (int) (f82 + f92);
                            vVar9.f15456i = (int) (f85 + f93);
                            vVar9.f15446A = 2;
                            if (!Float.isNaN(hVar.f15351k)) {
                                vVar9.f15453e = (int) (hVar.f15351k * ((int) (i7 - vVar9.f15455g)));
                            }
                            if (!Float.isNaN(hVar.f15352l)) {
                                vVar9.f15454f = (int) (hVar.f15352l * ((int) (i10 - vVar9.f15456i)));
                            }
                            vVar9.f15459p = vVar9.f15459p;
                            vVar9.f15449a = O.e.d(hVar.f15346f);
                            vVar9.f15458o = hVar.f15347g;
                        }
                    }
                    int iBinarySearch = Collections.binarySearch(arrayList4, vVar9);
                    if (iBinarySearch == 0) {
                        Log.e("MotionController", " KeyPath position \"" + vVar9.f15452d + "\" outside of range");
                    }
                    arrayList4.add((-iBinarySearch) - 1, vVar9);
                    int i16 = hVar.f15345e;
                    if (i16 != -1) {
                        mVar3.f15385e = i16;
                    }
                    map3 = map5;
                } else {
                    str18 = str23;
                    str19 = str24;
                    str20 = str27;
                    map3 = map5;
                    vVar5 = vVar7;
                    abstractC1029b.d(map3);
                    abstractC1029b.b(hashSet5);
                }
                map5 = map3;
                vVar7 = vVar5;
                str26 = str28;
                str25 = str25;
                str22 = str22;
                str21 = str21;
                str27 = str20;
                str24 = str19;
                str23 = str18;
            }
        }
        String str29 = str21;
        String str30 = str22;
        String str31 = str23;
        String str32 = str24;
        String str33 = str25;
        String str34 = str26;
        String str35 = str27;
        HashMap map6 = map5;
        v vVar10 = vVar7;
        String str36 = "CUSTOM,";
        String str37 = ",";
        if (hashSet5.isEmpty()) {
            vVar = vVar10;
            str = ",";
            arrayList = arrayList4;
            hashSet = hashSet5;
            str2 = str33;
            str3 = str30;
            str4 = str29;
            str5 = str35;
            str6 = str32;
            str7 = str31;
            map = map6;
            vVar2 = vVar8;
            str8 = str34;
            str9 = "CUSTOM,";
        } else {
            mVar3.f15404y = new HashMap();
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                String str38 = (String) it3.next();
                if (!str38.startsWith(str36)) {
                    it2 = it3;
                    arrayList2 = arrayList4;
                    switch (str38.hashCode()) {
                        case -1249320806:
                            vVar3 = vVar10;
                            hashSet3 = hashSet5;
                            str11 = str33;
                            str12 = str30;
                            str13 = str29;
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            vVar4 = vVar8;
                            str17 = str34;
                            b11 = str38.equals(str17) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            vVar3 = vVar10;
                            hashSet3 = hashSet5;
                            str11 = str33;
                            str12 = str30;
                            str13 = str29;
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            if (str38.equals(str11)) {
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = 1;
                            } else {
                                vVar4 = vVar8;
                                str17 = str34;
                            }
                            break;
                        case -1225497657:
                            hashSet3 = hashSet5;
                            str12 = str30;
                            str13 = str29;
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            if (str38.equals(str12)) {
                                vVar3 = vVar10;
                                str11 = str33;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = 2;
                            } else {
                                vVar3 = vVar10;
                                str11 = str33;
                                vVar4 = vVar8;
                                str17 = str34;
                            }
                            break;
                        case -1225497656:
                            str13 = str29;
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            vVar3 = vVar10;
                            if (str38.equals(str13)) {
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = 3;
                            } else {
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                vVar4 = vVar8;
                                str17 = str34;
                            }
                            break;
                        case -1225497655:
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            if (str38.equals("translationZ")) {
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = 4;
                            } else {
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                vVar4 = vVar8;
                                str17 = str34;
                            }
                            break;
                        case -1001078227:
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            if (str38.equals(str14)) {
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = 5;
                            } else {
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                vVar4 = vVar8;
                                str17 = str34;
                            }
                            break;
                        case -908189618:
                            str15 = str32;
                            str16 = str31;
                            vVar3 = vVar10;
                            hashSet3 = hashSet5;
                            str11 = str33;
                            str12 = str30;
                            str13 = str29;
                            if (str38.equals(str15)) {
                                str14 = str35;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = 6;
                            } else {
                                str14 = str35;
                                vVar4 = vVar8;
                                str17 = str34;
                            }
                            break;
                        case -908189617:
                            str16 = str31;
                            vVar3 = vVar10;
                            hashSet3 = hashSet5;
                            str11 = str33;
                            str12 = str30;
                            str13 = str29;
                            str14 = str35;
                            if (str38.equals(str16)) {
                                str15 = str32;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = 7;
                            } else {
                                str15 = str32;
                                vVar4 = vVar8;
                                str17 = str34;
                            }
                            break;
                        case -797520672:
                            if (str38.equals("waveVariesBy")) {
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                str14 = str35;
                                str15 = str32;
                                str16 = str31;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = 8;
                            } else {
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                str14 = str35;
                                str15 = str32;
                                str16 = str31;
                                vVar4 = vVar8;
                                str17 = str34;
                            }
                            break;
                        case -760884510:
                            if (str38.equals("transformPivotX")) {
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                str14 = str35;
                                str15 = str32;
                                str16 = str31;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = 9;
                            } else {
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                str14 = str35;
                                str15 = str32;
                                str16 = str31;
                                vVar4 = vVar8;
                                str17 = str34;
                            }
                            break;
                        case -760884509:
                            if (str38.equals("transformPivotY")) {
                                b12 = 10;
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                str14 = str35;
                                str15 = str32;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = b12;
                                str16 = str31;
                            }
                            vVar3 = vVar10;
                            hashSet3 = hashSet5;
                            str11 = str33;
                            str12 = str30;
                            str13 = str29;
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            vVar4 = vVar8;
                            str17 = str34;
                            break;
                        case -40300674:
                            if (str38.equals(ViewProps.ROTATION)) {
                                b12 = Ascii.VT;
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                str14 = str35;
                                str15 = str32;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = b12;
                                str16 = str31;
                            }
                            vVar3 = vVar10;
                            hashSet3 = hashSet5;
                            str11 = str33;
                            str12 = str30;
                            str13 = str29;
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            vVar4 = vVar8;
                            str17 = str34;
                            break;
                        case -4379043:
                            if (str38.equals(ViewProps.ELEVATION)) {
                                b12 = Ascii.FF;
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                str14 = str35;
                                str15 = str32;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = b12;
                                str16 = str31;
                            }
                            vVar3 = vVar10;
                            hashSet3 = hashSet5;
                            str11 = str33;
                            str12 = str30;
                            str13 = str29;
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            vVar4 = vVar8;
                            str17 = str34;
                            break;
                        case 37232917:
                            if (str38.equals("transitionPathRotate")) {
                                b12 = Ascii.CR;
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                str14 = str35;
                                str15 = str32;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = b12;
                                str16 = str31;
                            }
                            vVar3 = vVar10;
                            hashSet3 = hashSet5;
                            str11 = str33;
                            str12 = str30;
                            str13 = str29;
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            vVar4 = vVar8;
                            str17 = str34;
                            break;
                        case 92909918:
                            if (str38.equals("alpha")) {
                                b12 = Ascii.SO;
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                str14 = str35;
                                str15 = str32;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = b12;
                                str16 = str31;
                            }
                            vVar3 = vVar10;
                            hashSet3 = hashSet5;
                            str11 = str33;
                            str12 = str30;
                            str13 = str29;
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            vVar4 = vVar8;
                            str17 = str34;
                            break;
                        case 156108012:
                            if (str38.equals("waveOffset")) {
                                b12 = Ascii.SI;
                                vVar3 = vVar10;
                                hashSet3 = hashSet5;
                                str11 = str33;
                                str12 = str30;
                                str13 = str29;
                                str14 = str35;
                                str15 = str32;
                                vVar4 = vVar8;
                                str17 = str34;
                                b11 = b12;
                                str16 = str31;
                            }
                            vVar3 = vVar10;
                            hashSet3 = hashSet5;
                            str11 = str33;
                            str12 = str30;
                            str13 = str29;
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            vVar4 = vVar8;
                            str17 = str34;
                            break;
                        default:
                            vVar3 = vVar10;
                            hashSet3 = hashSet5;
                            str11 = str33;
                            str12 = str30;
                            str13 = str29;
                            str14 = str35;
                            str15 = str32;
                            str16 = str31;
                            vVar4 = vVar8;
                            str17 = str34;
                            break;
                    }
                    switch (b11) {
                        case 0:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.g(5);
                            break;
                        case 1:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.g(6);
                            break;
                        case 2:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.g(9);
                            break;
                        case 3:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.g(10);
                            break;
                        case 4:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.g(11);
                            break;
                        case 5:
                            str36 = str36;
                            str37 = str37;
                            T.j jVar = new T.j();
                            jVar.f8919f = false;
                            gVar2 = jVar;
                            break;
                        case 6:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.g(7);
                            break;
                        case 7:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.g(8);
                            break;
                        case 8:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.g(0);
                            break;
                        case 9:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.g(2);
                            break;
                        case 10:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.g(3);
                            break;
                        case 11:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.g(4);
                            break;
                        case 12:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.g(1);
                            break;
                        case 13:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = new T.i();
                            break;
                        case 14:
                            gVar = new T.g(0);
                            gVar2 = gVar;
                            break;
                        case 15:
                            gVar = new T.g(0);
                            gVar2 = gVar;
                            break;
                        default:
                            str36 = str36;
                            str37 = str37;
                            gVar2 = null;
                            break;
                    }
                } else {
                    SparseArray sparseArray = new SparseArray();
                    String str39 = str38.split(str37)[1];
                    for (AbstractC1029b abstractC1029b2 : arrayList3) {
                        Iterator it4 = it3;
                        ArrayList arrayList5 = arrayList4;
                        HashMap map7 = abstractC1029b2.f15325d;
                        if (map7 != null && (aVar3 = (androidx.constraintlayout.widget.a) map7.get(str39)) != null) {
                            sparseArray.append(abstractC1029b2.f15322a, aVar3);
                        }
                        it3 = it4;
                        arrayList4 = arrayList5;
                    }
                    it2 = it3;
                    arrayList2 = arrayList4;
                    T.h hVar2 = new T.h();
                    String str40 = str38.split(str37)[1];
                    hVar2.f8917f = sparseArray;
                    vVar3 = vVar10;
                    str37 = str37;
                    hashSet3 = hashSet5;
                    str11 = str33;
                    str12 = str30;
                    str13 = str29;
                    str14 = str35;
                    str15 = str32;
                    vVar4 = vVar8;
                    str17 = str34;
                    str36 = str36;
                    gVar2 = hVar2;
                    str16 = str31;
                }
                if (gVar2 != null) {
                    gVar2.f15128e = str38;
                    mVar3.f15404y.put(str38, gVar2);
                }
                str37 = str37;
                str31 = str16;
                str32 = str15;
                str35 = str14;
                str29 = str13;
                str30 = str12;
                hashSet5 = hashSet3;
                arrayList4 = arrayList2;
                str36 = str36;
                it3 = it2;
                str34 = str17;
                vVar8 = vVar4;
                str33 = str11;
                vVar10 = vVar3;
            }
            vVar = vVar10;
            str = str37;
            arrayList = arrayList4;
            hashSet = hashSet5;
            str2 = str33;
            str3 = str30;
            str4 = str29;
            str5 = str35;
            str6 = str32;
            str7 = str31;
            vVar2 = vVar8;
            str8 = str34;
            str9 = str36;
            if (arrayList3 != null) {
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    AbstractC1029b abstractC1029b3 = (AbstractC1029b) it5.next();
                    if (abstractC1029b3 instanceof C1031d) {
                        HashMap map8 = mVar3.f15404y;
                        C1031d c1031d = (C1031d) abstractC1029b3;
                        c1031d.getClass();
                        for (String str41 : map8.keySet()) {
                            it5 = it5;
                            HashMap map9 = map8;
                            androidx.constraintlayout.core.motion.utils.b bVar = (androidx.constraintlayout.core.motion.utils.b) map8.get(str41);
                            if (bVar != null) {
                                HashMap map10 = map6;
                                if (!str41.startsWith("CUSTOM")) {
                                    switch (str41.hashCode()) {
                                        case -1249320806:
                                            if (str41.equals(str8)) {
                                                b10 = 0;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -1249320805:
                                            if (str41.equals(str2)) {
                                                b10 = 1;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -1225497657:
                                            if (str41.equals(str3)) {
                                                b10 = 2;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -1225497656:
                                            if (str41.equals(str4)) {
                                                b10 = 3;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -1225497655:
                                            if (str41.equals("translationZ")) {
                                                b10 = 4;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -1001078227:
                                            if (str41.equals(str5)) {
                                                b10 = 5;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -908189618:
                                            if (str41.equals(str6)) {
                                                b10 = 6;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -908189617:
                                            if (str41.equals(str7)) {
                                                b10 = 7;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -760884510:
                                            if (str41.equals("transformPivotX")) {
                                                b10 = 8;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -760884509:
                                            if (str41.equals("transformPivotY")) {
                                                b10 = 9;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -40300674:
                                            if (str41.equals(ViewProps.ROTATION)) {
                                                b10 = 10;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -4379043:
                                            if (str41.equals(ViewProps.ELEVATION)) {
                                                b10 = Ascii.VT;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 37232917:
                                            if (str41.equals("transitionPathRotate")) {
                                                b10 = Ascii.FF;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 92909918:
                                            if (str41.equals("alpha")) {
                                                b10 = Ascii.CR;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        default:
                                            b10 = -1;
                                            break;
                                    }
                                    switch (b10) {
                                        case 0:
                                            if (!Float.isNaN(c1031d.f15331i)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15331i);
                                            }
                                            break;
                                        case 1:
                                            if (!Float.isNaN(c1031d.f15332j)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15332j);
                                            }
                                            break;
                                        case 2:
                                            if (!Float.isNaN(c1031d.f15338p)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15338p);
                                            }
                                            break;
                                        case 3:
                                            if (!Float.isNaN(c1031d.f15339q)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15339q);
                                            }
                                            break;
                                        case 4:
                                            if (!Float.isNaN(c1031d.f15340r)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15340r);
                                            }
                                            break;
                                        case 5:
                                            if (!Float.isNaN(c1031d.f15341s)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15341s);
                                            }
                                            break;
                                        case 6:
                                            if (!Float.isNaN(c1031d.f15336n)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15336n);
                                            }
                                            break;
                                        case 7:
                                            if (!Float.isNaN(c1031d.f15337o)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15337o);
                                            }
                                            break;
                                        case 8:
                                            if (!Float.isNaN(c1031d.f15331i)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15333k);
                                            }
                                            break;
                                        case 9:
                                            if (!Float.isNaN(c1031d.f15332j)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15334l);
                                            }
                                            break;
                                        case 10:
                                            if (!Float.isNaN(c1031d.f15330h)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15330h);
                                            }
                                            break;
                                        case 11:
                                            if (!Float.isNaN(c1031d.f15329g)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15329g);
                                            }
                                            break;
                                        case 12:
                                            if (!Float.isNaN(c1031d.f15335m)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15335m);
                                            }
                                            break;
                                        case 13:
                                            if (!Float.isNaN(c1031d.f15328f)) {
                                                bVar.b(c1031d.f15322a, c1031d.f15328f);
                                            }
                                            break;
                                    }
                                } else {
                                    androidx.constraintlayout.widget.a aVar4 = (androidx.constraintlayout.widget.a) c1031d.f15325d.get(str41.substring(7));
                                    if (aVar4 != null) {
                                        ((T.h) bVar).f8917f.append(c1031d.f15322a, aVar4);
                                    }
                                }
                                map6 = map10;
                            }
                            map8 = map9;
                        }
                    }
                    it5 = it5;
                    map6 = map6;
                }
            }
            HashMap map11 = map6;
            kVar.a(mVar3.f15404y, 0);
            kVar2.a(mVar3.f15404y, 100);
            Iterator it6 = mVar3.f15404y.keySet().iterator();
            while (it6.hasNext()) {
                String str42 = (String) it6.next();
                HashMap map12 = map11;
                int iIntValue = (!map12.containsKey(str42) || (num = (Integer) map12.get(str42)) == null) ? 0 : num.intValue();
                Iterator it7 = it6;
                androidx.constraintlayout.core.motion.utils.b bVar2 = (androidx.constraintlayout.core.motion.utils.b) mVar3.f15404y.get(str42);
                if (bVar2 != null) {
                    bVar2.c(iIntValue);
                }
                it6 = it7;
                map11 = map12;
            }
            map = map11;
        }
        if (hashSet4.isEmpty()) {
            mVar = mVar3;
        } else {
            if (mVar3.f15403x == null) {
                mVar3.f15403x = new HashMap();
            }
            Iterator it8 = hashSet4.iterator();
            while (it8.hasNext()) {
                String str43 = (String) it8.next();
                if (!mVar3.f15403x.containsKey(str43)) {
                    String str44 = str9;
                    if (str43.startsWith(str44)) {
                        it = it8;
                        SparseArray sparseArray2 = new SparseArray();
                        str9 = str44;
                        String str45 = str;
                        map2 = map;
                        String str46 = str43.split(str45)[1];
                        for (AbstractC1029b abstractC1029b4 : arrayList3) {
                            String str47 = str8;
                            HashMap map13 = abstractC1029b4.f15325d;
                            if (map13 != null && (aVar2 = (androidx.constraintlayout.widget.a) map13.get(str46)) != null) {
                                sparseArray2.append(abstractC1029b4.f15322a, aVar2);
                            }
                            str8 = str47;
                        }
                        T.m mVar4 = new T.m();
                        mVar4.f8923i = new SparseArray();
                        mVar4.f8921g = str43.split(str45)[1];
                        mVar4.f8922h = sparseArray2;
                        str = str45;
                        str8 = str8;
                        mVar2 = mVar4;
                    } else {
                        it = it8;
                        map2 = map;
                        str9 = str44;
                        String str48 = str8;
                        String str49 = str;
                        switch (str43.hashCode()) {
                            case -1249320806:
                                str8 = str48;
                                b7 = str43.equals(str8) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                if (str43.equals(str2)) {
                                    str8 = str48;
                                    b7 = 1;
                                } else {
                                    str8 = str48;
                                }
                                break;
                            case -1225497657:
                                if (str43.equals(str3)) {
                                    str8 = str48;
                                    b7 = 2;
                                } else {
                                    str8 = str48;
                                }
                                break;
                            case -1225497656:
                                if (str43.equals(str4)) {
                                    str8 = str48;
                                    b7 = 3;
                                } else {
                                    str8 = str48;
                                }
                                break;
                            case -1225497655:
                                if (str43.equals("translationZ")) {
                                    str8 = str48;
                                    b7 = 4;
                                } else {
                                    str8 = str48;
                                }
                                break;
                            case -1001078227:
                                if (str43.equals(str5)) {
                                    str8 = str48;
                                    b7 = 5;
                                } else {
                                    str8 = str48;
                                }
                                break;
                            case -908189618:
                                if (str43.equals(str6)) {
                                    str8 = str48;
                                    b7 = 6;
                                } else {
                                    str8 = str48;
                                }
                                break;
                            case -908189617:
                                if (str43.equals(str7)) {
                                    str8 = str48;
                                    b7 = 7;
                                } else {
                                    str8 = str48;
                                }
                                break;
                            case -40300674:
                                if (str43.equals(ViewProps.ROTATION)) {
                                    str8 = str48;
                                    b7 = 8;
                                } else {
                                    str8 = str48;
                                }
                                break;
                            case -4379043:
                                if (str43.equals(ViewProps.ELEVATION)) {
                                    str8 = str48;
                                    b7 = 9;
                                } else {
                                    str8 = str48;
                                }
                                break;
                            case 37232917:
                                if (str43.equals("transitionPathRotate")) {
                                    b7 = 10;
                                    str8 = str48;
                                } else {
                                    str8 = str48;
                                }
                                break;
                            case 92909918:
                                if (str43.equals("alpha")) {
                                    b7 = Ascii.VT;
                                    str8 = str48;
                                } else {
                                    str8 = str48;
                                }
                                break;
                            default:
                                str8 = str48;
                                break;
                        }
                        switch (b7) {
                            case 0:
                                lVar = new T.l(3);
                                str = str49;
                                lVar.f8931e = j6;
                                pVar = lVar;
                                break;
                            case 1:
                                lVar = new T.l(4);
                                str = str49;
                                lVar.f8931e = j6;
                                pVar = lVar;
                                break;
                            case 2:
                                lVar = new T.l(7);
                                str = str49;
                                lVar.f8931e = j6;
                                pVar = lVar;
                                break;
                            case 3:
                                lVar = new T.l(8);
                                str = str49;
                                lVar.f8931e = j6;
                                pVar = lVar;
                                break;
                            case 4:
                                lVar = new T.l(9);
                                str = str49;
                                lVar.f8931e = j6;
                                pVar = lVar;
                                break;
                            case 5:
                                T.o oVar = new T.o();
                                oVar.f8926g = false;
                                lVar = oVar;
                                str = str49;
                                lVar.f8931e = j6;
                                pVar = lVar;
                                break;
                            case 6:
                                lVar = new T.l(5);
                                str = str49;
                                lVar.f8931e = j6;
                                pVar = lVar;
                                break;
                            case 7:
                                lVar = new T.l(6);
                                str = str49;
                                lVar.f8931e = j6;
                                pVar = lVar;
                                break;
                            case 8:
                                lVar = new T.l(2);
                                str = str49;
                                lVar.f8931e = j6;
                                pVar = lVar;
                                break;
                            case 9:
                                lVar = new T.l(1);
                                str = str49;
                                lVar.f8931e = j6;
                                pVar = lVar;
                                break;
                            case 10:
                                lVar = new T.n();
                                str = str49;
                                lVar.f8931e = j6;
                                pVar = lVar;
                                break;
                            case 11:
                                lVar = new T.l(0);
                                str = str49;
                                lVar.f8931e = j6;
                                pVar = lVar;
                                break;
                            default:
                                str = str49;
                                mVar2 = null;
                                break;
                        }
                        if (pVar == null) {
                            mVar3 = this;
                            it8 = it;
                            map = map2;
                        } else {
                            pVar.f8928b = str43;
                            this.f15403x.put(str43, pVar);
                            mVar3 = this;
                            str2 = str2;
                            map = map2;
                            it8 = it;
                        }
                    }
                    pVar = mVar2;
                    if (pVar == null) {
                        mVar3 = this;
                        it8 = it;
                        map = map2;
                    } else {
                        pVar.f8928b = str43;
                        this.f15403x.put(str43, pVar);
                        mVar3 = this;
                        str2 = str2;
                        map = map2;
                        it8 = it;
                    }
                }
            }
            mVar = mVar3;
            HashMap map14 = map;
            if (arrayList3 != null) {
                for (AbstractC1029b abstractC1029b5 : arrayList3) {
                }
            }
            for (String str50 : mVar.f15403x.keySet()) {
                HashMap map15 = map14;
                ((T.p) mVar.f15403x.get(str50)).c(map15.containsKey(str50) ? ((Integer) map15.get(str50)).intValue() : 0);
                map14 = map15;
            }
        }
        int size = arrayList.size();
        int i17 = size + 2;
        v[] vVarArr = new v[i17];
        vVarArr[0] = vVar;
        vVarArr[size + 1] = vVar2;
        if (arrayList.size() > 0 && mVar.f15385e == -1) {
            mVar.f15385e = 0;
        }
        Iterator it9 = arrayList.iterator();
        int i18 = 1;
        while (it9.hasNext()) {
            vVarArr[i18] = (v) it9.next();
            i18++;
        }
        HashSet hashSet7 = new HashSet();
        for (String str51 : vVar2.f15461w.keySet()) {
            v vVar11 = vVar;
            if (vVar11.f15461w.containsKey(str51)) {
                str10 = str9;
                hashSet2 = hashSet;
                if (!hashSet2.contains(str10 + str51)) {
                    hashSet7.add(str51);
                }
            } else {
                hashSet2 = hashSet;
                str10 = str9;
            }
            vVar = vVar11;
            str9 = str10;
            hashSet = hashSet2;
        }
        String[] strArr = (String[]) hashSet7.toArray(new String[0]);
        mVar.f15398r = strArr;
        mVar.f15399s = new int[strArr.length];
        int i19 = 0;
        while (true) {
            String[] strArr2 = mVar.f15398r;
            if (i19 < strArr2.length) {
                String str52 = strArr2[i19];
                mVar.f15399s[i19] = 0;
                for (int i20 = 0; i20 < i17; i20++) {
                    if (vVarArr[i20].f15461w.containsKey(str52) && (aVar = (androidx.constraintlayout.widget.a) vVarArr[i20].f15461w.get(str52)) != null) {
                        int[] iArr = mVar.f15399s;
                        iArr[i19] = aVar.c() + iArr[i19];
                        i19++;
                    }
                }
                i19++;
            } else {
                boolean z3 = vVarArr[0].f15458o != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i21 = 1; i21 < i17; i21++) {
                    v vVar12 = vVarArr[i21];
                    v vVar13 = vVarArr[i21 - 1];
                    boolean zB = v.b(vVar12.f15453e, vVar13.f15453e);
                    boolean zB2 = v.b(vVar12.f15454f, vVar13.f15454f);
                    zArr[0] = zArr[0] | v.b(vVar12.f15452d, vVar13.f15452d);
                    boolean z8 = zB | zB2 | z3;
                    zArr[1] = zArr[1] | z8;
                    zArr[2] = z8 | zArr[2];
                    zArr[3] = zArr[3] | v.b(vVar12.f15455g, vVar13.f15455g);
                    zArr[4] = v.b(vVar12.f15456i, vVar13.f15456i) | zArr[4];
                }
                int i22 = 0;
                for (int i23 = 1; i23 < length; i23++) {
                    if (zArr[i23]) {
                        i22++;
                    }
                }
                mVar.f15395o = new int[i22];
                int iMax = Math.max(2, i22);
                mVar.f15396p = new double[iMax];
                mVar.f15397q = new double[iMax];
                int i24 = 0;
                for (int i25 = 1; i25 < length; i25++) {
                    if (zArr[i25]) {
                        mVar.f15395o[i24] = i25;
                        i24++;
                    }
                }
                int[] iArr2 = {i17, mVar.f15395o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i17];
                int i26 = 0;
                while (i26 < i17) {
                    v vVar14 = vVarArr[i26];
                    double[] dArr3 = dArr[i26];
                    int[] iArr3 = mVar.f15395o;
                    v[] vVarArr2 = vVarArr;
                    int i27 = 6;
                    float[] fArr = {vVar14.f15452d, vVar14.f15453e, vVar14.f15454f, vVar14.f15455g, vVar14.f15456i, vVar14.f15457j};
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < iArr3.length) {
                        int i30 = iArr3[i28];
                        if (i30 < i27) {
                            dArr3[i29] = fArr[i30];
                            i29++;
                        }
                        i28++;
                        i27 = 6;
                    }
                    dArr2[i26] = vVarArr2[i26].f15451c;
                    i26++;
                    vVarArr = vVarArr2;
                }
                v[] vVarArr3 = vVarArr;
                int i31 = 0;
                while (true) {
                    int[] iArr4 = mVar.f15395o;
                    if (i31 < iArr4.length) {
                        if (iArr4[i31] < 6) {
                            String strR = G.r(new StringBuilder(), v.f15445H[mVar.f15395o[i31]], " [");
                            for (int i32 = 0; i32 < i17; i32++) {
                                StringBuilder sbS = androidx.camera.video.u.s(strR);
                                sbS.append(dArr[i32][i31]);
                                strR = sbS.toString();
                            }
                        }
                        i31++;
                    } else {
                        mVar.f15390j = new p059e1.a[mVar.f15398r.length + 1];
                        int i33 = 0;
                        while (true) {
                            String[] strArr3 = mVar.f15398r;
                            if (i33 >= strArr3.length) {
                                mVar.f15390j[0] = p059e1.a.n(mVar.f15385e, dArr2, dArr);
                                if (vVarArr3[0].f15458o != -1) {
                                    int[] iArr5 = new int[i17];
                                    double[] dArr4 = new double[i17];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i17, 2);
                                    for (int i34 = 0; i34 < i17; i34++) {
                                        v vVar15 = vVarArr3[i34];
                                        iArr5[i34] = vVar15.f15458o;
                                        dArr4[i34] = vVar15.f15451c;
                                        double[] dArr6 = dArr5[i34];
                                        dArr6[0] = vVar15.f15453e;
                                        dArr6[1] = vVar15.f15454f;
                                    }
                                    mVar.f15391k = new O.b(iArr5, dArr4, dArr5);
                                }
                                mVar.f15405z = new HashMap();
                                if (arrayList3 != null) {
                                    for (String str53 : hashSet6) {
                                        T.f fVarD = T.f.d(str53);
                                        if (fVarD != null) {
                                            fVarD.f15122b = str53;
                                            mVar.f15405z.put(str53, fVarD);
                                        }
                                    }
                                    for (AbstractC1029b abstractC1029b6 : arrayList3) {
                                    }
                                    Iterator it10 = mVar.f15405z.values().iterator();
                                    while (it10.hasNext()) {
                                        ((T.f) it10.next()).c();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str54 = strArr3[i33];
                            int i35 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            for (int i36 = 0; i36 < i17; i36++) {
                                if (vVarArr3[i36].f15461w.containsKey(str54)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i17];
                                        androidx.constraintlayout.widget.a aVar5 = (androidx.constraintlayout.widget.a) vVarArr3[i36].f15461w.get(str54);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i17, aVar5 == null ? 0 : aVar5.c());
                                    }
                                    v vVar16 = vVarArr3[i36];
                                    dArr7[i35] = vVar16.f15451c;
                                    vVar16.d(str54, dArr8[i35]);
                                    i35++;
                                }
                            }
                            i33++;
                            mVar.f15390j[i33] = p059e1.a.n(mVar.f15385e, Arrays.copyOf(dArr7, i35), (double[][]) Arrays.copyOf(dArr8, i35));
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        v vVar = this.f15386f;
        sb2.append(vVar.f15453e);
        sb2.append(" y: ");
        sb2.append(vVar.f15454f);
        sb2.append(" end: x: ");
        v vVar2 = this.f15387g;
        sb2.append(vVar2.f15453e);
        sb2.append(" y: ");
        sb2.append(vVar2.f15454f);
        return sb2.toString();
    }
}
