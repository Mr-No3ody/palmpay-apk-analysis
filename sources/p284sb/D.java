package p284sb;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f42116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayShopPaymentResultActivity f42117b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(PayShopPaymentResultActivity payShopPaymentResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f42117b = payShopPaymentResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        D d2 = new D(this.f42117b, continuation);
        d2.f42116a = obj;
        return d2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        AbstractC0780y.m((CoroutineScope) this.f42116a, null, null, new C(this.f42117b, null), 3);
        return Unit.f38893a;
    }
}
