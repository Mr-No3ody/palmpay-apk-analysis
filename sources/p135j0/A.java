package p135j0;

import Ff.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class A extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f37895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w0 f37896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f37898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f37899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37900f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(O o10, Continuation continuation) {
        super(continuation);
        this.f37899e = o10;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f37898d = obj;
        this.f37900f |= Integer.MIN_VALUE;
        return O.d(this.f37899e, false, this);
    }
}
