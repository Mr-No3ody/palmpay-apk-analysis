package com.transsnet.palmpay.credit.rnbridge;

import C0.G;
import F6.d;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Service(alias = {"/loan/setquotachangedata"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/rnbridge/QuotaChangeSetBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/credit/rnbridge/QuotaChangeSetBridgeParams;", "<init>", "()V", "params", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "", "onHandle", "(Lcom/transsnet/palmpay/credit/rnbridge/QuotaChangeSetBridgeParams;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Companion", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuotaChangeSetBridge extends SyncBridge<QuotaChangeSetBridgeParams> {

    @NotNull
    public static final String TAG = "QuotaChangeSetBridge";

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable QuotaChangeSetBridgeParams params, @Nullable IBridgeCallback callback) {
        String quota_change_data;
        d.h(TAG, 3, "onHandle params: " + params + "}");
        if (params == null || (quota_change_data = params.getQuota_change_data()) == null) {
            quota_change_data = "";
        }
        SPUtils.get().put(G.o("quota_change_data", G.A()), quota_change_data);
    }
}
