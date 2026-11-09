package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class T0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(String str, Continuation continuation) {
        super(1, continuation);
        this.f5139b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new T0(this.f5139b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((T0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5138a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        this.f5138a = 1;
        Object objClickRecentlyScheduleTransfer = sendMoneyApiService.clickRecentlyScheduleTransfer(this.f5139b, this);
        return objClickRecentlyScheduleTransfer == aVar ? aVar : objClickRecentlyScheduleTransfer;
    }
}
