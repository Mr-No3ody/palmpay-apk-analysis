package androidx.concurrent.futures;

import C0.G;
import N8.q0;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.video.u;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements ListenableFuture {
    static final a ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;

    @Nullable
    volatile e listeners;

    @Nullable
    volatile Object value;

    @Nullable
    volatile i waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(j.class.getName());

    static {
        a hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j.class, i.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(j.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        ATOMIC_HELPER = hVar;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    public static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            CancellationException cancellationException = ((b) obj).f15042b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f15045a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t) {
        t.getClass();
        return t;
    }

    public static void complete(j jVar) {
        e eVar;
        e eVar2;
        e eVar3 = null;
        while (true) {
            i iVar = jVar.waiters;
            if (ATOMIC_HELPER.c(jVar, iVar, i.f15057c)) {
                while (iVar != null) {
                    Thread thread = iVar.f15058a;
                    if (thread != null) {
                        iVar.f15058a = null;
                        LockSupport.unpark(thread);
                    }
                    iVar = iVar.f15059b;
                }
                jVar.afterDone();
                do {
                    eVar = jVar.listeners;
                } while (!ATOMIC_HELPER.a(jVar, eVar, e.f15046d));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.f15049c;
                    eVar3.f15049c = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.f15049c;
                    Runnable runnable = eVar2.f15047a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        jVar = gVar.f15055a;
                        if (jVar.value == gVar) {
                            if (ATOMIC_HELPER.b(jVar, gVar, getFutureValue(gVar.f15056b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, eVar2.f15048b);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
        }
    }

    public static Object getFutureValue(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof j) {
            Object obj = ((j) listenableFuture).value;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            if (bVar.f15041a) {
                return bVar.f15042b != null ? new b(false, bVar.f15042b) : b.f15040d;
            }
            return obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            return b.f15040d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(listenableFuture);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new b(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    @RestrictTo({p192n.c.f39801b})
    public static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v3;
        boolean z3 = false;
        while (true) {
            try {
                v3 = future.get();
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
        return v3;
    }

    public final void a(StringBuilder sb2) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(uninterruptibly == this ? "this future" : String.valueOf(uninterruptibly));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        e eVar = this.listeners;
        e eVar2 = e.f15046d;
        if (eVar != eVar2) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f15049c = eVar;
                if (ATOMIC_HELPER.a(this, eVar, eVar3)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != eVar2);
        }
        b(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        b bVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            bVar = new b(z3, new CancellationException("Future.cancel() was called."));
        } else {
            bVar = z3 ? b.f15039c : b.f15040d;
        }
        j jVar = this;
        boolean z8 = false;
        while (true) {
            if (ATOMIC_HELPER.b(jVar, obj, bVar)) {
                if (z3) {
                    jVar.interruptTask();
                }
                complete(jVar);
                if (obj instanceof g) {
                    ListenableFuture listenableFuture = ((g) obj).f15056b;
                    if (listenableFuture instanceof j) {
                        jVar = (j) listenableFuture;
                        obj = jVar.value;
                        if ((obj == null) | (obj instanceof g)) {
                            z8 = true;
                        }
                    } else {
                        listenableFuture.cancel(z3);
                    }
                }
                return true;
            }
            obj = jVar.value;
            if (!(obj instanceof g)) {
                return z8;
            }
        }
    }

    public final void d(i iVar) {
        iVar.f15058a = null;
        while (true) {
            i iVar2 = this.waiters;
            if (iVar2 == i.f15057c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f15059b;
                if (iVar2.f15058a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f15059b = iVar4;
                    if (iVar3.f15058a == null) {
                    }
                } else if (!ATOMIC_HELPER.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z3;
        long nanos = timeUnit.toNanos(j6);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof g))) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= SPIN_THRESHOLD_NANOS) {
            i iVar = this.waiters;
            i iVar2 = i.f15057c;
            if (iVar != iVar2) {
                i iVar3 = new i();
                z3 = true;
                while (true) {
                    a aVar = ATOMIC_HELPER;
                    aVar.d(iVar3, iVar);
                    if (aVar.c(this, iVar, iVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                d(iVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= SPIN_THRESHOLD_NANOS);
                        d(iVar3);
                        break;
                    }
                    iVar = this.waiters;
                    if (iVar == iVar2) {
                    }
                }
            }
            return c(this.value);
        }
        z3 = true;
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null ? z3 : false) && (!(obj3 instanceof g))) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbR = u.r(j6, "Waited ", " ");
        sbR.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbR.toString();
        if (nanos + SPIN_THRESHOLD_NANOS < 0) {
            String strJ = q0.j(string3, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z8 = (jConvert == 0 || nanos2 > SPIN_THRESHOLD_NANOS) ? z3 : false;
            if (jConvert > 0) {
                String strJ2 = strJ + jConvert + " " + lowerCase;
                if (z8) {
                    strJ2 = q0.j(strJ2, ",");
                }
                strJ = q0.j(strJ2, " ");
            }
            if (z8) {
                strJ = strJ + nanos2 + " nanoseconds ";
            }
            string3 = q0.j(strJ, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(q0.j(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(q0.y(string3, " for ", string));
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof g)) & (obj != null);
    }

    public final void maybePropagateCancellationTo(@Nullable Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof g) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ListenableFuture listenableFuture = ((g) obj).f15056b;
            return G.r(sb2, listenableFuture == this ? "this future" : String.valueOf(listenableFuture), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(@Nullable Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.b(this, null, new d((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean setFuture(ListenableFuture<Object> listenableFuture) {
        d dVar;
        checkNotNull(listenableFuture);
        Object obj = this.value;
        if (obj != null) {
            if (obj instanceof b) {
                listenableFuture.cancel(((b) obj).f15041a);
            }
        } else if (listenableFuture.isDone()) {
            if (ATOMIC_HELPER.b(this, null, getFutureValue(listenableFuture))) {
                complete(this);
                return true;
            }
        } else {
            g gVar = new g(this, listenableFuture);
            if (ATOMIC_HELPER.b(this, null, gVar)) {
                try {
                    listenableFuture.addListener(gVar, n.f15067a);
                    return true;
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f15044b;
                    }
                    ATOMIC_HELPER.b(this, gVar, dVar);
                    return true;
                }
            }
            obj = this.value;
            if (obj instanceof b) {
                listenableFuture.cancel(((b) obj).f15041a);
            }
        }
        return false;
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strPendingToString = pendingToString();
            } catch (RuntimeException e10) {
                strPendingToString = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strPendingToString != null && !strPendingToString.isEmpty()) {
                u.w(sb2, "PENDING, info=[", strPendingToString, "]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).f15041a;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return c(obj2);
            }
            i iVar = this.waiters;
            i iVar2 = i.f15057c;
            if (iVar != iVar2) {
                i iVar3 = new i();
                do {
                    a aVar = ATOMIC_HELPER;
                    aVar.d(iVar3, iVar);
                    if (aVar.c(this, iVar, iVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                d(iVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return c(obj);
                    }
                    iVar = this.waiters;
                } while (iVar != iVar2);
            }
            return c(this.value);
        }
        throw new InterruptedException();
    }
}
