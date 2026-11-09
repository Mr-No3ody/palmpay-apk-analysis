package Xd;

import Pa.n0;
import Pa.r0;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.airtime.bean.AirtimeSpecialRechargeItem;
import com.transsnet.palmpay.airtime.bean.BaseAirtimeItemsBean;
import com.transsnet.palmpay.core.bean.cashier.CashierCombinationPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.FlexiPayGuideBean;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.resp.BillerHistoryItemBean;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import p052da.C1648u;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends T1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11148e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11149f;

    public i(C1648u isSelected) {
        Intrinsics.checkNotNullParameter(isSelected, "isSelected");
        this.f11149f = isSelected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v30, types: [kotlin.collections.z] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.ArrayList] */
    @Override // T1.b
    public final void b(BaseViewHolder holder, Object obj) {
        ?? arrayList;
        switch (this.f11148e) {
            case 0:
                BillerHistoryItemBean item = (BillerHistoryItemBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item, "item");
                ((j) this.f11149f).d(holder, item);
                return;
            case 1:
                CashierPaymentMethodBean item2 = (CashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(holder, "helper");
                Intrinsics.checkNotNullParameter(item2, "item");
                CashierCombinationPaymentMethodBean cashierCombinationPaymentMethodBean = item2 instanceof CashierCombinationPaymentMethodBean ? (CashierCombinationPaymentMethodBean) item2 : null;
                if (cashierCombinationPaymentMethodBean == null) {
                    return;
                }
                ImageView imageView = (ImageView) holder.getView(p025ba.e.ivCashierItemPaymentMethodIcon);
                ImageView imageView2 = (ImageView) holder.getView(p025ba.e.ivCashierItemSubPaymentMethodIcon);
                TextView textView = (TextView) holder.getView(p025ba.e.tvCashierItemPaymentMethodName);
                TextView textView2 = (TextView) holder.getView(p025ba.e.tvCashierItemSubPaymentMethodName);
                TextView textView3 = (TextView) holder.getView(p025ba.e.tvCashierItemPaymentBalance);
                TextView textView4 = (TextView) holder.getView(p025ba.e.tvCashierItemSubPaymentBalance);
                TextView textView5 = (TextView) holder.getView(p025ba.e.tvCashierItemPaymentPayAmount);
                TextView textView6 = (TextView) holder.getView(p025ba.e.tvCashierItemSubPaymentPayAmount);
                ImageView imageView3 = (ImageView) holder.getView(p025ba.e.ivCashierItemSelected);
                imageView.setImageURI(r0.s0(cashierCombinationPaymentMethodBean));
                imageView2.setImageDrawable(null);
                textView2.setText("");
                textView4.setText("");
                textView6.setText("");
                textView.setText(r0.t0(cashierCombinationPaymentMethodBean, c()));
                textView3.setText(r0.p0(cashierCombinationPaymentMethodBean));
                Long combinationAmount = cashierCombinationPaymentMethodBean.getCombinationAmount();
                textView5.setText("- " + r0.B(combinationAmount != null ? combinationAmount.longValue() : 0L, true));
                CashierCombinationPaymentMethodBean subPaymentMethodBean = cashierCombinationPaymentMethodBean.getSubPaymentMethodBean();
                if (subPaymentMethodBean != null) {
                    imageView2.setImageURI(r0.s0(subPaymentMethodBean));
                    textView2.setText(r0.t0(subPaymentMethodBean, c()));
                    textView4.setText(r0.p0(subPaymentMethodBean));
                    Long combinationAmount2 = subPaymentMethodBean.getCombinationAmount();
                    C0.G.x("- ", r0.B(combinationAmount2 != null ? combinationAmount2.longValue() : 0L, true), textView6);
                }
                imageView3.setImageDrawable(G8.a.x(c(), S6.a.pay_Selected, Integer.valueOf(c().getColor(L6.b.ppColorSuccess)), null, 20.0f, 116));
                imageView3.setVisibility(((Boolean) ((C1648u) this.f11149f).invoke(item2)).booleanValue() ? 0 : 8);
                return;
            case 2:
                CashierPaymentMethodBean item3 = (CashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(holder, "helper");
                Intrinsics.checkNotNullParameter(item3, "item");
                FlexiPayGuideBean flexiPayGuideBean = item3 instanceof FlexiPayGuideBean ? (FlexiPayGuideBean) item3 : null;
                if (flexiPayGuideBean == null) {
                    return;
                }
                ImageView imageView4 = (ImageView) holder.getView(p025ba.e.iv_flexi_guide_icon);
                TextView textView7 = (TextView) holder.getView(p025ba.e.tv_flexi_guide_name);
                TextView textView8 = (TextView) holder.getView(p025ba.e.tv_flexi_guide_subtitle);
                LinearLayout linearLayout = (LinearLayout) holder.getView(p025ba.e.tv_flexi_guide_benefit);
                ImageView imageView5 = (ImageView) holder.getView(p025ba.e.iv_flexi_guide_selected);
                int i7 = com.transsnet.palmpay.custom_view.r.cv_palmpay_icon_circle_purple;
                if (TextUtils.isEmpty(flexiPayGuideBean.logoUrl)) {
                    r0.d1(imageView4, i7);
                } else {
                    r0.h1(imageView4, flexiPayGuideBean.logoUrl, i7);
                }
                textView7.setText(!TextUtils.isEmpty(flexiPayGuideBean.showName) ? flexiPayGuideBean.showName : c().getString(p025ba.k.core_flexi_pay));
                if (TextUtils.isEmpty(flexiPayGuideBean.getSubTitle())) {
                    textView8.setVisibility(8);
                } else {
                    textView8.setText(flexiPayGuideBean.getSubTitle());
                    textView8.setVisibility(0);
                }
                linearLayout.removeAllViews();
                List<String> benefitPoints = flexiPayGuideBean.getBenefitPoints();
                if (benefitPoints != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : benefitPoints) {
                        if (!TextUtils.isEmpty((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = kotlin.collections.z.f38935a;
                }
                if (arrayList.isEmpty()) {
                    linearLayout.setVisibility(8);
                } else {
                    linearLayout.setVisibility(0);
                    int i10 = 0;
                    for (Object obj3 : (Iterable) arrayList) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            C1850q.k();
                            throw null;
                        }
                        String str = (String) obj3;
                        View viewInflate = LayoutInflater.from(c()).inflate(p025ba.g.core_item_cashier_preview_flexi_pay_guide_benefit, (ViewGroup) linearLayout, false);
                        Intrinsics.f(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                        View view = (LinearLayout) viewInflate;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        if (i10 > 0) {
                            layoutParams.leftMargin = CommonViewExtKt.getDp(4);
                        }
                        view.setLayoutParams(layoutParams);
                        ((ImageView) view.findViewById(p025ba.e.iv_flexi_guide_benefit_icon)).setImageDrawable(G8.a.x(c(), S6.a.pay_Selected, null, Integer.valueOf(L6.b.ppColorPrimary), 24.0f, 114));
                        ((TextView) view.findViewById(p025ba.e.tv_flexi_guide_benefit_text)).setText(str);
                        linearLayout.addView(view);
                        i10 = i11;
                    }
                }
                if (!((Boolean) ((C1648u) this.f11149f).invoke(item3)).booleanValue()) {
                    imageView5.setVisibility(8);
                    return;
                } else {
                    imageView5.setImageDrawable(G8.a.x(c(), S6.a.pay_Selected, null, Integer.valueOf(L6.b.ppColorSuccess), 24.0f, 114));
                    imageView5.setVisibility(0);
                    return;
                }
            case 3:
                BaseAirtimeItemsBean item4 = (BaseAirtimeItemsBean) obj;
                Intrinsics.checkNotNullParameter(holder, "helper");
                Intrinsics.checkNotNullParameter(item4, "item");
                AirtimeSpecialRechargeItem airtimeSpecialRechargeItem = item4 instanceof AirtimeSpecialRechargeItem ? (AirtimeSpecialRechargeItem) item4 : null;
                if (airtimeSpecialRechargeItem == null) {
                    return;
                }
                ImageView imageView6 = (ImageView) holder.getViewOrNull(Pd.c.remarkIv);
                TextView textView9 = (TextView) holder.getViewOrNull(Pd.c.itemAmountTv);
                TextView textView10 = (TextView) holder.getViewOrNull(Pd.c.itemValueTv);
                Long price = airtimeSpecialRechargeItem.getPrice();
                SpannableStringBuilder spannableStringBuilderL = r0.L(12, 20, 0, price != null ? price.longValue() : 0L);
                if (textView9 != null) {
                    textView9.setText(spannableStringBuilderL);
                }
                if (!Intrinsics.c(airtimeSpecialRechargeItem.getDiscountAmount(), airtimeSpecialRechargeItem.getPrice())) {
                    SpanUtils spanUtils = new SpanUtils();
                    Long discountAmount = airtimeSpecialRechargeItem.getDiscountAmount();
                    SpannableStringBuilder spannableStringBuilderCreate = spanUtils.append("Pay " + r0.F(discountAmount != null ? discountAmount.longValue() : 0L) + "  ").create();
                    if (textView10 != null) {
                        textView10.setText(spannableStringBuilderCreate);
                    }
                    if (textView10 != null) {
                        p220oa.h.s(textView10, true);
                    }
                } else if (textView10 != null) {
                    p220oa.h.s(textView10, false);
                }
                if (TextUtils.isEmpty(airtimeSpecialRechargeItem.getCornerMark())) {
                    if (imageView6 != null) {
                        p220oa.h.c(imageView6);
                        return;
                    }
                    return;
                } else {
                    if (imageView6 != null) {
                        p220oa.h.C(imageView6);
                    }
                    r0.i1(imageView6, airtimeSpecialRechargeItem.getCornerMark(), Integer.MIN_VALUE, CommonViewExtKt.getDp(36));
                    return;
                }
            default:
                BaseAirtimeItemsBean item5 = (BaseAirtimeItemsBean) obj;
                Intrinsics.checkNotNullParameter(holder, "helper");
                Intrinsics.checkNotNullParameter(item5, "item");
                AirtimeSpecialRechargeItem airtimeSpecialRechargeItem2 = item5 instanceof AirtimeSpecialRechargeItem ? (AirtimeSpecialRechargeItem) item5 : null;
                if (airtimeSpecialRechargeItem2 == null) {
                    return;
                }
                TextView textView11 = (TextView) holder.getView(Pd.c.itemNameTv);
                TextView textView12 = (TextView) holder.getView(Pd.c.itemVauleTv);
                TextView textView13 = (TextView) holder.getView(Pd.c.remarkTv);
                Long price2 = airtimeSpecialRechargeItem2.getPrice();
                textView11.setText(r0.L(12, 20, 0, price2 != null ? price2.longValue() : 0L));
                if (TextUtils.isEmpty(airtimeSpecialRechargeItem2.getRewardsRateText())) {
                    p220oa.h.c(textView12);
                } else {
                    textView12.setText(airtimeSpecialRechargeItem2.getRewardsRateText());
                    p220oa.h.C(textView12);
                }
                if (TextUtils.isEmpty(airtimeSpecialRechargeItem2.getRewardsText())) {
                    p220oa.h.c(textView13);
                    return;
                } else {
                    textView13.setText(airtimeSpecialRechargeItem2.getRewardsText());
                    p220oa.h.C(textView13);
                    return;
                }
        }
    }

    @Override // T1.b
    public final int d() {
        switch (this.f11148e) {
            case 0:
                return 1;
            case 1:
                return 35;
            case 2:
                return 34;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    @Override // T1.b
    public final int e() {
        switch (this.f11148e) {
            case 0:
                return Pd.d.qt_layout_new_history_item;
            case 1:
                return p025ba.g.core_item_cashier_preview_combination_payment_method;
            case 2:
                return p025ba.g.core_item_cashier_preview_flexi_pay_guide;
            case 3:
                return Pd.d.qt_airtime_item_auto_renew;
            default:
                return Pd.d.qt_airtime_item_custom_amount;
        }
    }

    @Override // T1.b
    public void g(BaseViewHolder helper, View view, Object obj, int i7) {
        switch (this.f11148e) {
            case 3:
                BaseAirtimeItemsBean data = (BaseAirtimeItemsBean) obj;
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(data, "data");
                AirtimeSpecialRechargeItem airtimeSpecialRechargeItem = data instanceof AirtimeSpecialRechargeItem ? (AirtimeSpecialRechargeItem) data : null;
                if (airtimeSpecialRechargeItem != null) {
                    p1.c cVar = ((p155k9.b) this.f11149f).f38702b.f38712e;
                    if (cVar != null) {
                        cVar.onAutoRenewItemClick(i7, airtimeSpecialRechargeItem);
                    }
                    n0 n0VarG = n0.g();
                    ClickEvent clickEventAdd = new ClickEvent("AirtimeRecommended_Click").add("type", airtimeSpecialRechargeItem.getSpotType()).add("itemId", airtimeSpecialRechargeItem.getItemId());
                    Long price = airtimeSpecialRechargeItem.getPrice();
                    n0VarG.k(clickEventAdd.add(FirebaseAnalytics.Param.PRICE, String.valueOf(price != null ? price.longValue() : 0L)).add("jumpUrl", airtimeSpecialRechargeItem.getJumpUrl()));
                    break;
                }
                break;
            case 4:
                BaseAirtimeItemsBean data2 = (BaseAirtimeItemsBean) obj;
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(data2, "data");
                AirtimeSpecialRechargeItem airtimeSpecialRechargeItem2 = data2 instanceof AirtimeSpecialRechargeItem ? (AirtimeSpecialRechargeItem) data2 : null;
                if (airtimeSpecialRechargeItem2 != null) {
                    p1.c cVar2 = ((p155k9.b) this.f11149f).f38702b.f38712e;
                    if (cVar2 != null) {
                        cVar2.onCustomPackageItemClick(i7, airtimeSpecialRechargeItem2);
                    }
                    n0 n0VarG2 = n0.g();
                    ClickEvent clickEventAdd2 = new ClickEvent("AirtimeRecommended_Click").add("type", airtimeSpecialRechargeItem2.getSpotType());
                    Long price2 = airtimeSpecialRechargeItem2.getPrice();
                    n0VarG2.k(clickEventAdd2.add(FirebaseAnalytics.Param.PRICE, String.valueOf(price2 != null ? price2.longValue() : 0L)).add("itemId", airtimeSpecialRechargeItem2.getItemId()).add("jumpUrl", airtimeSpecialRechargeItem2.getJumpUrl()));
                    break;
                }
                break;
            default:
                super.g(helper, view, obj, i7);
                break;
        }
    }

    public i(C1648u isSelected, byte b7) {
        Intrinsics.checkNotNullParameter(isSelected, "isSelected");
        this.f11149f = isSelected;
    }

    public i(j jVar) {
        this.f11149f = jVar;
    }

    public i(p155k9.b getItemClick) {
        Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
        this.f11149f = getItemClick;
    }

    public i(p155k9.b getItemClick, byte b7) {
        Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
        this.f11149f = getItemClick;
    }
}
