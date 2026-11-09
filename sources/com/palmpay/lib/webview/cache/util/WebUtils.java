package com.palmpay.lib.webview.cache.util;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/palmpay/lib/webview/cache/util/WebUtils;", "", "<init>", "()V", "TAG", "", "mainHandler", "Landroid/os/Handler;", "runOnMain", "", "r", "Ljava/lang/Runnable;", "matchHost", "", "host", "whiteList", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebUtils {

    @NotNull
    private static final String TAG = "WebUtils";

    @NotNull
    public static final WebUtils INSTANCE = new WebUtils();

    @NotNull
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    private WebUtils() {
    }

    public final boolean matchHost(@NotNull String host, @NotNull Set<String> whiteList) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(whiteList, "whiteList");
        Iterator<String> it = whiteList.iterator();
        while (it.hasNext()) {
            if (StringsKt.A(host, it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public final void runOnMain(@NotNull Runnable r3) {
        Intrinsics.checkNotNullParameter(r3, "r");
        Thread threadCurrentThread = Thread.currentThread();
        Handler handler = mainHandler;
        if (Intrinsics.c(threadCurrentThread, handler.getLooper().getThread())) {
            r3.run();
        } else {
            if (handler.post(r3)) {
                return;
            }
            handler.post(r3);
        }
    }
}
