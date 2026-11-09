package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.model.layer.d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.perf.util.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzal extends zzje {
    private Boolean zza;
    private String zzb;
    private zzak zzc;
    private Boolean zzd;

    public zzal(zzic zzicVar) {
        super(zzicVar);
        this.zzc = zzaj.zza;
    }

    public static final long zzF() {
        return ((Long) zzfy.zzd.zzb(null)).longValue();
    }

    public static final int zzG() {
        return Math.max(0, ((Integer) zzfy.zzi.zzb(null)).intValue());
    }

    public static final long zzH() {
        return ((Integer) zzfy.zzk.zzb(null)).intValue();
    }

    public static final long zzI() {
        return ((Long) zzfy.zzR.zzb(null)).longValue();
    }

    public static final long zzJ() {
        return ((Long) zzfy.zzM.zzb(null)).longValue();
    }

    private final String zzK(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.zzu.zzaW().zzb().zzb("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.zzu.zzaW().zzb().zzb("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.zzu.zzaW().zzb().zzb("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.zzu.zzaW().zzb().zzb("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    public final String zzA() {
        return zzK("debug.firebase.analytics.app", "");
    }

    public final String zzB() {
        return zzK("debug.deferred.deeplink", "");
    }

    public final boolean zzC(String str) {
        if (this.zzu.zzk().zzaa(str)) {
            return true;
        }
        return "1".equals(this.zzc.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzD(String str) {
        return "1".equals(this.zzc.zza(str, "measurement.event_sampling_enabled"));
    }

    @WorkerThread
    public final boolean zzE() {
        if (this.zza == null) {
            Boolean boolZzr = zzr("app_measurement_lite");
            this.zza = boolZzr;
            if (boolZzr == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzu.zzp();
    }

    public final void zza(zzak zzakVar) {
        this.zzc = zzakVar;
    }

    public final String zzb() {
        this.zzu.zzaV();
        return "FA";
    }

    public final int zzc() {
        return this.zzu.zzk().zzaj(201500000, true) ? 100 : 25;
    }

    public final int zzd(@Size(min = 1) String str) {
        return zzn(str, zzfy.zzX, 25, 100);
    }

    public final int zze(String str, boolean z3) {
        if (z3) {
            return zzn(str, zzfy.zzag, 100, 500);
        }
        return 500;
    }

    public final int zzf(String str, boolean z3) {
        return Math.max(zze(str, z3), IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
    }

    public final int zzh(@Size(min = 1) String str) {
        return zzn(str, zzfy.zzW, 500, Constants.MAX_URL_LENGTH);
    }

    public final long zzi() {
        this.zzu.zzaV();
        return 161000L;
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzj() {
        if (this.zzd == null) {
            synchronized (this) {
                try {
                    if (this.zzd == null) {
                        zzic zzicVar = this.zzu;
                        ApplicationInfo applicationInfo = zzicVar.zzaZ().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z3 = false;
                            if (str != null && str.equals(myProcessName)) {
                                z3 = true;
                            }
                            this.zzd = Boolean.valueOf(z3);
                        }
                        if (this.zzd == null) {
                            this.zzd = Boolean.TRUE;
                            zzicVar.zzaW().zzb().zza("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzd.booleanValue();
    }

    @WorkerThread
    public final String zzk(String str, zzfx zzfxVar) {
        return TextUtils.isEmpty(str) ? (String) zzfxVar.zzb(null) : (String) zzfxVar.zzb(this.zzc.zza(str, zzfxVar.zza()));
    }

    @WorkerThread
    public final long zzl(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) zzfxVar.zzb(null)).longValue();
        }
        String strZza = this.zzc.zza(str, zzfxVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return ((Long) zzfxVar.zzb(null)).longValue();
        }
        try {
            return ((Long) zzfxVar.zzb(Long.valueOf(Long.parseLong(strZza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzfxVar.zzb(null)).longValue();
        }
    }

    @WorkerThread
    public final int zzm(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) zzfxVar.zzb(null)).intValue();
        }
        String strZza = this.zzc.zza(str, zzfxVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return ((Integer) zzfxVar.zzb(null)).intValue();
        }
        try {
            return ((Integer) zzfxVar.zzb(Integer.valueOf(Integer.parseInt(strZza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzfxVar.zzb(null)).intValue();
        }
    }

    @WorkerThread
    public final int zzn(String str, zzfx zzfxVar, int i7, int i10) {
        return Math.max(Math.min(zzm(str, zzfxVar), i10), i7);
    }

    @WorkerThread
    public final double zzo(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) zzfxVar.zzb(null)).doubleValue();
        }
        String strZza = this.zzc.zza(str, zzfxVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return ((Double) zzfxVar.zzb(null)).doubleValue();
        }
        try {
            return ((Double) zzfxVar.zzb(Double.valueOf(Double.parseDouble(strZza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzfxVar.zzb(null)).doubleValue();
        }
    }

    @WorkerThread
    public final boolean zzp(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) zzfxVar.zzb(null)).booleanValue();
        }
        String strZza = this.zzc.zza(str, zzfxVar.zza());
        return TextUtils.isEmpty(strZza) ? ((Boolean) zzfxVar.zzb(null)).booleanValue() : ((Boolean) zzfxVar.zzb(Boolean.valueOf("1".equals(strZza)))).booleanValue();
    }

    @VisibleForTesting
    public final Bundle zzq() {
        try {
            zzic zzicVar = this.zzu;
            if (zzicVar.zzaZ().getPackageManager() == null) {
                zzicVar.zzaW().zzb().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zzicVar.zzaZ()).getApplicationInfo(zzicVar.zzaZ().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            zzicVar.zzaW().zzb().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.zzu.zzaW().zzb().zzb("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final Boolean zzr(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleZzq = zzq();
        if (bundleZzq == null) {
            d.r(this.zzu, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleZzq.containsKey(str)) {
            return Boolean.valueOf(bundleZzq.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003b A[Catch: NotFoundException -> 0x0040, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0040, blocks: (B:11:0x0026, B:14:0x003b), top: B:19:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final List zzs(@Size(min = 1) String str) {
        Integer numValueOf;
        String[] stringArray;
        Preconditions.checkNotEmpty("analytics.safelisted_events");
        Bundle bundleZzq = zzq();
        if (bundleZzq != null) {
            if (bundleZzq.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleZzq.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.zzu.zzaZ().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e10) {
                    this.zzu.zzaW().zzb().zzb("Failed to load string array from metadata: resource not found", e10);
                }
            }
            return null;
        }
        d.r(this.zzu, "Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.zzu.zzaZ().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        return null;
    }

    public final boolean zzt() {
        this.zzu.zzaV();
        Boolean boolZzr = zzr("firebase_analytics_collection_deactivated");
        return boolZzr != null && boolZzr.booleanValue();
    }

    public final boolean zzu() {
        Boolean boolZzr = zzr("google_analytics_adid_collection_enabled");
        return boolZzr == null || boolZzr.booleanValue();
    }

    public final boolean zzv() {
        Boolean boolZzr = zzr("google_analytics_automatic_screen_reporting_enabled");
        return boolZzr == null || boolZzr.booleanValue();
    }

    public final zzji zzw(String str, boolean z3) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        zzic zzicVar = this.zzu;
        Bundle bundleZzq = zzq();
        if (bundleZzq == null) {
            d.r(zzicVar, "Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleZzq.get(str);
        }
        if (obj == null) {
            return zzji.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzji.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzji.DENIED;
        }
        if (z3 && "eu_consent_policy".equals(obj)) {
            return zzji.POLICY;
        }
        zzicVar.zzaW().zze().zzb("Invalid manifest metadata for", str);
        return zzji.UNINITIALIZED;
    }

    public final boolean zzx() {
        Boolean boolZzr = zzr("google_analytics_sgtm_upload_enabled");
        if (boolZzr == null) {
            return false;
        }
        return boolZzr.booleanValue();
    }

    public final void zzy(String str) {
        this.zzb = str;
    }

    public final String zzz() {
        return this.zzb;
    }
}
