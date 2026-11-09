package t9;

import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.load.resource.bitmap.z;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42359a;

    public d(boolean z3) {
        super(Pd.d.qt_item_betting_recent_bill, null);
        this.f42359a = z3;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BettingBillerListItemBean item = (BettingBillerListItemBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) holder.getView(Pd.c.ivRecentBill);
        String institutionLogo = item.getInstitutionLogo();
        if (institutionLogo == null) {
            institutionLogo = "";
        }
        r0.j1(imageView, institutionLogo, (G1.d) ((G1.d) ((G1.d) new G1.d().j(r.cv_palmpay_logo_7)).x(r.cv_palmpay_logo_7)).H(new z(CommonViewExtKt.getDp(4))));
        holder.setText(Pd.c.tvRecentBill, TextUtils.isEmpty(item.getShortName()) ? item.getBillerName() : item.getShortName());
        Integer status = item.getStatus();
        float f10 = (status != null && 1 == status.intValue()) ? 1.0f : 0.5f;
        ((TextView) holder.getView(Pd.c.tvRecentBill)).setAlpha(f10);
        ((ImageView) holder.getView(Pd.c.ivRecentBill)).setAlpha(f10);
        ImageView imageView2 = (ImageView) holder.getView(Pd.c.ivRemark);
        if (imageView2 != null) {
            String billerLabelPicture = (TextUtils.isEmpty(item.getBillerLabelDarkPicture()) || !this.f42359a) ? item.getBillerLabelPicture() : item.getBillerLabelDarkPicture();
            if (billerLabelPicture == null || billerLabelPicture.length() <= 0) {
                p220oa.h.s(imageView2, false);
            } else {
                p220oa.h.s(imageView2, true);
                r0.i1(imageView2, billerLabelPicture, Integer.MIN_VALUE, CommonViewExtKt.getDp(14));
            }
        }
    }
}
