package com.palmpay.lib.webview.cache.util;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"log", "", "block", "Lkotlin/Function1;", "Lcom/palmpay/lib/webview/cache/util/WebCacheLog;", "Lkotlin/ParameterName;", "name", "logger", "lib_webview_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WebCacheLogKt {
    @Keep
    public static final void log(@NotNull Function1<? super WebCacheLog, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
        if (webCacheLog.getCanLog()) {
            block.invoke(webCacheLog);
        }
    }
}
