package p137j3;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.Pool;
import com.facebook.imagepipeline.memory.PoolStatsTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import p213o2.e;
import p229p2.a;
import p229p2.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Pool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f38214a = getClass();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemoryTrimmableRegistry f38215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f38216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f38217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f38218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f38220g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f38221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PoolStatsTracker f38222j;

    public c(MemoryTrimmableRegistry memoryTrimmableRegistry, x xVar, PoolStatsTracker poolStatsTracker) {
        memoryTrimmableRegistry.getClass();
        this.f38215b = memoryTrimmableRegistry;
        xVar.getClass();
        this.f38216c = xVar;
        poolStatsTracker.getClass();
        this.f38222j = poolStatsTracker;
        this.f38217d = new SparseArray();
        k(new SparseIntArray(0));
        this.f38218e = Collections.newSetFromMap(new IdentityHashMap());
        this.f38221i = new b();
        this.f38220g = new b();
    }

    public abstract Object a(int i7);

    public final synchronized boolean b(int i7) {
        x xVar = this.f38216c;
        int i10 = xVar.f38277a;
        int i11 = this.f38220g.f38213b;
        if (i7 > i10 - i11) {
            this.f38222j.onHardCapReached();
            return false;
        }
        int i12 = xVar.f38278b;
        if (i7 > i12 - (i11 + this.f38221i.f38213b)) {
            m(i12 - i7);
        }
        if (i7 <= i10 - (this.f38220g.f38213b + this.f38221i.f38213b)) {
            return true;
        }
        this.f38222j.onHardCapReached();
        return false;
    }

    public abstract void c(Object obj);

    public final synchronized h d(int i7) {
        try {
            h hVar = (h) this.f38217d.get(i7);
            if (hVar == null && this.f38219f) {
                if (a.f41180a.isLoggable(2)) {
                    a.o(this.f38214a, "creating new bucket %s", Integer.valueOf(i7));
                }
                int iG = g(i7);
                this.f38216c.getClass();
                h hVar2 = new h(iG, Integer.MAX_VALUE, 0);
                this.f38217d.put(i7, hVar2);
                return hVar2;
            }
            return hVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract int e(int i7);

    public abstract int f(Object obj);

    public abstract int g(int i7);

    @Override // com.facebook.common.memory.Pool
    public final Object get(int i7) throws Throwable {
        Object objA;
        Object objH;
        synchronized (this) {
            try {
                e.f(!i() || this.f38221i.f38213b == 0);
            } catch (Throwable th) {
                throw th;
            }
        }
        int iE = e(i7);
        synchronized (this) {
            try {
                h hVarD = d(iE);
                if (hVarD != null && (objH = h(hVarD)) != null) {
                    e.f(this.f38218e.add(objH));
                    int iF = f(objH);
                    int iG = g(iF);
                    b bVar = this.f38220g;
                    bVar.f38212a++;
                    bVar.f38213b += iG;
                    this.f38221i.a(iG);
                    this.f38222j.onValueReuse(iG);
                    l();
                    if (a.f41180a.isLoggable(2)) {
                        a.p(this.f38214a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objH)), Integer.valueOf(iF));
                    }
                    return objH;
                }
                int iG2 = g(iE);
                if (!b(iG2)) {
                    throw new P0.c(this.f38216c.f38277a, this.f38220g.f38213b, this.f38221i.f38213b, iG2);
                }
                b bVar2 = this.f38220g;
                bVar2.f38212a++;
                bVar2.f38213b += iG2;
                if (hVarD != null) {
                    hVarD.f38234d++;
                }
                try {
                    objA = a(iE);
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f38220g.a(iG2);
                        h hVarD2 = d(iE);
                        if (hVarD2 != null) {
                            e.f(hVarD2.f38234d > 0);
                            hVarD2.f38234d--;
                        }
                        if (Error.class.isInstance(th2)) {
                            throw ((Throwable) Error.class.cast(th2));
                        }
                        if (RuntimeException.class.isInstance(th2)) {
                            throw ((Throwable) RuntimeException.class.cast(th2));
                        }
                        objA = null;
                    }
                }
                synchronized (this) {
                    try {
                        e.f(this.f38218e.add(objA));
                        synchronized (this) {
                            if (i()) {
                                m(this.f38216c.f38278b);
                            }
                        }
                        return objA;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                this.f38222j.onAlloc(iG2);
                l();
                if (a.f41180a.isLoggable(2)) {
                    a.p(this.f38214a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objA)), Integer.valueOf(iE));
                }
                return objA;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public synchronized Object h(h hVar) {
        Object objA;
        objA = hVar.a();
        if (objA != null) {
            hVar.f38234d++;
        }
        return objA;
    }

    public final synchronized boolean i() {
        boolean z3;
        z3 = this.f38220g.f38213b + this.f38221i.f38213b > this.f38216c.f38278b;
        if (z3) {
            this.f38222j.onSoftCapReached();
        }
        return z3;
    }

    public boolean j(Object obj) {
        return true;
    }

    public final synchronized void k(SparseIntArray sparseIntArray) {
        try {
            this.f38217d.clear();
            SparseIntArray sparseIntArray2 = this.f38216c.f38279c;
            if (sparseIntArray2 != null) {
                for (int i7 = 0; i7 < sparseIntArray2.size(); i7++) {
                    int iKeyAt = sparseIntArray2.keyAt(i7);
                    int iValueAt = sparseIntArray2.valueAt(i7);
                    int i10 = sparseIntArray.get(iKeyAt, 0);
                    SparseArray sparseArray = this.f38217d;
                    int iG = g(iKeyAt);
                    this.f38216c.getClass();
                    sparseArray.put(iKeyAt, new h(iG, iValueAt, i10));
                }
                this.f38219f = false;
            } else {
                this.f38219f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l() {
        if (a.f41180a.isLoggable(2)) {
            b bVar = this.f38220g;
            Integer numValueOf = Integer.valueOf(bVar.f38212a);
            Integer numValueOf2 = Integer.valueOf(bVar.f38213b);
            b bVar2 = this.f38221i;
            Integer numValueOf3 = Integer.valueOf(bVar2.f38212a);
            Integer numValueOf4 = Integer.valueOf(bVar2.f38213b);
            Class cls = this.f38214a;
            if (a.f41180a.isLoggable(2)) {
                b.a(2, cls.getSimpleName(), String.format(null, "Used = (%d, %d); Free = (%d, %d)", numValueOf, numValueOf2, numValueOf3, numValueOf4));
            }
        }
    }

    public final synchronized void m(int i7) {
        try {
            int i10 = this.f38220g.f38213b;
            int i11 = this.f38221i.f38213b;
            int iMin = Math.min((i10 + i11) - i7, i11);
            if (iMin <= 0) {
                return;
            }
            if (a.f41180a.isLoggable(2)) {
                a.q(this.f38214a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i7), Integer.valueOf(this.f38220g.f38213b + this.f38221i.f38213b), Integer.valueOf(iMin));
            }
            l();
            for (int i12 = 0; i12 < this.f38217d.size() && iMin > 0; i12++) {
                h hVar = (h) this.f38217d.valueAt(i12);
                hVar.getClass();
                while (iMin > 0) {
                    Object objA = hVar.a();
                    if (objA == null) {
                        break;
                    }
                    c(objA);
                    int i13 = hVar.f38231a;
                    iMin -= i13;
                    this.f38221i.a(i13);
                }
            }
            l();
            if (a.f41180a.isLoggable(2)) {
                a.p(this.f38214a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i7), Integer.valueOf(this.f38220g.f38213b + this.f38221i.f38213b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:4:0x000c, B:6:0x0015, B:7:0x0016, B:9:0x001e, B:39:0x00e4, B:40:0x00e7, B:14:0x0046, B:17:0x0054, B:19:0x005a, B:22:0x0061, B:24:0x0065, B:26:0x0079, B:28:0x0097, B:25:0x006e, B:30:0x00ad, B:34:0x00b4, B:35:0x00bc, B:37:0x00c4, B:38:0x00d7, B:44:0x00eb, B:5:0x000d), top: B:49:0x000c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:4:0x000c, B:6:0x0015, B:7:0x0016, B:9:0x001e, B:39:0x00e4, B:40:0x00e7, B:14:0x0046, B:17:0x0054, B:19:0x005a, B:22:0x0061, B:24:0x0065, B:26:0x0079, B:28:0x0097, B:25:0x006e, B:30:0x00ad, B:34:0x00b4, B:35:0x00bc, B:37:0x00c4, B:38:0x00d7, B:44:0x00eb, B:5:0x000d), top: B:49:0x000c, inners: #0 }] */
    @Override // com.facebook.common.memory.Pool, com.facebook.common.references.ResourceReleaser
    public final void release(Object obj) {
        h hVar;
        boolean z3;
        obj.getClass();
        int iF = f(obj);
        int iG = g(iF);
        synchronized (this) {
            try {
                synchronized (this) {
                    hVar = (h) this.f38217d.get(iF);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.f38218e.remove(obj)) {
            a.g(this.f38214a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iF));
            c(obj);
            this.f38222j.onFree(iG);
        } else if (hVar != null) {
            if (hVar.f38233c.size() + hVar.f38234d <= hVar.f38232b && !i() && j(obj)) {
                int i7 = hVar.f38234d;
                if (i7 > 0) {
                    hVar.f38234d = i7 - 1;
                    hVar.f38233c.add(obj);
                } else {
                    a.j("BUCKET", "Tried to release value %s from an empty bucket!", obj);
                }
                b bVar = this.f38221i;
                bVar.f38212a++;
                bVar.f38213b += iG;
                this.f38220g.a(iG);
                this.f38222j.onValueRelease(iG);
                if (a.f41180a.isLoggable(2)) {
                    a.p(this.f38214a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iF));
                }
            } else {
                if (hVar != null) {
                    if (hVar.f38234d > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    e.f(z3);
                    hVar.f38234d--;
                }
                if (a.f41180a.isLoggable(2)) {
                    a.p(this.f38214a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iF));
                }
                c(obj);
                this.f38220g.a(iG);
                this.f38222j.onFree(iG);
            }
        } else {
            if (hVar != null) {
                if (hVar.f38234d > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                e.f(z3);
                hVar.f38234d--;
            }
            if (a.f41180a.isLoggable(2)) {
                a.p(this.f38214a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iF));
            }
            c(obj);
            this.f38220g.a(iG);
            this.f38222j.onFree(iG);
        }
        l();
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public final void trim(p262r2.b bVar) {
        ArrayList arrayList;
        int i7;
        synchronized (this) {
            try {
                this.f38216c.getClass();
                arrayList = new ArrayList(this.f38217d.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i10 = 0; i10 < this.f38217d.size(); i10++) {
                    h hVar = (h) this.f38217d.valueAt(i10);
                    hVar.getClass();
                    if (hVar.f38233c.size() > 0) {
                        arrayList.add(hVar);
                    }
                    sparseIntArray.put(this.f38217d.keyAt(i10), hVar.f38234d);
                }
                k(sparseIntArray);
                b bVar2 = this.f38221i;
                bVar2.f38212a = 0;
                bVar2.f38213b = 0;
                l();
            } catch (Throwable th) {
                throw th;
            }
        }
        for (i7 = 0; i7 < arrayList.size(); i7++) {
            h hVar2 = (h) arrayList.get(i7);
            while (true) {
                Object objA = hVar2.a();
                if (objA == null) {
                    break;
                } else {
                    c(objA);
                }
            }
        }
    }
}
