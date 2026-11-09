package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjd extends zzga {
    private final zzpg zza;
    private Boolean zzb;
    private String zzc;

    public zzjd(zzpg zzpgVar, String str) {
        Preconditions.checkNotNull(zzpgVar);
        this.zza = zzpgVar;
        this.zzc = null;
    }

    private final void zzM(zzbh zzbhVar, zzr zzrVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        zzpgVar.zzF(zzbhVar, zzrVar);
    }

    @BinderThread
    private final void zzN(zzr zzrVar, boolean z3) {
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzO(str, false);
        this.zza.zzt().zzC(zzrVar.zzb);
    }

    @BinderThread
    private final void zzO(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzaW().zzb().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z3) {
            try {
                if (this.zzb == null) {
                    boolean z8 = true;
                    if (!"com.google.android.gms".equals(this.zzc)) {
                        zzpg zzpgVar = this.zza;
                        if (!UidVerifier.isGooglePlayServicesUid(zzpgVar.zzaZ(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(zzpgVar.zzaZ()).isUidGoogleSigned(Binder.getCallingUid())) {
                            z8 = false;
                        }
                    }
                    this.zzb = Boolean.valueOf(z8);
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.zza.zzaW().zzb().zzb("Measurement Service called with invalid calling package. appId", zzgu.zzl(str));
                throw e10;
            }
        }
        if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzaZ(), Binder.getCallingUid(), str)) {
            this.zzc = str;
        }
        if (str.equals(this.zzc)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzA(zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new zzif(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzB(zzr zzrVar, final zzoo zzooVar, final zzgh zzghVar) {
        zzN(zzrVar, false);
        final String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        this.zza.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzI(str, zzooVar, zzghVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzC(final zzr zzrVar, final zzaf zzafVar) {
        zzN(zzrVar, false);
        zzd(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzja
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(zzrVar, zzafVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzD(final zzr zzrVar, final Bundle bundle, final zzge zzgeVar) {
        zzN(zzrVar, false);
        final String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        this.zza.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH(zzrVar, bundle, zzgeVar, str);
            }
        });
    }

    @VisibleForTesting
    public final void zzE(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        zzpg zzpgVar = this.zza;
        if (zzpgVar.zzaX().zze()) {
            runnable.run();
        } else {
            zzpgVar.zzaX().zzl(runnable);
        }
    }

    public final /* synthetic */ void zzF(zzr zzrVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        zzpgVar.zzv(zzrVar);
    }

    public final /* synthetic */ void zzG(zzr zzrVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        zzpgVar.zzw(zzrVar);
    }

    public final /* synthetic */ void zzH(zzr zzrVar, Bundle bundle, zzge zzgeVar, String str) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        try {
            zzgeVar.zze(zzpgVar.zzar(zzrVar, bundle));
        } catch (RemoteException e10) {
            this.zza.zzaW().zzb().zzc("Failed to return trigger URIs for app", str, e10);
        }
    }

    public final /* synthetic */ void zzI(String str, zzoo zzooVar, zzgh zzghVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        zzpgVar.zzaX().zzg();
        zzpgVar.zzu();
        List<zzpj> listZzC = zzpgVar.zzj().zzC(str, zzooVar, ((Integer) zzfy.zzA.zzb(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (zzpj zzpjVar : listZzC) {
            if (zzpgVar.zzO(str, zzpjVar.zze())) {
                int iZzi = zzpjVar.zzi();
                if (iZzi > 0) {
                    if (iZzi <= ((Integer) zzfy.zzy.zzb(null)).intValue()) {
                        if (zzpgVar.zzba().currentTimeMillis() >= zzpjVar.zzh() + Math.min(((Long) zzfy.zzw.zzb(null)).longValue() * (1 << (iZzi - 1)), ((Long) zzfy.zzx.zzb(null)).longValue())) {
                        }
                    }
                    zzpgVar.zzaW().zzk().zzd("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(zzpjVar.zzc()), Long.valueOf(zzpjVar.zzh()));
                }
                zzom zzomVarZzb = zzpjVar.zzb();
                try {
                    com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpk.zzw(com.google.android.gms.internal.measurement.zzib.zzi(), zzomVarZzb.zzb);
                    for (int i7 = 0; i7 < zzhzVar.zzb(); i7++) {
                        com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) zzhzVar.zzc(i7).zzco();
                        zzicVar.zzs(zzpgVar.zzba().currentTimeMillis());
                        zzhzVar.zzd(i7, zzicVar);
                    }
                    zzomVarZzb.zzb = ((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbd()).zzcd();
                    if (Log.isLoggable(zzpgVar.zzaW().zzn(), 2)) {
                        zzomVarZzb.zzg = zzpgVar.zzp().zzi((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbd());
                    }
                    arrayList.add(zzomVarZzb);
                } catch (zzaeh unused) {
                    zzpgVar.zzaW().zze().zzb("Failed to parse queued batch. appId", str);
                }
            } else {
                zzpgVar.zzaW().zzk().zzd("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(zzpjVar.zzc()), zzpjVar.zze());
            }
        }
        zzoq zzoqVar = new zzoq(arrayList);
        try {
            zzghVar.zze(zzoqVar);
            this.zza.zzaW().zzk().zzc("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(zzoqVar.zza.size()));
        } catch (RemoteException e10) {
            this.zza.zzaW().zzb().zzc("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    public final /* synthetic */ void zzJ(zzr zzrVar, zzaf zzafVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        zzpgVar.zzas((String) Preconditions.checkNotNull(zzrVar.zza), zzafVar);
    }

    public final /* synthetic */ void zzK(Bundle bundle, String str, zzr zzrVar) {
        if (bundle.isEmpty()) {
            zzaw zzawVarZzj = this.zza.zzj();
            zzawVarZzj.zzg();
            zzawVarZzj.zzay();
            try {
                zzawVarZzj.zze().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                zzawVarZzj.zzu.zzaW().zzb().zzb("Error clearing default event params", e10);
                return;
            }
        }
        zzaw zzawVarZzj2 = this.zza.zzj();
        zzawVarZzj2.zzg();
        zzawVarZzj2.zzay();
        byte[] bArrZzcd = zzawVarZzj2.zzg.zzp().zzh(new zzbc(zzawVarZzj2.zzu, "", str, "dep", 0L, 0L, 0L, bundle)).zzcd();
        zzic zzicVar = zzawVarZzj2.zzu;
        zzicVar.zzaW().zzk().zzc("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrZzcd.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrZzcd);
        try {
            if (zzawVarZzj2.zze().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzicVar.zzaW().zzb().zzb("Failed to insert default event parameters (got -1). appId", zzgu.zzl(str));
            }
        } catch (SQLiteException e11) {
            zzawVarZzj2.zzu.zzaW().zzb().zzc("Error storing default event parameters. appId", zzgu.zzl(str), e11);
        }
        zzpg zzpgVar = this.zza;
        zzaw zzawVarZzj3 = zzpgVar.zzj();
        long j6 = zzrVar.zzD;
        if (zzawVarZzj3.zzW(str, j6)) {
            zzpgVar.zzj().zzX(str, Long.valueOf(j6), null, bundle);
        }
    }

    public final /* synthetic */ zzpg zzL() {
        return this.zza;
    }

    public final void zzb(zzbh zzbhVar, zzr zzrVar) {
        zzpg zzpgVar = this.zza;
        zzht zzhtVarZzh = zzpgVar.zzh();
        String str = zzrVar.zza;
        com.google.android.gms.internal.measurement.zzc zzcVar = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.zzc) zzhtVarZzh.zze.get(str);
        if (zzcVar == null) {
            this.zza.zzaW().zzk().zzb("EES not loaded for", zzrVar.zza);
            zzM(zzbhVar, zzrVar);
            return;
        }
        try {
            Map mapZzz = zzpgVar.zzp().zzz(zzbhVar.zzb.zzf(), true);
            String str2 = zzbhVar.zza;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            if (zzcVar.zzb(new com.google.android.gms.internal.measurement.zzaa(str2, zzbhVar.zzd, mapZzz))) {
                if (zzcVar.zzc()) {
                    zzpg zzpgVar2 = this.zza;
                    zzpgVar2.zzaW().zzk().zzb("EES edited event", zzbhVar.zza);
                    zzM(zzpgVar2.zzp().zzA(zzcVar.zze().zzc()), zzrVar);
                } else {
                    zzM(zzbhVar, zzrVar);
                }
                if (zzcVar.zzd()) {
                    for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zze().zzf()) {
                        zzpg zzpgVar3 = this.zza;
                        zzpgVar3.zzaW().zzk().zzb("EES logging created event", zzaaVar.zzb());
                        zzM(zzpgVar3.zzp().zzA(zzaaVar), zzrVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zza.zzaW().zzb().zzc("EES error. appId, eventName", zzrVar.zzb, zzbhVar.zza);
        }
        this.zza.zzaW().zzk().zzb("EES was not applied to event", zzbhVar.zza);
        zzM(zzbhVar, zzrVar);
    }

    @VisibleForTesting
    public final zzbh zzc(zzbh zzbhVar, zzr zzrVar) {
        zzbf zzbfVar;
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzbhVar.zza) && (zzbfVar = zzbhVar.zzb) != null && zzbfVar.zze() != 0) {
            String strZzd = zzbfVar.zzd("_cis");
            if ("referrer broadcast".equals(strZzd) || "referrer API".equals(strZzd)) {
                this.zza.zzaW().zzi().zzb("Event has been filtered ", zzbhVar.toString());
                return new zzbh("_cmpx", zzbfVar, zzbhVar.zzc, zzbhVar.zzd, zzbhVar.zze);
            }
        }
        return zzbhVar;
    }

    @VisibleForTesting
    public final void zzd(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        zzpg zzpgVar = this.zza;
        if (zzpgVar.zzaX().zze()) {
            runnable.run();
        } else {
            zzpgVar.zzaX().zzj(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zze(zzbh zzbhVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzbhVar);
        zzN(zzrVar, false);
        zzd(new zzir(this, zzbhVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzf(zzpl zzplVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzplVar);
        zzN(zzrVar, false);
        zzd(new zziu(this, zzplVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzg(zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new zzie(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzh(zzbh zzbhVar, String str, String str2) {
        Preconditions.checkNotNull(zzbhVar);
        Preconditions.checkNotEmpty(str);
        zzO(str, true);
        zzd(new zzis(this, zzbhVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzi(zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new zzin(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zzj(zzr zzrVar, boolean z3) {
        zzN(zzrVar, false);
        String str = zzrVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zzpn> list = (List) this.zza.zzaX().zzh(new zzid(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (z3 || !zzpp.zzac(zzpnVar.zzc)) {
                    arrayList.add(new zzpl(zzpnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.zza.zzaW().zzb().zzc("Failed to get user properties. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.zza.zzaW().zzb().zzc("Failed to get user properties. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final byte[] zzk(zzbh zzbhVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbhVar);
        zzO(str, true);
        zzpg zzpgVar = this.zza;
        zzgs zzgsVarZzj = zzpgVar.zzaW().zzj();
        zzgn zzgnVarZzs = zzpgVar.zzs();
        String str2 = zzbhVar.zza;
        zzgsVarZzj.zzb("Log and bundle. event", zzgnVarZzs.zza(str2));
        long jNanoTime = zzpgVar.zzba().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) zzpgVar.zzaX().zzi(new zzit(this, zzbhVar, str)).get();
            if (bArr == null) {
                zzpgVar.zzaW().zzb().zzb("Log and bundle returned null. appId", zzgu.zzl(str));
                bArr = new byte[0];
            }
            zzpgVar.zzaW().zzj().zzd("Log and bundle processed. event, size, time_ms", zzpgVar.zzs().zza(str2), Integer.valueOf(bArr.length), Long.valueOf((zzpgVar.zzba().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            zzpg zzpgVar2 = this.zza;
            zzpgVar2.zzaW().zzb().zzd("Failed to log and bundle. appId, event, error", zzgu.zzl(str), zzpgVar2.zzs().zza(zzbhVar.zza), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            zzpg zzpgVar3 = this.zza;
            zzpgVar3.zzaW().zzb().zzd("Failed to log and bundle. appId, event, error", zzgu.zzl(str), zzpgVar3.zzs().zza(zzbhVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzl(long j6, String str, String str2, String str3) {
        zzd(new zzig(this, str2, str3, str, j6));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final String zzm(zzr zzrVar) {
        zzN(zzrVar, false);
        return this.zza.zzaq(zzrVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzn(zzah zzahVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotNull(zzahVar.zzc);
        zzN(zzrVar, false);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.zza = zzrVar.zza;
        zzd(new zzih(this, zzahVar2, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzo(zzah zzahVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zza);
        zzO(zzahVar.zza, true);
        zzd(new zzii(this, new zzah(zzahVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zzp(String str, String str2, boolean z3, zzr zzrVar) {
        zzN(zzrVar, false);
        String str3 = zzrVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zzpn> list = (List) this.zza.zzaX().zzh(new zzij(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (z3 || !zzpp.zzac(zzpnVar.zzc)) {
                    arrayList.add(new zzpl(zzpnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.zza.zzaW().zzb().zzc("Failed to query user properties. appId", zzgu.zzl(zzrVar.zza), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.zza.zzaW().zzb().zzc("Failed to query user properties. appId", zzgu.zzl(zzrVar.zza), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zzq(String str, String str2, String str3, boolean z3) {
        zzO(str, true);
        try {
            List<zzpn> list = (List) this.zza.zzaX().zzh(new zzik(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (z3 || !zzpp.zzac(zzpnVar.zzc)) {
                    arrayList.add(new zzpl(zzpnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.zza.zzaW().zzb().zzc("Failed to get user properties as. appId", zzgu.zzl(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.zza.zzaW().zzb().zzc("Failed to get user properties as. appId", zzgu.zzl(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zzr(String str, String str2, zzr zzrVar) {
        zzN(zzrVar, false);
        String str3 = zzrVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzaX().zzh(new zzil(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzaW().zzb().zzb("Failed to get conditional user properties", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zzs(String str, String str2, String str3) {
        zzO(str, true);
        try {
            return (List) this.zza.zzaX().zzh(new zzim(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzaW().zzb().zzb("Failed to get conditional user properties as", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzt(zzr zzrVar) {
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzO(str, false);
        zzd(new zzio(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzu(final Bundle bundle, final zzr zzrVar) {
        zzN(zzrVar, false);
        final String str = zzrVar.zza;
        Preconditions.checkNotNull(str);
        zzd(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzK(bundle, str, zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzv(zzr zzrVar) {
        Preconditions.checkNotEmpty(zzrVar.zza);
        Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new zzip(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final zzao zzw(zzr zzrVar) {
        zzN(zzrVar, false);
        Preconditions.checkNotEmpty(zzrVar.zza);
        try {
            return (zzao) this.zza.zzaX().zzi(new zziq(this, zzrVar)).get(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.zza.zzaW().zzb().zzc("Failed to get consent. appId", zzgu.zzl(zzrVar.zza), e10);
            return new zzao(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zzx(zzr zzrVar, Bundle bundle) {
        zzN(zzrVar, false);
        Preconditions.checkNotNull(zzrVar.zza);
        zzpg zzpgVar = this.zza;
        if (!zzpgVar.zzd().zzp(null, zzfy.zzaT)) {
            try {
                return (List) this.zza.zzaX().zzh(new zziw(this, zzrVar, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.zza.zzaW().zzb().zzc("Failed to get trigger URIs. appId", zzgu.zzl(zzrVar.zza), e10);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) zzpgVar.zzaX().zzi(new zziv(this, zzrVar, bundle)).get(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.zza.zzaW().zzb().zzc("Failed to get trigger URIs. appId", zzgu.zzl(zzrVar.zza), e11);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzy(final zzr zzrVar) {
        Preconditions.checkNotEmpty(zzrVar.zza);
        Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzz(final zzr zzrVar) {
        Preconditions.checkNotEmpty(zzrVar.zza);
        Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzix
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(zzrVar);
            }
        });
    }
}
