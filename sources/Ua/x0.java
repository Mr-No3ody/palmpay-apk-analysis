package Ua;

import com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f9505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderResultRewardModel f9506b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Throwable th, Continuation continuation, OrderResultRewardModel orderResultRewardModel) {
        super(2, continuation);
        this.f9505a = th;
        this.f9506b = orderResultRewardModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new x0(this.f9505a, continuation, this.f9506b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ToastUtils.showShort(org.chromium.support_lib_boundary.util.b.W(this.f9505a), new Object[0]);
        p220oa.h.c(this.f9506b);
        return Unit.f38893a;
    }
}
