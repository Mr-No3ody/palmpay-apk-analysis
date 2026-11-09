package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17429a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f17430b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f17431c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void b() {
    }

    public final Object c(Object obj, String str) {
        Object obj2;
        synchronized (this.f17429a) {
            try {
                obj2 = this.f17429a.get(str);
                if (obj2 == null) {
                    this.f17429a.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f17431c) {
            a(obj);
        }
        return obj;
    }
}
