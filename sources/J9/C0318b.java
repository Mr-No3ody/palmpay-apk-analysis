package J9;

import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: J9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0318b extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4570a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0318b(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0318b) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4570a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        Integer num = new Integer(2);
        this.f4570a = 1;
        Object objQueryCashBoxTrialCash = payApiService.queryCashBoxTrialCash(num, this);
        return objQueryCashBoxTrialCash == aVar ? aVar : objQueryCashBoxTrialCash;
    }
}
