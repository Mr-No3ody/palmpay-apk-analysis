package Xd;

import Pa.r0;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        Integer numValueOf;
        TvListByCategoryIdResp.TvItemChildBean item = (TvListByCategoryIdResp.TvItemChildBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) holder.getView(Pd.c.tv_item_desc);
        int color = getContext().getColor(L6.b.ppColorTextPrimary);
        int color2 = getContext().getColor(L6.b.ppColorTextNormal);
        if (!TextUtils.isEmpty(item.getFontColor())) {
            try {
                color = Color.parseColor(item.getFontColor());
                color2 = color;
            } catch (Exception unused) {
            }
        }
        ((TextView) holder.getView(Pd.c.tv_item_name)).setTextColor(color);
        ((TextView) holder.getView(Pd.c.tv_amount)).setTextColor(color);
        textView.setTextColor(color);
        SpanUtils spanUtils = new SpanUtils();
        String itemName = item.getItemName();
        if (itemName == null) {
            itemName = "";
        }
        holder.setText(Pd.c.tv_item_name, spanUtils.append(itemName).setFontSize(ScreenUtils.dip2px(16.0f)).setFontFamily("sans-serif-medium").setForegroundColor(color).append(TextUtils.isEmpty(item.getItemNameSuffix()) ? "" : C0.G.o("/", item.getItemNameSuffix())).setFontSize(ScreenUtils.dip2px(12.0f)).setForegroundColor(color2).setFontFamily("sans-serif").create());
        if (Intrinsics.c(item.isAmountFixed(), Boolean.TRUE)) {
            int i7 = Pd.c.tv_amount;
            Long price = item.getPrice();
            holder.setText(i7, r0.C(r0.E(price != null ? price.longValue() : 0L), false));
            holder.setGone(Pd.c.iv_arrow_right, true);
        } else {
            holder.setText(Pd.c.tv_amount, getContext().getString(p025ba.k.core_enter_amount));
            holder.setGone(Pd.c.iv_arrow_right, false);
        }
        int color3 = getContext().getColor(L6.b.ppColorSuccess);
        try {
            if (!TextUtils.isEmpty(item.getColor())) {
                color3 = Color.parseColor(item.getColor());
            }
        } catch (Exception unused2) {
            color3 = getContext().getColor(L6.b.ppColorSuccess);
        }
        int i10 = color3;
        TextView textView2 = (TextView) holder.getView(Pd.c.tv_activity_icon);
        if (TextUtils.isEmpty(item.getItemCategory())) {
            p220oa.h.s(textView2, false);
        } else {
            p220oa.h.s(textView2, true);
            textView2.setText(item.getItemCategory());
            ScreenUtils.dip2px(4.0f);
            p220oa.h.n(textView2, i10, CommonViewExtKt.getDp(4), null, null, 124);
        }
        String remark = item.getRemark();
        if (remark == null || remark.length() == 0) {
            holder.setGone(Pd.c.tv_cashback, true);
        } else {
            holder.setGone(Pd.c.tv_cashback, false);
            holder.setText(Pd.c.tv_cashback, item.getRemark());
        }
        String viewDoc = item.getViewDoc();
        if (viewDoc == null || viewDoc.length() == 0) {
            holder.setGone(Pd.c.tv_item_desc, true);
        } else {
            holder.setGone(Pd.c.tv_item_desc, false);
            holder.setText(Pd.c.tv_item_desc, item.getViewDoc());
        }
        if (TextUtils.isEmpty(item.getBackgroundColor())) {
            numValueOf = null;
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(item.getBackgroundColor()));
            } catch (Exception unused3) {
                numValueOf = null;
            }
        }
        ImageView imageView = (ImageView) holder.getView(Pd.c.iv_item_view_bg);
        if (TextUtils.isEmpty(item.getViewPic())) {
            imageView.setBackgroundColor(getContext().getResources().getColor(R.color.transparent));
            imageView.setImageDrawable(null);
            p220oa.h.s(imageView, false);
        } else {
            p220oa.h.s(imageView, true);
            if (numValueOf != null) {
                p220oa.h.n(imageView, numValueOf.intValue(), CommonViewExtKt.getDp(9.0f), null, null, 124);
            }
            r0.j1(imageView, item.getViewPic(), (G1.d) ((G1.d) ((G1.d) new G1.d().j(Pd.b.qt_default_tv_list_item_icon)).x(Pd.b.qt_default_tv_list_item_icon)).H(new com.bumptech.glide.load.resource.bitmap.z(CommonViewExtKt.getDp(8))));
        }
        if (numValueOf != null) {
            textView.setBackgroundTintList(ColorStateList.valueOf(numValueOf.intValue()));
        } else {
            textView.setBackgroundTintList(null);
        }
        if (Intrinsics.c(item.getSuspend(), Boolean.TRUE)) {
            holder.itemView.setAlpha(0.5f);
        } else {
            holder.itemView.setAlpha(1.0f);
        }
    }
}
