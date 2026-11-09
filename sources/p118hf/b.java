package p118hf;

import P0.c;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f37388c;

    public b(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(StringBuilder sb2, Throwable th, String str) {
        sb2.append(str);
        sb2.append(th);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th.getCause(), "");
        }
    }

    public final void b(a aVar) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i7 = 1;
        for (Throwable th : this.f37386a) {
            sb2.append("  ComposedException ");
            sb2.append(i7);
            sb2.append(" :\n");
            a(sb2, th, "\t");
            i7++;
        }
        String string = sb2.toString();
        switch (aVar.f37384a) {
            case 0:
                ((PrintStream) aVar.f37385b).println((Object) string);
                break;
            default:
                ((PrintWriter) aVar.f37385b).println((Object) string);
                break;
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.f37388c == null) {
                c cVar = new c();
                HashSet hashSet = new HashSet();
                c cVar2 = cVar;
                for (Throwable runtimeException : this.f37386a) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        ArrayList<Throwable> arrayList = new ArrayList();
                        Throwable cause = runtimeException.getCause();
                        if (cause != null && cause != runtimeException) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        for (Throwable th : arrayList) {
                            if (hashSet.contains(th)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th);
                            }
                        }
                        try {
                            cVar2.initCause(runtimeException);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = cVar2.getCause();
                        if (cause3 != null && cVar2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                    break;
                                }
                                cause3 = cause4;
                            }
                            cVar2 = cause3;
                        }
                    }
                }
                this.f37388c = cVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f37388c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f37387b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new a(printStream, 0));
    }

    public b(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof b) {
                    linkedHashSet.addAll(((b) th).f37386a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f37386a = listUnmodifiableList;
            this.f37387b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new a(printWriter, 1));
    }
}
