package com.transsnet.palmpay.core.rnbridge.bridge;

import F6.d;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.AsyncBridge;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.pp.faceguard.traffic.FaceGuardTraffic;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.init.BaseInitTask;
import face.security.device.api.FaceSecDevice;
import face.security.device.api.FaceSecToken;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/faceDeviceToken/get"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/FaceDeviceInfoBridge;", "Lcom/palmpay/lib/bridge/AsyncBridge;", "Ljava/lang/Void;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FaceDeviceInfoBridge extends AsyncBridge<Void> {
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable Void params, @Nullable IBridgeCallback callback) {
        try {
            FaceSecToken deviceToken = FaceSecDevice.getInstance().getDeviceToken();
            if (deviceToken == null) {
                handleReject("deviceToken is null");
                d.h(BaseInitTask.TAG, 3, "AliyunFaceGuard get token fail, token is null");
                return;
            }
            int i7 = deviceToken.code;
            if (10000 != i7) {
                handleReject("token fail code=" + i7);
                d.h(BaseInitTask.TAG, 3, "AliyunFaceGuard get token fail code=" + deviceToken.code);
                return;
            }
            if (BaseApplication.hasLogin()) {
                try {
                    FaceGuardTraffic.bindDeviceTokens(BaseApplication.get().getUser().getMemberId(), deviceToken.token, "", null);
                } catch (Exception e10) {
                    d.c(BaseInitTask.TAG, "AliyunFaceGuard bindDeviceTokens fail: " + e10.getMessage());
                }
            }
            BaseBridge.handleSuccess$default(this, deviceToken, null, 2, null);
            d.h(BaseInitTask.TAG, 3, "AliyunFaceGuard get token success token=" + deviceToken.token);
        } catch (Exception e11) {
            handleFail(e11);
        }
    }
}
