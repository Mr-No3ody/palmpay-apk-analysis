package p067ea;

import C0.G;
import F6.d;
import Pa.r0;
import T1.b;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.custom_view.r;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;
import p025ba.g;
import p025ba.k;
import p052da.C1647t;
import p052da.C1648u;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1648u f36242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1647t f36243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1647t f36244g;

    public c(C1648u isSelected, C1647t getPayAmount, C1647t getIgnoreBalanceCheck) {
        Intrinsics.checkNotNullParameter(isSelected, "isSelected");
        Intrinsics.checkNotNullParameter(getPayAmount, "getPayAmount");
        Intrinsics.checkNotNullParameter(getIgnoreBalanceCheck, "getIgnoreBalanceCheck");
        this.f36242e = isSelected;
        this.f36243f = getPayAmount;
        this.f36244g = getIgnoreBalanceCheck;
    }

    public static void j(BaseViewHolder baseViewHolder, boolean z3) {
        ImageView imageView = (ImageView) baseViewHolder.getView(e.iv_cashier_item_payment_method_icon);
        TextView textView = (TextView) baseViewHolder.getView(e.tv_cashier_item_payment_method_name);
        TextView textView2 = (TextView) baseViewHolder.getView(e.tv_cashier_item_payment_balance);
        TextView textView3 = (TextView) baseViewHolder.getView(e.tv_item_payment_method_normal_tips);
        TextView textView4 = (TextView) baseViewHolder.getView(e.tv_item_payment_method_activity_tips);
        View view = baseViewHolder.getView(e.mbci_root);
        ImageView imageView2 = (ImageView) baseViewHolder.getView(e.iv_cashier_item_selected);
        TextView textView5 = (TextView) baseViewHolder.getView(e.tv_item_payment_method_discount_amount);
        TextView textView6 = (TextView) baseViewHolder.getView(e.tv_cashier_item_top_up);
        view.setEnabled(z3);
        if (z3) {
            imageView.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            textView3.setAlpha(1.0f);
            return;
        }
        imageView.setAlpha(0.6f);
        textView.setAlpha(0.5f);
        textView2.setAlpha(0.5f);
        textView3.setAlpha(0.5f);
        textView4.setVisibility(8);
        textView6.setVisibility(8);
        textView5.setVisibility(8);
        imageView2.setVisibility(8);
        textView3.setVisibility(0);
    }

    @Override // T1.b
    public final void b(BaseViewHolder helper, Object obj) {
        TextView textView;
        String str;
        String plainString;
        CashierPaymentMethodBean item = (CashierPaymentMethodBean) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.getView(e.mbci_root);
        ImageView imageView = (ImageView) helper.getView(e.iv_cashier_item_payment_method_icon);
        TextView textView2 = (TextView) helper.getView(e.tv_cashier_item_payment_method_name);
        TextView textView3 = (TextView) helper.getView(e.tv_cashier_item_payment_balance);
        TextView textView4 = (TextView) helper.getView(e.tv_item_payment_method_normal_tips);
        TextView textView5 = (TextView) helper.getView(e.tv_item_payment_method_activity_tips);
        IconicsImageView iconicsImageView = (IconicsImageView) helper.getView(e.iv_cashier_item_selected);
        TextView textView6 = (TextView) helper.getView(e.tv_item_payment_method_discount_amount);
        TextView textView7 = (TextView) helper.getView(e.tv_cashier_item_top_up);
        textView4.setVisibility(8);
        textView5.setVisibility(8);
        textView7.setVisibility(8);
        textView3.setText("");
        boolean zBooleanValue = ((Boolean) this.f36242e.invoke(item)).booleanValue();
        iconicsImageView.setVisibility(zBooleanValue ? 0 : 4);
        if (item.paymentMethodsDiscount <= 0 || !zBooleanValue) {
            textView6.setVisibility(8);
        } else {
            textView6.setVisibility(0);
            String currencySymbol = BaseApplication.getCurrencySymbol();
            long j6 = item.paymentMethodsDiscount;
            if (j6 == 0) {
                plainString = "0";
            } else {
                try {
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(r0.h(j6));
                    plainString = (bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).toPlainString();
                } catch (Exception e10) {
                    d.c("AmountUtil", "getAmountStringWithThousandCharacter: ", e10);
                    plainString = "";
                }
            }
            textView6.setText(currencySymbol + " " + plainString + " off");
        }
        int i7 = item.senderAccountType;
        C1647t c1647t = this.f36243f;
        if (i7 == 1) {
            AutoTrackUtil.addViewRemark(view, c().getString(k.core_palmpay_payment_balance));
            int i10 = r.cv_palmpay_icon_circle_purple;
            if (TextUtils.isEmpty(item.logoUrl)) {
                r0.d1(imageView, i10);
            } else {
                r0.h1(imageView, item.logoUrl, i10);
            }
            String string = !TextUtils.isEmpty(item.showName) ? item.showName : c().getString(k.core_palmpay_payment_balance);
            if (textView2 != null) {
                textView2.setText(string);
            }
            G.y(" (", r0.B(item.availableBalance, false), ")", textView3);
            if (item.availableBalance < ((Number) c1647t.invoke()).longValue() && !((Boolean) this.f36244g.invoke()).booleanValue()) {
                textView7.setText(k.core_add_money);
                textView7.setVisibility(0);
                iconicsImageView.setVisibility(8);
            }
            textView = textView5;
            if (!TextUtils.isEmpty(item.acTips)) {
                textView.setVisibility(0);
                textView.setText(item.acTips);
            }
        } else if (i7 == 40) {
            int i11 = r.cv_palmpay_icon_circle_purple;
            if (TextUtils.isEmpty(item.logoUrl)) {
                textView = textView5;
                r0.d1(imageView, i11);
            } else {
                textView = textView5;
                r0.h1(imageView, item.logoUrl, i11);
            }
            String string2 = !TextUtils.isEmpty(item.showName) ? item.showName : c().getString(k.core_palmpay_payment_cash_box);
            if (textView2 != null) {
                textView2.setText(string2);
            }
            G.y("(", r0.B(item.availableBalance, false), ")", textView3);
            if (!TextUtils.isEmpty(item.acTips)) {
                textView.setVisibility(0);
                textView.setText(item.acTips);
            }
        } else if (i7 == 57 || i7 == 29) {
            textView = textView5;
            textView = textView5;
            int i12 = r.cv_palmpay_icon_circle_purple;
            if (TextUtils.isEmpty(item.logoUrl)) {
                r0.d1(imageView, i12);
            } else {
                r0.h1(imageView, item.logoUrl, i12);
            }
            String string3 = !TextUtils.isEmpty(item.showName) ? item.showName : c().getString(k.core_flexi_pay);
            if (textView2 != null) {
                textView2.setText(string3);
            }
            G.y("(", r0.B(item.availableBalance, false), ")", textView3);
            if (!TextUtils.isEmpty(item.acTips)) {
                h.s(textView, true);
                textView.setText(item.acTips);
            } else if (!TextUtils.isEmpty(item.tips)) {
                h.s(textView4, true);
                textView4.setText(item.tips);
            }
        } else if (i7 == 5 || i7 == 12) {
            textView = textView5;
            textView = textView5;
            textView2.setText(item.bankName);
            if (!TextUtils.isEmpty(item.cardNo)) {
                G.y("(", r0.I(item.cardNo), ")", textView3);
            }
            r0.o1(item.bankUrl, imageView);
        } else if (i7 == 6) {
            textView2.setText(item.bankName);
            if (TextUtils.isEmpty(item.bankAccountNo)) {
                textView = textView5;
                str = item.cardNo;
            } else {
                textView = textView5;
                str = item.bankAccountNo;
            }
            if (!TextUtils.isEmpty(str)) {
                textView3.setText(r0.G(str));
            }
            r0.o1(item.bankUrl, imageView);
        } else if (i7 == 8 || i7 == 13) {
            textView = textView5;
            textView = textView5;
            textView2.setText(item.bankName);
            G.y("(", r0.D0(item.bankAccountNo), ")", textView3);
            r0.u1(imageView, item.bankUrl, r.cv_operator_icon);
        } else if (i7 == 23) {
            textView2.setText(r0.g0(item.bankName));
            if (TextUtils.isEmpty(item.cardNo)) {
                textView = textView5;
                textView3.setText("");
            } else {
                textView = textView5;
                G.y("(", r0.I(item.cardNo), ")", textView3);
            }
            r0.o1(item.bankUrl, imageView);
        } else if (i7 == 28 || item.payType == 36) {
            textView = textView5;
            textView = textView5;
            imageView.setImageResource(r.cv_ok_card_icon);
            textView2.setText(k.core_flexi_credit);
            AutoTrackUtil.addViewRemark(view, c().getString(k.core_oc_limit));
            G.y("(", r0.B(item.availableBalance, false), ")", textView3);
        }
        textView = textView5;
        int i13 = item.senderAccountType;
        if (i13 == 40 || i13 == 28 || item.payType == 36) {
            if (!item.enable) {
                j(helper, false);
                return;
            }
            if (item.availableBalance < ((Number) c1647t.invoke()).longValue()) {
                h.s(textView4, true);
                textView4.setText(c().getString(k.core_insufficient_balance));
                j(helper, false);
                return;
            }
            if (!TextUtils.isEmpty(item.acTips)) {
                h.s(textView, true);
                textView.setText(item.acTips);
            } else if (!TextUtils.isEmpty(item.tips)) {
                h.s(textView4, true);
                textView4.setText(item.tips);
            }
            j(helper, true);
        }
    }

    @Override // T1.b
    public final int d() {
        return 33;
    }

    @Override // T1.b
    public final int e() {
        return g.core_item_cashier_preview_payment_method;
    }
}
