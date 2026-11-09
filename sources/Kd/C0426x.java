package Kd;

import com.transsnet.palmpay.core.bean.req.ConfigReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Kd.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0426x extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConfigReq f5400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0426x(ConfigReq configReq, Continuation continuation) {
        super(1, continuation);
        this.f5400b = configReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0426x(this.f5400b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0426x) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5399a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f5399a = 1;
        Object objQueryCodePlateConfig = payApiService.queryCodePlateConfig(this.f5400b, this);
        return objQueryCodePlateConfig == aVar ? aVar : objQueryCodePlateConfig;
    }
}
