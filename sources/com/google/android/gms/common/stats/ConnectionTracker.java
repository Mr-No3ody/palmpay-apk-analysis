package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class ConnectionTracker {
    private static final Object zzb = new Object();

    @Nullable
    private static volatile ConnectionTracker zzc;

    @NonNull
    @VisibleForTesting
    public final ConcurrentHashMap zza = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    @NonNull
    @KeepForSdk
    public static ConnectionTracker getInstance() {
        if (zzc == null) {
            synchronized (zzb) {
                try {
                    if (zzc == null) {
                        zzc = new ConnectionTracker();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ConnectionTracker connectionTracker = zzc;
        Preconditions.checkNotNull(connectionTracker);
        return connectionTracker;
    }

    private final boolean zzb(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, boolean z3, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.packageManager(context).getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!zzc(serviceConnection)) {
            return zze(context, intent, serviceConnection, i7, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        try {
            boolean zZze = zze(context, intent, serviceConnection, i7, executor);
            if (zZze) {
                return zZze;
            }
            this.zza.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            this.zza.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    private static boolean zzc(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzr);
    }

    private static void zzd(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static final boolean zze(Context context, Intent intent, ServiceConnection serviceConnection, int i7, @Nullable Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!PlatformVersion.isAtLeastQ() || executor == null) ? context.bindService(intent, serviceConnection, i7) : context.bindService(intent, i7, executor, serviceConnection);
    }

    @KeepForSdk
    public boolean bindService(@NonNull Context context, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i7) {
        return zzb(context, context.getClass().getName(), intent, serviceConnection, i7, true, null);
    }

    @KeepForSdk
    public void unbindService(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        if (zzc(serviceConnection)) {
            ConcurrentHashMap concurrentHashMap = this.zza;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    zzd(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
                    return;
                } finally {
                    this.zza.remove(serviceConnection);
                }
            }
        }
        zzd(context, serviceConnection);
    }

    @KeepForSdk
    public void unbindServiceSafe(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean zza(@NonNull Context context, @NonNull String str, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i7, @Nullable Executor executor) {
        return zzb(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
