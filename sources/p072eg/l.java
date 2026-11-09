package p072eg;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import p015ag.s;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f36322e;

    public l(long j6, l lVar, int i7) {
        super(j6, lVar, i7);
        this.f36322e = new AtomicReferenceArray(k.f36321f);
    }

    @Override // p015ag.s
    public final int f() {
        return k.f36321f;
    }

    @Override // p015ag.s
    public final void g(int i7, CoroutineContext coroutineContext) {
        this.f36322e.set(i7, k.f36320e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f11964c + ", hashCode=" + hashCode() + ']';
    }
}
