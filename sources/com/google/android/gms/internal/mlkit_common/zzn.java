package com.google.android.gms.internal.mlkit_common;

import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzn {
    private static final Method zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Field zzd;
    private static final Field zze;
    private static final Field zzf;
    private static final Object zzg;
    private static final Throwable zzh;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    static {
        Object obj;
        Method declaredMethod;
        Method declaredMethod2;
        Method declaredMethod3;
        ?? field;
        ?? field2;
        ?? field3;
        Throwable th;
        ?? r3;
        try {
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.StructStat");
            Class<?> cls3 = Class.forName("libcore.io.OsConstants");
            Class<?> cls4 = Class.forName("libcore.io.ForwardingOs");
            declaredMethod = cls3.getDeclaredMethod("S_ISLNK", Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod3 = cls4.getDeclaredMethod("lstat", String.class);
                try {
                    declaredMethod2 = cls4.getDeclaredMethod("fstat", FileDescriptor.class);
                    try {
                        Field declaredField = cls.getDeclaredField(OfflineConstant.PARAM_OS);
                        declaredField.setAccessible(true);
                        r3 = declaredField.get(cls);
                        try {
                            field = cls2.getField("st_dev");
                            try {
                                field3 = cls2.getField("st_ino");
                                try {
                                    field2 = cls2.getField("st_mode");
                                    try {
                                        field.setAccessible(true);
                                        field3.setAccessible(true);
                                        field2.setAccessible(true);
                                        zza = declaredMethod;
                                        zzb = declaredMethod3;
                                        zzc = declaredMethod2;
                                        zzd = field;
                                        zze = field3;
                                        zzf = field2;
                                        zzg = r3;
                                        zzh = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        zza = declaredMethod;
                                        zzb = declaredMethod3;
                                        zzc = declaredMethod2;
                                        zzd = field;
                                        zze = field3;
                                        zzf = field2;
                                        zzg = r3;
                                        zzh = th;
                                    }
                                } catch (Throwable th3) {
                                    field2 = 0;
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                field3 = 0;
                                field = field;
                                th = th;
                                field2 = field3;
                                zza = declaredMethod;
                                zzb = declaredMethod3;
                                zzc = declaredMethod2;
                                zzd = field;
                                zze = field3;
                                zzf = field2;
                                zzg = r3;
                                zzh = th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            field = 0;
                            field3 = 0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        field2 = 0;
                        field = 0;
                        field3 = field;
                        th = th;
                        r3 = field3;
                        zza = declaredMethod;
                        zzb = declaredMethod3;
                        zzc = declaredMethod2;
                        zzd = field;
                        zze = field3;
                        zzf = field2;
                        zzg = r3;
                        zzh = th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    field2 = 0;
                    declaredMethod2 = null;
                    field = 0;
                }
            } catch (Throwable th8) {
                th = th8;
                obj = null;
                declaredMethod2 = null;
                declaredMethod3 = declaredMethod2;
                field = declaredMethod3;
                field2 = obj;
                field3 = field;
                th = th;
                r3 = field3;
                zza = declaredMethod;
                zzb = declaredMethod3;
                zzc = declaredMethod2;
                zzd = field;
                zze = field3;
                zzf = field2;
                zzg = r3;
                zzh = th;
            }
        } catch (Throwable th9) {
            th = th9;
            obj = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
    }

    public static zzp zza(final FileDescriptor fileDescriptor) throws IOException {
        return (zzp) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzn.zze(zzn.zzc.invoke(zzn.zzg, fileDescriptor));
            }
        });
    }

    public static zzp zzd(final String str) throws IOException {
        return (zzp) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzn.zze(zzn.zzb.invoke(zzn.zzg, str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzp zze(Object obj) throws Exception {
        long jLongValue = ((Long) zzd.get(obj)).longValue();
        long jLongValue2 = ((Long) zze.get(obj)).longValue();
        Integer num = (Integer) zzf.get(obj);
        num.intValue();
        return new zzp(jLongValue, jLongValue2, ((Boolean) zza.invoke(null, num)).booleanValue());
    }

    private static Object zzf(Callable callable) throws IOException {
        try {
            Throwable th = zzh;
            if (th == null) {
                return callable.call();
            }
            throw new IOException(th);
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}
