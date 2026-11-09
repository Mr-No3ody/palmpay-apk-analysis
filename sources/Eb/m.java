package Eb;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f2285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f2287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a aVar, Ff.c cVar) {
        super(cVar);
        this.f2287c = aVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f2286b = obj;
        this.f2288d |= Integer.MIN_VALUE;
        return this.f2287c.r(null, this);
    }
}
