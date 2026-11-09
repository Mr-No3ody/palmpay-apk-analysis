package p135j0;

import Ff.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.F;

/* JADX INFO: renamed from: j0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1778k extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f38076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f38077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f38078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F f38079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public O f38080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f38081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1779l f38082g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38083i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1778k(C1779l c1779l, Continuation continuation) {
        super(continuation);
        this.f38082g = c1779l;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38081f = obj;
        this.f38083i |= Integer.MIN_VALUE;
        return this.f38082g.updateData(null, this);
    }
}
