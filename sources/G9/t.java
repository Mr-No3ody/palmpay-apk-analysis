package G9;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.core.dialog.NgSelectBankCardDialog;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements NgSelectBankCardDialog.CallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WithdrawV2Fragment f3190a;

    public t(WithdrawV2Fragment withdrawV2Fragment) {
        this.f3190a = withdrawV2Fragment;
    }

    @Override // com.transsnet.palmpay.core.dialog.NgSelectBankCardDialog.CallBack
    public final void onAddBankcardClick() {
        ARouter.getInstance().build("/coreImpl/bind_new_bank_account").withInt("extra_type", 2).navigation();
        NgSelectBankCardDialog ngSelectBankCardDialog = this.f3190a.f27056Z;
        if (ngSelectBankCardDialog != null) {
            ngSelectBankCardDialog.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.NgSelectBankCardDialog.CallBack
    public final void onChooseBankClick(BankCardInfo bankCardInfo) {
        WithdrawV2Fragment withdrawV2Fragment = this.f3190a;
        withdrawV2Fragment.f27054X = bankCardInfo;
        WithdrawV2Fragment.t(withdrawV2Fragment, bankCardInfo);
        NgSelectBankCardDialog ngSelectBankCardDialog = withdrawV2Fragment.f27056Z;
        if (ngSelectBankCardDialog != null) {
            ngSelectBankCardDialog.dismiss();
        }
    }
}
