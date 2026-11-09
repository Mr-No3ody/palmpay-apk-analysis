package Jb;

import com.transsnet.palmpay.credit.bean.req.CLInitReq;
import com.transsnet.palmpay.credit.bean.req.OcRouterReq;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.CLInitResp;
import com.transsnet.palmpay.credit.bean.resp.OcRouterResp;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.viewmodel.OcApplyBaseViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Jb.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0348g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CLInitResp f4735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OcRouterReq f4737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OcApplyBaseViewModel f4738d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0348g(OcRouterReq ocRouterReq, OcApplyBaseViewModel ocApplyBaseViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4737c = ocRouterReq;
        this.f4738d = ocApplyBaseViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0348g(this.f4737c, this.f4738d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0348g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object objClInitApplyV2;
        Object routerListV2;
        CLInitResp cLInitResp;
        CLInitData data;
        String applyId;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4736b;
        OcApplyBaseViewModel ocApplyBaseViewModel = this.f4738d;
        OcRouterReq ocRouterReq = this.f4737c;
        com.transsnet.palmpay.core.base.l lVar = ocApplyBaseViewModel.t;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                CLInitReq cLInitReq = new CLInitReq("OTHER", ocRouterReq.getLoanProduct(), ocRouterReq.getApplySource(), null, ocRouterReq.getHadLock(), null, 32, null);
                p221ob.c.f40268a.getInstance().getClass();
                IApiCreditService iApiCreditServiceA = p221ob.c.a();
                this.f4736b = 1;
                objClInitApplyV2 = iApiCreditServiceA.clInitApplyV2(cLInitReq, this);
                if (objClInitApplyV2 == aVar) {
                }
                return aVar;
            }
            if (i7 == 1) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                objClInitApplyV2 = obj;
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cLInitResp = this.f4735a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                routerListV2 = obj;
            }
            OcRouterResp ocRouterResp = (OcRouterResp) routerListV2;
            com.transsnet.palmpay.core.base.l lVar2 = ocApplyBaseViewModel.f30903v;
            data = cLInitResp.getData();
            if (data != null || (applyId = data.getApplyId()) == null) {
                applyId = "";
            }
            lVar2.i(applyId);
            org.chromium.support_lib_boundary.util.b.B(lVar, ocRouterResp);
            return Unit.f38893a;
            CLInitResp cLInitResp2 = (CLInitResp) objClInitApplyV2;
            if (cLInitResp2.isSuccess()) {
                p221ob.c.f40268a.getInstance().getClass();
                IApiCreditService iApiCreditServiceA2 = p221ob.c.a();
                this.f4735a = cLInitResp2;
                this.f4736b = 2;
                routerListV2 = iApiCreditServiceA2.getRouterListV2(ocRouterReq, this);
                if (routerListV2 != aVar) {
                    cLInitResp = cLInitResp2;
                    OcRouterResp ocRouterResp2 = (OcRouterResp) routerListV2;
                    com.transsnet.palmpay.core.base.l lVar3 = ocApplyBaseViewModel.f30903v;
                    data = cLInitResp.getData();
                    if (data != null) {
                        applyId = "";
                    } else {
                        applyId = "";
                    }
                    lVar3.i(applyId);
                    org.chromium.support_lib_boundary.util.b.B(lVar, ocRouterResp2);
                }
                return aVar;
            }
            OcRouterResp ocRouterResp3 = new OcRouterResp(null);
            ocRouterResp3.setRespCode(cLInitResp2.getRespCode());
            ocRouterResp3.setRespMsg(cLInitResp2.getRespMsg());
            org.chromium.support_lib_boundary.util.b.B(lVar, ocRouterResp3);
        } catch (Exception e10) {
            org.chromium.support_lib_boundary.util.b.D(lVar, e10);
        }
        return Unit.f38893a;
    }
}
