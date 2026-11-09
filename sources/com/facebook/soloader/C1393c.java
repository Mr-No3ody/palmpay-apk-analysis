package com.facebook.soloader;

import C0.G;
import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.facebook.soloader.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1393c extends x implements RecoverableSoSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f21872a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f21873b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f21874c;

    public C1393c(Context context) {
        HashSet hashSet = new HashSet();
        String strH = h(context.getApplicationInfo().sourceDir);
        if (strH != null) {
            hashSet.add(strH);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                String strH2 = h(str);
                if (strH2 != null) {
                    hashSet.add(strH2);
                }
            }
        }
        this.f21874c = hashSet;
    }

    public static String h(String str) {
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        if (str == null || str.isEmpty() || supportedAbis == null || supportedAbis.length == 0) {
            return null;
        }
        StringBuilder sbT = G.t(str, "!/lib/");
        sbT.append(supportedAbis[0]);
        return sbT.toString();
    }

    @Override // com.facebook.soloader.x
    public final String a(String str) {
        for (String str2 : this.f21874c) {
            Set set = (Set) this.f21872a.get(str2);
            if (!TextUtils.isEmpty(str2) && set != null && set.contains(str)) {
                return G.r(androidx.camera.video.u.s(str2), File.separator, str);
            }
        }
        return null;
    }

    @Override // com.facebook.soloader.x
    public final String b() {
        return "DirectApkSoSource";
    }

    @Override // com.facebook.soloader.x
    public final int c(String str, int i7, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f21854b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        Iterator it = this.f21874c.iterator();
        while (true) {
            if (!it.hasNext()) {
                return 0;
            }
            String str2 = (String) it.next();
            Set set = (Set) this.f21872a.get(str2);
            if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                o.e(2, "SoLoader");
            } else {
                Set setG = g(str2, str);
                if (setG == null) {
                    String strSubstring = str2.substring(0, str2.indexOf(33));
                    ZipFile zipFile = new ZipFile(strSubstring);
                    try {
                        String str3 = str2.substring(str2.indexOf(33) + 2) + File.separator + str;
                        ZipEntry entry = zipFile.getEntry(str3);
                        if (entry == null) {
                            Log.e("SoLoader", str3 + " not found in " + strSubstring);
                        } else {
                            g gVar = new g(zipFile, entry);
                            try {
                                for (String str4 : r.a(str, gVar)) {
                                    if (!str4.startsWith("/")) {
                                        e(str2, str, str4);
                                    }
                                }
                                gVar.close();
                            } catch (Throwable th) {
                                try {
                                    gVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        zipFile.close();
                        setG = g(str2, str);
                    } catch (Throwable th3) {
                        try {
                            zipFile.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (setG != null) {
                    Iterator it2 = setG.iterator();
                    while (it2.hasNext()) {
                        SoLoader.i((String) it2.next(), i7, threadPolicy);
                    }
                }
                try {
                    i7 |= 4;
                    SoLoader.f21854b.load(str2 + File.separator + str, i7);
                    o.e(3, "SoLoader");
                    return 1;
                } catch (UnsatisfiedLinkError unused) {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.soloader.x
    public final void d(int i7) throws IOException {
        i();
    }

    public final void e(String str, String str2, String str3) {
        synchronized (this.f21873b) {
            try {
                String str4 = str + str2;
                if (!this.f21873b.containsKey(str4)) {
                    this.f21873b.put(str4, new HashSet());
                }
                ((Set) this.f21873b.get(str4)).add(str3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(String str, String str2) {
        synchronized (this.f21872a) {
            try {
                if (!this.f21872a.containsKey(str)) {
                    this.f21872a.put(str, new HashSet());
                }
                ((Set) this.f21872a.get(str)).add(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set g(String str, String str2) {
        Set set;
        synchronized (this.f21873b) {
            set = (Set) this.f21873b.get(str + str2);
        }
        return set;
    }

    public final void i() throws IOException {
        int iIndexOf;
        int i7;
        for (String str : this.f21874c) {
            String strSubstring = (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(33)) < 0 || (i7 = iIndexOf + 2) >= str.length()) ? null : str.substring(i7);
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(str.substring(0, str.indexOf(33)));
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getMethod() == 0 && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so")) {
                            f(str, zipEntryNextElement.getName().substring(strSubstring.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // com.facebook.soloader.RecoverableSoSource
    public final x recover(Context context) {
        C1393c c1393c = new C1393c(context);
        try {
            c1393c.i();
            return c1393c;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.soloader.x
    public final String toString() {
        return "DirectApkSoSource[root = " + this.f21874c.toString() + ']';
    }
}
