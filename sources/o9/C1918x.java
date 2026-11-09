package o9;

import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o9.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1918x extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40241a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1918x(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1918x) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40241a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f40241a = 1;
        Object objQueryBillCommonConfig = iApiTellerService.queryBillCommonConfig("04", this);
        return objQueryBillCommonConfig == aVar ? aVar : objQueryBillCommonConfig;
    }
}
