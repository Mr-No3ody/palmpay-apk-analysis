package com.palmpay.lib.webview.container.fast.offline;

import android.net.Uri;
import android.text.TextUtils;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/palmpay/lib/webview/container/fast/offline/CacheResourceInterceptor;", "Lcom/palmpay/lib/webview/container/fast/offline/ResourceInterceptor;", "<init>", "()V", "isValid", "", "request", "Lcom/palmpay/lib/webview/container/fast/offline/CacheRequest;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCacheResourceInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheResourceInterceptor.kt\ncom/palmpay/lib/webview/container/fast/offline/CacheResourceInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public abstract class CacheResourceInterceptor implements ResourceInterceptor {
    public boolean isValid(@Nullable CacheRequest request) {
        if (OfflineWebManager.getInstance().isInit() && request != null && true == request.isForFrame()) {
            List<String> pathSegments = Uri.parse(request.getUrl().toString()).getPathSegments();
            String str = null;
            if (pathSegments != null) {
                str = C1850q.g(pathSegments) >= 0 ? pathSegments.get(0) : null;
            }
            if (!TextUtils.isEmpty(str)) {
                return OfflineWebManager.getInstance().getSharedPreferences().getBoolean(str, true);
            }
        }
        return true;
    }
}
