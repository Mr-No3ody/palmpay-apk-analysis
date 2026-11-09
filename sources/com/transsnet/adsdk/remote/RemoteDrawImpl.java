package com.transsnet.adsdk.remote;

import android.app.Service;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.flexibank.sdk.g;
import com.transsnet.adsdk.IRemoteDraw;
import com.transsnet.adsdk.R;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.widgets.jsinterfaces.JsInterfaces;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p201n8.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/transsnet/adsdk/remote/RemoteDrawImpl;", "Lcom/transsnet/adsdk/IRemoteDraw$Stub;", "Landroid/app/Service;", "service", "<init>", "(Landroid/app/Service;)V", "Landroid/view/Surface;", "surface", "", "draw", "(Landroid/view/Surface;)V", "Landroid/view/View;", "createView", "()Landroid/view/View;", "release", "()V", "", "width", "height", "setSurface", "(Landroid/view/Surface;II)V", "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "url", "setWebUrl", "(Ljava/lang/String;)V", "Landroid/app/Service;", "Landroid/hardware/display/VirtualDisplay;", "virtualDisplay", "Landroid/hardware/display/VirtualDisplay;", "Ln8/a;", "mPresentation", "Ln8/a;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "contentView", "Landroid/view/View;", "mWidth", "I", "mHeight", "mUrl", "Ljava/lang/String;", "Companion", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteDrawImpl extends IRemoteDraw.Stub {

    @NotNull
    private static final String TAG = "RemoteDrawImpl";

    @Nullable
    private View contentView;
    private int mHeight;

    @Nullable
    private a mPresentation;

    @Nullable
    private String mUrl;
    private int mWidth;

    @NotNull
    private final Handler mainHandler;

    @NotNull
    private final Service service;

    @Nullable
    private VirtualDisplay virtualDisplay;

    public RemoteDrawImpl(@NotNull Service service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    private final View createView() {
        View viewInflate = LayoutInflater.from(this.service).inflate(R.layout.lib_ad_view_sub_process, (ViewGroup) null);
        WebView webView = (WebView) viewInflate.findViewById(R.id.webView);
        AdSdkUtils.setupWebView(this.service, webView, "sub", new JsInterfaces(null));
        String str = this.mUrl;
        if (str != null) {
            webView.loadUrl(str);
        }
        this.contentView = viewInflate;
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void draw(Surface surface) {
        Object systemService = this.service.getSystemService("display");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        this.virtualDisplay = ((DisplayManager) systemService).createVirtualDisplay("ad_web", this.mWidth, this.mHeight, this.service.getResources().getDisplayMetrics().densityDpi, surface, 0);
        Service service = this.service;
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        a aVar = new a(service, virtualDisplay != null ? virtualDisplay.getDisplay() : null);
        this.mPresentation = aVar;
        aVar.setContentView(createView());
        a aVar2 = this.mPresentation;
        if (aVar2 != null) {
            aVar2.show();
        }
    }

    @Override // com.transsnet.adsdk.IRemoteDraw
    public boolean dispatchTouchEvent(@Nullable MotionEvent event) {
        View view = this.contentView;
        if (view != null) {
            return view.dispatchTouchEvent(event);
        }
        return false;
    }

    @Override // com.transsnet.adsdk.IRemoteDraw
    public void release() {
        try {
            a aVar = this.mPresentation;
            if (aVar != null) {
                aVar.dismiss();
            }
            this.mPresentation = null;
            VirtualDisplay virtualDisplay = this.virtualDisplay;
            if (virtualDisplay != null) {
                virtualDisplay.release();
            }
            this.virtualDisplay = null;
            this.service.stopSelf();
            this.contentView = null;
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // com.transsnet.adsdk.IRemoteDraw
    public void setSurface(@Nullable Surface surface, int width, int height) {
        if (surface == null) {
            Log.e(TAG, "setSurface: surface is null.");
            return;
        }
        this.mWidth = width;
        this.mHeight = height;
        this.mainHandler.post(new g(25, this, surface));
    }

    @Override // com.transsnet.adsdk.IRemoteDraw
    public void setWebUrl(@Nullable String url) {
        this.mUrl = url;
    }
}
