package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17458a = new LinkedHashMap();

    public final void a() {
        for (a0 a0Var : this.f17458a.values()) {
            a0Var.f17431c = true;
            HashMap map = a0Var.f17429a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = a0Var.f17429a.values().iterator();
                        while (it.hasNext()) {
                            a0.a(it.next());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = a0Var.f17430b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = a0Var.f17430b.iterator();
                        while (it2.hasNext()) {
                            a0.a((Closeable) it2.next());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            a0Var.b();
        }
        this.f17458a.clear();
    }
}
