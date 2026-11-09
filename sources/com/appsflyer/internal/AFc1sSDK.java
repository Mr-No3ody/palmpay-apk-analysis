package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1sSDK {

    @NotNull
    final List<AFc1tSDK> getRevenue;

    public AFc1sSDK(@NotNull List<AFc1tSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.getRevenue = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1sSDK) && Intrinsics.c(this.getRevenue, ((AFc1sSDK) obj).getRevenue);
    }

    public final int hashCode() {
        return this.getRevenue.hashCode();
    }

    @NotNull
    public final String toString() {
        return "StorageConfig(typeEntries=" + this.getRevenue + ")";
    }
}
