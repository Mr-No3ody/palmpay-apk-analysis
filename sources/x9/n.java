package x9;

import com.transsnet.palmpay.teller.business.IApiTellerService;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43689a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new n(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((n) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f43689a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        String displayName = TimeZone.getDefault().getDisplayName(false, 0);
        Intrinsics.checkNotNullExpressionValue(displayName, "getCurrentTimeZone(...)");
        this.f43689a = 1;
        Object objBettingRaceSchedule = iApiTellerService.bettingRaceSchedule(displayName, this);
        return objBettingRaceSchedule == aVar ? aVar : objBettingRaceSchedule;
    }
}
