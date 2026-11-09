package Fe;

import com.transsnet.palmpay.main.export.bean.req.PalmZoneTasksReq;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import com.transsnet.palmpay.util.TimeUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Fe.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0277z extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2826b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0277z(I i7, Continuation continuation) {
        super(1, continuation);
        this.f2826b = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0277z(this.f2826b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0277z) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2825a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        PalmZoneTasksReq palmZoneTasksReq = new PalmZoneTasksReq();
        palmZoneTasksReq.setPageNum(new Integer(1));
        palmZoneTasksReq.setPageSize(new Integer(1));
        palmZoneTasksReq.setMemberId(p367ya.a.d().i());
        palmZoneTasksReq.todayDisplay = !TimeUtils.isToday(p059e1.a.F("main_sp_close_rewards_center_time"));
        palmZoneTasksReq.taskCenterCacheClearFlag = this.f2826b.f2737e;
        this.f2825a = 1;
        Object objQueryHomeRewardTasks = iApiMainService.queryHomeRewardTasks(palmZoneTasksReq, this);
        return objQueryHomeRewardTasks == aVar ? aVar : objQueryHomeRewardTasks;
    }
}
