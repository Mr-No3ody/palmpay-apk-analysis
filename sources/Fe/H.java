package Fe;

import com.transsnet.palmpay.core.bean.req.GetMsgByTypeReq;
import com.transsnet.palmpay.core.bean.req.QueryUnReadMsgCntReq;
import com.transsnet.palmpay.main.export.bean.req.QueryHomeBusinessReq;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2734a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new H(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((H) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2734a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        QueryHomeBusinessReq queryHomeBusinessReq = new QueryHomeBusinessReq("3", "4");
        GetMsgByTypeReq getMsgByTypeReq = new GetMsgByTypeReq();
        getMsgByTypeReq.pageNum = 1;
        getMsgByTypeReq.pageSize = 5;
        queryHomeBusinessReq.msgByRuleReq = getMsgByTypeReq;
        queryHomeBusinessReq.msgUnReadReq = new QueryUnReadMsgCntReq();
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f2734a = 1;
        Object objQueryHomeData3 = iApiMainService.queryHomeData3(queryHomeBusinessReq, this);
        return objQueryHomeData3 == aVar ? aVar : objQueryHomeData3;
    }
}
