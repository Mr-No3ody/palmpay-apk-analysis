package com.palmpay.lib.webview.container.fast.offline;

import com.palmpay.lib.webview.container.fast.WebResource;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/palmpay/lib/webview/container/fast/offline/PostInterceptor;", "Lcom/palmpay/lib/webview/container/fast/offline/Destroyable;", "Lcom/palmpay/lib/webview/container/fast/offline/ResourceInterceptor;", "<init>", "()V", "destroy", "", "prepare", "url", "", "refresh", "", "load", "Lcom/palmpay/lib/webview/container/fast/WebResource;", "chain", "Lcom/palmpay/lib/webview/container/fast/offline/Chain;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PostInterceptor implements Destroyable, ResourceInterceptor {
    @Override // com.palmpay.lib.webview.container.fast.offline.Destroyable
    public void destroy() {
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    @Nullable
    public WebResource load(@Nullable Chain chain) {
        String upperCase;
        String method;
        CacheRequest request = chain != null ? chain.getRequest() : null;
        if (request == null || (method = request.getMethod()) == null) {
            upperCase = null;
        } else {
            upperCase = method.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        }
        if (Intrinsics.c(upperCase, "GET")) {
            return chain.process(request);
        }
        return null;
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public void prepare(@Nullable String url, boolean refresh) {
    }
}
