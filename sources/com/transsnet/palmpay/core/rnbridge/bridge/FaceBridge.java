package com.transsnet.palmpay.core.rnbridge.bridge;

import Pa.C0525w;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.text.TextUtils;
import com.didi.drouter.annotation.Service;
import com.google.gson.Gson;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.adsdk.b;
import com.transsnet.palmpay.common.export.bean.req.FaceTokenReq;
import com.transsnet.palmpay.common.export.bean.resp.FaceTokenRsp;
import com.transsnet.palmpay.core.activityresult.IActivityResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/faceCapture/open"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/FaceBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/common/export/bean/req/FaceTokenReq;", "<init>", "()V", "onHandle", "", "req", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FaceBridge extends SyncBridge<FaceTokenReq> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHandle$lambda$5$lambda$4$lambda$3(FaceBridge faceBridge, FaceTokenReq faceTokenReq, int i7, Intent intent) {
        if (i7 != -1) {
            if (i7 != 0) {
                faceBridge.handleReject("Something wrong");
                return;
            } else {
                BaseBridge.handleCancel$default(faceBridge, null, 1, null);
                return;
            }
        }
        FaceTokenRsp faceTokenRsp = new FaceTokenRsp();
        faceTokenRsp.faceToken = intent != null ? intent.getStringExtra("extra_data") : null;
        faceTokenRsp.imageURL = intent != null ? intent.getStringExtra("linkUrl") : null;
        faceTokenRsp.status = 1;
        faceTokenRsp.scene = faceTokenReq.scene;
        BaseBridge.handleSuccess$default(faceBridge, faceTokenRsp, null, 2, null);
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable FaceTokenReq req, @Nullable IBridgeCallback callback) {
        String packageName;
        if (req != null) {
            Intent intent = new Intent();
            Activity activity = getActivity();
            if (activity != null && (packageName = activity.getPackageName()) != null) {
                intent.setClassName(packageName, "com.transsnet.palmpay.ui.activity.palmsafe.PalmSafeScanFaceActivity");
            }
            try {
                String scene = req.scene;
                Intrinsics.checkNotNullExpressionValue(scene, "scene");
                Intrinsics.e(intent.putExtra("extra_type", Integer.parseInt(scene)));
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(req.extendInfo)) {
                intent.putExtra("business_data", ((Gson) C0525w.f().f7166b).toJson(req));
            } else {
                intent.putExtra("business_data", req.extendInfo);
            }
            intent.putExtra("extra_flag", req.style);
            intent.putExtra("extra_data", req.needErrorHandler);
            ComponentCallbacks2 activity2 = getActivity();
            if (activity2 != null) {
                if (!(activity2 instanceof IActivityResult)) {
                    activity2 = null;
                }
                if (activity2 != null) {
                    ((IActivityResult) activity2).getF28604i().f(intent, new b(4, this, req));
                }
            }
        }
    }
}
