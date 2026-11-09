package Qc;

import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.managemoney.api.ManageApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7674a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new F(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((F) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7674a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        this.f7674a = 1;
        Object objIsPopUpForTradeResultPage = manageApiService.isPopUpForTradeResultPage(TransType.TRANS_TYPE_CASH_BOX_DEPOSIT, "", this);
        return objIsPopUpForTradeResultPage == aVar ? aVar : objIsPopUpForTradeResultPage;
    }
}
