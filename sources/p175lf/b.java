package p175lf;

import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements SimplePlainQueue {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f39357j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f39358o = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f39359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray f39363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray f39365g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f39366i;

    public b(int i7) {
        AtomicLong atomicLong = new AtomicLong();
        this.f39359a = atomicLong;
        this.f39366i = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i7) - 1));
        int i10 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.f39363e = atomicReferenceArray;
        this.f39362d = i10;
        this.f39360b = Math.min(iNumberOfLeadingZeros / 4, f39357j);
        this.f39365g = atomicReferenceArray;
        this.f39364f = i10;
        this.f39361c = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f39359a.get() == this.f39366i.get();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f39363e;
        AtomicLong atomicLong = this.f39359a;
        long j6 = atomicLong.get();
        int i7 = this.f39362d;
        int i10 = ((int) j6) & i7;
        if (j6 < this.f39361c) {
            atomicReferenceArray.lazySet(i10, obj);
            atomicLong.lazySet(j6 + 1);
            return true;
        }
        long j10 = ((long) this.f39360b) + j6;
        if (atomicReferenceArray.get(((int) j10) & i7) == null) {
            this.f39361c = j10 - 1;
            atomicReferenceArray.lazySet(i10, obj);
            atomicLong.lazySet(j6 + 1);
            return true;
        }
        long j11 = j6 + 1;
        if (atomicReferenceArray.get(((int) j11) & i7) == null) {
            atomicReferenceArray.lazySet(i10, obj);
            atomicLong.lazySet(j11);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f39363e = atomicReferenceArray2;
        this.f39361c = (j6 + ((long) i7)) - 1;
        atomicReferenceArray2.lazySet(i10, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i10, f39358o);
        atomicLong.lazySet(j11);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f39365g;
        AtomicLong atomicLong = this.f39366i;
        long j6 = atomicLong.get();
        int i7 = this.f39364f;
        int i10 = ((int) j6) & i7;
        Object obj = atomicReferenceArray.get(i10);
        boolean z3 = obj == f39358o;
        if (obj != null && !z3) {
            atomicReferenceArray.lazySet(i10, null);
            atomicLong.lazySet(j6 + 1);
            return obj;
        }
        if (!z3) {
            return null;
        }
        int i11 = i7 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i11);
        atomicReferenceArray.lazySet(i11, null);
        this.f39365g = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i10);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i10, null);
            atomicLong.lazySet(j6 + 1);
        }
        return obj2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f39363e;
        AtomicLong atomicLong = this.f39359a;
        long j6 = atomicLong.get();
        long j10 = 2 + j6;
        int i7 = this.f39362d;
        if (atomicReferenceArray.get(((int) j10) & i7) == null) {
            int i10 = ((int) j6) & i7;
            atomicReferenceArray.lazySet(i10 + 1, obj2);
            atomicReferenceArray.lazySet(i10, obj);
            atomicLong.lazySet(j10);
        } else {
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.f39363e = atomicReferenceArray2;
            int i11 = ((int) j6) & i7;
            atomicReferenceArray2.lazySet(i11 + 1, obj2);
            atomicReferenceArray2.lazySet(i11, obj);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i11, f39358o);
            atomicLong.lazySet(j10);
        }
        return true;
    }
}
