package t9;

import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.load.resource.bitmap.z;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SizeUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends T1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42362e;

    public g(boolean z3) {
        this.f42362e = z3;
    }

    @Override // T1.b
    public final void b(BaseViewHolder holder, Object obj) {
        String shortName;
        BettingBillerListItemBean bettingBillerListItemBean;
        BettingBillerListItemBean bean = (BettingBillerListItemBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(bean, "bean");
        TextView textView = (TextView) holder.getViewOrNull(Pd.c.qlbb_name);
        ImageView imageView = (ImageView) holder.getViewOrNull(Pd.c.company_img);
        ImageView imageView2 = (ImageView) holder.getViewOrNull(Pd.c.qlbb_icon);
        String institutionLogo = bean.getInstitutionLogo();
        if (TextUtils.isEmpty(institutionLogo)) {
            institutionLogo = null;
        }
        if (institutionLogo == null) {
            institutionLogo = bean.getBillerIcon();
        }
        if (imageView != null) {
            if (TextUtils.isEmpty(institutionLogo)) {
                Context contextC = c();
                com.bumptech.glide.b.c(contextC).c(contextC).load(Integer.valueOf(Pd.b.qt_icon_default_biller_history)).a(new G1.d().I(new z(CommonViewExtKt.getDp(4)), true)).S(imageView);
            } else {
                r0.j1(imageView, institutionLogo, (G1.d) ((G1.d) ((G1.d) new G1.d().j(Pd.b.qt_icon_default_biller_history)).x(Pd.b.qt_icon_default_biller_history)).H(new z(SizeUtils.dp2px(4.0f))));
            }
        }
        String str = "";
        if (!TextUtils.isEmpty(bean.getShortName()) ? (shortName = bean.getShortName()) != null : (shortName = bean.getBillerName()) != null) {
            str = shortName;
        }
        if (textView != null) {
            textView.setText(str);
        }
        String str2 = p070ee.c.f36289a;
        Integer status = bean.getStatus();
        p070ee.c.j(status != null ? status.intValue() : 0, textView);
        holder.setGone(Pd.c.qlbb_coupon_iv, !Intrinsics.c(bean.getHasCoupon(), Boolean.TRUE));
        WeakReference weakReference = this.f8937b;
        M1.d dVar = weakReference == null ? null : (M1.d) weakReference.get();
        i iVar = dVar instanceof i ? (i) dVar : null;
        if (iVar != null && (bettingBillerListItemBean = iVar.f42363b) != null) {
            holder.setGone(Pd.c.qlbb_hook_iv, !Intrinsics.c(bettingBillerListItemBean.getBillerId(), bean.getBillerId()));
        }
        if (imageView2 != null) {
            String billerLabelPicture = (TextUtils.isEmpty(bean.getBillerLabelDarkPicture()) || !this.f42362e) ? bean.getBillerLabelPicture() : bean.getBillerLabelDarkPicture();
            if (billerLabelPicture == null || billerLabelPicture.length() <= 0) {
                p220oa.h.s(imageView2, false);
            } else {
                p220oa.h.s(imageView2, true);
                r0.i1(imageView2, billerLabelPicture, Integer.MIN_VALUE, CommonViewExtKt.getDp(14));
            }
        }
    }

    @Override // T1.b
    public final int d() {
        return 1;
    }

    @Override // T1.b
    public final int e() {
        return Pd.d.qt_layout_betting_biller_list_item;
    }
}
