package C9;

import Ab.ViewOnClickListenerC0053e;
import C0.AbstractC0130w;
import N8.l0;
import N8.m0;
import N8.q0;
import Pa.AbstractC0508e;
import Pa.AbstractC0520q;
import Pa.i0;
import Pa.k0;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adjust.sdk.network.ErrorCodes;
import com.google.firebase.perf.util.Constants;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.bean.rsp.AddUserExtraActionRsp;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethod;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethodRsp;
import com.transsnet.palmpay.account.bean.rsp.SubmitGuardianRsp;
import com.transsnet.palmpay.account.bean.rsp.UserRawIdNo;
import com.transsnet.palmpay.account.ui.activity.AddUserExtraInfoEntryActivity;
import com.transsnet.palmpay.account.ui.activity.AddUserExtraInfoResultActivity;
import com.transsnet.palmpay.account.ui.activity.AuthenticationOtpActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianExtra2Fragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianExtraFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianRelationShipFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.bean.SubTaxItem;
import com.transsnet.palmpay.cash_in.bean.TaxItem;
import com.transsnet.palmpay.cash_in.bean.response.BindBankCardDetail;
import com.transsnet.palmpay.cash_in.bean.response.CreateCashInOutOrderRsp;
import com.transsnet.palmpay.cash_in.ui.activity.ConfirmAndPayWithdrawOrderActivity;
import com.transsnet.palmpay.cash_in.ui.fragment.BindBankCardDetailFragment;
import com.transsnet.palmpay.cash_in.ui.fragment.FundDetailFragment;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawRecordDetailFragment;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import com.transsnet.palmpay.cash_in.ui.view.ModelUssdInfo;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.rsp.CashOrderExtendBean;
import com.transsnet.palmpay.core.bean.rsp.ClipboardMatchInfoResp;
import com.transsnet.palmpay.core.ui.widget.FixedSavingsLayout;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeSimpleView;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import com.transsnet.palmpay.custom_view.dialog.SuccessFailDialog;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle1;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle2;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import com.transsnet.palmpay.managemoney.bean.PayoutOptionsChangeEvent;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxTermsConditionsDialogFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomePalmPayContactsFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeRecentlyFragment;
import com.transsnet.palmpay.send_money.ui.view.ClipboardAccountPromptView;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayAccountView;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class Q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1276c;

    public /* synthetic */ Q(int i7, Object obj, Object obj2) {
        this.f1274a = i7;
        this.f1275b = obj;
        this.f1276c = obj2;
    }

    private final Object a(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        TransferToBankHomePalmPayContactsFragment transferToBankHomePalmPayContactsFragment = (TransferToBankHomePalmPayContactsFragment) this.f1275b;
        if (z3) {
            transferToBankHomePalmPayContactsFragment.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            transferToBankHomePalmPayContactsFragment.showLoadingDialog(false, true);
            CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            boolean zIsSuccess = commonResult.isSuccess();
            TransferToBankHomePalmPayContactsFragment transferToBankHomePalmPayContactsFragment2 = (TransferToBankHomePalmPayContactsFragment) this.f1276c;
            if (zIsSuccess) {
                transferToBankHomePalmPayContactsFragment2.v();
            } else {
                p220oa.h.y(transferToBankHomePalmPayContactsFragment2, commonResult.getRespMsg());
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            transferToBankHomePalmPayContactsFragment.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            transferToBankHomePalmPayContactsFragment.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    private final Object b(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = (TransferToPalmPayContactAllFragment) this.f1275b;
        if (z3) {
            transferToPalmPayContactAllFragment.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            transferToPalmPayContactAllFragment.showLoadingDialog(false, true);
            CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            boolean zIsSuccess = commonResult.isSuccess();
            TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment2 = (TransferToPalmPayContactAllFragment) this.f1276c;
            if (zIsSuccess) {
                transferToPalmPayContactAllFragment2.w();
            } else {
                p220oa.h.y(transferToPalmPayContactAllFragment2, commonResult.getRespMsg());
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            transferToPalmPayContactAllFragment.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            transferToPalmPayContactAllFragment.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    private final Object c(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment = (TransferToPalmPayContactFavoriteFragment) this.f1275b;
        if (z3) {
            transferToPalmPayContactFavoriteFragment.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            transferToPalmPayContactFavoriteFragment.showLoadingDialog(false, true);
            CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            boolean zIsSuccess = commonResult.isSuccess();
            TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment2 = (TransferToPalmPayContactFavoriteFragment) this.f1276c;
            if (zIsSuccess) {
                transferToPalmPayContactFavoriteFragment2.v();
            } else {
                p220oa.h.y(transferToPalmPayContactFavoriteFragment2, commonResult.getRespMsg());
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            transferToPalmPayContactFavoriteFragment.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            transferToPalmPayContactFavoriteFragment.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    private final Object d(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        TransferToPalmPayHomeFavoriteFragment transferToPalmPayHomeFavoriteFragment = (TransferToPalmPayHomeFavoriteFragment) this.f1275b;
        if (z3) {
            transferToPalmPayHomeFavoriteFragment.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            transferToPalmPayHomeFavoriteFragment.showLoadingDialog(false, true);
            CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            boolean zIsSuccess = commonResult.isSuccess();
            TransferToPalmPayHomeFavoriteFragment transferToPalmPayHomeFavoriteFragment2 = (TransferToPalmPayHomeFavoriteFragment) this.f1276c;
            if (zIsSuccess) {
                transferToPalmPayHomeFavoriteFragment2.v();
            } else {
                p220oa.h.y(transferToPalmPayHomeFavoriteFragment2, commonResult.getRespMsg());
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            transferToPalmPayHomeFavoriteFragment.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            transferToPalmPayHomeFavoriteFragment.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj) {
        Bc.D d2;
        Bc.D d10;
        Bc.D d11;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            boolean z3 = it instanceof com.transsnet.palmpay.core.base.p;
            TransferToPalmPayHomeFragment transferToPalmPayHomeFragment = (TransferToPalmPayHomeFragment) this.f1276c;
            if (z3) {
                Object obj2 = ((com.transsnet.palmpay.core.base.l) this.f1275b).f27356m;
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                String accountNo = (String) obj2;
                ClipboardMatchInfoResp clipboardMatchInfoResp = (ClipboardMatchInfoResp) commonBeanResult.data;
                Integer matchType = clipboardMatchInfoResp != null ? clipboardMatchInfoResp.getMatchType() : null;
                if (!commonBeanResult.isSuccess()) {
                    matchType = null;
                }
                Context context = transferToPalmPayHomeFragment.getContext();
                if (!AbstractC0508e.d() || accountNo == null || matchType == null || matchType.intValue() == 0 || matchType.intValue() == 1 || matchType.intValue() == 2 || context == null || !transferToPalmPayHomeFragment.isVisible() || !transferToPalmPayHomeFragment.isResumed()) {
                    p223od.r rVar = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                    if (rVar != null && (d10 = rVar.t.f33930c) != null) {
                        ClipboardAccountPromptView clipboardAccountPromptView = (ClipboardAccountPromptView) d10.f625p;
                        ((TextView) clipboardAccountPromptView.f33833a.f813d).setOnClickListener(null);
                        p220oa.h.c(clipboardAccountPromptView);
                    }
                } else if (AbstractC0508e.a(context, accountNo)) {
                    p223od.r rVar2 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                    if (rVar2 != null) {
                        TransferToPalmPayAccountView transferToPalmPayAccountView = rVar2.t;
                        Intrinsics.checkNotNullParameter(accountNo, "accountNo");
                        Bc.D d12 = transferToPalmPayAccountView.f33930c;
                        if (d12 != null) {
                            ((ClipboardAccountPromptView) d12.f625p).c(accountNo, "Transfer_ToPalmPay_QuickPaste", new Ab.C(transferToPalmPayAccountView, 17));
                        }
                    }
                } else {
                    p223od.r rVar3 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                    if (rVar3 != null && (d11 = rVar3.t.f33930c) != null) {
                        ClipboardAccountPromptView clipboardAccountPromptView2 = (ClipboardAccountPromptView) d11.f625p;
                        ((TextView) clipboardAccountPromptView2.f33833a.f813d).setOnClickListener(null);
                        p220oa.h.c(clipboardAccountPromptView2);
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ((com.transsnet.palmpay.core.base.n) it).getClass();
                p223od.r rVar4 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                if (rVar4 != null && (d2 = rVar4.t.f33930c) != null) {
                    ClipboardAccountPromptView clipboardAccountPromptView3 = (ClipboardAccountPromptView) d2.f625p;
                    ((TextView) clipboardAccountPromptView3.f33833a.f813d).setOnClickListener(null);
                    p220oa.h.c(clipboardAccountPromptView3);
                }
            }
        }
        return Unit.f38893a;
    }

    private final Object f(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment = (TransferToPalmPayHomeRecentlyFragment) this.f1275b;
        if (z3) {
            transferToPalmPayHomeRecentlyFragment.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            transferToPalmPayHomeRecentlyFragment.showLoadingDialog(false, true);
            CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            boolean zIsSuccess = commonResult.isSuccess();
            TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment2 = (TransferToPalmPayHomeRecentlyFragment) this.f1276c;
            if (zIsSuccess) {
                int i7 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                transferToPalmPayHomeRecentlyFragment2.v();
            } else {
                p220oa.h.y(transferToPalmPayHomeRecentlyFragment2, commonResult.getRespMsg());
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            transferToPalmPayHomeRecentlyFragment.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            transferToPalmPayHomeRecentlyFragment.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj) {
        OrderResultViewReceiptModel orderResultViewReceiptModel;
        ImageView orderStatusArrow;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        BindBankCardDetailFragment bindBankCardDetailFragment = (BindBankCardDetailFragment) this.f1275b;
        if (z3) {
            bindBankCardDetailFragment.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            bindBankCardDetailFragment.showLoadingDialog(false, true);
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            boolean zIsSuccess = commonBeanResult.isSuccess();
            BindBankCardDetailFragment bindBankCardDetailFragment2 = (BindBankCardDetailFragment) this.f1276c;
            if (zIsSuccess) {
                BindBankCardDetail bindBankCardDetail = (BindBankCardDetail) commonBeanResult.data;
                if (bindBankCardDetail != null) {
                    bindBankCardDetailFragment2.f27002B = bindBankCardDetail;
                    OrderResultHeaderModel orderResultHeaderModelT = bindBankCardDetailFragment2.t();
                    if (orderResultHeaderModelT != null) {
                        String str = bindBankCardDetail.bankUrl;
                        if (str == null) {
                            str = "";
                        }
                        orderResultHeaderModelT.h(str);
                    }
                    OrderResultHeaderModel orderResultHeaderModelT2 = bindBankCardDetailFragment2.t();
                    if (orderResultHeaderModelT2 != null) {
                        int i7 = p025ba.k.core_from_s1;
                        String str2 = bindBankCardDetail.bankName;
                        orderResultHeaderModelT2.o(bindBankCardDetailFragment2.getString(i7, str2 != null ? str2 : ""));
                    }
                    OrderResultHeaderModel orderResultHeaderModelT3 = bindBankCardDetailFragment2.t();
                    if (orderResultHeaderModelT3 != null) {
                        orderResultHeaderModelT3.c(r0.B(bindBankCardDetail.amount, false));
                    }
                    OrderResultHeaderModel orderResultHeaderModelT4 = bindBankCardDetailFragment2.t();
                    if (orderResultHeaderModelT4 != null && (orderStatusArrow = orderResultHeaderModelT4.getOrderStatusArrow()) != null) {
                        p220oa.h.c(orderStatusArrow);
                    }
                    OrderResultHeaderModel orderResultHeaderModelT5 = bindBankCardDetailFragment2.t();
                    if (orderResultHeaderModelT5 != null) {
                        orderResultHeaderModelT5.k(bindBankCardDetail.orderStatusDesc);
                    }
                    OrderResultHeaderModel orderResultHeaderModelT6 = bindBankCardDetailFragment2.t();
                    if (orderResultHeaderModelT6 != null) {
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        Context contextRequireContext = bindBankCardDetailFragment2.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        orderResultHeaderModelT6.l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(aVar, contextRequireContext, bindBankCardDetail.orderStatusDesc, 0.0f, 4, null));
                    }
                    String orderStatusDesc = bindBankCardDetail.orderStatusDesc;
                    Intrinsics.checkNotNullExpressionValue(orderStatusDesc, "orderStatusDesc");
                    if (StringsKt.A(orderStatusDesc, "success", true) && (orderResultViewReceiptModel = (OrderResultViewReceiptModel) bindBankCardDetailFragment2.f27003j.getValue()) != null) {
                        p220oa.h.C(orderResultViewReceiptModel);
                    }
                    p355xf.t tVar = bindBankCardDetailFragment2.t;
                    LinearLayout linearLayout = (LinearLayout) tVar.getValue();
                    if (linearLayout != null) {
                        String string = bindBankCardDetailFragment2.getResources().getString(p366y9.d.ci_fund_amount);
                        String strB = r0.B(bindBankCardDetail.amount, false);
                        androidx.fragment.app.E mActivity = bindBankCardDetailFragment2.f27319c;
                        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                        linearLayout.addView(new OrderResultAmountStyle1(mActivity, string, strB));
                    }
                    LinearLayout linearLayout2 = (LinearLayout) tVar.getValue();
                    if (linearLayout2 != null) {
                        androidx.fragment.app.E mActivity2 = bindBankCardDetailFragment2.f27319c;
                        Intrinsics.checkNotNullExpressionValue(mActivity2, "mActivity");
                        linearLayout2.addView(new OrderResultAmountStyle2(mActivity2, bindBankCardDetailFragment2.getResources().getString(p366y9.d.ci_payment_amount), r0.B(bindBankCardDetail.payAmount, false)));
                    }
                    p355xf.t tVar2 = bindBankCardDetailFragment2.f27005p;
                    LinearLayout linearLayout3 = (LinearLayout) tVar2.getValue();
                    if (linearLayout3 != null) {
                        androidx.fragment.app.E mActivity3 = bindBankCardDetailFragment2.f27319c;
                        Intrinsics.checkNotNullExpressionValue(mActivity3, "mActivity");
                        linearLayout3.addView(new OrderResultItemModel(mActivity3, 1002, bindBankCardDetailFragment2.getResources().getString(p366y9.d.ci_payer_bank), q0.j(bindBankCardDetail.bankName, i0.e(bindBankCardDetail.payerAccountType == 6 ? 5 : 4, bindBankCardDetail.bankCardNo))));
                    }
                    LinearLayout linearLayout4 = (LinearLayout) tVar2.getValue();
                    if (linearLayout4 != null) {
                        androidx.fragment.app.E mActivity4 = bindBankCardDetailFragment2.f27319c;
                        Intrinsics.checkNotNullExpressionValue(mActivity4, "mActivity");
                        linearLayout4.addView(new OrderResultItemModel(mActivity4, 1002, bindBankCardDetailFragment2.getResources().getString(p025ba.k.core_fund_method), r0.u0(bindBankCardDetail.payerAccountType)));
                    }
                    LinearLayout linearLayout5 = (LinearLayout) tVar2.getValue();
                    if (linearLayout5 != null) {
                        androidx.fragment.app.E mActivity5 = bindBankCardDetailFragment2.f27319c;
                        Intrinsics.checkNotNullExpressionValue(mActivity5, "mActivity");
                        linearLayout5.addView(new OrderResultItemModel(mActivity5, 1002, bindBankCardDetailFragment2.getResources().getString(p025ba.k.core_receive_account), bindBankCardDetailFragment2.getString(p025ba.k.core_palmpay_payment_balance)));
                    }
                    LinearLayout linearLayout6 = (LinearLayout) tVar2.getValue();
                    if (linearLayout6 != null) {
                        androidx.fragment.app.E mActivity6 = bindBankCardDetailFragment2.f27319c;
                        Intrinsics.checkNotNullExpressionValue(mActivity6, "mActivity");
                        linearLayout6.addView(new OrderResultItemModel(mActivity6, ErrorCodes.MALFORMED_URL_EXCEPTION, bindBankCardDetailFragment2.getResources().getString(p025ba.k.core_reference_no_2), bindBankCardDetail.orderId));
                    }
                    LinearLayout linearLayout7 = (LinearLayout) tVar2.getValue();
                    if (linearLayout7 != null) {
                        androidx.fragment.app.E mActivity7 = bindBankCardDetailFragment2.f27319c;
                        Intrinsics.checkNotNullExpressionValue(mActivity7, "mActivity");
                        linearLayout7.addView(new OrderResultItemModel(mActivity7, 1002, bindBankCardDetailFragment2.getResources().getString(p025ba.k.core_completion_time), r0.Q(bindBankCardDetail.updateTime)));
                    }
                }
            } else {
                p220oa.h.y(bindBankCardDetailFragment2, commonBeanResult.getRespMsg());
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            bindBankCardDetailFragment.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            bindBankCardDetailFragment.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj) {
        LinearLayout linearLayout;
        LinearLayout orderStatusLayout;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        FundDetailFragment fundDetailFragment = (FundDetailFragment) this.f1275b;
        if (z3) {
            fundDetailFragment.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            fundDetailFragment.showLoadingDialog(false, true);
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            boolean zIsSuccess = commonBeanResult.isSuccess();
            FundDetailFragment fundDetailFragment2 = (FundDetailFragment) this.f1276c;
            if (zIsSuccess) {
                BillDetail billDetail = (BillDetail) commonBeanResult.data;
                fundDetailFragment2.f27012H = billDetail;
                if (billDetail != null) {
                    p355xf.t tVar = fundDetailFragment2.f27009A;
                    LinearLayout linearLayout2 = (LinearLayout) tVar.getValue();
                    if (linearLayout2 != null) {
                        linearLayout2.removeAllViews();
                    }
                    LinearLayout linearLayoutT = fundDetailFragment2.t();
                    if (linearLayoutT != null) {
                        linearLayoutT.removeAllViews();
                    }
                    CashOrderExtendBean cashOrderExtendBean = billDetail.cashOrderExtendDTO;
                    if (cashOrderExtendBean != null) {
                        p355xf.t tVar2 = fundDetailFragment2.t;
                        FixedSavingsLayout fixedSavingsLayout = (FixedSavingsLayout) tVar2.getValue();
                        if (fixedSavingsLayout != null) {
                            FixedSavingsLayout.c(fixedSavingsLayout, cashOrderExtendBean, billDetail.transType, 4);
                        }
                        FixedSavingsLayout fixedSavingsLayout2 = (FixedSavingsLayout) tVar2.getValue();
                        if (fixedSavingsLayout2 != null) {
                            p220oa.h.C(fixedSavingsLayout2);
                        }
                    }
                    OrderResultViewReceiptModel orderResultViewReceiptModel = (OrderResultViewReceiptModel) fundDetailFragment2.f27016j.getValue();
                    if (orderResultViewReceiptModel != null) {
                        String orderStatusDesc = billDetail.orderStatusDesc;
                        Intrinsics.checkNotNullExpressionValue(orderStatusDesc, "orderStatusDesc");
                        orderResultViewReceiptModel.setVisibility(StringsKt.A(orderStatusDesc, "success", true) ? 0 : 8);
                    }
                    OrderResultHeaderModel orderResultHeaderModelU = fundDetailFragment2.u();
                    if (orderResultHeaderModelU != null) {
                        orderResultHeaderModelU.h(billDetail.bankUrl);
                    }
                    OrderResultHeaderModel orderResultHeaderModelU2 = fundDetailFragment2.u();
                    if (orderResultHeaderModelU2 != null) {
                        orderResultHeaderModelU2.o(fundDetailFragment2.getString(p025ba.k.core_from_s1, billDetail.bankName));
                    }
                    OrderResultHeaderModel orderResultHeaderModelU3 = fundDetailFragment2.u();
                    if (orderResultHeaderModelU3 != null) {
                        orderResultHeaderModelU3.c(r0.z(billDetail.totalAmount));
                    }
                    OrderResultHeaderModel orderResultHeaderModelU4 = fundDetailFragment2.u();
                    if (orderResultHeaderModelU4 != null && (orderStatusLayout = orderResultHeaderModelU4.getOrderStatusLayout()) != null) {
                        orderStatusLayout.setOnClickListener(new A8.c(26, fundDetailFragment2, billDetail));
                    }
                    OrderResultHeaderModel orderResultHeaderModelU5 = fundDetailFragment2.u();
                    if (orderResultHeaderModelU5 != null) {
                        orderResultHeaderModelU5.k(billDetail.orderStatusDesc);
                    }
                    OrderResultHeaderModel orderResultHeaderModelU6 = fundDetailFragment2.u();
                    if (orderResultHeaderModelU6 != null) {
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        Context contextRequireContext = fundDetailFragment2.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        orderResultHeaderModelU6.l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(aVar, contextRequireContext, billDetail.orderStatusDesc, 0.0f, 4, null));
                    }
                    LinearLayout linearLayout3 = (LinearLayout) tVar.getValue();
                    if (linearLayout3 != null) {
                        String string = fundDetailFragment2.getResources().getString(p366y9.d.ci_fund_amount);
                        String strB = r0.B(billDetail.businessAmount, false);
                        androidx.fragment.app.E mActivity = fundDetailFragment2.f27319c;
                        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                        linearLayout3.addView(new OrderResultAmountStyle1(mActivity, string, strB));
                    }
                    ArrayList<TaxItem> arrayList = billDetail.cashInFeeList;
                    if (arrayList != null) {
                        for (TaxItem taxItem : arrayList) {
                            Long totalFee = taxItem.getTotalFee();
                            long jLongValue = totalFee != null ? totalFee.longValue() : 0L;
                            if (jLongValue != 0) {
                                String totalFeeName = taxItem.getTotalFeeName();
                                if (totalFeeName == null) {
                                    totalFeeName = "";
                                }
                                String strB2 = r0.B(jLongValue, false);
                                androidx.fragment.app.E mActivity2 = fundDetailFragment2.f27319c;
                                Intrinsics.checkNotNullExpressionValue(mActivity2, "mActivity");
                                OrderResultItemModel orderResultItemModel = new OrderResultItemModel(mActivity2, 1002, totalFeeName, strB2);
                                LinearLayout linearLayout4 = (LinearLayout) tVar.getValue();
                                if (linearLayout4 != null) {
                                    linearLayout4.addView(orderResultItemModel);
                                }
                                List<SubTaxItem> subFeeList = taxItem.getSubFeeList();
                                boolean z8 = subFeeList == null || subFeeList.isEmpty();
                                orderResultItemModel.setItemKeyRightIconVisibility(!z8);
                                if (!z8) {
                                    View itemKeyRightIconIv = orderResultItemModel.getItemKeyRightIconIv();
                                    A8.c cVar = new A8.c(25, fundDetailFragment2, taxItem);
                                    if (itemKeyRightIconIv != null) {
                                        itemKeyRightIconIv.setOnClickListener(new Vb.j(1, cVar));
                                    }
                                }
                            }
                        }
                    }
                    if (billDetail.loyaltyAmount > 0 && (linearLayout = (LinearLayout) tVar.getValue()) != null) {
                        String string2 = fundDetailFragment2.getResources().getString(p025ba.k.core_palm_points_used);
                        String strO = C0.G.o("-", r0.B(billDetail.loyaltyAmount, true));
                        androidx.fragment.app.E mActivity3 = fundDetailFragment2.f27319c;
                        Intrinsics.checkNotNullExpressionValue(mActivity3, "mActivity");
                        linearLayout.addView(new OrderResultAmountStyle1(mActivity3, string2, strO));
                    }
                    androidx.fragment.app.E mActivity4 = fundDetailFragment2.f27319c;
                    Intrinsics.checkNotNullExpressionValue(mActivity4, "mActivity");
                    OrderResultAmountStyle2 orderResultAmountStyle2 = new OrderResultAmountStyle2(mActivity4, fundDetailFragment2.getResources().getString(p366y9.d.ci_payment_amount), r0.B(billDetail.totalAmount, false));
                    LinearLayout linearLayout5 = (LinearLayout) tVar.getValue();
                    if (linearLayout5 != null) {
                        linearLayout5.addView(orderResultAmountStyle2);
                    }
                    TextUtils.isEmpty(billDetail.bankAccNo);
                    LinearLayout linearLayoutT2 = fundDetailFragment2.t();
                    if (linearLayoutT2 != null) {
                        androidx.fragment.app.E mActivity5 = fundDetailFragment2.f27319c;
                        Intrinsics.checkNotNullExpressionValue(mActivity5, "mActivity");
                        linearLayoutT2.addView(new OrderResultItemModel(mActivity5, 1002, fundDetailFragment2.getResources().getString(p366y9.d.ci_payer_bank), q0.j(billDetail.bankName, i0.e(billDetail.payerAccountType == 6 ? 5 : 4, billDetail.bankAccNo))));
                    }
                    androidx.fragment.app.E mActivity6 = fundDetailFragment2.f27319c;
                    Intrinsics.checkNotNullExpressionValue(mActivity6, "mActivity");
                    fundDetailFragment2.f27014M = new OrderResultItemModel(mActivity6, 1002, fundDetailFragment2.getResources().getString(p025ba.k.core_fund_method), r0.u0(billDetail.payerAccountType));
                    LinearLayout linearLayoutT3 = fundDetailFragment2.t();
                    if (linearLayoutT3 != null) {
                        linearLayoutT3.addView(fundDetailFragment2.f27014M);
                    }
                    androidx.fragment.app.E mActivity7 = fundDetailFragment2.f27319c;
                    Intrinsics.checkNotNullExpressionValue(mActivity7, "mActivity");
                    fundDetailFragment2.f27015Q = new OrderResultItemModel(mActivity7, 1002, fundDetailFragment2.getResources().getString(p025ba.k.core_receive_account), fundDetailFragment2.getString(p025ba.k.core_palmpay_payment_balance));
                    LinearLayout linearLayoutT4 = fundDetailFragment2.t();
                    if (linearLayoutT4 != null) {
                        linearLayoutT4.addView(fundDetailFragment2.f27015Q);
                    }
                    LinearLayout linearLayoutT5 = fundDetailFragment2.t();
                    if (linearLayoutT5 != null) {
                        androidx.fragment.app.E mActivity8 = fundDetailFragment2.f27319c;
                        Intrinsics.checkNotNullExpressionValue(mActivity8, "mActivity");
                        linearLayoutT5.addView(new OrderResultItemModel(mActivity8, ErrorCodes.MALFORMED_URL_EXCEPTION, fundDetailFragment2.getResources().getString(p025ba.k.core_reference_no_2), billDetail.orderNo));
                    }
                    LinearLayout linearLayoutT6 = fundDetailFragment2.t();
                    if (linearLayoutT6 != null) {
                        androidx.fragment.app.E mActivity9 = fundDetailFragment2.f27319c;
                        Intrinsics.checkNotNullExpressionValue(mActivity9, "mActivity");
                        linearLayoutT6.addView(new OrderResultItemModel(mActivity9, 1002, fundDetailFragment2.getResources().getString(p025ba.k.core_completion_time), r0.Q(billDetail.modifyTime)));
                    }
                    if (billDetail.rechargePINExpireTime.longValue() > System.currentTimeMillis() && !TextUtils.isEmpty(billDetail.rechargePIN)) {
                        p355xf.t tVar3 = fundDetailFragment2.f27020w;
                        ModelUssdInfo modelUssdInfo = (ModelUssdInfo) tVar3.getValue();
                        if (modelUssdInfo != null) {
                            p220oa.h.s(modelUssdInfo, true);
                        }
                        ModelUssdInfo modelUssdInfo2 = (ModelUssdInfo) tVar3.getValue();
                        if (modelUssdInfo2 != null) {
                            Long rechargePINExpireTime = billDetail.rechargePINExpireTime;
                            Intrinsics.checkNotNullExpressionValue(rechargePINExpireTime, "rechargePINExpireTime");
                            modelUssdInfo2.f(rechargePINExpireTime.longValue());
                        }
                        ModelUssdInfo modelUssdInfo3 = (ModelUssdInfo) tVar3.getValue();
                        if (modelUssdInfo3 != null) {
                            modelUssdInfo3.g(billDetail.rechargePIN);
                        }
                    }
                }
            } else {
                p220oa.h.y(fundDetailFragment2, commonBeanResult.getRespMsg());
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            fundDetailFragment.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            fundDetailFragment.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object i(Object obj) {
        Drawable drawableProcessingIcon$default;
        OrderResultHeaderModel orderResultHeaderModelU;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        WithdrawRecordDetailFragment withdrawRecordDetailFragment = (WithdrawRecordDetailFragment) this.f1275b;
        if (z3) {
            withdrawRecordDetailFragment.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            withdrawRecordDetailFragment.showLoadingDialog(false, true);
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            if (commonBeanResult.isSuccess()) {
                BillDetail billDetail = (BillDetail) commonBeanResult.data;
                WithdrawRecordDetailFragment withdrawRecordDetailFragment2 = (WithdrawRecordDetailFragment) this.f1276c;
                withdrawRecordDetailFragment2.f27046v = billDetail;
                if (billDetail != null) {
                    OrderResultHeaderModel orderResultHeaderModelU2 = withdrawRecordDetailFragment2.u();
                    if (orderResultHeaderModelU2 != null) {
                        String str = billDetail.bankUrl;
                        G1.a aVarD = ((G1.d) new G1.d().x(com.transsnet.palmpay.custom_view.r.cv_palmpay_logo_7)).d();
                        Intrinsics.checkNotNullExpressionValue(aVarD, "circleCrop(...)");
                        orderResultHeaderModelU2.g(str, (G1.d) aVarD);
                    }
                    if (!TextUtils.isEmpty(billDetail.pendingCouponRemark)) {
                        OrderResultHeaderModel orderResultHeaderModelU3 = withdrawRecordDetailFragment2.u();
                        if (orderResultHeaderModelU3 != null) {
                            orderResultHeaderModelU3.i();
                        }
                        OrderResultHeaderModel orderResultHeaderModelU4 = withdrawRecordDetailFragment2.u();
                        if (orderResultHeaderModelU4 != null) {
                            orderResultHeaderModelU4.j(k0.b(billDetail.pendingCouponRemark).toString());
                        }
                        OrderResultHeaderModel orderResultHeaderModelU5 = withdrawRecordDetailFragment2.u();
                        if (orderResultHeaderModelU5 != null) {
                            orderResultHeaderModelU5.p(new ViewOnClickListenerC0053e(11));
                        }
                    }
                    if (!TextUtils.isEmpty(billDetail.payeeName)) {
                        withdrawRecordDetailFragment2.t(1002, "Withdraw Recipient", billDetail.payeeName);
                    }
                    int i7 = billDetail.payeeAccountType;
                    if (i7 == 8) {
                        OrderResultHeaderModel orderResultHeaderModelU6 = withdrawRecordDetailFragment2.u();
                        if (orderResultHeaderModelU6 != null) {
                            orderResultHeaderModelU6.o(withdrawRecordDetailFragment2.getString(p025ba.k.core_to, billDetail.bankCode));
                        }
                        if (!TextUtils.isEmpty(billDetail.mobileNo)) {
                            withdrawRecordDetailFragment2.t(1002, "Withdrawal Bank", i0.i(billDetail.bankCode, billDetail.mobileNo));
                        }
                    } else if (i7 == 5 || i7 == 6) {
                        OrderResultHeaderModel orderResultHeaderModelU7 = withdrawRecordDetailFragment2.u();
                        if (orderResultHeaderModelU7 != null) {
                            orderResultHeaderModelU7.o(withdrawRecordDetailFragment2.getString(p025ba.k.core_to, billDetail.bankName));
                        }
                        withdrawRecordDetailFragment2.t(1002, "Withdrawal Bank", i0.f(billDetail.bankName) + (TextUtils.isEmpty(billDetail.bankAccNo) ? "" : q0.k("(", i0.r(billDetail.bankAccNo), ")")));
                    }
                    if ("1".equals(billDetail.orderStatus) || "2".equals(billDetail.orderStatus)) {
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        Context contextRequireContext = withdrawRecordDetailFragment2.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        drawableProcessingIcon$default = OrderResultHeaderModel.a.processingIcon$default(aVar, contextRequireContext, 0.0f, 2, null);
                    } else if ("3".equals(billDetail.orderStatus)) {
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        Context contextRequireContext2 = withdrawRecordDetailFragment2.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        drawableProcessingIcon$default = OrderResultHeaderModel.a.successIcon$default(aVar2, contextRequireContext2, 0.0f, 2, null);
                    } else if ("4".equals(billDetail.orderStatus)) {
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        Context contextRequireContext3 = withdrawRecordDetailFragment2.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        drawableProcessingIcon$default = OrderResultHeaderModel.a.failIcon$default(aVar3, contextRequireContext3, 0.0f, 2, null);
                    } else if ("7".equals(billDetail.orderStatus)) {
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        Context contextRequireContext4 = withdrawRecordDetailFragment2.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        drawableProcessingIcon$default = OrderResultHeaderModel.a.closeIcon$default(aVar4, contextRequireContext4, 0.0f, 2, null);
                    } else {
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        Context contextRequireContext5 = withdrawRecordDetailFragment2.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
                        drawableProcessingIcon$default = OrderResultHeaderModel.a.failIcon$default(aVar5, contextRequireContext5, 0.0f, 2, null);
                    }
                    OrderResultHeaderModel orderResultHeaderModelU8 = withdrawRecordDetailFragment2.u();
                    if (orderResultHeaderModelU8 != null) {
                        orderResultHeaderModelU8.l(drawableProcessingIcon$default);
                    }
                    OrderResultHeaderModel orderResultHeaderModelU9 = withdrawRecordDetailFragment2.u();
                    if (orderResultHeaderModelU9 != null) {
                        orderResultHeaderModelU9.c(r0.B(billDetail.totalAmount, true));
                    }
                    OrderResultHeaderModel orderResultHeaderModelU10 = withdrawRecordDetailFragment2.u();
                    if (orderResultHeaderModelU10 != null) {
                        orderResultHeaderModelU10.k(billDetail.orderStatusDesc);
                    }
                    if (!TextUtils.isEmpty(billDetail.errorCode) && (orderResultHeaderModelU = withdrawRecordDetailFragment2.u()) != null) {
                        orderResultHeaderModelU.m(billDetail.errorMessage);
                    }
                    withdrawRecordDetailFragment2.t(1002, withdrawRecordDetailFragment2.getString(p025ba.k.core_receipt_transaction_type), withdrawRecordDetailFragment2.getString(p025ba.k.core_withdraw));
                    withdrawRecordDetailFragment2.t(1002, withdrawRecordDetailFragment2.getString(p025ba.k.core_pay_method), withdrawRecordDetailFragment2.getString(p025ba.k.core_palmpay_payment_balance));
                    withdrawRecordDetailFragment2.t(ErrorCodes.MALFORMED_URL_EXCEPTION, withdrawRecordDetailFragment2.getString(p025ba.k.core_receipt_transaction_id), billDetail.orderNo);
                    if (!TextUtils.isEmpty(billDetail.channelTransactionId)) {
                        withdrawRecordDetailFragment2.t(ErrorCodes.MALFORMED_URL_EXCEPTION, withdrawRecordDetailFragment2.getString(p025ba.k.core_session_id_desc_1), billDetail.channelTransactionId);
                    }
                    if (!Intrinsics.c(r0.Q(billDetail.createTime), r0.Q(billDetail.successTime))) {
                        withdrawRecordDetailFragment2.t(1002, withdrawRecordDetailFragment2.getString(p025ba.k.core_order_time), r0.Q(billDetail.createTime));
                    }
                    withdrawRecordDetailFragment2.t(1002, withdrawRecordDetailFragment2.getString(p025ba.k.core_completion_time), r0.Q(billDetail.successTime));
                }
            } else {
                ToastUtils.showShort(commonBeanResult.getRespMsg(), new Object[0]);
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            withdrawRecordDetailFragment.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            withdrawRecordDetailFragment.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    private final Object j(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        WithdrawV2Fragment withdrawV2Fragment = (WithdrawV2Fragment) this.f1275b;
        if (z3) {
            withdrawV2Fragment.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            withdrawV2Fragment.showLoadingDialog(false, true);
            CreateCashInOutOrderRsp createCashInOutOrderRsp = (CreateCashInOutOrderRsp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            if (createCashInOutOrderRsp == null || !createCashInOutOrderRsp.isSuccess()) {
                ToastUtils.showLong(createCashInOutOrderRsp != null ? createCashInOutOrderRsp.getRespMsg() : null, new Object[0]);
            } else {
                String orderNo = createCashInOutOrderRsp.data.getOrderNo();
                Intrinsics.checkNotNullExpressionValue(orderNo, "getOrderNo(...)");
                WithdrawV2Fragment withdrawV2Fragment2 = (WithdrawV2Fragment) this.f1276c;
                n0.g().l("PalmPay_Wthd_Btn_Next");
                Intent intent = new Intent(withdrawV2Fragment2.requireActivity(), (Class<?>) ConfirmAndPayWithdrawOrderActivity.class);
                StateAmountEditText stateAmountEditTextU = withdrawV2Fragment2.u();
                intent.putExtra("extra_amount", r0.f(stateAmountEditTextU != null ? stateAmountEditTextU.getDouble() : 0.0d));
                intent.putExtra("extra_message", "");
                intent.putExtra("orderNo", orderNo);
                intent.putExtra("KEY_BANK_CARD", withdrawV2Fragment2.f27054X);
                withdrawV2Fragment2.startActivity(intent);
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            withdrawV2Fragment.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            withdrawV2Fragment.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object k(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        AddUserExtraInfoEntryActivity addUserExtraInfoEntryActivity = (AddUserExtraInfoEntryActivity) this.f1275b;
        if (z3) {
            addUserExtraInfoEntryActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof com.transsnet.palmpay.core.base.p;
            AddUserExtraInfoEntryActivity addUserExtraInfoEntryActivity2 = (AddUserExtraInfoEntryActivity) this.f1276c;
            if (z8) {
                addUserExtraInfoEntryActivity.showLoadingDialog(false, true);
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonBeanResult.isSuccess()) {
                    AddUserExtraActionRsp addUserExtraActionRsp = (AddUserExtraActionRsp) commonBeanResult.data;
                    if (TextUtils.isEmpty(addUserExtraActionRsp != null ? addUserExtraActionRsp.jumpUrl : null)) {
                        addUserExtraInfoEntryActivity2.finish();
                    } else {
                        AddUserExtraInfoEntryActivity.a aVar = AddUserExtraInfoEntryActivity.f25819e;
                        T data = commonBeanResult.data;
                        Intrinsics.checkNotNullExpressionValue(data, "data");
                        aVar.gotoNextStep(addUserExtraInfoEntryActivity2, (AddUserExtraActionRsp) data, addUserExtraInfoEntryActivity2.f25820c);
                        addUserExtraInfoEntryActivity2.finish();
                    }
                } else {
                    O6.d dVarO = io.fastkv.n.O(addUserExtraInfoEntryActivity2, 0, Integer.valueOf(p025ba.k.core_opps), null, null, null, null, commonBeanResult.getRespMsg(), null, null, null, null, null, null, null, true, 0, 8322941);
                    dVarO.setCancelable(false);
                    dVarO.setCanceledOnTouchOutside(false);
                    dVarO.setOnDismissListener(new Ce.T(addUserExtraInfoEntryActivity2, 1));
                    dVarO.show();
                }
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                addUserExtraInfoEntryActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                addUserExtraInfoEntryActivity.showLoadingDialog(false, true);
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                p220oa.h.x(addUserExtraInfoEntryActivity2, ((com.transsnet.palmpay.core.base.n) it).f27358a);
                addUserExtraInfoEntryActivity2.finish();
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object l(Object obj) {
        String str;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        AddUserExtraInfoResultActivity addUserExtraInfoResultActivity = (AddUserExtraInfoResultActivity) this.f1275b;
        if (z3) {
            addUserExtraInfoResultActivity.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof com.transsnet.palmpay.core.base.p;
            AddUserExtraInfoResultActivity addUserExtraInfoResultActivity2 = (AddUserExtraInfoResultActivity) this.f1276c;
            if (z8) {
                addUserExtraInfoResultActivity.showLoadingDialog(false, true);
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonBeanResult.isSuccess()) {
                    AddUserExtraActionRsp addUserExtraActionRsp = (AddUserExtraActionRsp) commonBeanResult.data;
                    if (TextUtils.isEmpty(addUserExtraActionRsp != null ? addUserExtraActionRsp.jumpUrl : null)) {
                        i0.H(null);
                        addUserExtraInfoResultActivity2.finish();
                    } else {
                        AddUserExtraInfoEntryActivity.a aVar = AddUserExtraInfoEntryActivity.f25819e;
                        T data = commonBeanResult.data;
                        Intrinsics.checkNotNullExpressionValue(data, "data");
                        AddUserExtraInfoEntryActivity.a.gotoNextStep$default(aVar, addUserExtraInfoResultActivity2, (AddUserExtraActionRsp) data, null, 4, null);
                        AddUserExtraActionRsp addUserExtraActionRsp2 = (AddUserExtraActionRsp) commonBeanResult.data;
                        if (addUserExtraActionRsp2 == null || (str = addUserExtraActionRsp2.jumpUrl) == null || !StringsKt.A(str, "/account/upgrade_tier3_export", false)) {
                            addUserExtraInfoResultActivity2.finish();
                        }
                    }
                } else {
                    O6.d dVarO = io.fastkv.n.O(addUserExtraInfoResultActivity2, 0, Integer.valueOf(p025ba.k.core_opps), null, null, null, null, commonBeanResult.getRespMsg(), null, null, null, null, null, null, null, true, 0, 8322941);
                    dVarO.setCancelable(false);
                    dVarO.setCanceledOnTouchOutside(false);
                    dVarO.setOnDismissListener(new Ce.T(addUserExtraInfoResultActivity2, 2));
                    dVarO.show();
                }
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                addUserExtraInfoResultActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                addUserExtraInfoResultActivity.showLoadingDialog(false, true);
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                p220oa.h.x(addUserExtraInfoResultActivity2, ((com.transsnet.palmpay.core.base.n) it).f27358a);
                addUserExtraInfoResultActivity2.finish();
            }
        }
        return Unit.f38893a;
    }

    private final Object m(Object obj) {
        PinEntryView pinEntryView;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        AuthenticationOtpActivity authenticationOtpActivity = (AuthenticationOtpActivity) this.f1275b;
        if (z3) {
            authenticationOtpActivity.showLoadingDialog(true, true);
        } else {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                authenticationOtpActivity.showLoadingDialog(false, true);
                SmsActionRsp smsActionRsp = (SmsActionRsp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                boolean zIsSuccess = smsActionRsp.isSuccess();
                AuthenticationOtpActivity authenticationOtpActivity2 = (AuthenticationOtpActivity) this.f1276c;
                if (zIsSuccess) {
                    String smsToken = smsActionRsp.data.getSmsToken();
                    Intent intent = new Intent();
                    intent.putExtra("extra_token", smsToken);
                    authenticationOtpActivity2.setResult(-1, intent);
                    authenticationOtpActivity2.finish();
                } else {
                    Bc.p pVar = authenticationOtpActivity2.f25838e;
                    if (pVar != null) {
                        OneTimeCodeSimpleView oneTimeCodeSimpleView = (OneTimeCodeSimpleView) pVar.f813d;
                        String respMsg = smsActionRsp.getRespMsg();
                        TextView textView = oneTimeCodeSimpleView.f28446f;
                        if (textView != null) {
                            textView.setText(respMsg);
                            oneTimeCodeSimpleView.f28446f.setVisibility(TextUtils.isEmpty(respMsg) ? 8 : 0);
                        }
                    }
                    Bc.p pVar2 = authenticationOtpActivity2.f25838e;
                    if (pVar2 != null && (pinEntryView = ((OneTimeCodeSimpleView) pVar2.f813d).f28442b) != null) {
                        pinEntryView.setText("");
                    }
                }
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                authenticationOtpActivity.showLoadingDialog(false, true);
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                authenticationOtpActivity.showLoadingDialog(false, true);
                ((com.transsnet.palmpay.core.base.n) it).getClass();
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object n(Object obj) {
        p082f9.b bVar;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        PalmPayLevelV2Activity palmPayLevelV2Activity = (PalmPayLevelV2Activity) this.f1275b;
        if (z3) {
            palmPayLevelV2Activity.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            palmPayLevelV2Activity.showLoadingDialog(false, true);
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            if (commonBeanResult.isSuccess() && (bVar = ((PalmPayLevelV2Activity) this.f1276c).f25927d) != null) {
                bVar.f36427e = (UserRawIdNo) commonBeanResult.data;
                Function0 function0 = bVar.f36431j;
                if (function0 != null) {
                    function0.invoke();
                }
                bVar.f36431j = null;
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            palmPayLevelV2Activity.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            palmPayLevelV2Activity.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object o(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        VerifyAccountActivity verifyAccountActivity = (VerifyAccountActivity) this.f1275b;
        VerifyAccountActivity verifyAccountActivity2 = (VerifyAccountActivity) this.f1276c;
        if (z3) {
            if (verifyAccountActivity2.f26066f == null) {
                verifyAccountActivity.showLoadingDialog(true, true);
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            if (verifyAccountActivity2.f26066f == null) {
                verifyAccountActivity.showLoadingDialog(false, true);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
            if (!verifyAccountActivity2.isFinishing() && !verifyAccountActivity2.isDestroyed()) {
                if (commonBeanResult.isSuccess()) {
                    verifyAccountActivity2.f26066f = (SecurityVerifyMethodRsp) commonBeanResult.data;
                    View view = verifyAccountActivity2.f26069j;
                    if (view != null) {
                        p220oa.h.C(view);
                    }
                    SecurityVerifyMethodRsp securityVerifyMethodRsp = verifyAccountActivity2.f26066f;
                    List<SecurityVerifyMethod> list = securityVerifyMethodRsp != null ? securityVerifyMethodRsp.verifyMethodList : null;
                    if (list != null && !list.isEmpty()) {
                        if (Intrinsics.c(verifyAccountActivity2.f26063c, SecurityVerifyMethodReq.UNLOGIN_RESET_PIN) || Intrinsics.c(verifyAccountActivity2.f26063c, SecurityVerifyMethodReq.LOGIN_RESET_PIN) || Intrinsics.c(verifyAccountActivity2.f26063c, SecurityVerifyMethodReq.LOGIN_CHANGE_PIN) || Intrinsics.c(verifyAccountActivity2.f26063c, SecurityVerifyMethodReq.UNLOGIN_RESET_PASSWORD) || Intrinsics.c(verifyAccountActivity2.f26063c, SecurityVerifyMethodReq.LOGIN_RESET_PASSWORD) || Intrinsics.c(verifyAccountActivity2.f26063c, SecurityVerifyMethodReq.LOGIN_CHANGE_PASSWORD)) {
                            List listH = C1850q.h("android.permission.ACCESS_COARSE_LOCATION", com.transsnet.palmpay.core.config.d.j());
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : listH) {
                                String str = (String) obj2;
                                Intrinsics.e(str);
                                if (str.length() > 0) {
                                    arrayList.add(obj2);
                                }
                            }
                            List<String> listB = CollectionsKt.B(arrayList);
                            if (!(listB instanceof Collection) || !listB.isEmpty()) {
                                for (String str2 : listB) {
                                    boolean zIsGranted = PermissionUtils.isGranted(str2);
                                    boolean z8 = (p059e1.a.C("key_location_permission_requested", false) && verifyAccountActivity2.shouldShowRequestPermissionRationale(str2)) ? false : true;
                                    if (!zIsGranted && z8) {
                                        VerifyAccountActivity.o(verifyAccountActivity2, new m0(verifyAccountActivity2, 0));
                                        break;
                                    }
                                }
                            }
                        }
                        VerifyAccountActivity.n(verifyAccountActivity2, (SecurityVerifyMethodRsp) commonBeanResult.data);
                    } else if (!VerifyAccountActivity.o(verifyAccountActivity2, new l0(commonBeanResult, verifyAccountActivity2))) {
                        verifyAccountActivity2.finish();
                    }
                } else if (!VerifyAccountActivity.o(verifyAccountActivity2, new l0(verifyAccountActivity2, commonBeanResult, 1))) {
                    verifyAccountActivity2.finish();
                }
            }
        } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            if (verifyAccountActivity2.f26066f == null) {
                verifyAccountActivity.showLoadingDialog(false, true);
            }
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        } else if (verifyAccountActivity2.f26066f == null) {
            verifyAccountActivity.showLoadingDialog(false, true);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    private final Object p(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            boolean z3 = it instanceof com.transsnet.palmpay.core.base.p;
            CashBoxTermsConditionsDialogFragment cashBoxTermsConditionsDialogFragment = (CashBoxTermsConditionsDialogFragment) this.f1275b;
            if (z3) {
                CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonResult.isSuccess()) {
                    p059e1.a.Z("KEY_IS_SHOW_CASHBOX_NEWER_AGREE", true);
                    List<PayoutOption> list = (List) cashBoxTermsConditionsDialogFragment.f32285L.getValue();
                    p355xf.t tVar = cashBoxTermsConditionsDialogFragment.f32286M;
                    if (list != null) {
                        for (PayoutOption payoutOption : list) {
                            PayoutOption payoutOption2 = (PayoutOption) tVar.getValue();
                            payoutOption.setSelected(payoutOption2 != null && payoutOption.getType() == payoutOption2.getType());
                        }
                    }
                    cashBoxTermsConditionsDialogFragment.dismiss();
                    PayoutOption payoutOption3 = (PayoutOption) tVar.getValue();
                    if (payoutOption3 != null) {
                        org.greenrobot.eventbus.c.b().f(new PayoutOptionsChangeEvent(payoutOption3.getType(), payoutOption3.getName()));
                    }
                    com.transsnet.palmpay.custom_view.dialog.t tVar2 = new com.transsnet.palmpay.custom_view.dialog.t(cashBoxTermsConditionsDialogFragment.requireContext());
                    tVar2.b();
                    tVar2.c(Jc.f.mm_submitted_succ);
                    tVar2.f31303b = "";
                    SuccessFailDialog successFailDialogD = tVar2.d(Constants.MAX_URL_LENGTH);
                    successFailDialogD.setCanceledOnTouchOutside(false);
                    successFailDialogD.setCancelable(false);
                } else {
                    ((View) this.f1276c).setVisibility(0);
                    if (!TextUtils.isEmpty(commonResult.getRespMsg())) {
                        ToastUtils.showLong(commonResult.getRespMsg(), new Object[0]);
                    }
                }
                if (cashBoxTermsConditionsDialogFragment.getActivity() instanceof BaseActivity) {
                    androidx.fragment.app.E activity = cashBoxTermsConditionsDialogFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                    ((BaseActivity) activity).showLoadingDialog(false);
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                if (cashBoxTermsConditionsDialogFragment.getActivity() instanceof BaseActivity) {
                    androidx.fragment.app.E activity2 = cashBoxTermsConditionsDialogFragment.getActivity();
                    Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                    ((BaseActivity) activity2).showLoadingDialog(false);
                }
            } else if (cashBoxTermsConditionsDialogFragment.getActivity() instanceof BaseActivity) {
                androidx.fragment.app.E activity3 = cashBoxTermsConditionsDialogFragment.getActivity();
                Intrinsics.f(activity3, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                ((BaseActivity) activity3).showLoadingDialog(false);
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[PHI: r2
      0x0071: PHI (r2v52 java.lang.String) = (r2v50 java.lang.String), (r2v83 java.lang.String) binds: [B:76:0x01c4, B:24:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02c4, code lost:
    
        if (Pa.C0521s.f7158a.j(r6.getActivity(), r1) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018d, code lost:
    
        if (Pa.C0521s.f7158a.j(r6.getActivity(), r1) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018f, code lost:
    
        r1 = r1.getRespMsg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.Q.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0095 A[PHI: r1
      0x0095: PHI (r1v7 I8.l) = (r1v5 I8.l), (r1v6 I8.l), (r1v14 I8.l) binds: [B:32:0x00c0, B:27:0x00a4, B:22:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object r(Object obj) {
        I8.l lVar;
        androidx.fragment.app.E activity;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        AddGuardianExtra2Fragment addGuardianExtra2Fragment = (AddGuardianExtra2Fragment) this.f1275b;
        if (z3) {
            addGuardianExtra2Fragment.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof com.transsnet.palmpay.core.base.p;
            AddGuardianExtra2Fragment addGuardianExtra2Fragment2 = (AddGuardianExtra2Fragment) this.f1276c;
            if (z8) {
                addGuardianExtra2Fragment.showLoadingDialog(false, true);
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonBeanResult.isSuccess()) {
                    addGuardianExtra2Fragment2.x(Integer.valueOf(F8.d.fragment_add_guardian_step_extra), (SubmitGuardianRsp) commonBeanResult.data);
                } else if (Intrinsics.c(commonBeanResult.getRespCode(), "11501009")) {
                    AbstractC0130w abstractC0130w = addGuardianExtra2Fragment2.f26142o;
                    if (abstractC0130w != null) {
                        abstractC0130w.h(F8.d.fragment_add_guardian_step_extra_2, null, BaseAddGuardianFragment.u(null, false));
                    }
                } else if (commonBeanResult.getRichTextErrorDialog(addGuardianExtra2Fragment2.getActivity()) == null && (activity = addGuardianExtra2Fragment2.getActivity()) != null) {
                    io.fastkv.n.O(activity, 0, null, null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, null, null, null, null, false, 0, 8388223);
                }
                lVar = addGuardianExtra2Fragment2.f26131p;
                if (lVar != null) {
                    lVar.f4140d.b(false);
                }
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                addGuardianExtra2Fragment.showLoadingDialog(false, true);
                lVar = addGuardianExtra2Fragment2.f26131p;
                if (lVar != null) {
                    lVar.f4140d.b(false);
                }
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                addGuardianExtra2Fragment.showLoadingDialog(false, true);
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                lVar = addGuardianExtra2Fragment2.f26131p;
                if (lVar != null) {
                    lVar.f4140d.b(false);
                }
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0095 A[PHI: r1
      0x0095: PHI (r1v7 I8.l) = (r1v5 I8.l), (r1v6 I8.l), (r1v14 I8.l) binds: [B:32:0x00c0, B:27:0x00a4, B:22:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object s(Object obj) {
        I8.l lVar;
        androidx.fragment.app.E activity;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        AddGuardianExtraFragment addGuardianExtraFragment = (AddGuardianExtraFragment) this.f1275b;
        if (z3) {
            addGuardianExtraFragment.showLoadingDialog(true, true);
        } else {
            boolean z8 = it instanceof com.transsnet.palmpay.core.base.p;
            AddGuardianExtraFragment addGuardianExtraFragment2 = (AddGuardianExtraFragment) this.f1276c;
            if (z8) {
                addGuardianExtraFragment.showLoadingDialog(false, true);
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonBeanResult.isSuccess()) {
                    addGuardianExtraFragment2.x(Integer.valueOf(F8.d.fragment_add_guardian_step_extra), (SubmitGuardianRsp) commonBeanResult.data);
                } else if (Intrinsics.c(commonBeanResult.getRespCode(), "11501007")) {
                    AbstractC0130w abstractC0130w = addGuardianExtraFragment2.f26142o;
                    if (abstractC0130w != null) {
                        abstractC0130w.h(F8.d.fragment_add_guardian_step_extra_2, null, BaseAddGuardianFragment.u(null, false));
                    }
                } else if (commonBeanResult.getRichTextErrorDialog(addGuardianExtraFragment2.getActivity()) == null && (activity = addGuardianExtraFragment2.getActivity()) != null) {
                    io.fastkv.n.O(activity, 0, null, null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, null, null, null, null, false, 0, 8388223);
                }
                lVar = addGuardianExtraFragment2.f26133p;
                if (lVar != null) {
                    lVar.f4140d.b(false);
                }
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                addGuardianExtraFragment.showLoadingDialog(false, true);
                lVar = addGuardianExtraFragment2.f26133p;
                if (lVar != null) {
                    lVar.f4140d.b(false);
                }
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                addGuardianExtraFragment.showLoadingDialog(false, true);
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                lVar = addGuardianExtraFragment2.f26133p;
                if (lVar != null) {
                    lVar.f4140d.b(false);
                }
            }
        }
        return Unit.f38893a;
    }

    private final Object t(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
        AddGuardianRelationShipFragment addGuardianRelationShipFragment = (AddGuardianRelationShipFragment) this.f1275b;
        if (z3) {
            addGuardianRelationShipFragment.showLoadingDialog(true, true);
        } else if (it instanceof com.transsnet.palmpay.core.base.p) {
            addGuardianRelationShipFragment.showLoadingDialog(false, true);
            AddGuardianRelationShipFragment addGuardianRelationShipFragment2 = (AddGuardianRelationShipFragment) this.f1276c;
            androidx.fragment.app.E activity = addGuardianRelationShipFragment2.getActivity();
            if (activity != null) {
                SignUpActivity.a aVar = SignUpActivity.f26029C;
                Bc.f fVar = addGuardianRelationShipFragment2.t;
                aVar.start(activity, AddGuardianRelationShipFragment.z(fVar != null ? (PpFormVertical) fVar.f699e : null));
                if (AbstractC0520q.f7139e && "TECNO KL8".equalsIgnoreCase(AbstractC0520q.f7136b)) {
                    Handler handlerJ = addGuardianRelationShipFragment2.j();
                    if (handlerJ != null) {
                        handlerJ.post(new B5.c(activity, 22));
                    }
                } else {
                    activity.finish();
                }
            }
        } else if (it instanceof com.transsnet.palmpay.core.base.m) {
            addGuardianRelationShipFragment.showLoadingDialog(false, true);
        } else {
            if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                throw new p355xf.l();
            }
            addGuardianRelationShipFragment.showLoadingDialog(false, true);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
            ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c A[PHI: r1
      0x004c: PHI (r1v244 com.transsnet.palmpay.core.bean.CommonBeanResult) = (r1v238 com.transsnet.palmpay.core.bean.CommonBeanResult), (r1v247 com.transsnet.palmpay.core.bean.CommonBeanResult) binds: [B:33:0x011a, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:388:0x0718 A[PHI: r1
      0x0718: PHI (r1v65 com.transsnet.palmpay.credit.bean.rsp.QueryDataInfoResp) = 
      (r1v63 com.transsnet.palmpay.credit.bean.rsp.QueryDataInfoResp)
      (r1v67 com.transsnet.palmpay.credit.bean.rsp.QueryDataInfoResp)
     binds: [B:392:0x0735, B:387:0x0716] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e0, code lost:
    
        if (r25 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        r27 = java.lang.Integer.valueOf(p025ba.k.core_oops);
        r32 = r1.getRespMsg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016c, code lost:
    
        if (r25 != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 3010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.Q.invoke(java.lang.Object):java.lang.Object");
    }

    public Q(HomePalmZoneTabV2 homePalmZoneTabV2, com.transsnet.palmpay.core.base.l lVar, HomePalmZoneTabV2 homePalmZoneTabV3) {
        this.f1274a = 2;
        this.f1275b = lVar;
        this.f1276c = homePalmZoneTabV3;
    }
}
