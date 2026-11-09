package com.reactnativecommunity.webview;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/reactnativecommunity/webview/RNCWebViewWrapper;", "Landroid/widget/FrameLayout;", "Lcom/reactnativecommunity/webview/RNCWebView;", "a", "Lcom/reactnativecommunity/webview/RNCWebView;", "getWebView", "()Lcom/reactnativecommunity/webview/RNCWebView;", "webView", "react-native-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNCWebViewWrapper extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24683b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final RNCWebView webView;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int getReactTagFromWebView(@NotNull WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Object parent = webView.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                return view.getId();
            }
            return -1;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNCWebViewWrapper(ThemedReactContext context, RNCWebView webView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        webView.setBackgroundColor(0);
        addView(webView);
        View childAt = getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type com.reactnativecommunity.webview.RNCWebView");
        this.webView = (RNCWebView) childAt;
    }

    @NotNull
    public final RNCWebView getWebView() {
        return this.webView;
    }
}
