package p328ve;

import Ac.d;
import Ac.e;
import M1.k;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.rsp.LifeBillHomeGroupBean;
import com.transsnet.palmpay.core.bean.rsp.LifeBillHomeItemBean;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43183b;

    @Override // M1.k
    public final void b(BaseViewHolder header, SectionEntity entityItem) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(entityItem, "entityItem");
        LifeBillHomeGroupBean lifeBillHomeGroupBean = (LifeBillHomeGroupBean) entityItem;
        int itemPosition = getItemPosition(lifeBillHomeGroupBean);
        TextView textView = (TextView) header.getView(e.tv_title);
        if (itemPosition == 0) {
            textView.setPadding(0, 0, 0, 0);
        } else {
            textView.setPadding(0, ScreenUtils.dip2px(26.0f), 0, 0);
        }
        textView.setText(lifeBillHomeGroupBean.getTitle());
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        SectionEntity entityItem = (SectionEntity) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(entityItem, "entityItem");
        LifeBillHomeItemBean lifeBillHomeItemBean = (LifeBillHomeItemBean) entityItem;
        holder.setText(e.mllb_menu_name_tv, lifeBillHomeItemBean.menuName);
        ImageView imageView = (ImageView) holder.getView(e.mllb_icon_iv);
        ImageView imageView2 = (ImageView) holder.getView(e.mllb_corner_icon_iv);
        r0.l1(lifeBillHomeItemBean.iconUrlBig, imageView);
        if (this.f43183b) {
            imageView2.setImageResource(d.main_item_edit_billpayment_icon);
        } else {
            imageView2.setImageResource(d.main_item_edit_billpayment_icon_unable);
        }
        if (TextUtils.isEmpty(lifeBillHomeItemBean.menuDesc)) {
            holder.setGone(e.mllb_desc_tv, true);
        } else {
            holder.setGone(e.mllb_desc_tv, false);
            holder.setText(e.mllb_desc_tv, lifeBillHomeItemBean.menuDesc);
        }
    }
}
