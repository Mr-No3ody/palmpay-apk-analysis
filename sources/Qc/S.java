package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.GetTrialIncomeTaxReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f7703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f7704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f7706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Long l5, Long l6, String str, Long l8, Continuation continuation) {
        super(1, continuation);
        this.f7703b = l5;
        this.f7704c = l6;
        this.f7705d = str;
        this.f7706e = l8;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new S(this.f7703b, this.f7704c, this.f7705d, this.f7706e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((S) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7702a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        GetTrialIncomeTaxReq getTrialIncomeTaxReq = new GetTrialIncomeTaxReq(this.f7703b, this.f7704c, this.f7705d, this.f7706e);
        this.f7702a = 1;
        Object trialIncomeTax = manageApiService.getTrialIncomeTax(getTrialIncomeTaxReq, this);
        return trialIncomeTax == aVar ? aVar : trialIncomeTax;
    }
}
