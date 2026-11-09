package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import androidx.camera.camera2.internal.F;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15361c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15359a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15360b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15362d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15363e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f15364f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15365g = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f15366i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15367j = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f15368o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f15369p = Float.NaN;
    public float t = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f15370v = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f15371w = 0.0f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f15356A = Float.NaN;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f15357B = Float.NaN;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final LinkedHashMap f15358C = new LinkedHashMap();

    public static boolean b(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(HashMap map, int i7) {
        for (String str : map.keySet()) {
            T.k kVar = (T.k) map.get(str);
            str.getClass();
            byte b7 = -1;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        b7 = 0;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        b7 = 1;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b7 = 2;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b7 = 3;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b7 = 4;
                    }
                    break;
                case -1001078227:
                    if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                        b7 = 5;
                    }
                    break;
                case -908189618:
                    if (str.equals(ViewProps.SCALE_X)) {
                        b7 = 6;
                    }
                    break;
                case -908189617:
                    if (str.equals(ViewProps.SCALE_Y)) {
                        b7 = 7;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        b7 = 8;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        b7 = 9;
                    }
                    break;
                case -40300674:
                    if (str.equals(ViewProps.ROTATION)) {
                        b7 = 10;
                    }
                    break;
                case -4379043:
                    if (str.equals(ViewProps.ELEVATION)) {
                        b7 = Ascii.VT;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        b7 = Ascii.FF;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b7 = Ascii.CR;
                    }
                    break;
            }
            switch (b7) {
                case 0:
                    kVar.b(i7, Float.isNaN(this.f15364f) ? 0.0f : this.f15364f);
                    break;
                case 1:
                    kVar.b(i7, Float.isNaN(this.f15365g) ? 0.0f : this.f15365g);
                    break;
                case 2:
                    kVar.b(i7, Float.isNaN(this.t) ? 0.0f : this.t);
                    break;
                case 3:
                    kVar.b(i7, Float.isNaN(this.f15370v) ? 0.0f : this.f15370v);
                    break;
                case 4:
                    kVar.b(i7, Float.isNaN(this.f15371w) ? 0.0f : this.f15371w);
                    break;
                case 5:
                    kVar.b(i7, Float.isNaN(this.f15357B) ? 0.0f : this.f15357B);
                    break;
                case 6:
                    kVar.b(i7, Float.isNaN(this.f15366i) ? 1.0f : this.f15366i);
                    break;
                case 7:
                    kVar.b(i7, Float.isNaN(this.f15367j) ? 1.0f : this.f15367j);
                    break;
                case 8:
                    kVar.b(i7, Float.isNaN(this.f15368o) ? 0.0f : this.f15368o);
                    break;
                case 9:
                    kVar.b(i7, Float.isNaN(this.f15369p) ? 0.0f : this.f15369p);
                    break;
                case 10:
                    kVar.b(i7, Float.isNaN(this.f15363e) ? 0.0f : this.f15363e);
                    break;
                case 11:
                    kVar.b(i7, Float.isNaN(this.f15362d) ? 0.0f : this.f15362d);
                    break;
                case 12:
                    kVar.b(i7, Float.isNaN(this.f15356A) ? 0.0f : this.f15356A);
                    break;
                case 13:
                    kVar.b(i7, Float.isNaN(this.f15359a) ? 1.0f : this.f15359a);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap linkedHashMap = this.f15358C;
                        if (linkedHashMap.containsKey(str2)) {
                            androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) linkedHashMap.get(str2);
                            if (kVar instanceof T.h) {
                                ((T.h) kVar).f8917f.append(i7, aVar);
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i7 + ", value" + aVar.a() + kVar);
                            }
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                    }
                    break;
            }
        }
    }

    public final void c(Rect rect, androidx.constraintlayout.widget.m mVar, int i7, int i10) {
        rect.width();
        rect.height();
        androidx.constraintlayout.widget.h hVarK = mVar.k(i10);
        androidx.constraintlayout.widget.k kVar = hVarK.f15745c;
        int i11 = kVar.f15832c;
        this.f15360b = i11;
        int i12 = kVar.f15831b;
        this.f15361c = i12;
        this.f15359a = (i12 == 0 || i11 != 0) ? kVar.f15833d : 0.0f;
        androidx.constraintlayout.widget.l lVar = hVarK.f15748f;
        boolean z3 = lVar.f15848m;
        this.f15362d = lVar.f15849n;
        this.f15363e = lVar.f15837b;
        this.f15364f = lVar.f15838c;
        this.f15365g = lVar.f15839d;
        this.f15366i = lVar.f15840e;
        this.f15367j = lVar.f15841f;
        this.f15368o = lVar.f15842g;
        this.f15369p = lVar.f15843h;
        this.t = lVar.f15845j;
        this.f15370v = lVar.f15846k;
        this.f15371w = lVar.f15847l;
        androidx.constraintlayout.widget.j jVar = hVarK.f15746d;
        O.e.d(jVar.f15820d);
        this.f15356A = jVar.f15824h;
        this.f15357B = hVarK.f15745c.f15834e;
        for (String str : hVarK.f15749g.keySet()) {
            androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) hVarK.f15749g.get(str);
            int i13 = F.i(aVar.f15701c);
            if (i13 != 4 && i13 != 5 && i13 != 7) {
                this.f15358C.put(str, aVar);
            }
        }
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        return;
                    }
                }
            }
            float f10 = this.f15363e + 90.0f;
            this.f15363e = f10;
            if (f10 > 180.0f) {
                this.f15363e = f10 - 360.0f;
                return;
            }
            return;
        }
        this.f15363e -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((k) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
