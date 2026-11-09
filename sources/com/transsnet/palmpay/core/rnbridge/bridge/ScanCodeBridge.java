package com.transsnet.palmpay.core.rnbridge.bridge;

import C0.G;
import F6.d;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import com.didi.drouter.annotation.Service;
import com.google.firebase.crashlytics.internal.concurrency.b;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.palmpay.lib.scanplus.ScanPlusActivity;
import com.palmpay.lib.scanplus.bean.CodeBean;
import com.transsnet.palmpay.common.export.bean.ScanCodeReq;
import com.transsnet.palmpay.common.export.bean.ScanCodeRsp;
import com.transsnet.palmpay.core.activityresult.IActivityResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/scan/qr"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/ScanCodeBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/common/export/bean/ScanCodeReq;", "<init>", "()V", "onHandle", "", "req", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "Companion", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanCodeBridge extends SyncBridge<ScanCodeReq> {

    @NotNull
    private static final String TAG = "ScanCodeBridge";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHandle$lambda$4$lambda$3$lambda$2(ScanCodeBridge scanCodeBridge, int i7, Intent intent) {
        if (i7 != -1) {
            if (i7 != 0) {
                scanCodeBridge.handleReject("Something wrong");
                return;
            } else {
                BaseBridge.handleCancel$default(scanCodeBridge, null, 1, null);
                return;
            }
        }
        CodeBean codeBean = intent != null ? (CodeBean) intent.getParcelableExtra("scan_code_key") : null;
        d.h(TAG, 3, G.o("onHandle: ", codeBean != null ? codeBean.getCodeString() : null));
        if (codeBean == null) {
            scanCodeBridge.handleFail(new Exception("No code found"));
            return;
        }
        ScanCodeRsp scanCodeRsp = new ScanCodeRsp();
        scanCodeRsp.setCode(codeBean.getCodeString());
        scanCodeRsp.setCodeType(codeBean.getScanCodeType().toString());
        BaseBridge.handleSuccess$default(scanCodeBridge, scanCodeRsp, null, 2, null);
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable ScanCodeReq req, @Nullable IBridgeCallback callback) {
        if (req != null) {
            Intent intent = new Intent(getActivity(), (Class<?>) ScanPlusActivity.class);
            Boolean useCameraX = req.getUseCameraX();
            intent.putExtra("CameraX", useCameraX != null ? useCameraX.booleanValue() : false);
            ComponentCallbacks2 activity = getActivity();
            if (activity != null) {
                if (!(activity instanceof IActivityResult)) {
                    activity = null;
                }
                if (activity != null) {
                    ((IActivityResult) activity).getF28604i().f(intent, new b(this, 26));
                }
            }
        }
    }
}
