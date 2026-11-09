package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFh1mSDK extends AFh1qSDK {
    private final boolean copy;
    private final boolean hashCode;

    public AFh1mSDK() {
        this(null, null, null);
    }

    public AFh1mSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.hashCode = bool != null ? bool.booleanValue() : true;
        this.copy = true;
    }
}
