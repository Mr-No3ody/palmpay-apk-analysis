package Ua;

import com.transsnet.palmpay.core.viewmodel.ModelClaimCouponItemView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelClaimCouponItemView f9351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(ModelClaimCouponItemView modelClaimCouponItemView, Continuation continuation) {
        super(2, continuation);
        this.f9351b = modelClaimCouponItemView;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new L(this.f9351b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f9350a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            this.f9350a = 1;
            if (Wf.D.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        int i10 = ModelClaimCouponItemView.t;
        this.f9351b.d(false);
        return Unit.f38893a;
    }
}
