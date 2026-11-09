package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class PendingResults {
    private PendingResults() {
    }

    @NonNull
    public static PendingResult<Status> canceledPendingResult() {
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result> PendingResult<R> immediateFailedResult(@NonNull R r3, @NonNull GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r3, "Result must not be null");
        Preconditions.checkArgument(!r3.getStatus().isSuccess(), "Status code must not be SUCCESS");
        zad zadVar = new zad(googleApiClient, r3);
        zadVar.setResult(r3);
        return zadVar;
    }

    @NonNull
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(@NonNull R r3) {
        Preconditions.checkNotNull(r3, "Result must not be null");
        zae zaeVar = new zae(null);
        zaeVar.setResult(r3);
        return new OptionalPendingResultImpl(zaeVar);
    }

    @NonNull
    public static <R extends Result> PendingResult<R> canceledPendingResult(@NonNull R r3) {
        Preconditions.checkNotNull(r3, "Result must not be null");
        Preconditions.checkArgument(r3.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        zac zacVar = new zac(r3);
        zacVar.cancel();
        return zacVar;
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(@NonNull R r3, @NonNull GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r3, "Result must not be null");
        zae zaeVar = new zae(googleApiClient);
        zaeVar.setResult(r3);
        return new OptionalPendingResultImpl(zaeVar);
    }

    @NonNull
    public static PendingResult<Status> immediatePendingResult(@NonNull Status status) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    @NonNull
    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(@NonNull Status status, @NonNull GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}
