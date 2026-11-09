package com.facebook.soloader;

import N8.q0;
import android.os.StrictMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f21877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f21879c = Arrays.asList(new String[0]);

    public e(File file, int i7) {
        this.f21877a = file;
        this.f21878b = i7;
    }

    @Override // com.facebook.soloader.x
    public String a(String str) {
        File fileE = e(str);
        if (fileE == null) {
            return null;
        }
        return fileE.getCanonicalPath();
    }

    @Override // com.facebook.soloader.x
    public String b() {
        return "DirectorySoSource";
    }

    @Override // com.facebook.soloader.x
    public int c(String str, int i7, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f21854b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        boolean zContains = this.f21879c.contains(str);
        File file = this.f21877a;
        if (zContains) {
            file.getCanonicalPath();
            o.e(3, "SoLoader");
            return 0;
        }
        File fileE = e(str);
        if (fileE == null) {
            file.getCanonicalPath();
            o.e(2, "SoLoader");
            return 0;
        }
        String canonicalPath = fileE.getCanonicalPath();
        o.e(3, "SoLoader");
        if ((i7 & 1) != 0 && (this.f21878b & 2) != 0) {
            o.e(3, "SoLoader");
            return 2;
        }
        if ((this.f21878b & 1) != 0) {
            f fVar = new f();
            fVar.f21880a = fileE;
            FileInputStream fileInputStream = new FileInputStream(fVar.f21880a);
            fVar.f21881b = fileInputStream;
            fVar.f21882c = fileInputStream.getChannel();
            try {
                String[] strArrA = r.a(str, fVar);
                Arrays.toString(strArrA);
                o.e(3, "SoLoader");
                for (String str2 : strArrA) {
                    if (!str2.startsWith("/") && !r.f21904a.contains(str2)) {
                        SoLoader.i(str2, i7, threadPolicy);
                    }
                }
                fVar.close();
            } catch (Throwable th) {
                try {
                    fVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            o.e(3, "SoLoader");
        }
        try {
            SoLoader.f21854b.load(canonicalPath, i7);
            return 1;
        } catch (UnsatisfiedLinkError e10) {
            throw o.a(str, e10);
        }
    }

    public final File e(String str) {
        File file = new File(this.f21877a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Override // com.facebook.soloader.x
    public String toString() {
        String name;
        File file = this.f21877a;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b());
        sb2.append("[root = ");
        sb2.append(name);
        sb2.append(" flags = ");
        return q0.m(sb2, this.f21878b, ']');
    }
}
