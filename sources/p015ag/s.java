package p015ag;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.NotCompleted;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s extends b implements NotCompleted {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11963d = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11964c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public s(long j6, s sVar, int i7) {
        super(sVar);
        this.f11964c = j6;
        this.cleanedAndPointers$volatile = i7 << 16;
    }

    @Override // p015ag.b
    public final boolean c() {
        return f11963d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f11963d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i7, CoroutineContext coroutineContext);

    public final void h() {
        if (f11963d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f11963d;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
