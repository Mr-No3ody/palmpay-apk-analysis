package org.greenrobot.eventbus;

import N8.q0;
import androidx.core.provider.m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.android.AndroidComponentsImpl;
import org.greenrobot.eventbus.meta.SubscriberInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile c f41053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f41054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final HashMap f41055s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f41056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f41057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f41058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hg.c f41059d = new Hg.c(9);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MainThreadSupport f41060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Poster f41061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p078f5.b f41062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f41063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f41064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ExecutorService f41065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f41066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f41067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f41068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f41069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f41070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Logger f41071p;

    static {
        d dVar = new d();
        dVar.f41073a = d.f41072b;
        f41054r = dVar;
        f41055s = new HashMap();
    }

    public c() {
        d dVar = f41054r;
        dVar.getClass();
        AndroidComponentsImpl androidComponentsImpl = AndroidComponentsImpl.f41046c;
        this.f41071p = androidComponentsImpl != null ? androidComponentsImpl.f41047a : new org.sufficientlysecure.htmltextview.g(10);
        this.f41056a = new HashMap();
        this.f41057b = new HashMap();
        this.f41058c = new ConcurrentHashMap();
        com.growingio.android.circler.a aVar = androidComponentsImpl != null ? androidComponentsImpl.f41048b : null;
        this.f41060e = aVar;
        this.f41061f = aVar != null ? aVar.createPoster(this) : null;
        this.f41062g = new p078f5.b(this);
        this.f41063h = new m(this);
        this.f41064i = new k();
        this.f41066k = true;
        this.f41067l = true;
        this.f41068m = true;
        this.f41069n = true;
        this.f41070o = true;
        this.f41065j = dVar.f41073a;
    }

    public static void a(ArrayList arrayList, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                a(arrayList, cls.getInterfaces());
            }
        }
    }

    public static c b() {
        c cVar;
        c cVar2 = f41053q;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (c.class) {
            try {
                cVar = f41053q;
                if (cVar == null) {
                    cVar = new c();
                    f41053q = cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public final void c(g gVar) {
        Object obj = gVar.f41081a;
        l lVar = gVar.f41082b;
        gVar.f41081a = null;
        gVar.f41082b = null;
        gVar.f41083c = null;
        ArrayList arrayList = g.f41080d;
        synchronized (arrayList) {
            if (arrayList.size() < 10000) {
                arrayList.add(gVar);
            }
        }
        if (lVar.f41104c) {
            d(lVar, obj);
        }
    }

    public final void d(l lVar, Object obj) {
        try {
            lVar.f41103b.f41087a.invoke(lVar.f41102a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            boolean z3 = obj instanceof h;
            boolean z8 = this.f41066k;
            Logger logger = this.f41071p;
            if (!z3) {
                if (z8) {
                    logger.log(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + lVar.f41102a.getClass(), cause);
                }
                if (this.f41068m) {
                    f(new h(cause, obj, lVar.f41102a));
                    return;
                }
                return;
            }
            if (z8) {
                Level level = Level.SEVERE;
                logger.log(level, "SubscriberExceptionEvent subscriber " + lVar.f41102a.getClass() + " threw an exception", cause);
                h hVar = (h) obj;
                logger.log(level, "Initial event " + hVar.f41085b + " caused exception in " + hVar.f41086c, hVar.f41084a);
            }
        }
    }

    public final synchronized boolean e(Object obj) {
        return this.f41057b.containsKey(obj);
    }

    public final void f(Object obj) {
        b bVar = (b) this.f41059d.get();
        ArrayList arrayList = bVar.f41049a;
        arrayList.add(obj);
        if (bVar.f41050b) {
            return;
        }
        MainThreadSupport mainThreadSupport = this.f41060e;
        bVar.f41051c = mainThreadSupport == null || mainThreadSupport.isMainThread();
        bVar.f41050b = true;
        while (!arrayList.isEmpty()) {
            try {
                g(arrayList.remove(0), bVar);
            } catch (Throwable th) {
                bVar.f41050b = false;
                bVar.f41051c = false;
                throw th;
            }
        }
        bVar.f41050b = false;
        bVar.f41051c = false;
    }

    public final void g(Object obj, b bVar) {
        boolean zH;
        List list;
        Class<?> cls = obj.getClass();
        if (this.f41070o) {
            HashMap map = f41055s;
            synchronized (map) {
                try {
                    List list2 = (List) map.get(cls);
                    list = list2;
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList();
                        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                            arrayList.add(superclass);
                            a(arrayList, superclass.getInterfaces());
                        }
                        f41055s.put(cls, arrayList);
                        list = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = list.size();
            zH = false;
            for (int i7 = 0; i7 < size; i7++) {
                zH |= h(obj, bVar, (Class) list.get(i7));
            }
        } else {
            zH = h(obj, bVar, cls);
        }
        if (zH) {
            return;
        }
        if (this.f41067l) {
            this.f41071p.log(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f41069n || cls == f.class || cls == h.class) {
            return;
        }
        f(new f(obj, 0));
    }

    public final boolean h(Object obj, b bVar, Class cls) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f41056a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (l lVar : copyOnWriteArrayList) {
            bVar.f41052d = obj;
            i(lVar, obj, bVar.f41051c);
        }
        return true;
    }

    public final void i(l lVar, Object obj, boolean z3) {
        int i7 = a.f41045a[lVar.f41103b.f41088b.ordinal()];
        if (i7 == 1) {
            d(lVar, obj);
            return;
        }
        Poster poster = this.f41061f;
        if (i7 == 2) {
            if (z3) {
                d(lVar, obj);
                return;
            } else {
                poster.enqueue(lVar, obj);
                return;
            }
        }
        if (i7 == 3) {
            if (poster != null) {
                poster.enqueue(lVar, obj);
                return;
            } else {
                d(lVar, obj);
                return;
            }
        }
        if (i7 == 4) {
            if (z3) {
                this.f41062g.enqueue(lVar, obj);
                return;
            } else {
                d(lVar, obj);
                return;
            }
        }
        if (i7 == 5) {
            this.f41063h.enqueue(lVar, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + lVar.f41103b.f41088b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e7  */
    public final void j(Object obj) {
        j jVar;
        SubscriberInfo superSubscriberInfo;
        Method[] methods;
        Subscribe subscribe;
        boolean z3 = true;
        if (G8.a.G()) {
            try {
                AndroidComponentsImpl androidComponentsImpl = AndroidComponentsImpl.f41046c;
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
            }
        }
        Class<?> cls = obj.getClass();
        this.f41064i.getClass();
        ConcurrentHashMap concurrentHashMap = k.f41100a;
        List list = (List) concurrentHashMap.get(cls);
        List list2 = list;
        if (list == null) {
            synchronized (k.f41101b) {
                int i7 = 0;
                while (true) {
                    if (i7 >= 4) {
                        jVar = new j();
                        break;
                    }
                    try {
                        j[] jVarArr = k.f41101b;
                        jVar = jVarArr[i7];
                        if (jVar != null) {
                            jVarArr[i7] = null;
                            break;
                        }
                        i7++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            jVar.f41097e = cls;
            jVar.f41098f = false;
            jVar.f41099g = null;
            while (jVar.f41097e != null) {
                SubscriberInfo subscriberInfo = jVar.f41099g;
                if (subscriberInfo == null || subscriberInfo.getSuperSubscriberInfo() == null) {
                    superSubscriberInfo = null;
                } else {
                    superSubscriberInfo = jVar.f41099g.getSuperSubscriberInfo();
                    if (jVar.f41097e != superSubscriberInfo.getSubscriberClass()) {
                        superSubscriberInfo = null;
                    }
                }
                jVar.f41099g = superSubscriberInfo;
                if (superSubscriberInfo != null) {
                    i[] subscriberMethods = superSubscriberInfo.getSubscriberMethods();
                    int length = subscriberMethods.length;
                    for (int i10 = 0; i10 < length; i10 += z3 ? 1 : 0) {
                        i iVar = subscriberMethods[i10];
                        if (jVar.a(iVar.f41087a, iVar.f41089c)) {
                            jVar.f41093a.add(iVar);
                        }
                    }
                } else {
                    try {
                        try {
                            methods = jVar.f41097e.getDeclaredMethods();
                        } catch (Throwable unused2) {
                            methods = jVar.f41097e.getMethods();
                            jVar.f41098f = z3;
                        }
                        int length2 = methods.length;
                        int i11 = 0;
                        while (i11 < length2) {
                            Method method = methods[i11];
                            int modifiers = method.getModifiers();
                            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                                Class<?>[] parameterTypes = method.getParameterTypes();
                                if (parameterTypes.length == z3 && (subscribe = (Subscribe) method.getAnnotation(Subscribe.class)) != null) {
                                    Class<?> cls2 = parameterTypes[0];
                                    if (jVar.a(method, cls2)) {
                                        jVar.f41093a.add(new i(method, cls2, subscribe.threadMode(), subscribe.priority(), subscribe.sticky()));
                                    }
                                }
                            }
                            i11++;
                            z3 = z3 ? 1 : 0;
                        }
                    } catch (LinkageError e10) {
                        throw new P0.c(15, q0.j("Could not inspect methods of ".concat(jVar.f41097e.getName()), ". Please make this class visible to EventBus annotation processor to avoid reflection."), e10);
                    }
                }
                boolean z8 = z3;
                if (jVar.f41098f) {
                    jVar.f41097e = null;
                } else {
                    Class superclass = jVar.f41097e.getSuperclass();
                    jVar.f41097e = superclass;
                    String name = superclass.getName();
                    if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                        jVar.f41097e = null;
                    }
                }
                z3 = z8 ? 1 : 0;
            }
            boolean z10 = z3 ? 1 : 0;
            ArrayList arrayList = new ArrayList(jVar.f41093a);
            jVar.f41093a.clear();
            jVar.f41094b.clear();
            jVar.f41095c.clear();
            jVar.f41096d.setLength(0);
            jVar.f41097e = null;
            jVar.f41098f = false;
            jVar.f41099g = null;
            synchronized (k.f41101b) {
                for (int i12 = 0; i12 < 4; i12++) {
                    try {
                        j[] jVarArr2 = k.f41101b;
                        if (jVarArr2[i12] == null) {
                            jVarArr2[i12] = jVar;
                            break;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                throw new P0.c("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation", 15, false);
            }
            concurrentHashMap.put(cls, arrayList);
            list2 = arrayList;
        }
        synchronized (this) {
            try {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    k(obj, (i) it.next());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k(Object obj, i iVar) {
        Object value;
        Class cls = iVar.f41089c;
        l lVar = new l(obj, iVar);
        HashMap map = this.f41056a;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            map.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(lVar)) {
            throw new P0.c("Subscriber " + obj.getClass() + " already registered to event " + cls, 15, false);
        }
        int size = copyOnWriteArrayList.size();
        for (int i7 = 0; i7 <= size; i7++) {
            if (i7 != size) {
                if (iVar.f41090d <= ((l) copyOnWriteArrayList.get(i7)).f41103b.f41090d) {
                }
            }
            copyOnWriteArrayList.add(i7, lVar);
            break;
        }
        HashMap map2 = this.f41057b;
        List arrayList = (List) map2.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (iVar.f41091e) {
            ConcurrentHashMap concurrentHashMap = this.f41058c;
            MainThreadSupport mainThreadSupport = this.f41060e;
            if (!this.f41070o) {
                Object obj2 = concurrentHashMap.get(cls);
                if (obj2 != null) {
                    i(lVar, obj2, mainThreadSupport == null || mainThreadSupport.isMainThread());
                    return;
                }
                return;
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey()) && (value = entry.getValue()) != null) {
                    i(lVar, value, mainThreadSupport == null || mainThreadSupport.isMainThread());
                }
            }
        }
    }

    public final synchronized void l(Object obj) {
        try {
            List list = (List) this.f41057b.get(obj);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) this.f41056a.get((Class) it.next());
                    if (list2 != null) {
                        int size = list2.size();
                        int i7 = 0;
                        while (i7 < size) {
                            l lVar = (l) list2.get(i7);
                            if (lVar.f41102a == obj) {
                                lVar.f41104c = false;
                                list2.remove(i7);
                                i7--;
                                size--;
                            }
                            i7++;
                        }
                    }
                }
                this.f41057b.remove(obj);
            } else {
                this.f41071p.log(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String toString() {
        return "EventBus[indexCount=0, eventInheritance=" + this.f41070o + "]";
    }
}
