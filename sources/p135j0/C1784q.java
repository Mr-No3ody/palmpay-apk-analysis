package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: j0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1784q extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f38119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784q(w0 w0Var, Continuation continuation) {
        super(2, continuation);
        this.f38119b = w0Var;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1784q c1784q = new C1784q(this.f38119b, continuation);
        c1784q.f38118a = obj;
        return c1784q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1784q) create((w0) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        w0 w0Var = (w0) this.f38118a;
        return Boolean.valueOf((w0Var instanceof C1769b) && w0Var.f38163a <= this.f38119b.f38163a);
    }
}
