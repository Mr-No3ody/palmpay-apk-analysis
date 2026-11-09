package androidx.core.provider;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16133a;

    public k(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f16133a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f16133a);
        super.run();
    }
}
