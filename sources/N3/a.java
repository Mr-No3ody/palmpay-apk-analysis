package N3;

import C0.G;
import E.AbstractC0198c;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCashierPayMethodFlexiItem;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCashierPayMethodItem;
import com.flexibank.sdk.o;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6070j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Function0 function0, Function0 function1, Function0 function2, int i7) {
        super(function0, function1, function2, 0);
        this.f6070j = i7;
    }

    @Override // T1.b
    public final void b(BaseViewHolder holder, Object obj) {
        TextView mPayMethodNumTv;
        TextView mPayMethodNumTv2;
        switch (this.f6070j) {
            case 0:
                FlexiBankCashierPaymentMethodBean pm = (FlexiBankCashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                FlexiBankCashierPayMethodItem itemHolder = (FlexiBankCashierPayMethodItem) holder.getView(p.fb_model_payment_layout);
                if (pm != null) {
                    long jLongValue = ((Number) this.f6073g.invoke()).longValue();
                    Intrinsics.checkNotNullParameter(itemHolder, "itemHolder");
                    Intrinsics.checkNotNullParameter(pm, "pm");
                    itemHolder.a(pm, true);
                    ImageView mPayMethodImg = itemHolder.getMPayMethodImg();
                    if (mPayMethodImg != null) {
                        mPayMethodImg.setImageResource(o.fb_cl_cash_loan_icon);
                    }
                    TextView mPayMethodNameTv = itemHolder.getMPayMethodNameTv();
                    if (mPayMethodNameTv != null) {
                        mPayMethodNameTv.setText(r.fb_palmpay_payment_balance);
                    }
                    TextView mPayMethodNumTv3 = itemHolder.getMPayMethodNumTv();
                    if (mPayMethodNumTv3 != null) {
                        G.y(" (", p118hf.a.t(pm.getAvailableBalance(), false), ")", mPayMethodNumTv3);
                    }
                    itemHolder.a(pm, pm.getAvailableBalance() >= jLongValue && pm.getEnable());
                    if (!j(pm)) {
                        ImageView mRightIv = itemHolder.getMRightIv();
                        if (mRightIv != null) {
                            mRightIv.setImageResource(0);
                        }
                    } else {
                        ImageView mRightIv2 = itemHolder.getMRightIv();
                        if (mRightIv2 != null) {
                            mRightIv2.setImageResource(o.fb_checked_single_purple);
                        }
                    }
                }
                break;
            case 1:
                FlexiBankCashierPaymentMethodBean pm2 = (FlexiBankCashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                FlexiBankCashierPayMethodItem itemHolder2 = (FlexiBankCashierPayMethodItem) holder.getView(p.fb_model_payment_layout);
                if (pm2 != null) {
                    ((Number) this.f6073g.invoke()).longValue();
                    Intrinsics.checkNotNullParameter(itemHolder2, "itemHolder");
                    Intrinsics.checkNotNullParameter(pm2, "pm");
                    itemHolder2.a(pm2, true);
                    TextView mPayMethodNumTv4 = itemHolder2.getMPayMethodNumTv();
                    if (mPayMethodNumTv4 != null) {
                        mPayMethodNumTv4.setText("");
                    }
                    if (pm2.getSenderAccountType() == 5 || pm2.getSenderAccountType() == 12) {
                        TextView mPayMethodNameTv2 = itemHolder2.getMPayMethodNameTv();
                        if (mPayMethodNameTv2 != null) {
                            mPayMethodNameTv2.setText(pm2.getBankName());
                        }
                        if (!TextUtils.isEmpty(pm2.getCardNo()) && (mPayMethodNumTv = itemHolder2.getMPayMethodNumTv()) != null) {
                            String cardNo = pm2.getCardNo();
                            if (!TextUtils.isEmpty(cardNo)) {
                                Intrinsics.e(cardNo);
                                if (cardNo.length() > 4) {
                                    cardNo = cardNo.substring(cardNo.length() - 4);
                                    Intrinsics.checkNotNullExpressionValue(cardNo, "substring(...)");
                                }
                            }
                            G.y("(", cardNo, ")", mPayMethodNumTv);
                        }
                        AbstractC0198c.M(pm2.getBankUrl(), itemHolder2.getMPayMethodImg());
                    } else if (pm2.getSenderAccountType() == 6) {
                        TextView mPayMethodNameTv3 = itemHolder2.getMPayMethodNameTv();
                        if (mPayMethodNameTv3 != null) {
                            mPayMethodNameTv3.setText(pm2.getBankName());
                        }
                        String bankAccountNo = !TextUtils.isEmpty(pm2.getBankAccountNo()) ? pm2.getBankAccountNo() : pm2.getCardNo();
                        if (!TextUtils.isEmpty(bankAccountNo) && (mPayMethodNumTv2 = itemHolder2.getMPayMethodNumTv()) != null) {
                            if (!TextUtils.isEmpty(bankAccountNo)) {
                                Intrinsics.e(bankAccountNo);
                                if (bankAccountNo.length() > 5) {
                                    bankAccountNo = bankAccountNo.substring(bankAccountNo.length() - 5);
                                    Intrinsics.checkNotNullExpressionValue(bankAccountNo, "substring(...)");
                                }
                            }
                            G.y("(", bankAccountNo, ")", mPayMethodNumTv2);
                        }
                        AbstractC0198c.M(pm2.getBankUrl(), itemHolder2.getMPayMethodImg());
                    }
                    if (!j(pm2)) {
                        ImageView mRightIv3 = itemHolder2.getMRightIv();
                        if (mRightIv3 != null) {
                            mRightIv3.setImageResource(0);
                        }
                    } else {
                        ImageView mRightIv4 = itemHolder2.getMRightIv();
                        if (mRightIv4 != null) {
                            mRightIv4.setImageResource(o.fb_checked_single_purple);
                        }
                    }
                }
                break;
            case 2:
                FlexiBankCashierPaymentMethodBean pm3 = (FlexiBankCashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                FlexiBankCashierPayMethodItem itemHolder3 = (FlexiBankCashierPayMethodItem) holder.getView(p.fb_model_payment_layout);
                if (pm3 != null) {
                    long jLongValue2 = ((Number) this.f6073g.invoke()).longValue();
                    Intrinsics.checkNotNullParameter(itemHolder3, "itemHolder");
                    Intrinsics.checkNotNullParameter(pm3, "pm");
                    itemHolder3.a(pm3, true);
                    TextView mPayMethodNameTv4 = itemHolder3.getMPayMethodNameTv();
                    if (mPayMethodNameTv4 != null) {
                        mPayMethodNameTv4.setText(c().getString(r.fb_palmpay_payment_flex_saving));
                    }
                    ImageView mPayMethodImg2 = itemHolder3.getMPayMethodImg();
                    if (mPayMethodImg2 != null) {
                        mPayMethodImg2.setImageResource(o.fb_cash_box_icon_circle_purple);
                    }
                    TextView mPayMethodNumTv5 = itemHolder3.getMPayMethodNumTv();
                    if (mPayMethodNumTv5 != null) {
                        G.y("(", p118hf.a.t(pm3.getAvailableBalance(), true), ")", mPayMethodNumTv5);
                    }
                    if (!TextUtils.isEmpty(pm3.getAcTips())) {
                        FlexiBankCashierPayMethodItem.b(itemHolder3.getMHintText(), pm3.getAcTips());
                    }
                    itemHolder3.a(pm3, pm3.getAvailableBalance() >= jLongValue2 && pm3.getEnable());
                    if (!j(pm3)) {
                        ImageView mRightIv5 = itemHolder3.getMRightIv();
                        if (mRightIv5 != null) {
                            mRightIv5.setImageResource(0);
                        }
                    } else {
                        ImageView mRightIv6 = itemHolder3.getMRightIv();
                        if (mRightIv6 != null) {
                            mRightIv6.setImageResource(o.fb_checked_single_purple);
                        }
                    }
                }
                break;
            case 3:
                FlexiBankCashierPaymentMethodBean pm4 = (FlexiBankCashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                FlexiBankCashierPayMethodFlexiItem flexiBankCashierPayMethodFlexiItem = (FlexiBankCashierPayMethodFlexiItem) holder.getView(p.fb_model_payment_flexi_layout);
                if (pm4 != null) {
                    long jLongValue3 = ((Number) this.f6073g.invoke()).longValue();
                    flexiBankCashierPayMethodFlexiItem.getClass();
                    Intrinsics.checkNotNullParameter(pm4, "pm");
                    ImageView mPayMethodImg3 = flexiBankCashierPayMethodFlexiItem.getMPayMethodImg();
                    if (mPayMethodImg3 != null) {
                        mPayMethodImg3.setImageResource(o.fb_ok_card_icon);
                    }
                    TextView mPayMethodNameTv5 = flexiBankCashierPayMethodFlexiItem.getMPayMethodNameTv();
                    if (mPayMethodNameTv5 != null) {
                        mPayMethodNameTv5.setText(r.fb_oc_limit);
                    }
                    TextView mPayMethodNumTv6 = flexiBankCashierPayMethodFlexiItem.getMPayMethodNumTv();
                    if (mPayMethodNumTv6 != null) {
                        G.y(" (", p118hf.a.t(pm4.getAvailableBalance(), false), ")", mPayMethodNumTv6);
                    }
                    if (!pm4.getEnable() || pm4.getAvailableBalance() <= jLongValue3) {
                        flexiBankCashierPayMethodFlexiItem.a(pm4, false);
                        if (pm4.getAvailableBalance() < jLongValue3) {
                            flexiBankCashierPayMethodFlexiItem.c(flexiBankCashierPayMethodFlexiItem.getMContext().getString(r.fb_insufficient_balance), true);
                        }
                    } else {
                        flexiBankCashierPayMethodFlexiItem.a(pm4, true);
                    }
                }
                if (!j(pm4)) {
                    ImageView mRightIv7 = flexiBankCashierPayMethodFlexiItem.getMRightIv();
                    if (mRightIv7 != null) {
                        mRightIv7.setImageResource(0);
                    }
                } else {
                    ImageView mRightIv8 = flexiBankCashierPayMethodFlexiItem.getMRightIv();
                    if (mRightIv8 != null) {
                        mRightIv8.setImageResource(o.fb_checked_single_purple);
                    }
                }
                break;
            default:
                FlexiBankCashierPaymentMethodBean pm5 = (FlexiBankCashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                FlexiBankCashierPayMethodItem itemHolder4 = (FlexiBankCashierPayMethodItem) holder.getView(p.fb_model_payment_layout);
                if (pm5 != null) {
                    ((Number) this.f6073g.invoke()).longValue();
                    Intrinsics.checkNotNullParameter(itemHolder4, "itemHolder");
                    Intrinsics.checkNotNullParameter(pm5, "pm");
                    itemHolder4.a(pm5, true);
                    TextView mPayMethodNameTv6 = itemHolder4.getMPayMethodNameTv();
                    if (mPayMethodNameTv6 != null) {
                        mPayMethodNameTv6.setText(pm5.getBankName());
                    }
                    TextView mPayMethodNumTv7 = itemHolder4.getMPayMethodNumTv();
                    if (mPayMethodNumTv7 != null) {
                        G.y(" (", J3.a.w(pm5.getBankAccountNo()), ")", mPayMethodNumTv7);
                    }
                    AbstractC0198c.N(itemHolder4.getMPayMethodImg(), pm5.getBankUrl(), o.fb_operator_icon);
                    if (!j(pm5)) {
                        ImageView mRightIv9 = itemHolder4.getMRightIv();
                        if (mRightIv9 != null) {
                            mRightIv9.setImageResource(0);
                        }
                    } else {
                        ImageView mRightIv10 = itemHolder4.getMRightIv();
                        if (mRightIv10 != null) {
                            mRightIv10.setImageResource(o.fb_checked_single_purple);
                        }
                    }
                }
                break;
        }
    }

    @Override // T1.b
    public final int d() {
        switch (this.f6070j) {
            case 0:
                return 19;
            case 1:
                return 20;
            case 2:
                return 21;
            case 3:
                return 18;
            default:
                return 22;
        }
    }

    @Override // T1.b
    public final int e() {
        switch (this.f6070j) {
            case 0:
                return q.fb_layout_cashier_payment_method_balance_item;
            case 1:
                return q.fb_layout_cashier_payment_method_bank_item;
            case 2:
                return q.fb_layout_cashier_payment_method_cashbox_item;
            case 3:
                return q.fb_layout_cashier_payment_method_flexi_item;
            default:
                return q.fb_layout_cashier_payment_method_mobile_wallet_item;
        }
    }
}
