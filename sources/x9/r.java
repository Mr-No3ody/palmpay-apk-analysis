package x9;

import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f43702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f43702b = str;
        this.f43703c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new r(this.f43702b, this.f43703c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((r) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f43701a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f43701a = 1;
        Object objQueryCustomerIdByNew = iApiTellerService.queryCustomerIdByNew(this.f43702b, this.f43703c, this);
        return objQueryCustomerIdByNew == aVar ? aVar : objQueryCustomerIdByNew;
    }
}
