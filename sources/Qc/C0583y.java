package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Qc.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0583y extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7843b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0583y(String str, Continuation continuation) {
        super(1, continuation);
        this.f7843b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0583y(this.f7843b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0583y) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7842a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        this.f7842a = 1;
        Object interestDetail = manageApiService.getInterestDetail(this.f7843b, this);
        return interestDetail == aVar ? aVar : interestDetail;
    }
}
