package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Kd.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0405p1 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0405p1(String str, boolean z3, Continuation continuation) {
        super(1, continuation);
        this.f5352b = z3;
        this.f5353c = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0405p1(this.f5353c, this.f5352b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0405p1) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5351a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        this.f5351a = 1;
        Object objUpdateFavoriteMvvm = sendMoneyApiService.updateFavoriteMvvm(this.f5352b, this.f5353c, this);
        return objUpdateFavoriteMvvm == aVar ? aVar : objUpdateFavoriteMvvm;
    }
}
