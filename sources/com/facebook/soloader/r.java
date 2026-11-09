package com.facebook.soloader;

import android.os.Trace;
import com.facebook.soloader.observer.Observer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f21904a;

    static {
        new ReentrantReadWriteLock();
        q qVar = new q();
        qVar.add("libEGL.so");
        qVar.add("libGLESv2.so");
        qVar.add("libGLESv3.so");
        qVar.add("libOpenSLES.so");
        qVar.add("libandroid.so");
        qVar.add("libc.so");
        qVar.add("libdl.so");
        qVar.add("libjnigraphics.so");
        qVar.add("liblog.so");
        qVar.add("libm.so");
        qVar.add("libstdc++.so");
        qVar.add("libz.so");
        f21904a = qVar;
    }

    public static String[] a(String str, ElfByteChannel elfByteChannel) {
        if (SoLoader.f21853a) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        Observer[] observerArr = (Observer[]) E3.a.f2210a.get();
        int i7 = 0;
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onGetDependenciesStart();
            }
        }
        try {
            try {
                String[] strArrB = o.b(elfByteChannel);
                Observer[] observerArr2 = (Observer[]) E3.a.f2210a.get();
                if (observerArr2 != null) {
                    int length = observerArr2.length;
                    while (i7 < length) {
                        observerArr2[i7].onGetDependenciesEnd(null);
                        i7++;
                    }
                }
                if (SoLoader.f21853a) {
                    Trace.endSection();
                }
                return strArrB;
            } catch (p e10) {
                throw o.a(str, e10);
            } catch (Error e11) {
                e = e11;
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                throw e;
            }
        } catch (Throwable th) {
            Observer[] observerArr3 = (Observer[]) E3.a.f2210a.get();
            if (observerArr3 != null) {
                int length2 = observerArr3.length;
                while (i7 < length2) {
                    observerArr3[i7].onGetDependenciesEnd(null);
                    i7++;
                }
            }
            if (SoLoader.f21853a) {
                Trace.endSection();
            }
            throw th;
        }
    }
}
