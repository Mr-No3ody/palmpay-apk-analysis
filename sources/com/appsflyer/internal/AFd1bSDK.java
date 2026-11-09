package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public class AFd1bSDK {
    public final long getCurrencyIso4217Code;

    public AFd1bSDK(long j6) {
        this.getCurrencyIso4217Code = j6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getCurrencyIso4217Code == ((AFd1bSDK) obj).getCurrencyIso4217Code;
    }

    public int hashCode() {
        long j6 = this.getCurrencyIso4217Code;
        return (int) (j6 ^ (j6 >>> 32));
    }
}
