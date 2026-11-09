package com.palmpay.lib.bridgewrapper.page;

import android.app.Activity;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/page/close"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\t"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/page/PageCloseBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Ljava/lang/Void;", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PageCloseBridge extends SyncBridge<Void> {
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable Void params, @Nullable IBridgeCallback callback) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
