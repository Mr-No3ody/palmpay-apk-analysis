package p265r7;

import E.N;
import R3.a;
import android.content.ComponentCallbacks2;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.content.d;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.reactnativecommunity.webview.RNCWebView;
import com.reactnativecommunity.webview.RNCWebViewModule;
import com.reactnativecommunity.webview.RNCWebViewWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p141j9.C1794b;
import p281s7.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends WebChromeClient implements LifecycleEventListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final FrameLayout.LayoutParams f41590w = new FrameLayout.LayoutParams(-1, -1, 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RNCWebView f41591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f41592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f41593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PermissionRequest f41594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f41595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GeolocationPermissions.Callback f41596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f41597g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41598i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f41599j = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public N f41600o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41601p = false;
    public boolean t = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1794b f41602v = new C1794b(this, 20);

    public b(RNCWebView rNCWebView) {
        this.f41591a = rNCWebView;
    }

    public final synchronized void a(List list) {
        if (this.f41598i) {
            this.f41599j.addAll(list);
            return;
        }
        ComponentCallbacks2 currentActivity = this.f41591a.getThemedReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (!(currentActivity instanceof PermissionAwareActivity)) {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        this.f41598i = true;
        ((PermissionAwareActivity) currentActivity).requestPermissions((String[]) list.toArray(new String[0]), 3, this.f41602v);
        this.f41599j.clear();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (ReactBuildConfig.DEBUG) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z3, boolean z8, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.t) {
            webView2.setWebViewClient(new a(webView, 2));
        }
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (d.a(this.f41591a.getThemedReactContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            callback.invoke(str, true, false);
            return;
        }
        this.f41596f = callback;
        this.f41597g = str;
        a(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        View view = this.f41592b;
        if (view == null || view.getSystemUiVisibility() == 7942) {
            return;
        }
        this.f41592b.setSystemUiVisibility(7942);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        this.f41595e = new ArrayList();
        ArrayList arrayList = new ArrayList();
        String[] resources = permissionRequest.getResources();
        int length = resources.length;
        int i7 = 0;
        while (true) {
            String str = null;
            if (i7 >= length) {
                break;
            }
            String str2 = resources[i7];
            if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                str = "android.permission.RECORD_AUDIO";
            } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                str = "android.permission.CAMERA";
            } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (this.f41601p) {
                    this.f41595e.add(str2);
                } else {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
            }
            if (str != null) {
                if (d.a(this.f41591a.getThemedReactContext(), str) == 0) {
                    this.f41595e.add(str2);
                } else {
                    arrayList.add(str);
                }
            }
            i7++;
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant((String[]) this.f41595e.toArray(new String[0]));
            this.f41595e = null;
        } else {
            this.f41594d = permissionRequest;
            a(arrayList);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i7) {
        super.onProgressChanged(webView, i7);
        String url = webView.getUrl();
        if (this.f41600o.f1938b) {
            return;
        }
        int reactTagFromWebView = RNCWebViewWrapper.f24683b.getReactTagFromWebView(webView);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", reactTagFromWebView);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putString("url", url);
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, i7 / 100.0f);
        UIManagerHelper.getEventDispatcherForReactTag(this.f41591a.getThemedReactContext(), reactTagFromWebView).dispatchEvent(new l(writableMapCreateMap, reactTagFromWebView));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return ((RNCWebViewModule) this.f41591a.getThemedReactContext().getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1, fileChooserParams.isCaptureEnabled());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }
}
