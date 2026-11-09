package p204nb;

import Ff.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f39890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f39892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f39893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q qVar, Continuation continuation) {
        super(continuation);
        this.f39893d = qVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39892c = obj;
        this.f39894e |= Integer.MIN_VALUE;
        return this.f39893d.b(null, this);
    }
}
