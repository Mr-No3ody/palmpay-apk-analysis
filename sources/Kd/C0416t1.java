package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Kd.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0416t1 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f5383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0416t1(String str, String str2, Boolean bool, Continuation continuation) {
        super(1, continuation);
        this.f5381b = str;
        this.f5382c = str2;
        this.f5383d = bool;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0416t1(this.f5381b, this.f5382c, this.f5383d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0416t1) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5380a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        this.f5380a = 1;
        Object inputAmountBankDetail = sendMoneyApiService.getInputAmountBankDetail(this.f5381b, this.f5382c, this.f5383d, this);
        return inputAmountBankDetail == aVar ? aVar : inputAmountBankDetail;
    }
}
