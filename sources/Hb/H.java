package Hb;

import B6.ViewOnClickListenerC0087i;
import Pa.r0;
import android.content.Context;
import android.graphics.Color;
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
import com.transsnet.palmpay.credit.bean.IncreaseThemeInfo;
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
public final class H extends T1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3804f;

    static {
        new G(null);
    }

    public static void j(IconicsImageView iconicsImageView, boolean z3) {
        Context context = iconicsImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconicsDrawable iconicsDrawable = new IconicsDrawable(context, z3 ? S6.a.pay_ArrowUp : S6.a.pay_Arrowdown);
        iconicsDrawable.a(new C0313o(iconicsImageView, 1));
        iconicsImageView.setIcon(iconicsDrawable);
    }

    public static String l(String str) {
        if (TextUtils.isEmpty(str)) {
            return "#00000000";
        }
        int color = Color.parseColor(str);
        return com.airbnb.lottie.model.layer.d.n(new Object[]{28, Integer.valueOf(Color.red(color)), Integer.valueOf(Color.green(color)), Integer.valueOf(Color.blue(color))}, 4, "#%02X%02X%02X%02X", "format(...)");
    }

    @Override // T1.b
    public final void b(final BaseViewHolder holder, Object obj) {
        BaseViewHolder baseViewHolder;
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
        String str9;
        CornerRadius cornerRadius;
        IconSize iconSize2;
        View view;
        int i7 = 2;
        final int i10 = 0;
        final int i11 = 1;
        final ProductContentInfo item = (ProductContentInfo) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        F6.d.h("InstallmentLoanV3ItemProvider", 3, C0.G.o("convert >>> loanProduct=", item.loanProduct));
        SingleAdView singleAdView = (SingleAdView) holder.getView(Ya.e.viewTopAd);
        ImageView imageView = (ImageView) holder.getView(Ya.e.ivInstallmentLoanIcon);
        this.f3803e = !TextUtils.equals("expanded", item.style);
        holder.setGone(Ya.e.rtvFrozen, TextUtils.isEmpty(item.cardStatusTitle));
        holder.setText(Ya.e.rtvFrozen, item.cardStatusTitle);
        Space space = (Space) holder.getView(Ya.e.topSpace);
        if (space != null) {
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = SizeUtils.dp2px(12.0f);
            space.setLayoutParams(layoutParams2);
            Unit unit = Unit.f38893a;
        }
        if (TextUtils.equals("expanded", item.style)) {
            holder.setGone(Ya.e.groupExpanded, !this.f3803e);
            j((IconicsImageView) holder.getView(Ya.e.ivBorrowedArrow), this.f3803e);
            holder.setGone(Ya.e.tvRightBorrowed, false);
            holder.setGone(Ya.e.ivBorrowedArrow, false);
            holder.setText(Ya.e.tvRightBorrowed, item.extraInfoTitle);
            p220oa.h.l(new View.OnClickListener(this) { // from class: Hb.F

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ H f3800b;

                {
                    this.f3800b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            H h7 = this.f3800b;
                            h7.k(holder, !h7.f3803e, item);
                            break;
                        default:
                            H h10 = this.f3800b;
                            h10.k(holder, !h10.f3803e, item);
                            break;
                    }
                }
            }, holder.getView(Ya.e.ivBorrowedArrow));
            p220oa.h.l(new View.OnClickListener(this) { // from class: Hb.F

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ H f3800b;

                {
                    this.f3800b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            H h7 = this.f3800b;
                            h7.k(holder, !h7.f3803e, item);
                            break;
                        default:
                            H h10 = this.f3800b;
                            h10.k(holder, !h10.f3803e, item);
                            break;
                    }
                }
            }, holder.getView(Ya.e.tvRightBorrowed));
            k(holder, this.f3803e, item);
            Unit unit2 = Unit.f38893a;
        } else {
            holder.setGone(Ya.e.tvRightBorrowed, true);
            holder.setGone(Ya.e.ivBorrowedArrow, true);
            holder.setGone(Ya.e.groupExpanded, false);
        }
        if (singleAdView != null) {
            singleAdView.setAdListener(new Ce.E(i7, this, singleAdView));
            singleAdView.setSlotId(item.advertisementId);
            Unit unit3 = Unit.f38893a;
        }
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = holder.getBindingAdapter();
        Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
        boolean zD = ((Gb.O) bindingAdapter).f3254b.d();
        r0.l1(zD ? item.productIconDark : item.productIcon, (ImageView) holder.getView(Ya.e.ivInstallmentLoanIcon));
        holder.setText(Ya.e.tvInstallmentLoan, item.productTitle);
        View view2 = holder.getView(Ya.e.layoutEliteTag);
        ImageView imageView2 = (ImageView) holder.getView(Ya.e.ivEliteTagIcon);
        TextView textView = (TextView) holder.getView(Ya.e.tvEliteTagTitle);
        boolean zIsEmpty = TextUtils.isEmpty(item.tagTitle);
        p220oa.h.s(view2, !zIsEmpty);
        if (!zIsEmpty) {
            textView.setText(item.tagTitle);
            boolean zIsEmpty2 = TextUtils.isEmpty(item.tagIcon);
            p220oa.h.s(imageView2, !zIsEmpty2);
            if (!zIsEmpty2) {
                r0.l1(item.tagIcon, imageView2);
            }
        }
        View view3 = holder.getView(Ya.e.layoutUnlockIncrease);
        ImageView imageView3 = (ImageView) holder.getView(Ya.e.ivIncreaseIcon);
        TextView textView2 = (TextView) holder.getView(Ya.e.tvIncreaseTitle);
        ImageView imageView4 = (ImageView) holder.getView(Ya.e.ivIncreaseArrow);
        boolean z3 = !TextUtils.isEmpty(item.increaseTitle) && this.f3803e;
        p220oa.h.s(view3, z3);
        if (z3) {
            textView2.setText(item.increaseTitle);
            boolean zIsEmpty3 = TextUtils.isEmpty(item.increaseIcon);
            p220oa.h.s(imageView3, !zIsEmpty3);
            if (!zIsEmpty3) {
                r0.l1(item.increaseIcon, imageView3);
            }
            boolean zIsEmpty4 = TextUtils.isEmpty(item.increaseArrowIcon);
            p220oa.h.s(imageView4, !zIsEmpty4);
            if (!zIsEmpty4) {
                r0.l1(item.increaseArrowIcon, imageView4);
            }
            p220oa.h.l(new ViewOnClickListenerC0311m(item, 3), view3);
        }
        holder.setText(Ya.e.tvLoanableAmountTitle, item.amountTitle);
        int i12 = Ya.e.tvLoanableAmount;
        Long l5 = item.amount;
        holder.setText(i12, r0.V1(r0.B(l5 != null ? l5.longValue() : 0L, true)));
        ImageView imageView5 = (ImageView) holder.getView(Ya.e.ivLoanableAmountIcon);
        p220oa.h.s(imageView5, !TextUtils.isEmpty(item.tempQuotaDesc) && this.f3803e);
        imageView5.setOnClickListener(new ViewOnClickListenerC0087i(imageView5, this, item, 10));
        r0.l1(zD ? item.tempQuotaDescIconDark : item.tempQuotaDescIconBright, (ImageView) holder.getView(Ya.e.ivLoanableAmountIcon));
        holder.setText(Ya.e.tvLoanPeriodTitle, item.periodTitle);
        holder.setText(Ya.e.tvLoanPeriod, item.period);
        holder.setText(Ya.e.tvLoanPeriodDays, item.periodUnit);
        TextView textView3 = (TextView) holder.getView(Ya.e.tvDailyInterest);
        if (textView3 != null) {
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter2 = holder.getBindingAdapter();
            Intrinsics.f(bindingAdapter2, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
            if (((Gb.O) bindingAdapter2).f3254b.d()) {
                if (!TextUtils.isEmpty(item.periodSubTitleDark)) {
                    p220oa.h.f(textView3, item.periodSubTitleDark);
                }
            } else if (!TextUtils.isEmpty(item.periodSubTitle)) {
                p220oa.h.f(textView3, item.periodSubTitle);
            }
            Unit unit4 = Unit.f38893a;
        }
        boolean zPalLoanMigrate = item.palLoanMigrate();
        PpButton ppButton = (PpButton) holder.getView(Ya.e.rtvBorrow);
        if (ppButton != null) {
            Integer num = item.enable;
            boolean z8 = num != null && num.intValue() == 1;
            ppButton.setText(item.button);
            if (z8) {
                baseViewHolder = holder;
                p220oa.h.l(new ViewOnClickListenerC0312n(item, ppButton, zPalLoanMigrate, holder, 1), ppButton);
            } else {
                baseViewHolder = holder;
                ppButton.setOnClickListener(null);
            }
            Unit unit5 = Unit.f38893a;
        } else {
            baseViewHolder = holder;
        }
        if (Intrinsics.c(item.loanProduct, "PALMPAY_BUSINESS_LOAN") && (view = baseViewHolder.itemView) != null) {
            p220oa.h.l(new ViewOnClickListenerC0311m(item, 2), view);
            Unit unit6 = Unit.f38893a;
        }
        View view4 = baseViewHolder.getView(Ya.e.llProductProvidedBy);
        if (view4 != null) {
            p220oa.h.s(view4, zPalLoanMigrate);
            Unit unit7 = Unit.f38893a;
        }
        if (zPalLoanMigrate) {
            ((TextView) baseViewHolder.getView(Ya.e.tvProductProvidedBy)).setText(item.bottomContent);
            r0.l1(zD ? item.bottomIconDark : item.bottomIcon, (ImageView) baseViewHolder.getView(Ya.e.ivProductProvidedBy));
        }
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter3 = baseViewHolder.getBindingAdapter();
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
            ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(Ya.e.layoutContent);
            if (constraintLayout != null) {
                ViewGroup.LayoutParams layoutParams5 = constraintLayout.getLayoutParams();
                Intrinsics.f(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (TextUtils.isEmpty(item.topTitle) || !this.f3803e) ? 0 : SizeUtils.dp2px(6.0f);
                constraintLayout.setLayoutParams(layoutParams6);
                Integer num2 = item.accountType;
                if (num2 != null && num2.intValue() == 9) {
                    ProductThemeInfoNameArea productThemeInfoNameArea2 = productThemeInfoC.nameArea;
                    if (productThemeInfoNameArea2 != null) {
                        TopArea topArea = productThemeInfoNameArea2.topArea;
                    }
                } else {
                    ProductThemeInfoNameArea productThemeInfoNameArea3 = productThemeInfoC.nameArea;
                    if (productThemeInfoNameArea3 != null) {
                        TopArea topArea2 = productThemeInfoNameArea3.topArea;
                    }
                }
                ProductThemeInfoCard productThemeInfoCard = productThemeInfoC.card;
                if (TextUtils.isEmpty(productThemeInfoCard != null ? productThemeInfoCard.bgImage : null)) {
                    ProductThemeInfoCard productThemeInfoCard2 = productThemeInfoC.card;
                    if (productThemeInfoCard2 != null && (str9 = productThemeInfoCard2.bgColor) != null && (cornerRadius = productThemeInfoCard2.cornerRadius) != null) {
                        constraintLayout.setBackground(Eb.a.i(C1849p.c(str9), cornerRadius, 0, -1));
                        Unit unit9 = Unit.f38893a;
                    }
                } else {
                    ProductThemeInfoCard productThemeInfoCard3 = productThemeInfoC.card;
                    r0.n1(constraintLayout, productThemeInfoCard3 != null ? productThemeInfoCard3.bgImage : null);
                    Unit unit10 = Unit.f38893a;
                }
            }
            ProductThemeInfoNameArea productThemeInfoNameArea4 = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea4 != null && (str8 = productThemeInfoNameArea4.productTitleColor) != null) {
                baseViewHolder.setTextColor(Ya.e.tvInstallmentLoan, CommonViewExtKt.hexToColorInt(str8, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoNameArea productThemeInfoNameArea5 = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea5 != null && (titleFont7 = productThemeInfoNameArea5.productTitleFont) != null && (f16 = titleFont7.fontSize) != null) {
                ((TextView) baseViewHolder.getView(Ya.e.tvInstallmentLoan)).setTextSize(1, f16.floatValue());
                Unit unit11 = Unit.f38893a;
            }
            ProductThemeInfoText productThemeInfoText2 = productThemeInfoC.text;
            if (productThemeInfoText2 != null && (str7 = productThemeInfoText2.subTitleColor) != null) {
                baseViewHolder.setTextColor(Ya.e.tvLoanableAmountTitle, CommonViewExtKt.hexToColorInt(str7, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoText productThemeInfoText3 = productThemeInfoC.text;
            if (productThemeInfoText3 != null && (titleFont6 = productThemeInfoText3.subTitleFont) != null && (f15 = titleFont6.fontSize) != null) {
                ((TextView) baseViewHolder.getView(Ya.e.tvLoanableAmountTitle)).setTextSize(1, f15.floatValue());
                Unit unit12 = Unit.f38893a;
            }
            ProductThemeInfoText productThemeInfoText4 = productThemeInfoC.text;
            if (productThemeInfoText4 != null && (str6 = productThemeInfoText4.subTitleColor) != null) {
                baseViewHolder.setTextColor(Ya.e.tvLoanPeriodTitle, CommonViewExtKt.hexToColorInt(str6, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoText productThemeInfoText5 = productThemeInfoC.text;
            if (productThemeInfoText5 != null && (titleFont5 = productThemeInfoText5.subTitleFont) != null && (f14 = titleFont5.fontSize) != null) {
                ((TextView) baseViewHolder.getView(Ya.e.tvLoanPeriodTitle)).setTextSize(1, f14.floatValue());
                Unit unit13 = Unit.f38893a;
            }
            TextView textView4 = (TextView) baseViewHolder.getView(Ya.e.tvLoanPeriod);
            if (textView4 != null) {
                ProductThemeInfoText productThemeInfoText6 = productThemeInfoC.text;
                if (productThemeInfoText6 != null && (titleFont4 = productThemeInfoText6.amountTitleFont) != null && (f13 = titleFont4.fontSize) != null) {
                    textView4.setTextSize(1, f13.floatValue());
                    Unit unit14 = Unit.f38893a;
                }
                ProductThemeInfoText productThemeInfoText7 = productThemeInfoC.text;
                if (productThemeInfoText7 != null && (str5 = productThemeInfoText7.amountColor) != null) {
                    textView4.setTextColor(CommonViewExtKt.hexToColorInt(str5, c(), L6.b.ppColorTextPrimary));
                    Unit unit15 = Unit.f38893a;
                }
            }
            TextView textView5 = (TextView) baseViewHolder.getView(Ya.e.tvLoanPeriodDays);
            if (textView5 != null) {
                ProductThemeInfoText productThemeInfoText8 = productThemeInfoC.text;
                if (productThemeInfoText8 != null && (titleFont3 = productThemeInfoText8.unitTitleFont) != null && (f12 = titleFont3.fontSize) != null) {
                    textView5.setTextSize(1, f12.floatValue());
                    Unit unit16 = Unit.f38893a;
                }
                ProductThemeInfoText productThemeInfoText9 = productThemeInfoC.text;
                if (productThemeInfoText9 != null && (str4 = productThemeInfoText9.unitTitleColor) != null) {
                    textView5.setTextColor(CommonViewExtKt.hexToColorInt(str4, c(), L6.b.ppColorTextPrimary));
                    Unit unit17 = Unit.f38893a;
                }
            }
            TextView textView6 = (TextView) baseViewHolder.getView(Ya.e.tvLoanableAmount);
            if (textView6 != null) {
                ProductThemeInfoText productThemeInfoText10 = productThemeInfoC.text;
                if (productThemeInfoText10 != null && (titleFont2 = productThemeInfoText10.amountTitleFont) != null && (f11 = titleFont2.fontSize) != null) {
                    textView6.setTextSize(1, f11.floatValue());
                    Unit unit18 = Unit.f38893a;
                }
                ProductThemeInfoText productThemeInfoText11 = productThemeInfoC.text;
                if (productThemeInfoText11 != null && (str3 = productThemeInfoText11.amountColor) != null) {
                    textView6.setTextColor(CommonViewExtKt.hexToColorInt(str3, c(), L6.b.ppColorTextPrimary));
                    Unit unit19 = Unit.f38893a;
                }
            }
            TextView textView7 = (TextView) baseViewHolder.getView(Ya.e.tvDailyInterest);
            if (textView7 != null && (productThemeInfoText = productThemeInfoC.text) != null && (str2 = productThemeInfoText.subTitleColor) != null) {
                textView7.setTextColor(CommonViewExtKt.hexToColorInt(str2, c(), L6.b.ppColorTextPrimary));
                Unit unit20 = Unit.f38893a;
            }
            TextView textView8 = (TextView) baseViewHolder.getView(Ya.e.tvProductProvidedBy);
            if (textView8 != null) {
                ExtraThemeInfo extraThemeInfo2 = productThemeInfoC.extraInfo;
                if (extraThemeInfo2 != null && (titleFont = extraThemeInfo2.titleFont) != null && (f10 = titleFont.fontSize) != null) {
                    textView8.setTextSize(1, f10.floatValue());
                    Unit unit21 = Unit.f38893a;
                }
                ExtraThemeInfo extraThemeInfo3 = productThemeInfoC.extraInfo;
                if (extraThemeInfo3 != null && (str = extraThemeInfo3.titleColor) != null) {
                    textView8.setTextColor(CommonViewExtKt.hexToColorInt(str, c(), L6.b.ppColorTextPrimary));
                    Unit unit22 = Unit.f38893a;
                }
            }
            ImageView imageView6 = (ImageView) baseViewHolder.getView(Ya.e.ivProductProvidedBy);
            if (imageView6 != null && (extraThemeInfo = productThemeInfoC.extraInfo) != null && (iconSize = extraThemeInfo.iconSize) != null) {
                Float f21 = iconSize.width;
                float fFloatValue = f21 != null ? f21.floatValue() : 0.0f;
                Float f22 = iconSize.height;
                float fFloatValue2 = f22 != null ? f22.floatValue() : 0.0f;
                if (fFloatValue > 0.0f && fFloatValue2 > 0.0f) {
                    ViewGroup.LayoutParams layoutParams7 = imageView6.getLayoutParams();
                    Intrinsics.f(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                    layoutParams8.width = SizeUtils.dp2px(fFloatValue);
                    layoutParams8.height = SizeUtils.dp2px(fFloatValue2);
                    imageView6.setLayoutParams(layoutParams8);
                }
                Unit unit23 = Unit.f38893a;
            }
            ExtraThemeInfo extraThemeInfo4 = productThemeInfoC.extraInfo;
            if (extraThemeInfo4 != null) {
                View view5 = baseViewHolder.getView(Ya.e.layoutEliteTag);
                ImageView imageView7 = (ImageView) baseViewHolder.getView(Ya.e.ivEliteTagIcon);
                TextView textView9 = (TextView) baseViewHolder.getView(Ya.e.tvEliteTagTitle);
                CornerRadius cornerRadius2 = extraThemeInfo4.cornerRadius;
                if (cornerRadius2 != null) {
                    view5.setBackground(Eb.a.h(l(extraThemeInfo4.bgColor), cornerRadius2, 0, -1));
                }
                Integer num3 = extraThemeInfo4.height;
                if (num3 != null) {
                    if (num3.intValue() <= 0) {
                        num3 = null;
                    }
                    if (num3 != null) {
                        view5.setMinimumHeight(SizeUtils.dp2px(num3.intValue()));
                    }
                }
                TitleFont titleFont8 = extraThemeInfo4.titleFont;
                if (titleFont8 != null) {
                    titleFont8.applyTheme(textView9);
                }
                String str10 = extraThemeInfo4.titleColor;
                if (str10 != null) {
                    textView9.setTextColor(CommonViewExtKt.hexToColorInt(str10, c(), L6.b.ppColorTextPrimary));
                }
                IconSize iconSize3 = extraThemeInfo4.iconSize;
                if (iconSize3 != null) {
                    Float f23 = iconSize3.width;
                    float fFloatValue3 = f23 != null ? f23.floatValue() : 0.0f;
                    Float f24 = iconSize3.height;
                    float fFloatValue4 = f24 != null ? f24.floatValue() : 0.0f;
                    if (fFloatValue3 > 0.0f && fFloatValue4 > 0.0f) {
                        ViewGroup.LayoutParams layoutParams9 = imageView7.getLayoutParams();
                        layoutParams9.width = SizeUtils.dp2px(fFloatValue3);
                        layoutParams9.height = SizeUtils.dp2px(fFloatValue4);
                        imageView7.setLayoutParams(layoutParams9);
                    }
                }
                boolean zIsEmpty5 = TextUtils.isEmpty(item.tagIcon);
                p220oa.h.s(imageView7, !zIsEmpty5);
                if (!zIsEmpty5) {
                    r0.l1(item.tagIcon, imageView7);
                }
            }
            IncreaseThemeInfo increaseThemeInfo = productThemeInfoC.increaseArea;
            if (increaseThemeInfo != null) {
                View view6 = baseViewHolder.getView(Ya.e.layoutUnlockIncrease);
                ImageView imageView8 = (ImageView) baseViewHolder.getView(Ya.e.ivIncreaseIcon);
                TextView textView10 = (TextView) baseViewHolder.getView(Ya.e.tvIncreaseTitle);
                ImageView imageView9 = (ImageView) baseViewHolder.getView(Ya.e.ivIncreaseArrow);
                CornerRadius cornerRadius3 = increaseThemeInfo.cornerRadius;
                if (cornerRadius3 != null) {
                    view6.setBackground(Eb.a.h(l(increaseThemeInfo.bgColor), cornerRadius3, 0, -1));
                }
                Integer num4 = increaseThemeInfo.height;
                if (num4 != null) {
                    if (num4.intValue() <= 0) {
                        num4 = null;
                    }
                    if (num4 != null) {
                        view6.setMinimumHeight(SizeUtils.dp2px(num4.intValue()));
                    }
                }
                TitleFont titleFont9 = increaseThemeInfo.titleFont;
                if (titleFont9 != null) {
                    titleFont9.applyTheme(textView10);
                }
                String str11 = increaseThemeInfo.titleColor;
                if (str11 != null) {
                    textView10.setTextColor(CommonViewExtKt.hexToColorInt(str11, c(), L6.b.ppColorTextPrimary));
                }
                IconSize iconSize4 = increaseThemeInfo.iconSize;
                if (iconSize4 != null) {
                    Float f25 = iconSize4.width;
                    float fFloatValue5 = f25 != null ? f25.floatValue() : 0.0f;
                    Float f26 = iconSize4.height;
                    float fFloatValue6 = f26 != null ? f26.floatValue() : 0.0f;
                    if (fFloatValue5 > 0.0f && fFloatValue6 > 0.0f) {
                        ViewGroup.LayoutParams layoutParams10 = imageView8.getLayoutParams();
                        layoutParams10.width = SizeUtils.dp2px(fFloatValue5);
                        layoutParams10.height = SizeUtils.dp2px(fFloatValue6);
                        imageView8.setLayoutParams(layoutParams10);
                    }
                }
                IconSize iconSize5 = increaseThemeInfo.iconSize2;
                if (iconSize5 != null) {
                    Float f27 = iconSize5.width;
                    float fFloatValue7 = f27 != null ? f27.floatValue() : 0.0f;
                    Float f28 = iconSize5.height;
                    float fFloatValue8 = f28 != null ? f28.floatValue() : 0.0f;
                    if (fFloatValue7 > 0.0f && fFloatValue8 > 0.0f) {
                        ViewGroup.LayoutParams layoutParams11 = imageView9.getLayoutParams();
                        layoutParams11.width = SizeUtils.dp2px(fFloatValue7);
                        layoutParams11.height = SizeUtils.dp2px(fFloatValue8);
                        imageView9.setLayoutParams(layoutParams11);
                    }
                }
                String str12 = !TextUtils.isEmpty(item.increaseIcon) ? item.increaseIcon : increaseThemeInfo.iconUrl;
                boolean zIsEmpty6 = TextUtils.isEmpty(str12);
                p220oa.h.s(imageView8, !zIsEmpty6);
                if (!zIsEmpty6) {
                    r0.l1(str12, imageView8);
                }
                String str13 = !TextUtils.isEmpty(item.increaseArrowIcon) ? item.increaseArrowIcon : increaseThemeInfo.iconUrl2;
                boolean zIsEmpty7 = TextUtils.isEmpty(str13);
                p220oa.h.s(imageView9, !zIsEmpty7);
                if (!zIsEmpty7) {
                    r0.l1(str13, imageView9);
                }
            }
            Unit unit24 = Unit.f38893a;
        }
        Eb.a.b(baseViewHolder, item, productThemeInfoC != null ? productThemeInfoC.button : null);
        Eb.a.c(baseViewHolder, item, false, false, false, 48);
    }

    @Override // T1.b
    public final int d() {
        return Gb.O.f3244d.getITEM_VIEW_TYPE_INSTALLMENT_LOAN_V3();
    }

    @Override // T1.b
    public final int e() {
        return Ya.f.cs_cl_product_info_with_top_decoration_v3_view;
    }

    public final void k(BaseViewHolder baseViewHolder, boolean z3, ProductContentInfo productContentInfo) {
        String str;
        this.f3803e = z3;
        int i7 = Ya.e.tvRightBorrowed;
        if (z3) {
            str = "";
        } else {
            str = productContentInfo != null ? productContentInfo.extraInfoTitle : null;
        }
        baseViewHolder.setText(i7, str);
        baseViewHolder.setGone(Ya.e.groupExpanded, !z3);
        boolean z8 = true;
        baseViewHolder.setGone(Ya.e.viewTopAd, (z3 && this.f3804f) ? false : true);
        baseViewHolder.setGone(Ya.e.ivLoanableAmountIcon, TextUtils.isEmpty(productContentInfo != null ? productContentInfo.tempQuotaDesc : null) || !z3);
        int i10 = Ya.e.layoutUnlockIncrease;
        if (z3) {
            if (!TextUtils.isEmpty(productContentInfo != null ? productContentInfo.increaseTitle : null)) {
                z8 = false;
            }
        }
        baseViewHolder.setGone(i10, z8);
        j((IconicsImageView) baseViewHolder.getView(Ya.e.ivBorrowedArrow), z3);
        Space space = (Space) baseViewHolder.getView(Ya.e.topSpace);
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = SizeUtils.dp2px(p220oa.h.e(baseViewHolder.getView(Ya.e.tvLoanTerms)) ? 40.0f : 12.0f);
        space.setLayoutParams(layoutParams2);
    }
}
