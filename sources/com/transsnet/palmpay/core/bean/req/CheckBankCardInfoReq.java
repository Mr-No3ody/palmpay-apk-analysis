package com.transsnet.palmpay.core.bean.req;

import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/CheckBankCardInfoReq;", "Lcom/transsnet/palmpay/core/base/SingleLiveData$Params;", "verifyType", "", "bankCardNo", "", "bankCode", "checkType", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckBankCardInfoReq implements SingleLiveData$Params {

    @NotNull
    public static final String BANK_ACCOUNT = "1";

    @NotNull
    public static final String BANK_CARD = "0";
    public static final int NEXT_VERIFY = 1;
    public static final int OTP_VERIFY = 0;

    @JvmField
    @NotNull
    public final String bankCardNo;

    @JvmField
    @Nullable
    public final String bankCode;

    @JvmField
    @NotNull
    public final String checkType;

    @JvmField
    public final int verifyType;

    public CheckBankCardInfoReq(int i7, @NotNull String bankCardNo, @Nullable String str, @NotNull String checkType) {
        Intrinsics.checkNotNullParameter(bankCardNo, "bankCardNo");
        Intrinsics.checkNotNullParameter(checkType, "checkType");
        this.verifyType = i7;
        this.bankCardNo = bankCardNo;
        this.bankCode = str;
        this.checkType = checkType;
    }
}
