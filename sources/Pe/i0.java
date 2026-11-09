package Pe;

import com.transsnet.palmpay.main.export.bean.req.PalmZoneTasksReq;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PalmZoneTasksReq f7259b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(PalmZoneTasksReq palmZoneTasksReq, Continuation continuation) {
        super(1, continuation);
        this.f7259b = palmZoneTasksReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new i0(this.f7259b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((i0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7258a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f7258a = 1;
        Object objQueryPalmZoneTasks = iApiMainService.queryPalmZoneTasks(this.f7259b, this);
        return objQueryPalmZoneTasks == aVar ? aVar : objQueryPalmZoneTasks;
    }
}
