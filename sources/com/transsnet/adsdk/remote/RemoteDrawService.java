package com.transsnet.adsdk.remote;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.webkit.WebView;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/transsnet/adsdk/remote/RemoteDrawService;", "Landroid/app/Service;", "<init>", "()V", "cacheWebView", "Landroid/webkit/WebView;", "onCreate", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onDestroy", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteDrawService extends Service {

    @Nullable
    private WebView cacheWebView;

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@Nullable Intent intent) {
        return new RemoteDrawImpl(this);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Objects.toString(this.cacheWebView);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.cacheWebView = null;
    }
}
