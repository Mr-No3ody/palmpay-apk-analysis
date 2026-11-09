package p135j0;

import Ff.c;

/* JADX INFO: renamed from: j0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1792z extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f38173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f38176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38177e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1792z(O o10, c cVar) {
        super(cVar);
        this.f38176d = o10;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38175c = obj;
        this.f38177e |= Integer.MIN_VALUE;
        return this.f38176d.g(this);
    }
}
