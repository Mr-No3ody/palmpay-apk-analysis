package Xa;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f11063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicInteger f11064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicInteger f11065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AtomicInteger f11066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f11067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f11068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11069g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, Ff.c cVar) {
        super(cVar);
        this.f11068f = iVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f11067e = obj;
        this.f11069g |= Integer.MIN_VALUE;
        return this.f11068f.d(null, null, this);
    }
}
