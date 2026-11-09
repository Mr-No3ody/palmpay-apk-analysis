package p270rd;

import C0.G;
import Pa.i0;
import Pa.r0;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.TransferToCommonAccountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmPaymentInfoDialog;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBaseViewModel;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p159kd.h;
import p310ub.C2085k0;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToCommonAccountActivity f41722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferToCommonAccountActivity f41723c;

    public /* synthetic */ a0(TransferToCommonAccountActivity transferToCommonAccountActivity, TransferToCommonAccountActivity transferToCommonAccountActivity2, int i7) {
        this.f41721a = i7;
        this.f41722b = transferToCommonAccountActivity;
        this.f41723c = transferToCommonAccountActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f41721a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof o;
                TransferToCommonAccountActivity transferToCommonAccountActivity = this.f41722b;
                if (z3) {
                    transferToCommonAccountActivity.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    transferToCommonAccountActivity.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    boolean zIsSuccess = commonBeanResult.isSuccess();
                    TransferToCommonAccountActivity transferToCommonAccountActivity2 = this.f41723c;
                    if (zIsSuccess) {
                        MemberDetailResp memberDetailResp = (MemberDetailResp) commonBeanResult.data;
                        if (memberDetailResp != null) {
                            transferToCommonAccountActivity2.f33277X = memberDetailResp;
                            Object value = transferToCommonAccountActivity2.f33260B.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            r0.m1(memberDetailResp.getHeadPortrait(), (ImageView) value);
                            if (Intrinsics.c(transferToCommonAccountActivity2.f33281p0, "WITHDRAW")) {
                                transferToCommonAccountActivity2.s().setTitle(transferToCommonAccountActivity2.getString(h.sm_withdraw_via_palmpay_agent));
                                G.x("Account No.", i0.n(memberDetailResp.getAccountNo(), false), transferToCommonAccountActivity2.u());
                            } else {
                                transferToCommonAccountActivity2.s().setTitle(memberDetailResp.getFullName());
                                if (transferToCommonAccountActivity2.f33280k0 == 14) {
                                    transferToCommonAccountActivity2.u().setText(transferToCommonAccountActivity2.getString(h.sm_merchant_account_id_s, i0.o(memberDetailResp.getAccountNo())));
                                } else {
                                    transferToCommonAccountActivity2.u().setText(transferToCommonAccountActivity2.getString(h.sm_merchant_account_id_s, memberDetailResp.getAccountNo()));
                                }
                            }
                            transferToCommonAccountActivity2.r().setText(memberDetailResp.getFullName());
                            if (transferToCommonAccountActivity2.f33277X != null) {
                                ConfigReq configReq = new ConfigReq();
                                configReq.setPayeeAccountType(4);
                                ((TransferToBaseViewModel) transferToCommonAccountActivity2.l()).e(configReq);
                            }
                        }
                    } else {
                        p220oa.h.x(transferToCommonAccountActivity2, commonBeanResult.getRespMsg());
                    }
                } else if (it instanceof m) {
                    transferToCommonAccountActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    transferToCommonAccountActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof o;
                TransferToCommonAccountActivity transferToCommonAccountActivity3 = this.f41722b;
                if (z8) {
                    transferToCommonAccountActivity3.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    transferToCommonAccountActivity3.showLoadingDialog(false, true);
                    BalanceAndLimitResp balanceAndLimitResp = (BalanceAndLimitResp) ((p) it2).f27360a;
                    boolean zIsSuccess2 = balanceAndLimitResp.isSuccess();
                    TransferToCommonAccountActivity transferToCommonAccountActivity4 = this.f41723c;
                    if (zIsSuccess2) {
                        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = balanceAndLimitResp.data;
                        if (balanceAndLimitData != null) {
                            transferToCommonAccountActivity4.f33278Y = balanceAndLimitData;
                            if (balanceAndLimitData.firstTransfer) {
                                transferToCommonAccountActivity4.n().setVisibility(8);
                                transferToCommonAccountActivity4.o().setVisibility(0);
                                transferToCommonAccountActivity4.o().setText(transferToCommonAccountActivity4.getString(h.sm_available_balance, r0.B(balanceAndLimitData.balanceAmount, false)));
                            } else {
                                transferToCommonAccountActivity4.o().setVisibility(8);
                                transferToCommonAccountActivity4.n().setVisibility(0);
                                transferToCommonAccountActivity4.n().setText(transferToCommonAccountActivity4.getString(h.sm_available_balance_one_format, r0.B(balanceAndLimitResp.data.balanceAmount, false), r0.B(balanceAndLimitResp.data.cashBox, false)));
                                transferToCommonAccountActivity4.n().setChecked(true);
                            }
                            SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(r0.B(balanceAndLimitData.minAmount, false) + "-" + r0.B(balanceAndLimitData.maxAmount, false)).setFontSize(18, true).create();
                            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                            transferToCommonAccountActivity4.t().setHint(spannableStringBuilderCreate);
                            transferToCommonAccountActivity4.t().setCurrency(BaseApplication.getCurrencySymbol());
                        }
                    } else {
                        p220oa.h.x(transferToCommonAccountActivity4, balanceAndLimitResp.getRespMsg());
                    }
                } else if (it2 instanceof m) {
                    transferToCommonAccountActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    transferToCommonAccountActivity3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean z10 = it3 instanceof o;
                TransferToCommonAccountActivity transferToCommonAccountActivity5 = this.f41722b;
                if (z10) {
                    transferToCommonAccountActivity5.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    transferToCommonAccountActivity5.showLoadingDialog(false, true);
                    VerifyPaymentInfoRsp verifyPaymentInfoRsp = (VerifyPaymentInfoRsp) ((p) it3).f27360a;
                    boolean zIsSuccess3 = verifyPaymentInfoRsp.isSuccess();
                    TransferToCommonAccountActivity transferToCommonAccountActivity6 = this.f41723c;
                    if (zIsSuccess3) {
                        VerifyPaymentInfoRsp.DataBean dataBean = verifyPaymentInfoRsp.data;
                        if (dataBean != null) {
                            if (dataBean.status > 0) {
                                ConfirmPaymentInfoDialog confirmPaymentInfoDialog = new ConfirmPaymentInfoDialog(transferToCommonAccountActivity6);
                                confirmPaymentInfoDialog.setResultCallback(new C2085k0(transferToCommonAccountActivity6, 26));
                                confirmPaymentInfoDialog.show();
                                MemberDetailResp memberDetailResp2 = transferToCommonAccountActivity6.f33277X;
                                confirmPaymentInfoDialog.updateUi(memberDetailResp2 != null ? memberDetailResp2.getFullName() : null, i0.r(dataBean.accountNo), transferToCommonAccountActivity6.y(), dataBean.statusDesc);
                            } else {
                                TransferToCommonAccountActivity.x(transferToCommonAccountActivity6);
                            }
                        }
                    } else {
                        p220oa.h.x(transferToCommonAccountActivity6, verifyPaymentInfoRsp.getRespMsg());
                    }
                } else if (it3 instanceof m) {
                    transferToCommonAccountActivity5.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof n)) {
                        throw new l();
                    }
                    transferToCommonAccountActivity5.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
