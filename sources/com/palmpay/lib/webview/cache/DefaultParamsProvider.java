package com.palmpay.lib.webview.cache;

import N8.q0;
import android.net.Uri;
import android.text.TextUtils;
import com.palmpay.lib.webview.cache.entity.WebCacheDataSource;
import com.palmpay.lib.webview.offline.OfflineConfig;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/palmpay/lib/webview/cache/DefaultParamsProvider;", "Lcom/palmpay/lib/webview/cache/WebCacheParamsProvider;", "<init>", "()V", "getUserAgent", "", "url", "showLog", "", "sourceWithUrl", "Lcom/palmpay/lib/webview/cache/entity/WebCacheDataSource;", "loader", "Lcom/palmpay/lib/webview/cache/WebCacheLoader;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultParamsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultParamsProvider.kt\ncom/palmpay/lib/webview/cache/DefaultParamsProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class DefaultParamsProvider extends WebCacheParamsProvider {
    @Override // com.palmpay.lib.webview.cache.WebCacheParamsProvider
    @Nullable
    public String getUserAgent(@Nullable String url) {
        return WebCacheSetting.INSTANCE.getUserAgent();
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheParamsProvider
    public boolean showLog() {
        return false;
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheParamsProvider
    @Nullable
    public WebCacheDataSource sourceWithUrl(@NotNull String url, @Nullable WebCacheLoader loader) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!OfflineWebManager.getInstance().isInit()) {
            return null;
        }
        Uri uri = Uri.parse(url);
        OfflineConfig offlineConfig = OfflineWebManager.getInstance().getOfflineConfig();
        if ((offlineConfig != null ? offlineConfig.getPreDownloadList() : null) != null) {
            HashSet<String> preDownloadList = offlineConfig.getPreDownloadList();
            if ((preDownloadList != null ? preDownloadList.size() : 0) > 0) {
                List<String> pathSegments = uri.getPathSegments();
                String str = "";
                if (pathSegments != null) {
                    String str2 = C1850q.g(pathSegments) >= 0 ? pathSegments.get(0) : "";
                    if (str2 != null) {
                        str = str2;
                    }
                }
                if (!TextUtils.isEmpty(str) && offlineConfig.getPreDownloadList().contains(str)) {
                    return new WebCacheDataSource(q0.y(str, File.separator, OfflineConstant.CUR_DIR_NAME), true, null, null, null, 28, null);
                }
            }
        }
        return null;
    }
}
