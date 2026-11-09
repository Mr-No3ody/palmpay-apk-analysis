package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static Renderer zzc = Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    public static synchronized int initialize(@NonNull Context context) {
        return initialize(context, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    public static synchronized int initialize(@NonNull Context context, @Nullable Renderer renderer, @Nullable OnMapsSdkInitializedCallback onMapsSdkInitializedCallback) {
        Preconditions.checkNotNull(context, "Context is null");
        "preferredRenderer: ".concat(String.valueOf(renderer));
        if (!zzb) {
            try {
                com.google.android.gms.maps.internal.zzf zzfVarZza = zzcc.zza(context, renderer);
                try {
                    CameraUpdateFactory.zza(zzfVarZza.zze());
                    BitmapDescriptorFactory.zza(zzfVarZza.zzj());
                    int i7 = 1;
                    zzb = true;
                    if (renderer == null) {
                        i7 = 0;
                    } else {
                        int iOrdinal = renderer.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                i7 = 0;
                            } else {
                                i7 = 2;
                            }
                        }
                    }
                    try {
                        if (zzfVarZza.zzd() == 2) {
                            zzc = Renderer.LATEST;
                        }
                        zzfVarZza.zzl(ObjectWrapper.wrap(context), i7);
                    } catch (RemoteException e10) {
                        Log.e(zza, "Failed to retrieve renderer type or log initialization.", e10);
                    }
                    "loadedRenderer: ".concat(String.valueOf(zzc));
                    if (onMapsSdkInitializedCallback != null) {
                        onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
                    }
                } catch (RemoteException e11) {
                    throw new RuntimeRemoteException(e11);
                }
            } catch (GooglePlayServicesNotAvailableException e12) {
                return e12.errorCode;
            }
        } else if (onMapsSdkInitializedCallback != null) {
            onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
        }
        return 0;
    }
}
