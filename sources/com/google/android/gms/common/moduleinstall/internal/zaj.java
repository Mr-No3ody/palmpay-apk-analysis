package com.google.android.gms.common.moduleinstall.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zaj extends zaa {
    final /* synthetic */ TaskCompletionSource zaa;

    public zaj(zay zayVar, TaskCompletionSource taskCompletionSource) {
        this.zaa = taskCompletionSource;
        Objects.requireNonNull(zayVar);
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zab(Status status, @Nullable ModuleAvailabilityResponse moduleAvailabilityResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleAvailabilityResponse, this.zaa);
    }
}
