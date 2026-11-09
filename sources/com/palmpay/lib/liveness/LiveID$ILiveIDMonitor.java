package com.palmpay.lib.liveness;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/palmpay/lib/liveness/LiveID$ILiveIDMonitor", "", "", "eventId", "", "attribute", "", "report", "(Ljava/lang/String;Ljava/util/Map;)V", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LiveID$ILiveIDMonitor {
    void report(@NotNull String eventId, @Nullable Map<String, Object> attribute);
}
