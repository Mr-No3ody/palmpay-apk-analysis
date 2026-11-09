package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzh;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class ProviderInstaller {

    @NonNull
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzb = new Object();

    @Nullable
    @GuardedBy("ProviderInstaller.lock")
    private static Method zzc = null;

    @GuardedBy("ProviderInstaller.lock")
    private static boolean zzd = false;

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i7, @Nullable Intent intent);

        void onProviderInstalled();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0015, B:7:0x001c, B:14:0x003b, B:15:0x0040, B:12:0x002d, B:17:0x0042, B:28:0x0085, B:29:0x008a, B:31:0x008c, B:32:0x009a, B:20:0x004d, B:22:0x0051, B:25:0x007b), top: B:39:0x0015, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[Catch: all -> 0x0029, TryCatch #2 {, blocks: (B:4:0x0015, B:7:0x001c, B:14:0x003b, B:15:0x0040, B:12:0x002d, B:17:0x0042, B:28:0x0085, B:29:0x008a, B:31:0x008c, B:32:0x009a, B:20:0x004d, B:22:0x0051, B:25:0x007b), top: B:39:0x0015, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x008c A[Catch: all -> 0x0029, TryCatch #2 {, blocks: (B:4:0x0015, B:7:0x001c, B:14:0x003b, B:15:0x0040, B:12:0x002d, B:17:0x0042, B:28:0x0085, B:29:0x008a, B:31:0x008c, B:32:0x009a, B:20:0x004d, B:22:0x0051, B:25:0x007b), top: B:39:0x0015, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void installIfNeeded(@NonNull Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        boolean z3;
        Context remoteContext;
        Context moduleContext;
        Preconditions.checkNotNull(context, "Context must not be null");
        zza.verifyGooglePlayServicesIsAvailable(context, 11925000);
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (zzb) {
            Context context2 = null;
            if (zzd) {
                z3 = zzd;
                remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                if (remoteContext == null) {
                    zzd = true;
                    if (!z3) {
                        zzj.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", remoteContext.getClassLoader(), zzi.zzb(Context.class, context), zzh.zza(jUptimeMillis), zzh.zza(SystemClock.uptimeMillis()));
                    }
                    context2 = remoteContext;
                }
                if (context2 != null) {
                    zzb(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            }
            try {
                moduleContext = DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.providerinstaller.dynamite").getModuleContext();
            } catch (DynamiteModule.LoadingException e10) {
                "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage()));
                moduleContext = null;
            }
            if (moduleContext != null) {
                zzb(moduleContext, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z3 = zzd;
            remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                zzd = true;
                if (!z3) {
                    try {
                        zzj.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", remoteContext.getClassLoader(), zzi.zzb(Context.class, context), zzh.zza(jUptimeMillis), zzh.zza(SystemClock.uptimeMillis()));
                    } catch (Exception e11) {
                        "Failed to report request stats: ".concat(e11.toString());
                    }
                }
                context2 = remoteContext;
            }
            if (context2 != null) {
                zzb(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException(8);
            }
            throw th;
        }
    }

    public static void installIfNeededAsync(@NonNull Context context, @NonNull ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new zza(context, providerInstallListener).execute(new Void[0]);
    }

    @GuardedBy("ProviderInstaller.lock")
    private static void zzb(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (zzc == null) {
                zzc = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            zzc.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
