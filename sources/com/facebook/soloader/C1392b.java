package com.facebook.soloader;

import N8.q0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.soloader.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1392b extends D implements RecoverableSoSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f21870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21871f;

    public C1392b(Context context, String str, boolean z3) {
        super(context, str, z3);
        ArrayList arrayList = new ArrayList();
        this.f21870e = arrayList;
        this.f21871f = false;
        arrayList.add(new m(context, str, new File(context.getApplicationInfo().sourceDir)));
        if (context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        try {
            for (String str2 : context.getApplicationInfo().splitSourceDirs) {
                m mVar = new m(context, str, new File(str2));
                l lVar = new l(mVar, mVar);
                try {
                    boolean z8 = lVar.d().length != 0;
                    lVar.close();
                    if (z8) {
                        mVar.toString();
                        this.f21870e.add(mVar);
                    }
                } catch (Throwable th) {
                    try {
                        lVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.x
    public final String b() {
        return "BackupSoSource";
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.x
    public final int c(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        if (this.f21871f) {
            return super.c(str, i7, threadPolicy);
        }
        return 0;
    }

    @Override // com.facebook.soloader.D, com.facebook.soloader.x
    public final void d(int i7) {
        if ((i7 & 8) != 0) {
            return;
        }
        super.d(i7);
        this.f21871f = true;
    }

    @Override // com.facebook.soloader.D
    public final byte[] f() {
        Context context = this.f21852d;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 3);
            PackageManager packageManager = context.getPackageManager();
            int i7 = 0;
            if (packageManager != null) {
                try {
                    i7 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                }
            }
            parcelObtain.writeInt(i7);
            ArrayList arrayList = this.f21870e;
            parcelObtain.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcelObtain.writeByteArray(((m) it.next()).f());
            }
            String str = context.getApplicationInfo().sourceDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile = new File(str).getCanonicalFile();
            if (!canonicalFile.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.facebook.soloader.D
    public final B[] g() {
        m mVar = (m) this.f21870e.get(0);
        mVar.getClass();
        l lVar = new l(mVar, mVar);
        try {
            k[] kVarArrD = lVar.f21894a;
            if (kVarArrD == null) {
                kVarArrD = lVar.d();
                lVar.f21894a = kVarArrD;
            }
            lVar.close();
            return kVarArrD;
        } catch (Throwable th) {
            try {
                lVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.D
    public final C h() {
        return new h(this);
    }

    public final boolean k(String str) {
        for (B b7 : new h(this).b()) {
            if (b7.f21850a.equals(str)) {
                Log.e("SoLoader", "Found " + str + " in BackupSoSource");
                Log.e("SoLoader", "Preparing BackupSoSource");
                d(0);
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.soloader.RecoverableSoSource
    public final x recover(Context context) {
        C1392b c1392b = new C1392b(context, this.f21877a.getName(), true);
        try {
            c1392b.d(0);
            return c1392b;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.x
    public final String toString() {
        String name;
        File file = this.f21877a;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        StringBuilder sbQ = q0.q("BackupSoSource[root = ", name, " flags = ");
        sbQ.append(this.f21878b);
        sbQ.append(" apks = ");
        sbQ.append(this.f21870e.toString());
        sbQ.append("]");
        return sbQ.toString();
    }
}
