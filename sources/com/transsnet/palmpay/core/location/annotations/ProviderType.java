package com.transsnet.palmpay.core.location.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface ProviderType {
    public static final int DEFAULT_PROVIDERS = 4;
    public static final int GOOGLE_PLAY_SERVICES = 1;
    public static final int GPS = 2;
    public static final int NETWORK = 3;
    public static final int NONE = 0;
}
