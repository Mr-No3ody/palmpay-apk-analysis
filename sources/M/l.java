package M;

import androidx.annotation.IntRange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class l {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @NotNull
    private final N.b lock;

    @NotNull
    private final N.c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public l(int i7) {
        this.maxSize = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new N.c();
        this.lock = new N.b();
    }

    public final int a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    @Nullable
    public Object create(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public final int createCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.createCount;
        }
        return i7;
    }

    public void entryRemoved(boolean z3, @NotNull Object key, @NotNull Object oldValue, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.evictionCount;
        }
        return i7;
    }

    @Nullable
    public final Object get(@NotNull Object key) {
        Object value;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            N.c cVar = this.map;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = cVar.f6028a.get(key);
            if (obj != null) {
                this.hitCount++;
                return obj;
            }
            this.missCount++;
            Object value2 = create(key);
            if (value2 == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    N.c cVar2 = this.map;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    value = cVar2.f6028a.put(key, value2);
                    if (value != null) {
                        N.c cVar3 = this.map;
                        cVar3.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value, "value");
                        cVar3.f6028a.put(key, value);
                    } else {
                        this.size += a(key, value2);
                        Unit unit = Unit.f38893a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (value != null) {
                entryRemoved(false, key, value2, value);
                return value;
            }
            trimToSize(this.maxSize);
            return value2;
        }
    }

    public final int hitCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.hitCount;
        }
        return i7;
    }

    public final int maxSize() {
        int i7;
        synchronized (this.lock) {
            i7 = this.maxSize;
        }
        return i7;
    }

    public final int missCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.missCount;
        }
        return i7;
    }

    @Nullable
    public final Object put(@NotNull Object key, @NotNull Object value) {
        Object objPut;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += a(key, value);
                N.c cVar = this.map;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                objPut = cVar.f6028a.put(key, value);
                if (objPut != null) {
                    this.size -= a(key, objPut);
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objPut != null) {
            entryRemoved(false, key, objPut, value);
        }
        trimToSize(this.maxSize);
        return objPut;
    }

    public final int putCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.putCount;
        }
        return i7;
    }

    @Nullable
    public final Object remove(@NotNull Object key) {
        Object objRemove;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            try {
                N.c cVar = this.map;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                objRemove = cVar.f6028a.remove(key);
                if (objRemove != null) {
                    this.size -= a(key, objRemove);
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objRemove != null) {
            entryRemoved(false, key, objRemove, null);
        }
        return objRemove;
    }

    public void resize(@IntRange(from = 1, to = Long.MAX_VALUE) int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i7;
            Unit unit = Unit.f38893a;
        }
        trimToSize(i7);
    }

    public final int size() {
        int i7;
        synchronized (this.lock) {
            i7 = this.size;
        }
        return i7;
    }

    public int sizeOf(@NotNull Object key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }

    @NotNull
    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            try {
                Set<Map.Entry> setEntrySet = this.map.f6028a.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "map.entries");
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i7 = this.hitCount;
                int i10 = this.missCount + i7;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i10 != 0 ? (i7 * 100) / i10 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public void trimToSize(int i7) {
        Object next;
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.f6028a.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size > i7 && !this.map.f6028a.isEmpty()) {
                        Set setEntrySet = this.map.f6028a.entrySet();
                        Intrinsics.checkNotNullExpressionValue(setEntrySet, "map.entries");
                        Intrinsics.checkNotNullParameter(setEntrySet, "<this>");
                        if (setEntrySet instanceof List) {
                            List list = (List) setEntrySet;
                            next = list.isEmpty() ? null : list.get(0);
                        } else {
                            Iterator it = setEntrySet.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        N.c cVar = this.map;
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        cVar.f6028a.remove(key);
                        this.size -= a(key, value);
                        this.evictionCount++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }
}
