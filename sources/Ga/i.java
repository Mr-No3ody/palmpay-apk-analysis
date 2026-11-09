package Ga;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f3210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Ff.c cVar) {
        super(cVar);
        this.f3210b = kVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f3209a = obj;
        this.f3211c |= Integer.MIN_VALUE;
        return this.f3210b.f(null, this);
    }
}
