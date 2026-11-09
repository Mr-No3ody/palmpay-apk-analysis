package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class zaby implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    @VisibleForTesting
    public zaby(GoogleApiManager googleApiManager, int i7, ApiKey apiKey, long j6, long j10, @Nullable String str, @Nullable String str2) {
        this.zaa = googleApiManager;
        this.zab = i7;
        this.zac = apiKey;
        this.zad = j6;
        this.zae = j10;
    }

    @Nullable
    public static zaby zaa(GoogleApiManager googleApiManager, int i7, ApiKey apiKey) {
        boolean methodTimingTelemetryEnabled;
        if (!googleApiManager.zam()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            methodTimingTelemetryEnabled = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            methodTimingTelemetryEnabled = config.getMethodTimingTelemetryEnabled();
            zabk zabkVarZag = googleApiManager.zag(apiKey);
            if (zabkVarZag != null) {
                if (!(zabkVarZag.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zabkVarZag.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationZab = zab(zabkVarZag, baseGmsClient, i7);
                    if (connectionTelemetryConfigurationZab == null) {
                        return null;
                    }
                    zabkVarZag.zas();
                    methodTimingTelemetryEnabled = connectionTelemetryConfigurationZab.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new zaby(googleApiManager, i7, apiKey, methodTimingTelemetryEnabled ? System.currentTimeMillis() : 0L, methodTimingTelemetryEnabled ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    @Nullable
    private static ConnectionTelemetryConfiguration zab(zabk zabkVar, BaseGmsClient baseGmsClient, int i7) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i7) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i7))) || zabkVar.zar() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @WorkerThread
    public final void onComplete(@NonNull Task task) {
        zabk zabkVarZag;
        int version;
        int i7;
        int i10;
        int statusCode;
        int errorCode;
        int i11;
        long j6;
        long j10;
        int iElapsedRealtime;
        GoogleApiManager googleApiManager = this.zaa;
        if (googleApiManager.zam()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zabkVarZag = googleApiManager.zag(this.zac)) != null && (zabkVarZag.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zabkVarZag.zaf();
                long j11 = this.zad;
                boolean methodTimingTelemetryEnabled = j11 > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    methodTimingTelemetryEnabled &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    version = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationZab = zab(zabkVarZag, baseGmsClient, this.zab);
                        if (connectionTelemetryConfigurationZab == null) {
                            return;
                        }
                        boolean z3 = connectionTelemetryConfigurationZab.getMethodTimingTelemetryEnabled() && j11 > 0;
                        maxMethodInvocationsInBatch = connectionTelemetryConfigurationZab.getMaxMethodInvocationsLogged();
                        methodTimingTelemetryEnabled = z3;
                    }
                    i10 = batchPeriodMillis;
                    i7 = maxMethodInvocationsInBatch;
                } else {
                    j11 = j11;
                    version = 0;
                    i7 = 100;
                    i10 = 5000;
                }
                if (task.isSuccessful()) {
                    i11 = 0;
                    errorCode = 0;
                } else if (task.isCanceled()) {
                    errorCode = -1;
                    i11 = 100;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof ApiException) {
                        Status status = ((ApiException) exception).getStatus();
                        statusCode = status.getStatusCode();
                        ConnectionResult connectionResult = status.getConnectionResult();
                        if (connectionResult != null) {
                            errorCode = connectionResult.getErrorCode();
                        }
                        i11 = statusCode;
                    } else {
                        statusCode = 101;
                    }
                    errorCode = -1;
                    i11 = statusCode;
                }
                if (methodTimingTelemetryEnabled) {
                    long j12 = this.zae;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    j6 = j11;
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j12);
                    j10 = jCurrentTimeMillis;
                } else {
                    j6 = 0;
                    j10 = 0;
                    iElapsedRealtime = -1;
                }
                googleApiManager.zar(new MethodInvocation(this.zab, i11, errorCode, j6, j10, null, null, gCoreServiceId, iElapsedRealtime), version, i10, i7);
            }
        }
    }
}
