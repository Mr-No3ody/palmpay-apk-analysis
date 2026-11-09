package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferSubOrderListReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Kd.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0392l0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0392l0(int i7, String str, Continuation continuation) {
        super(1, continuation);
        this.f5304b = i7;
        this.f5305c = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0392l0(this.f5304b, this.f5305c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0392l0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5303a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        ScheduleTransferSubOrderListReq scheduleTransferSubOrderListReq = new ScheduleTransferSubOrderListReq();
        scheduleTransferSubOrderListReq.pageNum = this.f5304b;
        scheduleTransferSubOrderListReq.setTaskNo(this.f5305c);
        this.f5303a = 1;
        Object objQueryScheduleTransferSubOrderListV2 = sendMoneyApiService.queryScheduleTransferSubOrderListV2(scheduleTransferSubOrderListReq, this);
        return objQueryScheduleTransferSubOrderListV2 == aVar ? aVar : objQueryScheduleTransferSubOrderListV2;
    }
}
