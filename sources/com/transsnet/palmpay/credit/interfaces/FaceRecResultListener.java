package com.transsnet.palmpay.credit.interfaces;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/interfaces/FaceRecResultListener;", "", "onFaceRecSuccess", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/core/bean/rsp/ALiFaceCheckResultData;", "onFaceRecFailed", "errorCode", "", "errorMsg", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FaceRecResultListener {
    void onFaceRecFailed(@Nullable String errorCode, @Nullable String errorMsg);

    void onFaceRecSuccess(@Nullable ALiFaceCheckResultData data);
}
