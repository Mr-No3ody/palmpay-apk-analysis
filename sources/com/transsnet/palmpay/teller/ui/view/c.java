package com.transsnet.palmpay.teller.ui.view;

import com.transsnet.palmpay.teller.bean.resp.BannerWithCouponBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends M1.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f34376c;

    @Override // M1.d
    public final int c(int i7, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return "combo".equals(((BannerWithCouponBean) data.get(i7)).getClaimType()) ? ModelActivityBannerWithCoupon.f34320j.getTYPE_COUPON_PACKETAGE_ITEM() : ModelActivityBannerWithCoupon.f34320j.getTYPE_SINGLE_COUPON_ITEM();
    }
}
