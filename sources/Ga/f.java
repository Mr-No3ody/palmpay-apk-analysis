package Ga;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f3201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Ff.c cVar) {
        super(cVar);
        this.f3201b = kVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f3200a = obj;
        this.f3202c |= Integer.MIN_VALUE;
        return k.a(this.f3201b, this);
    }
}
