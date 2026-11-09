package P0;

import E.AbstractC0198c;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.Initializer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f6852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f6853e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f6856c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f6855b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6854a = new HashMap();

    public a(Context context) {
        this.f6856c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f6852d == null) {
            synchronized (f6853e) {
                try {
                    if (f6852d == null) {
                        f6852d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6852d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f6856c.getString(b.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f6855b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (Initializer.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(0, e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        if (AbstractC0198c.J()) {
            try {
                Trace.beginSection(AbstractC0198c.m0(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f6854a;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                Initializer initializer = (Initializer) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends Initializer<?>>> listDependencies = initializer.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends Initializer<?>> cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = initializer.create(this.f6856c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new c(0, th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }

    public final Object d(Class cls) {
        Object objB;
        synchronized (f6853e) {
            try {
                objB = this.f6854a.get(cls);
                if (objB == null) {
                    objB = b(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objB;
    }
}
