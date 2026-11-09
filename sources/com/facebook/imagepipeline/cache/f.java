package com.facebook.imagepipeline.cache;

import android.os.SystemClock;
import com.facebook.cache.common.HasDebugData;
import com.facebook.common.internal.Predicate;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p045d3.i;

/* JADX INFO: loaded from: classes.dex */
public final class f implements CountingMemoryCache, MemoryCache, HasDebugData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountingMemoryCache.EntryStateObserver f21409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p045d3.e f21410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p045d3.e f21411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f21412d = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ValueDescriptor f21413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MemoryCache.CacheTrimStrategy f21414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Supplier f21415g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f21416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f21417j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f21418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f21419p;

    public f(ValueDescriptor valueDescriptor, MemoryCache.CacheTrimStrategy cacheTrimStrategy, Supplier supplier, CountingMemoryCache.EntryStateObserver entryStateObserver, boolean z3, boolean z8) {
        this.f21413e = valueDescriptor;
        this.f21410b = new p045d3.e(new p039cb.c(this, 7, valueDescriptor, false));
        this.f21411c = new p045d3.e(new p039cb.c(this, 7, valueDescriptor, false));
        this.f21414f = cacheTrimStrategy;
        this.f21415g = supplier;
        i iVar = (i) supplier.get();
        p213o2.e.e(iVar, "mMemoryCacheParamsSupplier returned null");
        this.f21416i = iVar;
        this.f21417j = SystemClock.uptimeMillis();
        this.f21409a = entryStateObserver;
        this.f21418o = z3;
        this.f21419p = z8;
    }

    public static void c(d dVar) {
        CountingMemoryCache.EntryStateObserver entryStateObserver;
        if (dVar == null || (entryStateObserver = dVar.f21407e) == null) {
            return;
        }
        entryStateObserver.onExclusivityChanged(dVar.f21403a, false);
    }

    public static void d(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c((d) it.next());
            }
        }
    }

    public final synchronized void a(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                synchronized (this) {
                    dVar.getClass();
                    p213o2.e.f(!dVar.f21406d);
                    dVar.f21406d = true;
                }
            }
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CloseableReference.d(g((d) it.next()));
            }
        }
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public final CloseableReference cache(Object obj, CloseableReference closeableReference) {
        return cache(obj, closeableReference, this.f21409a);
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public final void clear() {
        ArrayList arrayListA;
        ArrayList arrayListA2;
        synchronized (this) {
            arrayListA = this.f21410b.a();
            arrayListA2 = this.f21411c.a();
            a(arrayListA2);
        }
        b(arrayListA2);
        d(arrayListA);
        e();
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public final synchronized boolean contains(Predicate predicate) {
        return !this.f21411c.c(predicate).isEmpty();
    }

    public final synchronized void e() {
        if (this.f21417j + this.f21416i.f35514e > SystemClock.uptimeMillis()) {
            return;
        }
        this.f21417j = SystemClock.uptimeMillis();
        i iVar = (i) this.f21415g.get();
        p213o2.e.e(iVar, "mMemoryCacheParamsSupplier returned null");
        this.f21416i = iVar;
    }

    public final synchronized com.facebook.common.references.b f(d dVar) {
        synchronized (this) {
            p213o2.e.f(!dVar.f21406d);
            dVar.f21405c++;
        }
        return CloseableReference.j(dVar.f21404b.f(), new androidx.work.impl.model.b(this, 9, dVar, false), CloseableReference.f21217f);
        return CloseableReference.j(dVar.f21404b.f(), new androidx.work.impl.model.b(this, 9, dVar, false), CloseableReference.f21217f);
    }

    public final synchronized CloseableReference g(d dVar) {
        dVar.getClass();
        return (dVar.f21406d && dVar.f21405c == 0) ? dVar.f21404b : null;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public final CloseableReference get(Object obj) {
        d dVar;
        Object obj2;
        com.facebook.common.references.b bVarF;
        obj.getClass();
        synchronized (this) {
            try {
                dVar = (d) this.f21410b.f(obj);
                p045d3.e eVar = this.f21411c;
                synchronized (eVar) {
                    obj2 = eVar.f35503b.get(obj);
                }
                d dVar2 = (d) obj2;
                bVarF = dVar2 != null ? f(dVar2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        c(dVar);
        e();
        maybeEvictEntries();
        return bVarF;
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public final p045d3.e getCachedEntries() {
        return this.f21411c;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public final synchronized int getCount() {
        return this.f21411c.b();
    }

    @Override // com.facebook.cache.common.HasDebugData
    public final synchronized String getDebugData() {
        androidx.camera.video.internal.c cVar;
        cVar = new androidx.camera.video.internal.c("CountingMemoryCache");
        cVar.a(this.f21411c.b(), "cached_entries_count");
        cVar.a(this.f21411c.d(), "cached_entries_size_bytes");
        cVar.a(this.f21410b.b(), "exclusive_entries_count");
        cVar.a(this.f21410b.d(), "exclusive_entries_size_bytes");
        return cVar.toString();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public final synchronized int getEvictionQueueCount() {
        return this.f21410b.b();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public final synchronized int getEvictionQueueSizeInBytes() {
        return this.f21410b.d();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public final synchronized int getInUseSizeInBytes() {
        return this.f21411c.d() - this.f21410b.d();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public final i getMemoryCacheParams() {
        return this.f21416i;
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public final Map getOtherEntries() {
        return this.f21412d;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public final synchronized int getSizeInBytes() {
        return this.f21411c.d();
    }

    public final synchronized ArrayList h(int i7, int i10) {
        Object next;
        int iMax = Math.max(i7, 0);
        int iMax2 = Math.max(i10, 0);
        if (this.f21410b.b() <= iMax && this.f21410b.d() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.f21410b.b() <= iMax && this.f21410b.d() <= iMax2) {
                break;
            }
            p045d3.e eVar = this.f21410b;
            synchronized (eVar) {
                next = eVar.f35503b.isEmpty() ? null : eVar.f35503b.keySet().iterator().next();
            }
            if (next == null) {
                if (!this.f21419p) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f21410b.b()), Integer.valueOf(this.f21410b.d())));
                }
                p045d3.e eVar2 = this.f21410b;
                synchronized (eVar2) {
                    if (eVar2.f35503b.isEmpty()) {
                        eVar2.f35504c = 0;
                    }
                    break;
                }
            }
            this.f21410b.f(next);
            arrayList.add((d) this.f21411c.f(next));
        }
        return arrayList;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public final synchronized Object inspect(Object obj) {
        Object obj2;
        p045d3.e eVar = this.f21411c;
        synchronized (eVar) {
            obj2 = eVar.f35503b.get(obj);
        }
        d dVar = (d) obj2;
        if (dVar == null) {
            return null;
        }
        return dVar.f21404b.f();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public final void maybeEvictEntries() {
        int i7;
        int iB;
        synchronized (this) {
            this.f21416i.getClass();
            i7 = this.f21416i.f35511b;
            synchronized (this) {
                iB = this.f21411c.b() - this.f21410b.b();
            }
            b(arrayListH);
            d(arrayListH);
        }
        int iMin = Math.min(Integer.MAX_VALUE, i7 - iB);
        i iVar = this.f21416i;
        ArrayList arrayListH = h(iMin, Math.min(iVar.f35512c, iVar.f35510a - getInUseSizeInBytes()));
        a(arrayListH);
        b(arrayListH);
        d(arrayListH);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public final void probe(Object obj) {
        obj.getClass();
        synchronized (this) {
            try {
                d dVar = (d) this.f21410b.f(obj);
                if (dVar != null) {
                    this.f21410b.e(obj, dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public final int removeAll(Predicate predicate) {
        ArrayList arrayListG;
        ArrayList arrayListG2;
        synchronized (this) {
            arrayListG = this.f21410b.g(predicate);
            arrayListG2 = this.f21411c.g(predicate);
            a(arrayListG2);
        }
        b(arrayListG2);
        d(arrayListG);
        e();
        maybeEvictEntries();
        return arrayListG2.size();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public final CloseableReference reuse(Object obj) {
        d dVar;
        boolean z3;
        CloseableReference closeableReference;
        obj.getClass();
        synchronized (this) {
            try {
                dVar = (d) this.f21410b.f(obj);
                z3 = false;
                if (dVar != null) {
                    d dVar2 = (d) this.f21411c.f(obj);
                    dVar2.getClass();
                    p213o2.e.f(dVar2.f21405c == 0);
                    closeableReference = dVar2.f21404b;
                    z3 = true;
                } else {
                    closeableReference = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            c(dVar);
        }
        return closeableReference;
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public final void trim(p262r2.b bVar) {
        ArrayList arrayListH;
        double trimRatio = this.f21414f.getTrimRatio(bVar);
        synchronized (this) {
            arrayListH = h(Integer.MAX_VALUE, Math.max(0, ((int) ((1.0d - trimRatio) * ((double) this.f21411c.d()))) - getInUseSizeInBytes()));
            a(arrayListH);
        }
        b(arrayListH);
        d(arrayListH);
        e();
        maybeEvictEntries();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public final CloseableReference cache(Object obj, CloseableReference closeableReference, CountingMemoryCache.EntryStateObserver entryStateObserver) {
        d dVar;
        com.facebook.common.references.b bVarF;
        CloseableReference closeableReferenceG;
        int sizeInBytes;
        boolean z3;
        obj.getClass();
        closeableReference.getClass();
        e();
        synchronized (this) {
            dVar = (d) this.f21410b.f(obj);
            d dVar2 = (d) this.f21411c.f(obj);
            bVarF = null;
            if (dVar2 != null) {
                synchronized (this) {
                    p213o2.e.f(!dVar2.f21406d);
                    dVar2.f21406d = true;
                    closeableReferenceG = g(dVar2);
                }
                CloseableReference.d(closeableReferenceG);
                c(dVar);
                maybeEvictEntries();
                return bVarF;
            }
            closeableReferenceG = null;
            sizeInBytes = this.f21413e.getSizeInBytes(closeableReference.f());
            synchronized (this) {
                if (sizeInBytes <= this.f21416i.f35513d) {
                    synchronized (this) {
                        z3 = this.f21411c.b() - this.f21410b.b() <= this.f21416i.f35511b - 1 && getInUseSizeInBytes() <= this.f21416i.f35510a - sizeInBytes;
                    }
                }
            }
        }
        if (z3) {
            d dVar3 = this.f21418o ? new d(obj, closeableReference, entryStateObserver, sizeInBytes) : new d(obj, closeableReference, entryStateObserver, -1);
            this.f21411c.e(obj, dVar3);
            bVarF = f(dVar3);
        }
        CloseableReference.d(closeableReferenceG);
        c(dVar);
        maybeEvictEntries();
        return bVarF;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public final synchronized boolean contains(Object obj) {
        boolean zContainsKey;
        p045d3.e eVar = this.f21411c;
        synchronized (eVar) {
            zContainsKey = eVar.f35503b.containsKey(obj);
        }
        return zContainsKey;
    }
}
