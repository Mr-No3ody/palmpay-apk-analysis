package p085fd;

import Ef.a;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36459a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new h(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((h) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36459a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f36459a = 1;
        Object r2CHomeInfo = iAirtimeService.getR2CHomeInfo(this);
        return r2CHomeInfo == aVar ? aVar : r2CHomeInfo;
    }
}
