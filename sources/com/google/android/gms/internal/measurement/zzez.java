package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzez {
    private static volatile zzez zzc;
    protected final ExecutorService zzb;
    private final AppMeasurementSdk zze;

    @GuardedBy("listenerList")
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final String zzi;
    private volatile zzcp zzj;
    private volatile long zzk;
    private final String zzd = "FA";
    protected final Clock zza = DefaultClock.getInstance();

    public zzez(Context context, Bundle bundle) {
        zzck.zza();
        ShadowThreadPoolExecutor shadowThreadPoolExecutor = new ShadowThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new zzeb(this), "\u200bcom.google.android.gms.internal.measurement.zzez", true);
        shadowThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(shadowThreadPoolExecutor);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zzlt.zza(context, "google_app_id", com.google.android.gms.measurement.internal.zzhu.zza(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzez.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.zzi = null;
                    this.zzh = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.zzi = "fa";
        zzM(new zzdp(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new zzey(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzM(zzeo zzeoVar) {
        this.zzb.execute(zzeoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
    public final void zzN(Exception exc, boolean z3, boolean z8) {
        this.zzh |= z3;
        if (!z3 && z8) {
            zzD(5, "Error with data collection. Data lost.", exc, null, null);
        }
    }

    private final void zzX(String str, String str2, Bundle bundle, boolean z3, boolean z8, Long l5, Long l6) {
        zzM(new zzen(this, l5, l6, str, str2, bundle, z3, z8));
    }

    public static zzez zza(Context context, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzc == null) {
            synchronized (zzez.class) {
                try {
                    if (zzc == null) {
                        zzc = new zzez(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzc;
    }

    public final String zzA() {
        zzcm zzcmVar = new zzcm();
        zzM(new zzdx(this, zzcmVar));
        return zzcmVar.zzc(500L);
    }

    public final String zzB() {
        zzcm zzcmVar = new zzcm();
        zzM(new zzdy(this, zzcmVar));
        return zzcmVar.zzc(500L);
    }

    public final Map zzC(String str, String str2, boolean z3) {
        zzcm zzcmVar = new zzcm();
        zzM(new zzdz(this, str, str2, z3, zzcmVar));
        Bundle bundleZze = zzcmVar.zze(5000L);
        if (bundleZze == null || bundleZze.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleZze.size());
        for (String str3 : bundleZze.keySet()) {
            Object obj = bundleZze.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void zzD(int i7, String str, Object obj, Object obj2, Object obj3) {
        zzM(new zzea(this, false, 5, str, obj, null, null));
    }

    public final Bundle zzE(Bundle bundle, boolean z3) {
        zzcm zzcmVar = new zzcm();
        zzM(new zzec(this, bundle, zzcmVar));
        if (z3) {
            return zzcmVar.zze(5000L);
        }
        return null;
    }

    public final int zzF(String str) {
        zzcm zzcmVar = new zzcm();
        zzM(new zzed(this, str, zzcmVar));
        Integer num = (Integer) zzcm.zzf(zzcmVar.zze(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @WorkerThread
    public final String zzG() {
        zzcm zzcmVar = new zzcm();
        zzM(new zzee(this, zzcmVar));
        return zzcmVar.zzc(120000L);
    }

    @WorkerThread
    public final Long zzH() {
        zzcm zzcmVar = new zzcm();
        zzM(new zzef(this, zzcmVar));
        return zzcmVar.zzd(120000L);
    }

    public final String zzI() {
        return this.zzi;
    }

    public final Object zzJ(int i7) {
        zzcm zzcmVar = new zzcm();
        zzM(new zzeg(this, zzcmVar, i7));
        return zzcm.zzf(zzcmVar.zze(15000L), Object.class);
    }

    public final void zzK(boolean z3) {
        zzM(new zzeh(this, z3));
    }

    public final void zzL(Bundle bundle) {
        zzM(new zzei(this, bundle));
    }

    public final /* synthetic */ boolean zzO() {
        return this.zzk >= 169;
    }

    public final /* synthetic */ boolean zzP() {
        return this.zzk >= 170;
    }

    public final /* synthetic */ String zzQ() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzR() {
        return this.zzh;
    }

    public final /* synthetic */ zzcp zzS() {
        return this.zzj;
    }

    public final /* synthetic */ void zzT(zzcp zzcpVar) {
        this.zzj = zzcpVar;
    }

    public final /* synthetic */ void zzU(long j6) {
        this.zzk = j6;
    }

    public final AppMeasurementSdk zzb() {
        return this.zze;
    }

    public final zzcp zzc(Context context, boolean z3) {
        try {
            return zzco.asInterface(DynamiteModule.load(context, z3 ? DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION : DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e10) {
            zzN(e10, true, false);
            return null;
        }
    }

    public final void zzd(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        zzep zzepVar = new zzep(zzjpVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzepVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        zzM(new zzej(this, zzepVar));
    }

    public final void zze(Intent intent) {
        zzM(new zzek(this, intent));
    }

    public final void zzf(com.google.android.gms.measurement.internal.zzjq zzjqVar) {
        Preconditions.checkNotNull(zzjqVar);
        List list = this.zzf;
        synchronized (list) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                try {
                    if (zzjqVar.equals(((Pair) list.get(i7)).first)) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzeq zzeqVar = new zzeq(zzjqVar);
            list.add(new Pair(zzjqVar, zzeqVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzeqVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            zzM(new zzel(this, zzeqVar));
        }
    }

    public final void zzg(com.google.android.gms.measurement.internal.zzjq zzjqVar) {
        Pair pair;
        Preconditions.checkNotNull(zzjqVar);
        List list = this.zzf;
        synchronized (list) {
            int i7 = 0;
            while (true) {
                try {
                    if (i7 >= list.size()) {
                        pair = null;
                        break;
                    } else {
                        if (zzjqVar.equals(((Pair) list.get(i7)).first)) {
                            pair = (Pair) list.get(i7);
                            break;
                        }
                        i7++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                return;
            }
            list.remove(pair);
            zzeq zzeqVar = (zzeq) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzeqVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            zzM(new zzem(this, zzeqVar));
        }
    }

    public final void zzh(@NonNull String str, Bundle bundle) {
        zzX(null, str, bundle, false, true, null, null);
    }

    public final void zzi(String str, String str2, Bundle bundle) {
        zzX(str, str2, bundle, true, true, null, null);
    }

    public final void zzj(String str, String str2, Bundle bundle, long j6, long j10) {
        zzX(str, str2, bundle, true, false, Long.valueOf(j6), 0L);
    }

    public final void zzk(String str, String str2, Object obj, boolean z3) {
        zzM(new zzdf(this, str, str2, obj, z3));
    }

    public final void zzl(Bundle bundle) {
        zzM(new zzdg(this, bundle));
    }

    public final void zzm(String str, String str2, Bundle bundle) {
        zzM(new zzdh(this, str, str2, bundle));
    }

    public final List zzn(String str, String str2) {
        zzcm zzcmVar = new zzcm();
        zzM(new zzdi(this, str, str2, zzcmVar));
        List list = (List) zzcm.zzf(zzcmVar.zze(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void zzo(String str) {
        zzM(new zzdj(this, str));
    }

    public final void zzp(zzdd zzddVar, String str, String str2) {
        zzM(new zzdk(this, zzddVar, str, str2));
    }

    public final void zzq(Boolean bool) {
        zzM(new zzdl(this, bool));
    }

    public final void zzr(Bundle bundle) {
        zzM(new zzdm(this, bundle));
    }

    public final void zzs() {
        zzM(new zzdn(this));
    }

    public final void zzt(long j6) {
        zzM(new zzdo(this, j6));
    }

    public final void zzu(String str) {
        zzM(new zzdq(this, str));
    }

    public final void zzv(String str) {
        zzM(new zzdr(this, str));
    }

    public final void zzw(Runnable runnable) {
        zzM(new zzdt(this, runnable));
    }

    public final String zzx() {
        zzcm zzcmVar = new zzcm();
        zzM(new zzdu(this, zzcmVar));
        return zzcmVar.zzc(500L);
    }

    public final String zzy() {
        zzcm zzcmVar = new zzcm();
        zzM(new zzdv(this, zzcmVar));
        return zzcmVar.zzc(50L);
    }

    public final long zzz() {
        zzcm zzcmVar = new zzcm();
        zzM(new zzdw(this, zzcmVar));
        Long lZzd = zzcmVar.zzd(500L);
        if (lZzd != null) {
            return lZzd.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
        int i7 = this.zzg + 1;
        this.zzg = i7;
        return jNextLong + ((long) i7);
    }
}
