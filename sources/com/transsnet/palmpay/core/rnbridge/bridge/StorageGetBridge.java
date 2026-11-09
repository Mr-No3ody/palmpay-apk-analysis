package com.transsnet.palmpay.core.rnbridge.bridge;

import com.didi.drouter.annotation.Service;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.bridge.IBridge;
import com.tencent.mmkv.MMKV;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/storage/get", "/preferences/get"}, function = {IBridge.class, IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/StorageGetBridge;", "Lcom/palmpay/lib/bridgewrapper/storage/StorageGetBridge;", "<init>", "()V", "getStorage", "", "key", "", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StorageGetBridge extends com.palmpay.lib.bridgewrapper.storage.StorageGetBridge {
    @Override // com.palmpay.lib.bridgewrapper.storage.StorageGetBridge
    @Nullable
    public Object getStorage(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iHashCode = key.hashCode();
        if (iHashCode != -107758494) {
            if (iHashCode != 1290649060) {
                if (iHashCode == 2110841315 && key.equals("enableBioPay")) {
                    return Boolean.valueOf(n.x());
                }
            } else if (key.equals("enableBioLogin")) {
                return Boolean.valueOf(n.v());
            }
        } else if (key.equals("bioType")) {
            return 1;
        }
        MMKV mmkv = p367ya.a.d().f44149a;
        Intrinsics.checkNotNullParameter(mmkv, "mmkv");
        Intrinsics.checkNotNullParameter(key, "key");
        return d.m(mmkv, key);
    }
}
