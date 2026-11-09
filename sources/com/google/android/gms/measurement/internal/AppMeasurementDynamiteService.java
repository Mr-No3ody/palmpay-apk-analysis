package com.google.android.gms.measurement.internal;

import M.f;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzco {

    @VisibleForTesting
    zzic zza = null;

    @GuardedBy("listenerMap")
    private final Map zzb = new f(0);

    @EnsuresNonNull({"scion"})
    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcs zzcsVar, String str) {
        zzb();
        this.zza.zzk().zzao(zzcsVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void beginAdUnitExposure(@NonNull String str, long j6) throws RemoteException {
        zzb();
        this.zza.zzw().zza(str, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        zzb();
        this.zza.zzj().zzaa(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void clearMeasurementEnabled(long j6) throws RemoteException {
        zzb();
        this.zza.zzj().zzn(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void endAdUnitExposure(@NonNull String str, long j6) throws RemoteException {
        zzb();
        this.zza.zzw().zzb(str, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void generateEventId(com.google.android.gms.internal.measurement.zzcs zzcsVar) throws RemoteException {
        zzb();
        long jZzd = this.zza.zzk().zzd();
        zzb();
        this.zza.zzk().zzap(zzcsVar, jZzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcs zzcsVar) throws RemoteException {
        zzb();
        this.zza.zzaX().zzj(new zzi(this, zzcsVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcs zzcsVar) throws RemoteException {
        zzb();
        zzc(zzcsVar, this.zza.zzj().zzP());
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcs zzcsVar) throws RemoteException {
        zzb();
        this.zza.zzaX().zzj(new zzm(this, zzcsVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcs zzcsVar) throws RemoteException {
        zzb();
        zzc(zzcsVar, this.zza.zzj().zzad());
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcs zzcsVar) throws RemoteException {
        zzb();
        zzc(zzcsVar, this.zza.zzj().zzac());
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcs zzcsVar) throws RemoteException {
        zzb();
        zzc(zzcsVar, this.zza.zzj().zzae());
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcs zzcsVar) throws RemoteException {
        zzb();
        this.zza.zzj().zzX(str);
        zzb();
        this.zza.zzk().zzaq(zzcsVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getSessionId(com.google.android.gms.internal.measurement.zzcs zzcsVar) throws RemoteException {
        zzb();
        zzlj zzljVarZzj = this.zza.zzj();
        zzljVarZzj.zzu.zzaX().zzj(new zzkm(zzljVarZzj, zzcsVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcs zzcsVar, int i7) throws RemoteException {
        zzb();
        if (i7 == 0) {
            this.zza.zzk().zzao(zzcsVar, this.zza.zzj().zzj());
            return;
        }
        if (i7 == 1) {
            this.zza.zzk().zzap(zzcsVar, this.zza.zzj().zzk().longValue());
            return;
        }
        if (i7 != 2) {
            if (i7 == 3) {
                this.zza.zzk().zzaq(zzcsVar, this.zza.zzj().zzl().intValue());
                return;
            } else {
                if (i7 != 4) {
                    return;
                }
                this.zza.zzk().zzas(zzcsVar, this.zza.zzj().zzi().booleanValue());
                return;
            }
        }
        zzpp zzppVarZzk = this.zza.zzk();
        double dDoubleValue = this.zza.zzj().zzm().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e10) {
            zzppVarZzk.zzu.zzaW().zze().zzb("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getUserProperties(String str, String str2, boolean z3, com.google.android.gms.internal.measurement.zzcs zzcsVar) throws RemoteException {
        zzb();
        this.zza.zzaX().zzj(new zzk(this, zzcsVar, str, str2, z3));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void initForTests(@NonNull Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdb zzdbVar, long j6) throws RemoteException {
        zzic zzicVar = this.zza;
        if (zzicVar == null) {
            this.zza = zzic.zzy((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzdbVar, Long.valueOf(j6), null);
        } else {
            d.t(zzicVar, "Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void initializeWithElapsedTime(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdb zzdbVar, long j6, long j10) {
        zzic zzicVar = this.zza;
        if (zzicVar == null) {
            this.zza = zzic.zzy((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzdbVar, Long.valueOf(j6), Long.valueOf(j10));
        } else {
            d.t(zzicVar, "Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcs zzcsVar) throws RemoteException {
        zzb();
        this.zza.zzaX().zzj(new zzn(this, zzcsVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z3, boolean z8, long j6) throws RemoteException {
        zzb();
        this.zza.zzj().zzB(str, str2, bundle, z3, z8, j6, 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcs zzcsVar, long j6) throws RemoteException {
        zzb();
        Preconditions.checkNotEmpty(str2);
        String str3 = true != this.zza.zzc().zzp(null, zzfy.zzbf) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        this.zza.zzaX().zzj(new zzj(this, zzcsVar, new zzbh(str2, new zzbf(bundle), str3, j6, 0L), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logEventWithElapsedTime(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z3, boolean z8, long j6, long j10) throws RemoteException {
        zzb();
        this.zza.zzj().zzB(str, str2, bundle, z3, z8, j6, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logHealthData(int i7, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
        zzb();
        this.zza.zzaW().zzm(i7, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j6) throws RemoteException {
        zzb();
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), bundle, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, Bundle bundle, long j6) {
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        if (zzkyVar != null) {
            this.zza.zzj().zzh();
            zzkyVar.zza(zzddVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j6) throws RemoteException {
        zzb();
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, long j6) throws RemoteException {
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        if (zzkyVar != null) {
            this.zza.zzj().zzh();
            zzkyVar.zzb(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j6) throws RemoteException {
        zzb();
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, long j6) throws RemoteException {
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        if (zzkyVar != null) {
            this.zza.zzj().zzh();
            zzkyVar.zzc(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j6) throws RemoteException {
        zzb();
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, long j6) throws RemoteException {
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        if (zzkyVar != null) {
            this.zza.zzj().zzh();
            zzkyVar.zzd(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcs zzcsVar, long j6) throws RemoteException {
        zzb();
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), zzcsVar, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, com.google.android.gms.internal.measurement.zzcs zzcsVar, long j6) throws RemoteException {
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        Bundle bundle = new Bundle();
        if (zzkyVar != null) {
            this.zza.zzj().zzh();
            zzkyVar.zze(zzddVar, bundle);
        }
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.zza.zzaW().zze().zzb("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j6) throws RemoteException {
        zzb();
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, long j6) throws RemoteException {
        zzb();
        if (this.zza.zzj().zza != null) {
            this.zza.zzj().zzh();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j6) throws RemoteException {
        zzb();
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, long j6) throws RemoteException {
        zzb();
        if (this.zza.zzj().zza != null) {
            this.zza.zzj().zzh();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcs zzcsVar, long j6) throws RemoteException {
        zzb();
        zzcsVar.zzb(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzjq zzqVar;
        zzb();
        Map map = this.zzb;
        synchronized (map) {
            try {
                zzqVar = (zzjq) map.get(Integer.valueOf(zzcyVar.zzf()));
                if (zzqVar == null) {
                    zzqVar = new zzq(this, zzcyVar);
                    map.put(Integer.valueOf(zzcyVar.zzf()), zzqVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zza.zzj().zzV(zzqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    @Deprecated
    public void resetAnalyticsData(long j6) throws RemoteException {
        zzb();
        this.zza.zzj().zzS(j6, 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void resetAnalyticsDataWithElapsedTime(long j6, long j10) throws RemoteException {
        zzb();
        this.zza.zzj().zzS(j6, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.zzcv zzcvVar) {
        zzb();
        this.zza.zzj().zzt(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzcvVar.zze();
                } catch (RemoteException e10) {
                    ((zzic) Preconditions.checkNotNull(this.zza.zza)).zzaW().zze().zzb("Failed to call IDynamiteUploadBatchesCallback", e10);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j6) throws RemoteException {
        zzb();
        if (bundle == null) {
            d.r(this.zza, "Conditional user property must not be null");
        } else {
            this.zza.zzj().zzZ(bundle, j6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setConsent(@NonNull Bundle bundle, long j6) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setConsentThirdParty(@NonNull Bundle bundle, long j6) throws RemoteException {
        zzb();
        this.zza.zzj().zzp(bundle, -20, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j6) throws RemoteException {
        zzb();
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), str, str2, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd zzddVar, String str, String str2, long j6) throws RemoteException {
        zzb();
        this.zza.zzs().zzk(zzddVar, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setDataCollectionEnabled(boolean z3) throws RemoteException {
        zzb();
        zzlj zzljVarZzj = this.zza.zzj();
        zzljVarZzj.zzb();
        zzljVarZzj.zzu.zzaX().zzj(new zzjy(zzljVarZzj, z3));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        zzb();
        final zzlj zzljVarZzj = this.zza.zzj();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzljVarZzj.zzu.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzljVarZzj.zzag(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        zzp zzpVar = new zzp(this, zzcyVar);
        if (this.zza.zzaX().zze()) {
            this.zza.zzj().zzU(zzpVar);
        } else {
            this.zza.zzaX().zzj(new zzl(this, zzpVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzda zzdaVar) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setMeasurementEnabled(boolean z3, long j6) throws RemoteException {
        zzb();
        this.zza.zzj().zzn(Boolean.valueOf(z3));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setMinimumSessionDuration(long j6) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setSessionTimeoutDuration(long j6) throws RemoteException {
        zzb();
        zzlj zzljVarZzj = this.zza.zzj();
        zzljVarZzj.zzu.zzaX().zzj(new zzka(zzljVarZzj, j6));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        zzb();
        zzlj zzljVarZzj = this.zza.zzj();
        Uri data = intent.getData();
        if (data == null) {
            zzljVarZzj.zzu.zzaW().zzi().zza("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            zzic zzicVar = zzljVarZzj.zzu;
            zzicVar.zzaW().zzi().zza("[sgtm] Preview Mode was not enabled.");
            zzicVar.zzc().zzy(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            zzic zzicVar2 = zzljVarZzj.zzu;
            zzicVar2.zzaW().zzi().zzb("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            zzicVar2.zzc().zzy(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setUserId(@NonNull final String str, long j6) throws RemoteException {
        zzb();
        final zzlj zzljVarZzj = this.zza.zzj();
        if (str != null && TextUtils.isEmpty(str)) {
            d.t(zzljVarZzj.zzu, "User ID must be non-empty or null");
        } else {
            zzljVarZzj.zzu.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzic zzicVar = zzljVarZzj.zzu;
                    if (zzicVar.zzv().zzq(str)) {
                        zzicVar.zzv().zzi();
                    }
                }
            });
            zzljVarZzj.zzK(null, "_id", str, true, j6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z3, long j6) throws RemoteException {
        zzb();
        this.zza.zzj().zzK(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z3, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzjq zzqVar;
        zzb();
        Map map = this.zzb;
        synchronized (map) {
            zzqVar = (zzjq) map.remove(Integer.valueOf(zzcyVar.zzf()));
        }
        if (zzqVar == null) {
            zzqVar = new zzq(this, zzcyVar);
        }
        this.zza.zzj().zzW(zzqVar);
    }
}
