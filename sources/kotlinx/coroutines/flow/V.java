package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class V extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public W f39109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlowCollector f39110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Y f39111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Job f39112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f39113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W f39114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39115g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w3, Continuation continuation) {
        super(continuation);
        this.f39114f = w3;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f39113e = obj;
        this.f39115g |= Integer.MIN_VALUE;
        W.g(this.f39114f, null, this);
        return Ef.a.f2423a;
    }
}
