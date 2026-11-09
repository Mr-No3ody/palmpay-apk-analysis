package p130ic;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.teller.bean.AddAutoRenewTaskReq;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ic.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1748c extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddAutoRenewTaskReq f37499b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1748c(AddAutoRenewTaskReq addAutoRenewTaskReq, Continuation continuation) {
        super(1, continuation);
        this.f37499b = addAutoRenewTaskReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1748c(this.f37499b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1748c) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f37498a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f37498a = 1;
        Object objAddScheduleTask = iApiTellerService.addScheduleTask(this.f37499b, this);
        return objAddScheduleTask == aVar ? aVar : objAddScheduleTask;
    }
}
