package Hb;

import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.credit.bean.ExtraThemeInfo;
import com.transsnet.palmpay.credit.bean.IconSize;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoButton;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoCard;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoNameArea;
import com.transsnet.palmpay.credit.bean.TitleFont;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hb.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0309k extends T1.b {
    static {
        new C0308j(null);
    }

    @Override // T1.b
    public final void b(BaseViewHolder helper, Object obj) {
        CornerRadius cornerRadius;
        ExtraThemeInfo extraThemeInfo;
        TitleFont titleFont;
        Float f10;
        ExtraThemeInfo extraThemeInfo2;
        String str;
        TitleFont titleFont2;
        Float f11;
        String str2;
        String str3;
        CornerRadius cornerRadius2;
        String str4;
        IconSize iconSize;
        ProductContentInfo item = (ProductContentInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        F6.d.h("FlexiItemProvider", 3, C0.G.o("convert >>> loanProduct=", item.loanProduct));
        helper.setGone(Ya.e.rtvFrozen, TextUtils.isEmpty(item.cardStatusTitle));
        helper.setGone(Ya.e.tvTitle, TextUtils.isEmpty(item.productSubTitle));
        helper.setText(Ya.e.rtvFrozen, item.cardStatusTitle);
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = helper.getBindingAdapter();
        Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
        boolean zD = ((Gb.O) bindingAdapter).f3254b.d();
        ImageView imageView = (ImageView) helper.getView(Ya.e.ivIcon);
        r0.l1(zD ? item.productIconDark : item.productIcon, imageView);
        int i7 = Ya.e.tvAmount;
        Long l5 = item.amount;
        helper.setText(i7, r0.V1(r0.B(l5 != null ? l5.longValue() : 0L, true)));
        helper.setGone(Ya.e.tvAmount, item.amount == null);
        helper.setText(Ya.e.tvTitle, item.productSubTitle);
        TextView textView = (TextView) helper.getView(Ya.e.tvExtraInfoTitle);
        if (textView != null && !TextUtils.isEmpty(item.applySubTitle)) {
            p220oa.h.f(textView, item.applySubTitle);
        }
        helper.setGone(Ya.e.tvExtraInfoTitle, TextUtils.isEmpty(item.applySubTitle));
        helper.setText(Ya.e.tvApply, item.button);
        helper.setGone(Ya.e.tvApply, TextUtils.isEmpty(item.button));
        helper.setGone(Ya.e.ivArrowRight, TextUtils.equals("calculating", item.status) || TextUtils.equals("needApply", item.status) || TextUtils.equals("assessment", item.status));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        p220oa.h.l(new ViewOnClickListenerC0299a(item, helper, 2), itemView);
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter2 = helper.getBindingAdapter();
        Intrinsics.f(bindingAdapter2, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
        ProductThemeInfo productThemeInfoC = ((Gb.O) bindingAdapter2).f3254b.c(item.style);
        if (productThemeInfoC != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            ProductThemeInfoNameArea productThemeInfoNameArea = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea != null && (iconSize = productThemeInfoNameArea.productIconSize) != null) {
                Float f12 = iconSize.height;
                if ((f12 != null ? f12.floatValue() : 0.0f) > 0.0f) {
                    Float f13 = iconSize.height;
                    layoutParams2.height = SizeUtils.dp2px(f13 != null ? f13.floatValue() : 0.0f);
                }
            }
            imageView.setLayoutParams(layoutParams2);
            LinearLayout linearLayout = (LinearLayout) helper.getView(Ya.e.rootFlexiView);
            if (linearLayout != null) {
                ProductThemeInfoCard productThemeInfoCard = productThemeInfoC.card;
                if (productThemeInfoCard != null && (str4 = productThemeInfoCard.bgImage) != null) {
                    r0.n1(linearLayout, str4);
                } else if (productThemeInfoCard != null && (str3 = productThemeInfoCard.bgColor) != null && (cornerRadius2 = productThemeInfoCard.cornerRadius) != null) {
                    linearLayout.setBackground(Eb.a.i(C1849p.c(str3), cornerRadius2, 0, -1));
                }
            }
            ProductThemeInfoNameArea productThemeInfoNameArea2 = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea2 != null && (str2 = productThemeInfoNameArea2.productSubTitleColor) != null) {
                helper.setTextColor(Ya.e.tvTitle, CommonViewExtKt.hexToColorInt(str2, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoNameArea productThemeInfoNameArea3 = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea3 != null && (titleFont2 = productThemeInfoNameArea3.productSubTitleFont) != null && (f11 = titleFont2.fontSize) != null) {
                ((TextView) helper.getView(Ya.e.tvTitle)).setTextSize(1, f11.floatValue());
            }
            ProductThemeInfoNameArea productThemeInfoNameArea4 = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea4 != null && (extraThemeInfo2 = productThemeInfoNameArea4.extraInfo) != null && (str = extraThemeInfo2.titleColor) != null) {
                helper.setTextColor(Ya.e.tvAmount, CommonViewExtKt.hexToColorInt(str, c(), L6.b.ppColorTextPrimary));
                helper.setTextColor(Ya.e.tvExtraInfoTitle, CommonViewExtKt.hexToColorInt(str, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoNameArea productThemeInfoNameArea5 = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea5 != null && (extraThemeInfo = productThemeInfoNameArea5.extraInfo) != null && (titleFont = extraThemeInfo.titleFont) != null && (f10 = titleFont.fontSize) != null) {
                float fFloatValue = f10.floatValue();
                ((TextView) helper.getView(Ya.e.tvAmount)).setTextSize(1, fFloatValue);
                ((TextView) helper.getView(Ya.e.tvExtraInfoTitle)).setTextSize(1, fFloatValue);
            }
            ProductThemeInfoButton productThemeInfoButton = productThemeInfoC.button;
            if (productThemeInfoButton != null) {
                TextView textView2 = (TextView) helper.getView(Ya.e.tvApply);
                List<String> list = productThemeInfoButton.bgColor;
                if (list != null && (cornerRadius = productThemeInfoButton.cornerRadius) != null) {
                    textView2.setBackground(Eb.a.i(list, cornerRadius, 0, -1));
                }
                if (TextUtils.isEmpty(productThemeInfoButton.titleColor)) {
                    return;
                }
                Context contextC = c();
                String str5 = productThemeInfoButton.titleColor;
                textView2.setTextColor(str5 != null ? CommonViewExtKt.hexToColorInt(str5, contextC, L6.b.ppColorTextPrimary) : -16777216);
            }
        }
    }

    @Override // T1.b
    public final int d() {
        return Gb.O.f3244d.getITEM_VIEW_TYPE_FLEXI();
    }

    @Override // T1.b
    public final int e() {
        return Ya.f.cs_cl_flexi_module_view;
    }
}
