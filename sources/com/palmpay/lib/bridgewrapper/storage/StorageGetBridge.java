package com.palmpay.lib.bridgewrapper.storage;

import com.didi.drouter.annotation.Service;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.StringStorageAsyncBridge;
import com.tencent.mmkv.MMKV;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/storage/get", "/preferences/get"}, function = {IBridge.class, IBridge.class})
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\f"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/storage/StorageGetBridge;", "Lcom/palmpay/lib/bridge/StringStorageAsyncBridge;", "", "()V", "getStorage", "", "key", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class StorageGetBridge extends StringStorageAsyncBridge<String> {
    @Nullable
    public Object getStorage(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return d.m(MMKV.e(), key);
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable String params, @Nullable IBridgeCallback callback) {
        Unit unit;
        if (params != null) {
            BaseBridge.handleSuccess$default(this, getStorage(params), null, 2, null);
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            BaseBridge.handleIllegalArgument$default(this, null, 1, null);
        }
    }
}
