package com.palmpay.lib.liveness;

import com.palmpay.lib.liveness.model.CheckResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/palmpay/lib/liveness/LiveID$ILiveIDListener", "", "Lcom/palmpay/lib/liveness/model/CheckResponse;", "response", "", "transactionId", "", "onCompleted", "(Lcom/palmpay/lib/liveness/model/CheckResponse;Ljava/lang/String;)V", "code", "error", "addition", "onInterrupted", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LiveID$ILiveIDListener {
    void onCompleted(@NotNull CheckResponse response, @Nullable String transactionId);

    void onInterrupted(@Nullable String code, @Nullable String error, @Nullable String addition);
}
