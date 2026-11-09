package p328ve;

import Ac.e;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.rsp.LifeBillHomeGroupBean;
import com.transsnet.palmpay.core.bean.rsp.LifeBillHomeItemBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends M1.k {
    @Override // M1.k
    public final void b(BaseViewHolder header, SectionEntity entityItem) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(entityItem, "entityItem");
        LifeBillHomeGroupBean lifeBillHomeGroupBean = (LifeBillHomeGroupBean) entityItem;
        getItemPosition(lifeBillHomeGroupBean);
        ((TextView) header.getView(e.tv_title)).setText(lifeBillHomeGroupBean.getTitle());
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
        if (!TextUtils.isEmpty(lifeBillHomeItemBean.subIcon)) {
            r0.l1(lifeBillHomeItemBean.subIcon, imageView2);
        }
        if (TextUtils.isEmpty(lifeBillHomeItemBean.menuDesc)) {
            holder.setGone(e.mllb_desc_tv, true);
        } else {
            holder.setGone(e.mllb_desc_tv, false);
            holder.setText(e.mllb_desc_tv, lifeBillHomeItemBean.menuDesc);
        }
    }
}
