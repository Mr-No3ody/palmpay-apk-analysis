package p045d3;

import com.facebook.common.internal.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p039cb.c;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f35502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f35503b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35504c = 0;

    public e(c cVar) {
        this.f35502a = cVar;
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f35503b.values());
        this.f35503b.clear();
        this.f35504c = 0;
        return arrayList;
    }

    public final synchronized int b() {
        return this.f35503b.size();
    }

    public final synchronized ArrayList c(Predicate predicate) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f35503b.entrySet().size());
            for (Map.Entry entry : this.f35503b.entrySet()) {
                if (predicate == null || predicate.mo123apply(entry.getKey())) {
                    arrayList.add(entry);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized int d() {
        return this.f35504c;
    }

    public final synchronized void e(Object obj, Object obj2) {
        Object objRemove = this.f35503b.remove(obj);
        this.f35504c -= objRemove == null ? 0 : this.f35502a.getSizeInBytes(objRemove);
        this.f35503b.put(obj, obj2);
        this.f35504c += this.f35502a.getSizeInBytes(obj2);
    }

    public final synchronized Object f(Object obj) {
        Object objRemove;
        objRemove = this.f35503b.remove(obj);
        this.f35504c -= objRemove == null ? 0 : this.f35502a.getSizeInBytes(objRemove);
        return objRemove;
    }

    public final synchronized ArrayList g(Predicate predicate) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f35503b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (predicate == null || predicate.mo123apply(entry.getKey())) {
                    arrayList.add(entry.getValue());
                    int i7 = this.f35504c;
                    Object value = entry.getValue();
                    this.f35504c = i7 - (value == null ? 0 : this.f35502a.getSizeInBytes(value));
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }
}
