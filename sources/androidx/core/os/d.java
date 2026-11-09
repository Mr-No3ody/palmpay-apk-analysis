package androidx.core.os;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CancellationSignal$OnCancelListener f16091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CancellationSignal f16092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16093d;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f16090a) {
                    return;
                }
                this.f16090a = true;
                this.f16093d = true;
                CancellationSignal$OnCancelListener cancellationSignal$OnCancelListener = this.f16091b;
                CancellationSignal cancellationSignal = this.f16092c;
                if (cancellationSignal$OnCancelListener != null) {
                    try {
                        cancellationSignal$OnCancelListener.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f16093d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.f16093d = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(CancellationSignal$OnCancelListener cancellationSignal$OnCancelListener) {
        synchronized (this) {
            while (this.f16093d) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f16091b == cancellationSignal$OnCancelListener) {
                return;
            }
            this.f16091b = cancellationSignal$OnCancelListener;
            if (this.f16090a) {
                cancellationSignal$OnCancelListener.onCancel();
            }
        }
    }
}
