package androidx.dynamicanimation.animation;

import Re.n;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements AnimationHandler$AnimationFrameCallback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f16848m = new e(ViewProps.SCALE_X, 1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f16849n = new e(ViewProps.SCALE_Y, 2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f16850o = new e(ViewProps.ROTATION, 3);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f16851p = new e("rotationX", 4);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f16852q = new e("rotationY", 5);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f16853r = new e("alpha", 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f16858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f16862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f16863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f16864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f16865l;

    public g(i iVar) {
        this.f16854a = 0.0f;
        this.f16855b = Float.MAX_VALUE;
        this.f16856c = false;
        this.f16859f = false;
        this.f16860g = Float.MAX_VALUE;
        this.f16861h = -3.4028235E38f;
        this.f16862i = 0L;
        this.f16864k = new ArrayList();
        this.f16865l = new ArrayList();
        this.f16857d = null;
        this.f16858e = new f(iVar);
        this.f16863j = 1.0f;
    }

    public static d a() {
        ThreadLocal threadLocal = d.f16836i;
        if (threadLocal.get() == null) {
            threadLocal.set(new d(new p279s5.d(27)));
        }
        return (d) threadLocal.get();
    }

    public final void b(float f10) {
        ArrayList arrayList;
        this.f16858e.setValue(this.f16857d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f16865l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((DynamicAnimation$OnAnimationUpdateListener) arrayList.get(i7)).onAnimationUpdate(this, this.f16855b, this.f16854a);
            }
            i7++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0111  */
    /* JADX WARN: Code duplicated, block: B:40:0x0128  */
    /* JADX WARN: Code duplicated, block: B:42:0x012e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121 A[EDGE_INSN: B:45:0x0121->B:38:0x0121 BREAK  A[LOOP:0: B:32:0x0103->B:37:0x011e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0131 A[SYNTHETIC] */
    @Override // androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback
    public final boolean doAnimationFrame(long j6) {
        boolean z3;
        d dVarA;
        ArrayList arrayList;
        int iIndexOf;
        int i7;
        ArrayList arrayList2;
        int size;
        long j10 = this.f16862i;
        if (j10 == 0) {
            this.f16862i = j6;
            b(this.f16855b);
            return false;
        }
        long j11 = j6 - j10;
        this.f16862i = j6;
        float f10 = a().f16843g;
        long j12 = f10 == 0.0f ? 2147483647L : (long) (j11 / f10);
        j jVar = (j) this;
        if (!jVar.f16868u) {
            if (jVar.t != Float.MAX_VALUE) {
                long j13 = j12 / 2;
                n nVarC = jVar.f16867s.c(jVar.f16855b, jVar.f16854a, j13);
                k kVar = jVar.f16867s;
                kVar.f16877i = jVar.t;
                jVar.t = Float.MAX_VALUE;
                n nVarC2 = kVar.c(nVarC.f8589a, nVarC.f8590b, j13);
                jVar.f16855b = nVarC2.f8589a;
                jVar.f16854a = nVarC2.f8590b;
            } else {
                n nVarC3 = jVar.f16867s.c(jVar.f16855b, jVar.f16854a, j12);
                jVar.f16855b = nVarC3.f8589a;
                jVar.f16854a = nVarC3.f8590b;
            }
            float fMax = Math.max(jVar.f16855b, jVar.f16861h);
            jVar.f16855b = fMax;
            float fMin = Math.min(fMax, jVar.f16860g);
            jVar.f16855b = fMin;
            if (jVar.f16867s.isAtEquilibrium(fMin, jVar.f16854a)) {
                jVar.f16855b = (float) jVar.f16867s.f16877i;
                jVar.f16854a = 0.0f;
            } else {
                z3 = false;
            }
            float fMin2 = Math.min(this.f16855b, this.f16860g);
            this.f16855b = fMin2;
            float fMax2 = Math.max(fMin2, this.f16861h);
            this.f16855b = fMax2;
            b(fMax2);
            if (z3) {
                this.f16859f = false;
                dVarA = a();
                dVarA.f16837a.remove(this);
                arrayList = dVarA.f16838b;
                iIndexOf = arrayList.indexOf(this);
                if (iIndexOf >= 0) {
                    arrayList.set(iIndexOf, null);
                    dVarA.f16842f = true;
                }
                this.f16862i = 0L;
                this.f16856c = false;
                i7 = 0;
                while (true) {
                    arrayList2 = this.f16864k;
                    if (i7 < arrayList2.size()) {
                        break;
                    }
                    if (arrayList2.get(i7) != null) {
                        ((DynamicAnimation$OnAnimationEndListener) arrayList2.get(i7)).onAnimationEnd(this, false, this.f16855b, this.f16854a);
                    }
                    i7++;
                }
                for (size = arrayList2.size() - 1; size >= 0; size--) {
                    if (arrayList2.get(size) == null) {
                        arrayList2.remove(size);
                    }
                }
            }
            return z3;
        }
        float f11 = jVar.t;
        if (f11 != Float.MAX_VALUE) {
            jVar.f16867s.f16877i = f11;
            jVar.t = Float.MAX_VALUE;
        }
        jVar.f16855b = (float) jVar.f16867s.f16877i;
        jVar.f16854a = 0.0f;
        jVar.f16868u = false;
        z3 = true;
        float fMin3 = Math.min(this.f16855b, this.f16860g);
        this.f16855b = fMin3;
        float fMax3 = Math.max(fMin3, this.f16861h);
        this.f16855b = fMax3;
        b(fMax3);
        if (z3) {
            this.f16859f = false;
            dVarA = a();
            dVarA.f16837a.remove(this);
            arrayList = dVarA.f16838b;
            iIndexOf = arrayList.indexOf(this);
            if (iIndexOf >= 0) {
                arrayList.set(iIndexOf, null);
                dVarA.f16842f = true;
            }
            this.f16862i = 0L;
            this.f16856c = false;
            i7 = 0;
            while (true) {
                arrayList2 = this.f16864k;
                if (i7 < arrayList2.size()) {
                    break;
                    break;
                }
                if (arrayList2.get(i7) != null) {
                    ((DynamicAnimation$OnAnimationEndListener) arrayList2.get(i7)).onAnimationEnd(this, false, this.f16855b, this.f16854a);
                }
                i7++;
            }
            while (size >= 0) {
                if (arrayList2.get(size) == null) {
                    arrayList2.remove(size);
                }
            }
        }
        return z3;
    }

    public g(Object obj, h hVar) {
        this.f16854a = 0.0f;
        this.f16855b = Float.MAX_VALUE;
        this.f16856c = false;
        this.f16859f = false;
        this.f16860g = Float.MAX_VALUE;
        this.f16861h = -3.4028235E38f;
        this.f16862i = 0L;
        this.f16864k = new ArrayList();
        this.f16865l = new ArrayList();
        this.f16857d = obj;
        this.f16858e = hVar;
        if (hVar != f16850o && hVar != f16851p && hVar != f16852q) {
            if (hVar == f16853r) {
                this.f16863j = 0.00390625f;
                return;
            } else if (hVar != f16848m && hVar != f16849n) {
                this.f16863j = 1.0f;
                return;
            } else {
                this.f16863j = 0.002f;
                return;
            }
        }
        this.f16863j = 0.1f;
    }
}
