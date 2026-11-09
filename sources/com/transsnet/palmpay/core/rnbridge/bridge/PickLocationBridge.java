package com.transsnet.palmpay.core.rnbridge.bridge;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import com.didi.drouter.annotation.Service;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.crashlytics.internal.concurrency.b;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.common.export.bean.PickLocationReq;
import com.transsnet.palmpay.core.activityresult.IActivityResult;
import com.transsnet.palmpay.core.ui.activity.MapsActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/location/pick"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/PickLocationBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/common/export/bean/PickLocationReq;", "<init>", "()V", "onHandle", "", "req", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PickLocationBridge extends SyncBridge<PickLocationReq> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHandle$lambda$3$lambda$2$lambda$1(PickLocationBridge pickLocationBridge, int i7, Intent intent) {
        if (i7 == -1) {
            BaseBridge.handleSuccess$default(pickLocationBridge, intent != null ? (LatLng) intent.getParcelableExtra("extra_data") : null, null, 2, null);
        } else if (i7 != 0) {
            pickLocationBridge.handleReject("Something wrong");
        } else {
            BaseBridge.handleCancel$default(pickLocationBridge, null, 1, null);
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable PickLocationReq req, @Nullable IBridgeCallback callback) {
        if (req != null) {
            Intent intent = new Intent(getActivity(), (Class<?>) MapsActivity.class);
            intent.putExtra("extra_data", req);
            ComponentCallbacks2 activity = getActivity();
            if (activity != null) {
                if (!(activity instanceof IActivityResult)) {
                    activity = null;
                }
                if (activity != null) {
                    ((IActivityResult) activity).getF28604i().f(intent, new b(this, 25));
                }
            }
        }
    }
}
