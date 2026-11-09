package p323v9;

import Pd.f;
import Rd.i0;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.betting.ui.fragment.BettingWithdrawHomeFragment;
import com.transsnet.palmpay.betting.viewmodel.BettingWithDrawViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.dialog.TipsDialog2;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.teller.bean.BettingWithdrawRedeemCodeReq;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.bean.QtQuotaCheckReq;
import com.transsnet.palmpay.teller.bean.resp.BettingWithdrawRedeemCodeData;
import com.transsnet.palmpay.teller.bean.resp.CheckBettingValidationResp;
import com.transsnet.palmpay.teller.bean.resp.CreateBettingOrderData;
import com.transsnet.palmpay.teller.bean.resp.QueryLastBillData;
import com.transsnet.palmpay.util.ScrollViewUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p025ba.k;
import p070ee.b;
import p355xf.l;
import x9.B;
import x9.C;
import x9.w;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BettingWithdrawHomeFragment f43134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BettingWithdrawHomeFragment f43135c;

    public /* synthetic */ h(BettingWithdrawHomeFragment bettingWithdrawHomeFragment, BettingWithdrawHomeFragment bettingWithdrawHomeFragment2, int i7) {
        this.f43133a = i7;
        this.f43134b = bettingWithdrawHomeFragment;
        this.f43135c = bettingWithdrawHomeFragment2;
    }

    /* JADX WARN: Code duplicated, block: B:315:0x0574  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CreateBettingOrderData.ValidateCustomer validateCustomerResp;
        String name;
        CreateBettingOrderData.ValidateCustomer validateCustomerResp2;
        String billerId;
        String billerName;
        String billerIcon;
        String customerField1;
        String str = "";
        BettingWithdrawHomeFragment bettingWithdrawHomeFragment = this.f43135c;
        BettingWithdrawHomeFragment bettingWithdrawHomeFragment2 = this.f43134b;
        switch (this.f43133a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                    CommonBeanResult response = (CommonBeanResult) ((p) it).f27360a;
                    Intrinsics.checkNotNullParameter(response, "response");
                    QueryLastBillData queryLastBillData = (QueryLastBillData) response.data;
                    if (queryLastBillData != null) {
                        ChannelDataItemBean channelDataItemBean = bettingWithdrawHomeFragment.f26737w;
                        if (TextUtils.isEmpty(channelDataItemBean != null ? channelDataItemBean.getBillerId() : null)) {
                            String billerId2 = queryLastBillData.getBillerId();
                            queryLastBillData.getPaymentItemId();
                            bettingWithdrawHomeFragment.z(billerId2, queryLastBillData.getCustomerId(), true);
                        } else {
                            ChannelDataItemBean channelDataItemBean2 = bettingWithdrawHomeFragment.f26737w;
                            if (y.h(channelDataItemBean2 != null ? channelDataItemBean2.getBillerId() : null, queryLastBillData.getBillerId(), false)) {
                                String billerId3 = queryLastBillData.getBillerId();
                                queryLastBillData.getPaymentItemId();
                                bettingWithdrawHomeFragment.z(billerId3, queryLastBillData.getCustomerId(), true);
                            }
                        }
                    } else {
                        ChannelDataItemBean channelDataItemBean3 = bettingWithdrawHomeFragment.f26737w;
                        if (TextUtils.isEmpty(channelDataItemBean3 != null ? channelDataItemBean3.getBillerId() : null)) {
                            bettingWithdrawHomeFragment.w();
                        }
                    }
                } else if (it instanceof m) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                    ((n) it).getClass();
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                    CommonBeanResult response2 = (CommonBeanResult) ((p) it2).f27360a;
                    Intrinsics.checkNotNullParameter(response2, "response");
                    if (response2.isSuccess()) {
                        CreateBettingOrderData createBettingOrderData = (CreateBettingOrderData) response2.data;
                        if (createBettingOrderData == null || (validateCustomerResp2 = createBettingOrderData.getValidateCustomerResp()) == null || validateCustomerResp2.getExists()) {
                            if (bettingWithdrawHomeFragment.f26731C == null) {
                                bettingWithdrawHomeFragment.f26731C = new PaymentItemBean();
                            }
                            PaymentItemBean paymentItemBean = bettingWithdrawHomeFragment.f26731C;
                            if (paymentItemBean != null) {
                                paymentItemBean.categoryId = bettingWithdrawHomeFragment.f26736v;
                                BettingBillerListItemBean bettingBillerListItemBean = bettingWithdrawHomeFragment.f26730B;
                                paymentItemBean.billerName = bettingBillerListItemBean != null ? bettingBillerListItemBean.getBillerName() : null;
                                BettingBillerListItemBean bettingBillerListItemBean2 = bettingWithdrawHomeFragment.f26730B;
                                paymentItemBean.billerId = bettingBillerListItemBean2 != null ? bettingBillerListItemBean2.getBillerId() : null;
                                paymentItemBean.paymentItemId = "";
                                paymentItemBean.institutionLogo = "";
                                paymentItemBean.paymentItemName = "";
                            }
                            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_withdraw_confirm_payment_order").withSerializable("payment_item", bettingWithdrawHomeFragment.f26731C).withString("customerId", bettingWithdrawHomeFragment.x());
                            CreateBettingOrderData createBettingOrderData2 = (CreateBettingOrderData) response2.data;
                            if (createBettingOrderData2 != null && (validateCustomerResp = createBettingOrderData2.getValidateCustomerResp()) != null && (name = validateCustomerResp.getName()) != null) {
                                str = name;
                            }
                            Postcard postcardWithString2 = postcardWithString.withString("fullName", str);
                            i0 i0Var = (i0) bettingWithdrawHomeFragment.f27335j;
                            Postcard postcardWithLong = postcardWithString2.withLong("amount", i0Var != null ? i0Var.f8352p.getLongAmount() : 0L);
                            CreateBettingOrderData createBettingOrderData3 = (CreateBettingOrderData) response2.data;
                            postcardWithLong.withString("orderNo", createBettingOrderData3 != null ? createBettingOrderData3.getOrderNo() : null).navigation();
                        } else {
                            i0 i0Var2 = (i0) bettingWithdrawHomeFragment.f27335j;
                            if (i0Var2 != null) {
                                i0Var2.f8341A.setErrorMessage(bettingWithdrawHomeFragment.getString(f.qt_user_id_is_invalid));
                            }
                        }
                    } else {
                        ToastUtils.showLong(response2.getRespMsg(), new Object[0]);
                    }
                } else if (it2 instanceof m) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                    ((n) it2).getClass();
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof o) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                    CommonBeanResult response3 = (CommonBeanResult) ((p) it3).f27360a;
                    Intrinsics.checkNotNullParameter(response3, "response");
                    CheckBettingValidationResp checkBettingValidationResp = (CheckBettingValidationResp) response3.data;
                    if (checkBettingValidationResp != null) {
                        if (!Intrinsics.c(checkBettingValidationResp.getExists(), Boolean.TRUE)) {
                            i0 i0Var3 = (i0) bettingWithdrawHomeFragment.f27335j;
                            ScrollViewUtils.scrollToView(i0Var3 != null ? i0Var3.f8350j : null, i0Var3 != null ? i0Var3.f8341A : null);
                            i0 i0Var4 = (i0) bettingWithdrawHomeFragment.f27335j;
                            if (i0Var4 != null) {
                                i0Var4.f8341A.setErrorMessage(bettingWithdrawHomeFragment.getString(f.qt_user_id_is_invalid));
                            }
                        } else if (bettingWithdrawHomeFragment.f26735Q) {
                            BettingWithDrawViewModel bettingWithDrawViewModel = (BettingWithDrawViewModel) bettingWithdrawHomeFragment.f27333i;
                            if (bettingWithDrawViewModel != null) {
                                i0 i0Var5 = (i0) bettingWithdrawHomeFragment.f27335j;
                                String number = i0Var5 != null ? i0Var5.f8354w.getNumber() : null;
                                BettingBillerListItemBean bettingBillerListItemBean3 = bettingWithdrawHomeFragment.f26730B;
                                String billerId4 = bettingBillerListItemBean3 != null ? bettingBillerListItemBean3.getBillerId() : null;
                                BettingBillerListItemBean bettingBillerListItemBean4 = bettingWithdrawHomeFragment.f26730B;
                                String billerName2 = bettingBillerListItemBean4 != null ? bettingBillerListItemBean4.getBillerName() : null;
                                i0 i0Var6 = (i0) bettingWithdrawHomeFragment.f27335j;
                                String number2 = i0Var6 != null ? i0Var6.f8341A.getNumber() : null;
                                BettingBillerListItemBean bettingBillerListItemBean5 = bettingWithdrawHomeFragment.f26730B;
                                BettingWithdrawRedeemCodeReq req = new BettingWithdrawRedeemCodeReq(number, billerId4, billerName2, bettingWithdrawHomeFragment.f26736v, number2, bettingBillerListItemBean5 != null ? bettingBillerListItemBean5.getBillerIcon() : null, TransType.TRANS_TYPE_MERCHANT_PAYMENT);
                                Intrinsics.checkNotNullParameter(req, "req");
                                p140j8.f.s(bettingWithDrawViewModel, new C(req, null), bettingWithDrawViewModel.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                        } else {
                            String name2 = checkBettingValidationResp.getName();
                            bettingWithdrawHomeFragment.f26734M = name2 != null ? name2 : "";
                            BettingWithDrawViewModel bettingWithDrawViewModel2 = (BettingWithDrawViewModel) bettingWithdrawHomeFragment.f27333i;
                            if (bettingWithDrawViewModel2 != null) {
                                i0 i0Var7 = (i0) bettingWithdrawHomeFragment.f27335j;
                                long longAmount = i0Var7 != null ? i0Var7.f8352p.getLongAmount() : 0L;
                                String customerId = bettingWithdrawHomeFragment.x();
                                Intrinsics.checkNotNullParameter(customerId, "customerId");
                                if (BaseApplication.hasLogin()) {
                                    QtQuotaCheckReq qtQuotaCheckReq = new QtQuotaCheckReq();
                                    qtQuotaCheckReq.setBusinessAmount(Long.valueOf(longAmount));
                                    qtQuotaCheckReq.setCustomerId(customerId);
                                    qtQuotaCheckReq.setTransType(TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW);
                                    p140j8.f.s(bettingWithDrawViewModel2, new B(qtQuotaCheckReq, null), bettingWithDrawViewModel2.f26789p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                            }
                        }
                    }
                } else if (it3 instanceof m) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof n)) {
                        throw new l();
                    }
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                    ((n) it3).getClass();
                }
                return Unit.f38893a;
            case 3:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof o) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(true, true);
                } else if (it4 instanceof p) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                    CommonBeanResult response4 = (CommonBeanResult) ((p) it4).f27360a;
                    Intrinsics.checkNotNullParameter(response4, "response");
                    i0 i0Var8 = (i0) bettingWithdrawHomeFragment.f27335j;
                    if (i0Var8 != null) {
                        p220oa.h.s(i0Var8.f8345d, false);
                    }
                    BettingWithdrawRedeemCodeData bettingWithdrawRedeemCodeData = (BettingWithdrawRedeemCodeData) response4.data;
                    Integer numValueOf = bettingWithdrawRedeemCodeData != null ? Integer.valueOf(bettingWithdrawRedeemCodeData.getStatus()) : null;
                    if (numValueOf != null && numValueOf.intValue() == 1) {
                        if (bettingWithdrawHomeFragment.f26731C == null) {
                            bettingWithdrawHomeFragment.f26731C = new PaymentItemBean();
                        }
                        PaymentItemBean paymentItemBean2 = bettingWithdrawHomeFragment.f26731C;
                        if (paymentItemBean2 != null) {
                            paymentItemBean2.categoryId = bettingWithdrawHomeFragment.f26736v;
                            BettingBillerListItemBean bettingBillerListItemBean6 = bettingWithdrawHomeFragment.f26730B;
                            paymentItemBean2.billerName = bettingBillerListItemBean6 != null ? bettingBillerListItemBean6.getBillerName() : null;
                            BettingBillerListItemBean bettingBillerListItemBean7 = bettingWithdrawHomeFragment.f26730B;
                            paymentItemBean2.billerId = bettingBillerListItemBean7 != null ? bettingBillerListItemBean7.getBillerId() : null;
                            paymentItemBean2.paymentItemId = "";
                            paymentItemBean2.institutionLogo = "";
                            paymentItemBean2.paymentItemName = "";
                        }
                        BettingWithdrawRedeemCodeData bettingWithdrawRedeemCodeData2 = (BettingWithdrawRedeemCodeData) response4.data;
                        if (bettingWithdrawRedeemCodeData2 != null) {
                            Postcard postcardWithString3 = ARouter.getInstance().build("/quick_teller/betting_withdraw_confirm_payment_order").withSerializable("payment_item", bettingWithdrawHomeFragment.f26731C).withString("customerId", bettingWithdrawHomeFragment.x()).withString("fullName", bettingWithdrawRedeemCodeData2.getAccountName());
                            Long businessAmount = bettingWithdrawRedeemCodeData2.getBusinessAmount();
                            postcardWithString3.withLong("amount", businessAmount != null ? businessAmount.longValue() : 0L).withString("orderNo", bettingWithdrawRedeemCodeData2.getOrderNo()).withBoolean("is_security_code", true).withString("security_code_order_no", bettingWithdrawRedeemCodeData2.getOrderNo()).navigation();
                        }
                    } else if (numValueOf != null && numValueOf.intValue() == 2) {
                        i0 i0Var9 = (i0) bettingWithdrawHomeFragment.f27335j;
                        if (i0Var9 != null) {
                            i0Var9.f8354w.setErrorMessage(bettingWithdrawHomeFragment.getString(f.qt_confirmation_code_is_invalid));
                        }
                    } else if (numValueOf != null && numValueOf.intValue() == 3) {
                        i0 i0Var10 = (i0) bettingWithdrawHomeFragment.f27335j;
                        if (i0Var10 != null) {
                            p220oa.h.s(i0Var10.f8345d, true);
                        }
                    } else if (numValueOf != null && numValueOf.intValue() == 4) {
                        Context contextRequireContext = bettingWithdrawHomeFragment.requireContext();
                        String string = contextRequireContext.getString(k.core_tips);
                        String string2 = bettingWithdrawHomeFragment.getString(f.qt_betting_user_update_t2);
                        String string3 = bettingWithdrawHomeFragment.getString(k.core_upgrade);
                        String string4 = bettingWithdrawHomeFragment.getString(k.core_confirm);
                        e eVar = new e();
                        TipsDialog2 tipsDialog2 = new TipsDialog2(contextRequireContext, t.cv_tips_dialog2);
                        tipsDialog2.setMessage(string2);
                        tipsDialog2.setTitleText(string);
                        tipsDialog2.setConfirmBtnText(string3);
                        tipsDialog2.setOpposeBtnText(string4);
                        tipsDialog2.setOnConfirmListener(eVar);
                        tipsDialog2.show();
                    }
                } else if (it4 instanceof m) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it4 instanceof n)) {
                        throw new l();
                    }
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                    ((n) it4).getClass();
                }
                return Unit.f38893a;
            default:
                q it5 = (q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (it5 instanceof o) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(true, true);
                } else if (it5 instanceof p) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                    CommonResult response5 = (CommonResult) ((p) it5).f27360a;
                    Intrinsics.checkNotNullParameter(response5, "response");
                    if (response5.isSuccess()) {
                        i0 i0Var11 = (i0) bettingWithdrawHomeFragment.f27335j;
                        Long lValueOf = i0Var11 != null ? Long.valueOf(i0Var11.f8352p.getLongAmount()) : null;
                        PaymentItemBean paymentItemBean3 = bettingWithdrawHomeFragment.f26731C;
                        if (paymentItemBean3 != null) {
                            if (TextUtils.isEmpty(paymentItemBean3.billerId)) {
                                BettingBillerListItemBean bettingBillerListItemBean8 = bettingWithdrawHomeFragment.f26730B;
                                billerId = bettingBillerListItemBean8 != null ? bettingBillerListItemBean8.getBillerId() : null;
                            } else {
                                billerId = paymentItemBean3.billerId;
                            }
                            paymentItemBean3.billerId = billerId;
                            if (TextUtils.isEmpty(paymentItemBean3.billerName)) {
                                BettingBillerListItemBean bettingBillerListItemBean9 = bettingWithdrawHomeFragment.f26730B;
                                billerName = bettingBillerListItemBean9 != null ? bettingBillerListItemBean9.getBillerName() : null;
                            } else {
                                billerName = paymentItemBean3.billerName;
                            }
                            paymentItemBean3.billerName = billerName;
                            if (TextUtils.isEmpty(paymentItemBean3.institutionLogo)) {
                                BettingBillerListItemBean bettingBillerListItemBean10 = bettingWithdrawHomeFragment.f26730B;
                                billerIcon = bettingBillerListItemBean10 != null ? bettingBillerListItemBean10.getBillerIcon() : null;
                            } else {
                                billerIcon = paymentItemBean3.institutionLogo;
                            }
                            paymentItemBean3.institutionLogo = billerIcon;
                            if (TextUtils.isEmpty(paymentItemBean3.customerField1)) {
                                BettingBillerListItemBean bettingBillerListItemBean11 = bettingWithdrawHomeFragment.f26730B;
                                customerField1 = bettingBillerListItemBean11 != null ? bettingBillerListItemBean11.getCustomerField1() : null;
                            } else {
                                customerField1 = paymentItemBean3.customerField1;
                            }
                            paymentItemBean3.customerField1 = customerField1;
                        }
                        CreateTellerOrderReq req2 = new CreateTellerOrderReq();
                        req2.businessAmount = lValueOf != null ? lValueOf.longValue() : 0L;
                        req2.payAmount = lValueOf != null ? lValueOf.longValue() : 0L;
                        req2.payeeAmount = lValueOf != null ? lValueOf.longValue() : 0L;
                        req2.totalAmount = lValueOf != null ? lValueOf.longValue() : 0L;
                        req2.customerId = bettingWithdrawHomeFragment.x();
                        req2.fullName = bettingWithdrawHomeFragment.f26734M;
                        Object obj2 = b.f36288a;
                        String str2 = bettingWithdrawHomeFragment.f26736v;
                        req2.businessType = b.a(str2);
                        BettingBillerListItemBean bettingBillerListItemBean12 = bettingWithdrawHomeFragment.f26730B;
                        if (TextUtils.isEmpty(bettingBillerListItemBean12 != null ? bettingBillerListItemBean12.getBillerId() : null)) {
                            p220oa.h.y(bettingWithdrawHomeFragment, bettingWithdrawHomeFragment.getString(f.qt_select_biller_to_pay));
                        } else {
                            BettingBillerListItemBean bettingBillerListItemBean13 = bettingWithdrawHomeFragment.f26730B;
                            req2.billerId = bettingBillerListItemBean13 != null ? bettingBillerListItemBean13.getBillerId() : null;
                            BettingBillerListItemBean bettingBillerListItemBean14 = bettingWithdrawHomeFragment.f26730B;
                            req2.billerName = bettingBillerListItemBean14 != null ? bettingBillerListItemBean14.getBillerName() : null;
                            req2.categoryId = str2;
                            BettingBillerListItemBean bettingBillerListItemBean15 = bettingWithdrawHomeFragment.f26730B;
                            req2.icon = bettingBillerListItemBean15 != null ? bettingBillerListItemBean15.getBillerIcon() : null;
                            PaymentItemBean paymentItemBean4 = bettingWithdrawHomeFragment.f26731C;
                            req2.paymentItemId = paymentItemBean4 != null ? paymentItemBean4.paymentItemId : null;
                            req2.paymentItemName = paymentItemBean4 != null ? paymentItemBean4.paymentItemName : null;
                            BettingWithDrawViewModel bettingWithDrawViewModel3 = (BettingWithDrawViewModel) bettingWithdrawHomeFragment.f27333i;
                            if (bettingWithDrawViewModel3 != null) {
                                Intrinsics.checkNotNullParameter(req2, "req");
                                w wVar = new w(req2, null);
                                com.transsnet.palmpay.core.base.l lVar = bettingWithDrawViewModel3.f26788o;
                                lVar.f27356m = req2;
                                Unit unit = Unit.f38893a;
                                p140j8.f.v(bettingWithDrawViewModel3, wVar, lVar, 0L);
                            }
                        }
                    } else {
                        Pa.i0.i0(bettingWithdrawHomeFragment.requireContext(), response5.getRespCode(), response5.getRespMsg(), false);
                    }
                } else if (it5 instanceof m) {
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it5 instanceof n)) {
                        throw new l();
                    }
                    bettingWithdrawHomeFragment2.showLoadingDialog(false, true);
                    ((n) it5).getClass();
                }
                return Unit.f38893a;
        }
    }
}
