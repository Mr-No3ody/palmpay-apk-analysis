package Hb;

import B6.ViewOnClickListenerC0087i;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.credit.bean.ExtraThemeInfo;
import com.transsnet.palmpay.credit.bean.IconSize;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoCard;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoNameArea;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoText;
import com.transsnet.palmpay.credit.bean.TitleFont;
import com.transsnet.palmpay.credit.bean.TopArea;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends T1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3848f;

    static {
        new C0314p(null);
    }

    public static void j(IconicsImageView iconicsImageView, boolean z3) {
        Context context = iconicsImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconicsDrawable iconicsDrawable = new IconicsDrawable(context, z3 ? S6.a.pay_ArrowUp : S6.a.pay_Arrowdown);
        iconicsDrawable.a(new C0313o(iconicsImageView, 0));
        iconicsImageView.setIcon(iconicsDrawable);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0360  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [com.bumptech.glide.p] */
    /* JADX WARN: Type inference failed for: r5v131 */
    /* JADX WARN: Type inference failed for: r5v132 */
    /* JADX WARN: Type inference failed for: r5v133 */
    /* JADX WARN: Type inference failed for: r5v134 */
    /* JADX WARN: Type inference failed for: r5v135 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r5v73, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v77, types: [G1.a, com.bumptech.glide.m] */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.transsnet.palmpay.credit.bean.ProductThemeInfoButton] */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    @Override // T1.b
    public final void b(BaseViewHolder baseViewHolder, Object obj) {
        G1.c cVar;
        ExtraThemeInfo extraThemeInfo;
        IconSize iconSize;
        String str;
        TitleFont titleFont;
        Float f10;
        ProductThemeInfoText productThemeInfoText;
        String str2;
        String str3;
        TitleFont titleFont2;
        Float f11;
        String str4;
        TitleFont titleFont3;
        Float f12;
        String str5;
        TitleFont titleFont4;
        Float f13;
        TitleFont titleFont5;
        Float f14;
        String str6;
        TitleFont titleFont6;
        Float f15;
        String str7;
        TitleFont titleFont7;
        Float f16;
        String str8;
        TopArea topArea;
        ?? r10;
        TopArea topArea2;
        ?? r11;
        String str9;
        CornerRadius cornerRadius;
        TopArea topArea3;
        TopArea topArea4;
        IconSize iconSize2;
        View view;
        final BaseViewHolder holder = baseViewHolder;
        int i7 = 9;
        final int i10 = 0;
        final int i11 = 1;
        final ProductContentInfo item = (ProductContentInfo) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        F6.d.h("InstallmentLoanItemProvider", 3, C0.G.o("convert >>> loanProduct=", item.loanProduct));
        SingleAdView singleAdView = (SingleAdView) holder.getView(Ya.e.viewTopAd);
        ImageView imageView = (ImageView) holder.getView(Ya.e.ivInstallmentLoanIcon);
        TextView textView = (TextView) holder.getView(Ya.e.tvLoanTerms);
        this.f3847e = !TextUtils.equals("expanded", item.style);
        holder.setGone(Ya.e.rtvFrozen, TextUtils.isEmpty(item.cardStatusTitle));
        holder.setText(Ya.e.rtvFrozen, item.cardStatusTitle);
        Space space = (Space) holder.getView(Ya.e.topSpace);
        if (space != null) {
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = SizeUtils.dp2px(TextUtils.isEmpty(item.topTitle) ? 12.0f : 40.0f);
            space.setLayoutParams(layoutParams2);
            Unit unit = Unit.f38893a;
        }
        if (TextUtils.equals("expanded", item.style)) {
            holder.setGone(Ya.e.groupExpanded, !this.f3847e);
            holder.setGone(Ya.e.tvLoanTerms, !this.f3847e);
            j((IconicsImageView) holder.getView(Ya.e.ivBorrowedArrow), this.f3847e);
            holder.setGone(Ya.e.tvRightBorrowed, false);
            holder.setGone(Ya.e.ivBorrowedArrow, false);
            holder.setText(Ya.e.tvRightBorrowed, item.extraInfoTitle);
            p220oa.h.l(new View.OnClickListener(this) { // from class: Hb.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f3833b;

                {
                    this.f3833b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            r rVar = this.f3833b;
                            rVar.k(holder, !rVar.f3847e, item);
                            break;
                        default:
                            r rVar2 = this.f3833b;
                            rVar2.k(holder, !rVar2.f3847e, item);
                            break;
                    }
                }
            }, holder.getView(Ya.e.ivBorrowedArrow));
            p220oa.h.l(new View.OnClickListener(this) { // from class: Hb.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f3833b;

                {
                    this.f3833b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            r rVar = this.f3833b;
                            rVar.k(holder, !rVar.f3847e, item);
                            break;
                        default:
                            r rVar2 = this.f3833b;
                            rVar2.k(holder, !rVar2.f3847e, item);
                            break;
                    }
                }
            }, holder.getView(Ya.e.tvRightBorrowed));
            k(holder, this.f3847e, item);
            Unit unit2 = Unit.f38893a;
        } else {
            holder.setGone(Ya.e.tvRightBorrowed, true);
            holder.setGone(Ya.e.ivBorrowedArrow, true);
            holder.setGone(Ya.e.groupExpanded, false);
            holder.setGone(Ya.e.tvLoanTerms, TextUtils.isEmpty(item.topTitle));
        }
        if (singleAdView != null) {
            singleAdView.setAdListener(new Ce.E(i11, this, singleAdView));
            singleAdView.setSlotId(item.advertisementId);
            Unit unit3 = Unit.f38893a;
        }
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = holder.getBindingAdapter();
        Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
        boolean zD = ((Gb.O) bindingAdapter).f3254b.d();
        holder.setText(Ya.e.tvLoanTerms, item.topTitle);
        r0.l1(zD ? item.productIconDark : item.productIcon, (ImageView) holder.getView(Ya.e.ivInstallmentLoanIcon));
        holder.setText(Ya.e.tvInstallmentLoan, item.productTitle);
        holder.setText(Ya.e.tvLoanableAmountTitle, item.amountTitle);
        int i12 = Ya.e.tvLoanableAmount;
        Long l5 = item.amount;
        holder.setText(i12, r0.V1(r0.B(l5 != null ? l5.longValue() : 0L, true)));
        ImageView imageView2 = (ImageView) holder.getView(Ya.e.ivLoanableAmountIcon);
        p220oa.h.s(imageView2, !TextUtils.isEmpty(item.tempQuotaDesc) && this.f3847e);
        imageView2.setOnClickListener(new ViewOnClickListenerC0087i(imageView2, this, item, i7));
        r0.l1(zD ? item.tempQuotaDescIconDark : item.tempQuotaDescIconBright, (ImageView) holder.getView(Ya.e.ivLoanableAmountIcon));
        holder.setText(Ya.e.tvLoanPeriodTitle, item.periodTitle);
        holder.setText(Ya.e.tvLoanPeriod, item.period);
        holder.setText(Ya.e.tvLoanPeriodDays, item.periodUnit);
        TextView textView2 = (TextView) holder.getView(Ya.e.tvDailyInterest);
        if (textView2 != null) {
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter2 = holder.getBindingAdapter();
            Intrinsics.f(bindingAdapter2, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
            if (((Gb.O) bindingAdapter2).f3254b.d()) {
                if (!TextUtils.isEmpty(item.periodSubTitleDark)) {
                    p220oa.h.f(textView2, item.periodSubTitleDark);
                }
            } else if (!TextUtils.isEmpty(item.periodSubTitle)) {
                p220oa.h.f(textView2, item.periodSubTitle);
            }
            Unit unit4 = Unit.f38893a;
        }
        boolean zPalLoanMigrate = item.palLoanMigrate();
        PpButton ppButton = (PpButton) holder.getView(Ya.e.rtvIncrease);
        boolean z3 = item.enable2 != null;
        p220oa.h.s(ppButton, z3);
        if (z3) {
            if (Intrinsics.c(item.loanProduct, "PALMPAY_BUSINESS_LOAN") && !p059e1.a.f35991d) {
                n0.g().v("BusinessLoanIncreaseLimitLoanPageShow");
            }
            ppButton.setText(item.button2);
            Integer num = item.enable2;
            ppButton.setEnabled(num != null && num.intValue() == 1);
            r0.n1(ppButton, zD ? item.button2BackgroundDark : item.button2Background);
            p220oa.h.l(new ViewOnClickListenerC0311m(item, 0), ppButton);
        }
        PpButton ppButton2 = (PpButton) holder.getView(Ya.e.rtvBorrow);
        if (ppButton2 != null) {
            Integer num2 = item.enable;
            boolean z8 = num2 != null && num2.intValue() == 1;
            ppButton2.setText(item.button);
            if (z8) {
                cVar = null;
                holder = baseViewHolder;
                p220oa.h.l(new ViewOnClickListenerC0312n(item, ppButton2, zPalLoanMigrate, baseViewHolder, 0), ppButton2);
            } else {
                cVar = null;
                ppButton2.setOnClickListener(null);
            }
            Unit unit5 = Unit.f38893a;
        } else {
            cVar = null;
        }
        if (Intrinsics.c(item.loanProduct, "PALMPAY_BUSINESS_LOAN") && (view = holder.itemView) != null) {
            p220oa.h.l(new ViewOnClickListenerC0311m(item, 1), view);
            Unit unit6 = Unit.f38893a;
        }
        View view2 = holder.getView(Ya.e.llProductProvidedBy);
        if (view2 != null) {
            p220oa.h.s(view2, zPalLoanMigrate);
            Unit unit7 = Unit.f38893a;
        }
        if (zPalLoanMigrate) {
            ((TextView) holder.getView(Ya.e.tvProductProvidedBy)).setText(item.bottomContent);
            r0.l1(zD ? item.bottomIconDark : item.bottomIcon, (ImageView) holder.getView(Ya.e.ivProductProvidedBy));
        }
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter3 = holder.getBindingAdapter();
        Intrinsics.f(bindingAdapter3, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
        ProductThemeInfo productThemeInfoC = ((Gb.O) bindingAdapter3).f3254b.c(item.style);
        if (productThemeInfoC != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            Intrinsics.f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            ProductThemeInfoNameArea productThemeInfoNameArea = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea != null && (iconSize2 = productThemeInfoNameArea.productIconSize) != null) {
                Float f17 = iconSize2.width;
                if ((f17 != null ? f17.floatValue() : 0.0f) > 0.0f) {
                    Float f18 = iconSize2.width;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).width = SizeUtils.dp2px(f18 != null ? f18.floatValue() : 0.0f);
                }
                Float f19 = iconSize2.height;
                if ((f19 != null ? f19.floatValue() : 0.0f) > 0.0f) {
                    Float f20 = iconSize2.height;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).height = SizeUtils.dp2px(f20 != null ? f20.floatValue() : 0.0f);
                }
                Unit unit8 = Unit.f38893a;
            }
            imageView.setLayoutParams(layoutParams4);
            ConstraintLayout constraintLayout = (ConstraintLayout) holder.getView(Ya.e.layoutContent);
            if (constraintLayout != null) {
                ViewGroup.LayoutParams layoutParams5 = constraintLayout.getLayoutParams();
                Intrinsics.f(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (TextUtils.isEmpty(item.topTitle) || !this.f3847e) ? 0 : SizeUtils.dp2px(6.0f);
                constraintLayout.setLayoutParams(layoutParams6);
                Integer num3 = item.accountType;
                if (num3 != null && num3.intValue() == 9) {
                    ProductThemeInfoNameArea productThemeInfoNameArea2 = productThemeInfoC.nameArea;
                    if (productThemeInfoNameArea2 == null || (topArea4 = productThemeInfoNameArea2.topArea) == null) {
                        r10 = cVar;
                    } else {
                        r10 = topArea4.bgImage1;
                    }
                } else {
                    ProductThemeInfoNameArea productThemeInfoNameArea3 = productThemeInfoC.nameArea;
                    if (productThemeInfoNameArea3 == null || (topArea = productThemeInfoNameArea3.topArea) == null) {
                        r10 = cVar;
                    } else {
                        r10 = topArea.bgImage2;
                    }
                }
                ?? r12 = (com.bumptech.glide.m) com.bumptech.glide.b.f(textView).load(r10).a(new G1.d()).w(Integer.MIN_VALUE, Integer.MIN_VALUE);
                r12.T(new C0315q(textView, productThemeInfoC), cVar, r12, J1.g.f4461a);
                int i13 = Ya.e.tvLoanTerms;
                Context contextC = c();
                Integer num4 = item.accountType;
                if (num4 != null && num4.intValue() == 9) {
                    ProductThemeInfoNameArea productThemeInfoNameArea4 = productThemeInfoC.nameArea;
                    if (productThemeInfoNameArea4 == null || (topArea3 = productThemeInfoNameArea4.topArea) == null) {
                        r11 = cVar;
                    } else {
                        r11 = topArea3.titleColor1;
                    }
                } else {
                    ProductThemeInfoNameArea productThemeInfoNameArea5 = productThemeInfoC.nameArea;
                    if (productThemeInfoNameArea5 == null || (topArea2 = productThemeInfoNameArea5.topArea) == null) {
                        r11 = cVar;
                    } else {
                        r11 = topArea2.titleColor2;
                    }
                }
                holder.setTextColor(i13, Eb.a.t(contextC, r11));
                ProductThemeInfoCard productThemeInfoCard = productThemeInfoC.card;
                if (TextUtils.isEmpty(productThemeInfoCard != null ? productThemeInfoCard.bgImage : cVar)) {
                    ProductThemeInfoCard productThemeInfoCard2 = productThemeInfoC.card;
                    if (productThemeInfoCard2 != null && (str9 = productThemeInfoCard2.bgColor) != null && (cornerRadius = productThemeInfoCard2.cornerRadius) != null) {
                        constraintLayout.setBackground(Eb.a.i(C1849p.c(str9), cornerRadius, 0, -1));
                        Unit unit9 = Unit.f38893a;
                    }
                } else {
                    if (Intrinsics.c(item.loanProduct, "PALMPAY_BUSINESS_LOAN")) {
                        ProductThemeInfoCard productThemeInfoCard3 = productThemeInfoC.card;
                        r0.n1(constraintLayout, productThemeInfoCard3 != null ? productThemeInfoCard3.bgImage : cVar);
                    }
                    Unit unit10 = Unit.f38893a;
                }
            }
            ProductThemeInfoNameArea productThemeInfoNameArea6 = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea6 != null && (str8 = productThemeInfoNameArea6.productTitleColor) != null) {
                holder.setTextColor(Ya.e.tvInstallmentLoan, CommonViewExtKt.hexToColorInt(str8, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoNameArea productThemeInfoNameArea7 = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea7 != null && (titleFont7 = productThemeInfoNameArea7.productTitleFont) != null && (f16 = titleFont7.fontSize) != null) {
                ((TextView) holder.getView(Ya.e.tvInstallmentLoan)).setTextSize(1, f16.floatValue());
                Unit unit11 = Unit.f38893a;
            }
            ProductThemeInfoText productThemeInfoText2 = productThemeInfoC.text;
            if (productThemeInfoText2 != null && (str7 = productThemeInfoText2.subTitleColor) != null) {
                holder.setTextColor(Ya.e.tvLoanableAmountTitle, CommonViewExtKt.hexToColorInt(str7, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoText productThemeInfoText3 = productThemeInfoC.text;
            if (productThemeInfoText3 != null && (titleFont6 = productThemeInfoText3.subTitleFont) != null && (f15 = titleFont6.fontSize) != null) {
                ((TextView) holder.getView(Ya.e.tvLoanableAmountTitle)).setTextSize(1, f15.floatValue());
                Unit unit12 = Unit.f38893a;
            }
            ProductThemeInfoText productThemeInfoText4 = productThemeInfoC.text;
            if (productThemeInfoText4 != null && (str6 = productThemeInfoText4.subTitleColor) != null) {
                holder.setTextColor(Ya.e.tvLoanPeriodTitle, CommonViewExtKt.hexToColorInt(str6, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoText productThemeInfoText5 = productThemeInfoC.text;
            if (productThemeInfoText5 != null && (titleFont5 = productThemeInfoText5.subTitleFont) != null && (f14 = titleFont5.fontSize) != null) {
                ((TextView) holder.getView(Ya.e.tvLoanPeriodTitle)).setTextSize(1, f14.floatValue());
                Unit unit13 = Unit.f38893a;
            }
            TextView textView3 = (TextView) holder.getView(Ya.e.tvLoanPeriod);
            if (textView3 != null) {
                ProductThemeInfoText productThemeInfoText6 = productThemeInfoC.text;
                if (productThemeInfoText6 != null && (titleFont4 = productThemeInfoText6.amountTitleFont) != null && (f13 = titleFont4.fontSize) != null) {
                    textView3.setTextSize(1, f13.floatValue());
                    Unit unit14 = Unit.f38893a;
                }
                ProductThemeInfoText productThemeInfoText7 = productThemeInfoC.text;
                if (productThemeInfoText7 != null && (str5 = productThemeInfoText7.amountColor) != null) {
                    textView3.setTextColor(CommonViewExtKt.hexToColorInt(str5, c(), L6.b.ppColorTextPrimary));
                    Unit unit15 = Unit.f38893a;
                }
            }
            TextView textView4 = (TextView) holder.getView(Ya.e.tvLoanPeriodDays);
            if (textView4 != null) {
                ProductThemeInfoText productThemeInfoText8 = productThemeInfoC.text;
                if (productThemeInfoText8 != null && (titleFont3 = productThemeInfoText8.unitTitleFont) != null && (f12 = titleFont3.fontSize) != null) {
                    textView4.setTextSize(1, f12.floatValue());
                    Unit unit16 = Unit.f38893a;
                }
                ProductThemeInfoText productThemeInfoText9 = productThemeInfoC.text;
                if (productThemeInfoText9 != null && (str4 = productThemeInfoText9.unitTitleColor) != null) {
                    textView4.setTextColor(CommonViewExtKt.hexToColorInt(str4, c(), L6.b.ppColorTextPrimary));
                    Unit unit17 = Unit.f38893a;
                }
            }
            TextView textView5 = (TextView) holder.getView(Ya.e.tvLoanableAmount);
            if (textView5 != null) {
                ProductThemeInfoText productThemeInfoText10 = productThemeInfoC.text;
                if (productThemeInfoText10 != null && (titleFont2 = productThemeInfoText10.amountTitleFont) != null && (f11 = titleFont2.fontSize) != null) {
                    textView5.setTextSize(1, f11.floatValue());
                    Unit unit18 = Unit.f38893a;
                }
                ProductThemeInfoText productThemeInfoText11 = productThemeInfoC.text;
                if (productThemeInfoText11 != null && (str3 = productThemeInfoText11.amountColor) != null) {
                    textView5.setTextColor(CommonViewExtKt.hexToColorInt(str3, c(), L6.b.ppColorTextPrimary));
                    Unit unit19 = Unit.f38893a;
                }
            }
            TextView textView6 = (TextView) holder.getView(Ya.e.tvDailyInterest);
            if (textView6 != null && (productThemeInfoText = productThemeInfoC.text) != null && (str2 = productThemeInfoText.subTitleColor) != null) {
                textView6.setTextColor(CommonViewExtKt.hexToColorInt(str2, c(), L6.b.ppColorTextPrimary));
                Unit unit20 = Unit.f38893a;
            }
            TextView textView7 = (TextView) holder.getView(Ya.e.tvProductProvidedBy);
            if (textView7 != null) {
                ExtraThemeInfo extraThemeInfo2 = productThemeInfoC.extraInfo;
                if (extraThemeInfo2 != null && (titleFont = extraThemeInfo2.titleFont) != null && (f10 = titleFont.fontSize) != null) {
                    textView7.setTextSize(1, f10.floatValue());
                    Unit unit21 = Unit.f38893a;
                }
                ExtraThemeInfo extraThemeInfo3 = productThemeInfoC.extraInfo;
                if (extraThemeInfo3 != null && (str = extraThemeInfo3.titleColor) != null) {
                    textView7.setTextColor(CommonViewExtKt.hexToColorInt(str, c(), L6.b.ppColorTextPrimary));
                    Unit unit22 = Unit.f38893a;
                }
            }
            ImageView imageView3 = (ImageView) holder.getView(Ya.e.ivProductProvidedBy);
            if (imageView3 != null && (extraThemeInfo = productThemeInfoC.extraInfo) != null && (iconSize = extraThemeInfo.iconSize) != null) {
                Float f21 = iconSize.width;
                float fFloatValue = f21 != null ? f21.floatValue() : 0.0f;
                Float f22 = iconSize.height;
                float fFloatValue2 = f22 != null ? f22.floatValue() : 0.0f;
                if (fFloatValue > 0.0f && fFloatValue2 > 0.0f) {
                    ViewGroup.LayoutParams layoutParams7 = imageView3.getLayoutParams();
                    Intrinsics.f(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                    layoutParams8.width = SizeUtils.dp2px(fFloatValue);
                    layoutParams8.height = SizeUtils.dp2px(fFloatValue2);
                    imageView3.setLayoutParams(layoutParams8);
                }
                Unit unit23 = Unit.f38893a;
            }
        }
        Eb.a.b(holder, item, productThemeInfoC != null ? productThemeInfoC.button : cVar);
        Eb.a.c(holder, item, false, false, false, 48);
    }

    @Override // T1.b
    public final int d() {
        return Gb.O.f3244d.getITEM_VIEW_TYPE_INSTALLMENT_LOAN();
    }

    @Override // T1.b
    public final int e() {
        return Ya.f.cs_cl_product_info_with_top_decoration_view;
    }

    public final void k(BaseViewHolder baseViewHolder, boolean z3, ProductContentInfo productContentInfo) {
        String str;
        this.f3847e = z3;
        int i7 = Ya.e.tvRightBorrowed;
        if (z3) {
            str = "";
        } else {
            str = productContentInfo != null ? productContentInfo.extraInfoTitle : null;
        }
        baseViewHolder.setText(i7, str);
        baseViewHolder.setGone(Ya.e.groupExpanded, !z3);
        boolean z8 = true;
        int iDp2px = 0;
        baseViewHolder.setGone(Ya.e.viewTopAd, (z3 && this.f3848f) ? false : true);
        baseViewHolder.setGone(Ya.e.tvLoanTerms, TextUtils.isEmpty(productContentInfo != null ? productContentInfo.topTitle : null) || !z3);
        int i10 = Ya.e.ivLoanableAmountIcon;
        if (!TextUtils.isEmpty(productContentInfo != null ? productContentInfo.tempQuotaDesc : null) && z3) {
            z8 = false;
        }
        baseViewHolder.setGone(i10, z8);
        j((IconicsImageView) baseViewHolder.getView(Ya.e.ivBorrowedArrow), z3);
        Space space = (Space) baseViewHolder.getView(Ya.e.topSpace);
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = SizeUtils.dp2px(p220oa.h.e(baseViewHolder.getView(Ya.e.tvLoanTerms)) ? 40.0f : 12.0f);
        space.setLayoutParams(layoutParams2);
        ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(Ya.e.layoutContent);
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
            Intrinsics.f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            if (!TextUtils.isEmpty(productContentInfo != null ? productContentInfo.topTitle : null) && this.f3847e) {
                iDp2px = SizeUtils.dp2px(6.0f);
            }
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = iDp2px;
            constraintLayout.setLayoutParams(layoutParams4);
        }
    }
}
