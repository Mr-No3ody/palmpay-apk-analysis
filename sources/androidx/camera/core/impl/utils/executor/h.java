package androidx.camera.core.impl.utils.executor;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f14176b;

    public /* synthetic */ h(Runnable runnable, int i7) {
        this.f14175a = i7;
        this.f14176b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14175a) {
            case 0:
                this.f14176b.run();
                break;
            default:
                Process.setThreadPriority(10);
                this.f14176b.run();
                break;
        }
    }
}
