package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Qc.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0568i extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f7773b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0568i(Boolean bool, Continuation continuation) {
        super(1, continuation);
        this.f7773b = bool;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0568i(this.f7773b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0568i) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7772a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        this.f7772a = 1;
        Object objCashCouponWriteOff = manageApiService.cashCouponWriteOff(this.f7773b, this);
        return objCashCouponWriteOff == aVar ? aVar : objCashCouponWriteOff;
    }
}
