package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1887t extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1888u f39219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1888u f39220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlowCollector f39221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Zf.y f39222f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1887t(C1888u c1888u, Continuation continuation) {
        super(continuation);
        this.f39219c = c1888u;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39217a = obj;
        this.f39218b |= Integer.MIN_VALUE;
        return this.f39219c.collect(null, this);
    }
}
