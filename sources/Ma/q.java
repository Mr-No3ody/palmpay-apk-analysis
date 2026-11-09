package Ma;

import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f5915b = str;
        this.f5916c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new q(this.f5915b, this.f5916c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((q) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5914a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f5914a = 1;
        Object objCancelSafetyAssessmentQA = payApiService.cancelSafetyAssessmentQA(this.f5915b, this.f5916c, this);
        return objCancelSafetyAssessmentQA == aVar ? aVar : objCancelSafetyAssessmentQA;
    }
}
