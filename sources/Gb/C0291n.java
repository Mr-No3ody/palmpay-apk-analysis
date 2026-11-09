package Gb;

import Pa.r0;
import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.credit.bean.IconSize;
import com.transsnet.palmpay.credit.bean.KingKongContentInfo;
import com.transsnet.palmpay.credit.bean.KingKongThemeInfoButton;
import com.transsnet.palmpay.credit.bean.KingKongThemeInfoCard;
import com.transsnet.palmpay.credit.bean.KingkongThemeInfo;
import com.transsnet.palmpay.credit.view.KingKongContentInfoView;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Gb.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0291n extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KingKongContentInfoView f3289a;

    public C0291n(KingKongContentInfoView kingKongContentInfoView) {
        super(Ya.f.cs_cl_king_kong_item_view, null);
        this.f3289a = kingKongContentInfoView;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        KingKongThemeInfoButton kingKongThemeInfoButton;
        List<String> list;
        CornerRadius cornerRadius;
        IconSize iconSize;
        Float f10;
        IconSize iconSize2;
        Float f11;
        IconSize iconSize3;
        Float f12;
        IconSize iconSize4;
        Float f13;
        final KingKongContentInfo item = (KingKongContentInfo) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(Ya.e.tvTitle, item.title);
        TextView textView = (TextView) holder.getView(Ya.e.tvContent);
        if (textView != null) {
            textView.setText(Html.fromHtml(item.desc, 63));
        }
        ImageView imageView = (ImageView) holder.getView(Ya.e.ivBottomIcon);
        Context context = getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
        r0.l1(((BaseActivity) context).isDarkMode() ? item.imageDark : item.image, imageView);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = holder.getBindingAdapter();
        Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.KingKongContentInfoAdapter");
        KingKongContentInfoView kingKongContentInfoView = ((C0291n) bindingAdapter).f3289a;
        if (kingKongContentInfoView != null) {
            String str = item.style;
            if (str == null) {
                str = "normal";
            }
            KingkongThemeInfo kingkongThemeInfoA = kingKongContentInfoView.a(str);
            if (kingkongThemeInfoA != null) {
                KingKongThemeInfoCard kingKongThemeInfoCard = kingkongThemeInfoA.card;
                float fFloatValue = 0.0f;
                if (((kingKongThemeInfoCard == null || (iconSize4 = kingKongThemeInfoCard.iconSize) == null || (f13 = iconSize4.width) == null) ? 0.0f : f13.floatValue()) > 0.0f) {
                    KingKongThemeInfoCard kingKongThemeInfoCard2 = kingkongThemeInfoA.card;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = SizeUtils.dp2px((kingKongThemeInfoCard2 == null || (iconSize3 = kingKongThemeInfoCard2.iconSize) == null || (f12 = iconSize3.width) == null) ? 0.0f : f12.floatValue());
                }
                KingKongThemeInfoCard kingKongThemeInfoCard3 = kingkongThemeInfoA.card;
                if (((kingKongThemeInfoCard3 == null || (iconSize2 = kingKongThemeInfoCard3.iconSize) == null || (f11 = iconSize2.height) == null) ? 0.0f : f11.floatValue()) > 0.0f) {
                    KingKongThemeInfoCard kingKongThemeInfoCard4 = kingkongThemeInfoA.card;
                    if (kingKongThemeInfoCard4 != null && (iconSize = kingKongThemeInfoCard4.iconSize) != null && (f10 = iconSize.height) != null) {
                        fFloatValue = f10.floatValue();
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = SizeUtils.dp2px(fFloatValue);
                }
            }
        }
        imageView.setLayoutParams(layoutParams2);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener() { // from class: Gb.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        KingKongContentInfo kingKongContentInfo = item;
                        Pa.F.f(kingKongContentInfo.jumpPath, kingKongContentInfo.jumpType, kingKongContentInfo.jumpParams);
                        break;
                    default:
                        KingKongContentInfo kingKongContentInfo2 = item;
                        Pa.F.f(kingKongContentInfo2.jumpPath, kingKongContentInfo2.jumpType, kingKongContentInfo2.jumpParams);
                        break;
                }
            }
        }, itemView);
        PpButton ppButton = (PpButton) holder.getView(Ya.e.btnBottom);
        ppButton.setText(item.buttonContent);
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener() { // from class: Gb.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        KingKongContentInfo kingKongContentInfo = item;
                        Pa.F.f(kingKongContentInfo.jumpPath, kingKongContentInfo.jumpType, kingKongContentInfo.jumpParams);
                        break;
                    default:
                        KingKongContentInfo kingKongContentInfo2 = item;
                        Pa.F.f(kingKongContentInfo2.jumpPath, kingKongContentInfo2.jumpType, kingKongContentInfo2.jumpParams);
                        break;
                }
            }
        }, ppButton);
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter2 = holder.getBindingAdapter();
        Intrinsics.f(bindingAdapter2, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.KingKongContentInfoAdapter");
        KingKongContentInfoView kingKongContentInfoView2 = ((C0291n) bindingAdapter2).f3289a;
        if (kingKongContentInfoView2 != null) {
            String str2 = item.style;
            KingkongThemeInfo kingkongThemeInfoA2 = kingKongContentInfoView2.a(str2 != null ? str2 : "normal");
            if (kingkongThemeInfoA2 == null || (list = (kingKongThemeInfoButton = kingkongThemeInfoA2.button).bgColor) == null || (cornerRadius = kingKongThemeInfoButton.cornerRadius) == null) {
                return;
            }
            ppButton.setBackground(Eb.a.i(list, cornerRadius, 0, -1));
        }
    }
}
