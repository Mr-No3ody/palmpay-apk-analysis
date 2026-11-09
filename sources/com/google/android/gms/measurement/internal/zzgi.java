package com.google.android.gms.measurement.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.maps.android.BuildConfig;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgi extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private final String zzk;
    private int zzl;
    private String zzm;
    private String zzn;
    private long zzo;
    private String zzp;

    public zzgi(zzic zzicVar, long j6, long j10, String str) {
        super(zzicVar);
        this.zzo = 0L;
        this.zzp = null;
        this.zzg = j6;
        this.zzh = j10;
        this.zzk = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x0117  */
    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:45:0x0137  */
    /* JADX WARN: Code duplicated, block: B:46:0x0147  */
    /* JADX WARN: Code duplicated, block: B:47:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x0175  */
    /* JADX WARN: Code duplicated, block: B:52:0x0176 A[Catch: IllegalStateException -> 0x01a2, TryCatch #1 {IllegalStateException -> 0x01a2, blocks: (B:49:0x016d, B:53:0x0184, B:57:0x018c, B:59:0x0190, B:52:0x0176), top: B:83:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x018a  */
    /* JADX WARN: Code duplicated, block: B:56:0x018b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0190 A[Catch: IllegalStateException -> 0x01a2, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x01a2, blocks: (B:49:0x016d, B:53:0x0184, B:57:0x018c, B:59:0x0190, B:52:0x0176), top: B:83:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01df  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fc A[EDGE_INSN: B:75:0x01fc->B:76:0x01fe BREAK  A[LOOP:0: B:70:0x01e3->B:91:?]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0200  */
    /* JADX WARN: Code duplicated, block: B:79:0x020b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fc A[SYNTHETIC] */
    @Override // com.google.android.gms.measurement.internal.zzg
    @EnsuresNonNull({RemoteConfigConstants.RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    @WorkerThread
    public final void zzf() {
        String str;
        String string;
        zzic zzicVar;
        int iZzC;
        zzic zzicVar2;
        zzic zzicVar3;
        List listZzs;
        Iterator it;
        String strZza;
        zzic zzicVar4 = this.zzu;
        zzicVar4.zzaW().zzk().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        String packageName = zzicVar4.zzaZ().getPackageName();
        PackageManager packageManager = zzicVar4.zzaZ().getPackageManager();
        String str2 = "";
        int i7 = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.zzu.zzaW().zzb().zzb("Error retrieving app installer package name. appId", zzgu.zzl(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzu.zzaZ().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str3 = packageInfo.versionName;
                            i7 = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str3;
                            str3 = string;
                            this.zzu.zzaW().zzb().zzc("Error retrieving package info. appId, appName", zzgu.zzl(packageName), str3);
                            string = str3;
                            str3 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.zza = packageName;
                this.zzd = installerPackageName;
                this.zzb = str3;
                this.zzc = i7;
                this.zze = string;
                this.zzf = 0L;
                zzicVar = this.zzu;
                iZzC = zzicVar.zzC();
                if (iZzC != 0) {
                    this.zzu.zzaW().zzk().zza("App measurement collection enabled");
                } else if (iZzC != 1) {
                    this.zzu.zzaW().zzi().zza("App measurement deactivated via the manifest");
                } else if (iZzC != 3) {
                    this.zzu.zzaW().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iZzC != 4) {
                    this.zzu.zzaW().zzi().zza("App measurement disabled via the manifest");
                } else if (iZzC != 6) {
                    this.zzu.zzaW().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iZzC != 7) {
                    this.zzu.zzaW().zzi().zza("App measurement disabled via the global data collection setting");
                } else if (iZzC != 8) {
                    zzic zzicVar5 = this.zzu;
                    zzicVar5.zzaW().zzi().zza("App measurement disabled");
                    zzicVar5.zzaW().zzc().zza("Invalid scion state in identity");
                } else {
                    this.zzu.zzaW().zzi().zza("App measurement disabled due to denied storage consent");
                }
                this.zzm = "";
                zzicVar2 = this.zzu;
                zzicVar2.zzaV();
                strZza = this.zzk;
                if (!TextUtils.isEmpty(strZza)) {
                    strZza = zzlt.zza(zzicVar2.zzaZ(), "google_app_id", zzicVar.zzq());
                }
                if (TextUtils.isEmpty(strZza)) {
                    str2 = strZza;
                }
                this.zzm = str2;
                if (iZzC == 0) {
                    zzicVar2.zzaW().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzm);
                }
                this.zzi = null;
                zzicVar3 = this.zzu;
                zzicVar3.zzaV();
                listZzs = zzicVar3.zzc().zzs("analytics.safelisted_events");
                if (listZzs != null) {
                    this.zzi = listZzs;
                    break;
                } else if (listZzs.isEmpty()) {
                    it = listZzs.iterator();
                    do {
                        if (it.hasNext()) {
                            this.zzi = listZzs;
                            break;
                        }
                    } while (zzicVar3.zzk().zzl("safelisted event", (String) it.next()));
                } else {
                    zzicVar3.zzaW().zzh().zza("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    this.zzl = InstantApps.isInstantApp(zzicVar3.zzaZ()) ? 1 : 0;
                } else {
                    this.zzl = 0;
                }
            }
            zzicVar4.zzaW().zzb().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzgu.zzl(packageName));
            strZza = this.zzk;
            if (!TextUtils.isEmpty(strZza)) {
                strZza = zzlt.zza(zzicVar2.zzaZ(), "google_app_id", zzicVar.zzq());
            }
            if (TextUtils.isEmpty(strZza)) {
                str2 = strZza;
            }
            this.zzm = str2;
            if (iZzC == 0) {
                zzicVar2.zzaW().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzm);
            }
        } catch (IllegalStateException e10) {
            this.zzu.zzaW().zzb().zzc("Fetching Google App Id failed with exception. appId", zzgu.zzl(packageName), e10);
        }
        string = "Unknown";
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str3;
        this.zzc = i7;
        this.zze = string;
        this.zzf = 0L;
        zzicVar = this.zzu;
        iZzC = zzicVar.zzC();
        if (iZzC != 0) {
            this.zzu.zzaW().zzk().zza("App measurement collection enabled");
        } else if (iZzC != 1) {
            this.zzu.zzaW().zzi().zza("App measurement deactivated via the manifest");
        } else if (iZzC != 3) {
            this.zzu.zzaW().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iZzC != 4) {
            this.zzu.zzaW().zzi().zza("App measurement disabled via the manifest");
        } else if (iZzC != 6) {
            this.zzu.zzaW().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iZzC != 7) {
            this.zzu.zzaW().zzi().zza("App measurement disabled via the global data collection setting");
        } else if (iZzC != 8) {
            zzic zzicVar6 = this.zzu;
            zzicVar6.zzaW().zzi().zza("App measurement disabled");
            zzicVar6.zzaW().zzc().zza("Invalid scion state in identity");
        } else {
            this.zzu.zzaW().zzi().zza("App measurement disabled due to denied storage consent");
        }
        this.zzm = "";
        zzicVar2 = this.zzu;
        zzicVar2.zzaV();
        this.zzi = null;
        zzicVar3 = this.zzu;
        zzicVar3.zzaV();
        listZzs = zzicVar3.zzc().zzs("analytics.safelisted_events");
        if (listZzs != null) {
            this.zzi = listZzs;
            break;
        } else if (listZzs.isEmpty()) {
            it = listZzs.iterator();
            do {
                if (it.hasNext()) {
                    this.zzi = listZzs;
                    break;
                }
            } while (zzicVar3.zzk().zzl("safelisted event", (String) it.next()));
        } else {
            zzicVar3.zzaW().zzh().zza("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            this.zzl = InstantApps.isInstantApp(zzicVar3.zzaZ()) ? 1 : 0;
        } else {
            this.zzl = 0;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @androidx.annotation.WorkerThread
    public final com.google.android.gms.measurement.internal.zzr zzh(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r48v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    @WorkerThread
    public final void zzi() {
        String str;
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzicVar.zzk().zzf().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzicVar.zzaW().zzj().zza("Analytics Storage consent is not granted");
            str = null;
        }
        zzicVar.zzaW().zzj().zza("Resetting session stitching token to ".concat(str == null ? BuildConfig.TRAVIS : "not null"));
        this.zzn = str;
        this.zzo = zzicVar.zzba().currentTimeMillis();
    }

    @WorkerThread
    public final String zzj() {
        zzb();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    @WorkerThread
    public final String zzk() {
        zzg();
        zzb();
        Preconditions.checkNotNull(this.zzm);
        return this.zzm;
    }

    @WorkerThread
    public final String zzl() {
        zzb();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    @WorkerThread
    public final int zzm() {
        zzb();
        return this.zzc;
    }

    public final long zzn() {
        return this.zzh;
    }

    @WorkerThread
    public final int zzo() {
        zzb();
        return this.zzl;
    }

    @WorkerThread
    public final List zzp() {
        return this.zzi;
    }

    public final boolean zzq(String str) {
        String str2 = this.zzp;
        boolean z3 = false;
        if (str2 != null && !str2.equals(str)) {
            z3 = true;
        }
        this.zzp = str;
        return z3;
    }
}
