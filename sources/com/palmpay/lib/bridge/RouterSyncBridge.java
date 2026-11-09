package com.palmpay.lib.bridge;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.palmpay.lib.bridge.param.BridgeRequestParam;
import com.palmpay.lib.bridge.param.PathParam;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/palmpay/lib/bridge/RouterSyncBridge;", "T", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/palmpay/lib/bridge/param/PathParam;", "()V", "parseArgs", "gson", "Lcom/google/gson/Gson;", "lib_bridge_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class RouterSyncBridge<T> extends SyncBridge<PathParam> {
    @Override // com.palmpay.lib.bridge.BaseBridge
    @Nullable
    public PathParam parseArgs(@Nullable Gson gson) {
        if (gson == null) {
            return null;
        }
        BridgeRequestParam request = getRequest();
        return (PathParam) gson.fromJson((JsonElement) (request != null ? request.getArgs() : null), (Class) PathParam.class);
    }
}
