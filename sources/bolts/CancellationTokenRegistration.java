package bolts;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class CancellationTokenRegistration implements Closeable {
    private Runnable action;
    private boolean closed;
    private final Object lock = new Object();
    private CancellationTokenSource tokenSource;

    public CancellationTokenRegistration(CancellationTokenSource cancellationTokenSource, Runnable runnable) {
        this.tokenSource = cancellationTokenSource;
        this.action = runnable;
    }

    private void throwIfClosed() {
        if (this.closed) {
            throw new IllegalStateException("Object already closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                this.tokenSource.unregister(this);
                this.tokenSource = null;
                this.action = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void runAction() {
        synchronized (this.lock) {
            throwIfClosed();
            this.action.run();
            close();
        }
    }
}
