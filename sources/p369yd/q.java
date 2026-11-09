package p369yd;

import android.text.TextUtils;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateTransferDialog;
import com.transsnet.palmpay.send_money.ui.dialog.ExceedsDailyLimitDialog;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayInputAmountActivity f44311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayInputAmountActivity f44312c;

    public /* synthetic */ q(TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity, TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity2, int i7) {
        this.f44310a = i7;
        this.f44311b = transferToPalmPayInputAmountActivity;
        this.f44312c = transferToPalmPayInputAmountActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MemberDetailResp memberDetailResp;
        MemberDetailResp memberDetailResp2;
        Integer recipientTradeStatus;
        Integer recipientTradeStatus2;
        Integer recipientTradeStatus3;
        Integer recipientTradeStatus4;
        TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity = this.f44312c;
        boolean z3 = false;
        TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity2 = this.f44311b;
        switch (this.f44310a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    transferToPalmPayInputAmountActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    transferToPalmPayInputAmountActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        MemberDetailResp memberDetailResp3 = (MemberDetailResp) commonBeanResult.data;
                        if (memberDetailResp3 != null) {
                            transferToPalmPayInputAmountActivity.t = memberDetailResp3;
                            TransferToPalmPayInputAmountActivity.o(transferToPalmPayInputAmountActivity, memberDetailResp3, Integer.valueOf(transferToPalmPayInputAmountActivity.f33614g), transferToPalmPayInputAmountActivity.f33615i, true ^ TextUtils.isEmpty(transferToPalmPayInputAmountActivity.f33611d));
                            transferToPalmPayInputAmountActivity.r();
                        }
                    } else {
                        h.x(transferToPalmPayInputAmountActivity, commonBeanResult.getRespMsg());
                    }
                } else if (it instanceof m) {
                    transferToPalmPayInputAmountActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    transferToPalmPayInputAmountActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    transferToPalmPayInputAmountActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    transferToPalmPayInputAmountActivity2.showLoadingDialog(false, true);
                    VerifyPaymentInfoRsp verifyPaymentInfoRsp = (VerifyPaymentInfoRsp) ((p) it2).f27360a;
                    if (verifyPaymentInfoRsp.isSuccess()) {
                        VerifyPaymentInfoRsp.DataBean dataBean = verifyPaymentInfoRsp.data;
                        if (dataBean != null) {
                            int i7 = TransferToPalmPayInputAmountActivity.f33602Y;
                            if (dataBean.amountLimitPopUp) {
                                ExceedsDailyLimitDialog exceedsDailyLimitDialog = new ExceedsDailyLimitDialog(transferToPalmPayInputAmountActivity);
                                exceedsDailyLimitDialog.show();
                                exceedsDailyLimitDialog.setData(dataBean);
                            } else if (Intrinsics.c(dataBean.repeatedTransfer, Boolean.TRUE)) {
                                if (transferToPalmPayInputAmountActivity.f33609Q == null) {
                                    transferToPalmPayInputAmountActivity.f33609Q = new ConfirmDuplicateTransferDialog(transferToPalmPayInputAmountActivity, "Transfer_ToPalmPayAmount_DuplicatedTransfers", "_03");
                                }
                                ConfirmDuplicateTransferDialog confirmDuplicateTransferDialog = transferToPalmPayInputAmountActivity.f33609Q;
                                if (confirmDuplicateTransferDialog != null && !confirmDuplicateTransferDialog.isShowing()) {
                                    confirmDuplicateTransferDialog.show();
                                    confirmDuplicateTransferDialog.setOnContinueClickListener(new l(transferToPalmPayInputAmountActivity, dataBean));
                                }
                            } else {
                                BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = transferToPalmPayInputAmountActivity.f33619v;
                                if ((balanceAndLimitData != null ? balanceAndLimitData.reminderAmount : null) == null) {
                                    memberDetailResp = transferToPalmPayInputAmountActivity.t;
                                    if (!(memberDetailResp == null && (recipientTradeStatus3 = memberDetailResp.getRecipientTradeStatus()) != null && recipientTradeStatus3.intValue() == 3) && ((memberDetailResp2 = transferToPalmPayInputAmountActivity.t) == null || (recipientTradeStatus = memberDetailResp2.getRecipientTradeStatus()) == null || recipientTradeStatus.intValue() != 1)) {
                                        transferToPalmPayInputAmountActivity.u(dataBean);
                                    } else {
                                        MemberDetailResp memberDetailResp4 = transferToPalmPayInputAmountActivity.t;
                                        if (memberDetailResp4 != null && (recipientTradeStatus2 = memberDetailResp4.getRecipientTradeStatus()) != null && recipientTradeStatus2.intValue() == 3) {
                                            z3 = true;
                                        }
                                        transferToPalmPayInputAmountActivity.t(2, z3, dataBean);
                                    }
                                } else {
                                    PpAmountEditText ppAmountEditText = transferToPalmPayInputAmountActivity.f33620w;
                                    long longAmount = ppAmountEditText != null ? ppAmountEditText.getLongAmount() : 0L;
                                    BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = transferToPalmPayInputAmountActivity.f33619v;
                                    Intrinsics.e(balanceAndLimitData2);
                                    if (longAmount >= balanceAndLimitData2.reminderAmount.longValue()) {
                                        MemberDetailResp memberDetailResp5 = transferToPalmPayInputAmountActivity.t;
                                        if (memberDetailResp5 != null && (recipientTradeStatus4 = memberDetailResp5.getRecipientTradeStatus()) != null && recipientTradeStatus4.intValue() == 3) {
                                            z3 = true;
                                        }
                                        transferToPalmPayInputAmountActivity.t(1, z3, dataBean);
                                    } else {
                                        memberDetailResp = transferToPalmPayInputAmountActivity.t;
                                        if (memberDetailResp == null) {
                                            transferToPalmPayInputAmountActivity.u(dataBean);
                                        } else {
                                            transferToPalmPayInputAmountActivity.u(dataBean);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        h.x(transferToPalmPayInputAmountActivity, verifyPaymentInfoRsp.getRespMsg());
                    }
                } else if (it2 instanceof m) {
                    transferToPalmPayInputAmountActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    transferToPalmPayInputAmountActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
