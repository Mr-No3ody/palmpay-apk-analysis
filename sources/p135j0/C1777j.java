package p135j0;

import Ff.c;
import O2.a;

/* JADX INFO: renamed from: j0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1777j extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f38059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f38061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1777j(a aVar, c cVar) {
        super(cVar);
        this.f38061c = aVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38060b = obj;
        this.f38062d |= Integer.MIN_VALUE;
        return this.f38061c.c(this);
    }
}
