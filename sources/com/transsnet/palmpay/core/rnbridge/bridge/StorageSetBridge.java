package com.transsnet.palmpay.core.rnbridge.bridge;

import com.didi.drouter.annotation.Service;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridgewrapper.storage.StorageSaveBridge;
import com.tencent.mmkv.MMKV;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/storage/save", "/preferences/set"}, function = {IBridge.class, IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/StorageSetBridge;", "Lcom/palmpay/lib/bridgewrapper/storage/StorageSaveBridge;", "<init>", "()V", "saveStorage", "", "key", "", "value", "", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StorageSetBridge extends StorageSaveBridge {
    @Override // com.palmpay.lib.bridgewrapper.storage.StorageSaveBridge
    public void saveStorage(@Nullable String key, @Nullable Object value) {
        MMKV mmkv = p367ya.a.d().f44149a;
        Intrinsics.checkNotNullParameter(mmkv, "mmkv");
        Intrinsics.checkNotNullParameter(key, "key");
        d.N(mmkv, key, value);
    }
}
