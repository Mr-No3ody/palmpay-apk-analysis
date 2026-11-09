package com.transsnet.palmpay.core.rnbridge.bridge;

import F6.d;
import Pa.o0;
import Pa.p0;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.adsdk.b;
import com.transsnet.palmpay.common.export.bean.req.SystemContactReq;
import com.transsnet.palmpay.core.activityresult.IActivityResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/contact/pick"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/SystemContactBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/common/export/bean/req/SystemContactReq;", "<init>", "()V", "onHandle", "", "req", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "Companion", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSystemContactBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemContactBridge.kt\ncom/transsnet/palmpay/core/rnbridge/bridge/SystemContactBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class SystemContactBridge extends SyncBridge<SystemContactReq> {

    @NotNull
    public static final String TAG = "SystemContactBridge";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHandle$lambda$5$lambda$4(SystemContactBridge systemContactBridge, Activity activity, int i7, Intent intent) throws JSONException {
        String string;
        if (i7 != -1) {
            if (i7 != 0) {
                d.h(TAG, 3, "handleReject-----------");
                systemContactBridge.handleReject("Something wrong");
                return;
            } else {
                d.h(TAG, 3, "handleCancel-----------");
                BaseBridge.handleCancel$default(systemContactBridge, null, 1, null);
                return;
            }
        }
        Uri data = intent != null ? intent.getData() : null;
        if (data != null) {
            JSONObject jSONObject = new JSONObject();
            o0 o0Var = p0.f7134a;
            jSONObject.put("name", o0Var.retrieveContactName(activity, data));
            jSONObject.put("phone", o0Var.retrieveContactPhone(activity, data));
            string = jSONObject.toString();
        } else {
            string = null;
        }
        BaseBridge.handleSuccess$default(systemContactBridge, string, null, 2, null);
        d.h(TAG, 3, "handleSuccess-----------");
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable SystemContactReq req, @Nullable IBridgeCallback callback) {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("vnd.android.cursor.dir/phone_v2");
        Activity activity = getActivity();
        if (activity != null) {
            if (!(activity instanceof IActivityResult)) {
                activity = null;
            }
            if (activity != null) {
                ((IActivityResult) activity).getF28604i().f(intent, new b(5, this, activity));
            }
        }
    }
}
