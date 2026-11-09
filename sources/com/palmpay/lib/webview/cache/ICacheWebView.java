package com.palmpay.lib.webview.cache;

import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH&J \u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH&J\b\u0010\u000f\u001a\u00020\u0007H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/palmpay/lib/webview/cache/ICacheWebView;", "", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "addJavascriptInterface", "", "obj", "interfaceName", "", "evaluateJavascript", "script", "resultCallback", "Landroid/webkit/ValueCallback;", "reload", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ICacheWebView {
    void addJavascriptInterface(@NotNull Object obj, @NotNull String interfaceName);

    void evaluateJavascript(@NotNull String script, @Nullable ValueCallback<String> resultCallback);

    @Nullable
    View getView();

    void reload();
}
