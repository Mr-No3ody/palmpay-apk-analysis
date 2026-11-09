package Pe;

import com.transsnet.palmpay.core.network.PayApiService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Pe.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0542n extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7275b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0542n(ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f7275b = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0542n(this.f7275b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0542n) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7274a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f7274a = 1;
        Object objEditBillPayment = payApiService.editBillPayment(this.f7275b, this);
        return objEditBillPayment == aVar ? aVar : objEditBillPayment;
    }
}
