package com.flexibank.sdk.cashier.adapter;

import com.facebook.react.uimanager.ViewProps;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"com/flexibank/sdk/cashier/adapter/FlexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener", "", "", ViewProps.POSITION, "Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierPaymentMethodBean;", "paymentMethod", "", "onPaymentMethodClick", "(ILcom/flexibank/sdk/cashier/bean/FlexiBankCashierPaymentMethodBean;)V", "onAddNewBankCardClick", "()V", "onAddNewBankAccountClick", "onAddNewBankCardOrBankAccountClick", "onUseNewMobileWalletClick", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FlexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener {
    void onAddNewBankAccountClick();

    void onAddNewBankCardClick();

    void onAddNewBankCardOrBankAccountClick();

    void onPaymentMethodClick(int position, @Nullable FlexiBankCashierPaymentMethodBean paymentMethod);

    void onUseNewMobileWalletClick();
}
