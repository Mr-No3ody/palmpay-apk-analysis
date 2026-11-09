package p318v1;

import Ab.r;
import Eg.g;
import android.os.Build;
import android.os.StrictMode;
import androidx.camera.core.impl.utils.executor.b;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f43045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f43046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f43047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f43048d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f43050f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BufferedWriter f43053j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f43055p;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f43052i = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f43054o = new LinkedHashMap(0, 0.75f, true);
    public long t = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ShadowThreadPoolExecutor f43056v = new ShadowThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new a(), "\u200bcom.bumptech.glide.disklrucache.DiskLruCache", true);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f43057w = new b(this, 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43049e = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f43051g = 1;

    public c(File file, long j6) {
        this.f43045a = file;
        this.f43046b = new File(file, "journal");
        this.f43047c = new File(file, "journal.tmp");
        this.f43048d = new File(file, "journal.bkp");
        this.f43050f = j6;
    }

    public static void a(c cVar, g gVar, boolean z3) {
        synchronized (cVar) {
            b bVar = (b) gVar.f2442c;
            if (bVar.f43043f != gVar) {
                throw new IllegalStateException();
            }
            if (z3 && !bVar.f43042e) {
                for (int i7 = 0; i7 < cVar.f43051g; i7++) {
                    if (!((boolean[]) gVar.f2443d)[i7]) {
                        gVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i7);
                    }
                    if (!bVar.f43041d[i7].exists()) {
                        gVar.a();
                        return;
                    }
                }
            }
            for (int i10 = 0; i10 < cVar.f43051g; i10++) {
                File file = bVar.f43041d[i10];
                if (!z3) {
                    c(file);
                } else if (file.exists()) {
                    File file2 = bVar.f43040c[i10];
                    file.renameTo(file2);
                    long j6 = bVar.f43039b[i10];
                    long length = file2.length();
                    bVar.f43039b[i10] = length;
                    cVar.f43052i = (cVar.f43052i - j6) + length;
                }
            }
            cVar.f43055p++;
            bVar.f43043f = null;
            if (bVar.f43042e || z3) {
                bVar.f43042e = true;
                cVar.f43053j.append((CharSequence) "CLEAN");
                cVar.f43053j.append(' ');
                cVar.f43053j.append((CharSequence) bVar.f43038a);
                cVar.f43053j.append((CharSequence) bVar.a());
                cVar.f43053j.append('\n');
                if (z3) {
                    cVar.t++;
                }
            } else {
                cVar.f43054o.remove(bVar.f43038a);
                cVar.f43053j.append((CharSequence) "REMOVE");
                cVar.f43053j.append(' ');
                cVar.f43053j.append((CharSequence) bVar.f43038a);
                cVar.f43053j.append('\n');
            }
            e(cVar.f43053j);
            if (cVar.f43052i > cVar.f43050f || cVar.g()) {
                cVar.f43056v.submit(cVar.f43057w);
            }
        }
    }

    public static void b(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void e(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static c h(File file, long j6) throws IOException {
        if (j6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                n(file2, file3, false);
            }
        }
        c cVar = new c(file, j6);
        if (cVar.f43046b.exists()) {
            try {
                cVar.j();
                cVar.i();
                return cVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                cVar.close();
                f.a(cVar.f43045a);
            }
        }
        file.mkdirs();
        c cVar2 = new c(file, j6);
        cVar2.l();
        return cVar2;
    }

    public static void n(File file, File file2, boolean z3) throws IOException {
        if (z3) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f43053j == null) {
                return;
            }
            Iterator it = new ArrayList(this.f43054o.values()).iterator();
            while (it.hasNext()) {
                g gVar = ((b) it.next()).f43043f;
                if (gVar != null) {
                    gVar.a();
                }
            }
            o();
            b(this.f43053j);
            this.f43053j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final g d(String str) {
        synchronized (this) {
            try {
                if (this.f43053j == null) {
                    throw new IllegalStateException("cache is closed");
                }
                b bVar = (b) this.f43054o.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.f43054o.put(str, bVar);
                } else if (bVar.f43043f != null) {
                    return null;
                }
                g gVar = new g(this, bVar);
                bVar.f43043f = gVar;
                this.f43053j.append((CharSequence) "DIRTY");
                this.f43053j.append(' ');
                this.f43053j.append((CharSequence) str);
                this.f43053j.append('\n');
                e(this.f43053j);
                return gVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized r f(String str) {
        if (this.f43053j == null) {
            throw new IllegalStateException("cache is closed");
        }
        b bVar = (b) this.f43054o.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f43042e) {
            return null;
        }
        for (File file : bVar.f43040c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f43055p++;
        this.f43053j.append((CharSequence) "READ");
        this.f43053j.append(' ');
        this.f43053j.append((CharSequence) str);
        this.f43053j.append('\n');
        if (g()) {
            this.f43056v.submit(this.f43057w);
        }
        return new r(bVar.f43040c, 26);
    }

    public final boolean g() {
        int i7 = this.f43055p;
        return i7 >= 2000 && i7 >= this.f43054o.size();
    }

    public final void i() throws IOException {
        c(this.f43047c);
        Iterator it = this.f43054o.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            g gVar = bVar.f43043f;
            int i7 = this.f43051g;
            int i10 = 0;
            if (gVar == null) {
                while (i10 < i7) {
                    this.f43052i += bVar.f43039b[i10];
                    i10++;
                }
            } else {
                bVar.f43043f = null;
                while (i10 < i7) {
                    c(bVar.f43040c[i10]);
                    c(bVar.f43041d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void j() {
        File file = this.f43046b;
        e eVar = new e(new FileInputStream(file), f.f43064a);
        try {
            String strA = eVar.a();
            String strA2 = eVar.a();
            String strA3 = eVar.a();
            String strA4 = eVar.a();
            String strA5 = eVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f43049e).equals(strA3) || !Integer.toString(this.f43051g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i7 = 0;
            while (true) {
                try {
                    k(eVar.a());
                    i7++;
                } catch (EOFException unused) {
                    this.f43055p = i7 - this.f43054o.size();
                    if (eVar.f43063e == -1) {
                        l();
                    } else {
                        this.f43053j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), f.f43064a));
                    }
                    try {
                        eVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                eVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void k(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i7 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i7);
        LinkedHashMap linkedHashMap = this.f43054o;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i7);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i7, iIndexOf2);
        }
        b bVar = (b) linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f43043f = new g(this, bVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        bVar.f43042e = true;
        bVar.f43043f = null;
        if (strArrSplit.length != bVar.f43044g.f43051g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                bVar.f43039b[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void l() {
        try {
            BufferedWriter bufferedWriter = this.f43053j;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f43047c), f.f43064a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter2.write("1");
                bufferedWriter2.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter2.write(Integer.toString(this.f43049e));
                bufferedWriter2.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter2.write(Integer.toString(this.f43051g));
                bufferedWriter2.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter2.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                for (b bVar : this.f43054o.values()) {
                    if (bVar.f43043f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.f43038a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.f43038a + bVar.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f43046b.exists()) {
                    n(this.f43046b, this.f43048d, true);
                }
                n(this.f43047c, this.f43046b, false);
                this.f43048d.delete();
                this.f43053j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f43046b, true), f.f43064a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void m(String str) {
        try {
            if (this.f43053j == null) {
                throw new IllegalStateException("cache is closed");
            }
            b bVar = (b) this.f43054o.get(str);
            if (bVar != null && bVar.f43043f == null) {
                for (int i7 = 0; i7 < this.f43051g; i7++) {
                    File file = bVar.f43040c[i7];
                    if (file.exists() && !file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                    long j6 = this.f43052i;
                    long[] jArr = bVar.f43039b;
                    this.f43052i = j6 - jArr[i7];
                    jArr[i7] = 0;
                }
                this.f43055p++;
                this.f43053j.append((CharSequence) "REMOVE");
                this.f43053j.append(' ');
                this.f43053j.append((CharSequence) str);
                this.f43053j.append('\n');
                this.f43054o.remove(str);
                if (g()) {
                    this.f43056v.submit(this.f43057w);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o() {
        while (this.f43052i > this.f43050f) {
            m((String) ((Map.Entry) this.f43054o.entrySet().iterator().next()).getKey());
        }
    }
}
