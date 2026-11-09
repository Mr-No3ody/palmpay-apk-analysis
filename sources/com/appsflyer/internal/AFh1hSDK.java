package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1hSDK extends AFh1iSDK {
    public AFh1hSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final AFe1nSDK getCurrencyIso4217Code() {
        return AFe1nSDK.PURCHASE_VALIDATE;
    }
}
