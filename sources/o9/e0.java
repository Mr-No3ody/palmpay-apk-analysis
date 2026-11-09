package o9;

import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40174b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String str, Continuation continuation) {
        super(1, continuation);
        this.f40174b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new e0(this.f40174b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40173a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f40173a = 1;
        Object objQueryScheduleTopUpAuthorizeInfo = iAirtimeService.queryScheduleTopUpAuthorizeInfo(this.f40174b, this);
        return objQueryScheduleTopUpAuthorizeInfo == aVar ? aVar : objQueryScheduleTopUpAuthorizeInfo;
    }
}
