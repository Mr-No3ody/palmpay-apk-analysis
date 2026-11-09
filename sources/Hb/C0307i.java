package Hb;

import Ab.ViewOnClickListenerC0053e;
import Pa.r0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.credit.bean.ExtraInfo;
import com.transsnet.palmpay.credit.bean.ExtraThemeInfo;
import com.transsnet.palmpay.credit.bean.IconSize;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoButton;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoCard;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoNameArea;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoText;
import com.transsnet.palmpay.credit.bean.TitleFont;
import com.transsnet.palmpay.credit.bean.TopArea;
import com.transsnet.palmpay.credit.view.ProductContentListAdapter$OnApplyClickListener;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hb.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0307i extends T1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3831e = 0;

    static {
        new C0304f(null);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x038c  */
    @Override // T1.b
    public final void b(final BaseViewHolder holder, Object obj) {
        ExtraThemeInfo extraThemeInfo;
        String str;
        ExtraThemeInfo extraThemeInfo2;
        String str2;
        String str3;
        CornerRadius cornerRadius;
        ProductThemeInfoText productThemeInfoText;
        String str4;
        String str5;
        TitleFont titleFont;
        Float f10;
        String str6;
        TitleFont titleFont2;
        Float f11;
        String str7;
        TitleFont titleFont3;
        Float f12;
        String str8;
        TitleFont titleFont4;
        Float f13;
        String str9;
        TitleFont titleFont5;
        Float f14;
        TitleFont titleFont6;
        Float f15;
        String str10;
        TitleFont titleFont7;
        Float f16;
        String str11;
        TitleFont titleFont8;
        Float f17;
        String str12;
        TopArea topArea;
        String str13;
        String str14;
        CornerRadius cornerRadius2;
        TopArea topArea2;
        String str15;
        TopArea topArea3;
        String str16;
        TopArea topArea4;
        IconSize iconSize;
        final ProductContentInfo item = (ProductContentInfo) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        F6.d.h("CashLoanItemProvider", 3, C0.G.o("convert >>> loanProduct=", item.loanProduct));
        ImageView imageView = (ImageView) holder.getView(Ya.e.ivInstallmentLoan);
        TextView textView = (TextView) holder.getView(Ya.e.tvLoanTerms);
        LinearLayout linearLayout = (LinearLayout) holder.getView(Ya.e.layoutBottom);
        PpButton ppButton = (PpButton) holder.getView(Ya.e.rtvBorrow);
        IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) holder.getView(Ya.e.checkAgreement);
        TextView textView2 = (TextView) holder.getView(Ya.e.tvApplicationAgreement);
        boolean zEquals = TextUtils.equals(item.status, "needApply");
        Integer num = item.accountType;
        boolean z3 = num != null && num.intValue() == 14;
        if (!zEquals || z3) {
            p220oa.h.s(iconicsCheckBox, false);
            p220oa.h.s(textView2, false);
            iconicsCheckBox.setOnCheckedChangeListener(null);
        } else {
            p220oa.h.s(iconicsCheckBox, true);
            p220oa.h.s(textView2, true);
            iconicsCheckBox.setChecked(true);
            Eb.a.d(c(), textView2);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) holder.getView(Ya.e.layoutContent);
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = TextUtils.isEmpty(item.topTitle) ? 0 : SizeUtils.dp2px(6.0f);
            constraintLayout.setLayoutParams(layoutParams2);
            Unit unit = Unit.f38893a;
        }
        p220oa.h.s(linearLayout, TextUtils.equals(item.status, "underReview") || TextUtils.equals(item.status, "declined"));
        p220oa.h.s(ppButton, (TextUtils.equals(item.status, "underReview") || TextUtils.equals(item.status, "declined") || TextUtils.equals(item.status, "assessment")) ? false : true);
        holder.setText(Ya.e.tvMiddleContent, item.applyTitle);
        holder.setGone(Ya.e.tvLoanTerms, TextUtils.isEmpty(item.topTitle));
        holder.setText(Ya.e.tvLoanTerms, item.topTitle);
        holder.setText(Ya.e.tvUnOpenedRight, item.subTitle);
        Space space = (Space) holder.getView(Ya.e.topSpace);
        if (space != null) {
            ViewGroup.LayoutParams layoutParams3 = space.getLayoutParams();
            Intrinsics.f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            ((ViewGroup.MarginLayoutParams) layoutParams4).height = SizeUtils.dp2px(TextUtils.isEmpty(item.topTitle) ? 12.0f : 40.0f);
            space.setLayoutParams(layoutParams4);
            Unit unit2 = Unit.f38893a;
        }
        holder.setGone(Ya.e.rtvFrozen, TextUtils.isEmpty(item.cardStatusTitle));
        holder.setText(Ya.e.rtvFrozen, item.cardStatusTitle);
        p220oa.h.s(holder.getView(Ya.e.groupUnOpened), C1847n.p(new String[]{"needApply", "calculating", "underReview", "declined", "assessment"}, item.status));
        p220oa.h.s(holder.getView(Ya.e.groupOpened), C1847n.p(new String[]{"canBorrow", "borrowed", "frozen", "disable"}, item.status));
        ((Group) holder.getView(Ya.e.groupConfinementPeriod)).setVisibility(TextUtils.equals(item.status, "assessment") ? 0 : 8);
        holder.setText(Ya.e.tvConfinementPeriodContent, item.subTitle2);
        holder.setText(Ya.e.tvConfinementPeriodSubContent, item.applyTitle);
        holder.setText(Ya.e.tvReapplyDate, item.applySubTitle);
        r0.l1(item.applyIcon, (ImageView) holder.getView(Ya.e.ivCalendar));
        r0.l1(item.applyIcon, (ImageView) holder.getView(Ya.e.ivLeftIcon));
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = holder.getBindingAdapter();
        Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
        boolean zD = ((Gb.O) bindingAdapter).f3254b.d();
        RecyclerView recyclerView = (RecyclerView) holder.getView(Ya.e.rvUnOpened);
        recyclerView.setLayoutManager(new GridLayoutManager(c(), 3, 1, false));
        int i7 = Ya.f.cs_cl_cash_loan_creative_point_item_view;
        List<ExtraInfo> list = item.extraInfoList;
        recyclerView.setAdapter(new C0305g(zD, holder, item, i7, list != null ? CollectionsKt.Z(list) : null));
        r0.l1(zD ? item.productIconDark : item.productIcon, (ImageView) holder.getView(Ya.e.ivInstallmentLoan));
        holder.setText(Ya.e.tvInstallmentLoan, item.productTitle);
        holder.setText(Ya.e.tvLoanableAmountTitle, item.amountTitle);
        holder.setText(Ya.e.tvUnOpenedLoanableAmountTitle, item.amountTitle);
        int i10 = Ya.e.tvLoanableAmount;
        Long l5 = item.amount;
        holder.setText(i10, r0.V1(r0.B(l5 != null ? l5.longValue() : 0L, true)));
        int i11 = Ya.e.tvUnOpenedLoanableAmount;
        Long l6 = item.amount;
        holder.setText(i11, r0.V1(r0.B(l6 != null ? l6.longValue() : 0L, true)));
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
            Unit unit3 = Unit.f38893a;
        }
        PpButton ppButton2 = (PpButton) holder.getView(Ya.e.rtvBorrow);
        if (ppButton2 != null) {
            Integer num2 = item.enable;
            ppButton2.setEnabled(num2 != null && num2.intValue() == 1);
            ppButton2.setText(item.button);
            final int i12 = 0;
            p220oa.h.l(new View.OnClickListener() { // from class: Hb.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseViewHolder baseViewHolder = holder;
                    C0307i c0307i = this;
                    ProductContentInfo productContentInfo = item;
                    switch (i12) {
                        case 0:
                            ProductContentListView.f30875c.addClickEvent(productContentInfo);
                            Set set = Eb.b.f2269a;
                            Eb.b.b(c0307i.c(), productContentInfo);
                            if (TextUtils.equals("needApply", productContentInfo.status) || TextUtils.equals("disable", productContentInfo.status) || TextUtils.equals("canBorrow", productContentInfo.status)) {
                                RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter3 = baseViewHolder.getBindingAdapter();
                                Intrinsics.f(bindingAdapter3, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                                ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener = ((Gb.O) bindingAdapter3).f3255c;
                                if (productContentListAdapter$OnApplyClickListener != null) {
                                    productContentListAdapter$OnApplyClickListener.onApplyClick(productContentInfo);
                                }
                            } else {
                                Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                            }
                            break;
                        default:
                            String[] elements = {"needApply", "disable", "canBorrow", "declined"};
                            Intrinsics.checkNotNullParameter(elements, "elements");
                            if (!CollectionsKt.A(C1847n.A(elements), productContentInfo.status)) {
                                Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                            } else {
                                Set set2 = Eb.b.f2269a;
                                Eb.b.b(c0307i.c(), productContentInfo);
                                RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter4 = baseViewHolder.getBindingAdapter();
                                Intrinsics.f(bindingAdapter4, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                                ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener2 = ((Gb.O) bindingAdapter4).f3255c;
                                if (productContentListAdapter$OnApplyClickListener2 != null) {
                                    productContentListAdapter$OnApplyClickListener2.onApplyClick(productContentInfo);
                                }
                            }
                            break;
                    }
                }
            }, ppButton2);
            Unit unit4 = Unit.f38893a;
        }
        final int i13 = 1;
        p220oa.h.l(new View.OnClickListener() { // from class: Hb.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseViewHolder baseViewHolder = holder;
                C0307i c0307i = this;
                ProductContentInfo productContentInfo = item;
                switch (i13) {
                    case 0:
                        ProductContentListView.f30875c.addClickEvent(productContentInfo);
                        Set set = Eb.b.f2269a;
                        Eb.b.b(c0307i.c(), productContentInfo);
                        if (TextUtils.equals("needApply", productContentInfo.status) || TextUtils.equals("disable", productContentInfo.status) || TextUtils.equals("canBorrow", productContentInfo.status)) {
                            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter3 = baseViewHolder.getBindingAdapter();
                            Intrinsics.f(bindingAdapter3, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                            ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener = ((Gb.O) bindingAdapter3).f3255c;
                            if (productContentListAdapter$OnApplyClickListener != null) {
                                productContentListAdapter$OnApplyClickListener.onApplyClick(productContentInfo);
                            }
                        } else {
                            Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                        }
                        break;
                    default:
                        String[] elements = {"needApply", "disable", "canBorrow", "declined"};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        if (!CollectionsKt.A(C1847n.A(elements), productContentInfo.status)) {
                            Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                        } else {
                            Set set2 = Eb.b.f2269a;
                            Eb.b.b(c0307i.c(), productContentInfo);
                            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter4 = baseViewHolder.getBindingAdapter();
                            Intrinsics.f(bindingAdapter4, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                            ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener2 = ((Gb.O) bindingAdapter4).f3255c;
                            if (productContentListAdapter$OnApplyClickListener2 != null) {
                                productContentListAdapter$OnApplyClickListener2.onApplyClick(productContentInfo);
                            }
                        }
                        break;
                }
            }
        }, linearLayout);
        View view = holder.getView(Ya.e.viewEmpty);
        if (view != null) {
            p220oa.h.l(new ViewOnClickListenerC0053e(18), view);
            Unit unit5 = Unit.f38893a;
        }
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter3 = holder.getBindingAdapter();
        Intrinsics.f(bindingAdapter3, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
        ProductThemeInfo productThemeInfoC = ((Gb.O) bindingAdapter3).f3254b.c(item.style);
        if (productThemeInfoC != null) {
            ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
            Intrinsics.f(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            ProductThemeInfoNameArea productThemeInfoNameArea = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea != null && (iconSize = productThemeInfoNameArea.productIconSize) != null) {
                Float f18 = iconSize.width;
                if ((f18 != null ? f18.floatValue() : 0.0f) > 0.0f) {
                    Float f19 = iconSize.width;
                    ((ViewGroup.MarginLayoutParams) layoutParams6).width = SizeUtils.dp2px(f19 != null ? f19.floatValue() : 0.0f);
                }
                Float f20 = iconSize.height;
                if ((f20 != null ? f20.floatValue() : 0.0f) > 0.0f) {
                    Float f21 = iconSize.height;
                    ((ViewGroup.MarginLayoutParams) layoutParams6).height = SizeUtils.dp2px(f21 != null ? f21.floatValue() : 0.0f);
                }
                Unit unit6 = Unit.f38893a;
            }
            imageView.setLayoutParams(layoutParams6);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) holder.getView(Ya.e.layoutContent);
            if (constraintLayout2 != null) {
                com.bumptech.glide.p pVarF = com.bumptech.glide.b.f(textView);
                Integer num3 = item.accountType;
                if (num3 != null && num3.intValue() == 9) {
                    ProductThemeInfoNameArea productThemeInfoNameArea2 = productThemeInfoC.nameArea;
                    if (productThemeInfoNameArea2 == null || (topArea4 = productThemeInfoNameArea2.topArea) == null) {
                        str13 = null;
                    } else {
                        str13 = topArea4.bgImage1;
                    }
                } else {
                    ProductThemeInfoNameArea productThemeInfoNameArea3 = productThemeInfoC.nameArea;
                    if (productThemeInfoNameArea3 == null || (topArea = productThemeInfoNameArea3.topArea) == null) {
                        str13 = null;
                    } else {
                        str13 = topArea.bgImage2;
                    }
                }
                com.bumptech.glide.m mVar = (com.bumptech.glide.m) pVarF.load(str13).a(new G1.d()).w(Integer.MIN_VALUE, Integer.MIN_VALUE);
                mVar.T(new C0306h(textView, productThemeInfoC), null, mVar, J1.g.f4461a);
                ProductThemeInfoNameArea productThemeInfoNameArea4 = productThemeInfoC.nameArea;
                if (productThemeInfoNameArea4 != null && (topArea3 = productThemeInfoNameArea4.topArea) != null && (str16 = topArea3.titleColor1) != null) {
                    Integer num4 = item.accountType;
                    if (num4 != null && num4.intValue() == 9) {
                        holder.setTextColor(Ya.e.tvLoanTerms, CommonViewExtKt.hexToColorInt(str16, c(), L6.b.ppColorTextPrimary));
                    }
                    Unit unit7 = Unit.f38893a;
                }
                ProductThemeInfoNameArea productThemeInfoNameArea5 = productThemeInfoC.nameArea;
                if (productThemeInfoNameArea5 != null && (topArea2 = productThemeInfoNameArea5.topArea) != null && (str15 = topArea2.titleColor2) != null) {
                    Integer num5 = item.accountType;
                    if (num5 == null || num5.intValue() != 9) {
                        holder.setTextColor(Ya.e.tvLoanTerms, CommonViewExtKt.hexToColorInt(str15, c(), L6.b.ppColorTextPrimary));
                    }
                    Unit unit8 = Unit.f38893a;
                }
                ProductThemeInfoCard productThemeInfoCard = productThemeInfoC.card;
                if (TextUtils.isEmpty(productThemeInfoCard != null ? productThemeInfoCard.bgImage : null)) {
                    ProductThemeInfoCard productThemeInfoCard2 = productThemeInfoC.card;
                    if (productThemeInfoCard2 != null && (str14 = productThemeInfoCard2.bgColor) != null && (cornerRadius2 = productThemeInfoCard2.cornerRadius) != null) {
                        constraintLayout2.setBackground(Eb.a.i(C1849p.c(str14), cornerRadius2, 0, -1));
                        Unit unit9 = Unit.f38893a;
                    }
                } else {
                    ProductThemeInfoCard productThemeInfoCard3 = productThemeInfoC.card;
                    r0.n1(constraintLayout2, productThemeInfoCard3 != null ? productThemeInfoCard3.bgImage : null);
                    Unit unit10 = Unit.f38893a;
                }
            }
            ProductThemeInfoNameArea productThemeInfoNameArea6 = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea6 != null && (str12 = productThemeInfoNameArea6.productTitleColor) != null) {
                holder.setTextColor(Ya.e.tvInstallmentLoan, CommonViewExtKt.hexToColorInt(str12, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoNameArea productThemeInfoNameArea7 = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea7 != null && (titleFont8 = productThemeInfoNameArea7.productTitleFont) != null && (f17 = titleFont8.fontSize) != null) {
                ((TextView) holder.getView(Ya.e.tvInstallmentLoan)).setTextSize(1, f17.floatValue());
                Unit unit11 = Unit.f38893a;
            }
            ProductThemeInfoText productThemeInfoText2 = productThemeInfoC.text;
            if (productThemeInfoText2 != null && (str11 = productThemeInfoText2.subTitleColor) != null) {
                holder.setTextColor(Ya.e.tvLoanableAmountTitle, CommonViewExtKt.hexToColorInt(str11, c(), L6.b.ppColorTextPrimary));
                holder.setTextColor(Ya.e.tvUnOpenedLoanableAmountTitle, CommonViewExtKt.hexToColorInt(str11, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoText productThemeInfoText3 = productThemeInfoC.text;
            if (productThemeInfoText3 != null && (titleFont7 = productThemeInfoText3.subTitleFont) != null && (f16 = titleFont7.fontSize) != null) {
                float fFloatValue = f16.floatValue();
                ((TextView) holder.getView(Ya.e.tvLoanableAmountTitle)).setTextSize(1, fFloatValue);
                ((TextView) holder.getView(Ya.e.tvUnOpenedLoanableAmountTitle)).setTextSize(1, fFloatValue);
                Unit unit12 = Unit.f38893a;
            }
            ProductThemeInfoText productThemeInfoText4 = productThemeInfoC.text;
            if (productThemeInfoText4 != null && (str10 = productThemeInfoText4.subTitleColor) != null) {
                holder.setTextColor(Ya.e.tvLoanPeriodTitle, CommonViewExtKt.hexToColorInt(str10, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoText productThemeInfoText5 = productThemeInfoC.text;
            if (productThemeInfoText5 != null && (titleFont6 = productThemeInfoText5.subTitleFont) != null && (f15 = titleFont6.fontSize) != null) {
                ((TextView) holder.getView(Ya.e.tvLoanPeriodTitle)).setTextSize(1, f15.floatValue());
                Unit unit13 = Unit.f38893a;
            }
            TextView textView4 = (TextView) holder.getView(Ya.e.tvLoanPeriod);
            if (textView4 != null) {
                ProductThemeInfoText productThemeInfoText6 = productThemeInfoC.text;
                if (productThemeInfoText6 != null && (titleFont5 = productThemeInfoText6.amountTitleFont) != null && (f14 = titleFont5.fontSize) != null) {
                    textView4.setTextSize(1, f14.floatValue());
                    Unit unit14 = Unit.f38893a;
                }
                ProductThemeInfoText productThemeInfoText7 = productThemeInfoC.text;
                if (productThemeInfoText7 != null && (str9 = productThemeInfoText7.amountColor) != null) {
                    textView4.setTextColor(CommonViewExtKt.hexToColorInt(str9, c(), L6.b.ppColorTextPrimary));
                    Unit unit15 = Unit.f38893a;
                }
            }
            TextView textView5 = (TextView) holder.getView(Ya.e.tvLoanPeriodDays);
            if (textView5 != null) {
                ProductThemeInfoText productThemeInfoText8 = productThemeInfoC.text;
                if (productThemeInfoText8 != null && (titleFont4 = productThemeInfoText8.unitTitleFont) != null && (f13 = titleFont4.fontSize) != null) {
                    textView5.setTextSize(1, f13.floatValue());
                    Unit unit16 = Unit.f38893a;
                }
                ProductThemeInfoText productThemeInfoText9 = productThemeInfoC.text;
                if (productThemeInfoText9 != null && (str8 = productThemeInfoText9.unitTitleColor) != null) {
                    textView5.setTextColor(CommonViewExtKt.hexToColorInt(str8, c(), L6.b.ppColorTextPrimary));
                    Unit unit17 = Unit.f38893a;
                }
            }
            TextView textView6 = (TextView) holder.getView(Ya.e.tvLoanableAmount);
            if (textView6 != null) {
                ProductThemeInfoText productThemeInfoText10 = productThemeInfoC.text;
                if (productThemeInfoText10 != null && (titleFont3 = productThemeInfoText10.amountTitleFont) != null && (f12 = titleFont3.fontSize) != null) {
                    textView6.setTextSize(1, f12.floatValue());
                    Unit unit18 = Unit.f38893a;
                }
                ProductThemeInfoText productThemeInfoText11 = productThemeInfoC.text;
                if (productThemeInfoText11 != null && (str7 = productThemeInfoText11.amountColor) != null) {
                    textView6.setTextColor(CommonViewExtKt.hexToColorInt(str7, c(), L6.b.ppColorTextPrimary));
                    Unit unit19 = Unit.f38893a;
                }
            }
            TextView textView7 = (TextView) holder.getView(Ya.e.tvUnOpenedLoanableAmount);
            if (textView7 != null) {
                ProductThemeInfoText productThemeInfoText12 = productThemeInfoC.text;
                if (productThemeInfoText12 != null && (titleFont2 = productThemeInfoText12.amountFont) != null && (f11 = titleFont2.fontSize) != null) {
                    textView7.setTextSize(1, f11.floatValue());
                    Unit unit20 = Unit.f38893a;
                }
                ProductThemeInfoText productThemeInfoText13 = productThemeInfoC.text;
                if (productThemeInfoText13 != null && (str6 = productThemeInfoText13.amountColor) != null) {
                    textView7.setTextColor(CommonViewExtKt.hexToColorInt(str6, c(), L6.b.ppColorTextPrimary));
                    Unit unit21 = Unit.f38893a;
                }
            }
            TextView textView8 = (TextView) holder.getView(Ya.e.tvUnOpenedRight);
            if (textView8 != null) {
                ProductThemeInfoText productThemeInfoText14 = productThemeInfoC.text;
                if (productThemeInfoText14 != null && (titleFont = productThemeInfoText14.subTitleFont) != null && (f10 = titleFont.fontSize) != null) {
                    textView8.setTextSize(1, f10.floatValue());
                    Unit unit22 = Unit.f38893a;
                }
                ProductThemeInfoText productThemeInfoText15 = productThemeInfoC.text;
                if (productThemeInfoText15 != null && (str5 = productThemeInfoText15.subTitleColor) != null) {
                    textView8.setTextColor(CommonViewExtKt.hexToColorInt(str5, c(), L6.b.ppColorTextPrimary));
                    Unit unit23 = Unit.f38893a;
                }
            }
            TextView textView9 = (TextView) holder.getView(Ya.e.tvDailyInterest);
            if (textView9 != null && (productThemeInfoText = productThemeInfoC.text) != null && (str4 = productThemeInfoText.subTitleColor) != null) {
                textView9.setTextColor(CommonViewExtKt.hexToColorInt(str4, c(), L6.b.ppColorTextPrimary));
                Unit unit24 = Unit.f38893a;
            }
            ExtraThemeInfo extraThemeInfo3 = productThemeInfoC.extraInfo;
            if (extraThemeInfo3 != null && (str3 = extraThemeInfo3.bgColor) != null && (cornerRadius = extraThemeInfo3.cornerRadius) != null) {
                linearLayout.setBackground(Eb.a.i(C1849p.c(str3), cornerRadius, 0, -1));
                Unit unit25 = Unit.f38893a;
            }
            TextView textView10 = (TextView) holder.getView(Ya.e.tvMiddleContent);
            if (textView10 != null && (extraThemeInfo2 = productThemeInfoC.extraInfo) != null && (str2 = extraThemeInfo2.titleColor) != null) {
                textView10.setTextColor(CommonViewExtKt.hexToColorInt(str2, c(), L6.b.ppColorTextPrimary));
                Unit unit26 = Unit.f38893a;
            }
            ImageView imageView2 = (ImageView) holder.getView(Ya.e.ivArrowRight);
            if (imageView2 != null && (extraThemeInfo = productThemeInfoC.extraInfo) != null && (str = extraThemeInfo.titleColor) != null) {
                imageView2.setImageTintList(ColorStateList.valueOf(CommonViewExtKt.hexToColorInt(str, c(), L6.b.ppColorTextPrimary)));
                Unit unit27 = Unit.f38893a;
            }
            ProductThemeInfoButton productThemeInfoButton = productThemeInfoC.button;
            if (productThemeInfoButton != null) {
                List<String> list2 = productThemeInfoButton.bgColor;
                if (list2 != null) {
                    if (!list2.isEmpty()) {
                        Context contextC = c();
                        String str17 = (String) CollectionsKt.F(list2);
                        int iHexToColorInt = str17 != null ? CommonViewExtKt.hexToColorInt(str17, contextC, L6.b.ppColorTextPrimary) : -16777216;
                        IconicsDrawable checkedIcon = iconicsCheckBox.getCheckedIcon();
                        if (checkedIcon != null) {
                            D3.a.F(checkedIcon, iHexToColorInt);
                            Unit unit28 = Unit.f38893a;
                        }
                        IconicsDrawable uncheckedIcon = iconicsCheckBox.getUncheckedIcon();
                        if (uncheckedIcon != null) {
                            D3.a.F(uncheckedIcon, iHexToColorInt);
                            Unit unit29 = Unit.f38893a;
                        }
                    }
                    CornerRadius cornerRadius3 = productThemeInfoButton.cornerRadius;
                    if (cornerRadius3 != null) {
                        ppButton.setBackground(Eb.a.i(list2, cornerRadius3, 0, -1));
                        Unit unit30 = Unit.f38893a;
                    }
                }
                if (!TextUtils.isEmpty(productThemeInfoButton.titleColor)) {
                    ppButton.setTextColor(Color.parseColor(productThemeInfoButton.titleColor));
                }
                Unit unit31 = Unit.f38893a;
            }
        }
    }

    @Override // T1.b
    public final int d() {
        return Gb.O.f3244d.getITEM_VIEW_TYPE_CASH_LOAN();
    }

    @Override // T1.b
    public final int e() {
        return Ya.f.cs_cl_product_info_view;
    }
}
