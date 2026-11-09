package p383zc;

import Ef.a;
import Ff.h;
import com.transsnet.palmpay.jara_packet.api.JaraPacketApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44641a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new g(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((g) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44641a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        JaraPacketApiService jaraPacketApiService = (JaraPacketApiService) p254qc.a.f41475a.f35518b;
        this.f44641a = 1;
        Object objQueryReferEarnHome = jaraPacketApiService.queryReferEarnHome(this);
        return objQueryReferEarnHome == aVar ? aVar : objQueryReferEarnHome;
    }
}
