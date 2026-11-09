package Hb;

import Pa.r0;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.credit.bean.IconSize;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoButton;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoCard;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoNameArea;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoText;
import com.transsnet.palmpay.credit.bean.TitleFont;
import com.transsnet.palmpay.credit.bean.TopArea;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends T1.b {
    static {
        new I(null);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:97:0x023c  */
    @Override // T1.b
    public final void b(BaseViewHolder holder, Object obj) {
        TextView textView;
        CornerRadius cornerRadius;
        TextView textView2;
        String str;
        TitleFont titleFont;
        Float f10;
        String str2;
        TitleFont titleFont2;
        Float f11;
        String str3;
        TitleFont titleFont3;
        Float f12;
        TitleFont titleFont4;
        Float f13;
        String str4;
        TitleFont titleFont5;
        Float f14;
        String str5;
        TitleFont titleFont6;
        Float f15;
        String str6;
        TopArea topArea;
        String str7;
        TopArea topArea2;
        String str8;
        String str9;
        CornerRadius cornerRadius2;
        TopArea topArea3;
        TopArea topArea4;
        IconSize iconSize;
        ProductContentInfo item = (ProductContentInfo) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        F6.d.h("MultipleCashLoanItemProvider", 3, C0.G.o("convert >>> loanProduct=", item.loanProduct));
        ImageView imageView = (ImageView) holder.getView(Ya.e.ivInstallmentLoan);
        TextView textView3 = (TextView) holder.getView(Ya.e.tvLoanTerms);
        SingleAdView singleAdView = (SingleAdView) holder.getView(Ya.e.viewAdRight);
        org.chromium.support_lib_boundary.util.b.c(singleAdView);
        singleAdView.setSlotId(item.advertisementId);
        Space space = (Space) holder.getView(Ya.e.topSpace);
        if (space != null) {
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = SizeUtils.dp2px(TextUtils.isEmpty(item.topTitle) ? 12.0f : 40.0f);
            space.setLayoutParams(layoutParams2);
        }
        holder.setGone(Ya.e.tvLoanTerms, TextUtils.isEmpty(item.topTitle));
        holder.setText(Ya.e.tvLoanTerms, item.topTitle);
        holder.setGone(Ya.e.rtvFrozen, TextUtils.isEmpty(item.cardStatusTitle));
        holder.setText(Ya.e.rtvFrozen, item.cardStatusTitle);
        holder.setText(Ya.e.tvInstallmentLoan, item.productTitle);
        ImageView imageView2 = (ImageView) holder.getView(Ya.e.ivInstallmentLoan);
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = holder.getBindingAdapter();
        Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
        r0.l1(((Gb.O) bindingAdapter).f3254b.d() ? item.productIconDark : item.productIcon, imageView2);
        holder.setText(Ya.e.tvLoanableAmountTitle, item.amountTitle);
        int i7 = Ya.e.tvLoanableAmount;
        Long l5 = item.amount;
        holder.setText(i7, r0.V1(r0.B(l5 != null ? l5.longValue() : 0L, true)));
        holder.setText(Ya.e.tvLoanPeriodTitle, item.periodTitle);
        holder.setText(Ya.e.tvLoanPeriod, item.period);
        holder.setText(Ya.e.tvLoanPeriodDays, item.periodUnit);
        TextView textView4 = (TextView) holder.getView(Ya.e.tvDailyInterest);
        if (textView4 != null) {
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter2 = holder.getBindingAdapter();
            Intrinsics.f(bindingAdapter2, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
            if (((Gb.O) bindingAdapter2).f3254b.d()) {
                if (!TextUtils.isEmpty(item.periodSubTitleDark)) {
                    p220oa.h.f(textView4, item.periodSubTitleDark);
                }
            } else if (!TextUtils.isEmpty(item.periodSubTitle)) {
                p220oa.h.f(textView4, item.periodSubTitle);
            }
        }
        TextView textView5 = (TextView) holder.getView(Ya.e.rtvBorrow);
        if (textView5 != null) {
            Integer num = item.enable;
            textView5.setEnabled(num != null && num.intValue() == 1);
            textView5.setText(item.button);
            p220oa.h.l(new ViewOnClickListenerC0299a(item, holder, 6), textView5);
        }
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter3 = holder.getBindingAdapter();
        Intrinsics.f(bindingAdapter3, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
        ProductThemeInfo productThemeInfoC = ((Gb.O) bindingAdapter3).f3254b.c(item.style);
        if (productThemeInfoC != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            Intrinsics.f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            ProductThemeInfoNameArea productThemeInfoNameArea = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea != null && (iconSize = productThemeInfoNameArea.productIconSize) != null) {
                Float f16 = iconSize.width;
                if ((f16 != null ? f16.floatValue() : 0.0f) > 0.0f) {
                    Float f17 = iconSize.width;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).width = SizeUtils.dp2px(f17 != null ? f17.floatValue() : 0.0f);
                }
                Float f18 = iconSize.height;
                if ((f18 != null ? f18.floatValue() : 0.0f) > 0.0f) {
                    Float f19 = iconSize.height;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).height = SizeUtils.dp2px(f19 != null ? f19.floatValue() : 0.0f);
                }
            }
            imageView.setLayoutParams(layoutParams4);
            ConstraintLayout constraintLayout = (ConstraintLayout) holder.getView(Ya.e.layoutContent);
            if (constraintLayout != null) {
                ViewGroup.LayoutParams layoutParams5 = constraintLayout.getLayoutParams();
                Intrinsics.f(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = TextUtils.isEmpty(item.topTitle) ? 0 : SizeUtils.dp2px(6.0f);
                constraintLayout.setLayoutParams(layoutParams6);
                Integer num2 = item.accountType;
                if (num2 != null && num2.intValue() == 9) {
                    ProductThemeInfoNameArea productThemeInfoNameArea2 = productThemeInfoC.nameArea;
                    if (productThemeInfoNameArea2 == null || (topArea4 = productThemeInfoNameArea2.topArea) == null) {
                        str7 = null;
                    } else {
                        str7 = topArea4.bgImage1;
                    }
                } else {
                    ProductThemeInfoNameArea productThemeInfoNameArea3 = productThemeInfoC.nameArea;
                    if (productThemeInfoNameArea3 == null || (topArea = productThemeInfoNameArea3.topArea) == null) {
                        str7 = null;
                    } else {
                        str7 = topArea.bgImage2;
                    }
                }
                com.bumptech.glide.m mVar = (com.bumptech.glide.m) com.bumptech.glide.b.f(textView3).load(str7).a(new G1.d()).w(Integer.MIN_VALUE, Integer.MIN_VALUE);
                mVar.T(new J(textView3, productThemeInfoC), null, mVar, J1.g.f4461a);
                int i10 = Ya.e.tvLoanTerms;
                Context contextC = c();
                Integer num3 = item.accountType;
                if (num3 != null && num3.intValue() == 9) {
                    ProductThemeInfoNameArea productThemeInfoNameArea4 = productThemeInfoC.nameArea;
                    if (productThemeInfoNameArea4 == null || (topArea3 = productThemeInfoNameArea4.topArea) == null) {
                        str8 = null;
                    } else {
                        str8 = topArea3.titleColor1;
                    }
                } else {
                    ProductThemeInfoNameArea productThemeInfoNameArea5 = productThemeInfoC.nameArea;
                    if (productThemeInfoNameArea5 == null || (topArea2 = productThemeInfoNameArea5.topArea) == null) {
                        str8 = null;
                    } else {
                        str8 = topArea2.titleColor2;
                    }
                }
                holder.setTextColor(i10, Eb.a.t(contextC, str8));
                ProductThemeInfoCard productThemeInfoCard = productThemeInfoC.card;
                if (TextUtils.isEmpty(productThemeInfoCard != null ? productThemeInfoCard.bgImage : null)) {
                    ProductThemeInfoCard productThemeInfoCard2 = productThemeInfoC.card;
                    if (productThemeInfoCard2 != null && (str9 = productThemeInfoCard2.bgColor) != null && (cornerRadius2 = productThemeInfoCard2.cornerRadius) != null) {
                        constraintLayout.setBackground(Eb.a.i(C1849p.c(str9), cornerRadius2, 0, -1));
                    }
                } else {
                    ProductThemeInfoCard productThemeInfoCard3 = productThemeInfoC.card;
                    r0.n1(constraintLayout, productThemeInfoCard3 != null ? productThemeInfoCard3.bgImage : null);
                }
            }
            ProductThemeInfoNameArea productThemeInfoNameArea6 = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea6 != null && (str6 = productThemeInfoNameArea6.productTitleColor) != null) {
                holder.setTextColor(Ya.e.tvInstallmentLoan, CommonViewExtKt.hexToColorInt(str6, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoNameArea productThemeInfoNameArea7 = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea7 != null && (titleFont6 = productThemeInfoNameArea7.productTitleFont) != null && (f15 = titleFont6.fontSize) != null) {
                ((TextView) holder.getView(Ya.e.tvInstallmentLoan)).setTextSize(1, f15.floatValue());
            }
            ProductThemeInfoText productThemeInfoText = productThemeInfoC.text;
            if (productThemeInfoText != null && (str5 = productThemeInfoText.subTitleColor) != null) {
                holder.setTextColor(Ya.e.tvLoanableAmountTitle, CommonViewExtKt.hexToColorInt(str5, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoText productThemeInfoText2 = productThemeInfoC.text;
            if (productThemeInfoText2 != null && (titleFont5 = productThemeInfoText2.subTitleFont) != null && (f14 = titleFont5.fontSize) != null) {
                ((TextView) holder.getView(Ya.e.tvLoanableAmountTitle)).setTextSize(1, f14.floatValue());
            }
            ProductThemeInfoText productThemeInfoText3 = productThemeInfoC.text;
            if (productThemeInfoText3 != null && (str4 = productThemeInfoText3.subTitleColor) != null) {
                holder.setTextColor(Ya.e.tvLoanPeriodTitle, CommonViewExtKt.hexToColorInt(str4, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoText productThemeInfoText4 = productThemeInfoC.text;
            if (productThemeInfoText4 != null && (titleFont4 = productThemeInfoText4.subTitleFont) != null && (f13 = titleFont4.fontSize) != null) {
                ((TextView) holder.getView(Ya.e.tvLoanPeriodTitle)).setTextSize(1, f13.floatValue());
            }
            TextView textView6 = (TextView) holder.getView(Ya.e.tvLoanPeriod);
            if (textView6 != null) {
                ProductThemeInfoText productThemeInfoText5 = productThemeInfoC.text;
                if (productThemeInfoText5 != null && (titleFont3 = productThemeInfoText5.amountTitleFont) != null && (f12 = titleFont3.fontSize) != null) {
                    textView6.setTextSize(1, f12.floatValue());
                }
                ProductThemeInfoText productThemeInfoText6 = productThemeInfoC.text;
                if (productThemeInfoText6 != null && (str3 = productThemeInfoText6.amountColor) != null) {
                    textView6.setTextColor(CommonViewExtKt.hexToColorInt(str3, c(), L6.b.ppColorTextPrimary));
                }
            }
            TextView textView7 = (TextView) holder.getView(Ya.e.tvLoanPeriodDays);
            if (textView7 != null) {
                ProductThemeInfoText productThemeInfoText7 = productThemeInfoC.text;
                if (productThemeInfoText7 != null && (titleFont2 = productThemeInfoText7.unitTitleFont) != null && (f11 = titleFont2.fontSize) != null) {
                    textView7.setTextSize(1, f11.floatValue());
                }
                ProductThemeInfoText productThemeInfoText8 = productThemeInfoC.text;
                if (productThemeInfoText8 != null && (str2 = productThemeInfoText8.unitTitleColor) != null) {
                    textView7.setTextColor(CommonViewExtKt.hexToColorInt(str2, c(), L6.b.ppColorTextPrimary));
                }
            }
            TextView textView8 = (TextView) holder.getView(Ya.e.tvLoanableAmount);
            if (textView8 != null) {
                ProductThemeInfoText productThemeInfoText9 = productThemeInfoC.text;
                if (productThemeInfoText9 != null && (titleFont = productThemeInfoText9.amountTitleFont) != null && (f10 = titleFont.fontSize) != null) {
                    textView8.setTextSize(1, f10.floatValue());
                }
                ProductThemeInfoText productThemeInfoText10 = productThemeInfoC.text;
                if (productThemeInfoText10 != null && (str = productThemeInfoText10.amountColor) != null) {
                    textView8.setTextColor(CommonViewExtKt.hexToColorInt(str, c(), L6.b.ppColorTextPrimary));
                }
            }
            TextView textView9 = (TextView) holder.getView(Ya.e.tvDailyInterest);
            ProductThemeInfoText productThemeInfoText11 = productThemeInfoC.text;
            if (!TextUtils.isEmpty(productThemeInfoText11 != null ? productThemeInfoText11.subTitleColor : null)) {
                Context contextC2 = c();
                ProductThemeInfoText productThemeInfoText12 = productThemeInfoC.text;
                String str10 = productThemeInfoText12 != null ? productThemeInfoText12.subTitleColor : null;
                textView9.setTextColor(str10 != null ? CommonViewExtKt.hexToColorInt(str10, contextC2, L6.b.ppColorTextPrimary) : -16777216);
            }
            ProductThemeInfoButton productThemeInfoButton = productThemeInfoC.button;
            if (productThemeInfoButton != null) {
                List<String> list = productThemeInfoButton.bgColor;
                if (list != null && (cornerRadius = productThemeInfoButton.cornerRadius) != null && (textView2 = (TextView) holder.getView(Ya.e.rtvBorrow)) != null) {
                    textView2.setBackground(Eb.a.i(list, cornerRadius, 0, -1));
                }
                if (TextUtils.isEmpty(productThemeInfoButton.titleColor) || (textView = (TextView) holder.getView(Ya.e.rtvBorrow)) == null) {
                    return;
                }
                textView.setTextColor(Color.parseColor(productThemeInfoButton.titleColor));
            }
        }
    }

    @Override // T1.b
    public final int d() {
        return Gb.O.f3244d.getITEM_VIEW_TYPE_MULTIPLE_CASH_LOAN();
    }

    @Override // T1.b
    public final int e() {
        return Ya.f.cs_cl_multiple_product_info_view;
    }
}
