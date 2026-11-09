package p239pf;

import java.util.concurrent.atomic.AtomicReference;
import p118hf.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReference {
    public final boolean a(Throwable th) {
        b bVar = c.f41306a;
        while (true) {
            Throwable th2 = (Throwable) get();
            if (th2 == c.f41306a) {
                return false;
            }
            Throwable bVar2 = th2 == null ? th : new b(th2, th);
            while (!compareAndSet(th2, bVar2)) {
                if (get() != th2) {
                }
            }
            return true;
        }
    }

    public final Throwable b() {
        b bVar = c.f41306a;
        Throwable th = (Throwable) get();
        b bVar2 = c.f41306a;
        return th != bVar2 ? (Throwable) getAndSet(bVar2) : th;
    }
}
