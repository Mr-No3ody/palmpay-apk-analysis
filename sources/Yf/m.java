package Yf;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f11409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Ff.c cVar) {
        super(cVar);
        this.f11409b = nVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f11408a = obj;
        this.f11410c |= Integer.MIN_VALUE;
        Object objW = this.f11409b.w(null, 0, 0L, this);
        return objW == Ef.a.f2423a ? objW : new v(objW);
    }
}
