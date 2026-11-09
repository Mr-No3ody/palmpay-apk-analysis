package p204nb;

import Ff.c;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f39909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, c cVar) {
        super(cVar);
        this.f39909b = qVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39908a = obj;
        this.f39910c |= Integer.MIN_VALUE;
        return this.f39909b.e(this);
    }
}
