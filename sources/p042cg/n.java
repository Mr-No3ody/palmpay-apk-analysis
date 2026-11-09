package p042cg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19024b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19025c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19026d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19027e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f19028a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final j a(j jVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19025c;
        if (atomicIntegerFieldUpdater.get(this) - f19026d.get(this) == 127) {
            return jVar;
        }
        if (jVar.f19015b) {
            f19027e.incrementAndGet(this);
        }
        int i7 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f19028a;
            if (atomicReferenceArray.get(i7) == null) {
                atomicReferenceArray.lazySet(i7, jVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final j b() {
        j jVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19026d;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 - f19025c.get(this) == 0) {
                return null;
            }
            int i10 = i7 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 + 1) && (jVar = (j) this.f19028a.getAndSet(i10, null)) != null) {
                if (jVar.f19015b) {
                    f19027e.decrementAndGet(this);
                }
                return jVar;
            }
        }
    }

    public final j c(int i7, boolean z3) {
        int i10 = i7 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f19028a;
        j jVar = (j) atomicReferenceArray.get(i10);
        if (jVar != null && jVar.f19015b == z3) {
            while (!atomicReferenceArray.compareAndSet(i10, jVar, null)) {
                if (atomicReferenceArray.get(i10) != jVar) {
                }
            }
            if (z3) {
                f19027e.decrementAndGet(this);
            }
            return jVar;
        }
        return null;
    }
}
