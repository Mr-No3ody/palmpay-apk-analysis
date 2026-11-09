package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.os.h;
import androidx.core.os.i;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkx {

    @Nullable
    private static zzp zza;
    private static final zzr zzb = zzr.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
    private final String zzc;
    private final String zzd;
    private final zzkw zze;
    private final SharedPrefManager zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzkx(Context context, final SharedPrefManager sharedPrefManager, zzkw zzkwVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zzkwVar;
        zzlk.zza();
        this.zzi = str;
        this.zzg = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzkt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        sharedPrefManager.getClass();
        this.zzh = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzku
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sharedPrefManager.getMlSdkInstanceId();
            }
        });
        zzr zzrVar = zzb;
        this.zzj = zzrVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzrVar.get(str)) : -1;
    }

    @NonNull
    private static synchronized zzp zzd() {
        try {
            zzp zzpVar = zza;
            if (zzpVar != null) {
                return zzpVar;
            }
            h hVar = new h(new i(Resources.getSystem().getConfiguration().getLocales()));
            zzm zzmVar = new zzm();
            for (int i7 = 0; i7 < hVar.d(); i7++) {
                zzmVar.zzb(CommonUtils.languageTagFromLocale(hVar.b(i7)));
            }
            zzp zzpVarZzc = zzmVar.zzc();
            zza = zzpVarZzc;
            return zzpVarZzc;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ String zza() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ void zzb(zzkp zzkpVar, zzhs zzhsVar, String str) {
        zzkpVar.zza(zzhsVar);
        String strZzc = zzkpVar.zzc();
        zzjo zzjoVar = new zzjo();
        zzjoVar.zzb(this.zzc);
        zzjoVar.zzc(this.zzd);
        zzjoVar.zzh(zzd());
        zzjoVar.zzg(Boolean.TRUE);
        zzjoVar.zzl(strZzc);
        zzjoVar.zzj(str);
        zzjoVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.getMlSdkInstanceId());
        zzjoVar.zzd(10);
        zzjoVar.zzk(Integer.valueOf(this.zzj));
        zzkpVar.zzb(zzjoVar);
        this.zze.zza(zzkpVar);
    }

    @WorkerThread
    public final void zzc(zzlh zzlhVar, final zzhs zzhsVar) {
        zzhg zzhgVar;
        zzhl zzhlVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzk.get(zzhsVar) != null && jElapsedRealtime - ((Long) this.zzk.get(zzhsVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.zzk.put(zzhsVar, Long.valueOf(jElapsedRealtime));
        int i7 = zzlhVar.zza;
        int i10 = zzlhVar.zzb;
        int i11 = zzlhVar.zzc;
        int i12 = zzlhVar.zzd;
        int i13 = zzlhVar.zze;
        long j6 = zzlhVar.zzf;
        int i14 = zzlhVar.zzg;
        zzhk zzhkVar = new zzhk();
        if (i7 == -1) {
            zzhgVar = zzhg.BITMAP;
        } else if (i7 == 35) {
            zzhgVar = zzhg.YUV_420_888;
        } else if (i7 == 842094169) {
            zzhgVar = zzhg.YV12;
        } else if (i7 != 16) {
            zzhgVar = i7 != 17 ? zzhg.UNKNOWN_FORMAT : zzhg.NV21;
        } else {
            zzhgVar = zzhg.NV16;
        }
        zzhkVar.zzd(zzhgVar);
        if (i10 == 1) {
            zzhlVar = zzhl.BITMAP;
        } else if (i10 == 2) {
            zzhlVar = zzhl.BYTEARRAY;
        } else if (i10 != 3) {
            zzhlVar = i10 != 4 ? zzhl.ANDROID_MEDIA_IMAGE : zzhl.FILEPATH;
        } else {
            zzhlVar = zzhl.BYTEBUFFER;
        }
        zzhkVar.zzf(zzhlVar);
        zzhkVar.zzc(Integer.valueOf(i11));
        zzhkVar.zze(Integer.valueOf(i12));
        zzhkVar.zzg(Integer.valueOf(i13));
        zzhkVar.zzb(Long.valueOf(j6));
        zzhkVar.zzh(Integer.valueOf(i14));
        zzhn zzhnVarZzj = zzhkVar.zzj();
        zzht zzhtVar = new zzht();
        zzhtVar.zzd(zzhnVarZzj);
        final zzkp zzkpVarZze = zzky.zze(zzhtVar);
        final String version = this.zzg.isSuccessful() ? (String) this.zzg.getResult() : LibraryVersion.getInstance().getVersion(this.zzi);
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzkv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzkpVarZze, zzhsVar, version);
            }
        });
    }
}
