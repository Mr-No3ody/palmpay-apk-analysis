package com.flexibank.sdk.cashier.ui.dialog;

import com.flexibank.sdk.cashier.bean.FlexiBankCashierCouponItem;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/flexibank/sdk/cashier/ui/dialog/FlexiBankCashierCouponListDialog$CallBack", "", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierCouponItem;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "onCouponClick", "(Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierCouponItem;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FlexiBankCashierCouponListDialog$CallBack {
    void onCouponClick(@Nullable FlexiBankCashierCouponItem data);
}
