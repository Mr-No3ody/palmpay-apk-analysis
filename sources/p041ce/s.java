package p041ce;

import Bc.C0106c;
import C0.G;
import Ef.a;
import Ff.h;
import L6.b;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.e;
import Wf.AbstractC0780y;
import Wf.I;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.utils.executor.g;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.airbnb.lottie.LottieAnimationView;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.teller.bean.resp.CouponWithPointBean;
import com.transsnet.palmpay.teller.ui.view.ModelAvailableCouponAndPointItem;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p042cg.f;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f18965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelAvailableCouponAndPointItem f18966b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(CommonResult commonResult, Continuation continuation, ModelAvailableCouponAndPointItem modelAvailableCouponAndPointItem) {
        super(2, continuation);
        this.f18965a = commonResult;
        this.f18966b = modelAvailableCouponAndPointItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f18965a, continuation, this.f18966b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        T t;
        String strValueOf;
        final int i7 = 0;
        final int i10 = 1;
        a aVar = a.f2423a;
        g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f18965a;
        final ModelAvailableCouponAndPointItem modelAvailableCouponAndPointItem = this.f18966b;
        if (commonBeanResult == null || !commonBeanResult.isSuccess() || (t = commonBeanResult.data) == 0) {
            modelAvailableCouponAndPointItem.setVisibility(8);
        } else {
            CouponWithPointBean couponWithPointBean = (CouponWithPointBean) t;
            int i11 = ModelAvailableCouponAndPointItem.f34329i;
            modelAvailableCouponAndPointItem.setVisibility(0);
            C0106c c0106c = modelAvailableCouponAndPointItem.f34330c;
            if (c0106c != null) {
                ImageView imageView = (ImageView) c0106c.f670c;
                if (TextUtils.isEmpty(couponWithPointBean.getCouponIcon())) {
                    imageView.setImageResource(r.cv_coupon_star);
                } else {
                    r0.l1(couponWithPointBean.getCouponIcon(), imageView);
                }
            }
            if (c0106c != null) {
                p220oa.h.s((ImageView) c0106c.f674g, Intrinsics.c(couponWithPointBean.getIsUnclaimedPoint(), Boolean.TRUE));
            }
            if (c0106c != null) {
                p220oa.h.s((ImageView) c0106c.f671d, Intrinsics.c(couponWithPointBean.getIsUnclaimedCoupon(), Boolean.TRUE));
            }
            if (Intrinsics.c(couponWithPointBean.getIsUnclaimedCoupon(), Boolean.TRUE)) {
                SPUtils sPUtils = SPUtils.get();
                String strK = G.k();
                StringBuilder sb2 = new StringBuilder("lastShowTime_");
                String str = modelAvailableCouponAndPointItem.f34332e;
                long j6 = sPUtils.getLong(F.d(sb2, str, "_", strK), 0L);
                if (j6 == 0 || !TimeUtils.isToday(j6)) {
                    SPUtils.get().put(G.p("lastShowTime_", str, "_", G.k()), System.currentTimeMillis());
                    if (c0106c != null) {
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) c0106c.f678p;
                        p220oa.h.C(lottieAnimationView);
                        lottieAnimationView.setAnimation(i0.V(lottieAnimationView) ? e.qt_to_claim_dark : e.qt_to_claim_normal);
                        lottieAnimationView.e();
                    }
                } else if (c0106c != null) {
                    p220oa.h.c((LottieAnimationView) c0106c.f678p);
                }
            } else if (c0106c != null) {
                p220oa.h.c((LottieAnimationView) c0106c.f678p);
            }
            List<BillerCouponItemBean> couponList = couponWithPointBean.getCouponList();
            if ((couponList != null ? couponList.size() : 0) > 0) {
                Long point = couponWithPointBean.getPoint();
                if ((point != null ? point.longValue() : 0L) > 9999) {
                    strValueOf = "9999+";
                } else {
                    Long point2 = couponWithPointBean.getPoint();
                    strValueOf = String.valueOf(point2 != null ? point2.longValue() : 0L);
                }
                if (c0106c != null) {
                    ((TextView) c0106c.f672e).setText(strValueOf);
                }
                List<BillerCouponItemBean> couponList2 = couponWithPointBean.getCouponList();
                Integer couponCount = couponWithPointBean.getCouponCount();
                modelAvailableCouponAndPointItem.d(couponCount != null ? couponCount.intValue() : 0, couponList2);
            } else if (c0106c != null) {
                TextView textView = (TextView) c0106c.f672e;
                SpanUtils spanUtils = new SpanUtils();
                Long point3 = couponWithPointBean.getPoint();
                textView.setText(spanUtils.append(String.valueOf(point3 != null ? point3.longValue() : 0L)).append(" Cashback available").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, modelAvailableCouponAndPointItem.getContext())).create());
            }
            if (c0106c != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0106c.f676j;
                List<BillerCouponItemBean> couponList3 = couponWithPointBean.getCouponList();
                p220oa.h.s(constraintLayout, (couponList3 != null ? couponList3.size() : 0) > 0);
            }
            if (c0106c != null) {
                LinearLayout linearLayout = (LinearLayout) c0106c.f675i;
                Long point4 = couponWithPointBean.getPoint();
                p220oa.h.s(linearLayout, (point4 != null ? point4.longValue() : 0L) > 0);
            }
            if (c0106c != null) {
                ((ConstraintLayout) c0106c.f676j).setOnClickListener(new View.OnClickListener() { // from class: ce.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ModelAvailableCouponAndPointItem modelAvailableCouponAndPointItem2 = modelAvailableCouponAndPointItem;
                        switch (i7) {
                            case 0:
                                int i12 = ModelAvailableCouponAndPointItem.f34329i;
                                if (!r0.U0()) {
                                    o oVar = new o(0);
                                    if (BaseApplication.hasLogin()) {
                                        modelAvailableCouponAndPointItem2.c(true);
                                        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(modelAvailableCouponAndPointItem2);
                                        f fVar = I.f10809a;
                                        AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new r(null, modelAvailableCouponAndPointItem2, oVar), 2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                int i13 = ModelAvailableCouponAndPointItem.f34329i;
                                if (!r0.U0()) {
                                    n0.g().k(new ClickEvent("PalmPay_ModelActivityBannerWithPoint").add("transType", modelAvailableCouponAndPointItem2.f34332e));
                                    d.x(null, "PointHome");
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            if (c0106c != null) {
                ((LinearLayout) c0106c.f675i).setOnClickListener(new View.OnClickListener() { // from class: ce.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ModelAvailableCouponAndPointItem modelAvailableCouponAndPointItem2 = modelAvailableCouponAndPointItem;
                        switch (i10) {
                            case 0:
                                int i12 = ModelAvailableCouponAndPointItem.f34329i;
                                if (!r0.U0()) {
                                    o oVar = new o(0);
                                    if (BaseApplication.hasLogin()) {
                                        modelAvailableCouponAndPointItem2.c(true);
                                        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(modelAvailableCouponAndPointItem2);
                                        f fVar = I.f10809a;
                                        AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new r(null, modelAvailableCouponAndPointItem2, oVar), 2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                int i13 = ModelAvailableCouponAndPointItem.f34329i;
                                if (!r0.U0()) {
                                    n0.g().k(new ClickEvent("PalmPay_ModelActivityBannerWithPoint").add("transType", modelAvailableCouponAndPointItem2.f34332e));
                                    d.x(null, "PointHome");
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            n0.g().u(new ViewEvent("ModelAvailableCouponAndPointItem").add("transType", modelAvailableCouponAndPointItem.f34332e));
        }
        return Unit.f38893a;
    }
}
