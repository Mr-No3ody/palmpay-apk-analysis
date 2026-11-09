package p173ld;

import Jd.c;
import M1.b;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.send_money.bean.resp.PosterAccountBean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p025ba.k;
import p159kd.d;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends b {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        PosterAccountBean item = (PosterAccountBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 0) {
            r0.h1((ImageView) holder.getView(p159kd.e.iv_empty), r0.y0("/sm_ic_bg_pay_me_empty.png"), d.sm_ic_bg_pay_me_empty);
            return;
        }
        if (itemViewType != 1) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        ((RecyclerView.LayoutParams) layoutParams).setMargins(holder.getAdapterPosition() == 0 ? DensityUtil.dp2px(16.0f) : 0, 0, 0, 0);
        int i7 = p159kd.e.tv_title;
        Integer accountType = item.getAccountType();
        String str = "Pay Me Number";
        if ((accountType == null || accountType.intValue() != 1) && (accountType == null || accountType.intValue() != 2)) {
            str = "PalmPay Account Number";
        }
        holder.setText(i7, str);
        int i10 = p159kd.e.tv_download;
        Integer accountType2 = item.getAccountType();
        holder.setText(i10, (accountType2 != null && accountType2.intValue() == 0) ? getContext().getString(k.core_share) : getContext().getString(k.core_download));
        ImageView imageView = (ImageView) holder.getView(p159kd.e.iv_account);
        Context context = getContext();
        String strO = i0.o(item.getMappingAccountNo());
        Intrinsics.checkNotNullExpressionValue(strO, "getAccountWithSpace(...)");
        String strK = y.k(strO, " ", "-");
        String accountName = item.getAccountName();
        if (accountName == null) {
            accountName = "";
        }
        imageView.setImageBitmap(c.f(context, strK, accountName));
    }
}
