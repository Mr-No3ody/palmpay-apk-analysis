package com.transsnet.palmpay.teller.ui.view;

import Pa.r0;
import Pd.f;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.load.resource.bitmap.z;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.DashedLineView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.resp.BannerWithCouponBean;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p041ce.i;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends T1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f34377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f34378f;

    public d(i getIsDark, i getItemClick) {
        Intrinsics.checkNotNullParameter(getIsDark, "getIsDark");
        Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
        this.f34377e = getIsDark;
        this.f34378f = getItemClick;
        a(Pd.c.layoutCouponCL);
    }

    @Override // T1.b
    public final void b(BaseViewHolder holder, Object obj) {
        int i7;
        BannerWithCouponBean item = (BannerWithCouponBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) holder.getViewOrNull(Pd.c.ivCouponBg);
        String couponColor = item.getCouponColor();
        int iHexToColorInt = couponColor != null ? CommonViewExtKt.hexToColorInt(couponColor, c(), L6.b.ppColorPrimary) : CommonViewExtKt.colorInt(L6.b.ppColorPrimary, c());
        int iE = androidx.core.graphics.d.e(iHexToColorInt, 51);
        if (imageView != null) {
            h.n(imageView, iE, CommonViewExtKt.getDp(8), null, null, 124);
        }
        TextView textView = (TextView) holder.getViewOrNull(Pd.c.tvStatus);
        if (textView != null) {
            i7 = iHexToColorInt;
            h.n(textView, i7, CommonViewExtKt.getDp(16), null, null, 124);
        } else {
            i7 = iHexToColorInt;
        }
        DashedLineView dashedLineView = (DashedLineView) holder.getViewOrNull(Pd.c.dlvCoupon);
        if (dashedLineView != null) {
            dashedLineView.setDashColor(i7);
        }
        ImageView imageView2 = (ImageView) holder.getViewOrNull(Pd.c.ivIcon);
        String lightImage = (!((Boolean) this.f34377e.invoke()).booleanValue() || TextUtils.isEmpty(item.getDarkImage())) ? item.getLightImage() : item.getDarkImage();
        if (!TextUtils.isEmpty(lightImage)) {
            r0.j1(imageView2, lightImage, (G1.d) ((G1.d) new G1.d().w(Integer.MIN_VALUE, CommonViewExtKt.getDp(88))).H(new z(CommonViewExtKt.getDp(8))));
        }
        Long claimId = item.getClaimId();
        if ((claimId != null ? claimId.longValue() : 0L) == 0 || !Intrinsics.c(item.getShowCoupon(), Boolean.TRUE)) {
            holder.setGone(Pd.c.layoutCouponCL, true);
            holder.setGone(Pd.c.groupCoupon, true);
            return;
        }
        holder.setGone(Pd.c.layoutCouponCL, false);
        holder.setGone(Pd.c.groupCoupon, false);
        SpanUtils fontSize = new SpanUtils().append(BaseApplication.getCurrencySymbol()).setFontSize(CommonViewExtKt.getDp(12));
        Long nominaValue = item.getNominaValue();
        holder.setText(Pd.c.tvCouponAmount, fontSize.append(r0.E(nominaValue != null ? nominaValue.longValue() : 0L)).create());
        int i10 = Pd.c.tvOperatorName;
        String couponName = item.getCouponName();
        if (couponName == null) {
            couponName = "";
        }
        holder.setText(i10, couponName);
        if (TextUtils.isEmpty(item.getStatus())) {
            holder.setText(Pd.c.tvStatus, f.qt_claim);
        } else {
            holder.setText(Pd.c.tvStatus, k.core_use);
        }
    }

    @Override // T1.b
    public final int d() {
        return ModelActivityBannerWithCoupon.f34320j.getTYPE_SINGLE_COUPON_ITEM();
    }

    @Override // T1.b
    public final int e() {
        return Pd.d.qt_layout_banner_with_coupon_item;
    }

    @Override // T1.b
    public final void f(BaseViewHolder helper, View view, Object obj, int i7) {
        a aVar;
        BannerWithCouponBean data = (BannerWithCouponBean) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        if (view.getId() != Pd.c.layoutCouponCL || (aVar = this.f34378f.f18945b.f34376c) == null) {
            return;
        }
        aVar.onSingleCouponItemClick(i7);
    }
}
