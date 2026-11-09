package Hb;

import Pa.n0;
import Pa.r0;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.credit.bean.Dark;
import com.transsnet.palmpay.credit.bean.ExtraInfo;
import com.transsnet.palmpay.credit.bean.IconSize;
import com.transsnet.palmpay.credit.bean.Light;
import com.transsnet.palmpay.credit.bean.LoanHomeThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoButton;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoCard;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoNameArea;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoText;
import com.transsnet.palmpay.credit.bean.TitleFont;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hb.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0302d extends T1.b {
    static {
        new C0300b(null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00d5  */
    @Override // T1.b
    public final void b(BaseViewHolder helper, Object obj) {
        List<ProductThemeInfo> list;
        Object next;
        CornerRadius cornerRadius;
        TitleFont titleFont;
        Float f10;
        String str;
        TitleFont titleFont2;
        Float f11;
        String str2;
        TitleFont titleFont3;
        Float f12;
        String str3;
        IconSize iconSize;
        Float f13;
        IconSize iconSize2;
        Float f14;
        String str4;
        CornerRadius cornerRadius2;
        ProductContentInfo item = (ProductContentInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        F6.d.h("BusinessLoanUnCreditItemProvider", 3, C0.G.o("convert >>> loanProduct=", item.loanProduct));
        if (Intrinsics.c(item.loanProduct, "PALMPAY_BUSINESS_LOAN") && !p059e1.a.f35991d) {
            n0.g().v("BusinessLoanCreditLoanPageShow");
        }
        ImageView imageView = (ImageView) helper.getView(Ya.e.ivProductIcon);
        TextView textView = (TextView) helper.getView(Ya.e.tvProductTitle);
        TextView textView2 = (TextView) helper.getView(Ya.e.tvLoanAmountTitle);
        TextView textView3 = (TextView) helper.getView(Ya.e.tvLoanAmountValue);
        TextView textView4 = (TextView) helper.getView(Ya.e.tvLoanApply);
        RecyclerView recyclerView = (RecyclerView) helper.getView(Ya.e.rvLoanInfoView);
        helper.setText(Ya.e.tvLoanAmountTitle, item.amountTitle);
        Long l5 = item.amount;
        helper.setText(Ya.e.tvLoanAmountValue, r0.V1(r0.B(l5 != null ? l5.longValue() : 0L, true)));
        int i7 = Ya.f.cs_cl_business_loan_apply_info_item;
        recyclerView.setLayoutManager(new GridLayoutManager(c(), 3, 1, false));
        List<ExtraInfo> list2 = item.extraInfoList;
        recyclerView.setAdapter(new C0301c(i7, this, helper, item, list2 != null ? CollectionsKt.Z(list2) : null));
        LoanHomeThemeInfo loanHomeThemeInfo = p186mb.d.f39634e.getInstance().f39637b;
        if (loanHomeThemeInfo == null) {
            list = null;
        } else if (((BaseActivity) c()).isDarkMode()) {
            Dark dark = loanHomeThemeInfo.dark;
            if (dark != null) {
                list = dark.productThemeInfo;
            } else {
                list = null;
            }
        } else {
            Light light = loanHomeThemeInfo.light;
            if (light != null) {
                list = light.productThemeInfo;
            } else {
                list = null;
            }
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!TextUtils.equals(item.style, ((ProductThemeInfo) next).style));
            ProductThemeInfo productThemeInfo = (ProductThemeInfo) next;
            if (productThemeInfo != null) {
                ProductThemeInfoCard productThemeInfoCard = productThemeInfo.card;
                if (TextUtils.isEmpty(productThemeInfoCard != null ? productThemeInfoCard.bgImage : null)) {
                    ProductThemeInfoCard productThemeInfoCard2 = productThemeInfo.card;
                    if (productThemeInfoCard2 != null && (str4 = productThemeInfoCard2.bgColor) != null && (cornerRadius2 = productThemeInfoCard2.cornerRadius) != null) {
                        ((ConstraintLayout) helper.getView(Ya.e.viewRoot)).setBackground(Eb.a.i(C1849p.c(str4), cornerRadius2, 0, -1));
                    }
                } else {
                    View view = helper.getView(Ya.e.viewRoot);
                    ProductThemeInfoCard productThemeInfoCard3 = productThemeInfo.card;
                    r0.n1(view, productThemeInfoCard3 != null ? productThemeInfoCard3.bgImage : null);
                }
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ProductThemeInfoNameArea productThemeInfoNameArea = productThemeInfo.nameArea;
                float fFloatValue = (productThemeInfoNameArea == null || (iconSize2 = productThemeInfoNameArea.productIconSize) == null || (f14 = iconSize2.width) == null) ? 0.0f : f14.floatValue();
                ProductThemeInfoNameArea productThemeInfoNameArea2 = productThemeInfo.nameArea;
                float fFloatValue2 = (productThemeInfoNameArea2 == null || (iconSize = productThemeInfoNameArea2.productIconSize) == null || (f13 = iconSize.height) == null) ? 0.0f : f13.floatValue();
                if (fFloatValue > 0.0f && fFloatValue2 > 0.0f) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = SizeUtils.dp2px(fFloatValue);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = SizeUtils.dp2px(fFloatValue2);
                }
                imageView.setLayoutParams(layoutParams2);
                ProductThemeInfoNameArea productThemeInfoNameArea3 = productThemeInfo.nameArea;
                if (productThemeInfoNameArea3 != null && (str3 = productThemeInfoNameArea3.productTitleColor) != null) {
                    textView.setTextColor(Color.parseColor(str3));
                }
                ProductThemeInfoNameArea productThemeInfoNameArea4 = productThemeInfo.nameArea;
                if (productThemeInfoNameArea4 != null && (titleFont3 = productThemeInfoNameArea4.productTitleFont) != null && (f12 = titleFont3.fontSize) != null) {
                    textView.setTextSize(2, f12.floatValue());
                }
                ProductThemeInfoText productThemeInfoText = productThemeInfo.text;
                if (productThemeInfoText != null && (str2 = productThemeInfoText.titleColor) != null) {
                    textView2.setTextColor(Color.parseColor(str2));
                }
                ProductThemeInfoText productThemeInfoText2 = productThemeInfo.text;
                if (productThemeInfoText2 != null && (titleFont2 = productThemeInfoText2.titleFont) != null && (f11 = titleFont2.fontSize) != null) {
                    textView2.setTextSize(2, f11.floatValue());
                }
                ProductThemeInfoText productThemeInfoText3 = productThemeInfo.text;
                if (productThemeInfoText3 != null && (str = productThemeInfoText3.amountColor) != null) {
                    textView3.setTextColor(Color.parseColor(str));
                }
                ProductThemeInfoText productThemeInfoText4 = productThemeInfo.text;
                if (productThemeInfoText4 != null && (titleFont = productThemeInfoText4.amountFont) != null && (f10 = titleFont.fontSize) != null) {
                    textView3.setTextSize(2, f10.floatValue());
                }
                ProductThemeInfoButton productThemeInfoButton = productThemeInfo.button;
                if (productThemeInfoButton != null) {
                    List<String> list3 = productThemeInfoButton.bgColor;
                    if (list3 != null && (cornerRadius = productThemeInfoButton.cornerRadius) != null) {
                        textView4.setBackground(Eb.a.i(list3, cornerRadius, 0, -1));
                    }
                    if (!TextUtils.isEmpty(productThemeInfoButton.titleColor)) {
                        textView4.setTextColor(Color.parseColor(productThemeInfoButton.titleColor));
                    }
                }
            }
        }
        r0.l1(((BaseActivity) c()).isDarkMode() ? item.productIconDark : item.productIcon, imageView);
        textView4.setText(item.button);
        Integer num = item.enable;
        textView4.setEnabled(num != null && num.intValue() == 1);
        p220oa.h.l(new ViewOnClickListenerC0299a(item, helper, 0), textView4);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        p220oa.h.l(new ViewOnClickListenerC0299a(item, helper, 1), itemView);
    }

    @Override // T1.b
    public final int d() {
        return Gb.O.f3244d.getITEM_VIEW_TYPE_BUSINESS_LOAN_UNCREDIT();
    }

    @Override // T1.b
    public final int e() {
        return Ya.f.cs_cl_business_loan_uncredit_view;
    }
}
