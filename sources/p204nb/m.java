package p204nb;

import Ff.c;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f39901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, c cVar) {
        super(cVar);
        this.f39901c = qVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39900b = obj;
        this.f39902d |= Integer.MIN_VALUE;
        return this.f39901c.c(null, this);
    }
}
