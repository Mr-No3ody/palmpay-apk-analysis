package p146je;

import Ef.a;
import Ff.h;
import Pe.C0544p;
import Wf.D;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.bean.CouponPackageOrderBean;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.ui.activity.coupon.CouponPackageResultActivity;
import com.transsnet.palmpay.viewmodule.CouponPackageViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CouponPackageResultActivity f38594b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CouponPackageResultActivity couponPackageResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f38594b = couponPackageResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f38594b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f38593a;
        CouponPackageResultActivity couponPackageResultActivity = this.f38594b;
        if (i7 == 0) {
            g.M(obj);
            long j6 = couponPackageResultActivity.f34667f;
            this.f38593a = 1;
            if (D.b(j6, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        PayByOrderResp.DataBean dataBean = couponPackageResultActivity.f34664c;
        if (dataBean != null) {
            CheckPayReq checkPayReq = new CheckPayReq();
            checkPayReq.payId = dataBean.payId;
            checkPayReq.subPayId = dataBean.subPayId;
            CouponPackageOrderBean couponPackageOrderBean = couponPackageResultActivity.f34665d;
            checkPayReq.orderNo = couponPackageOrderBean != null ? couponPackageOrderBean.orderNo : null;
            checkPayReq.transType = couponPackageOrderBean != null ? couponPackageOrderBean.transType : null;
            checkPayReq.endFlag = false;
            CouponPackageViewModel couponPackageViewModel = (CouponPackageViewModel) couponPackageResultActivity.l();
            couponPackageViewModel.getClass();
            f.s(couponPackageViewModel, new C0544p(checkPayReq, null), couponPackageViewModel.f35362e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        return Unit.f38893a;
    }
}
