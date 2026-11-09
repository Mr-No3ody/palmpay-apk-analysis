package com.transsnet.palmpay.core.location.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface ProcessType {
    public static final int ASKING_PERMISSIONS = 1;
    public static final int GETTING_LOCATION_FROM_GOOGLE_PLAY_SERVICES = 2;
    public static final int GETTING_LOCATION_FROM_GPS_PROVIDER = 3;
    public static final int GETTING_LOCATION_FROM_NETWORK_PROVIDER = 4;
}
