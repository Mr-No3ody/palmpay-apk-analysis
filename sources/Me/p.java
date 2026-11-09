package Me;

import Bc.E;
import com.palmpay.lib.ui.button.PpButton;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f5991a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, Continuation continuation) {
        super(2, continuation);
        this.f5991a = rVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f5991a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        PpButton ppButton;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        E e10 = this.f5991a.f5999g;
        if (e10 == null || (ppButton = (PpButton) e10.f634Q) == null) {
            return null;
        }
        ppButton.b(false);
        return Unit.f38893a;
    }
}
