package V8;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends Ff.h implements Function2 {
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        try {
            if (BaseApplication.hasLogin()) {
                org.greenrobot.eventbus.c.b().f(new MessageEvent(4));
            }
        } catch (Exception unused) {
        }
        return Unit.f38893a;
    }
}
