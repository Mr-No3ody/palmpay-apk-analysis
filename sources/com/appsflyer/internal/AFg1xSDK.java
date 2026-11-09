package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFg1xSDK {

    public static final class AFa1uSDK {

        @Nullable
        final String getCurrencyIso4217Code;
        final float getRevenue;

        public AFa1uSDK(float f10, @Nullable String str) {
            this.getRevenue = f10;
            this.getCurrencyIso4217Code = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Float.compare(this.getRevenue, aFa1uSDK.getRevenue) == 0 && Intrinsics.c(this.getCurrencyIso4217Code, aFa1uSDK.getCurrencyIso4217Code);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.getRevenue) * 31;
            String str = this.getCurrencyIso4217Code;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            return "BatteryData(level=" + this.getRevenue + ", charging=" + this.getCurrencyIso4217Code + ")";
        }
    }

    @NotNull
    AFa1uSDK getRevenue(@NotNull Context context);
}
