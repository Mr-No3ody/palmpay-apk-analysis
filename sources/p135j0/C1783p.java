package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: j0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1783p extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38115a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1783p c1783p = new C1783p(2, continuation);
        c1783p.f38115a = obj;
        return c1783p;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1783p) create((w0) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        return Boolean.valueOf(!(((w0) this.f38115a) instanceof C1768a0));
    }
}
