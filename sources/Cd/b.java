package Cd;

import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.QueryBankcardUserNameRsp;
import com.transsnet.palmpay.send_money.bean.AddRecipientResp;
import com.transsnet.palmpay.send_money.bean.event.AddRecipientEvent;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmBankInfoDialog;
import com.transsnet.palmpay.send_money.ui.dialog.TransferErrorDialog;
import com.transsnet.palmpay.send_money.ui.fragment.AddBankAccountFragment;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddBankAccountFragment f1357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddBankAccountFragment f1358c;

    public /* synthetic */ b(AddBankAccountFragment addBankAccountFragment, AddBankAccountFragment addBankAccountFragment2, int i7) {
        this.f1356a = i7;
        this.f1357b = addBankAccountFragment;
        this.f1358c = addBankAccountFragment2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BankInfo bankInfo;
        AddBankAccountFragment addBankAccountFragment = this.f1358c;
        AddBankAccountFragment addBankAccountFragment2 = this.f1357b;
        switch (this.f1356a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    addBankAccountFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    addBankAccountFragment2.showLoadingDialog(false, true);
                    QueryBankcardUserNameRsp queryBankcardUserNameRsp = (QueryBankcardUserNameRsp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (queryBankcardUserNameRsp.isSuccess()) {
                        QueryBankcardUserNameRsp.DataBean data = queryBankcardUserNameRsp.getData();
                        if (data != null && (bankInfo = addBankAccountFragment.f33651C) != null) {
                            String str = bankInfo.bankName;
                            String strU = addBankAccountFragment.u();
                            String accountName = data.getAccountName();
                            String str2 = bankInfo.bankUrl;
                            ConfirmBankInfoDialog confirmBankInfoDialog = new ConfirmBankInfoDialog(addBankAccountFragment.requireContext());
                            confirmBankInfoDialog.show();
                            confirmBankInfoDialog.updateUi(str, strU, accountName, str2);
                            confirmBankInfoDialog.setResultCallback(new A8.a(addBankAccountFragment, 20));
                        }
                    } else {
                        String respMsg = queryBankcardUserNameRsp.getRespMsg();
                        Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                        int i7 = AddBankAccountFragment.f33648M;
                        TransferErrorDialog transferErrorDialog = new TransferErrorDialog(addBankAccountFragment.requireContext());
                        transferErrorDialog.show();
                        transferErrorDialog.setContent(respMsg);
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    addBankAccountFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    addBankAccountFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    addBankAccountFragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    addBankAccountFragment2.showLoadingDialog(false, true);
                    AddRecipientResp addRecipientResp = (AddRecipientResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (!addRecipientResp.isSuccess()) {
                        String respMsg2 = addRecipientResp.getRespMsg();
                        Intrinsics.checkNotNullExpressionValue(respMsg2, "getRespMsg(...)");
                        AddBankAccountFragment.t(addBankAccountFragment, respMsg2);
                    } else if (addRecipientResp.getData() != null) {
                        org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
                        ToastUtils.showShort("Successfully Add Bank Account", new Object[0]);
                        addBankAccountFragment.requireActivity().finish();
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    addBankAccountFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    addBankAccountFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it2).getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof com.transsnet.palmpay.core.base.o) {
                    addBankAccountFragment2.showLoadingDialog(true, true);
                } else if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                    addBankAccountFragment2.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                    if (commonResult.isSuccess()) {
                        ToastUtils.showLong(p159kd.h.sm_save_successfully);
                        org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        addBankAccountFragment.requireActivity().finish();
                    } else {
                        String respMsg3 = commonResult.getRespMsg();
                        Intrinsics.checkNotNullExpressionValue(respMsg3, "getRespMsg(...)");
                        AddBankAccountFragment.t(addBankAccountFragment, respMsg3);
                    }
                } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                    addBankAccountFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    addBankAccountFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it3).getClass();
                }
                return Unit.f38893a;
        }
    }
}
