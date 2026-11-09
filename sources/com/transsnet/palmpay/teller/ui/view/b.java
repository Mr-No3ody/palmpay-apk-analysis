package com.transsnet.palmpay.teller.ui.view;

import N8.q0;
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
import io.fastkv.n;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p041ce.i;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends T1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f34372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f34373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ModelActivityBannerWithCoupon f34374g;

    public b(ModelActivityBannerWithCoupon modelActivityBannerWithCoupon, i getIsDark, i getItemClick) {
        Intrinsics.checkNotNullParameter(getIsDark, "getIsDark");
        Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
        this.f34374g = modelActivityBannerWithCoupon;
        this.f34372e = getIsDark;
        this.f34373f = getItemClick;
        a(Pd.c.layoutCouponCL);
    }

    @Override // T1.b
    public final void b(BaseViewHolder holder, Object obj) {
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
            h.n(textView, iHexToColorInt, CommonViewExtKt.getDp(16), null, null, 124);
        }
        TextView textView2 = (TextView) holder.getViewOrNull(Pd.c.tvCouponName);
        if (textView2 != null) {
            h.n(textView2, iE, 0.0f, new float[]{0.0f, 0.0f, 0.0f, 0.0f, CommonViewExtKt.getDp(4), CommonViewExtKt.getDp(4), CommonViewExtKt.getDp(4), CommonViewExtKt.getDp(4)}, null, 122);
        }
        if (textView2 != null) {
            textView2.setTextColor(iHexToColorInt);
        }
        DashedLineView dashedLineView = (DashedLineView) holder.getViewOrNull(Pd.c.dlvCoupon);
        if (dashedLineView != null) {
            dashedLineView.setDashColor(iHexToColorInt);
        }
        ImageView imageView2 = (ImageView) holder.getViewOrNull(Pd.c.ivIcon);
        String lightImage = (!((Boolean) this.f34372e.invoke()).booleanValue() || TextUtils.isEmpty(item.getDarkImage())) ? item.getLightImage() : item.getDarkImage();
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
        holder.setText(Pd.c.tvCouponAmount, fontSize.append(String.valueOf((nominaValue != null ? nominaValue.longValue() : 0L) / ((long) 100))).create());
        holder.setTextColor(Pd.c.tvCouponAmount, iHexToColorInt);
        int i7 = Pd.c.tvCouponName;
        String couponName = item.getCouponName();
        if (couponName == null) {
            couponName = "";
        }
        holder.setText(i7, couponName);
        if (!TextUtils.isEmpty(item.getStatus())) {
            holder.setText(Pd.c.tvStatus, k.core_use);
            return;
        }
        int i10 = Pd.c.tvStatus;
        String strM = n.m(f.qt_claim, this.f34374g);
        String couponNumber = item.getCouponNumber();
        if (couponNumber == null) {
            couponNumber = "0";
        }
        holder.setText(i10, q0.l(strM, "(", couponNumber, ")"));
    }

    @Override // T1.b
    public final int d() {
        return ModelActivityBannerWithCoupon.f34320j.getTYPE_COUPON_PACKETAGE_ITEM();
    }

    @Override // T1.b
    public final int e() {
        return Pd.d.qt_layout_banner_with_couponp_package;
    }

    @Override // T1.b
    public final void f(BaseViewHolder helper, View view, Object obj, int i7) {
        a aVar;
        BannerWithCouponBean data = (BannerWithCouponBean) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        if (view.getId() != Pd.c.layoutCouponCL || (aVar = this.f34373f.f18945b.f34376c) == null) {
            return;
        }
        aVar.onCouponPackageItemClick(i7);
    }
}
