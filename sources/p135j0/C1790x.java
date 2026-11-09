package p135j0;

import Ff.c;
import p072eg.e;

/* JADX INFO: renamed from: j0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1790x extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f38164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f38165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f38167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790x(O o10, c cVar) {
        super(cVar);
        this.f38167d = o10;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38166c = obj;
        this.f38168e |= Integer.MIN_VALUE;
        return O.c(this.f38167d, this);
    }
}
