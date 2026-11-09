package p041ce;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: renamed from: ce.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1283e extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f18931a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1283e(Continuation continuation, Throwable th) {
        super(2, continuation);
        this.f18931a = th;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1283e(continuation, this.f18931a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1283e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.W(this.f18931a);
        return Unit.f38893a;
    }
}
