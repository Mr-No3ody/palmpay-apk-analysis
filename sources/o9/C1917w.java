package o9;

import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o9.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1917w extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1917w(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f40239b = str;
        this.f40240c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1917w(this.f40239b, this.f40240c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1917w) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40238a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f40238a = 1;
        Object objQueryAvailableCoupon = iApiTellerService.queryAvailableCoupon(this.f40239b, this.f40240c, "04", this);
        return objQueryAvailableCoupon == aVar ? aVar : objQueryAvailableCoupon;
    }
}
