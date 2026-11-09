package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzal;
import java.util.Arrays;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public class GoogleSignatureVerifier {

    @Nullable
    private static GoogleSignatureVerifier zza;

    @Nullable
    private static volatile Set zzd;

    @Nullable
    private static volatile Set zze;
    private final Context zzb;
    private volatile String zzc;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.zzb = context.getApplicationContext();
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (zza == null) {
                    zzo.zza(context);
                    zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static final boolean zza(PackageInfo packageInfo, boolean z3) {
        zzah zzahVarZzj;
        if (packageInfo != null) {
            if (z3 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z3 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                zzah zzahVar = z3 ? zzn.zzc : zzn.zzb;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    zzahVarZzj = byteArray != null ? zzah.zzk(byteArray) : zzah.zzj();
                } else {
                    com.google.android.gms.internal.common.zzr.zza(i7 >= 28);
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        zzahVarZzj = zzah.zzj();
                    } else {
                        int i10 = zzah.zzd;
                        com.google.android.gms.internal.common.zzad zzadVar = new com.google.android.gms.internal.common.zzad();
                        for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                            zzadVar.zzb(signature.toByteArray());
                        }
                        zzahVarZzj = zzadVar.zzd();
                    }
                }
                if (zzahVarZzj.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                zzah zzahVarZzh = zzahVarZzj.zzh();
                int size = zzahVarZzh.size();
                int i11 = 0;
                while (i11 < size) {
                    byte[] bArr = (byte[]) zzahVarZzh.get(i11);
                    zzal zzalVarListIterator = zzahVar.listIterator(0);
                    do {
                        int i12 = i11 + 1;
                        if (!zzalVarListIterator.hasNext()) {
                            i11 = i12;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) zzalVarListIterator.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                if ((z3 ? zzc(packageInfo, zzn.zza) : zzc(packageInfo, zzn.zza[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    @SuppressLint({"PackageManagerGetSignatures"})
    private final zzy zzb(@Nullable String str, boolean z3, boolean z8) {
        zzy zzyVarZzc;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return zzy.zzc("null pkg");
        }
        if (str.equals(this.zzc)) {
            return zzy.zzb();
        }
        int i7 = zzo.zzh;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzo.zzb();
                boolean zZzg = zzo.zzg.zzg();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (zZzg) {
                    zzv zzvVar = new zzv(null);
                    zzvVar.zza(str);
                    zzvVar.zzb(GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb));
                    zzvVar.zzc(true);
                    zzyVarZzc = zzo.zzc(zzvVar.zzd());
                } else {
                    threadPolicyAllowThreadDiskReads = Build.VERSION.SDK_INT;
                    try {
                        PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(str, threadPolicyAllowThreadDiskReads >= 28 ? 134217792 : 64);
                        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
                        if (packageInfo == null) {
                            zzyVarZzc = zzy.zzc("null pkg");
                        } else {
                            Signature[] signatureArr = packageInfo.signatures;
                            if (signatureArr == null || signatureArr.length != 1) {
                                zzyVarZzc = zzy.zzc("single cert required");
                            } else {
                                zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                                String str2 = packageInfo.packageName;
                                zzy zzyVarZzd = zzo.zzd(str2, zzkVar, zHonorsDebugCertificates, false);
                                zzyVarZzc = (!zzyVarZzd.zza || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !zzo.zzd(str2, zzkVar, false, true).zza) ? zzyVarZzd : zzy.zzc("debuggable release cert app rejected");
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        return zzy.zzd("no pkg ".concat(str), e10);
                    }
                }
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        } catch (RemoteException | DynamiteModule.LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
        if (zzyVarZzc.zza) {
            this.zzc = str;
        }
        return zzyVarZzc;
    }

    @Nullable
    private static zzj zzc(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
        for (int i7 = 0; i7 < zzjVarArr.length; i7++) {
            if (zzjVarArr[i7].equals(zzkVar)) {
                return zzjVarArr[i7];
            }
        }
        return null;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        return zza(packageInfo, true) && GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(@Nullable String str) {
        zzy zzyVarZzb = zzb(str, false, false);
        zzyVarZzb.zze();
        return zzyVarZzb.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i7) {
        zzy zzyVarZzc;
        String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i7);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            zzyVarZzc = zzy.zzc("no pkgs");
        } else {
            zzyVarZzc = null;
            for (String str : packagesForUid) {
                zzyVarZzc = zzb(str, false, false);
                if (!zzyVarZzc.zza) {
                }
            }
            Preconditions.checkNotNull(zzyVarZzc);
        }
        zzyVarZzc.zze();
        return zzyVarZzc.zza;
    }
}
