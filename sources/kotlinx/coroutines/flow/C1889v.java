package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1889v extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1888u f39228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1888u f39229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlowCollector f39230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889v(C1888u c1888u, Continuation continuation) {
        super(continuation);
        this.f39228c = c1888u;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39226a = obj;
        this.f39227b |= Integer.MIN_VALUE;
        return this.f39228c.collect(null, this);
    }
}
