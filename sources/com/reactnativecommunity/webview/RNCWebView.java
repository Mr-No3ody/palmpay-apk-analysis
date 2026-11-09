package com.reactnativecommunity.webview;

import C0.G;
import E.N;
import android.annotation.SuppressLint;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.webkit.internal.o;
import androidx.webkit.k;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.ContentSizeChangeEvent;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.scroll.OnScrollDispatchHelper;
import com.facebook.react.views.scroll.ScrollEvent;
import com.facebook.react.views.scroll.ScrollEventType;
import com.google.firebase.messaging.Constants;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import p183m6.j;
import p265r7.a;
import p265r7.b;
import p265r7.d;
import p265r7.e;
import p265r7.f;
import p281s7.p;

/* JADX INFO: loaded from: classes3.dex */
public class RNCWebView extends WebView implements LifecycleEventListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public WebChromeClient f24668A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f24669B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f24672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f24673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RNCWebViewMessagingModule f24676g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f24677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24678j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OnScrollDispatchHelper f24679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24680p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public N f24681v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f24682w;

    public final void a(WebView webView, Event event) {
        UIManagerHelper.getEventDispatcherForReactTag(getThemedReactContext(), RNCWebViewWrapper.f24683b.getReactTagFromWebView(webView)).dispatchEvent(event);
    }

    public final void b() {
        if (getSettings().getJavaScriptEnabled()) {
            StringBuilder sb2 = new StringBuilder("(function(){\n    window.ReactNativeWebView = window.ReactNativeWebView || {};\n    window.ReactNativeWebView.injectedObjectJson = function () { return ");
            sb2.append(this.f24669B == null ? null : G.r(new StringBuilder("`"), this.f24669B, "`"));
            sb2.append("; };\n})();");
            evaluateJavascript(sb2.toString(), null);
        }
    }

    public final void c(String str, String str2) {
        getThemedReactContext();
        if (this.f24677i != null) {
            post(new androidx.appcompat.view.menu.e(this, this, str2, str, 3));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
        if (this.f24676g == null) {
            a(this, new p(writableMapCreateMap, RNCWebViewWrapper.f24683b.getReactTagFromWebView(this)));
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMapCreateMap);
        writableNativeMap.putString("messagingModuleName", this.f24675f);
        this.f24676g.onMessage(writableNativeMap);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        WebChromeClient webChromeClient = this.f24668A;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    public boolean getMessagingEnabled() {
        return this.f24674e;
    }

    @Nullable
    public f getRNCWebViewClient() {
        return this.f24677i;
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().getReactApplicationContext();
    }

    public ThemedReactContext getThemedReactContext() {
        return (ThemedReactContext) getContext();
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f24668A;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        setWebViewClient(null);
        destroy();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        if (this.f24680p) {
            if (this.f24679o == null) {
                this.f24679o = new OnScrollDispatchHelper();
            }
            if (this.f24679o.onScrollChanged(i7, i10)) {
                a(this, ScrollEvent.obtain(RNCWebViewWrapper.f24683b.getReactTagFromWebView(this), ScrollEventType.SCROLL, i7, i10, this.f24679o.getXFlingVelocity(), this.f24679o.getYFlingVelocity(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.f24678j) {
            a(this, new ContentSizeChangeEvent(RNCWebViewWrapper.f24683b.getReactTagFromWebView(this), i7, i10));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.t) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(a aVar) {
        this.f24677i.f41612c = aVar;
    }

    public void setHasScrollEvent(boolean z3) {
        this.f24680p = z3;
    }

    public void setInjectedJavaScriptObject(String str) {
        this.f24669B = str;
        b();
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.f24682w = list;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void setMessagingEnabled(boolean z3) {
        if (this.f24674e == z3) {
            return;
        }
        this.f24674e = z3;
        if (z3) {
            if (k.a("WEB_MESSAGE_LISTENER")) {
                if (this.f24673d == null) {
                    this.f24673d = new j(this, 20);
                    HashSet hashSet = new HashSet(1);
                    Object obj = new Object[]{"*"}[0];
                    Objects.requireNonNull(obj);
                    if (!hashSet.add(obj)) {
                        throw new IllegalArgumentException("duplicate element: " + obj);
                    }
                    Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                    j jVar = this.f24673d;
                    WeakHashMap weakHashMap = androidx.webkit.j.f18330a;
                    if (!o.f18313f.b()) {
                        throw o.a();
                    }
                    androidx.webkit.j.d(this).f18328a.addWebMessageListener("ReactNativeWebView", (String[]) setUnmodifiableSet.toArray(new String[0]), new org.chromium.support_lib_boundary.util.a(new org.greenrobot.eventbus.f(jVar, 10)));
                }
            } else if (this.f24672c == null) {
                e eVar = new e();
                eVar.f41609a = this;
                this.f24672c = eVar;
                addJavascriptInterface(eVar, "ReactNativeWebView");
            }
            b();
        }
    }

    public void setNestedScrollEnabled(boolean z3) {
        this.t = z3;
    }

    public void setSendContentSizeChangeEvents(boolean z3) {
        this.f24678j = z3;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f24668A = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof b) {
            ((b) webChromeClient).f41600o = this.f24681v;
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof f) {
            f fVar = (f) webViewClient;
            this.f24677i = fVar;
            fVar.f41611b = this.f24681v;
        }
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback, int i7) {
        return this.f24682w == null ? super.startActionMode(callback, i7) : super.startActionMode(new d(this, callback), i7);
    }
}
