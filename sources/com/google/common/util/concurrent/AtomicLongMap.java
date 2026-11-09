package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class AtomicLongMap<K> implements Serializable {

    @CheckForNull
    private transient Map<K, Long> asMap;
    private final ConcurrentHashMap<K, AtomicLong> map;

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        this.map = (ConcurrentHashMap) Preconditions.checkNotNull(concurrentHashMap);
    }

    public static <K> AtomicLongMap<K> create() {
        return new AtomicLongMap<>(new ConcurrentHashMap());
    }

    private Map<K, Long> createAsMap() {
        return Collections.unmodifiableMap(Maps.transformValues(this.map, new Function<AtomicLong, Long>(this) { // from class: com.google.common.util.concurrent.AtomicLongMap.1
            @Override // com.google.common.base.Function
            public Long apply(AtomicLong atomicLong) {
                return Long.valueOf(atomicLong.get());
            }
        }));
    }

    @CanIgnoreReturnValue
    public long addAndGet(K k2, long j6) {
        AtomicLong atomicLongPutIfAbsent;
        long j10;
        long j11;
        do {
            atomicLongPutIfAbsent = this.map.get(k2);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k2, new AtomicLong(j6))) == null) {
                break;
            }
            do {
                j10 = atomicLongPutIfAbsent.get();
                if (j10 != 0) {
                    j11 = j10 + j6;
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j10, j11));
            return j11;
        } while (!this.map.replace(k2, atomicLongPutIfAbsent, new AtomicLong(j6)));
        return j6;
    }

    public Map<K, Long> asMap() {
        Map<K, Long> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Long> mapCreateAsMap = createAsMap();
        this.asMap = mapCreateAsMap;
        return mapCreateAsMap;
    }

    public void clear() {
        this.map.clear();
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @CanIgnoreReturnValue
    public long decrementAndGet(K k2) {
        return addAndGet(k2, -1L);
    }

    public long get(K k2) {
        AtomicLong atomicLong = this.map.get(k2);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    @CanIgnoreReturnValue
    public long getAndAdd(K k2, long j6) {
        AtomicLong atomicLongPutIfAbsent;
        long j10;
        do {
            atomicLongPutIfAbsent = this.map.get(k2);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k2, new AtomicLong(j6))) == null) {
                return 0L;
            }
            do {
                j10 = atomicLongPutIfAbsent.get();
                if (j10 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j10, j10 + j6));
            return j10;
        } while (!this.map.replace(k2, atomicLongPutIfAbsent, new AtomicLong(j6)));
        return 0L;
    }

    @CanIgnoreReturnValue
    public long getAndDecrement(K k2) {
        return getAndAdd(k2, -1L);
    }

    @CanIgnoreReturnValue
    public long getAndIncrement(K k2) {
        return getAndAdd(k2, 1L);
    }

    @CanIgnoreReturnValue
    public long incrementAndGet(K k2) {
        return addAndGet(k2, 1L);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @CanIgnoreReturnValue
    public long put(K k2, long j6) {
        AtomicLong atomicLongPutIfAbsent;
        long j10;
        do {
            atomicLongPutIfAbsent = this.map.get(k2);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k2, new AtomicLong(j6))) == null) {
                return 0L;
            }
            do {
                j10 = atomicLongPutIfAbsent.get();
                if (j10 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j10, j6));
            return j10;
        } while (!this.map.replace(k2, atomicLongPutIfAbsent, new AtomicLong(j6)));
        return 0L;
    }

    public void putAll(Map<? extends K, ? extends Long> map) {
        for (Map.Entry<? extends K, ? extends Long> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    public long putIfAbsent(K k2, long j6) {
        AtomicLong atomicLongPutIfAbsent;
        do {
            atomicLongPutIfAbsent = this.map.get(k2);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k2, new AtomicLong(j6))) == null) {
                return 0L;
            }
            long j10 = atomicLongPutIfAbsent.get();
            if (j10 != 0) {
                return j10;
            }
        } while (!this.map.replace(k2, atomicLongPutIfAbsent, new AtomicLong(j6)));
        return 0L;
    }

    @CanIgnoreReturnValue
    public long remove(K k2) {
        long j6;
        AtomicLong atomicLong = this.map.get(k2);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j6 = atomicLong.get();
            if (j6 == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j6, 0L));
        this.map.remove(k2, atomicLong);
        return j6;
    }

    public void removeAllZeros() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    @CanIgnoreReturnValue
    @Beta
    public boolean removeIfZero(K k2) {
        return remove(k2, 0L);
    }

    public boolean replace(K k2, long j6, long j10) {
        if (j6 == 0) {
            return putIfAbsent(k2, j10) == 0;
        }
        AtomicLong atomicLong = this.map.get(k2);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(j6, j10);
    }

    public int size() {
        return this.map.size();
    }

    public long sum() {
        Iterator<AtomicLong> it = this.map.values().iterator();
        long j6 = 0;
        while (it.hasNext()) {
            j6 += it.next().get();
        }
        return j6;
    }

    public String toString() {
        return this.map.toString();
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> map) {
        AtomicLongMap<K> atomicLongMapCreate = create();
        atomicLongMapCreate.putAll(map);
        return atomicLongMapCreate;
    }

    public boolean remove(K k2, long j6) {
        AtomicLong atomicLong = this.map.get(k2);
        if (atomicLong == null) {
            return false;
        }
        long j10 = atomicLong.get();
        if (j10 != j6) {
            return false;
        }
        if (j10 != 0 && !atomicLong.compareAndSet(j10, 0L)) {
            return false;
        }
        this.map.remove(k2, atomicLong);
        return true;
    }
}
