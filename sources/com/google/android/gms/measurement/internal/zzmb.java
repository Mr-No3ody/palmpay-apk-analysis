package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.maps.android.BuildConfig;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmb extends zzg {

    @VisibleForTesting
    protected zzlu zza;
    private volatile zzlu zzb;
    private volatile zzlu zzc;
    private final Map zzd;

    @GuardedBy("activityLock")
    private com.google.android.gms.internal.measurement.zzdd zze;

    @GuardedBy("activityLock")
    private volatile boolean zzf;
    private volatile zzlu zzg;
    private zzlu zzh;

    @GuardedBy("activityLock")
    private boolean zzi;
    private final Object zzj;

    public zzmb(zzic zzicVar) {
        super(zzicVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    @MainThread
    private final void zzx(String str, zzlu zzluVar, boolean z3) {
        zzlu zzluVar2 = zzluVar;
        zzlu zzluVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzluVar2.zzb == null) {
            zzluVar2 = new zzlu(zzluVar2.zza, str != null ? zzi(str, "Activity") : null, zzluVar2.zzc, zzluVar2.zze, zzluVar2.zzf, zzluVar2.zzg);
        }
        this.zzc = this.zzb;
        this.zzb = zzluVar2;
        zzic zzicVar = this.zzu;
        zzicVar.zzaX().zzj(new zzlw(this, zzluVar2, zzluVar3, zzicVar.zzba().elapsedRealtime(), z3));
    }

    @WorkerThread
    private final void zzy(zzlu zzluVar, boolean z3, long j6) {
        zzic zzicVar = this.zzu;
        zzicVar.zzw().zzc(zzicVar.zzba().elapsedRealtime());
        if (!zzicVar.zzh().zzb.zzd(zzluVar != null && zzluVar.zzd, z3, j6) || zzluVar == null) {
            return;
        }
        zzluVar.zzd = false;
    }

    @MainThread
    private final zzlu zzz(@NonNull com.google.android.gms.internal.measurement.zzdd zzddVar) {
        Preconditions.checkNotNull(zzddVar);
        Integer numValueOf = Integer.valueOf(zzddVar.zza);
        Map map = this.zzd;
        zzlu zzluVar = (zzlu) map.get(numValueOf);
        if (zzluVar == null) {
            zzlu zzluVar2 = new zzlu(null, zzi(zzddVar.zzb, "Activity"), this.zzu.zzk().zzd());
            map.put(numValueOf, zzluVar2);
            zzluVar = zzluVar2;
        }
        return this.zzg != null ? this.zzg : zzluVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    @WorkerThread
    public final zzlu zzh(boolean z3) {
        zzb();
        zzg();
        if (!z3) {
            return this.zza;
        }
        zzlu zzluVar = this.zza;
        return zzluVar != null ? zzluVar : this.zzh;
    }

    @VisibleForTesting
    public final String zzi(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        zzic zzicVar = this.zzu;
        return str3.length() > zzicVar.zzc().zze(null, false) ? str3.substring(0, zzicVar.zzc().zze(null, false)) : str3;
    }

    public final void zzj(Bundle bundle, long j6, long j10) {
        synchronized (this.zzj) {
            try {
                if (!this.zzi) {
                    this.zzu.zzaW().zzh().zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.zzu.zzc().zze(null, false))) {
                    this.zzu.zzaW().zzh().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.zzu.zzc().zze(null, false))) {
                    this.zzu.zzaW().zzh().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.zzdd zzddVar = this.zze;
                    string2 = zzddVar != null ? zzi(zzddVar.zzb, "Activity") : "Activity";
                }
                zzlu zzluVar = this.zzb;
                if (this.zzf && zzluVar != null) {
                    this.zzf = false;
                    boolean zEquals = Objects.equals(zzluVar.zzb, string2);
                    boolean zEquals2 = Objects.equals(zzluVar.zza, string);
                    if (zEquals && zEquals2) {
                        this.zzu.zzaW().zzh().zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzic zzicVar = this.zzu;
                zzicVar.zzaW().zzk().zzc("Logging screen view with name, class", string == null ? BuildConfig.TRAVIS : string, string2 == null ? BuildConfig.TRAVIS : string2);
                zzlu zzluVar2 = this.zzb == null ? this.zzc : this.zzb;
                zzlu zzluVar3 = new zzlu(string, string2, zzicVar.zzk().zzd(), true, j6, j10);
                this.zzb = zzluVar3;
                this.zzc = zzluVar2;
                this.zzg = zzluVar3;
                zzicVar.zzaX().zzj(new zzlv(this, bundle, zzluVar3, zzluVar2, zzicVar.zzba().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public final void zzk(@NonNull com.google.android.gms.internal.measurement.zzdd zzddVar, @Size(max = 36, min = 1) String str, @Size(max = 36, min = 1) String str2) {
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzc().zzv()) {
            zzicVar.zzaW().zzh().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzlu zzluVar = this.zzb;
        if (zzluVar == null) {
            zzicVar.zzaW().zzh().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.zzd;
        Integer numValueOf = Integer.valueOf(zzddVar.zza);
        if (map.get(numValueOf) == null) {
            zzicVar.zzaW().zzh().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzi(zzddVar.zzb, "Activity");
        }
        String str3 = zzluVar.zzb;
        String str4 = zzluVar.zza;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            zzicVar.zzaW().zzh().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > zzicVar.zzc().zze(null, false))) {
            zzicVar.zzaW().zzh().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > zzicVar.zzc().zze(null, false))) {
            zzicVar.zzaW().zzh().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzicVar.zzaW().zzk().zzc("Setting current screen to name, class", str == null ? BuildConfig.TRAVIS : str, str2);
        zzlu zzluVar2 = new zzlu(str, str2, zzicVar.zzk().zzd());
        map.put(numValueOf, zzluVar2);
        zzx(zzddVar.zzb, zzluVar2, true);
    }

    public final zzlu zzl() {
        return this.zzb;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    @VisibleForTesting
    @WorkerThread
    public final void zzm(zzlu zzluVar, zzlu zzluVar2, long j6, boolean z3, Bundle bundle) {
        boolean z8;
        long j10;
        zzg();
        boolean z10 = false;
        if (zzluVar2 != null) {
            if (zzluVar2.zzc == zzluVar.zzc && Objects.equals(zzluVar2.zzb, zzluVar.zzb) && Objects.equals(zzluVar2.zza, zzluVar.zza)) {
                z8 = false;
            } else {
                z8 = true;
            }
        } else {
            z8 = true;
        }
        if (z3 && this.zza != null) {
            z10 = true;
        }
        if (z8) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzpp.zzay(zzluVar, bundle2, true);
            if (zzluVar2 != null) {
                String str = zzluVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzluVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzluVar2.zzc);
            }
            if (z10) {
                zzoa zzoaVar = this.zzu.zzh().zzb;
                long j11 = j6 - zzoaVar.zzb;
                zzoaVar.zzb = j6;
                if (j11 > 0) {
                    this.zzu.zzk().zzan(bundle2, j11);
                }
            }
            zzic zzicVar = this.zzu;
            if (!zzicVar.zzc().zzv()) {
                bundle2.putLong("_mst", 1L);
            }
            boolean z11 = zzluVar.zze;
            String str3 = true != z11 ? "auto" : "app";
            long jCurrentTimeMillis = zzicVar.zzba().currentTimeMillis();
            if (z11) {
                long j12 = zzluVar.zzf;
                if (j12 != 0) {
                    jCurrentTimeMillis = j12;
                }
            }
            long jElapsedRealtime = zzicVar.zzc().zzp(null, zzfy.zzbe) ? zzicVar.zzba().elapsedRealtime() : 0L;
            if (z11) {
                j10 = zzluVar.zzg;
                if (j10 == 0) {
                    j10 = jElapsedRealtime;
                }
            } else {
                j10 = jElapsedRealtime;
            }
            this.zzu.zzj().zzF(str3, "_vs", jCurrentTimeMillis, j10, bundle2);
        }
        if (z10) {
            zzy(this.zza, true, j6);
        }
        this.zza = zzluVar;
        if (zzluVar.zze) {
            this.zzh = zzluVar;
        }
        this.zzu.zzt().zzG(zzluVar);
    }

    @MainThread
    public final void zzn(com.google.android.gms.internal.measurement.zzdd zzddVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzu.zzc().zzv() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(Integer.valueOf(zzddVar.zza), new zzlu(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zzp(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        Object obj = this.zzj;
        synchronized (obj) {
            try {
                this.zzi = true;
                if (!Objects.equals(zzddVar, this.zze)) {
                    synchronized (obj) {
                        this.zze = zzddVar;
                        this.zzf = false;
                        zzic zzicVar = this.zzu;
                        if (zzicVar.zzc().zzv()) {
                            this.zzg = null;
                            zzicVar.zzaX().zzj(new zzma(this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzc().zzv()) {
            this.zzb = this.zzg;
            zzicVar2.zzaX().zzj(new zzlx(this));
            return;
        }
        zzx(zzddVar.zzb, zzz(zzddVar), false);
        zzd zzdVarZzw = this.zzu.zzw();
        zzic zzicVar3 = zzdVarZzw.zzu;
        zzicVar3.zzaX().zzj(new zzc(zzdVarZzw, zzicVar3.zzba().elapsedRealtime()));
    }

    @MainThread
    public final void zzq(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        zzic zzicVar = this.zzu;
        long jElapsedRealtime = zzicVar.zzba().elapsedRealtime();
        if (!zzicVar.zzc().zzv()) {
            this.zzb = null;
            zzicVar.zzaX().zzj(new zzly(this, jElapsedRealtime));
        } else {
            zzlu zzluVarZzz = zzz(zzddVar);
            this.zzc = this.zzb;
            this.zzb = null;
            zzicVar.zzaX().zzj(new zzlz(this, zzluVarZzz, jElapsedRealtime));
        }
    }

    @MainThread
    public final void zzs(com.google.android.gms.internal.measurement.zzdd zzddVar, Bundle bundle) {
        zzlu zzluVar;
        if (!this.zzu.zzc().zzv() || bundle == null || (zzluVar = (zzlu) this.zzd.get(Integer.valueOf(zzddVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzluVar.zzc);
        bundle2.putString("name", zzluVar.zza);
        bundle2.putString("referrer_name", zzluVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @MainThread
    public final void zzt(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        synchronized (this.zzj) {
            try {
                if (Objects.equals(this.zze, zzddVar)) {
                    this.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.zzu.zzc().zzv()) {
            this.zzd.remove(Integer.valueOf(zzddVar.zza));
        }
    }

    public final /* synthetic */ void zzu(zzlu zzluVar, boolean z3, long j6) {
        zzy(zzluVar, false, j6);
    }

    public final /* synthetic */ zzlu zzv() {
        return this.zzh;
    }

    public final /* synthetic */ void zzw(zzlu zzluVar) {
        this.zzh = null;
    }
}
