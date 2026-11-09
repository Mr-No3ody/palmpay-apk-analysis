package Xd;

import N8.C0463g;
import Pa.r0;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xd.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0787f extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11146a;

    public C0787f(boolean z3) {
        super(Pd.d.qt_item_coupon_in_list, null);
        this.f11146a = z3;
        addChildClickViewIds(Pd.c.icilUseTv, Pd.c.llDetailArrow);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BillerCouponItemBean couponItem = (BillerCouponItemBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(couponItem, "couponItem");
        holder.setGone(Pd.c.llExpand, true);
        SpanUtils fontSize = new SpanUtils().append("₦").setFontSize(SizeUtils.sp2px(14.0f));
        Long nominaValue = couponItem.getNominaValue();
        String strA = r0.A(nominaValue != null ? nominaValue.longValue() : 0L);
        Intrinsics.checkNotNullExpressionValue(strA, "getAmountString(...)");
        holder.setText(Pd.c.icilCouponAmount, fontSize.append(kotlin.text.y.k(strA, ".00", "")).setFontSize(CommonViewExtKt.getDp(24)).create());
        holder.setText(Pd.c.tvCouponName, couponItem.getCouponName());
        ImageView imageView = (ImageView) holder.getView(Pd.c.ivCouponIcon);
        if (TextUtils.isEmpty(couponItem.getCouponIcon())) {
            imageView.setImageResource(com.transsnet.palmpay.custom_view.r.cv_coupon_icon);
        } else {
            r0.h1(imageView, couponItem.getCouponIcon(), com.transsnet.palmpay.custom_view.r.cv_coupon_icon);
        }
        Long endTime = couponItem.getEndTime();
        if ((endTime != null ? endTime.longValue() : 0L) > 0) {
            Resources resources = getContext().getResources();
            int i7 = p025ba.k.core_valid_until;
            Long endTime2 = couponItem.getEndTime();
            String string = resources.getString(i7, r0.S(endTime2 != null ? endTime2.longValue() : 0L));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            holder.setText(Pd.c.dateCouponTv, string);
            holder.setGone(Pd.c.dateCouponTv, false);
        } else {
            holder.setGone(Pd.c.dateCouponTv, true);
        }
        if (TextUtils.isEmpty(couponItem.getCouponSubhead())) {
            holder.setGone(Pd.c.couponLimitTv, true);
        } else {
            holder.setGone(Pd.c.couponLimitTv, false);
            holder.setText(Pd.c.couponLimitTv, couponItem.getCouponSubhead());
        }
        if (TextUtils.isEmpty(couponItem.getCouponDesc())) {
            holder.setGone(Pd.c.llDetailArrow, true);
            holder.setGone(Pd.c.llExpand, true);
        } else {
            holder.setGone(Pd.c.llDetailArrow, false);
            holder.setText(Pd.c.tvCouponDesc, couponItem.getCouponDesc());
            int i10 = Pd.c.llExpand;
            Boolean layoutExpand = couponItem.getLayoutExpand();
            Boolean bool = Boolean.TRUE;
            holder.setGone(i10, true ^ Intrinsics.c(layoutExpand, bool));
            IconicsImageView iconicsImageView = (IconicsImageView) holder.getView(Pd.c.ivExpandArrow);
            IconicsDrawable iconicsDrawable = new IconicsDrawable(getContext(), Intrinsics.c(couponItem.getLayoutExpand(), bool) ? S6.a.pay_ArrowUp : S6.a.pay_Arrowdown);
            iconicsDrawable.a(new C0463g(this, 26));
            iconicsImageView.setIcon(iconicsDrawable);
        }
        if (TextUtils.isEmpty(couponItem.getStatus())) {
            holder.setText(Pd.c.icilUseTv, Pd.f.qt_claim);
        } else {
            holder.setText(Pd.c.icilUseTv, p025ba.k.core_use);
        }
        if (this.f11146a) {
            holder.setTextColor(Pd.c.icilUseTv, CommonViewExtKt.colorInt(L6.b.ppColorButtonTextWhite, getContext()));
        } else {
            holder.setTextColor(Pd.c.icilUseTv, CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext()));
        }
    }
}
