package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.EditStateReq;
import com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Qc.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0571l extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetBeforeOrderResp.StateInfo f7789b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0571l(GetBeforeOrderResp.StateInfo stateInfo, Continuation continuation) {
        super(1, continuation);
        this.f7789b = stateInfo;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0571l(this.f7789b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0571l) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7788a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        String strK = C0.G.k();
        GetBeforeOrderResp.StateInfo stateInfo = this.f7789b;
        EditStateReq editStateReq = new EditStateReq(strK, stateInfo != null ? stateInfo.getStateCode() : null, stateInfo != null ? stateInfo.getStateName() : null, 0, 8, null);
        this.f7788a = 1;
        Object objEditState = manageApiService.editState(editStateReq, this);
        return objEditState == aVar ? aVar : objEditState;
    }
}
