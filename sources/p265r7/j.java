package p265r7;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import com.reactnativecommunity.webview.RNCWebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Activity f41615A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f41616B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(RNCWebView rNCWebView, Activity activity, int i7) {
        super(rNCWebView);
        this.f41615A = activity;
        this.f41616B = i7;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        if (this.f41592b == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f41591a.getThemedReactContext().getCurrentActivity().findViewById(R.id.content);
        View rootView = viewGroup.getRootView();
        RNCWebView rNCWebView = this.f41591a;
        if (rootView != rNCWebView.getRootView()) {
            rNCWebView.getRootView().setVisibility(0);
        } else {
            rNCWebView.setVisibility(0);
        }
        Activity activity = this.f41615A;
        activity.getWindow().clearFlags(512);
        viewGroup.removeView(this.f41592b);
        this.f41593c.onCustomViewHidden();
        this.f41592b = null;
        this.f41593c = null;
        activity.setRequestedOrientation(this.f41616B);
        rNCWebView.getThemedReactContext().removeLifecycleEventListener(this);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f41592b != null) {
            callback.onCustomViewHidden();
            return;
        }
        this.f41592b = view;
        this.f41593c = callback;
        Activity activity = this.f41615A;
        activity.setRequestedOrientation(-1);
        this.f41592b.setSystemUiVisibility(7942);
        activity.getWindow().setFlags(512, 512);
        this.f41592b.setBackgroundColor(-16777216);
        ViewGroup viewGroup = (ViewGroup) this.f41591a.getThemedReactContext().getCurrentActivity().findViewById(R.id.content);
        viewGroup.addView(this.f41592b, b.f41590w);
        View rootView = viewGroup.getRootView();
        RNCWebView rNCWebView = this.f41591a;
        if (rootView != rNCWebView.getRootView()) {
            rNCWebView.getRootView().setVisibility(8);
        } else {
            rNCWebView.setVisibility(8);
        }
        rNCWebView.getThemedReactContext().addLifecycleEventListener(this);
    }
}
