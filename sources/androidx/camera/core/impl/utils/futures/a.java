package androidx.camera.core.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AsyncFunction f14188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedBlockingQueue f14189d = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountDownLatch f14190e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ListenableFuture f14191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile ListenableFuture f14192g;

    public a(AsyncFunction asyncFunction, ListenableFuture listenableFuture) {
        this.f14188c = asyncFunction;
        listenableFuture.getClass();
        this.f14191f = listenableFuture;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z3 = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // androidx.camera.core.impl.utils.futures.b, java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        boolean z8 = false;
        if (!this.f14193a.cancel(z3)) {
            return false;
        }
        while (true) {
            try {
                this.f14189d.put(Boolean.valueOf(z3));
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        ListenableFuture listenableFuture = this.f14191f;
        if (listenableFuture != null) {
            listenableFuture.cancel(z3);
        }
        ListenableFuture listenableFuture2 = this.f14192g;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(z3);
        }
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.b, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.f14193a.isDone()) {
            ListenableFuture listenableFuture = this.f14191f;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.f14190e.await();
            ListenableFuture listenableFuture2 = this.f14192g;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return this.f14193a.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r1 = r5.f14191f     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38 java.util.concurrent.ExecutionException -> L4a java.util.concurrent.CancellationException -> L57
            java.lang.Object r1 = androidx.camera.core.impl.utils.futures.j.c(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38 java.util.concurrent.ExecutionException -> L4a java.util.concurrent.CancellationException -> L57
            androidx.camera.core.impl.utils.futures.AsyncFunction r2 = r5.f14188c     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            com.google.common.util.concurrent.ListenableFuture r1 = r2.apply(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            r5.f14192g = r1     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            com.google.common.util.concurrent.ListenableFuture r2 = r5.f14193a     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            boolean r2 = r2.isCancelled()     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            if (r2 == 0) goto L3a
            java.util.concurrent.LinkedBlockingQueue r2 = r5.f14189d     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            java.lang.Object r2 = b(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            r5.f14192g = r0     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
        L28:
            r5.f14188c = r0
            r5.f14191f = r0
            java.util.concurrent.CountDownLatch r0 = r5.f14190e
            r0.countDown()
            return
        L32:
            r1 = move-exception
            goto L82
        L34:
            r1 = move-exception
            goto L5c
        L36:
            r1 = move-exception
            goto L6d
        L38:
            r1 = move-exception
            goto L75
        L3a:
            androidx.camera.core.impl.utils.futures.i r2 = new androidx.camera.core.impl.utils.futures.i     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            r3 = 28
            r4 = 0
            r2.<init>(r5, r3, r1, r4)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            androidx.camera.core.impl.utils.executor.a r3 = org.chromium.support_lib_boundary.util.b.u()     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            r1.addListener(r2, r3)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            goto L28
        L4a:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            androidx.concurrent.futures.k r2 = r5.f14194b     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            if (r2 == 0) goto L28
            r2.d(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            goto L28
        L57:
            r1 = 0
            r5.cancel(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            goto L28
        L5c:
            androidx.concurrent.futures.k r2 = r5.f14194b     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L63
            r2.d(r1)     // Catch: java.lang.Throwable -> L32
        L63:
            r5.f14188c = r0
            r5.f14191f = r0
            java.util.concurrent.CountDownLatch r0 = r5.f14190e
            r0.countDown()
            goto L81
        L6d:
            androidx.concurrent.futures.k r2 = r5.f14194b     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L63
            r2.d(r1)     // Catch: java.lang.Throwable -> L32
            goto L63
        L75:
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L32
            androidx.concurrent.futures.k r2 = r5.f14194b     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L63
            r2.d(r1)     // Catch: java.lang.Throwable -> L32
            goto L63
        L81:
            return
        L82:
            r5.f14188c = r0
            r5.f14191f = r0
            java.util.concurrent.CountDownLatch r0 = r5.f14190e
            r0.countDown()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.futures.a.run():void");
    }

    @Override // androidx.camera.core.impl.utils.futures.b, java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f14193a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j6 = timeUnit2.convert(j6, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture listenableFuture = this.f14191f;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j6, timeUnit);
                j6 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f14190e.await(j6, timeUnit)) {
                j6 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                ListenableFuture listenableFuture2 = this.f14192g;
                if (listenableFuture2 != null) {
                    listenableFuture2.get(j6, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.f14193a.get(j6, timeUnit);
    }
}
