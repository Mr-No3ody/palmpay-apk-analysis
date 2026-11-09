package Kd;

import com.transsnet.palmpay.send_money.api.kkcar.IApiKkCarService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Kd.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0376g extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5256a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0376g(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0376g) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5256a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiKkCarService iApiKkCarService = (IApiKkCarService) p188md.a.f39647a.f139b;
        this.f5256a = 1;
        Object qrCodeConfig = iApiKkCarService.getQrCodeConfig(this);
        return qrCodeConfig == aVar ? aVar : qrCodeConfig;
    }
}
