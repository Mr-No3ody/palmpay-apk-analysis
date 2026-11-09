package com.transsnet.palmpay.core.util;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/transsnet/palmpay/core/util/ScanFaceLogicUtil$IScanFaceResultCallBack", "", "", "onProcessing", "()V", "Lcom/transsnet/palmpay/core/bean/rsp/ALiFaceCheckResultData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onSuccess", "(Lcom/transsnet/palmpay/core/bean/rsp/ALiFaceCheckResultData;)V", "", "errorCode", "errorMsg", "addition", "onFailed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ScanFaceLogicUtil$IScanFaceResultCallBack {
    void onFailed(@Nullable String errorCode, @Nullable String errorMsg, @Nullable String addition);

    void onProcessing();

    void onSuccess(@NotNull ALiFaceCheckResultData data);
}
