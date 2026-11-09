package p190mf;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends a implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = a.f39654c;
        this.f39657b = Thread.currentThread();
        try {
            this.f39656a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f39657b = null;
        }
    }
}
