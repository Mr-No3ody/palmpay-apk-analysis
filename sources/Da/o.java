package Da;

import Pa.i0;
import com.transsnet.palmpay.core.ui.activity.PPRNActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends Ff.h implements Function2 {
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        try {
            i0.K(null, null);
            ActivityUtils.finishActivity((Class<?>) PPRNActivity.class);
        } catch (Exception unused) {
        }
        return Unit.f38893a;
    }
}
