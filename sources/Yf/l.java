package Yf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f11406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Continuation continuation) {
        super(continuation);
        this.f11406b = nVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f11405a = obj;
        this.f11407c |= Integer.MIN_VALUE;
        Object objV = n.v(this.f11406b, this);
        return objV == Ef.a.f2423a ? objV : new v(objV);
    }
}
