package Pa;

import java.util.TimerTask;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f7031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f7032b;

    public L(ExecutorService executorService, N n10) {
        this.f7031a = executorService;
        this.f7032b = n10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f7031a.execute(this.f7032b);
    }
}
