package com.transsnet.palmpay.core.bean.rsp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/CheckBankCardInfoRsp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/core/bean/rsp/CheckBankCardInfoRsp$Data;", "<init>", "(Lcom/transsnet/palmpay/core/bean/rsp/CheckBankCardInfoRsp$Data;)V", "Data", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckBankCardInfoRsp extends CommonResult {

    @JvmField
    @NotNull
    public final Data data;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/CheckBankCardInfoRsp$Data;", "", "bankCode", "", "bankName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {

        @JvmField
        @NotNull
        public final String bankCode;

        @JvmField
        @NotNull
        public final String bankName;

        public Data(@NotNull String bankCode, @NotNull String bankName) {
            Intrinsics.checkNotNullParameter(bankCode, "bankCode");
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            this.bankCode = bankCode;
            this.bankName = bankName;
        }
    }

    public CheckBankCardInfoRsp(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }
}
