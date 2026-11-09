package p204nb;

import Ff.c;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f39927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, c cVar) {
        super(cVar);
        this.f39927b = vVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39926a = obj;
        this.f39928c |= Integer.MIN_VALUE;
        return this.f39927b.a(this);
    }
}
