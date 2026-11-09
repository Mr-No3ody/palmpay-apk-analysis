package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1870b extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ProducerScope f39139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1871c f39141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1870b(C1871c c1871c, Ff.c cVar) {
        super(cVar);
        this.f39141c = c1871c;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39140b = obj;
        this.f39142d |= Integer.MIN_VALUE;
        return this.f39141c.b(null, this);
    }
}
