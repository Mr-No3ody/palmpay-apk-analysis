package J1;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4468a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4471d;

    public k(long j6) {
        this.f4469b = j6;
        this.f4470c = j6;
    }

    public final synchronized Object a(Object obj) {
        j jVar;
        jVar = (j) this.f4468a.get(obj);
        return jVar != null ? jVar.f4466a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public final void clearMemory() {
        e(0L);
    }

    public final synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j6 = iB;
        if (j6 >= this.f4470c) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f4471d += j6;
        }
        j jVar = (j) this.f4468a.put(obj, obj2 == null ? null : new j(obj2, iB));
        if (jVar != null) {
            this.f4471d -= (long) jVar.f4467b;
            if (!jVar.f4466a.equals(obj2)) {
                c(obj, jVar.f4466a);
            }
        }
        e(this.f4470c);
        return jVar != null ? jVar.f4466a : null;
    }

    public final synchronized void e(long j6) {
        while (this.f4471d > j6) {
            Iterator it = this.f4468a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            j jVar = (j) entry.getValue();
            this.f4471d -= (long) jVar.f4467b;
            Object key = entry.getKey();
            it.remove();
            c(key, jVar.f4466a);
        }
    }

    public final synchronized long getCurrentSize() {
        return this.f4471d;
    }

    public final synchronized long getMaxSize() {
        return this.f4470c;
    }

    public /* bridge */ /* synthetic */ Resource put(Key key, Resource resource) {
        return (Resource) d(key, resource);
    }

    public final synchronized void setSizeMultiplier(float f10) {
        try {
            if (f10 < 0.0f) {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
            long jRound = Math.round(this.f4469b * f10);
            this.f4470c = jRound;
            e(jRound);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c(Object obj, Object obj2) {
    }
}
