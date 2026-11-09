package p135j0;

import Ff.c;
import Wf.C0769m;

/* JADX INFO: renamed from: j0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1789w extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f38157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O f38158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0769m f38159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f38161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38162f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789w(O o10, c cVar) {
        super(cVar);
        this.f38161e = o10;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38160d = obj;
        this.f38162f |= Integer.MIN_VALUE;
        return O.b(this.f38161e, null, this);
    }
}
