package p015ag;

import Sf.m;
import Sf.p;
import Wf.p0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f11960a;

    static {
        String property;
        int i7 = u.f11966a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        List<? extends MainDispatcherFactory> listI = p.i(m.a(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
        Iterator it = listI.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
        if (mainDispatcherFactory != null) {
            try {
                p0 p0VarCreateDispatcher = mainDispatcherFactory.createDispatcher(listI);
                if (p0VarCreateDispatcher != null) {
                    f11960a = p0VarCreateDispatcher;
                    return;
                }
            } catch (Throwable th) {
                mainDispatcherFactory.hintOnError();
                throw th;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
