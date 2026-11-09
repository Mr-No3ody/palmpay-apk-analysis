package com.palmpay.lib.bridge;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.palmpay.lib.bridge.param.BridgeRequestParam;
import com.palmpay.lib.bridge.param.StorageParam;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/palmpay/lib/bridge/StringStorageAsyncBridge;", "T", "Lcom/palmpay/lib/bridge/AsyncBridge;", "", "()V", "parseArgs", "gson", "Lcom/google/gson/Gson;", "lib_bridge_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class StringStorageAsyncBridge<T> extends AsyncBridge<String> {
    @Override // com.palmpay.lib.bridge.BaseBridge
    @Nullable
    public String parseArgs(@Nullable Gson gson) {
        if (gson != null) {
            BridgeRequestParam request = getRequest();
            StorageParam storageParam = (StorageParam) gson.fromJson((JsonElement) (request != null ? request.getArgs() : null), (Class) StorageParam.class);
            if (storageParam != null) {
                return storageParam.getKey();
            }
        }
        return null;
    }
}
