package p204nb;

import Ff.c;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f39912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, c cVar) {
        super(cVar);
        this.f39912b = qVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39911a = obj;
        this.f39913c |= Integer.MIN_VALUE;
        return this.f39912b.f(this);
    }
}
