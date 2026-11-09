package com.transsnet.palmpay.core.rnbridge.bridge;

import Pa.F;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import com.didi.drouter.annotation.Service;
import com.google.firebase.crashlytics.internal.concurrency.b;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.common.export.bean.req.AuthorizationReq;
import com.transsnet.palmpay.common.export.bean.req.AuthorizationTokenReq;
import com.transsnet.palmpay.core.activityresult.IActivityResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p038ca.e;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/verification/start"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/AuthorizationBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/common/export/bean/req/AuthorizationReq;", "<init>", "()V", "onHandle", "", "req", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthorizationBridge extends SyncBridge<AuthorizationReq> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHandle$lambda$1(AuthorizationBridge authorizationBridge, int i7, Intent intent) {
        if (i7 != -1) {
            if (i7 != 0) {
                authorizationBridge.handleReject("Something wrong");
                return;
            } else {
                BaseBridge.handleCancel$default(authorizationBridge, null, 1, null);
                return;
            }
        }
        String stringExtra = intent != null ? intent.getStringExtra("extra_data") : null;
        AuthorizationTokenReq authorizationTokenReq = new AuthorizationTokenReq();
        authorizationTokenReq.token = stringExtra;
        BaseBridge.handleSuccess$default(authorizationBridge, authorizationTokenReq, null, 2, null);
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable AuthorizationReq req, @Nullable IBridgeCallback callback) {
        String str;
        Intent intentA;
        e f28604i;
        if (req == null || (str = req.flowCode) == null || str.length() == 0 || (intentA = F.a(getActivity(), "/account/verifyAccount")) == null) {
            return;
        }
        intentA.putExtra("extra_type", str);
        ComponentCallbacks2 activity = getActivity();
        IActivityResult iActivityResult = activity instanceof IActivityResult ? (IActivityResult) activity : null;
        if (iActivityResult == null || (f28604i = iActivityResult.getF28604i()) == null) {
            return;
        }
        f28604i.f(intentA, new b(this, 24));
    }
}
