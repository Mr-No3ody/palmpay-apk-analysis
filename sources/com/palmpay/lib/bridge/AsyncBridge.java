package com.palmpay.lib.bridge;

import Sd.b;
import com.google.gson.Gson;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/palmpay/lib/bridge/AsyncBridge;", "T", "Lcom/palmpay/lib/bridge/BaseBridge;", "()V", "execute", "", "gson", "Lcom/google/gson/Gson;", "lib_bridge_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AsyncBridge<T> extends BaseBridge<T> {
    @Override // com.palmpay.lib.bridge.BaseBridge, com.palmpay.lib.bridge.IBridge
    public void execute(@Nullable Gson gson) {
        try {
            onHandle(parseArgs(gson), new b(this, 18));
        } catch (Throwable th) {
            handleFail(th);
        }
    }
}
