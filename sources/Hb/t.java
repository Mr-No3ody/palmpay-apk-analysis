package Hb;

import Pa.r0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.credit.bean.Dark;
import com.transsnet.palmpay.credit.bean.ExtraThemeInfo;
import com.transsnet.palmpay.credit.bean.IconSize;
import com.transsnet.palmpay.credit.bean.Light;
import com.transsnet.palmpay.credit.bean.LoanHomeThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoButton;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoCard;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoNameArea;
import com.transsnet.palmpay.credit.bean.TitleFont;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends T1.b {
    static {
        new C0316s(null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    @Override // T1.b
    public final void b(BaseViewHolder helper, Object obj) {
        Light light;
        List<ProductThemeInfo> list;
        Object next;
        IconSize iconSize;
        Float f10;
        IconSize iconSize2;
        Float f11;
        IconSize iconSize3;
        Float f12;
        IconSize iconSize4;
        Float f13;
        CornerRadius cornerRadius;
        String str;
        TitleFont titleFont;
        Float f14;
        String str2;
        CornerRadius cornerRadius2;
        Dark dark;
        ProductContentInfo item = (ProductContentInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        F6.d.h("InstallmentLoanUnCreditItemProvider", 3, C0.G.o("convert >>> loanProduct=", item.loanProduct));
        ImageView imageView = (ImageView) helper.getView(Ya.e.ivTitleIcon);
        TextView textView = (TextView) helper.getView(Ya.e.tvContent);
        ImageView imageView2 = (ImageView) helper.getView(Ya.e.ivRightArrow);
        p220oa.h.s(imageView2, TextUtils.equals(item.status, "declined") || TextUtils.equals(item.status, "underReview"));
        helper.setGone(Ya.e.ivApprovalIcon, TextUtils.isEmpty(item.applyIcon));
        if (((BaseActivity) c()).isDarkMode()) {
            LoanHomeThemeInfo loanHomeThemeInfo = p186mb.d.f39634e.getInstance().f39637b;
            if (loanHomeThemeInfo == null || (dark = loanHomeThemeInfo.dark) == null) {
                list = null;
            } else {
                list = dark.productThemeInfo;
            }
        } else {
            LoanHomeThemeInfo loanHomeThemeInfo2 = p186mb.d.f39634e.getInstance().f39637b;
            if (loanHomeThemeInfo2 == null || (light = loanHomeThemeInfo2.light) == null) {
                list = null;
            } else {
                list = light.productThemeInfo;
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
                    if (productThemeInfoCard2 != null && (str2 = productThemeInfoCard2.bgColor) != null && (cornerRadius2 = productThemeInfoCard2.cornerRadius) != null) {
                        ((ConstraintLayout) helper.getView(Ya.e.viewRoot)).setBackground(Eb.a.i(C1849p.c(str2), cornerRadius2, 0, -1));
                    }
                } else {
                    View view = helper.getView(Ya.e.viewRoot);
                    ProductThemeInfoCard productThemeInfoCard3 = productThemeInfo.card;
                    r0.n1(view, productThemeInfoCard3 != null ? productThemeInfoCard3.bgImage : null);
                }
                ExtraThemeInfo extraThemeInfo = productThemeInfo.extraInfo;
                if (extraThemeInfo != null && !TextUtils.isEmpty(extraThemeInfo.titleColor)) {
                    Context contextC = c();
                    String str3 = extraThemeInfo.titleColor;
                    textView.setTextColor(str3 != null ? CommonViewExtKt.hexToColorInt(str3, contextC, L6.b.ppColorTextPrimary) : -16777216);
                }
                ExtraThemeInfo extraThemeInfo2 = productThemeInfo.extraInfo;
                if (extraThemeInfo2 != null && (titleFont = extraThemeInfo2.titleFont) != null && (f14 = titleFont.fontSize) != null) {
                    textView.setTextSize(1, f14.floatValue());
                }
                ExtraThemeInfo extraThemeInfo3 = productThemeInfo.extraInfo;
                if (extraThemeInfo3 != null && (str = extraThemeInfo3.titleColor) != null) {
                    imageView2.setImageTintList(ColorStateList.valueOf(CommonViewExtKt.hexToColorInt(str, c(), L6.b.ppColorTextPrimary)));
                }
                ProductThemeInfoButton productThemeInfoButton = productThemeInfo.button;
                if (productThemeInfoButton != null) {
                    TextView textView2 = (TextView) helper.getView(Ya.e.tvApply);
                    List<String> list2 = productThemeInfoButton.bgColor;
                    if (list2 != null && (cornerRadius = productThemeInfoButton.cornerRadius) != null) {
                        textView2.setBackground(Eb.a.i(list2, cornerRadius, 0, -1));
                    }
                    if (!TextUtils.isEmpty(productThemeInfoButton.titleColor)) {
                        Context contextC2 = c();
                        String str4 = productThemeInfoButton.titleColor;
                        textView2.setTextColor(str4 != null ? CommonViewExtKt.hexToColorInt(str4, contextC2, L6.b.ppColorTextPrimary) : -16777216);
                    }
                }
                if (TextUtils.equals(item.loanProduct, "PALMPAY_BUSINESS_LOAN")) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) helper.getView(Ya.e.viewRoot);
                    androidx.constraintlayout.widget.m mVar = new androidx.constraintlayout.widget.m();
                    mVar.e(constraintLayout);
                    mVar.g(Ya.e.tvApply, 3, Ya.e.ivApprovalIcon, 4);
                    mVar.g(Ya.e.tvApply, 6, 0, 6);
                    mVar.s(Ya.e.tvApply, 3, SizeUtils.dp2px(4.0f));
                    mVar.b(constraintLayout);
                }
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ProductThemeInfoNameArea productThemeInfoNameArea = productThemeInfo.nameArea;
                float fFloatValue = 0.0f;
                if (((productThemeInfoNameArea == null || (iconSize4 = productThemeInfoNameArea.productIconSize) == null || (f13 = iconSize4.width) == null) ? 0.0f : f13.floatValue()) > 0.0f) {
                    ProductThemeInfoNameArea productThemeInfoNameArea2 = productThemeInfo.nameArea;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = SizeUtils.dp2px((productThemeInfoNameArea2 == null || (iconSize3 = productThemeInfoNameArea2.productIconSize) == null || (f12 = iconSize3.width) == null) ? 0.0f : f12.floatValue());
                }
                ProductThemeInfoNameArea productThemeInfoNameArea3 = productThemeInfo.nameArea;
                if (((productThemeInfoNameArea3 == null || (iconSize2 = productThemeInfoNameArea3.productIconSize) == null || (f11 = iconSize2.height) == null) ? 0.0f : f11.floatValue()) > 0.0f) {
                    ProductThemeInfoNameArea productThemeInfoNameArea4 = productThemeInfo.nameArea;
                    if (productThemeInfoNameArea4 != null && (iconSize = productThemeInfoNameArea4.productIconSize) != null && (f10 = iconSize.height) != null) {
                        fFloatValue = f10.floatValue();
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = SizeUtils.dp2px(fFloatValue);
                }
                imageView.setLayoutParams(layoutParams2);
            }
        }
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = helper.getBindingAdapter();
        Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
        r0.l1(((Gb.O) bindingAdapter).f3254b.d() ? item.productIconDark : item.productIcon, imageView);
        r0.l1(item.applyIcon, (ImageView) helper.getView(Ya.e.ivApprovalIcon));
        helper.setGone(Ya.e.tvApply, !TextUtils.equals(item.status, "needApply"));
        helper.setGone(Ya.e.tvRightContent, !TextUtils.equals(item.status, "calculating"));
        helper.setText(Ya.e.tvRightContent, item.applySubTitle);
        helper.setGone(Ya.e.tvContent, TextUtils.isEmpty(item.applyTitle));
        TextView textView3 = (TextView) helper.getView(Ya.e.tvContent);
        if (textView3 != null && !TextUtils.isEmpty(item.applyTitle)) {
            p220oa.h.f(textView3, item.applyTitle);
        }
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        p220oa.h.l(new ViewOnClickListenerC0299a(item, helper, 3), itemView);
        ((TextView) helper.getView(Ya.e.tvApply)).setText(item.button);
    }

    @Override // T1.b
    public final int d() {
        return Gb.O.f3244d.getITEM_VIEW_TYPE_INSTALLMENT_LOAN_UNCREDIT();
    }

    @Override // T1.b
    public final int e() {
        return Ya.f.cs_cl_installment_loan_uncredit_view;
    }
}
