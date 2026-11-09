package o9;

import com.transsnet.palmpay.airtime.bean.req.AddScheduleTopUpTaskReq;
import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddScheduleTopUpTaskReq f40127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(AddScheduleTopUpTaskReq addScheduleTopUpTaskReq, Continuation continuation) {
        super(1, continuation);
        this.f40127b = addScheduleTopUpTaskReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new N(this.f40127b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((N) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40126a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f40126a = 1;
        Object objCheckNetworkValidation = iAirtimeService.checkNetworkValidation(this.f40127b, this);
        return objCheckNetworkValidation == aVar ? aVar : objCheckNetworkValidation;
    }
}
