package p067ea;

import Bc.i;
import C0.G;
import N3.b;
import Pa.r0;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.cashier.CashierCombinationPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.viewmodel.CashierPayMethodFlexiItem;
import com.transsnet.palmpay.core.viewmodel.CashierPayMethodFlexiPayItem;
import com.transsnet.palmpay.core.viewmodel.CashierPayMethodItem;
import com.transsnet.palmpay.custom_view.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f36240j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Function0 function0, Function0 function1, Function0 function2, int i7) {
        super(function0, function1, function2, 1);
        this.f36240j = i7;
    }

    @Override // T1.b
    public final void b(BaseViewHolder holder, Object obj) {
        Uri uriS0;
        TextView mPayMethodNumTv;
        TextView mPayMethodNumTv2;
        switch (this.f36240j) {
            case 0:
                Intrinsics.checkNotNullParameter(holder, "holder");
                CashierCombinationPaymentMethodBean pm = (CashierCombinationPaymentMethodBean) ((CashierPaymentMethodBean) obj);
                View viewOrNull = holder.getViewOrNull(e.combinationPayment);
                if (viewOrNull != null) {
                    int i7 = e.cashierItemBarrierEnd;
                    if (((Barrier) p059e1.a.m(i7, viewOrNull)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewOrNull;
                        i7 = e.ivCashierItemPaymentMethodIcon;
                        ImageView imageView = (ImageView) p059e1.a.m(i7, viewOrNull);
                        if (imageView != null) {
                            i7 = e.ivCashierItemPaymentMethodIconBg;
                            if (((ImageView) p059e1.a.m(i7, viewOrNull)) != null) {
                                i7 = e.ivCashierItemSelected;
                                ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewOrNull);
                                if (imageView2 != null) {
                                    i7 = e.ivCashierItemSubPaymentMethodIcon;
                                    ImageView imageView3 = (ImageView) p059e1.a.m(i7, viewOrNull);
                                    if (imageView3 != null) {
                                        i7 = e.tvCashierItemPaymentBalance;
                                        TextView textView = (TextView) p059e1.a.m(i7, viewOrNull);
                                        if (textView != null) {
                                            i7 = e.tvCashierItemPaymentMethodName;
                                            TextView textView2 = (TextView) p059e1.a.m(i7, viewOrNull);
                                            if (textView2 != null) {
                                                i7 = e.tvCashierItemPaymentPayAmount;
                                                TextView textView3 = (TextView) p059e1.a.m(i7, viewOrNull);
                                                if (textView3 != null) {
                                                    i7 = e.tvCashierItemSubPaymentBalance;
                                                    TextView textView4 = (TextView) p059e1.a.m(i7, viewOrNull);
                                                    if (textView4 != null) {
                                                        i7 = e.tvCashierItemSubPaymentMethodName;
                                                        TextView textView5 = (TextView) p059e1.a.m(i7, viewOrNull);
                                                        if (textView5 != null) {
                                                            i7 = e.tvCashierItemSubPaymentPayAmount;
                                                            TextView textView6 = (TextView) p059e1.a.m(i7, viewOrNull);
                                                            if (textView6 != null) {
                                                                i binding = new i(constraintLayout, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, textView5, textView6);
                                                                Intrinsics.checkNotNullExpressionValue(binding, "bind(...)");
                                                                if (pm != null) {
                                                                    ((Number) this.f6073g.invoke()).longValue();
                                                                    Intrinsics.checkNotNullParameter(binding, "binding");
                                                                    Intrinsics.checkNotNullParameter(pm, "pm");
                                                                    imageView.setImageURI(r0.s0(pm));
                                                                    CashierCombinationPaymentMethodBean subPaymentMethodBean = pm.getSubPaymentMethodBean();
                                                                    if (subPaymentMethodBean != null && (uriS0 = r0.s0(subPaymentMethodBean)) != null) {
                                                                        imageView3.setImageURI(uriS0);
                                                                    }
                                                                    textView2.setText(r0.t0(pm, c()));
                                                                    CashierCombinationPaymentMethodBean subPaymentMethodBean2 = pm.getSubPaymentMethodBean();
                                                                    textView5.setText(subPaymentMethodBean2 != null ? r0.t0(subPaymentMethodBean2, c()) : null);
                                                                    textView.setText(r0.p0(pm));
                                                                    CashierCombinationPaymentMethodBean subPaymentMethodBean3 = pm.getSubPaymentMethodBean();
                                                                    textView4.setText(subPaymentMethodBean3 != null ? r0.p0(subPaymentMethodBean3) : null);
                                                                    if (k(pm)) {
                                                                        imageView2.setImageDrawable(G8.a.x(c(), S6.a.pay_Selected, Integer.valueOf(c().getColor(L6.b.ppColorSuccess)), null, 20.0f, 116));
                                                                        return;
                                                                    } else {
                                                                        imageView2.setImageDrawable(null);
                                                                        return;
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewOrNull.getResources().getResourceName(i7)));
                }
                return;
            case 1:
                CashierPaymentMethodBean pm2 = (CashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                CashierPayMethodItem itemHolder = (CashierPayMethodItem) holder.getView(e.model_payment_layout);
                itemHolder.f();
                if (pm2 != null) {
                    ((Number) this.f6073g.invoke()).longValue();
                    Intrinsics.checkNotNullParameter(itemHolder, "itemHolder");
                    Intrinsics.checkNotNullParameter(pm2, "pm");
                    AutoTrackUtil.addViewRemark(itemHolder.getMRoot(), pm2.bankName);
                    itemHolder.d(pm2, true);
                    TextView mPayMethodNumTv3 = itemHolder.getMPayMethodNumTv();
                    if (mPayMethodNumTv3 != null) {
                        mPayMethodNumTv3.setText("");
                    }
                    int i10 = pm2.senderAccountType;
                    if (i10 == 5 || i10 == 12) {
                        TextView mPayMethodNameTv = itemHolder.getMPayMethodNameTv();
                        if (mPayMethodNameTv != null) {
                            mPayMethodNameTv.setText(pm2.bankName);
                        }
                        if (!TextUtils.isEmpty(pm2.cardNo) && (mPayMethodNumTv = itemHolder.getMPayMethodNumTv()) != null) {
                            G.y("(", r0.f0(pm2.cardNo), ")", mPayMethodNumTv);
                        }
                        r0.o1(pm2.bankUrl, itemHolder.getMPayMethodImg());
                    } else if (i10 == 6) {
                        TextView mPayMethodNameTv2 = itemHolder.getMPayMethodNameTv();
                        if (mPayMethodNameTv2 != null) {
                            mPayMethodNameTv2.setText(pm2.bankName);
                        }
                        String str = !TextUtils.isEmpty(pm2.bankAccountNo) ? pm2.bankAccountNo : pm2.cardNo;
                        if (!TextUtils.isEmpty(str) && (mPayMethodNumTv2 = itemHolder.getMPayMethodNumTv()) != null) {
                            G.y("(", r0.e0(str), ")", mPayMethodNumTv2);
                        }
                        r0.o1(pm2.bankUrl, itemHolder.getMPayMethodImg());
                    }
                    if (k(pm2)) {
                        ImageView mRightIv = itemHolder.getMRightIv();
                        if (mRightIv != null) {
                            mRightIv.setImageDrawable(G8.a.x(c(), S6.a.pay_Selected, Integer.valueOf(c().getColor(L6.b.ppColorSuccess)), null, 20.0f, 116));
                            return;
                        }
                        return;
                    }
                    ImageView mRightIv2 = itemHolder.getMRightIv();
                    if (mRightIv2 != null) {
                        mRightIv2.setImageDrawable(null);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                CashierPaymentMethodBean pm3 = (CashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                CashierPayMethodItem itemHolder2 = (CashierPayMethodItem) holder.getView(e.model_payment_layout);
                itemHolder2.f();
                if (pm3 != null) {
                    Function0 function0 = this.f6073g;
                    long jLongValue = ((Number) function0.invoke()).longValue();
                    Intrinsics.checkNotNullParameter(itemHolder2, "itemHolder");
                    Intrinsics.checkNotNullParameter(pm3, "pm");
                    AutoTrackUtil.addViewRemark(itemHolder2.getMRoot(), c().getString(k.core_palmpay_payment_cash_box));
                    itemHolder2.d(pm3, true);
                    int i11 = r.cv_cash_box_icon_circle_cashier;
                    if (TextUtils.isEmpty(pm3.logoUrl)) {
                        r0.d1(itemHolder2.getMPayMethodImg(), i11);
                    } else {
                        r0.h1(itemHolder2.getMPayMethodImg(), pm3.logoUrl, i11);
                    }
                    String string = !TextUtils.isEmpty(pm3.showName) ? pm3.showName : c().getString(k.core_palmpay_payment_cash_box);
                    TextView mPayMethodNameTv3 = itemHolder2.getMPayMethodNameTv();
                    if (mPayMethodNameTv3 != null) {
                        mPayMethodNameTv3.setText(string);
                    }
                    TextView mPayMethodNumTv4 = itemHolder2.getMPayMethodNumTv();
                    if (mPayMethodNumTv4 != null) {
                        G.y("(", r0.B(pm3.availableBalance, true), ")", mPayMethodNumTv4);
                    }
                    if (!TextUtils.isEmpty(pm3.acTips)) {
                        itemHolder2.e(itemHolder2.getMHintText(), pm3.acTips);
                    }
                    itemHolder2.d(pm3, pm3.availableBalance >= jLongValue && pm3.enable);
                    if (!k(pm3) || pm3.availableBalance < ((Number) function0.invoke()).longValue()) {
                        ImageView mRightIv3 = itemHolder2.getMRightIv();
                        if (mRightIv3 != null) {
                            mRightIv3.setImageDrawable(null);
                            return;
                        }
                        return;
                    }
                    ImageView mRightIv4 = itemHolder2.getMRightIv();
                    if (mRightIv4 != null) {
                        mRightIv4.setImageDrawable(G8.a.x(c(), S6.a.pay_Selected, Integer.valueOf(c().getColor(L6.b.ppColorSuccess)), null, 20.0f, 116));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                CashierPaymentMethodBean pm4 = (CashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                CashierPayMethodFlexiItem cashierPayMethodFlexiItem = (CashierPayMethodFlexiItem) holder.getView(e.model_payment_flexi_layout);
                cashierPayMethodFlexiItem.f();
                if (pm4 != null) {
                    long jLongValue2 = ((Number) this.f6073g.invoke()).longValue();
                    Intrinsics.checkNotNullParameter(pm4, "pm");
                    int i12 = r.cv_ok_card_icon;
                    if (TextUtils.isEmpty(pm4.logoUrl)) {
                        r0.d1(cashierPayMethodFlexiItem.getMPayMethodImg(), i12);
                    } else {
                        r0.h1(cashierPayMethodFlexiItem.getMPayMethodImg(), pm4.logoUrl, i12);
                    }
                    String string2 = !TextUtils.isEmpty(pm4.showName) ? pm4.showName : cashierPayMethodFlexiItem.f31417a.getString(k.core_oc_limit);
                    TextView mPayMethodNameTv4 = cashierPayMethodFlexiItem.getMPayMethodNameTv();
                    if (mPayMethodNameTv4 != null) {
                        mPayMethodNameTv4.setText(string2);
                    }
                    AutoTrackUtil.addViewRemark(cashierPayMethodFlexiItem.getMRoot(), string2);
                    TextView mPayMethodNumTv5 = cashierPayMethodFlexiItem.getMPayMethodNumTv();
                    if (mPayMethodNumTv5 != null) {
                        G.y(" (", r0.B(pm4.availableBalance, false), ")", mPayMethodNumTv5);
                    }
                    if (!pm4.enable || pm4.availableBalance < jLongValue2) {
                        cashierPayMethodFlexiItem.d(pm4, false);
                        if (pm4.availableBalance < jLongValue2) {
                            cashierPayMethodFlexiItem.g(cashierPayMethodFlexiItem.f31417a.getString(k.core_insufficient_balance), true);
                        }
                    } else {
                        cashierPayMethodFlexiItem.d(pm4, true);
                    }
                }
                if (k(pm4)) {
                    ImageView mRightIv5 = cashierPayMethodFlexiItem.getMRightIv();
                    if (mRightIv5 != null) {
                        mRightIv5.setImageDrawable(G8.a.x(c(), S6.a.pay_Selected, Integer.valueOf(c().getColor(L6.b.ppColorSuccess)), null, 20.0f, 116));
                        return;
                    }
                    return;
                }
                ImageView mRightIv6 = cashierPayMethodFlexiItem.getMRightIv();
                if (mRightIv6 != null) {
                    mRightIv6.setImageDrawable(null);
                    return;
                }
                return;
            case 4:
                CashierPaymentMethodBean pm5 = (CashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                CashierPayMethodFlexiPayItem cashierPayMethodFlexiPayItem = (CashierPayMethodFlexiPayItem) holder.getView(e.model_payment_flexi_layout);
                cashierPayMethodFlexiPayItem.f();
                if (pm5 != null) {
                    long jLongValue3 = ((Number) this.f6073g.invoke()).longValue();
                    Intrinsics.checkNotNullParameter(pm5, "pm");
                    int i13 = r.cv_palmpay_icon_circle_purple;
                    if (TextUtils.isEmpty(pm5.logoUrl)) {
                        r0.d1(cashierPayMethodFlexiPayItem.getMPayMethodImg(), i13);
                    } else {
                        r0.h1(cashierPayMethodFlexiPayItem.getMPayMethodImg(), pm5.logoUrl, i13);
                    }
                    String string3 = !TextUtils.isEmpty(pm5.showName) ? pm5.showName : cashierPayMethodFlexiPayItem.f31417a.getString(k.core_flexi_pay);
                    TextView mPayMethodNameTv5 = cashierPayMethodFlexiPayItem.getMPayMethodNameTv();
                    if (mPayMethodNameTv5 != null) {
                        mPayMethodNameTv5.setText(string3);
                    }
                    AutoTrackUtil.addViewRemark(cashierPayMethodFlexiPayItem.getMRoot(), string3);
                    TextView mPayMethodNumTv6 = cashierPayMethodFlexiPayItem.getMPayMethodNumTv();
                    if (mPayMethodNumTv6 != null) {
                        G.y(" (", r0.B(pm5.availableBalance, false), ")", mPayMethodNumTv6);
                    }
                    if (!TextUtils.isEmpty(pm5.acTips)) {
                        cashierPayMethodFlexiPayItem.e(cashierPayMethodFlexiPayItem.getMActHintText(), pm5.acTips);
                    }
                    if (!pm5.enable || pm5.availableBalance < jLongValue3) {
                        cashierPayMethodFlexiPayItem.d(pm5, false);
                    } else {
                        cashierPayMethodFlexiPayItem.d(pm5, true);
                    }
                }
                if (k(pm5)) {
                    ImageView mRightIv7 = cashierPayMethodFlexiPayItem.getMRightIv();
                    if (mRightIv7 != null) {
                        mRightIv7.setImageDrawable(G8.a.x(c(), S6.a.pay_Selected, Integer.valueOf(c().getColor(L6.b.ppColorSuccess)), null, 20.0f, 116));
                        return;
                    }
                    return;
                }
                ImageView mRightIv8 = cashierPayMethodFlexiPayItem.getMRightIv();
                if (mRightIv8 != null) {
                    mRightIv8.setImageDrawable(null);
                    return;
                }
                return;
            default:
                CashierPaymentMethodBean pm6 = (CashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                CashierPayMethodItem itemHolder3 = (CashierPayMethodItem) holder.getView(e.model_payment_layout);
                itemHolder3.f();
                if (pm6 != null) {
                    ((Number) this.f6073g.invoke()).longValue();
                    Intrinsics.checkNotNullParameter(itemHolder3, "itemHolder");
                    Intrinsics.checkNotNullParameter(pm6, "pm");
                    AutoTrackUtil.addViewRemark(itemHolder3.getMRoot(), pm6.bankName);
                    itemHolder3.d(pm6, true);
                    TextView mPayMethodNameTv6 = itemHolder3.getMPayMethodNameTv();
                    if (mPayMethodNameTv6 != null) {
                        mPayMethodNameTv6.setText(r0.g0(pm6.bankName));
                    }
                    if (TextUtils.isEmpty(pm6.cardNo)) {
                        TextView mPayMethodNumTv7 = itemHolder3.getMPayMethodNumTv();
                        if (mPayMethodNumTv7 != null) {
                            mPayMethodNumTv7.setText("");
                        }
                    } else {
                        String strI = r0.I(pm6.cardNo);
                        TextView mPayMethodNumTv8 = itemHolder3.getMPayMethodNumTv();
                        if (mPayMethodNumTv8 != null) {
                            G.y("(", strI, ")", mPayMethodNumTv8);
                        }
                    }
                    r0.o1(pm6.bankUrl, itemHolder3.getMPayMethodImg());
                    if (k(pm6)) {
                        ImageView mRightIv9 = itemHolder3.getMRightIv();
                        if (mRightIv9 != null) {
                            mRightIv9.setImageDrawable(G8.a.x(c(), S6.a.pay_Selected, Integer.valueOf(c().getColor(L6.b.ppColorSuccess)), null, 20.0f, 116));
                            return;
                        }
                        return;
                    }
                    ImageView mRightIv10 = itemHolder3.getMRightIv();
                    if (mRightIv10 != null) {
                        mRightIv10.setImageDrawable(null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // T1.b
    public final int d() {
        switch (this.f36240j) {
            case 0:
                return 24;
            case 1:
                return 20;
            case 2:
                return 21;
            case 3:
                return 18;
            case 4:
                return 25;
            default:
                return 23;
        }
    }

    @Override // T1.b
    public final int e() {
        switch (this.f36240j) {
            case 0:
                return g.core_layout_cashier_payment_method_combination_item;
            case 1:
                return g.core_layout_cashier_payment_method_bank_item;
            case 2:
                return g.core_layout_cashier_payment_method_cashbox_item;
            case 3:
                return g.core_layout_cashier_payment_method_flexi_item;
            case 4:
                return g.core_layout_cashier_payment_method_flexi_pay_item;
            default:
                return g.core_layout_cashier_payment_method_ussd_bank_item;
        }
    }
}
