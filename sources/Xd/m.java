package Xd;

import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11161a;

    public m(String str) {
        super(Pd.d.qt_layout_dialog_pick_biller_list_item, null);
        this.f11161a = str;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BillerListItemBean bean = (BillerListItemBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(bean, "bean");
        if (TextUtils.isEmpty(bean.getInstitutionLogo())) {
            ((ImageView) holder.getView(Pd.c.iv_biller_icon)).setImageResource(com.transsnet.palmpay.custom_view.r.cv_palmpay_logo_7);
        } else {
            r0.j1((ImageView) holder.getView(Pd.c.iv_biller_icon), bean.getInstitutionLogo(), (G1.d) ((G1.d) ((G1.d) new G1.d().j(com.transsnet.palmpay.custom_view.r.cv_palmpay_logo_7)).x(com.transsnet.palmpay.custom_view.r.cv_palmpay_logo_7)).H(new com.bumptech.glide.load.resource.bitmap.z(CommonViewExtKt.getDp(4))));
        }
        String billerName = TextUtils.isEmpty(bean.getShortName()) ? bean.getBillerName() : bean.getShortName();
        TextView textView = (TextView) holder.getView(Pd.c.tv_biller_name);
        if (textView != null) {
            textView.setText(billerName);
        }
        String str = p070ee.c.f36289a;
        Integer status = bean.getStatus();
        p070ee.c.j(status != null ? status.intValue() : 0, textView);
        View view = holder.itemView;
        Integer status2 = bean.getStatus();
        view.setAlpha((status2 != null && 1 == status2.intValue()) ? 1.0f : 0.5f);
        if (Intrinsics.c(bean.getHasCoupon(), Boolean.TRUE)) {
            holder.setGone(Pd.c.iv_coupon_star, false);
        } else {
            holder.setGone(Pd.c.iv_coupon_star, true);
        }
        String str2 = this.f11161a;
        if (!"2".equals(str2) && !"1".equals(str2)) {
            if (TextUtils.isEmpty(bean.getRemark())) {
                holder.setGone(Pd.c.iv_cashback, true);
                return;
            } else {
                holder.setGone(Pd.c.iv_cashback, false);
                holder.setText(Pd.c.iv_cashback, bean.getRemark());
                return;
            }
        }
        if (TextUtils.isEmpty(bean.getBillerTips())) {
            holder.setGone(Pd.c.iv_cashback, true);
        } else {
            holder.setGone(Pd.c.iv_cashback, false);
            holder.setText(Pd.c.iv_cashback, bean.getBillerTips());
        }
        if (!TextUtils.isEmpty(bean.getBillerLable())) {
            r0.l1(bean.getBillerLable(), (ImageView) holder.getView(Pd.c.iv_label));
        }
        Unit unit = Unit.f38893a;
    }
}
