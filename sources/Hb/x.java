package Hb;

import Pa.r0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.credit.bean.Dark;
import com.transsnet.palmpay.credit.bean.Light;
import com.transsnet.palmpay.credit.bean.LoanHomeThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoButton;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoCard;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoText;
import com.transsnet.palmpay.credit.bean.TitleFont;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends T1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AnimatorSet f3855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ae.n f3856f = new Ae.n(this, 19);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f3857g = C2131j.b(new G9.j(7));

    static {
        new v(null);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x02b9  */
    @Override // T1.b
    public final void b(BaseViewHolder helper, Object obj) {
        String strV1;
        Light light;
        List<ProductThemeInfo> list;
        ProductThemeInfo productThemeInfo;
        TitleFont titleFont;
        String str;
        TitleFont titleFont2;
        String str2;
        List<String> list2;
        CornerRadius cornerRadius;
        Object next;
        Dark dark;
        AnimatorSet animatorSet;
        ProductContentInfo item = (ProductContentInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) helper.getView(Ya.e.ivBg);
        View view = helper.getView(Ya.e.groupConfinementPeriod);
        View view2 = helper.getView(Ya.e.layoutNormal);
        View view3 = helper.getView(Ya.e.layoutReview);
        PpButton ppButton = (PpButton) helper.getView(Ya.e.layoutReviewBtn);
        TextView textView = (TextView) helper.getView(Ya.e.tvApplicationAgreement);
        TextView textView2 = (TextView) helper.getView(Ya.e.open_flexi_tv);
        View view4 = helper.getView(Ya.e.checkAgreement);
        View view5 = helper.getView(Ya.e.layoutGetMoneyNow);
        int i7 = 4;
        TextView textView3 = (TextView) helper.getView(Ya.e.tvAmount);
        TextView textView4 = (TextView) helper.getView(Ya.e.tvTitle);
        ImageView imageView2 = (ImageView) helper.getView(Ya.e.ivGift);
        ImageView imageView3 = (ImageView) helper.getView(Ya.e.ivFinger);
        ImageView imageView4 = (ImageView) helper.getView(Ya.e.ivCalendar);
        TextView textView5 = (TextView) helper.getView(Ya.e.tvConfinementPeriodContent);
        TextView textView6 = (TextView) helper.getView(Ya.e.tvConfinementPeriodSubContent);
        TextView textView7 = (TextView) helper.getView(Ya.e.tvReapplyDate);
        p220oa.h.s(view, TextUtils.equals(item.status, "assessment"));
        p220oa.h.s(view2, !TextUtils.equals(item.status, "assessment"));
        p220oa.h.s(view3, TextUtils.equals(item.status, "underReview") || TextUtils.equals(item.status, "declined"));
        boolean zEquals = TextUtils.equals(item.status, "assessment");
        p220oa.h.s(textView, !zEquals);
        if (!zEquals) {
            int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, c());
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
            textView.setText(new SpanUtils().append("I have read, understood and agreed to ").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, textView.getContext())).append("Credit Limit Application Agreement,").setUnderline().setForegroundColor(iColorInt).setClickSpan(new Dd.d(iColorInt, 6)).append(" ").append("Loan Terms,").setForegroundColor(iColorInt).setUnderline().setClickSpan(new Dd.d(iColorInt, 7)).append(" ").append("Privacy Policy.").setForegroundColor(iColorInt).setUnderline().setForegroundColor(iColorInt).setClickSpan(new Dd.d(iColorInt, 8)).create());
        }
        p220oa.h.s(view4, !TextUtils.equals(item.status, "assessment"));
        boolean z3 = (TextUtils.equals(item.status, "assessment") || TextUtils.equals(item.status, "underReview") || TextUtils.equals(item.status, "declined")) ? false : true;
        p220oa.h.s(view5, z3);
        if (TextUtils.isEmpty(item.maxCreditQuota)) {
            Long l5 = item.amount;
            strV1 = r0.V1(r0.B(l5 != null ? l5.longValue() : 0L, true));
        } else {
            strV1 = item.maxCreditQuota;
        }
        textView3.setText(strV1);
        textView4.setText(item.amountTitle);
        j();
        if (this.f3855e == null && z3) {
            Ae.n nVar = this.f3856f;
            if (imageView3 != null) {
                p220oa.h.s(imageView3, true);
                float translationX = imageView3.getTranslationX();
                float translationY = imageView3.getTranslationY();
                float fDp2px = SizeUtils.dp2px(5.0f);
                float f10 = translationX - fDp2px;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView3, "translationX", translationX, f10, translationX, f10, translationX);
                float f11 = translationY - fDp2px;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView3, "translationY", translationY, f11, translationY, f11, translationY);
                animatorSet = new AnimatorSet();
                AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat2);
                if (builderPlay != null) {
                    builderPlay.with(objectAnimatorOfFloat);
                }
                animatorSet.setDuration(1330L);
                animatorSet.start();
                animatorSet.addListener(new w(0, this, nVar));
            } else {
                animatorSet = null;
            }
            this.f3855e = animatorSet;
        }
        if (!TextUtils.isEmpty(item.giftImage)) {
            r0.l1(item.giftImage, imageView2);
        }
        if (TextUtils.equals(item.status, "assessment")) {
            textView5.setText(item.subTitle2);
            textView6.setText(item.applyTitle);
            textView7.setText(item.applySubTitle);
            String str3 = ((BaseActivity) c()).isDarkMode() ? item.applyIconDark : item.applyIcon;
            if (TextUtils.isEmpty(str3)) {
                r0.l1("https://static.chuanyinet.com/images/calendare3c81214-01f6-4f.png", imageView4);
            } else {
                r0.l1(str3, imageView4);
            }
        }
        p220oa.h.l(new ViewOnClickListenerC0299a(item, helper, i7), textView2);
        String str4 = item.style;
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
            } while (!TextUtils.equals(str4, ((ProductThemeInfo) next).style));
            productThemeInfo = (ProductThemeInfo) next;
        } else {
            productThemeInfo = null;
        }
        if (productThemeInfo != null) {
            ProductThemeInfoCard productThemeInfoCard = productThemeInfo.card;
            if (!TextUtils.isEmpty(productThemeInfoCard != null ? productThemeInfoCard.bgImage : null)) {
                ProductThemeInfoCard productThemeInfoCard2 = productThemeInfo.card;
                r0.r1(productThemeInfoCard2 != null ? productThemeInfoCard2.bgImage : null, imageView);
            } else if (((BaseActivity) c()).isDarkMode()) {
                r0.r1("https://static.chuanyinet.com/images/Frame%201686556545c7e93428-d584-4b.png", imageView);
            } else {
                r0.r1("https://static.chuanyinet.com/images/Group%20159788538699660eda-3253-4e.png", imageView);
            }
            ProductThemeInfoButton productThemeInfoButton = productThemeInfo.button;
            if (productThemeInfoButton != null && (list2 = productThemeInfoButton.bgColor) != null && (cornerRadius = productThemeInfoButton.cornerRadius) != null && ppButton != null) {
                ppButton.setBackground(Eb.a.i(list2, cornerRadius, 0, -1));
            }
            ProductThemeInfoText productThemeInfoText = productThemeInfo.text;
            if (productThemeInfoText != null && (str2 = productThemeInfoText.titleColor) != null) {
                textView4.setTextColor(CommonViewExtKt.hexToColorInt(str2, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoText productThemeInfoText2 = productThemeInfo.text;
            if (productThemeInfoText2 != null && (titleFont2 = productThemeInfoText2.amountFont) != null) {
                titleFont2.applyTheme(textView3);
            }
            ProductThemeInfoText productThemeInfoText3 = productThemeInfo.text;
            if (productThemeInfoText3 != null && (str = productThemeInfoText3.amountColor) != null) {
                textView3.setTextColor(CommonViewExtKt.hexToColorInt(str, c(), L6.b.ppColorTextPrimary));
            }
            ProductThemeInfoText productThemeInfoText4 = productThemeInfo.text;
            if (productThemeInfoText4 == null || (titleFont = productThemeInfoText4.titleFont) == null) {
                return;
            }
            titleFont.applyTheme(textView4);
        }
    }

    @Override // T1.b
    public final int d() {
        return Gb.O.f3244d.getITEM_VIEW_TYPE_INSTALLMENT_LOAN_UNCREDIT_V2();
    }

    @Override // T1.b
    public final int e() {
        return Ya.f.cs_cl_installment_loan_uncredit_v2_view;
    }

    @Override // T1.b
    public final void h(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.h(holder);
        j();
    }

    @Override // T1.b
    public final void i(BaseViewHolder viewHolder, int i7) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) viewHolder.getView(Ya.e.checkAgreement);
        TextView textView = (TextView) viewHolder.getView(Ya.e.open_flexi_tv);
        if (iconicsCheckBox != null) {
            iconicsCheckBox.setOnCheckedChangeListener(new u(textView, this, 0));
        }
    }

    public final void j() {
        F6.d.h("InstallmentLoanUnCreditV2ItemProvider", 3, "stopAnimation");
        AnimatorSet animatorSet = this.f3855e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f3855e = null;
        ((Handler) this.f3857g.getValue()).removeCallbacks(this.f3856f);
    }
}
