package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u extends Exception {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final StackTraceElement[] f20766f = new StackTraceElement[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Key f20768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.load.a f20769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Class f20770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20771e;

    public u(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof u)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((u) th).f20767a.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, t tVar) throws IOException {
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            tVar.append("Cause (");
            int i10 = i7 + 1;
            tVar.append(String.valueOf(i10));
            tVar.append(" of ");
            tVar.append(String.valueOf(size));
            tVar.append("): ");
            Throwable th = (Throwable) list.get(i7);
            if (th instanceof u) {
                ((u) th).d(tVar);
            } else {
                c(th, tVar);
            }
            i7 = i10;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f20767a, new t(appendable));
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f20771e);
        sb2.append(this.f20770d != null ? ", " + this.f20770d : "");
        sb2.append(this.f20769c != null ? ", " + this.f20769c : "");
        sb2.append(this.f20768b != null ? ", " + this.f20768b : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        d(System.err);
    }

    public u(String str, List list) {
        this.f20771e = str;
        setStackTrace(f20766f);
        this.f20767a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        d(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        d(printWriter);
    }
}
