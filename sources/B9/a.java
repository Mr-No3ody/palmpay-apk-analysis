package B9;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.cash_in.ui.dialog.SelectPaymentBankCardDialog;
import com.transsnet.palmpay.core.bean.BankCardInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements SelectPaymentBankCardDialog.CallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f568a;

    public a(c cVar) {
        this.f568a = cVar;
    }

    @Override // com.transsnet.palmpay.cash_in.ui.dialog.SelectPaymentBankCardDialog.CallBack
    public final void onAddBankcardClick() {
        c cVar = this.f568a;
        cVar.f570a.dismiss();
        cVar.getClass();
        ARouter.getInstance().build("/coreImpl/bind_new_bank_account").withInt("extra_type", 2).navigation();
    }

    @Override // com.transsnet.palmpay.cash_in.ui.dialog.SelectPaymentBankCardDialog.CallBack
    public final void onChooseBankClick(BankCardInfo bankCardInfo) {
        c cVar = this.f568a;
        cVar.getClass();
        cVar.f571b = bankCardInfo;
        cVar.f570a.dismiss();
        cVar.n();
    }
}
