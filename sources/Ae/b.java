package Ae;

import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f267a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f267a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f267a = 1;
        Object objUpdateAutoTransferConfig = iApiMainService.updateAutoTransferConfig(1, "homepage_pop", this);
        return objUpdateAutoTransferConfig == aVar ? aVar : objUpdateAutoTransferConfig;
    }
}
