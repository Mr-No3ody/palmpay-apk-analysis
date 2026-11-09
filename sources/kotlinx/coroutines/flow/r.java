package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1886s f39212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f39213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlowCollector f39214e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1886s c1886s, Continuation continuation) {
        super(continuation);
        this.f39212c = c1886s;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39210a = obj;
        this.f39211b |= Integer.MIN_VALUE;
        return this.f39212c.collect(null, this);
    }
}
