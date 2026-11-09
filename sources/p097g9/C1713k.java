package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1713k extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36969a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1713k(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1713k) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36969a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f36969a = 1;
        Object objUpdateAutoTransferConfig = iApiMainService.updateAutoTransferConfig(1, GetCustomerServiceUrlReq.ENTER_TYPE_SIGNUP, this);
        return objUpdateAutoTransferConfig == aVar ? aVar : objUpdateAutoTransferConfig;
    }
}
