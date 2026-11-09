package com.google.android.gms.dynamite;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.didiglobal.booster.instrument.ShadowThread;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb {

    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    private static ClassLoader zza;

    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    private static Thread zzb;

    /* JADX WARN: Code duplicated, block: B:52:0x00a9 A[Catch: all -> 0x00a5, PHI: r1
      0x00a9: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v18 java.lang.Thread) binds: [B:7:0x000a, B:46:0x00a2] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:45:0x00a0, B:60:0x00c8, B:12:0x001f, B:51:0x00a8, B:52:0x00a9, B:63:0x00cc, B:64:0x00cd, B:53:0x00aa, B:59:0x00c7, B:58:0x00b4, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:42:0x008b, B:43:0x009e, B:18:0x003c), top: B:78:0x0003, inners: #0, #6 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    public static synchronized ClassLoader zza() {
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        if (zza == null) {
            Thread thread2 = zzb;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = zzb.getContextClassLoader();
                    } catch (SecurityException e11) {
                        new StringBuilder(String.valueOf(e11.getMessage()).length() + 41);
                    }
                }
                zza = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i7 = 0;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i10];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i7 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i7];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i7++;
                                }
                                if (thread == null) {
                                    try {
                                        zza zzaVar = new zza(threadGroup, "GmsDynamite");
                                        try {
                                            zzaVar.setContextClassLoader(null);
                                            ShadowThread.setThreadName(zzaVar, "\u200bcom.google.android.gms.dynamite.zzb").start();
                                            thread = zzaVar;
                                        } catch (SecurityException e12) {
                                            e10 = e12;
                                            thread = zzaVar;
                                            new StringBuilder(String.valueOf(e10.getMessage()).length() + 39);
                                        }
                                    } catch (SecurityException e13) {
                                        e10 = e13;
                                    }
                                }
                            } catch (SecurityException e14) {
                                e10 = e14;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                zzb = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = zzb.getContextClassLoader();
                    }
                }
                zza = contextClassLoader;
            }
        }
        return zza;
    }
}
