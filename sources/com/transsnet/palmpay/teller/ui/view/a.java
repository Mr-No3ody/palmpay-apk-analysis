package com.transsnet.palmpay.teller.ui.view;

import Pa.n0;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.teller.bean.resp.BannerWithCouponBean;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import p041ce.C1281c;
import p041ce.g;
import p041ce.h;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ModelActivityBannerWithCoupon.OnCouponClickLister {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModelActivityBannerWithCoupon f34370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f34371b;

    public a(ModelActivityBannerWithCoupon modelActivityBannerWithCoupon, Context context) {
        this.f34370a = modelActivityBannerWithCoupon;
        this.f34371b = context;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon.OnCouponClickLister
    public final void onCouponPackageItemClick(int i7) {
        int i10 = 0;
        ModelActivityBannerWithCoupon lifecycleOwner = this.f34370a;
        BannerWithCouponBean bannerWithCouponBean = (BannerWithCouponBean) lifecycleOwner.getMAdapter().getItem(i7);
        n0.g().n("ModelActivityBannerWithCoupon_Claim", G.g(new Pair("claimId", bannerWithCouponBean != null ? bannerWithCouponBean.getClaimId() : null), new Pair("transType", lifecycleOwner.f34327g)));
        ?? r10 = lifecycleOwner.f34323c;
        if (r10 != 0) {
            r10.invoke(Boolean.TRUE);
        }
        Long claimId = bannerWithCouponBean.getClaimId();
        String str = lifecycleOwner.f34327g;
        if (str == null) {
            str = "";
        }
        String transType = str;
        g onSuccess = new g(lifecycleOwner, this.f34371b, i10);
        h onError = new h(lifecycleOwner, i10);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(transType, "transType");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        String memberId = BaseApplication.get().getUser().getMemberId();
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(lifecycleOwner);
        f fVar = I.f10809a;
        lifecycleOwner.addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new p041ce.f(null, claimId, memberId, transType, onSuccess, onError), 2));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon.OnCouponClickLister
    public final void onSingleCouponItemClick(int i7) {
        int i10 = 1;
        ModelActivityBannerWithCoupon lifecycleOwner = this.f34370a;
        BannerWithCouponBean bannerWithCouponBean = (BannerWithCouponBean) lifecycleOwner.getMAdapter().getItem(i7);
        if (!TextUtils.isEmpty(bannerWithCouponBean.getStatus())) {
            n0.g().n("ModelActivityBannerWithCoupon_Use", G.g(new Pair("couponCode", bannerWithCouponBean.getCouponCode()), new Pair("transType", lifecycleOwner.f34327g)));
            BillerCouponClickListener mListener = lifecycleOwner.getMListener();
            if (mListener != null) {
                List<String> institutionIdList = bannerWithCouponBean.getInstitutionIdList();
                Long limitAmt = bannerWithCouponBean.getLimitAmt();
                mListener.onCouponUseClick(institutionIdList, limitAmt != null ? limitAmt.longValue() : 0L);
                return;
            }
            return;
        }
        n0.g().n("ModelActivityBannerWithCoupon_Claim", G.g(new Pair("claimId", bannerWithCouponBean.getClaimId()), new Pair("transType", lifecycleOwner.f34327g)));
        ?? r3 = lifecycleOwner.f34323c;
        if (r3 != 0) {
            r3.invoke(Boolean.TRUE);
        }
        Long claimId = bannerWithCouponBean.getClaimId();
        g onSuccess = new g(lifecycleOwner, this.f34371b, i10);
        h onError = new h(lifecycleOwner, i10);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        String memberId = BaseApplication.get().getUser().getMemberId();
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(lifecycleOwner);
        f fVar = I.f10809a;
        lifecycleOwner.addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new C1281c(null, claimId, memberId, onSuccess, onError), 2));
    }
}
