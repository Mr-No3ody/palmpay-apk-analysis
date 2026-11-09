package com.google.android.play.core.appupdate;

import androidx.annotation.NonNull;
import com.google.android.play.core.install.model.AppUpdateType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AppUpdateOptions {

    public static abstract class Builder {
        @NonNull
        public abstract AppUpdateOptions build();

        @NonNull
        public abstract Builder setAllowAssetPackDeletion(boolean z3);

        @NonNull
        public abstract Builder setAppUpdateType(@AppUpdateType int i7);
    }

    @NonNull
    public static AppUpdateOptions defaultOptions(@AppUpdateType int i7) {
        return newBuilder(i7).build();
    }

    @NonNull
    public static Builder newBuilder(@AppUpdateType int i7) {
        zzv zzvVar = new zzv();
        zzvVar.setAppUpdateType(i7);
        zzvVar.setAllowAssetPackDeletion(false);
        return zzvVar;
    }

    public abstract boolean allowAssetPackDeletion();

    @AppUpdateType
    public abstract int appUpdateType();
}
