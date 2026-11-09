package Q;

import N8.q0;
import androidx.camera.camera2.internal.F;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f7422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f7424f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.constraintlayout.core.g f7427i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f7419a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7425g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7426h = Integer.MIN_VALUE;

    public c(e eVar, int i7) {
        this.f7422d = eVar;
        this.f7423e = i7;
    }

    public final void a(c cVar, int i7) {
        b(cVar, i7, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i7, int i10, boolean z3) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z3 && !i(cVar)) {
            return false;
        }
        this.f7424f = cVar;
        if (cVar.f7419a == null) {
            cVar.f7419a = new HashSet();
        }
        HashSet hashSet = this.f7424f.f7419a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f7425g = i7;
        this.f7426h = i10;
        return true;
    }

    public final void c(int i7, R.m mVar, ArrayList arrayList) {
        HashSet hashSet = this.f7419a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                R.g.b(((c) it.next()).f7422d, i7, arrayList, mVar);
            }
        }
    }

    public final int d() {
        if (this.f7421c) {
            return this.f7420b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f7422d.i0 == 8) {
            return 0;
        }
        int i7 = this.f7426h;
        return (i7 == Integer.MIN_VALUE || (cVar = this.f7424f) == null || cVar.f7422d.i0 != 8) ? this.f7425g : i7;
    }

    public final c f() {
        int i7 = this.f7423e;
        int i10 = F.i(i7);
        e eVar = this.f7422d;
        switch (i10) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return eVar.f7444L;
            case 2:
                return eVar.f7445M;
            case 3:
                return eVar.f7442J;
            case 4:
                return eVar.f7443K;
            default:
                throw new AssertionError(q0.z(i7));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f7419a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f7424f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0063 A[RETURN] */
    public final boolean i(c cVar) {
        if (cVar != null) {
            int i7 = this.f7423e;
            e eVar = cVar.f7422d;
            int i10 = cVar.f7423e;
            if (i10 != i7) {
                switch (F.i(i7)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z3 = i10 == 2 || i10 == 4;
                        if (!(eVar instanceof i)) {
                            return z3;
                        }
                        if (z3 || i10 == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z8 = i10 == 3 || i10 == 5;
                        if (!(eVar instanceof i)) {
                            return z8;
                        }
                        if (z8 || i10 == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i10 != 2 && i10 != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i10 != 6 && i10 != 8 && i10 != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(q0.z(i7));
                }
            } else if (i7 != 6 || (eVar.f7437E && this.f7422d.f7437E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f7424f;
        if (cVar != null && (hashSet = cVar.f7419a) != null) {
            hashSet.remove(this);
            if (this.f7424f.f7419a.size() == 0) {
                this.f7424f.f7419a = null;
            }
        }
        this.f7419a = null;
        this.f7424f = null;
        this.f7425g = 0;
        this.f7426h = Integer.MIN_VALUE;
        this.f7421c = false;
        this.f7420b = 0;
    }

    public final void k() {
        androidx.constraintlayout.core.g gVar = this.f7427i;
        if (gVar == null) {
            this.f7427i = new androidx.constraintlayout.core.g(1);
        } else {
            gVar.c();
        }
    }

    public final void l(int i7) {
        this.f7420b = i7;
        this.f7421c = true;
    }

    public final String toString() {
        return this.f7422d.f7477k0 + ":" + q0.z(this.f7423e);
    }
}
