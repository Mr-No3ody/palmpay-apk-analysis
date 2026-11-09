package com.google.android.gms.measurement.internal;

import F0.j;
import M.f;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.config.BillBusinessType;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlj extends zzg {

    @VisibleForTesting
    protected zzky zza;
    final zzx zzb;

    @VisibleForTesting
    protected boolean zzc;
    private zzjp zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private boolean zzi;
    private int zzj;
    private zzaz zzk;
    private zzaz zzl;
    private PriorityQueue zzm;

    @GuardedBy("consentLock")
    private zzjl zzn;
    private final AtomicLong zzo;
    private long zzp;
    private zzaz zzq;
    private SharedPreferences.OnSharedPreferenceChangeListener zzr;
    private zzaz zzs;
    private final zzpo zzt;

    public zzlj(zzic zzicVar) {
        super(zzicVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzi = false;
        this.zzj = 1;
        this.zzc = true;
        this.zzt = new zzkn(this);
        this.zzg = new AtomicReference();
        this.zzn = zzjl.zza;
        this.zzp = -1L;
        this.zzo = new AtomicLong(0L);
        this.zzb = new zzx(zzicVar);
    }

    private final zzlr zzap(final zzom zzomVar) {
        try {
            URL url = new URI(zzomVar.zzc).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strZzl = this.zzu.zzv().zzl();
            zzic zzicVar = this.zzu;
            zzgs zzgsVarZzk = zzicVar.zzaW().zzk();
            Long lValueOf = Long.valueOf(zzomVar.zza);
            zzgsVarZzk.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.zzc, Integer.valueOf(zzomVar.zzb.length));
            if (!TextUtils.isEmpty(zzomVar.zzg)) {
                zzicVar.zzaW().zzk().zzc("[sgtm] Uploading data from app. row_id", lValueOf, zzomVar.zzg);
            }
            HashMap map = new HashMap();
            Bundle bundle = zzomVar.zzd;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            zzlo zzloVarZzn = zzicVar.zzn();
            byte[] bArr = zzomVar.zzb;
            zzll zzllVar = new zzll() { // from class: com.google.android.gms.measurement.internal.zzkz
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r8
                  0x002e: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.zzll
                public final /* synthetic */ void zza(String str2, int i7, Throwable th, byte[] bArr2, Map map2) {
                    zzlr zzlrVar;
                    zzlj zzljVar = this.zza;
                    zzljVar.zzg();
                    zzom zzomVar2 = zzomVar;
                    if (i7 == 200 || i7 == 204) {
                        if (th == null) {
                            zzljVar.zzu.zzaW().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.zza));
                            zzlrVar = zzlr.SUCCESS;
                        } else {
                            zzljVar.zzu.zzaW().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i7), th);
                            if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i7))) {
                                zzlrVar = zzlr.BACKOFF;
                            } else {
                                zzlrVar = zzlr.FAILURE;
                            }
                        }
                    } else if (i7 == 304) {
                        i7 = 304;
                        if (th == null) {
                            zzljVar.zzu.zzaW().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.zza));
                            zzlrVar = zzlr.SUCCESS;
                        } else {
                            zzljVar.zzu.zzaW().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i7), th);
                            if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i7))) {
                                zzlrVar = zzlr.BACKOFF;
                            } else {
                                zzlrVar = zzlr.FAILURE;
                            }
                        }
                    } else {
                        zzljVar.zzu.zzaW().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i7), th);
                        if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i7))) {
                            zzlrVar = zzlr.BACKOFF;
                        } else {
                            zzlrVar = zzlr.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    zznl zznlVarZzt = zzljVar.zzu.zzt();
                    long j6 = zzomVar2.zza;
                    zznlVarZzt.zzy(new zzaf(j6, zzlrVar.zza(), zzomVar2.zzf));
                    zzljVar.zzu.zzaW().zzk().zzc("[sgtm] Updated status for row_id", Long.valueOf(j6), zzlrVar);
                    synchronized (atomicReference2) {
                        atomicReference2.set(zzlrVar);
                        atomicReference2.notifyAll();
                    }
                }
            };
            zzloVarZzn.zzw();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(bArr);
            Preconditions.checkNotNull(zzllVar);
            zzloVarZzn.zzu.zzaX().zzm(new zzln(zzloVarZzn, strZzl, url, bArr, map, zzllVar));
            try {
                zzic zzicVar2 = zzicVar.zzk().zzu;
                long jCurrentTimeMillis = zzicVar2.zzba().currentTimeMillis() + 60000;
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = 60000; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - zzicVar2.zzba().currentTimeMillis()) {
                        try {
                            atomicReference.wait(jCurrentTimeMillis2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                d.t(this.zzu, "[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? zzlr.UNKNOWN : (zzlr) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.zzu.zzaW().zzb().zzd("[sgtm] Bad upload url for row_id", zzomVar.zzc, Long.valueOf(zzomVar.zza), e10);
            return zzlr.FAILURE;
        }
    }

    @WorkerThread
    private final void zzaq(Boolean bool, boolean z3) {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzj().zzb("Setting app measurement enabled (FE)", bool);
        zzicVar.zzd().zzh(bool);
        if (z3) {
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzu.zzE() || !(bool == null || bool.booleanValue())) {
            zzak();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
    public final void zzak() {
        zzlj zzljVar;
        zzg();
        zzic zzicVar = this.zzu;
        String strZza = zzicVar.zzd().zzh.zza();
        if (strZza == null) {
            zzljVar = this;
        } else if ("unset".equals(strZza)) {
            zzljVar = this;
            zzljVar.zzM("app", "_npa", null, zzicVar.zzba().currentTimeMillis());
        } else {
            zzM("app", "_npa", Long.valueOf(true != "true".equals(strZza) ? 0L : 1L), zzicVar.zzba().currentTimeMillis());
            zzljVar = this;
        }
        if (!zzljVar.zzu.zzB() || !zzljVar.zzc) {
            zzicVar.zzaW().zzj().zza("Updating Scion state (FE)");
            zzljVar.zzu.zzt().zzi();
        } else {
            zzicVar.zzaW().zzj().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzT();
            zzljVar.zzu.zzh().zza.zza();
            zzicVar.zzaX().zzj(new zzjz(this));
        }
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        zzic zzicVar = this.zzu;
        zzB(str, str2, bundle, true, true, zzicVar.zzba().currentTimeMillis(), zzicVar.zzc().zzp(null, zzfy.zzbe) ? zzicVar.zzba().elapsedRealtime() : 0L);
    }

    public final void zzB(String str, String str2, Bundle bundle, boolean z3, boolean z8, long j6, long j10) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            zzic zzicVar = this.zzu;
            zzicVar.zzs().zzj(bundle2, j6, true != zzicVar.zzc().zzp(null, zzfy.zzbe) ? 0L : j10);
            return;
        }
        long j11 = 0;
        boolean z10 = !z8 || this.zzd == null || zzpp.zzac(str2);
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (true == this.zzu.zzc().zzp(null, zzfy.zzbe)) {
            j11 = j10;
        }
        zzI(str3, str2, j6, j11, bundle2, z8, z10, z3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final void zzC() {
        zzod zzodVar;
        zzabx zzabxVar;
        zzg();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzj().zza("Handle tcf update.");
        SharedPreferences sharedPreferencesZze = zzicVar.zzd().zze();
        int i7 = zzof.zzb;
        zzabw zzabwVar = zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        zzoe zzoeVar = zzoe.CONSENT;
        zzabw zzabwVar2 = zzabw.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
        zzoe zzoeVar2 = zzoe.FLEXIBLE_LEGITIMATE_INTEREST;
        ImmutableMap immutableMapOf = ImmutableMap.of(zzabwVar, zzoeVar, zzabwVar2, zzoeVar2, zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, zzoeVar, zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, zzoeVar, zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, zzoeVar2, zzabw.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, zzoeVar2, zzabw.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, zzoeVar2);
        ImmutableSet immutableSetOf = ImmutableSet.of("CH");
        char[] cArr = new char[5];
        boolean zContains = sharedPreferencesZze.contains("IABTCF_TCString");
        int iZzb = zzof.zzb(sharedPreferencesZze, "IABTCF_CmpSdkID");
        int iZzb2 = zzof.zzb(sharedPreferencesZze, "IABTCF_PolicyVersion");
        int iZzb3 = zzof.zzb(sharedPreferencesZze, "IABTCF_gdprApplies");
        int iZzb4 = zzof.zzb(sharedPreferencesZze, "IABTCF_PurposeOneTreatment");
        int iZzb5 = zzof.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
        String strZza = zzof.zza(sharedPreferencesZze, "IABTCF_PublisherCC");
        ImmutableMap.Builder builder = ImmutableMap.builder();
        UnmodifiableIterator it = immutableMapOf.keySet().iterator();
        while (it.hasNext()) {
            zzabw zzabwVar3 = (zzabw) it.next();
            int iZza = zzabwVar3.zza();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
            sb2.append("IABTCF_PublisherRestrictions");
            sb2.append(iZza);
            String strZza2 = zzof.zza(sharedPreferencesZze, sb2.toString());
            if (TextUtils.isEmpty(strZza2) || strZza2.length() < 755) {
                zzabxVar = zzabx.PURPOSE_RESTRICTION_UNDEFINED;
            } else {
                int iDigit = Character.digit(strZza2.charAt(754), 10);
                if (iDigit < 0 || iDigit > zzabx.values().length || iDigit == 0) {
                    zzabxVar = zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED;
                } else if (iDigit != 1) {
                    zzabxVar = iDigit != 2 ? zzabx.PURPOSE_RESTRICTION_UNDEFINED : zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                } else {
                    zzabxVar = zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
            }
            builder.put(zzabwVar3, zzabxVar);
        }
        ImmutableMap immutableMapBuildOrThrow = builder.buildOrThrow();
        String strZza3 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeConsents");
        String strZza4 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorConsents");
        boolean z3 = !TextUtils.isEmpty(strZza4) && strZza4.length() >= 755 && strZza4.charAt(754) == '1';
        String strZza5 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeLegitimateInterests");
        String strZza6 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorLegitimateInterests");
        boolean z8 = !TextUtils.isEmpty(strZza6) && strZza6.length() >= 755 && strZza6.charAt(754) == '1';
        cArr[0] = '2';
        zzod zzodVar2 = new zzod(zzof.zzd(immutableMapOf, immutableMapBuildOrThrow, immutableSetOf, cArr, iZzb, iZzb5, iZzb3, iZzb2, iZzb4, strZza, strZza3, strZza5, z3, z8, zContains));
        zzicVar.zzaW().zzk().zzb("Tcf preferences read", zzodVar2);
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzhhVarZzd.zzg();
        String string = zzhhVarZzd.zzd().getString("stored_tcf_param", "");
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(string)) {
            zzodVar = new zzod(map);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && zzof.zza.contains(strArrSplit[0])) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzodVar = new zzod(map);
        }
        zzhh zzhhVarZzd2 = zzicVar.zzd();
        zzhhVarZzd2.zzg();
        String string2 = zzhhVarZzd2.zzd().getString("stored_tcf_param", "");
        String strZza7 = zzodVar2.zza();
        if (strZza7.equals(string2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = zzhhVarZzd2.zzd().edit();
        editorEdit.putString("stored_tcf_param", strZza7);
        editorEdit.apply();
        Bundle bundleZzb = zzodVar2.zzb();
        zzicVar.zzaW().zzk().zzb("Consent generated from Tcf", bundleZzb);
        if (bundleZzb != Bundle.EMPTY) {
            zzp(bundleZzb, -30, zzicVar.zzba().currentTimeMillis());
        }
        Bundle bundle = new Bundle();
        bundle.putString("_tcfm", zzodVar2.zzd(zzodVar));
        bundle.putString("_tcfd2", zzodVar2.zzc());
        bundle.putString("_tcfd", zzodVar2.zze());
        zzE("auto", "_tcf", bundle);
    }

    @WorkerThread
    public final void zzD() {
        zzg();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzj().zza("Register tcfPrefChangeListener.");
        if (this.zzr == null) {
            this.zzs = new zzkb(this, this.zzu);
            this.zzr = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.zza.zzaf(sharedPreferences, str);
                }
            };
        }
        zzicVar.zzd().zze().registerOnSharedPreferenceChangeListener(this.zzr);
    }

    @WorkerThread
    public final void zzE(String str, String str2, Bundle bundle) {
        zzg();
        zzic zzicVar = this.zzu;
        zzF(str, str2, zzicVar.zzba().currentTimeMillis(), zzicVar.zzc().zzp(null, zzfy.zzbe) ? zzicVar.zzba().elapsedRealtime() : 0L, bundle);
    }

    @WorkerThread
    public final void zzF(String str, String str2, long j6, long j10, Bundle bundle) {
        zzg();
        boolean z3 = true;
        if (this.zzd != null && !zzpp.zzac(str2)) {
            z3 = false;
        }
        zzG(str, str2, j6, j10, bundle, true, z3, true, null);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:136:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:139:0x0407  */
    /* JADX WARN: Code duplicated, block: B:141:0x040b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0418  */
    /* JADX WARN: Code duplicated, block: B:144:0x041c  */
    /* JADX WARN: Code duplicated, block: B:145:0x042c  */
    /* JADX WARN: Code duplicated, block: B:147:0x042f  */
    /* JADX WARN: Code duplicated, block: B:152:0x043f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0447  */
    /* JADX WARN: Code duplicated, block: B:155:0x044a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0451  */
    /* JADX WARN: Code duplicated, block: B:160:0x045c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0478  */
    /* JADX WARN: Code duplicated, block: B:166:0x0484 A[LOOP:2: B:164:0x047e->B:166:0x0484, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x0432 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0432 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0499 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final void zzG(String str, String str2, long j6, long j10, Bundle bundle, boolean z3, boolean z8, boolean z10, String str3) {
        boolean z11;
        int i7;
        zzic zzicVar;
        long j11;
        zzic zzicVar2;
        zzlj zzljVar;
        ArrayList arrayList;
        int size;
        int i10;
        int i11;
        Bundle bundleZzae;
        String str4;
        Bundle bundle2;
        Iterator it;
        String str5;
        Object obj;
        Bundle[] bundleArr;
        int i12;
        String str6 = str;
        Preconditions.checkNotEmpty(str6);
        Preconditions.checkNotNull(bundle);
        zzg();
        zzb();
        zzic zzicVar3 = this.zzu;
        if (!zzicVar3.zzB()) {
            this.zzu.zzaW().zzj().zza("Event not sent since app measurement is disabled");
            return;
        }
        List listZzp = this.zzu.zzv().zzp();
        if (listZzp != null && !listZzp.contains(str2)) {
            this.zzu.zzaW().zzj().zzc("Dropping non-safelisted event. event name, origin", str2, str6);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!zzicVar3.zzp() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzu.zzaZ().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzu.zzaZ());
                } catch (Exception e10) {
                    this.zzu.zzaW().zze().zzb("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.zzu.zzaW().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        zzic zzicVar4 = this.zzu;
        if (!zzicVar4.zzc().zzp(null, zzfy.zzaZ) && Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            zzicVar4.zzaV();
            zzM("auto", "_lgclid", bundle.getString("gclid"), zzicVar4.zzba().currentTimeMillis());
        }
        zzicVar4.zzaV();
        if (z3 && zzpp.zzai(str2)) {
            zzicVar4.zzk().zzK(bundle, zzicVar4.zzd().zzt.zza());
        }
        if (!z10) {
            zzicVar4.zzaV();
            if (!"_iap".equals(str2)) {
                zzic zzicVar5 = this.zzu;
                zzpp zzppVarZzk = zzicVar5.zzk();
                if (zzppVarZzk.zzk("event", str2)) {
                    zzic zzicVar6 = zzppVarZzk.zzu;
                    if (zzppVarZzk.zzm("event", zzjm.zza, zzicVar6.zzc().zzp(null, zzfy.zzbf) ? zzjm.zzc : zzjm.zzb, str2)) {
                        zzicVar6.zzc();
                        if (zzppVarZzk.zzn("event", 40, str2)) {
                            i12 = 0;
                        } else {
                            i12 = 2;
                        }
                    } else {
                        i12 = 13;
                    }
                } else {
                    i12 = 2;
                }
                if (i12 != 0) {
                    zzicVar4.zzaW().zzd().zzb("Invalid public event name. Event will not be logged (FE)", zzicVar4.zzl().zza(str2));
                    zzpp zzppVarZzk2 = zzicVar5.zzk();
                    zzicVar5.zzc();
                    zzicVar5.zzk().zzP(this.zzt, null, i12, "_ev", zzppVarZzk2.zzE(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzicVar4.zzaV();
        zzic zzicVar7 = this.zzu;
        zzlu zzluVarZzh = zzicVar7.zzs().zzh(false);
        if (zzluVarZzh != null && !bundle.containsKey("_sc")) {
            zzluVarZzh.zzd = true;
        }
        zzpp.zzay(zzluVarZzh, bundle, z3 && !z10);
        boolean zEquals = "am".equals(str6);
        boolean zZzac = zzpp.zzac(str2);
        if (!z3 || this.zzd == null || zZzac) {
            z11 = zEquals;
        } else {
            if (!zEquals) {
                zzicVar4.zzaW().zzj().zzc("Passing event to registered event handler (FE)", zzicVar4.zzl().zza(str2), zzicVar4.zzl().zze(bundle));
                Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str6, str2, bundle, j6);
                return;
            }
            z11 = true;
        }
        zzic zzicVar8 = this.zzu;
        if (zzicVar8.zzH()) {
            int iZzp = zzicVar4.zzk().zzp(str2);
            if (iZzp != 0) {
                zzicVar4.zzaW().zzd().zzb("Invalid event name. Event will not be logged (FE)", zzicVar4.zzl().zza(str2));
                zzpp zzppVarZzk3 = zzicVar4.zzk();
                zzicVar4.zzc();
                zzicVar8.zzk().zzP(this.zzt, str3, iZzp, "_ev", zzppVarZzk3.zzE(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleZzH = zzicVar4.zzk().zzH(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z10);
            Preconditions.checkNotNull(bundleZzH);
            zzicVar4.zzaV();
            String str7 = "_ae";
            if (zzicVar7.zzs().zzh(false) == null || !"_ae".equals(str2)) {
                i7 = 0;
                zzicVar = zzicVar7;
                j11 = 0;
            } else {
                zzoa zzoaVar = zzicVar7.zzh().zzb;
                j11 = 0;
                long jElapsedRealtime = zzoaVar.zzc.zzu.zzba().elapsedRealtime();
                i7 = 0;
                zzicVar = zzicVar7;
                long j12 = jElapsedRealtime - zzoaVar.zzb;
                zzoaVar.zzb = jElapsedRealtime;
                if (j12 > 0) {
                    zzicVar4.zzk().zzan(bundleZzH, j12);
                }
            }
            if (!"auto".equals(str6) && "_ssr".equals(str2)) {
                zzpp zzppVarZzk4 = zzicVar4.zzk();
                String string = bundleZzH.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                zzic zzicVar9 = zzppVarZzk4.zzu;
                if (Objects.equals(string, zzicVar9.zzd().zzq.zza())) {
                    zzicVar9.zzaW().zzj().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzicVar9.zzd().zzq.zzb(string);
            } else if ("_ae".equals(str2)) {
                String strZza = zzicVar4.zzk().zzu.zzd().zzq.zza();
                if (!TextUtils.isEmpty(strZza)) {
                    bundleZzH.putString("_ffr", strZza);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleZzH);
            boolean zZzi = zzicVar4.zzc().zzp(null, zzfy.zzaS) ? zzicVar.zzh().zzi() : zzicVar4.zzd().zzn.zza();
            if (zzicVar4.zzd().zzk.zza() > j11) {
                zzicVar2 = zzicVar4;
                if (zzicVar4.zzd().zzo(j6) && zZzi) {
                    zzicVar2.zzaW().zzk().zza("Current session is expired, remove the session number, ID, and engagement time");
                    j11 = j11;
                    str7 = "_ae";
                    zzM("auto", "_sid", null, zzicVar2.zzba().currentTimeMillis());
                    zzM("auto", "_sno", null, zzicVar2.zzba().currentTimeMillis());
                    zzM("auto", "_se", null, zzicVar2.zzba().currentTimeMillis());
                    zzljVar = this;
                    zzicVar2.zzd().zzl.zzb(j11);
                }
                if (bundleZzH.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j11) == 1) {
                    zzicVar2.zzaW().zzk().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    zzicVar8.zzh().zza.zzb(j6, j10, true);
                }
                arrayList = new ArrayList(bundleZzH.keySet());
                Collections.sort(arrayList);
                size = arrayList.size();
                for (i10 = i7; i10 < size; i10++) {
                    str5 = (String) arrayList.get(i10);
                    if (str5 != null) {
                        zzicVar2.zzk();
                        obj = bundleZzH.get(str5);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[1];
                            bundleArr[i7] = (Bundle) obj;
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            bundleZzH.putParcelableArray(str5, bundleArr);
                        }
                    }
                }
                i11 = i7;
                while (i11 < arrayList2.size()) {
                    bundleZzae = (Bundle) arrayList2.get(i11);
                    if (i11 != 0) {
                        str4 = "_ep";
                    } else {
                        str4 = str2;
                    }
                    bundleZzae.putString("_o", str6);
                    if (z8) {
                        bundleZzae = zzicVar2.zzk().zzae(bundleZzae, null);
                    }
                    bundle2 = bundleZzae;
                    zzicVar.zzt().zzn(new zzbh(str4, new zzbf(bundle2), str6, j6, j10), str3);
                    if (!z11) {
                        it = zzljVar.zze.iterator();
                        while (it.hasNext()) {
                            ((zzjq) it.next()).onEvent(str, str2, new Bundle(bundle2), j6);
                        }
                    }
                    i11++;
                    str6 = str;
                }
                zzicVar2.zzaV();
                if (zzicVar.zzs().zzh(i7) == null && str7.equals(str2)) {
                    zzicVar.zzh().zzb.zzd(true, true, zzicVar2.zzba().elapsedRealtime());
                    return;
                }
            }
            zzicVar2 = zzicVar4;
            zzljVar = this;
            if (bundleZzH.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j11) == 1) {
                zzicVar2.zzaW().zzk().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzicVar8.zzh().zza.zzb(j6, j10, true);
            }
            arrayList = new ArrayList(bundleZzH.keySet());
            Collections.sort(arrayList);
            size = arrayList.size();
            while (i10 < size) {
                str5 = (String) arrayList.get(i10);
                if (str5 != null) {
                    zzicVar2.zzk();
                    obj = bundleZzH.get(str5);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i7] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr2, parcelableArr2.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleZzH.putParcelableArray(str5, bundleArr);
                    }
                }
            }
            i11 = i7;
            while (i11 < arrayList2.size()) {
                bundleZzae = (Bundle) arrayList2.get(i11);
                if (i11 != 0) {
                    str4 = "_ep";
                } else {
                    str4 = str2;
                }
                bundleZzae.putString("_o", str6);
                if (z8) {
                    bundleZzae = zzicVar2.zzk().zzae(bundleZzae, null);
                }
                bundle2 = bundleZzae;
                zzicVar.zzt().zzn(new zzbh(str4, new zzbf(bundle2), str6, j6, j10), str3);
                if (!z11) {
                    it = zzljVar.zze.iterator();
                    while (it.hasNext()) {
                        ((zzjq) it.next()).onEvent(str, str2, new Bundle(bundle2), j6);
                    }
                }
                i11++;
                str6 = str;
            }
            zzicVar2.zzaV();
            if (zzicVar.zzs().zzh(i7) == null) {
            }
        }
    }

    public final void zzH(String str, String str2, Bundle bundle, String str3) {
        zzic.zzL();
        zzic zzicVar = this.zzu;
        zzI("auto", str2, zzicVar.zzba().currentTimeMillis(), zzicVar.zzc().zzp(null, zzfy.zzbe) ? zzicVar.zzba().elapsedRealtime() : 0L, bundle, false, true, true, str3);
    }

    public final void zzI(String str, String str2, long j6, long j10, Bundle bundle, boolean z3, boolean z8, boolean z10, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i7 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i7 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i7];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i7] = new Bundle((Bundle) parcelable);
                        }
                        i7++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i7 < list.size()) {
                        Object obj2 = list.get(i7);
                        if (obj2 instanceof Bundle) {
                            list.set(i7, new Bundle((Bundle) obj2));
                        }
                        i7++;
                    }
                }
            }
        }
        this.zzu.zzaX().zzj(new zzkc(this, str, str2, j6, j10, bundle2, z3, z8, z10, str3));
    }

    public final void zzJ(String str, String str2, Object obj, boolean z3) {
        zzK("auto", "_ldl", obj, true, this.zzu.zzba().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public final void zzK(String str, String str2, Object obj, boolean z3, long j6) {
        int i7;
        int iZzs;
        String str3;
        zzic zzicVar;
        int iZzM;
        Object objZzN;
        if (!z3) {
            zzpp zzppVarZzk = this.zzu.zzk();
            if (!zzppVarZzk.zzk("user property", str2)) {
                i7 = 6;
            } else if (zzppVarZzk.zzm("user property", zzjo.zza, null, str2)) {
                zzppVarZzk.zzu.zzc();
                if (zzppVarZzk.zzn("user property", 24, str2)) {
                    i7 = 0;
                } else {
                    i7 = 6;
                }
            } else {
                iZzs = 15;
            }
            if (i7 != 0) {
                zzic zzicVar2 = this.zzu;
                zzpp zzppVarZzk2 = zzicVar2.zzk();
                zzicVar2.zzc();
                this.zzu.zzk().zzP(this.zzt, null, i7, "_ev", zzppVarZzk2.zzE(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            if (str == null) {
                str3 = "app";
            } else {
                str3 = str;
            }
            if (obj != null) {
                zzL(str3, str2, j6, null);
                return;
            }
            zzicVar = this.zzu;
            iZzM = zzicVar.zzk().zzM(str2, obj);
            if (iZzM != 0) {
                objZzN = zzicVar.zzk().zzN(str2, obj);
                if (objZzN != null) {
                    zzL(str3, str2, j6, objZzN);
                    return;
                }
                return;
            }
            zzpp zzppVarZzk3 = zzicVar.zzk();
            zzicVar.zzc();
            this.zzu.zzk().zzP(this.zzt, null, iZzM, "_ev", zzppVarZzk3.zzE(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        }
        iZzs = this.zzu.zzk().zzs(str2);
        i7 = iZzs;
        if (i7 != 0) {
            zzic zzicVar3 = this.zzu;
            zzpp zzppVarZzk4 = zzicVar3.zzk();
            zzicVar3.zzc();
            if (str2 != null) {
            }
            this.zzu.zzk().zzP(this.zzt, null, i7, "_ev", zzppVarZzk4.zzE(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            zzL(str3, str2, j6, null);
            return;
        }
        zzicVar = this.zzu;
        iZzM = zzicVar.zzk().zzM(str2, obj);
        if (iZzM != 0) {
            objZzN = zzicVar.zzk().zzN(str2, obj);
            if (objZzN != null) {
                zzL(str3, str2, j6, objZzN);
                return;
            }
            return;
        }
        zzpp zzppVarZzk5 = zzicVar.zzk();
        zzicVar.zzc();
        this.zzu.zzk().zzP(this.zzt, null, iZzM, "_ev", zzppVarZzk5.zzE(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
    }

    public final void zzL(String str, String str2, long j6, Object obj) {
        this.zzu.zzaX().zzj(new zzkd(this, str, str2, obj, j6));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    @WorkerThread
    public final void zzM(String str, String str2, Object obj, long j6) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzb();
        Object obj2 = obj;
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j10 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    zzic zzicVar = this.zzu;
                    Long lValueOf = Long.valueOf(j10);
                    zzicVar.zzd().zzh.zzb(lValueOf.longValue() == 1 ? "true" : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    this.zzu.zzd().zzh.zzb("unset");
                    obj = obj;
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.zzu.zzd().zzh.zzb("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.zzu.zzaW().zzk().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str4 = str2;
        Object obj3 = obj2;
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzB()) {
            this.zzu.zzaW().zzk().zza("User property not set since app measurement is disabled");
        } else if (zzicVar2.zzH()) {
            this.zzu.zzt().zzA(new zzpl(str4, j6, obj3, str));
        }
    }

    public final List zzN(boolean z3) {
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzk().zza("Getting user properties (FE)");
        if (zzicVar.zzaX().zze()) {
            d.r(zzicVar, "Cannot get all user properties from analytics worker thread");
            return Collections.EMPTY_LIST;
        }
        zzicVar.zzaV();
        if (zzae.zza()) {
            d.r(zzicVar, "Cannot get all user properties from main thread");
            return Collections.EMPTY_LIST;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zzk(atomicReference, 5000L, "get user properties", new zzkf(this, atomicReference, z3));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzicVar.zzaW().zzb().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z3));
        return Collections.EMPTY_LIST;
    }

    public final Map zzO(String str, String str2, boolean z3) {
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaX().zze()) {
            d.r(zzicVar, "Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        zzicVar.zzaV();
        if (zzae.zza()) {
            d.r(zzicVar, "Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zzk(atomicReference, 5000L, "get user properties", new zzkl(this, atomicReference, null, str, str2, z3));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            zzicVar.zzaW().zzb().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z3));
            return Collections.EMPTY_MAP;
        }
        f fVar = new f(list.size());
        for (zzpl zzplVar : list) {
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                fVar.put(zzplVar.zzb, objZza);
            }
        }
        return fVar;
    }

    public final String zzP() {
        return (String) this.zzg.get();
    }

    public final void zzQ(String str) {
        this.zzg.set(str);
    }

    @WorkerThread
    public final void zzR() {
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzo.zza()) {
            zzicVar.zzaW().zzj().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jZza = zzicVar.zzd().zzp.zza();
        zzicVar.zzd().zzp.zzb(1 + jZza);
        zzicVar.zzc();
        if (jZza >= 5) {
            zzicVar.zzaW().zze().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzicVar.zzd().zzo.zzb(true);
        } else {
            if (this.zzq == null) {
                this.zzq = new zzkg(this, this.zzu);
            }
            this.zzq.zzb(0L);
        }
    }

    public final void zzS(long j6, long j10) {
        this.zzg.set(null);
        this.zzu.zzaX().zzj(new zzkh(this, j6));
    }

    @WorkerThread
    public final void zzT() {
        zzg();
        zzb();
        if (this.zzu.zzH()) {
            zzic zzicVar = this.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzalVarZzc.zzu.zzaV();
            Boolean boolZzr = zzalVarZzc.zzr("google_analytics_deferred_deep_link_enabled");
            if (boolZzr != null && boolZzr.booleanValue()) {
                zzicVar.zzaW().zzj().zza("Deferred Deep Link feature enabled.");
                zzicVar.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlh
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzR();
                    }
                });
            }
            this.zzu.zzt().zzE();
            this.zzc = false;
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzhhVarZzd.zzg();
            String string = zzhhVarZzd.zzd().getString("previous_os_version", null);
            zzhhVarZzd.zzu.zzu().zzw();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zzicVar.zzu().zzw();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzE("auto", "_ou", bundle);
        }
    }

    @WorkerThread
    public final void zzU(zzjp zzjpVar) {
        zzjp zzjpVar2;
        zzg();
        zzb();
        if (zzjpVar != null && zzjpVar != (zzjpVar2 = this.zzd)) {
            Preconditions.checkState(zzjpVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzjpVar;
    }

    public final void zzV(zzjq zzjqVar) {
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.add(zzjqVar)) {
            return;
        }
        d.t(this.zzu, "OnEventListener already registered");
    }

    public final void zzW(zzjq zzjqVar) {
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.remove(zzjqVar)) {
            return;
        }
        d.t(this.zzu, "OnEventListener had not been registered");
    }

    public final int zzX(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzu.zzc();
        return 25;
    }

    public final void zzY(Bundle bundle) {
        zzZ(bundle, this.zzu.zzba().currentTimeMillis());
    }

    public final void zzZ(Bundle bundle, long j6) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            d.t(this.zzu, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzjh.zzb(bundle2, "app_id", String.class, null);
        zzjh.zzb(bundle2, "origin", String.class, null);
        zzjh.zzb(bundle2, "name", String.class, null);
        zzjh.zzb(bundle2, "value", Object.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j6);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        zzic zzicVar = this.zzu;
        if (zzicVar.zzk().zzs(string) != 0) {
            zzicVar.zzaW().zzb().zzb("Invalid conditional user property name", zzicVar.zzl().zzc(string));
            return;
        }
        if (zzicVar.zzk().zzM(string, obj) != 0) {
            zzicVar.zzaW().zzb().zzc("Invalid conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        Object objZzN = zzicVar.zzk().zzN(string, obj);
        if (objZzN == null) {
            zzicVar.zzaW().zzb().zzc("Unable to normalize conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        zzjh.zza(bundle2, objZzN);
        long j10 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            zzicVar.zzc();
            if (j10 > 15552000000L || j10 < 1) {
                zzicVar.zzaW().zzb().zzc("Invalid conditional user property timeout", zzicVar.zzl().zzc(string), Long.valueOf(j10));
                return;
            }
        }
        long j11 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        zzicVar.zzc();
        if (j11 > 15552000000L || j11 < 1) {
            zzicVar.zzaW().zzb().zzc("Invalid conditional user property time to live", zzicVar.zzl().zzc(string), Long.valueOf(j11));
        } else {
            zzicVar.zzaX().zzj(new zzki(this, bundle2));
        }
    }

    public final void zzaa(String str, String str2, Bundle bundle) {
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzba().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzicVar.zzaX().zzj(new zzkj(this, bundle2));
    }

    public final ArrayList zzab(String str, String str2) {
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaX().zze()) {
            zzicVar.zzaW().zzb().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        zzicVar.zzaV();
        if (zzae.zza()) {
            zzicVar.zzaW().zzb().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zzk(atomicReference, 5000L, "get conditional user properties", new zzkk(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzpp.zzav(list);
        }
        zzicVar.zzaW().zzb().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String zzac() {
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            return zzluVarZzl.zza;
        }
        return null;
    }

    public final String zzad() {
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            return zzluVarZzl.zzb;
        }
        return null;
    }

    public final String zzae() {
        try {
            return zzlt.zza(this.zzu.zzaZ(), "google_app_id", this.zzu.zzq());
        } catch (IllegalStateException e10) {
            this.zzu.zzaW().zzb().zzb("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final /* synthetic */ void zzaf(SharedPreferences sharedPreferences, String str) {
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            this.zzu.zzaW().zzk().zza("IABTCF_TCString change picked up in listener.");
            ((zzaz) Preconditions.checkNotNull(this.zzs)).zzb(500L);
        }
    }

    public final /* synthetic */ void zzag(Bundle bundle) {
        int i7;
        if (!bundle.isEmpty()) {
            zzic zzicVar = this.zzu;
            Bundle bundle2 = new Bundle(zzicVar.zzd().zzt.zza());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i7 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (zzicVar.zzk().zzz(obj)) {
                        zzicVar.zzk().zzP(this.zzt, null, 27, null, null, 0);
                    }
                    zzicVar.zzaW().zzh().zzc("Invalid default event parameter type. Name, value", next, obj);
                } else if (zzpp.zzac(next)) {
                    zzicVar.zzaW().zzh().zzb("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (zzicVar.zzk().zzA("param", next, zzicVar.zzc().zze(null, false), obj)) {
                    zzicVar.zzk().zzO(bundle2, next, obj);
                }
            }
            zzicVar.zzk();
            int iZzc = zzicVar.zzc().zzc();
            if (bundle2.size() > iZzc) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i7++;
                    if (i7 > iZzc) {
                        bundle2.remove(str);
                    }
                }
                zzicVar.zzk().zzP(this.zzt, null, 26, null, null, 0);
                zzicVar.zzaW().zzh().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            bundle = bundle2;
        }
        this.zzu.zzd().zzt.zzb(bundle);
        this.zzu.zzt().zzH(bundle);
    }

    public final /* synthetic */ void zzah(int i7) {
        if (this.zzk == null) {
            this.zzk = new zzjx(this, this.zzu);
        }
        this.zzk.zzb(((long) i7) * 1000);
    }

    public final /* synthetic */ void zzai(Boolean bool, boolean z3) {
        zzaq(bool, true);
    }

    public final /* synthetic */ void zzaj(zzjl zzjlVar, long j6, boolean z3, boolean z8) {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzjl zzjlVarZzl = zzicVar.zzd().zzl();
        if (j6 <= this.zzp && zzjl.zzu(zzjlVarZzl.zzb(), zzjlVar.zzb())) {
            zzicVar.zzaW().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzjlVar);
            return;
        }
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzic zzicVar2 = zzhhVarZzd.zzu;
        zzhhVarZzd.zzg();
        int iZzb = zzjlVar.zzb();
        if (!zzhhVarZzd.zzk(iZzb)) {
            zzicVar.zzaW().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjlVar.zzb()));
            return;
        }
        zzic zzicVar3 = this.zzu;
        SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
        editorEdit.putString("consent_settings", zzjlVar.zzl());
        editorEdit.putInt("consent_source", iZzb);
        editorEdit.apply();
        zzicVar.zzaW().zzk().zzb("Setting storage consent(FE)", zzjlVar);
        this.zzp = j6;
        if (zzicVar3.zzt().zzP()) {
            zzicVar3.zzt().zzk(z3);
        } else {
            zzicVar3.zzt().zzj(z3);
        }
        if (z8) {
            zzicVar3.zzt().zzC(new AtomicReference());
        }
    }

    public final /* synthetic */ void zzal(boolean z3) {
        this.zzi = false;
    }

    public final /* synthetic */ int zzam() {
        return this.zzj;
    }

    public final /* synthetic */ void zzan(int i7) {
        this.zzj = i7;
    }

    public final /* synthetic */ zzaz zzao() {
        return this.zzq;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final void zzh() {
        zzic zzicVar = this.zzu;
        if (!(zzicVar.zzaZ().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) zzicVar.zzaZ().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzu.zzaX().zzk(atomicReference, 15000L, "boolean test flag value", new zzke(this, atomicReference));
    }

    public final String zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzu.zzaX().zzk(atomicReference, 15000L, "String test flag value", new zzko(this, atomicReference));
    }

    public final Long zzk() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzu.zzaX().zzk(atomicReference, 15000L, "long test flag value", new zzkp(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzu.zzaX().zzk(atomicReference, 15000L, "int test flag value", new zzkq(this, atomicReference));
    }

    public final Double zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzu.zzaX().zzk(atomicReference, 15000L, "double test flag value", new zzkr(this, atomicReference));
    }

    public final void zzn(Boolean bool) {
        zzb();
        this.zzu.zzaX().zzj(new zzks(this, bool));
    }

    @VisibleForTesting
    public final void zzp(Bundle bundle, int i7, long j6) {
        Object obj;
        String string;
        zzb();
        zzjl zzjlVar = zzjl.zza;
        zzjk[] zzjkVarArrZzb = zzjj.STORAGE.zzb();
        int length = zzjkVarArrZzb.length;
        int i10 = 0;
        while (true) {
            obj = null;
            if (i10 >= length) {
                break;
            }
            String str = zzjkVarArrZzb[i10].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i10++;
        }
        if (obj != null) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaW().zzh().zzb("Ignoring invalid consent setting", obj);
            zzicVar.zzaW().zzh().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zZze = this.zzu.zzaX().zze();
        zzjl zzjlVarZze = zzjl.zze(bundle, i7);
        if (zzjlVarZze.zzc()) {
            zzs(zzjlVarZze, zZze);
        }
        zzba zzbaVarZzh = zzba.zzh(bundle, i7);
        if (zzbaVarZzh.zzd()) {
            zzq(zzbaVarZzh, zZze);
        }
        Boolean boolZzi = zzba.zzi(bundle);
        if (boolZzi != null) {
            String str2 = i7 == -30 ? "tcf" : "app";
            if (zZze) {
                zzM(str2, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolZzi.toString(), j6);
            } else {
                zzK(str2, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolZzi.toString(), false, j6);
            }
        }
    }

    public final void zzq(zzba zzbaVar, boolean z3) {
        zzkt zzktVar = new zzkt(this, zzbaVar);
        if (!z3) {
            this.zzu.zzaX().zzj(zzktVar);
        } else {
            zzg();
            zzktVar.run();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:55:0x00cf
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void zzs(com.google.android.gms.measurement.internal.zzjl r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.zzs(com.google.android.gms.measurement.internal.zzjl, boolean):void");
    }

    public final void zzt(Runnable runnable) {
        zzb();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaX().zze()) {
            d.r(zzicVar, "Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (zzicVar.zzaX().zzf()) {
            d.r(zzicVar, "Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        zzicVar.zzaV();
        if (zzae.zza()) {
            d.r(zzicVar, "Cannot retrieve and upload batches from main thread");
            return;
        }
        zzicVar.zzaW().zzk().zza("[sgtm] Started client-side batch upload work.");
        boolean z3 = false;
        int size = 0;
        int i7 = 0;
        while (!z3) {
            zzicVar.zzaW().zzk().zza("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaX().zzk(atomicReference, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzli
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu.zzt().zzx(atomicReference, zzoo.zza(zzls.SGTM_CLIENT));
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.zza;
            if (!list.isEmpty()) {
                zzicVar.zzaW().zzk().zzb("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                    }
                    zzlr zzlrVarZzap = zzap((zzom) it.next());
                    if (zzlrVarZzap == zzlr.SUCCESS) {
                        i7++;
                    } else if (zzlrVarZzap == zzlr.BACKOFF) {
                        z3 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        zzicVar.zzaW().zzk().zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i7));
        runnable.run();
    }

    @WorkerThread
    public final void zzu(long j6) {
        zzg();
        if (this.zzl == null) {
            this.zzl = new zzju(this, this.zzu);
        }
        this.zzl.zzb(j6);
    }

    @WorkerThread
    public final void zzv() {
        zzg();
        zzaz zzazVar = this.zzl;
        if (zzazVar != null) {
            zzazVar.zzd();
        }
    }

    public final void zzw() {
        zzaif.zza();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzp(null, zzfy.zzaP)) {
            if (zzicVar.zzaX().zze()) {
                d.r(zzicVar, "Cannot get trigger URIs from analytics worker thread");
                return;
            }
            zzicVar.zzaV();
            if (zzae.zza()) {
                d.r(zzicVar, "Cannot get trigger URIs from main thread");
                return;
            }
            zzb();
            zzicVar.zzaW().zzk().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaX().zzk(atomicReference, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzla
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzlj zzljVar = this.zza;
                    zzljVar.zzu.zzt().zzw(atomicReference, zzljVar.zzu.zzd().zzi.zza());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzicVar.zzaW().zzd().zza("Timed out waiting for get trigger URIs");
            } else {
                zzicVar.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzlj zzljVar = this.zza;
                        zzljVar.zzg();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzoh> list2 = list;
                        SparseArray sparseArrayZzf = zzljVar.zzu.zzd().zzf();
                        for (zzoh zzohVar : list2) {
                            int i7 = zzohVar.zzc;
                            if (!sparseArrayZzf.contains(i7) || ((Long) sparseArrayZzf.get(i7)).longValue() < zzohVar.zzb) {
                                zzljVar.zzx().add(zzohVar);
                            }
                        }
                        zzljVar.zzy();
                    }
                });
            }
        }
    }

    @TargetApi(BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS)
    public final PriorityQueue zzx() {
        if (this.zzm == null) {
            this.zzm = new PriorityQueue(Comparator.comparing(zzlc.zza, zzld.zza));
        }
        return this.zzm;
    }

    @TargetApi(BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS)
    @WorkerThread
    public final void zzy() {
        zzoh zzohVar;
        zzg();
        if (zzx().isEmpty() || this.zzi || (zzohVar = (zzoh) zzx().poll()) == null) {
            return;
        }
        zzic zzicVar = this.zzu;
        j jVarZzV = zzicVar.zzk().zzV();
        if (jVarZzV != null) {
            this.zzi = true;
            zzgs zzgsVarZzk = zzicVar.zzaW().zzk();
            String str = zzohVar.zza;
            zzgsVarZzk.zzb("Registering trigger URI", str);
            ListenableFuture listenableFutureB = jVarZzV.b(Uri.parse(str));
            if (listenableFutureB != null) {
                Futures.addCallback(listenableFutureB, new zzjw(this, zzohVar), new zzjv(this));
            } else {
                this.zzi = false;
                zzx().add(zzohVar);
            }
        }
    }

    @WorkerThread
    public final void zzz(zzjl zzjlVar) {
        zzg();
        boolean z3 = (zzjlVar.zzo(zzjk.ANALYTICS_STORAGE) && zzjlVar.zzo(zzjk.AD_STORAGE)) || this.zzu.zzt().zzO();
        zzic zzicVar = this.zzu;
        if (z3 != zzicVar.zzE()) {
            zzicVar.zzD(z3);
            zzhh zzhhVarZzd = this.zzu.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            Boolean boolValueOf = zzhhVarZzd.zzd().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzhhVarZzd.zzd().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z3 || boolValueOf == null || boolValueOf.booleanValue()) {
                zzaq(Boolean.valueOf(z3), false);
            }
        }
    }
}
