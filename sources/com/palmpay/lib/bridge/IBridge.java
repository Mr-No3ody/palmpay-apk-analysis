package com.palmpay.lib.bridge;

import android.app.Activity;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.Gson;
import com.palmpay.lib.bridge.param.BridgeRequestParam;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/palmpay/lib/bridge/IBridge;", "", "Landroid/app/Activity;", "activity", "Lcom/palmpay/lib/bridge/param/BridgeRequestParam;", "request", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "", ViewProps.START, "(Landroid/app/Activity;Lcom/palmpay/lib/bridge/param/BridgeRequestParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Lcom/google/gson/Gson;", "gson", "execute", "(Lcom/google/gson/Gson;)V", "lib_bridge_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IBridge {
    void execute(@Nullable Gson gson);

    void start(@Nullable Activity activity, @Nullable BridgeRequestParam request, @Nullable IBridgeCallback callback);
}
