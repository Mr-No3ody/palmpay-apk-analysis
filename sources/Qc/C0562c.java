package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.OpenCashBoxAccountReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Qc.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0562c extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7735a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0562c(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0562c) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7735a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        OpenCashBoxAccountReq openCashBoxAccountReq = new OpenCashBoxAccountReq(C0.G.k());
        this.f7735a = 1;
        Object objOpenCashBoxAccount = manageApiService.openCashBoxAccount(openCashBoxAccountReq, this);
        return objOpenCashBoxAccount == aVar ? aVar : objOpenCashBoxAccount;
    }
}
