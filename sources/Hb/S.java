package Hb;

import B6.ViewOnClickListenerC0087i;
import Pa.C0525w;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.credit.bean.ExtraThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoCard;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoNameArea;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoText;
import com.transsnet.palmpay.credit.bean.TitleFont;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends T1.b {
    static {
        new Q(null);
    }

    @Override // T1.b
    public final void b(BaseViewHolder helper, Object obj) {
        ProductThemeInfo productThemeInfo;
        ProductThemeInfoText productThemeInfoText;
        TitleFont titleFont;
        ProductThemeInfoNameArea productThemeInfoNameArea;
        ExtraThemeInfo extraThemeInfo;
        TitleFont titleFont2;
        ProductThemeInfoNameArea productThemeInfoNameArea2;
        TitleFont titleFont3;
        ProductThemeInfoCard productThemeInfoCard;
        ProductContentInfo item = (ProductContentInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        F6.d.h("SimpleLoanProductItemProvider", 3, C0.G.p("convert >>> loanProduct=", item.loanProduct, ", status=", item.status));
        ImageView imageView = (ImageView) helper.getView(Ya.e.ivIcon);
        TextView textView = (TextView) helper.getView(Ya.e.tvTitle);
        TextView textView2 = (TextView) helper.getView(Ya.e.tvSuffix);
        ImageView imageView2 = (ImageView) helper.getView(Ya.e.ivArrowRight);
        View view = helper.getView(Ya.e.viewRoot);
        RoundedTextView roundedTextView = (RoundedTextView) helper.getView(Ya.e.rtvFrozen);
        Context context = view.getContext();
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        String str = (baseActivity == null || !baseActivity.isDarkMode()) ? item.lightTheme : item.darkTheme;
        if (TextUtils.isEmpty(str)) {
            productThemeInfo = null;
        } else {
            try {
                C0525w.f().getClass();
                productThemeInfo = (ProductThemeInfo) C0525w.d(str, ProductThemeInfo.class);
            } catch (Exception e10) {
                F6.d.c("SimpleLoanProductItemProvider", e10);
                productThemeInfo = null;
            }
        }
        if (productThemeInfo != null && (productThemeInfoCard = productThemeInfo.card) != null) {
            productThemeInfoCard.applyBackground(view);
        }
        if (productThemeInfo != null && (productThemeInfoNameArea2 = productThemeInfo.nameArea) != null && (titleFont3 = productThemeInfoNameArea2.productTitleFont) != null) {
            titleFont3.applyTheme(textView);
        }
        boolean zEquals = TextUtils.equals("frozen", item.status);
        boolean z3 = TextUtils.equals("disable", item.status) || TextUtils.equals("frozen", item.status);
        if (z3) {
            helper.setGone(Ya.e.rtvFrozen, TextUtils.isEmpty(item.cardStatusTitle));
            helper.setText(Ya.e.rtvFrozen, item.cardStatusTitle);
            if (zEquals) {
                helper.setTextColorRes(Ya.e.rtvFrozen, L6.b.ppColorError);
                roundedTextView.setRoundedBorderColor(CommonViewExtKt.colorInt(L6.b.ppColorError, c()));
            }
        } else {
            helper.setGone(Ya.e.rtvFrozen, true);
            helper.setGone(Ya.e.rtvStatus, TextUtils.isEmpty(item.cardStatusTitle));
            helper.setText(Ya.e.rtvStatus, item.cardStatusTitle);
        }
        String str2 = item.productIcon;
        if (str2 == null && (str2 = item.applyIcon) == null) {
            str2 = item.extraInfoIcon;
        }
        r0.l1(str2, imageView);
        String str3 = item.productTitle;
        if (str3 == null && (str3 = item.loanProduct) == null) {
            str3 = "";
        }
        textView.setText(str3);
        String string = helper.itemView.getContext().getString(Ya.g.cs_loan_home_updating_limit);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        boolean z8 = TextUtils.equals("calculating", item.status) || TextUtils.equals("underReview", item.status) || TextUtils.equals("assessment", item.status);
        String str4 = item.button;
        if (str4 == null) {
            str4 = item.applyTitle;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str4);
        if (z8) {
            textView2.setText(string);
            textView2.setTextColor(helper.itemView.getContext().getColor(L6.b.ppColorTextAssist));
            imageView2.setVisibility(8);
        } else if (!TextUtils.equals("needApply", item.status) || zIsEmpty) {
            Long l5 = item.amount;
            if (l5 != null) {
                textView2.setText(r0.V1(r0.B(l5.longValue(), true)));
                textView2.setTextColor(helper.itemView.getContext().getColor(L6.b.ppColorTextPrimary));
                imageView2.setVisibility(0);
                if (productThemeInfo != null && (productThemeInfoText = productThemeInfo.text) != null && (titleFont = productThemeInfoText.amountTitleFont) != null) {
                    titleFont.applyTheme(textView2);
                }
            } else {
                textView2.setText(string);
                textView2.setTextColor(helper.itemView.getContext().getColor(L6.b.ppColorTextAssist));
                imageView2.setVisibility(8);
            }
        } else {
            textView2.setText(str4);
            textView2.setTextColor(helper.itemView.getContext().getColor(L6.b.ppColorFlexiCashPrimary));
            imageView2.setVisibility(0);
            if (productThemeInfo != null && (productThemeInfoNameArea = productThemeInfo.nameArea) != null && (extraThemeInfo = productThemeInfoNameArea.extraInfo) != null && (titleFont2 = extraThemeInfo.titleFont) != null) {
                titleFont2.applyTheme(textView2);
            }
        }
        float f10 = z3 ? 0.5f : 1.0f;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setAlpha(1.0f);
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                viewGroup.getChildAt(i7).setAlpha(f10);
            }
        } else {
            view.setAlpha(f10);
        }
        roundedTextView.setAlpha(1.0f);
        if (z3 || z8) {
            helper.itemView.setOnClickListener(null);
            helper.itemView.setClickable(false);
            helper.itemView.setFocusable(false);
        } else {
            View itemView = helper.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            p220oa.h.l(new ViewOnClickListenerC0087i(this, 12, item, helper), itemView);
        }
    }

    @Override // T1.b
    public final int d() {
        return Gb.O.f3244d.getITEM_VIEW_TYPE_SIMPLE_LOAN_PRODUCT();
    }

    @Override // T1.b
    public final int e() {
        return Ya.f.cs_cl_simple_loan_product_item_view;
    }
}
