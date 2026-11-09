package p056dg;

import Ff.c;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f35951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f35952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f35953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, c cVar) {
        super(cVar);
        this.f35953c = gVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f35952b = obj;
        this.f35954d |= Integer.MIN_VALUE;
        return this.f35953c.b(this);
    }
}
