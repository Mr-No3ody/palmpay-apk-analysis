package p135j0;

import Ff.c;
import p072eg.e;

/* JADX INFO: renamed from: j0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1787u extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f38147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f38148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f38150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787u(O o10, c cVar) {
        super(cVar);
        this.f38150d = o10;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38149c = obj;
        this.f38151e |= Integer.MIN_VALUE;
        return O.a(this.f38150d, this);
    }
}
