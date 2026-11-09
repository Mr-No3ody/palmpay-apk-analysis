package androidx.biometric;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.biometric.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0911o implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f13086b;

    public ExecutorC0911o(int i7) {
        this.f13085a = i7;
        switch (i7) {
            case 1:
                this.f13086b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f13086b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f13085a) {
            case 0:
                this.f13086b.post(runnable);
                break;
            default:
                this.f13086b.post(runnable);
                break;
        }
    }
}
