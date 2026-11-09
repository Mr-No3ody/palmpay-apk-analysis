package bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class CancellationTokenSource implements Closeable {
    private boolean cancellationRequested;
    private boolean closed;
    private ScheduledFuture<?> scheduledCancellation;
    private final Object lock = new Object();
    private final List<CancellationTokenRegistration> registrations = new ArrayList();
    private final ScheduledExecutorService executor = BoltsExecutors.scheduled();

    private void cancelScheduledCancellation() {
        ScheduledFuture<?> scheduledFuture = this.scheduledCancellation;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.scheduledCancellation = null;
        }
    }

    private void notifyListeners(List<CancellationTokenRegistration> list) {
        Iterator<CancellationTokenRegistration> it = list.iterator();
        while (it.hasNext()) {
            it.next().runAction();
        }
    }

    private void throwIfClosed() {
        if (this.closed) {
            throw new IllegalStateException("Object already closed");
        }
    }

    public void cancel() {
        synchronized (this.lock) {
            try {
                throwIfClosed();
                if (this.cancellationRequested) {
                    return;
                }
                cancelScheduledCancellation();
                this.cancellationRequested = true;
                notifyListeners(new ArrayList(this.registrations));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cancelAfter(long j6) {
        cancelAfter(j6, TimeUnit.MILLISECONDS);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                cancelScheduledCancellation();
                Iterator<CancellationTokenRegistration> it = this.registrations.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                this.registrations.clear();
                this.closed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CancellationToken getToken() {
        CancellationToken cancellationToken;
        synchronized (this.lock) {
            throwIfClosed();
            cancellationToken = new CancellationToken(this);
        }
        return cancellationToken;
    }

    public boolean isCancellationRequested() {
        boolean z3;
        synchronized (this.lock) {
            throwIfClosed();
            z3 = this.cancellationRequested;
        }
        return z3;
    }

    public CancellationTokenRegistration register(Runnable runnable) {
        CancellationTokenRegistration cancellationTokenRegistration;
        synchronized (this.lock) {
            try {
                throwIfClosed();
                cancellationTokenRegistration = new CancellationTokenRegistration(this, runnable);
                if (this.cancellationRequested) {
                    cancellationTokenRegistration.runAction();
                } else {
                    this.registrations.add(cancellationTokenRegistration);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cancellationTokenRegistration;
    }

    public void throwIfCancellationRequested() throws CancellationException {
        synchronized (this.lock) {
            try {
                throwIfClosed();
                if (this.cancellationRequested) {
                    throw new CancellationException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        Locale locale = Locale.US;
        return getClass().getName() + "@" + Integer.toHexString(hashCode()) + "[cancellationRequested=" + Boolean.toString(isCancellationRequested()) + "]";
    }

    public void unregister(CancellationTokenRegistration cancellationTokenRegistration) {
        synchronized (this.lock) {
            throwIfClosed();
            this.registrations.remove(cancellationTokenRegistration);
        }
    }

    private void cancelAfter(long j6, TimeUnit timeUnit) {
        if (j6 < -1) {
            throw new IllegalArgumentException("Delay must be >= -1");
        }
        if (j6 == 0) {
            cancel();
            return;
        }
        synchronized (this.lock) {
            try {
                if (this.cancellationRequested) {
                    return;
                }
                cancelScheduledCancellation();
                if (j6 != -1) {
                    this.scheduledCancellation = this.executor.schedule(new Runnable() { // from class: bolts.CancellationTokenSource.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (CancellationTokenSource.this.lock) {
                                CancellationTokenSource.this.scheduledCancellation = null;
                            }
                            CancellationTokenSource.this.cancel();
                        }
                    }, j6, timeUnit);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
