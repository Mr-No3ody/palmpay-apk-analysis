package p277s2;

import com.facebook.common.references.ResourceReleaser;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final IdentityHashMap f42009d = new IdentityHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f42010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceReleaser f42012c;

    public a(Object obj, ResourceReleaser resourceReleaser, boolean z3) {
        obj.getClass();
        this.f42010a = obj;
        this.f42012c = resourceReleaser;
        this.f42011b = 1;
        if (z3) {
            IdentityHashMap identityHashMap = f42009d;
            synchronized (identityHashMap) {
                try {
                    Integer num = (Integer) identityHashMap.get(obj);
                    if (num == null) {
                        identityHashMap.put(obj, 1);
                    } else {
                        identityHashMap.put(obj, Integer.valueOf(num.intValue() + 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized Object a() {
        return this.f42010a;
    }
}
