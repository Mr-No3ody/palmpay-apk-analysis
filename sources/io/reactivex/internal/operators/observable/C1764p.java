package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1764p extends AtomicInteger implements Disposable, Observer {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C1763o[] f37851A = new C1763o[0];

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C1763o[] f37852B = new C1763o[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function f37854b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile SimplePlainQueue f37857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f37858f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f37860i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Disposable f37862o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f37863p;
    public long t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f37864v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f37865w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p239pf.a f37859g = new p239pf.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37855c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f37861j = new AtomicReference(f37851A);

    public C1764p(Observer observer, Function function, int i7) {
        this.f37853a = observer;
        this.f37854b = function;
        this.f37856d = i7;
    }

    public final boolean a() {
        if (!this.f37860i) {
            if (((Throwable) this.f37859g.get()) == null) {
                return false;
            }
            b();
            Throwable thB = this.f37859g.b();
            if (thB != p239pf.c.f41306a) {
                this.f37853a.onError(thB);
            }
        }
        return true;
    }

    public final boolean b() {
        C1763o[] c1763oArr;
        this.f37862o.dispose();
        AtomicReference atomicReference = this.f37861j;
        C1763o[] c1763oArr2 = (C1763o[]) atomicReference.get();
        C1763o[] c1763oArr3 = f37852B;
        if (c1763oArr2 == c1763oArr3 || (c1763oArr = (C1763o[]) atomicReference.getAndSet(c1763oArr3)) == c1763oArr3) {
            return false;
        }
        for (C1763o c1763o : c1763oArr) {
            c1763o.getClass();
            p001if.a.a(c1763o);
        }
        return true;
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2 A[PHI: r4
      0x00f2: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:67:0x00d1, B:79:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    public final void d() {
        boolean z3;
        Observer observer = this.f37853a;
        int iAddAndGet = 1;
        while (!a()) {
            SimplePlainQueue simplePlainQueue = this.f37857e;
            int i7 = 0;
            if (simplePlainQueue != null) {
                while (!a()) {
                    Object objPoll = simplePlainQueue.poll();
                    if (objPoll != null) {
                        observer.onNext(objPoll);
                        i7++;
                    }
                }
                return;
            }
            if (i7 == 0) {
                boolean z8 = this.f37858f;
                SimplePlainQueue simplePlainQueue2 = this.f37857e;
                C1763o[] c1763oArr = (C1763o[]) this.f37861j.get();
                int length = c1763oArr.length;
                if (this.f37855c != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z8 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    Throwable thB = this.f37859g.b();
                    if (thB != p239pf.c.f41306a) {
                        if (thB == null) {
                            observer.onComplete();
                            return;
                        } else {
                            observer.onError(thB);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j6 = this.t;
                    int i10 = this.f37864v;
                    if (length <= i10 || c1763oArr[i10].f37846a != j6) {
                        if (length <= i10) {
                            i10 = 0;
                        }
                        for (int i11 = 0; i11 < length && c1763oArr[i10].f37846a != j6; i11++) {
                            i10++;
                            if (i10 == length) {
                                i10 = 0;
                            }
                        }
                        this.f37864v = i10;
                        this.t = c1763oArr[i10].f37846a;
                    }
                    for (int i12 = 0; i12 < length; i12++) {
                        if (a()) {
                            return;
                        }
                        C1763o c1763o = c1763oArr[i10];
                        SimpleQueue simpleQueue = c1763o.f37849d;
                        if (simpleQueue != null) {
                            do {
                                try {
                                    Object objPoll2 = simpleQueue.poll();
                                    if (objPoll2 == null) {
                                        z3 = c1763o.f37848c;
                                        SimpleQueue simpleQueue2 = c1763o.f37849d;
                                        if (z3 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                            e(c1763o);
                                            if (a()) {
                                                return;
                                            } else {
                                                i7++;
                                            }
                                        }
                                        i10++;
                                        if (i10 == length) {
                                            i10 = 0;
                                        }
                                    } else {
                                        observer.onNext(objPoll2);
                                    }
                                } catch (Throwable th2) {
                                    D3.a.H(th2);
                                    p001if.a.a(c1763o);
                                    this.f37859g.a(th2);
                                    if (a()) {
                                        return;
                                    }
                                    e(c1763o);
                                    i7++;
                                    i10++;
                                    if (i10 == length) {
                                    }
                                }
                            } while (!a());
                            return;
                        }
                        z3 = c1763o.f37848c;
                        SimpleQueue simpleQueue3 = c1763o.f37849d;
                        if (z3) {
                            e(c1763o);
                            if (a()) {
                                return;
                            } else {
                                i7++;
                            }
                        }
                        i10++;
                        if (i10 == length) {
                            i10 = 0;
                        }
                    }
                    this.f37864v = i10;
                    this.t = c1763oArr[i10].f37846a;
                }
                if (i7 == 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (this.f37855c != Integer.MAX_VALUE) {
                    f(i7);
                }
            } else if (this.f37855c != Integer.MAX_VALUE) {
                f(i7);
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Throwable thB;
        if (this.f37860i) {
            return;
        }
        this.f37860i = true;
        if (!b() || (thB = this.f37859g.b()) == null || thB == p239pf.c.f41306a) {
            return;
        }
        org.chromium.support_lib_boundary.util.b.V(thB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(C1763o c1763o) {
        C1763o[] c1763oArr;
        while (true) {
            AtomicReference atomicReference = this.f37861j;
            C1763o[] c1763oArr2 = (C1763o[]) atomicReference.get();
            int length = c1763oArr2.length;
            if (length == 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    i7 = -1;
                    break;
                } else if (c1763oArr2[i7] == c1763o) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 < 0) {
                return;
            }
            if (length == 1) {
                c1763oArr = f37851A;
            } else {
                C1763o[] c1763oArr3 = new C1763o[length - 1];
                System.arraycopy(c1763oArr2, 0, c1763oArr3, 0, i7);
                System.arraycopy(c1763oArr2, i7 + 1, c1763oArr3, i7, (length - i7) - 1);
                c1763oArr = c1763oArr3;
            }
            while (!atomicReference.compareAndSet(c1763oArr2, c1763oArr)) {
                if (atomicReference.get() != c1763oArr2) {
                }
            }
            return;
        }
    }

    public final void f(int i7) {
        if (i7 == 0) {
            return;
        }
        synchronized (this) {
            throw null;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f37860i;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f37858f) {
            return;
        }
        this.f37858f = true;
        c();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.f37858f) {
            org.chromium.support_lib_boundary.util.b.V(th);
        } else if (!this.f37859g.a(th)) {
            org.chromium.support_lib_boundary.util.b.V(th);
        } else {
            this.f37858f = true;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f37858f) {
            return;
        }
        try {
            Object objApply = this.f37854b.apply(obj);
            p147jf.a.a(objApply, "The mapper returned a null ObservableSource");
            ObservableSource observableSource = (ObservableSource) objApply;
            if (this.f37855c != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i7 = this.f37865w;
                        if (i7 == this.f37855c) {
                            throw null;
                        }
                        this.f37865w = i7 + 1;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (observableSource instanceof Callable) {
                try {
                    Object objCall = ((Callable) observableSource).call();
                    if (objCall != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.f37853a.onNext(objCall);
                            if (decrementAndGet() != 0) {
                                d();
                            }
                        } else {
                            SimplePlainQueue bVar = this.f37857e;
                            if (bVar == null) {
                                bVar = this.f37855c == Integer.MAX_VALUE ? new p175lf.b(this.f37856d) : new p175lf.a(this.f37855c);
                                this.f37857e = bVar;
                            }
                            if (bVar.offer(objCall)) {
                                if (getAndIncrement() != 0) {
                                    return;
                                }
                                d();
                            } else {
                                onError(new IllegalStateException("Scalar queue full?!"));
                            }
                        }
                    }
                } catch (Throwable th2) {
                    D3.a.H(th2);
                    this.f37859g.a(th2);
                    c();
                }
                if (this.f37855c == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        throw null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            long j6 = this.f37863p;
            this.f37863p = 1 + j6;
            C1763o c1763o = new C1763o(this, j6);
            while (true) {
                AtomicReference atomicReference = this.f37861j;
                C1763o[] c1763oArr = (C1763o[]) atomicReference.get();
                if (c1763oArr == f37852B) {
                    p001if.a.a(c1763o);
                    return;
                }
                int length = c1763oArr.length;
                C1763o[] c1763oArr2 = new C1763o[length + 1];
                System.arraycopy(c1763oArr, 0, c1763oArr2, 0, length);
                c1763oArr2[length] = c1763o;
                do {
                    if (atomicReference.compareAndSet(c1763oArr, c1763oArr2)) {
                        observableSource.subscribe(c1763o);
                        return;
                    }
                } while (atomicReference.get() == c1763oArr);
            }
        } catch (Throwable th4) {
            D3.a.H(th4);
            this.f37862o.dispose();
            onError(th4);
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (p001if.a.d(this.f37862o, disposable)) {
            this.f37862o = disposable;
            this.f37853a.onSubscribe(this);
        }
    }
}
