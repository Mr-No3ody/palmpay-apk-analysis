package Eg;

import C0.G;
import C0.J;
import Jg.t;
import Pg.AbstractC0555b;
import Pg.C0557d;
import Pg.w;
import Pg.x;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.y;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Closeable, Flushable {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f2464M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f2465Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String f2466X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f2467Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f2468Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final long f2469k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Regex f2470p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f2471q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f2472r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f2473s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f2474t0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f2475A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f2476B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f2477C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Fg.b f2478H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final k f2479L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okhttp3.internal.io.a f2480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f2481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f2483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f2484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f2485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f2486g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w f2487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f2488j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2489o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2490p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2492w;

    static {
        new f(null);
        f2464M = "journal";
        f2465Q = "journal.tmp";
        f2466X = "journal.bkp";
        f2467Y = "libcore.io.DiskLruCache";
        f2468Z = "1";
        f2469k0 = -1L;
        f2470p0 = new Regex("[a-z0-9_-]{1,120}");
        f2471q0 = "CLEAN";
        f2472r0 = "DIRTY";
        f2473s0 = "REMOVE";
        f2474t0 = "READ";
    }

    public l(okhttp3.internal.io.a fileSystem, File directory, long j6, Fg.d taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f2480a = fileSystem;
        this.f2481b = directory;
        this.f2482c = j6;
        this.f2488j = new LinkedHashMap(0, 0.75f, true);
        this.f2478H = taskRunner.e();
        this.f2479L = new k(this, G.r(new StringBuilder(), Dg.c.f1885g, " Cache"), 0);
        if (j6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2483d = new File(directory, f2464M);
        this.f2484e = new File(directory, f2465Q);
        this.f2485f = new File(directory, f2466X);
    }

    public static void m(String str) {
        if (!f2470p0.b(str)) {
            throw new IllegalArgumentException(G.l('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public final synchronized void a() {
        if (this.f2492w) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void b(g editor, boolean z3) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        i iVar = (i) editor.f2442c;
        if (!Intrinsics.c(iVar.f2454g, editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z3 && !iVar.f2452e) {
            for (int i7 = 0; i7 < 2; i7++) {
                boolean[] zArr = (boolean[]) editor.f2443d;
                Intrinsics.e(zArr);
                if (!zArr[i7]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i7);
                }
                if (!this.f2480a.exists((File) iVar.f2451d.get(i7))) {
                    editor.a();
                    return;
                }
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            File file = (File) iVar.f2451d.get(i10);
            if (!z3 || iVar.f2453f) {
                this.f2480a.delete(file);
            } else if (this.f2480a.exists(file)) {
                File file2 = (File) iVar.f2450c.get(i10);
                this.f2480a.rename(file, file2);
                long j6 = iVar.f2449b[i10];
                this.f2480a.getClass();
                Intrinsics.checkNotNullParameter(file2, "file");
                long length = file2.length();
                iVar.f2449b[i10] = length;
                this.f2486g = (this.f2486g - j6) + length;
            }
        }
        iVar.f2454g = null;
        if (iVar.f2453f) {
            k(iVar);
            return;
        }
        this.f2489o++;
        w writer = this.f2487i;
        Intrinsics.e(writer);
        if (iVar.f2452e || z3) {
            iVar.f2452e = true;
            writer.writeUtf8(f2471q0);
            writer.writeByte(32);
            writer.writeUtf8(iVar.f2448a);
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j10 : iVar.f2449b) {
                writer.writeByte(32);
                writer.writeDecimalLong(j10);
            }
            writer.writeByte(10);
            if (z3) {
                long j11 = this.f2477C;
                this.f2477C = 1 + j11;
                iVar.f2456i = j11;
            }
        } else {
            this.f2488j.remove(iVar.f2448a);
            writer.writeUtf8(f2473s0);
            writer.writeByte(32);
            writer.writeUtf8(iVar.f2448a);
            writer.writeByte(10);
        }
        writer.flush();
        if (this.f2486g > this.f2482c || f()) {
            this.f2478H.c(this.f2479L, 0L);
        }
    }

    public final synchronized g c(long j6, String key) {
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            e();
            a();
            m(key);
            i iVar = (i) this.f2488j.get(key);
            if (j6 != f2469k0 && (iVar == null || iVar.f2456i != j6)) {
                return null;
            }
            if ((iVar != null ? iVar.f2454g : null) != null) {
                return null;
            }
            if (iVar != null && iVar.f2455h != 0) {
                return null;
            }
            if (!this.f2475A && !this.f2476B) {
                w wVar = this.f2487i;
                Intrinsics.e(wVar);
                wVar.writeUtf8(f2472r0);
                wVar.writeByte(32);
                wVar.writeUtf8(key);
                wVar.writeByte(10);
                wVar.flush();
                if (this.f2490p) {
                    return null;
                }
                if (iVar == null) {
                    iVar = new i(this, key);
                    this.f2488j.put(key, iVar);
                }
                g gVar = new g(this, iVar);
                iVar.f2454g = gVar;
                return gVar;
            }
            this.f2478H.c(this.f2479L, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f2491v && !this.f2492w) {
                Collection collectionValues = this.f2488j.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
                for (i iVar : (i[]) collectionValues.toArray(new i[0])) {
                    g gVar = iVar.f2454g;
                    if (gVar != null) {
                        gVar.c();
                    }
                }
                l();
                w wVar = this.f2487i;
                Intrinsics.e(wVar);
                wVar.close();
                this.f2487i = null;
                this.f2492w = true;
                return;
            }
            this.f2492w = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized j d(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        a();
        m(key);
        i iVar = (i) this.f2488j.get(key);
        if (iVar == null) {
            return null;
        }
        j jVarA = iVar.a();
        if (jVarA == null) {
            return null;
        }
        this.f2489o++;
        w wVar = this.f2487i;
        Intrinsics.e(wVar);
        wVar.writeUtf8(f2474t0);
        wVar.writeByte(32);
        wVar.writeUtf8(key);
        wVar.writeByte(10);
        if (f()) {
            this.f2478H.c(this.f2479L, 0L);
        }
        return jVarA;
    }

    public final synchronized void e() {
        boolean z3;
        try {
            byte[] bArr = Dg.c.f1879a;
            if (this.f2491v) {
                return;
            }
            if (this.f2480a.exists(this.f2485f)) {
                if (this.f2480a.exists(this.f2483d)) {
                    this.f2480a.delete(this.f2485f);
                } else {
                    this.f2480a.rename(this.f2485f, this.f2483d);
                }
            }
            okhttp3.internal.io.a aVar = this.f2480a;
            File file = this.f2485f;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            Intrinsics.checkNotNullParameter(file, "file");
            Sink sink = aVar.sink(file);
            try {
                try {
                    aVar.delete(file);
                    sink = (C0557d) sink;
                    sink.close();
                    z3 = true;
                } catch (IOException unused) {
                    Unit unit = Unit.f38893a;
                    sink = (C0557d) sink;
                    sink.close();
                    aVar.delete(file);
                    z3 = false;
                }
                this.t = z3;
                if (this.f2480a.exists(this.f2483d)) {
                    try {
                        h();
                        g();
                        this.f2491v = true;
                        return;
                    } catch (IOException e10) {
                        t tVar = t.f4869a.get();
                        String str = "DiskLruCache " + this.f2481b + " is corrupt: " + e10.getMessage() + ", removing";
                        tVar.getClass();
                        t.i(5, str, e10);
                        try {
                            close();
                            this.f2480a.deleteContents(this.f2481b);
                            this.f2492w = false;
                            j();
                            this.f2491v = true;
                        } catch (Throwable th) {
                            this.f2492w = false;
                            throw th;
                        }
                    }
                }
                j();
                this.f2491v = true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    org.chromium.support_lib_boundary.util.b.o(sink, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final boolean f() {
        int i7 = this.f2489o;
        return i7 >= 2000 && i7 >= this.f2488j.size();
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f2491v) {
            a();
            l();
            w wVar = this.f2487i;
            Intrinsics.e(wVar);
            wVar.flush();
        }
    }

    public final void g() {
        File file = this.f2484e;
        okhttp3.internal.io.a aVar = this.f2480a;
        aVar.delete(file);
        Iterator it = this.f2488j.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            i iVar = (i) next;
            int i7 = 0;
            if (iVar.f2454g == null) {
                while (i7 < 2) {
                    this.f2486g += iVar.f2449b[i7];
                    i7++;
                }
            } else {
                iVar.f2454g = null;
                while (i7 < 2) {
                    aVar.delete((File) iVar.f2450c.get(i7));
                    aVar.delete((File) iVar.f2451d.get(i7));
                    i7++;
                }
                it.remove();
            }
        }
    }

    public final void h() {
        int i7 = 2;
        File file = this.f2483d;
        okhttp3.internal.io.a aVar = this.f2480a;
        x xVarC = AbstractC0555b.c(aVar.source(file));
        try {
            String utf8LineStrict = xVarC.readUtf8LineStrict(Long.MAX_VALUE);
            String utf8LineStrict2 = xVarC.readUtf8LineStrict(Long.MAX_VALUE);
            String utf8LineStrict3 = xVarC.readUtf8LineStrict(Long.MAX_VALUE);
            String utf8LineStrict4 = xVarC.readUtf8LineStrict(Long.MAX_VALUE);
            String utf8LineStrict5 = xVarC.readUtf8LineStrict(Long.MAX_VALUE);
            if (!Intrinsics.c(f2467Y, utf8LineStrict) || !Intrinsics.c(f2468Z, utf8LineStrict2) || !Intrinsics.c(String.valueOf(201105), utf8LineStrict3) || !Intrinsics.c(String.valueOf(2), utf8LineStrict4) || utf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    i(xVarC.readUtf8LineStrict(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.f2489o = i10 - this.f2488j.size();
                    if (xVarC.exhausted()) {
                        this.f2487i = AbstractC0555b.b(new m(aVar.appendingSink(file), new J(this, i7)));
                    } else {
                        j();
                    }
                    Unit unit = Unit.f38893a;
                    xVarC.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(xVarC, th);
                throw th2;
            }
        }
    }

    public final void i(String str) throws IOException {
        String strSubstring;
        int iD = StringsKt.D(str, ' ', 0, 6);
        if (iD == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i7 = iD + 1;
        int iD2 = StringsKt.D(str, ' ', i7, 4);
        LinkedHashMap linkedHashMap = this.f2488j;
        if (iD2 == -1) {
            strSubstring = str.substring(i7);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = f2473s0;
            if (iD == str2.length() && y.m(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i7, iD2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        i iVar = (i) linkedHashMap.get(strSubstring);
        if (iVar == null) {
            iVar = new i(this, strSubstring);
            linkedHashMap.put(strSubstring, iVar);
        }
        if (iD2 != -1) {
            String str3 = f2471q0;
            if (iD == str3.length() && y.m(str, str3, false)) {
                String strSubstring2 = str.substring(iD2 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List strings = StringsKt.M(strSubstring2, new char[]{' '}, 6);
                iVar.f2452e = true;
                iVar.f2454g = null;
                Intrinsics.checkNotNullParameter(strings, "strings");
                int size = strings.size();
                iVar.f2457j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + strings);
                }
                try {
                    int size2 = strings.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        iVar.f2449b[i10] = Long.parseLong((String) strings.get(i10));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + strings);
                }
            }
        }
        if (iD2 == -1) {
            String str4 = f2472r0;
            if (iD == str4.length() && y.m(str, str4, false)) {
                iVar.f2454g = new g(this, iVar);
                return;
            }
        }
        if (iD2 == -1) {
            String str5 = f2474t0;
            if (iD == str5.length() && y.m(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void j() {
        int i7 = 2;
        synchronized (this) {
            try {
                w wVar = this.f2487i;
                if (wVar != null) {
                    wVar.close();
                }
                w writer = AbstractC0555b.b(this.f2480a.sink(this.f2484e));
                try {
                    writer.writeUtf8(f2467Y);
                    writer.writeByte(10);
                    writer.writeUtf8(f2468Z);
                    writer.writeByte(10);
                    writer.writeDecimalLong(201105);
                    writer.writeByte(10);
                    writer.writeDecimalLong(2);
                    writer.writeByte(10);
                    writer.writeByte(10);
                    Iterator it = this.f2488j.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        i iVar = (i) it.next();
                        if (iVar.f2454g != null) {
                            writer.writeUtf8(f2472r0);
                            writer.writeByte(32);
                            writer.writeUtf8(iVar.f2448a);
                            writer.writeByte(10);
                        } else {
                            writer.writeUtf8(f2471q0);
                            writer.writeByte(32);
                            writer.writeUtf8(iVar.f2448a);
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            for (long j6 : iVar.f2449b) {
                                writer.writeByte(32);
                                writer.writeDecimalLong(j6);
                            }
                            writer.writeByte(10);
                        }
                        throw th;
                    }
                    Unit unit = Unit.f38893a;
                    writer.close();
                    if (this.f2480a.exists(this.f2483d)) {
                        this.f2480a.rename(this.f2483d, this.f2485f);
                    }
                    this.f2480a.rename(this.f2484e, this.f2483d);
                    this.f2480a.delete(this.f2485f);
                    this.f2487i = AbstractC0555b.b(new m(this.f2480a.appendingSink(this.f2483d), new J(this, i7)));
                    this.f2490p = false;
                    this.f2476B = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        org.chromium.support_lib_boundary.util.b.o(writer, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k(i entry) {
        w wVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.t) {
            if (entry.f2455h > 0 && (wVar = this.f2487i) != null) {
                wVar.writeUtf8(f2472r0);
                wVar.writeByte(32);
                wVar.writeUtf8(entry.f2448a);
                wVar.writeByte(10);
                wVar.flush();
            }
            if (entry.f2455h > 0 || entry.f2454g != null) {
                entry.f2453f = true;
                return;
            }
        }
        g gVar = entry.f2454g;
        if (gVar != null) {
            gVar.c();
        }
        for (int i7 = 0; i7 < 2; i7++) {
            this.f2480a.delete((File) entry.f2450c.get(i7));
            long j6 = this.f2486g;
            long[] jArr = entry.f2449b;
            this.f2486g = j6 - jArr[i7];
            jArr[i7] = 0;
        }
        this.f2489o++;
        w wVar2 = this.f2487i;
        String str = entry.f2448a;
        if (wVar2 != null) {
            wVar2.writeUtf8(f2473s0);
            wVar2.writeByte(32);
            wVar2.writeUtf8(str);
            wVar2.writeByte(10);
        }
        this.f2488j.remove(str);
        if (f()) {
            this.f2478H.c(this.f2479L, 0L);
        }
    }

    public final void l() {
        while (this.f2486g > this.f2482c) {
            for (i toEvict : this.f2488j.values()) {
                if (!toEvict.f2453f) {
                    Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                    k(toEvict);
                }
            }
            return;
        }
        this.f2475A = false;
    }
}
