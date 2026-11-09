package p175lf;

import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReferenceArray implements SimplePlainQueue {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Integer f39351f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f39353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f39355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39356e;

    public a(int i7) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i7 - 1)));
        this.f39352a = length() - 1;
        this.f39353b = new AtomicLong();
        this.f39355d = new AtomicLong();
        this.f39356e = Math.min(i7 / 4, f39351f.intValue());
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
        return this.f39353b.get() == this.f39355d.get();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f39353b;
        long j6 = atomicLong.get();
        int i7 = this.f39352a;
        int i10 = ((int) j6) & i7;
        if (j6 >= this.f39354c) {
            long j10 = ((long) this.f39356e) + j6;
            if (get(i7 & ((int) j10)) == null) {
                this.f39354c = j10;
            } else if (get(i10) != null) {
                return false;
            }
        }
        lazySet(i10, obj);
        atomicLong.lazySet(j6 + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        AtomicLong atomicLong = this.f39355d;
        long j6 = atomicLong.get();
        int i7 = ((int) j6) & this.f39352a;
        Object obj = get(i7);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j6 + 1);
        lazySet(i7, null);
        return obj;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj, Object obj2) {
        return offer(obj) && offer(obj2);
    }
}
