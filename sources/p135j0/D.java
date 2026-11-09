package p135j0;

import Ff.c;
import java.io.Serializable;
import kotlin.jvm.internal.F;

/* JADX INFO: loaded from: classes.dex */
public final class D extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f37912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f37913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f37914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F f37915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f37918g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O f37919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37920j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(O o10, c cVar) {
        super(cVar);
        this.f37919i = o10;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f37918g = obj;
        this.f37920j |= Integer.MIN_VALUE;
        return O.e(this.f37919i, false, this);
    }
}
