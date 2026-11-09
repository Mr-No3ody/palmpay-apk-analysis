package com.appsflyer.internal;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1kSDK extends AFh1qSDK {

    @Nullable
    public final AFe1nSDK copydefault;

    @Deprecated
    public AFh1kSDK() {
        this.copydefault = null;
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final AFe1nSDK getCurrencyIso4217Code() {
        AFe1nSDK aFe1nSDK = this.copydefault;
        return aFe1nSDK != null ? aFe1nSDK : AFe1nSDK.CACHED_EVENT;
    }

    public AFh1kSDK(String str, byte[] bArr, String str2, @Nullable AFe1nSDK aFe1nSDK, @Nullable Map<String, String> map) {
        super(null, str, Boolean.FALSE);
        this.component3 = str2;
        getCurrencyIso4217Code(bArr);
        this.copydefault = aFe1nSDK;
        if (map != null) {
            this.getMonetizationNetwork.putAll(map);
        }
    }
}
