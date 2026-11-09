package com.google.android.gms.internal.measurement;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaaj extends zzaad {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzaac zzc;

    final class zza {
        public static boolean zza() {
            return zzaaj.zzp();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z3 = true;
        if (str != null && !"robolectric".equals(str)) {
            z3 = false;
        }
        zzb = z3;
        zzc = new zzaac() { // from class: com.google.android.gms.internal.measurement.zzaaj.1
            @Override // com.google.android.gms.internal.measurement.zzaac
            public String zza(Class<? extends zzxi<?>> cls) {
                StackTraceElement stackTraceElementZza;
                if (zzaaj.zza) {
                    try {
                        if (cls.equals(zzaaj.zzr())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!zzaaj.zzb || (stackTraceElementZza = zzabq.zza(cls, 1)) == null) {
                    return null;
                }
                return stackTraceElementZza.getClassName();
            }

            @Override // com.google.android.gms.internal.measurement.zzaac
            public zzyc zzb(Class<?> cls, int i7) {
                return zzyc.zza;
            }
        };
    }

    public static boolean zzp() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> zzr() {
        return VMStack.getStackClass2();
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public zzaac zzc() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public zzzf zze(String str) {
        return zzaao.zze(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public zzaat zzg() {
        return zzaap.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public String zzn() {
        return "platform: Android";
    }
}
