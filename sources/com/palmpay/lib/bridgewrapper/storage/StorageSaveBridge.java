package com.palmpay.lib.bridgewrapper.storage;

import com.didi.drouter.annotation.Service;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.bridge.AsyncBridge;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.param.BridgeRequestParam;
import com.palmpay.lib.bridge.param.StorageParam;
import com.tencent.mmkv.MMKV;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/storage/save", "/preferences/set"}, function = {IBridge.class, IBridge.class})
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/storage/StorageSaveBridge;", "Lcom/palmpay/lib/bridge/AsyncBridge;", "Lcom/palmpay/lib/bridge/param/StorageParam;", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "parseArgs", "gson", "Lcom/google/gson/Gson;", "saveStorage", "key", "", "value", "", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class StorageSaveBridge extends AsyncBridge<StorageParam> {
    public void saveStorage(@Nullable String key, @Nullable Object value) {
        Unit unit;
        if (key != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            d.N(MMKV.e(), key, value);
            handleSuccess();
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            handleIllegalArgument("key is empty");
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable StorageParam params, @Nullable IBridgeCallback callback) {
        Unit unit;
        if (params != null) {
            saveStorage(params.getKey(), params.getValue());
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            BaseBridge.handleIllegalArgument$default(this, null, 1, null);
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    @Nullable
    public StorageParam parseArgs(@Nullable Gson gson) {
        if (gson == null) {
            return null;
        }
        BridgeRequestParam request = getRequest();
        return (StorageParam) gson.fromJson((JsonElement) (request != null ? request.getArgs() : null), StorageParam.class);
    }
}
