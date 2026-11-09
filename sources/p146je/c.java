package p146je;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.ui.activity.coupon.CouponPackageResultActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CouponPackageResultActivity f38596b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CouponPackageResultActivity couponPackageResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f38596b = couponPackageResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f38596b, continuation);
        cVar.f38595a = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        AbstractC0780y.m((CoroutineScope) this.f38595a, null, null, new b(this.f38596b, null), 3);
        return Unit.f38893a;
    }
}
