package com.palmpay.lib.webview.cache;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated(message = "")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fB+\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/palmpay/lib/webview/cache/CacheWebView;", "Landroid/webkit/WebView;", "Lcom/palmpay/lib/webview/cache/ICacheWebView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "loadUrl", "", "url", "", "reload", "checkAndClearCache", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCacheWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheWebView.kt\ncom/palmpay/lib/webview/cache/CacheWebView\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n9#2,4:86\n1#3:90\n*S KotlinDebug\n*F\n+ 1 CacheWebView.kt\ncom/palmpay/lib/webview/cache/CacheWebView\n*L\n73#1:86,4\n*E\n"})
public class CacheWebView extends WebView implements ICacheWebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheWebView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setMixedContentMode(0);
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(false);
        settings.setSavePassword(false);
    }

    private final void checkAndClearCache(String url) {
        WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
        if (webCacheLog.getCanLog()) {
            webCacheLog.d("CacheWebView", "load url : " + url);
        }
        if (url != null) {
            List<String> pathSegments = Uri.parse(url).getPathSegments();
            String str = null;
            if (pathSegments != null) {
                str = C1850q.g(pathSegments) >= 0 ? pathSegments.get(0) : null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            WebCacheLoader loader = WebCache.INSTANCE.getLoader(url);
            if (loader != null) {
                loader.setEnable(OfflineWebManager.getInstance().getSharedPreferences().getBoolean(str, true));
            }
            if (loader == null || loader.getEnable()) {
                return;
            }
            loader.clearDataSource();
        }
    }

    @Override // com.palmpay.lib.webview.cache.ICacheWebView
    @NotNull
    public final View getView() {
        return this;
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.loadUrl(url);
    }

    @Override // android.webkit.WebView, com.palmpay.lib.webview.cache.ICacheWebView
    public void reload() {
        super.reload();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setMixedContentMode(0);
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(false);
        settings.setSavePassword(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setMixedContentMode(0);
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(false);
        settings.setSavePassword(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @RequiresApi(21)
    public CacheWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setMixedContentMode(0);
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(false);
        settings.setSavePassword(false);
    }
}
