package com.transsnet.palmpay.core.rnbridge.bridge;

import C0.G;
import F6.d;
import Pa.n0;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.bean.LogEventData;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/logEvent/upload"}, function = {IBridge.class, IBridge.class}, priority = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J2\u0010\n\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/LogEventBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/core/bean/LogEventData;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "getMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "jsonString", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LogEventBridge extends SyncBridge<LogEventData> {
    private final HashMap<String, Object> getMap(String jsonString) {
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            HashMap<String, Object> map = new HashMap<>();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Any");
                map.put(next, obj);
            }
            return map;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable LogEventData params, @Nullable IBridgeCallback callback) {
        String str;
        d.h("LogEventBridge", 3, G.o("key: ", params != null ? params.eventId : null));
        if (params == null || (str = params.eventId) == null) {
            return;
        }
        n0.g().r(str, getMap(params.eventDataValue));
    }
}
