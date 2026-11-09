package com.flexibank.sdk.core.dialog;

import com.flexibank.sdk.core.bean.FlexiBankBankInfo;
import com.flexibank.sdk.core.bean.FlexiBankPaymentMethod;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/flexibank/sdk/core/dialog/FlexiBankSelectBankDialogV2$CallBack", "", "Lcom/flexibank/sdk/core/bean/FlexiBankBankInfo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "onChooseBankClick", "(Lcom/flexibank/sdk/core/bean/FlexiBankBankInfo;)V", "Lcom/flexibank/sdk/core/bean/FlexiBankPaymentMethod;", "onClickPayMethod", "(Lcom/flexibank/sdk/core/bean/FlexiBankPaymentMethod;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FlexiBankSelectBankDialogV2$CallBack {
    void onChooseBankClick(@Nullable FlexiBankBankInfo data);

    void onClickPayMethod(@Nullable FlexiBankPaymentMethod data);
}
