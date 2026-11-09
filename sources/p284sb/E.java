package p284sb;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayShopPaymentResultActivity f42118a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(PayShopPaymentResultActivity payShopPaymentResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f42118a = payShopPaymentResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new E(this.f42118a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        return Unit.f38893a;
    }
}
