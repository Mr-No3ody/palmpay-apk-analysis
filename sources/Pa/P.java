package Pa;

import Pg.C0556c;
import Pg.C0559f;
import android.os.Process;
import io.reactivex.internal.schedulers.NonBlockingThread;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class P extends Thread implements NonBlockingThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7039a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(Runnable runnable, String str, int i7) {
        super(runnable, str);
        this.f7039a = i7;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.f7039a) {
            case 0:
                try {
                    super.run();
                    return;
                } catch (Throwable th) {
                    F6.d.c("ThreadUtils", "Request threw uncaught throwable", th);
                    return;
                }
            case 1:
                break;
            case 2:
            default:
                super.run();
                return;
            case 3:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                C0556c c0556c = C0559f.Companion;
                ReentrantLock lock = c0556c.getLock();
                lock.lock();
                try {
                    C0559f c0559fAwaitTimeout$okio = c0556c.awaitTimeout$okio();
                    if (c0559fAwaitTimeout$okio == C0559f.head) {
                        C0559f.head = null;
                        lock.unlock();
                        return;
                    } else {
                        Unit unit = Unit.f38893a;
                        lock.unlock();
                        if (c0559fAwaitTimeout$okio != null) {
                            c0559fAwaitTimeout$okio.timedOut();
                        }
                    }
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(String str) {
        super(str);
        this.f7039a = 1;
    }
}
