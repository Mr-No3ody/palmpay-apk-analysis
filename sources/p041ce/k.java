package p041ce;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f18947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelActivityBannerWithCoupon f18948b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CommonResult commonResult, Continuation continuation, ModelActivityBannerWithCoupon modelActivityBannerWithCoupon) {
        super(2, continuation);
        this.f18947a = commonResult;
        this.f18948b = modelActivityBannerWithCoupon;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f18947a, continuation, this.f18948b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        CommonListResultV2 commonListResultV2 = (CommonListResultV2) this.f18947a;
        if (commonListResultV2.isSuccess()) {
            this.f18948b.g(commonListResultV2);
        }
        return Unit.f38893a;
    }
}
