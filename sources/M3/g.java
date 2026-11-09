package M3;

import C0.G;
import E.AbstractC0198c;
import La.i;
import M1.j;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierSelectPayMethodDialog$CallBack;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCashierPayMethodItem;
import com.flexibank.sdk.k;
import com.flexibank.sdk.o;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import io.fastkv.n;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class g extends j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f5761g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlexiBankCashierSelectPayMethodDialog$CallBack f5763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f5764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FlexiBankCashierPaymentMethodBean f5765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function0 f5766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5767f;

    public g() {
        super(q.fb_item_cashier_preview_payment_method, null);
        this.f5762a = new ArrayList();
        this.f5764c = C2131j.b(new f(this, 0));
        this.f5766e = new i(5);
        addChildClickViewIds(p.fb_tv_cashier_item_top_up);
    }

    public static void a(BaseViewHolder baseViewHolder, boolean z3) {
        ImageView imageView = (ImageView) baseViewHolder.getView(p.fb_iv_cashier_item_payment_method_icon);
        TextView textView = (TextView) baseViewHolder.getView(p.fb_tv_cashier_item_payment_method_name);
        TextView textView2 = (TextView) baseViewHolder.getView(p.fb_tv_cashier_item_payment_balance);
        TextView textView3 = (TextView) baseViewHolder.getView(p.fb_tv_item_payment_method_normal_tips);
        TextView textView4 = (TextView) baseViewHolder.getView(p.fb_tv_item_payment_method_activity_tips);
        View view = baseViewHolder.getView(p.fb_mbci_root);
        ImageView imageView2 = (ImageView) baseViewHolder.getView(p.fb_iv_cashier_item_selected);
        TextView textView5 = (TextView) baseViewHolder.getView(p.fb_tv_item_payment_method_discount_amount);
        TextView textView6 = (TextView) baseViewHolder.getView(p.fb_tv_cashier_item_top_up);
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

    public final void b(List preViewPaymentMethod) {
        int i7;
        boolean z3;
        boolean z8;
        Intrinsics.checkNotNullParameter(preViewPaymentMethod, "preViewPaymentMethod");
        setList(preViewPaymentMethod);
        boolean z10 = false;
        if (preViewPaymentMethod == null || !preViewPaymentMethod.isEmpty()) {
            Iterator it = preViewPaymentMethod.iterator();
            i7 = 0;
            while (it.hasNext()) {
                FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = (FlexiBankCashierPaymentMethodBean) it.next();
                if (flexiBankCashierPaymentMethodBean.getAvailableBalance() >= ((Number) this.f5766e.invoke()).longValue() || !flexiBankCashierPaymentMethodBean.x()) {
                    i7++;
                    if (i7 < 0) {
                        C1850q.j();
                        throw null;
                    }
                }
            }
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            ArrayList arrayList = this.f5762a;
            if (arrayList != null && arrayList.isEmpty()) {
                z3 = false;
                break;
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z3 = false;
                    break;
                }
                Integer senderAccountType = ((O3.a) it2.next()).getSenderAccountType();
                if (senderAccountType != null && senderAccountType.intValue() == 5) {
                    z3 = true;
                    break;
                }
            }
            if (z3) {
                if (arrayList != null && arrayList.isEmpty()) {
                    z8 = false;
                    break;
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z8 = false;
                        break;
                    }
                    Integer senderAccountType2 = ((O3.a) it3.next()).getSenderAccountType();
                    if (senderAccountType2 != null && senderAccountType2.intValue() == 6) {
                        z8 = true;
                        break;
                    }
                }
                if (z8) {
                    z10 = true;
                }
            }
        }
        this.f5767f = z10;
        if (!hasFooterLayout() && this.f5767f) {
            j.addFooterView$default(this, (FlexiBankCashierPayMethodItem) this.f5764c.getValue(), 0, 0, 6, null);
        } else {
            if (this.f5767f) {
                return;
            }
            removeAllFooterView();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean;
        int i7;
        FlexiBankCashierPaymentMethodBean item = (FlexiBankCashierPaymentMethodBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.getView(p.fb_mbci_root);
        ImageView imageView = (ImageView) holder.getView(p.fb_iv_cashier_item_payment_method_icon);
        TextView textView = (TextView) holder.getView(p.fb_tv_cashier_item_payment_method_name);
        TextView textView2 = (TextView) holder.getView(p.fb_tv_cashier_item_payment_balance);
        TextView textView3 = (TextView) holder.getView(p.fb_tv_item_payment_method_normal_tips);
        TextView textView4 = (TextView) holder.getView(p.fb_tv_item_payment_method_activity_tips);
        ImageView imageView2 = (ImageView) holder.getView(p.fb_iv_cashier_item_selected);
        TextView textView5 = (TextView) holder.getView(p.fb_tv_item_payment_method_discount_amount);
        TextView textView6 = (TextView) holder.getView(p.fb_tv_cashier_item_top_up);
        textView3.setVisibility(8);
        textView4.setVisibility(8);
        textView6.setVisibility(8);
        String plainString = "";
        textView2.setText("");
        FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean2 = this.f5765d;
        boolean z3 = flexiBankCashierPaymentMethodBean2 != null && n.c(flexiBankCashierPaymentMethodBean2, item);
        imageView2.setVisibility(z3 ? 0 : 4);
        if (item.getPaymentMethodsDiscount() <= 0 || !z3) {
            flexiBankCashierPaymentMethodBean = item;
            textView5.setVisibility(8);
        } else {
            textView5.setVisibility(0);
            k kVar = k.f22317a;
            long paymentMethodsDiscount = item.getPaymentMethodsDiscount();
            if (paymentMethodsDiscount == 0) {
                plainString = "0";
                flexiBankCashierPaymentMethodBean = item;
            } else {
                double dDoubleValue = paymentMethodsDiscount * 0.01d;
                try {
                    flexiBankCashierPaymentMethodBean = item;
                    try {
                        dDoubleValue = BigDecimal.valueOf(dDoubleValue).setScale(2, 4).doubleValue();
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    flexiBankCashierPaymentMethodBean = item;
                }
                try {
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dDoubleValue);
                    plainString = (bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).toPlainString();
                } catch (Exception e10) {
                    Log.e("FlexiBankAmountUtil", "getAmountStringWithThousandCharacter: ", e10);
                }
            }
            G.y("₦ ", plainString, " off", textView5);
        }
        if (flexiBankCashierPaymentMethodBean.getSenderAccountType() == 1) {
            imageView.setImageResource(o.fb_cl_cash_loan_icon);
            textView.setText(r.fb_palmpay_payment_balance);
            textView2.setText(" (" + p118hf.a.t(flexiBankCashierPaymentMethodBean.getAvailableBalance(), false) + ")");
            if (flexiBankCashierPaymentMethodBean.getAvailableBalance() < ((Number) this.f5766e.invoke()).longValue()) {
                textView6.setText(r.fb_add_money);
                i7 = 0;
                textView6.setVisibility(0);
                imageView2.setVisibility(8);
            } else {
                i7 = 0;
            }
            if (TextUtils.isEmpty(flexiBankCashierPaymentMethodBean.getAcTips())) {
                return;
            }
            textView4.setVisibility(i7);
            textView4.setText(flexiBankCashierPaymentMethodBean.getAcTips());
            return;
        }
        if (flexiBankCashierPaymentMethodBean.getSenderAccountType() == 46) {
            imageView.setImageResource(o.fb_cash_box_icon_circle_purple);
            textView.setText(r.fb_palmpay_payment_flex_saving);
            textView2.setText("(" + p118hf.a.t(flexiBankCashierPaymentMethodBean.getAvailableBalance(), false) + ")");
            if (TextUtils.isEmpty(flexiBankCashierPaymentMethodBean.getAcTips())) {
                return;
            }
            textView4.setVisibility(0);
            textView4.setText(flexiBankCashierPaymentMethodBean.getAcTips());
            return;
        }
        if (flexiBankCashierPaymentMethodBean.getSenderAccountType() == 5 || flexiBankCashierPaymentMethodBean.getSenderAccountType() == 12) {
            textView.setText(flexiBankCashierPaymentMethodBean.getBankName());
            if (!TextUtils.isEmpty(flexiBankCashierPaymentMethodBean.getCardNo())) {
                String cardNo = flexiBankCashierPaymentMethodBean.getCardNo();
                if (!TextUtils.isEmpty(cardNo)) {
                    Intrinsics.e(cardNo);
                    if (cardNo.length() > 4) {
                        cardNo = cardNo.substring(cardNo.length() - 4);
                        Intrinsics.checkNotNullExpressionValue(cardNo, "substring(...)");
                    }
                }
                G.y("(", G.o("**** ", cardNo), ")", textView2);
            }
            AbstractC0198c.M(flexiBankCashierPaymentMethodBean.getBankUrl(), imageView);
            return;
        }
        if (flexiBankCashierPaymentMethodBean.getSenderAccountType() == 6) {
            textView.setText(flexiBankCashierPaymentMethodBean.getBankName());
            if (!TextUtils.isEmpty(flexiBankCashierPaymentMethodBean.getBankAccountNo())) {
                String bankAccountNo = flexiBankCashierPaymentMethodBean.getBankAccountNo();
                if (!TextUtils.isEmpty(bankAccountNo)) {
                    Intrinsics.e(bankAccountNo);
                    if (bankAccountNo.length() > 5) {
                        bankAccountNo = bankAccountNo.substring(bankAccountNo.length() - 5);
                        Intrinsics.checkNotNullExpressionValue(bankAccountNo, "substring(...)");
                    }
                }
                G.x("***** ", bankAccountNo, textView2);
            }
            if (!TextUtils.isEmpty(flexiBankCashierPaymentMethodBean.getCardNo())) {
                String cardNo2 = flexiBankCashierPaymentMethodBean.getCardNo();
                if (!TextUtils.isEmpty(cardNo2)) {
                    Intrinsics.e(cardNo2);
                    if (cardNo2.length() > 5) {
                        cardNo2 = cardNo2.substring(cardNo2.length() - 5);
                        Intrinsics.checkNotNullExpressionValue(cardNo2, "substring(...)");
                    }
                }
                G.x("***** ", cardNo2, textView2);
            }
            AbstractC0198c.M(flexiBankCashierPaymentMethodBean.getBankUrl(), imageView);
            return;
        }
        if (flexiBankCashierPaymentMethodBean.getSenderAccountType() == 8 || flexiBankCashierPaymentMethodBean.getSenderAccountType() == 13) {
            textView.setText(flexiBankCashierPaymentMethodBean.getBankName());
            textView2.setText("(" + J3.a.w(flexiBankCashierPaymentMethodBean.getBankAccountNo()) + ")");
            AbstractC0198c.N(imageView, flexiBankCashierPaymentMethodBean.getBankUrl(), o.fb_operator_icon);
            return;
        }
        if (flexiBankCashierPaymentMethodBean.getSenderAccountType() == 28 || flexiBankCashierPaymentMethodBean.getPayType() == 36) {
            imageView.setImageResource(o.fb_ok_card_icon);
            textView.setText(r.fb_flexi_credit);
            textView2.setText("(" + p118hf.a.t(flexiBankCashierPaymentMethodBean.getAvailableBalance(), false) + ")");
            if (!flexiBankCashierPaymentMethodBean.getEnable()) {
                a(holder, false);
                return;
            }
            if (flexiBankCashierPaymentMethodBean.getAvailableBalance() < ((Number) this.f5766e.invoke()).longValue()) {
                p062e4.a.d(textView3, true);
                textView3.setText(getContext().getString(r.fb_insufficient_balance));
                a(holder, false);
                return;
            }
            if (!TextUtils.isEmpty(flexiBankCashierPaymentMethodBean.getAcTips())) {
                p062e4.a.d(textView4, true);
                textView4.setText(flexiBankCashierPaymentMethodBean.getAcTips());
            } else if (!TextUtils.isEmpty(flexiBankCashierPaymentMethodBean.getTips())) {
                p062e4.a.d(textView3, true);
                textView3.setText(flexiBankCashierPaymentMethodBean.getTips());
            }
            a(holder, true);
        }
    }
}
