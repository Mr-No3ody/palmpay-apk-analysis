package Eg;

import C0.C0126s;
import Ce.ViewOnAttachStateChangeListenerC0160b;
import E.AbstractC0198c;
import android.os.Environment;
import android.os.Trace;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.n;
import androidx.camera.video.u;
import com.bumptech.glide.util.GlideSuppliers$GlideSupplier;
import com.google.maps.android.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements GlideSuppliers$GlideSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2444e;

    public /* synthetic */ g(int i7) {
        this.f2440a = i7;
    }

    public void a() {
        switch (this.f2440a) {
            case 0:
                l lVar = (l) this.f2444e;
                synchronized (lVar) {
                    try {
                        if (this.f2441b) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (Intrinsics.c(((i) this.f2442c).f2454g, this)) {
                            lVar.b(this, false);
                        }
                        this.f2441b = true;
                        Unit unit = Unit.f38893a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                p318v1.c.a((p318v1.c) this.f2444e, this, false);
                return;
        }
    }

    public void b() {
        l lVar = (l) this.f2444e;
        synchronized (lVar) {
            try {
                if (this.f2441b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (Intrinsics.c(((i) this.f2442c).f2454g, this)) {
                    lVar.b(this, true);
                }
                this.f2441b = true;
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        i iVar = (i) this.f2442c;
        if (Intrinsics.c(iVar.f2454g, this)) {
            l lVar = (l) this.f2444e;
            if (lVar.t) {
                lVar.b(this, false);
            } else {
                iVar.f2453f = true;
            }
        }
    }

    public String d() {
        if (TextUtils.isEmpty((String) this.f2442c)) {
            try {
                if (!"mounted".equals(Environment.getExternalStorageState()) || n.l().getExternalFilesDir(null) == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(n.l().getFilesDir());
                    String str = F6.d.f2602b;
                    sb2.append(str);
                    sb2.append("log");
                    sb2.append(str);
                    this.f2442c = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(n.l().getExternalFilesDir(null));
                    String str2 = F6.d.f2602b;
                    sb3.append(str2);
                    sb3.append("log");
                    sb3.append(str2);
                    this.f2442c = sb3.toString();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return (String) this.f2442c;
    }

    public File e() {
        File file;
        synchronized (((p318v1.c) this.f2444e)) {
            try {
                p318v1.b bVar = (p318v1.b) this.f2442c;
                if (bVar.f43043f != this) {
                    throw new IllegalStateException();
                }
                if (!bVar.f43042e) {
                    ((boolean[]) this.f2443d)[0] = true;
                }
                file = bVar.f43041d[0];
                ((p318v1.c) this.f2444e).f43045a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public Sink f(int i7) {
        l lVar = (l) this.f2444e;
        synchronized (lVar) {
            try {
                if (this.f2441b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.c(((i) this.f2442c).f2454g, this)) {
                    return new Pg.g();
                }
                if (!((i) this.f2442c).f2452e) {
                    boolean[] zArr = (boolean[]) this.f2443d;
                    Intrinsics.e(zArr);
                    zArr[i7] = true;
                }
                try {
                    return new m(lVar.f2480a.sink((File) ((i) this.f2442c).f2451d.get(i7)), new C0126s(2, lVar, this));
                } catch (FileNotFoundException unused) {
                    return new Pg.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.util.GlideSuppliers$GlideSupplier
    public Object get() {
        if (this.f2441b) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection(AbstractC0198c.m0("Glide registry"));
        this.f2441b = true;
        try {
            return com.bumptech.glide.k.a((com.bumptech.glide.b) this.f2442c, (List) this.f2443d, (com.bumptech.glide.module.a) this.f2444e);
        } finally {
            this.f2441b = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.f2440a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("process: ");
                String str = (String) this.f2443d;
                sb2.append(str == null ? "" : str.replace(":", "_"));
                String str2 = F6.d.f2603c;
                sb2.append(str2);
                sb2.append("logSwitch: ");
                sb2.append(this.f2441b);
                sb2.append(str2);
                sb2.append("consoleSwitch: true");
                sb2.append(str2);
                sb2.append("tag: ");
                G6.c.d("");
                sb2.append(BuildConfig.TRAVIS);
                sb2.append(str2);
                u.x(sb2, "headSwitch: false", str2, "fileSwitch: false", str2);
                sb2.append("dir: ");
                sb2.append(d());
                sb2.append(str2);
                sb2.append("filePrefix: util");
                u.x(sb2, str2, "borderSwitch: false", str2, "singleTagSwitch: true");
                sb2.append(str2);
                sb2.append("consoleFilter: ");
                char[] cArr = F6.d.f2601a;
                sb2.append(cArr[0]);
                sb2.append(str2);
                sb2.append("fileFilter: ");
                sb2.append(cArr[0]);
                sb2.append(str2);
                sb2.append("stackDeep: 1");
                sb2.append(str2);
                u.x(sb2, "stackOffset: 0", str2, "saveDays: -1", str2);
                sb2.append("formatter: ");
                sb2.append(F6.d.f2607g);
                sb2.append(str2);
                sb2.append("fileWriter: null");
                sb2.append(str2);
                u.x(sb2, "onConsoleOutputListener: null", str2, "onFileOutputListener: null", str2);
                sb2.append("fileExtraHeader: ");
                sb2.append(((top.zibin.luban.io.a) this.f2444e).e());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public g() {
        this.f2440a = 2;
        this.f2444e = new ViewOnAttachStateChangeListenerC0160b(this, 3);
    }

    public g(com.bumptech.glide.b bVar, List list, com.bumptech.glide.module.a aVar) {
        this.f2440a = 3;
        this.f2442c = bVar;
        this.f2443d = list;
        this.f2444e = aVar;
    }

    public g(p318v1.c cVar, p318v1.b bVar) {
        this.f2440a = 5;
        this.f2444e = cVar;
        this.f2442c = bVar;
        this.f2443d = bVar.f43042e ? null : new boolean[cVar.f43051g];
    }

    public g(l lVar, i entry) {
        boolean[] zArr;
        this.f2440a = 0;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f2444e = lVar;
        this.f2442c = entry;
        if (entry.f2452e) {
            zArr = null;
        } else {
            lVar.getClass();
            zArr = new boolean[2];
        }
        this.f2443d = zArr;
    }
}
