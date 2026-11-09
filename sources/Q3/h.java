package Q3;

import com.flexibank.sdk.cashier.adapter.FlexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierSelectPayMethodDialog$CallBack;

/* JADX INFO: loaded from: classes.dex */
public final class h implements FlexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f7606a;

    public h(i iVar) {
        this.f7606a = iVar;
    }

    @Override // com.flexibank.sdk.cashier.adapter.FlexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onAddNewBankAccountClick() {
        i iVar = this.f7606a;
        FlexiBankCashierSelectPayMethodDialog$CallBack flexiBankCashierSelectPayMethodDialog$CallBack = iVar.f7615w;
        if (flexiBankCashierSelectPayMethodDialog$CallBack != null) {
            flexiBankCashierSelectPayMethodDialog$CallBack.onAddNewBankAccountClick();
        }
        iVar.dismiss();
    }

    @Override // com.flexibank.sdk.cashier.adapter.FlexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onAddNewBankCardClick() {
        i iVar = this.f7606a;
        FlexiBankCashierSelectPayMethodDialog$CallBack flexiBankCashierSelectPayMethodDialog$CallBack = iVar.f7615w;
        if (flexiBankCashierSelectPayMethodDialog$CallBack != null) {
            flexiBankCashierSelectPayMethodDialog$CallBack.onAddNewBankCardClick();
        }
        iVar.dismiss();
    }

    @Override // com.flexibank.sdk.cashier.adapter.FlexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onAddNewBankCardOrBankAccountClick() {
        i iVar = this.f7606a;
        FlexiBankCashierSelectPayMethodDialog$CallBack flexiBankCashierSelectPayMethodDialog$CallBack = iVar.f7615w;
        if (flexiBankCashierSelectPayMethodDialog$CallBack != null) {
            flexiBankCashierSelectPayMethodDialog$CallBack.onAddNewBankCardOrBankAccountClick();
        }
        iVar.dismiss();
    }

    @Override // com.flexibank.sdk.cashier.adapter.FlexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onPaymentMethodClick(int i7, FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean) {
        long availableBalance = flexiBankCashierPaymentMethodBean != null ? flexiBankCashierPaymentMethodBean.getAvailableBalance() : 0L;
        i iVar = this.f7606a;
        if (availableBalance < iVar.f7612o && flexiBankCashierPaymentMethodBean != null && flexiBankCashierPaymentMethodBean.getSenderAccountType() == 1) {
            iVar.dismiss();
            return;
        }
        FlexiBankCashierSelectPayMethodDialog$CallBack flexiBankCashierSelectPayMethodDialog$CallBack = iVar.f7615w;
        if (flexiBankCashierSelectPayMethodDialog$CallBack != null) {
            flexiBankCashierSelectPayMethodDialog$CallBack.onPaymentMethodClick(flexiBankCashierPaymentMethodBean);
        }
    }

    @Override // com.flexibank.sdk.cashier.adapter.FlexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener
    public final void onUseNewMobileWalletClick() {
        i iVar = this.f7606a;
        FlexiBankCashierSelectPayMethodDialog$CallBack flexiBankCashierSelectPayMethodDialog$CallBack = iVar.f7615w;
        if (flexiBankCashierSelectPayMethodDialog$CallBack != null) {
            flexiBankCashierSelectPayMethodDialog$CallBack.onUseNewMobileWalletClick();
        }
        iVar.dismiss();
    }
}
