package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferForBankUnstableListReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f5031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f5032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Integer num, Integer num2, int i7, Continuation continuation) {
        super(1, continuation);
        this.f5031b = num;
        this.f5032c = num2;
        this.f5033d = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new F(this.f5031b, this.f5032c, this.f5033d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((F) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5030a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        ScheduleTransferForBankUnstableListReq scheduleTransferForBankUnstableListReq = new ScheduleTransferForBankUnstableListReq();
        scheduleTransferForBankUnstableListReq.setCompletedYear(this.f5031b);
        scheduleTransferForBankUnstableListReq.setCompletedMonth(this.f5032c);
        scheduleTransferForBankUnstableListReq.pageNum = this.f5033d;
        scheduleTransferForBankUnstableListReq.pageSize = 10;
        this.f5030a = 1;
        Object bookTransferList = sendMoneyApiService.getBookTransferList(scheduleTransferForBankUnstableListReq, this);
        return bookTransferList == aVar ? aVar : bookTransferList;
    }
}
