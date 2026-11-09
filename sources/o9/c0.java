package o9;

import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f40166b = str;
        this.f40167c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new c0(this.f40166b, this.f40167c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((c0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40165a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f40165a = 1;
        Object objQueryScheduleRecommendIdByBillerId = iAirtimeService.queryScheduleRecommendIdByBillerId(this.f40166b, this.f40167c, this);
        return objQueryScheduleRecommendIdByBillerId == aVar ? aVar : objQueryScheduleRecommendIdByBillerId;
    }
}
