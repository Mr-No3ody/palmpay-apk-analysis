package o9;

import com.transsnet.palmpay.airtime.bean.req.EditScheduleTopUpTaskReq;
import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class Q extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditScheduleTopUpTaskReq f40133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(EditScheduleTopUpTaskReq editScheduleTopUpTaskReq, Continuation continuation) {
        super(1, continuation);
        this.f40133b = editScheduleTopUpTaskReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new Q(this.f40133b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Q) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40132a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f40132a = 1;
        Object objEditScheduleTask = iAirtimeService.editScheduleTask(this.f40133b, this);
        return objEditScheduleTask == aVar ? aVar : objEditScheduleTask;
    }
}
