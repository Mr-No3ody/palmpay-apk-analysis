package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f39159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlowCollector f39160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f39161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Job f39162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f39163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f39164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f39165g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39166i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, Continuation continuation) {
        super(continuation);
        this.f39165g = g0Var;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39164f = obj;
        this.f39166i |= Integer.MIN_VALUE;
        this.f39165g.collect(null, this);
        return Ef.a.f2423a;
    }
}
