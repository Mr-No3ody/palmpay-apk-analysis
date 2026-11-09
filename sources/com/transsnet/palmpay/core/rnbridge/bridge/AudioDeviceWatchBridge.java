package com.transsnet.palmpay.core.rnbridge.bridge;

import F6.d;
import android.app.Activity;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.AsyncBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.transsnet.palmpay.core.web.PWebActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/audio/listen"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/AudioDeviceWatchBridge;", "Lcom/palmpay/lib/bridge/AsyncBridge;", "Ljava/lang/Void;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioDeviceWatchBridge extends AsyncBridge<Void> {
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable Void params, @Nullable IBridgeCallback callback) {
        d.h("========", 3, "进来了");
        Activity activity = getActivity();
        PWebActivity pWebActivity = activity instanceof PWebActivity ? (PWebActivity) activity : null;
        if (pWebActivity != null) {
            pWebActivity.m();
        }
    }
}
