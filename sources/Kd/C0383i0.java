package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Kd.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0383i0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5276a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0383i0(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0383i0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5276a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        this.f5276a = 1;
        Object objQueryScheduleTransferHome = sendMoneyApiService.queryScheduleTransferHome(this);
        return objQueryScheduleTransferHome == aVar ? aVar : objQueryScheduleTransferHome;
    }
}
