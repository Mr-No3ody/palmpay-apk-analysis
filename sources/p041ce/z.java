package p041ce;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Throwable f18982a;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z zVar = new z(3, (Continuation) obj3);
        zVar.f18982a = (Throwable) obj2;
        return zVar.invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.W(this.f18982a);
        return Unit.f38893a;
    }
}
