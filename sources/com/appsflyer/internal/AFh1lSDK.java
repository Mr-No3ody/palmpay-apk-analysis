package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1lSDK extends AFh1qSDK {
    @Override // com.appsflyer.internal.AFh1qSDK
    public final boolean areAllFieldsValid() {
        return true;
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final AFe1nSDK getCurrencyIso4217Code() {
        return this.areAllFieldsValid == 1 ? AFe1nSDK.CONVERSION : AFe1nSDK.LAUNCH;
    }
}
