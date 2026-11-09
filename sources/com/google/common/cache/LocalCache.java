package com.google.common.cache;

import com.airbnb.lottie.model.layer.d;
import com.alibaba.android.arouter.utils.Consts;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    final int concurrencyLevel;

    @CheckForNull
    final CacheLoader<? super K, V> defaultLoader;
    final EntryFactory entryFactory;

    @RetainedWith
    @CheckForNull
    Set<Map.Entry<K, V>> entrySet;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final AbstractCache.StatsCounter globalStatsCounter;
    final Equivalence<Object> keyEquivalence;

    @RetainedWith
    @CheckForNull
    Set<K> keySet;
    final Strength keyStrength;
    final long maxWeight;
    final long refreshNanos;
    final RemovalListener<K, V> removalListener;
    final Queue<RemovalNotification<K, V>> removalNotificationQueue;
    final int segmentMask;
    final int segmentShift;
    final Segment<K, V>[] segments;
    final Ticker ticker;
    final Equivalence<Object> valueEquivalence;
    final Strength valueStrength;

    @RetainedWith
    @CheckForNull
    Collection<V> values;
    final Weigher<K, V> weigher;
    static final Logger logger = Logger.getLogger(LocalCache.class.getName());
    static final ValueReference<Object, Object> UNSET = new ValueReference<Object, Object>() { // from class: com.google.common.cache.LocalCache.1
        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<Object, Object> copyFor(ReferenceQueue<Object> referenceQueue, @CheckForNull Object obj, ReferenceEntry<Object, Object> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<Object, Object> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public Object waitForValue() {
            return null;
        }
    };
    static final Queue<?> DISCARDING_QUEUE = new AbstractQueue<Object>() { // from class: com.google.common.cache.LocalCache.2
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return ImmutableSet.of().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    };

    public abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        public AbstractCacheSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() throws Throwable {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return LocalCache.toArrayList(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.toArrayList(this).toArray(eArr);
        }
    }

    public static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j6) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j6) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        final ReferenceEntry<K, V> head = new AbstractReferenceEntry<K, V>(this) { // from class: com.google.common.cache.LocalCache.AccessQueue.1

            @Weak
            ReferenceEntry<K, V> nextAccess = this;

            @Weak
            ReferenceEntry<K, V> previousAccess = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInAccessQueue() {
                return this.nextAccess;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInAccessQueue() {
                return this.previousAccess;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setAccessTime(long j6) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.nextAccess = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.previousAccess = referenceEntry;
            }
        };

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.head;
                if (nextInAccessQueue == referenceEntry) {
                    referenceEntry.setNextInAccessQueue(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.head;
                    referenceEntry2.setPreviousInAccessQueue(referenceEntry2);
                    return;
                } else {
                    ReferenceEntry<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    LocalCache.nullifyAccessOrder(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.head.getNextInAccessQueue() == this.head;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.AccessQueue.2
                @Override // com.google.common.collect.AbstractSequentialIterator
                public ReferenceEntry<K, V> computeNext(ReferenceEntry<K, V> referenceEntry) {
                    ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
                    if (nextInAccessQueue == AccessQueue.this.head) {
                        return null;
                    }
                    return nextInAccessQueue;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInAccessQueue = referenceEntry.getPreviousInAccessQueue();
            ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
            LocalCache.connectAccessOrder(previousInAccessQueue, nextInAccessQueue);
            LocalCache.nullifyAccessOrder(referenceEntry);
            return nextInAccessQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i7 = 0;
            for (ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue(); nextInAccessQueue != this.head; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i7++;
            }
            return i7;
        }

        @Override // java.util.Queue
        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.connectAccessOrder(referenceEntry.getPreviousInAccessQueue(), referenceEntry.getNextInAccessQueue());
            LocalCache.connectAccessOrder(this.head.getPreviousInAccessQueue(), referenceEntry);
            LocalCache.connectAccessOrder(referenceEntry, this.head);
            return true;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> peek() {
            ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            if (nextInAccessQueue == this.head) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> poll() {
            ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            if (nextInAccessQueue == this.head) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.cache.LocalCache$EntryFactory, still in use, count: 1, list:
      (r0v0 com.google.common.cache.LocalCache$EntryFactory) from 0x005a: FILLED_NEW_ARRAY 
      (r0v0 com.google.common.cache.LocalCache$EntryFactory)
      (r1v1 com.google.common.cache.LocalCache$EntryFactory)
      (r3v1 com.google.common.cache.LocalCache$EntryFactory)
      (r5v1 com.google.common.cache.LocalCache$EntryFactory)
      (r7v1 com.google.common.cache.LocalCache$EntryFactory)
      (r9v1 com.google.common.cache.LocalCache$EntryFactory)
      (r11v1 com.google.common.cache.LocalCache$EntryFactory)
      (r13v1 com.google.common.cache.LocalCache$EntryFactory)
     A[WRAPPED] (LINE:91) elemType: com.google.common.cache.LocalCache$EntryFactory
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static abstract class EntryFactory {
        STRONG { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new StrongEntry(k2, i7, referenceEntry);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessEntry(k2, i7, referenceEntry);
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new StrongWriteEntry(k2, i7, referenceEntry);
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessWriteEntry(k2, i7, referenceEntry);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new WeakEntry(segment.keyReferenceQueue, k2, i7, referenceEntry);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessEntry(segment.keyReferenceQueue, k2, i7, referenceEntry);
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new WeakWriteEntry(segment.keyReferenceQueue, k2, i7, referenceEntry);
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessWriteEntry(segment.keyReferenceQueue, k2, i7, referenceEntry);
            }
        };

        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final EntryFactory[] factories = {new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new StrongEntry(k2, i7, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessEntry(k2, i7, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new StrongWriteEntry(k2, i7, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessWriteEntry(k2, i7, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new WeakEntry(segment.keyReferenceQueue, k2, i7, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessEntry(segment.keyReferenceQueue, k2, i7, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new WeakWriteEntry(segment.keyReferenceQueue, k2, i7, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessWriteEntry(segment.keyReferenceQueue, k2, i7, referenceEntry);
            }
        }};

        static {
        }

        private EntryFactory(String str, int i7) {
            super(str, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static EntryFactory getFactory(Strength strength, boolean z3, boolean z8) {
            return factories[((strength == Strength.WEAK ? (char) 4 : (char) 0) | (z3 ? 1 : 0) ? 1 : 0) | (z8 ? 2 : 0)];
        }

        public static EntryFactory valueOf(String str) {
            return (EntryFactory) Enum.valueOf(EntryFactory.class, str);
        }

        public static EntryFactory[] values() {
            return (EntryFactory[]) $VALUES.clone();
        }

        public <K, V> void copyAccessEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setAccessTime(referenceEntry.getAccessTime());
            LocalCache.connectAccessOrder(referenceEntry.getPreviousInAccessQueue(), referenceEntry2);
            LocalCache.connectAccessOrder(referenceEntry2, referenceEntry.getNextInAccessQueue());
            LocalCache.nullifyAccessOrder(referenceEntry);
        }

        public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            return newEntry(segment, referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
        }

        public <K, V> void copyWriteEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setWriteTime(referenceEntry.getWriteTime());
            LocalCache.connectWriteOrder(referenceEntry.getPreviousInWriteQueue(), referenceEntry2);
            LocalCache.connectWriteOrder(referenceEntry2, referenceEntry.getNextInWriteQueue());
            LocalCache.nullifyWriteOrder(referenceEntry);
        }

        public abstract <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry);
    }

    public final class EntryIterator extends LocalCache<K, V>.HashIterator<Map.Entry<K, V>> {
        public EntryIterator(LocalCache localCache) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public Map.Entry<K, V> next() {
            return nextEntry();
        }
    }

    public final class EntrySet extends LocalCache<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
        public EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = LocalCache.this.get(key)) != null && LocalCache.this.valueEquivalence.equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    public abstract class HashIterator<T> implements Iterator<T> {

        @CheckForNull
        Segment<K, V> currentSegment;

        @CheckForNull
        AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;

        @CheckForNull
        LocalCache<K, V>.WriteThroughEntry lastReturned;

        @CheckForNull
        ReferenceEntry<K, V> nextEntry;

        @CheckForNull
        LocalCache<K, V>.WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex = -1;

        public HashIterator() {
            this.nextSegmentIndex = LocalCache.this.segments.length - 1;
            advance();
        }

        public final void advance() {
            this.nextExternal = null;
            if (nextInChain() || nextInTable()) {
                return;
            }
            while (true) {
                int i7 = this.nextSegmentIndex;
                if (i7 < 0) {
                    return;
                }
                Segment<K, V>[] segmentArr = LocalCache.this.segments;
                this.nextSegmentIndex = i7 - 1;
                Segment<K, V> segment = segmentArr[i7];
                this.currentSegment = segment;
                if (segment.count != 0) {
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.currentSegment.table;
                    this.currentTable = atomicReferenceArray;
                    this.nextTableIndex = atomicReferenceArray.length() - 1;
                    if (nextInTable()) {
                        return;
                    }
                }
            }
        }

        public boolean advanceTo(ReferenceEntry<K, V> referenceEntry) {
            Segment<K, V> segment;
            try {
                long j6 = LocalCache.this.ticker.read();
                K key = referenceEntry.getKey();
                Object liveValue = LocalCache.this.getLiveValue(referenceEntry, j6);
                if (liveValue == null) {
                    return false;
                }
                this.nextExternal = new WriteThroughEntry(key, liveValue);
                return true;
            } finally {
                this.currentSegment.postReadCleanup();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextExternal != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        public LocalCache<K, V>.WriteThroughEntry nextEntry() {
            LocalCache<K, V>.WriteThroughEntry writeThroughEntry = this.nextExternal;
            if (writeThroughEntry == null) {
                throw new NoSuchElementException();
            }
            this.lastReturned = writeThroughEntry;
            advance();
            return this.lastReturned;
        }

        public boolean nextInChain() {
            ReferenceEntry<K, V> referenceEntry = this.nextEntry;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.nextEntry = referenceEntry.getNext();
                ReferenceEntry<K, V> referenceEntry2 = this.nextEntry;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (advanceTo(referenceEntry2)) {
                    return true;
                }
                referenceEntry = this.nextEntry;
            }
        }

        public boolean nextInTable() {
            while (true) {
                int i7 = this.nextTableIndex;
                if (i7 < 0) {
                    return false;
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i7 - 1;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i7);
                this.nextEntry = referenceEntry;
                if (referenceEntry != null && (advanceTo(referenceEntry) || nextInChain())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.lastReturned != null);
            LocalCache.this.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    public final class KeyIterator extends LocalCache<K, V>.HashIterator<K> {
        public KeyIterator(LocalCache localCache) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public K next() {
            return nextEntry().getKey();
        }
    }

    public final class KeySet extends LocalCache<K, V>.AbstractCacheSet<K> {
        public KeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements LoadingCache<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        @CheckForNull
        transient LoadingCache<K, V> autoDelegate;

        public LoadingSerializationProxy(LocalCache<K, V> localCache) {
            super(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.autoDelegate = (LoadingCache<K, V>) recreateCacheBuilder().build(this.loader);
        }

        private Object readResolve() {
            return this.autoDelegate;
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k2) {
            return this.autoDelegate.apply(k2);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k2) throws ExecutionException {
            return this.autoDelegate.get(k2);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.autoDelegate.getAll(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k2) {
            return this.autoDelegate.getUnchecked(k2);
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k2) {
            this.autoDelegate.refresh(k2);
        }
    }

    public static class LoadingValueReference<K, V> implements ValueReference<K, V> {
        final SettableFuture<V> futureValue;
        volatile ValueReference<K, V> oldValue;
        final Stopwatch stopwatch;

        public LoadingValueReference() {
            this(LocalCache.unset());
        }

        private ListenableFuture<V> fullyFailedFuture(Throwable th) {
            return Futures.immediateFailedFuture(th);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, @CheckForNull V v3, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        public long elapsedNanos() {
            return this.stopwatch.elapsed(TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.oldValue.get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        public ValueReference<K, V> getOldValue() {
            return this.oldValue;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.oldValue.getWeight();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return this.oldValue.isActive();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return true;
        }

        public ListenableFuture<V> loadFuture(K k2, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.stopwatch.start();
                V v3 = this.oldValue.get();
                if (v3 == null) {
                    V vLoad = cacheLoader.load(k2);
                    return set(vLoad) ? this.futureValue : Futures.immediateFuture(vLoad);
                }
                ListenableFuture<V> listenableFutureReload = cacheLoader.reload(k2, v3);
                return listenableFutureReload == null ? Futures.immediateFuture(null) : Futures.transform(listenableFutureReload, new Function<V, V>() { // from class: com.google.common.cache.LocalCache.LoadingValueReference.1
                    @Override // com.google.common.base.Function
                    public V apply(V v4) {
                        LoadingValueReference.this.set(v4);
                        return v4;
                    }
                }, MoreExecutors.directExecutor());
            } catch (Throwable th) {
                ListenableFuture<V> listenableFutureFullyFailedFuture = setException(th) ? this.futureValue : fullyFailedFuture(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return listenableFutureFullyFailedFuture;
            }
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(@CheckForNull V v3) {
            if (v3 != null) {
                set(v3);
            } else {
                this.oldValue = LocalCache.unset();
            }
        }

        public boolean set(@CheckForNull V v3) {
            return this.futureValue.set(v3);
        }

        public boolean setException(Throwable th) {
            return this.futureValue.setException(th);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() throws ExecutionException {
            return (V) Uninterruptibles.getUninterruptibly(this.futureValue);
        }

        public LoadingValueReference(ValueReference<K, V> valueReference) {
            this.futureValue = SettableFuture.create();
            this.stopwatch = Stopwatch.createUnstarted();
            this.oldValue = valueReference;
        }
    }

    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        public LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super();
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k2) {
            return getUnchecked(k2);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k2) throws ExecutionException {
            return this.localCache.getOrLoad(k2);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.localCache.getAll(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k2) {
            try {
                return get(k2);
            } catch (ExecutionException e10) {
                throw new UncheckedExecutionException(e10.getCause());
            }
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k2) {
            this.localCache.refresh(k2);
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        public Object writeReplace() {
            return new LoadingSerializationProxy(this.localCache);
        }
    }

    public static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final LocalCache<K, V> localCache;

        @Override // com.google.common.cache.Cache
        public ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        @Override // com.google.common.cache.Cache
        public void cleanUp() {
            this.localCache.cleanUp();
        }

        @Override // com.google.common.cache.Cache
        public V get(K k2, final Callable<? extends V> callable) throws ExecutionException {
            Preconditions.checkNotNull(callable);
            return this.localCache.get(k2, new CacheLoader<Object, V>(this) { // from class: com.google.common.cache.LocalCache.LocalManualCache.1
                @Override // com.google.common.cache.CacheLoader
                public V load(Object obj) throws Exception {
                    return (V) callable.call();
                }
            });
        }

        @Override // com.google.common.cache.Cache
        public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
            return this.localCache.getAllPresent(iterable);
        }

        @Override // com.google.common.cache.Cache
        @CheckForNull
        public V getIfPresent(Object obj) {
            return this.localCache.getIfPresent(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidate(Object obj) {
            Preconditions.checkNotNull(obj);
            this.localCache.remove(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll(Iterable<?> iterable) {
            this.localCache.invalidateAll(iterable);
        }

        @Override // com.google.common.cache.Cache
        public void put(K k2, V v3) {
            this.localCache.put(k2, v3);
        }

        @Override // com.google.common.cache.Cache
        public void putAll(Map<? extends K, ? extends V> map) {
            this.localCache.putAll(map);
        }

        @Override // com.google.common.cache.Cache
        public long size() {
            return this.localCache.longSize();
        }

        @Override // com.google.common.cache.Cache
        public CacheStats stats() {
            AbstractCache.SimpleStatsCounter simpleStatsCounter = new AbstractCache.SimpleStatsCounter();
            simpleStatsCounter.incrementBy(this.localCache.globalStatsCounter);
            for (Segment<K, V> segment : this.localCache.segments) {
                simpleStatsCounter.incrementBy(segment.statsCounter);
            }
            return simpleStatsCounter.snapshot();
        }

        public Object writeReplace() {
            return new ManualSerializationProxy(this.localCache);
        }

        public LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new LocalCache(cacheBuilder, null));
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll() throws Throwable {
            this.localCache.clear();
        }

        private LocalManualCache(LocalCache<K, V> localCache) {
            this.localCache = localCache;
        }
    }

    public static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        final int concurrencyLevel;

        @CheckForNull
        transient Cache<K, V> delegate;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final CacheLoader<? super K, V> loader;
        final long maxWeight;
        final RemovalListener<? super K, ? super V> removalListener;

        @CheckForNull
        final Ticker ticker;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;
        final Weigher<K, V> weigher;

        public ManualSerializationProxy(LocalCache<K, V> localCache) {
            this(localCache.keyStrength, localCache.valueStrength, localCache.keyEquivalence, localCache.valueEquivalence, localCache.expireAfterWriteNanos, localCache.expireAfterAccessNanos, localCache.maxWeight, localCache.weigher, localCache.concurrencyLevel, localCache.removalListener, localCache.ticker, localCache.defaultLoader);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.delegate = (Cache<K, V>) recreateCacheBuilder().build();
        }

        private Object readResolve() {
            return this.delegate;
        }

        public CacheBuilder<K, V> recreateCacheBuilder() {
            CacheBuilder<K, V> cacheBuilder = (CacheBuilder<K, V>) CacheBuilder.newBuilder().setKeyStrength(this.keyStrength).setValueStrength(this.valueStrength).keyEquivalence(this.keyEquivalence).valueEquivalence(this.valueEquivalence).concurrencyLevel(this.concurrencyLevel).removalListener(this.removalListener);
            cacheBuilder.strictParsing = false;
            long j6 = this.expireAfterWriteNanos;
            if (j6 > 0) {
                cacheBuilder.expireAfterWrite(j6, TimeUnit.NANOSECONDS);
            }
            long j10 = this.expireAfterAccessNanos;
            if (j10 > 0) {
                cacheBuilder.expireAfterAccess(j10, TimeUnit.NANOSECONDS);
            }
            Weigher weigher = this.weigher;
            if (weigher != CacheBuilder.OneWeigher.INSTANCE) {
                cacheBuilder.weigher(weigher);
                long j11 = this.maxWeight;
                if (j11 != -1) {
                    cacheBuilder.maximumWeight(j11);
                }
            } else {
                long j12 = this.maxWeight;
                if (j12 != -1) {
                    cacheBuilder.maximumSize(j12);
                }
            }
            Ticker ticker = this.ticker;
            if (ticker != null) {
                cacheBuilder.ticker(ticker);
            }
            return cacheBuilder;
        }

        private ManualSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j6, long j10, long j11, Weigher<K, V> weigher, int i7, RemovalListener<? super K, ? super V> removalListener, Ticker ticker, CacheLoader<? super K, V> cacheLoader) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.expireAfterWriteNanos = j6;
            this.expireAfterAccessNanos = j10;
            this.maxWeight = j11;
            this.weigher = weigher;
            this.concurrencyLevel = i7;
            this.removalListener = removalListener;
            this.ticker = (ticker == Ticker.systemTicker() || ticker == CacheBuilder.NULL_TICKER) ? null : ticker;
            this.loader = cacheLoader;
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public Cache<K, V> delegate() {
            return this.delegate;
        }
    }

    public enum NullEntry implements ReferenceEntry<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j6) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<Object, Object> valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j6) {
        }
    }

    public static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {
        final ReferenceEntry<K, V> entry;

        public SoftValueReference(ReferenceQueue<V> referenceQueue, V v3, ReferenceEntry<K, V> referenceEntry) {
            super(v3, referenceQueue);
            this.entry = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v3, ReferenceEntry<K, V> referenceEntry) {
            return new SoftValueReference(referenceQueue, v3, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v3) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    public enum Strength {
        STRONG { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v3, int i7) {
                return i7 == 1 ? new StrongValueReference(v3) : new WeightedStrongValueReference(v3, i7);
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v3, int i7) {
                return i7 == 1 ? new SoftValueReference(segment.valueReferenceQueue, v3, referenceEntry) : new WeightedSoftValueReference(segment.valueReferenceQueue, v3, referenceEntry, i7);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v3, int i7) {
                return i7 == 1 ? new WeakValueReference(segment.valueReferenceQueue, v3, referenceEntry) : new WeightedWeakValueReference(segment.valueReferenceQueue, v3, referenceEntry, i7);
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();

        public abstract <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v3, int i7);
    }

    public static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {
        volatile long accessTime;

        @Weak
        ReferenceEntry<K, V> nextAccess;

        @Weak
        ReferenceEntry<K, V> previousAccess;

        public StrongAccessEntry(K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(k2, i7, referenceEntry);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = LocalCache.nullEntry();
            this.previousAccess = LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j6) {
            this.accessTime = j6;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }
    }

    public static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {
        volatile long accessTime;

        @Weak
        ReferenceEntry<K, V> nextAccess;

        @Weak
        ReferenceEntry<K, V> nextWrite;

        @Weak
        ReferenceEntry<K, V> previousAccess;

        @Weak
        ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        public StrongAccessWriteEntry(K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(k2, i7, referenceEntry);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = LocalCache.nullEntry();
            this.previousAccess = LocalCache.nullEntry();
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = LocalCache.nullEntry();
            this.previousWrite = LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j6) {
            this.accessTime = j6;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j6) {
            this.writeTime = j6;
        }
    }

    public static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {
        final int hash;
        final K key;

        @CheckForNull
        final ReferenceEntry<K, V> next;
        volatile ValueReference<K, V> valueReference = LocalCache.unset();

        public StrongEntry(K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            this.key = k2;
            this.hash = i7;
            this.next = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.hash;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            return this.next;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            this.valueReference = valueReference;
        }
    }

    public static class StrongValueReference<K, V> implements ValueReference<K, V> {
        final V referent;

        public StrongValueReference(V v3) {
            this.referent = v3;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v3, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.referent;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v3) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    public static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {

        @Weak
        ReferenceEntry<K, V> nextWrite;

        @Weak
        ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        public StrongWriteEntry(K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(k2, i7, referenceEntry);
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = LocalCache.nullEntry();
            this.previousWrite = LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j6) {
            this.writeTime = j6;
        }
    }

    public final class ValueIterator extends LocalCache<K, V>.HashIterator<V> {
        public ValueIterator(LocalCache localCache) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public V next() {
            return nextEntry().getValue();
        }
    }

    public interface ValueReference<K, V> {
        ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, @CheckForNull V v3, ReferenceEntry<K, V> referenceEntry);

        @CheckForNull
        V get();

        @CheckForNull
        ReferenceEntry<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(@CheckForNull V v3);

        V waitForValue() throws ExecutionException;
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() throws Throwable {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return LocalCache.toArrayList(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.toArrayList(this).toArray(eArr);
        }
    }

    public static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {
        volatile long accessTime;

        @Weak
        ReferenceEntry<K, V> nextAccess;

        @Weak
        ReferenceEntry<K, V> previousAccess;

        public WeakAccessEntry(ReferenceQueue<K> referenceQueue, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k2, i7, referenceEntry);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = LocalCache.nullEntry();
            this.previousAccess = LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j6) {
            this.accessTime = j6;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }
    }

    public static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {
        volatile long accessTime;

        @Weak
        ReferenceEntry<K, V> nextAccess;

        @Weak
        ReferenceEntry<K, V> nextWrite;

        @Weak
        ReferenceEntry<K, V> previousAccess;

        @Weak
        ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        public WeakAccessWriteEntry(ReferenceQueue<K> referenceQueue, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k2, i7, referenceEntry);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = LocalCache.nullEntry();
            this.previousAccess = LocalCache.nullEntry();
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = LocalCache.nullEntry();
            this.previousWrite = LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j6) {
            this.accessTime = j6;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j6) {
            this.writeTime = j6;
        }
    }

    public static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {
        final int hash;

        @CheckForNull
        final ReferenceEntry<K, V> next;
        volatile ValueReference<K, V> valueReference;

        public WeakEntry(ReferenceQueue<K> referenceQueue, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(k2, referenceQueue);
            this.valueReference = LocalCache.unset();
            this.hash = i7;
            this.next = referenceEntry;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.hash;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            return get();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            return this.next;
        }

        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j6) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            this.valueReference = valueReference;
        }

        public void setWriteTime(long j6) {
            throw new UnsupportedOperationException();
        }
    }

    public static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {
        final ReferenceEntry<K, V> entry;

        public WeakValueReference(ReferenceQueue<V> referenceQueue, V v3, ReferenceEntry<K, V> referenceEntry) {
            super(v3, referenceQueue);
            this.entry = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v3, ReferenceEntry<K, V> referenceEntry) {
            return new WeakValueReference(referenceQueue, v3, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v3) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    public static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {

        @Weak
        ReferenceEntry<K, V> nextWrite;

        @Weak
        ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        public WeakWriteEntry(ReferenceQueue<K> referenceQueue, K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k2, i7, referenceEntry);
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = LocalCache.nullEntry();
            this.previousWrite = LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j6) {
            this.writeTime = j6;
        }
    }

    public static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {
        final int weight;

        public WeightedSoftValueReference(ReferenceQueue<V> referenceQueue, V v3, ReferenceEntry<K, V> referenceEntry, int i7) {
            super(referenceQueue, v3, referenceEntry);
            this.weight = i7;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v3, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedSoftValueReference(referenceQueue, v3, referenceEntry, this.weight);
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.weight;
        }
    }

    public static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {
        final int weight;

        public WeightedStrongValueReference(V v3, int i7) {
            super(v3);
            this.weight = i7;
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.weight;
        }
    }

    public static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {
        final int weight;

        public WeightedWeakValueReference(ReferenceQueue<V> referenceQueue, V v3, ReferenceEntry<K, V> referenceEntry, int i7) {
            super(referenceQueue, v3, referenceEntry);
            this.weight = i7;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v3, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedWeakValueReference(referenceQueue, v3, referenceEntry, this.weight);
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.weight;
        }
    }

    public static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        final ReferenceEntry<K, V> head = new AbstractReferenceEntry<K, V>(this) { // from class: com.google.common.cache.LocalCache.WriteQueue.1

            @Weak
            ReferenceEntry<K, V> nextWrite = this;

            @Weak
            ReferenceEntry<K, V> previousWrite = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInWriteQueue() {
                return this.nextWrite;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInWriteQueue() {
                return this.previousWrite;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.nextWrite = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.previousWrite = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setWriteTime(long j6) {
            }
        };

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.head;
                if (nextInWriteQueue == referenceEntry) {
                    referenceEntry.setNextInWriteQueue(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.head;
                    referenceEntry2.setPreviousInWriteQueue(referenceEntry2);
                    return;
                } else {
                    ReferenceEntry<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    LocalCache.nullifyWriteOrder(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.head.getNextInWriteQueue() == this.head;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.WriteQueue.2
                @Override // com.google.common.collect.AbstractSequentialIterator
                public ReferenceEntry<K, V> computeNext(ReferenceEntry<K, V> referenceEntry) {
                    ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
                    if (nextInWriteQueue == WriteQueue.this.head) {
                        return null;
                    }
                    return nextInWriteQueue;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInWriteQueue = referenceEntry.getPreviousInWriteQueue();
            ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
            LocalCache.connectWriteOrder(previousInWriteQueue, nextInWriteQueue);
            LocalCache.nullifyWriteOrder(referenceEntry);
            return nextInWriteQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i7 = 0;
            for (ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue(); nextInWriteQueue != this.head; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i7++;
            }
            return i7;
        }

        @Override // java.util.Queue
        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.connectWriteOrder(referenceEntry.getPreviousInWriteQueue(), referenceEntry.getNextInWriteQueue());
            LocalCache.connectWriteOrder(this.head.getPreviousInWriteQueue(), referenceEntry);
            LocalCache.connectWriteOrder(referenceEntry, this.head);
            return true;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> peek() {
            ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            if (nextInWriteQueue == this.head) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> poll() {
            ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            if (nextInWriteQueue == this.head) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }
    }

    public final class WriteThroughEntry implements Map.Entry<K, V> {
        final K key;
        V value;

        public WriteThroughEntry(K k2, V v3) {
            this.key = k2;
            this.value = v3;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.key.equals(entry.getKey()) && this.value.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            V v4 = (V) LocalCache.this.put(this.key, v3);
            this.value = v3;
            return v4;
        }

        public String toString() {
            String strValueOf = String.valueOf(getKey());
            String strValueOf2 = String.valueOf(getValue());
            return d.i(strValueOf2.length() + strValueOf.length() + 1, strValueOf, "=", strValueOf2);
        }
    }

    public LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, @CheckForNull CacheLoader<? super K, V> cacheLoader) {
        this.concurrencyLevel = Math.min(cacheBuilder.getConcurrencyLevel(), MAX_SEGMENTS);
        Strength keyStrength = cacheBuilder.getKeyStrength();
        this.keyStrength = keyStrength;
        this.valueStrength = cacheBuilder.getValueStrength();
        this.keyEquivalence = cacheBuilder.getKeyEquivalence();
        this.valueEquivalence = cacheBuilder.getValueEquivalence();
        long maximumWeight = cacheBuilder.getMaximumWeight();
        this.maxWeight = maximumWeight;
        this.weigher = (Weigher<K, V>) cacheBuilder.getWeigher();
        this.expireAfterAccessNanos = cacheBuilder.getExpireAfterAccessNanos();
        this.expireAfterWriteNanos = cacheBuilder.getExpireAfterWriteNanos();
        this.refreshNanos = cacheBuilder.getRefreshNanos();
        CacheBuilder.NullListener nullListener = (RemovalListener<K, V>) cacheBuilder.getRemovalListener();
        this.removalListener = nullListener;
        this.removalNotificationQueue = nullListener == CacheBuilder.NullListener.INSTANCE ? discardingQueue() : new ConcurrentLinkedQueue<>();
        this.ticker = cacheBuilder.getTicker(recordsTime());
        this.entryFactory = EntryFactory.getFactory(keyStrength, usesAccessEntries(), usesWriteEntries());
        this.globalStatsCounter = cacheBuilder.getStatsCounterSupplier().get();
        this.defaultLoader = cacheLoader;
        int iMin = Math.min(cacheBuilder.getInitialCapacity(), 1073741824);
        if (evictsBySize() && !customWeigher()) {
            iMin = (int) Math.min(iMin, maximumWeight);
        }
        int i7 = 0;
        int i10 = 1;
        int i11 = 0;
        int i12 = 1;
        while (i12 < this.concurrencyLevel && (!evictsBySize() || i12 * 20 <= this.maxWeight)) {
            i11++;
            i12 <<= 1;
        }
        this.segmentShift = 32 - i11;
        this.segmentMask = i12 - 1;
        this.segments = newSegmentArray(i12);
        int i13 = iMin / i12;
        while (i10 < (i13 * i12 < iMin ? i13 + 1 : i13)) {
            i10 <<= 1;
        }
        if (evictsBySize()) {
            long j6 = this.maxWeight;
            long j10 = i12;
            long j11 = (j6 / j10) + 1;
            long j12 = j6 % j10;
            while (true) {
                Segment<K, V>[] segmentArr = this.segments;
                if (i7 >= segmentArr.length) {
                    return;
                }
                if (i7 == j12) {
                    j11--;
                }
                segmentArr[i7] = createSegment(i10, j11, cacheBuilder.getStatsCounterSupplier().get());
                i7++;
            }
        } else {
            while (true) {
                Segment<K, V>[] segmentArr2 = this.segments;
                if (i7 >= segmentArr2.length) {
                    return;
                }
                segmentArr2[i7] = createSegment(i10, -1L, cacheBuilder.getStatsCounterSupplier().get());
                i7++;
            }
        }
    }

    public static <K, V> void connectAccessOrder(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInAccessQueue(referenceEntry2);
        referenceEntry2.setPreviousInAccessQueue(referenceEntry);
    }

    public static <K, V> void connectWriteOrder(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInWriteQueue(referenceEntry2);
        referenceEntry2.setPreviousInWriteQueue(referenceEntry);
    }

    public static <E> Queue<E> discardingQueue() {
        return (Queue<E>) DISCARDING_QUEUE;
    }

    public static <K, V> ReferenceEntry<K, V> nullEntry() {
        return NullEntry.INSTANCE;
    }

    public static <K, V> void nullifyAccessOrder(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry<K, V> referenceEntryNullEntry = nullEntry();
        referenceEntry.setNextInAccessQueue(referenceEntryNullEntry);
        referenceEntry.setPreviousInAccessQueue(referenceEntryNullEntry);
    }

    public static <K, V> void nullifyWriteOrder(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry<K, V> referenceEntryNullEntry = nullEntry();
        referenceEntry.setNextInWriteQueue(referenceEntryNullEntry);
        referenceEntry.setPreviousInWriteQueue(referenceEntryNullEntry);
    }

    public static int rehash(int i7) {
        int i10 = i7 + ((i7 << 15) ^ (-12931));
        int i11 = i10 ^ (i10 >>> 10);
        int i12 = i11 + (i11 << 3);
        int i13 = i12 ^ (i12 >>> 6);
        int i14 = (i13 << 2) + (i13 << 14) + i13;
        return (i14 >>> 16) ^ i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> toArrayList(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.addAll(arrayList, collection.iterator());
        return arrayList;
    }

    public static <K, V> ValueReference<K, V> unset() {
        return (ValueReference<K, V>) UNSET;
    }

    public void cleanUp() {
        for (Segment<K, V> segment : this.segments) {
            segment.cleanUp();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() throws Throwable {
        for (Segment<K, V> segment : this.segments) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).containsKey(obj, iHash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        int i7 = 0;
        if (obj == null) {
            return false;
        }
        long j6 = this.ticker.read();
        Segment<K, V>[] segmentArr = this.segments;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = segmentArr.length;
            long j11 = 0;
            int i11 = i7 == true ? 1 : 0;
            while (i11 < length) {
                Segment<K, V> segment = segmentArr[i11];
                int i12 = segment.count;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segment.table;
                int i13 = i7;
                while (i13 < atomicReferenceArray.length()) {
                    ReferenceEntry<K, V> next = atomicReferenceArray.get(i13);
                    while (next != null) {
                        Segment<K, V>[] segmentArr2 = segmentArr;
                        V liveValue = segment.getLiveValue(next, j6);
                        ReferenceEntry<K, V> referenceEntry = next;
                        if (liveValue != null && this.valueEquivalence.equivalent(obj, liveValue)) {
                            return true;
                        }
                        next = referenceEntry.getNext();
                        segmentArr = segmentArr2;
                    }
                    i13++;
                }
                j11 += (long) segment.modCount;
                i11++;
                i7 = i13;
            }
            boolean z3 = i7;
            Segment<K, V>[] segmentArr3 = segmentArr;
            if (j11 == j10) {
                return z3;
            }
            i10++;
            j10 = j11;
            i7 = z3 ? 1 : 0;
            segmentArr = segmentArr3;
        }
        return i7 == true ? 1 : 0;
    }

    @VisibleForTesting
    public ReferenceEntry<K, V> copyEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        return segmentFor(referenceEntry.getHash()).copyEntry(referenceEntry, referenceEntry2);
    }

    public Segment<K, V> createSegment(int i7, long j6, AbstractCache.StatsCounter statsCounter) {
        return new Segment<>(this, i7, j6, statsCounter);
    }

    public boolean customWeigher() {
        return this.weigher != CacheBuilder.OneWeigher.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @GwtIncompatible
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    public boolean evictsBySize() {
        return this.maxWeight >= 0;
    }

    public boolean expires() {
        return expiresAfterWrite() || expiresAfterAccess();
    }

    public boolean expiresAfterAccess() {
        return this.expireAfterAccessNanos > 0;
    }

    public boolean expiresAfterWrite() {
        return this.expireAfterWriteNanos > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).get(obj, iHash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
        LinkedHashSet linkedHashSetNewLinkedHashSet = Sets.newLinkedHashSet();
        int i7 = 0;
        int i10 = 0;
        for (K k2 : iterable) {
            Object obj = get(k2);
            if (!linkedHashMapNewLinkedHashMap.containsKey(k2)) {
                linkedHashMapNewLinkedHashMap.put(k2, obj);
                if (obj == null) {
                    i10++;
                    linkedHashSetNewLinkedHashSet.add(k2);
                } else {
                    i7++;
                }
            }
        }
        try {
            if (!linkedHashSetNewLinkedHashSet.isEmpty()) {
                try {
                    Map mapLoadAll = loadAll(Collections.unmodifiableSet(linkedHashSetNewLinkedHashSet), this.defaultLoader);
                    for (Object obj2 : linkedHashSetNewLinkedHashSet) {
                        Object obj3 = mapLoadAll.get(obj2);
                        if (obj3 == null) {
                            String strValueOf = String.valueOf(obj2);
                            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 37);
                            sb2.append("loadAll failed to return a value for ");
                            sb2.append(strValueOf);
                            throw new CacheLoader.InvalidCacheLoadException(sb2.toString());
                        }
                        linkedHashMapNewLinkedHashMap.put(obj2, obj3);
                    }
                } catch (CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (Object obj4 : linkedHashSetNewLinkedHashSet) {
                        i10--;
                        linkedHashMapNewLinkedHashMap.put(obj4, get(obj4, this.defaultLoader));
                    }
                }
            }
            ImmutableMap<K, V> immutableMapCopyOf = ImmutableMap.copyOf((Map) linkedHashMapNewLinkedHashMap);
            this.globalStatsCounter.recordHits(i7);
            this.globalStatsCounter.recordMisses(i10);
            return immutableMapCopyOf;
        } catch (Throwable th) {
            this.globalStatsCounter.recordHits(i7);
            this.globalStatsCounter.recordMisses(i10);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i7 = 0;
        int i10 = 0;
        for (Object obj : iterable) {
            V v3 = get(obj);
            if (v3 == null) {
                i10++;
            } else {
                builder.put(obj, v3);
                i7++;
            }
        }
        this.globalStatsCounter.recordHits(i7);
        this.globalStatsCounter.recordMisses(i10);
        return builder.buildKeepingLast();
    }

    public ReferenceEntry<K, V> getEntry(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).getEntry(obj, iHash);
    }

    @CheckForNull
    public V getIfPresent(Object obj) {
        int iHash = hash(Preconditions.checkNotNull(obj));
        V v3 = segmentFor(iHash).get(obj, iHash);
        if (v3 == null) {
            this.globalStatsCounter.recordMisses(1);
            return v3;
        }
        this.globalStatsCounter.recordHits(1);
        return v3;
    }

    @CheckForNull
    public V getLiveValue(ReferenceEntry<K, V> referenceEntry, long j6) {
        V v3;
        if (referenceEntry.getKey() == null || (v3 = referenceEntry.getValueReference().get()) == null || isExpired(referenceEntry, j6)) {
            return null;
        }
        return v3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    public V getOrDefault(@CheckForNull Object obj, @CheckForNull V v3) {
        V v4 = get(obj);
        return v4 != null ? v4 : v3;
    }

    public V getOrLoad(K k2) throws ExecutionException {
        return get(k2, this.defaultLoader);
    }

    public int hash(@CheckForNull Object obj) {
        return rehash(this.keyEquivalence.hash(obj));
    }

    public void invalidateAll(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.segments;
        long j6 = 0;
        for (int i7 = 0; i7 < segmentArr.length; i7++) {
            if (segmentArr[i7].count != 0) {
                return false;
            }
            j6 += (long) segmentArr[i7].modCount;
        }
        if (j6 == 0) {
            return true;
        }
        for (int i10 = 0; i10 < segmentArr.length; i10++) {
            if (segmentArr[i10].count != 0) {
                return false;
            }
            j6 -= (long) segmentArr[i10].modCount;
        }
        return j6 == 0;
    }

    public boolean isExpired(ReferenceEntry<K, V> referenceEntry, long j6) {
        Preconditions.checkNotNull(referenceEntry);
        if (!expiresAfterAccess() || j6 - referenceEntry.getAccessTime() < this.expireAfterAccessNanos) {
            return expiresAfterWrite() && j6 - referenceEntry.getWriteTime() >= this.expireAfterWriteNanos;
        }
        return true;
    }

    @VisibleForTesting
    public boolean isLive(ReferenceEntry<K, V> referenceEntry, long j6) {
        return segmentFor(referenceEntry.getHash()).getLiveValue(referenceEntry, j6) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    @CheckForNull
    public Map<K, V> loadAll(Set<? extends K> set, CacheLoader<? super K, V> cacheLoader) throws Throwable {
        Preconditions.checkNotNull(cacheLoader);
        Preconditions.checkNotNull(set);
        Stopwatch stopwatchCreateStarted = Stopwatch.createStarted();
        boolean z3 = true;
        boolean z8 = false;
        try {
            try {
                try {
                    Map<? super K, V> mapLoadAll = cacheLoader.loadAll(set);
                    if (mapLoadAll == null) {
                        this.globalStatsCounter.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                        String strValueOf = String.valueOf(cacheLoader);
                        throw new CacheLoader.InvalidCacheLoadException(d.h(strValueOf.length() + 31, strValueOf, " returned null map from loadAll"));
                    }
                    stopwatchCreateStarted.stop();
                    for (Map.Entry<K, V> entry : mapLoadAll.entrySet()) {
                        K key = entry.getKey();
                        V value = entry.getValue();
                        if (key == null || value == null) {
                            z8 = true;
                        } else {
                            put(key, value);
                        }
                    }
                    if (!z8) {
                        this.globalStatsCounter.recordLoadSuccess(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                        return mapLoadAll;
                    }
                    this.globalStatsCounter.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                    String strValueOf2 = String.valueOf(cacheLoader);
                    throw new CacheLoader.InvalidCacheLoadException(d.h(strValueOf2.length() + 42, strValueOf2, " returned null keys or values from loadAll"));
                } catch (RuntimeException e10) {
                    throw new UncheckedExecutionException(e10);
                } catch (Exception e11) {
                    throw new ExecutionException(e11);
                }
            } catch (CacheLoader.UnsupportedLoadingOperationException e12) {
                try {
                    throw e12;
                } catch (Throwable th) {
                    th = th;
                    if (!z3) {
                        this.globalStatsCounter.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                    }
                    throw th;
                }
            } catch (Error e13) {
                throw new ExecutionError(e13);
            } catch (InterruptedException e14) {
                Thread.currentThread().interrupt();
                throw new ExecutionException(e14);
            }
        } catch (Throwable th2) {
            th = th2;
            z3 = false;
            if (!z3) {
                this.globalStatsCounter.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
            }
            throw th;
        }
    }

    public long longSize() {
        long jMax = 0;
        for (Segment<K, V> segment : this.segments) {
            jMax += (long) Math.max(0, segment.count);
        }
        return jMax;
    }

    @VisibleForTesting
    public ReferenceEntry<K, V> newEntry(K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
        Segment<K, V> segmentSegmentFor = segmentFor(i7);
        segmentSegmentFor.lock();
        try {
            return segmentSegmentFor.newEntry(k2, i7, referenceEntry);
        } finally {
            segmentSegmentFor.unlock();
        }
    }

    public final Segment<K, V>[] newSegmentArray(int i7) {
        return new Segment[i7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @VisibleForTesting
    public ValueReference<K, V> newValueReference(ReferenceEntry<K, V> referenceEntry, V v3, int i7) {
        return this.valueStrength.referenceValue(segmentFor(referenceEntry.getHash()), referenceEntry, Preconditions.checkNotNull(v3), i7);
    }

    public void processPendingNotifications() {
        while (true) {
            RemovalNotification<K, V> removalNotificationPoll = this.removalNotificationQueue.poll();
            if (removalNotificationPoll == null) {
                return;
            }
            try {
                this.removalListener.onRemoval(removalNotificationPoll);
            } catch (Throwable th) {
                logger.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v3) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v3);
        int iHash = hash(k2);
        return segmentFor(iHash).put(k2, iHash, v3, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v3) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v3);
        int iHash = hash(k2);
        return segmentFor(iHash).put(k2, iHash, v3, true);
    }

    public void reclaimKey(ReferenceEntry<K, V> referenceEntry) throws Throwable {
        int hash = referenceEntry.getHash();
        segmentFor(hash).reclaimKey(referenceEntry, hash);
    }

    public void reclaimValue(ValueReference<K, V> valueReference) throws Throwable {
        ReferenceEntry<K, V> entry = valueReference.getEntry();
        int hash = entry.getHash();
        segmentFor(hash).reclaimValue(entry.getKey(), hash, valueReference);
    }

    public boolean recordsAccess() {
        return expiresAfterAccess();
    }

    public boolean recordsTime() {
        return recordsWrite() || recordsAccess();
    }

    public boolean recordsWrite() {
        return expiresAfterWrite() || refreshes();
    }

    public void refresh(K k2) {
        int iHash = hash(Preconditions.checkNotNull(k2));
        segmentFor(iHash).refresh(k2, iHash, this.defaultLoader, false);
    }

    public boolean refreshes() {
        return this.refreshNanos > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, @CheckForNull V v3, V v4) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v4);
        if (v3 == null) {
            return false;
        }
        int iHash = hash(k2);
        return segmentFor(iHash).replace(k2, iHash, v3, v4);
    }

    public Segment<K, V> segmentFor(int i7) {
        return this.segments[(i7 >>> this.segmentShift) & this.segmentMask];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return Ints.saturatedCast(longSize());
    }

    public boolean usesAccessEntries() {
        return usesAccessQueue() || recordsAccess();
    }

    public boolean usesAccessQueue() {
        return expiresAfterAccess() || evictsBySize();
    }

    public boolean usesKeyReferences() {
        return this.keyStrength != Strength.STRONG;
    }

    public boolean usesValueReferences() {
        return this.valueStrength != Strength.STRONG;
    }

    public boolean usesWriteEntries() {
        return usesWriteQueue() || recordsWrite();
    }

    public boolean usesWriteQueue() {
        return expiresAfterWrite();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.values = values;
        return values;
    }

    public V get(K k2, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        int iHash = hash(Preconditions.checkNotNull(k2));
        return segmentFor(iHash).get(k2, iHash, cacheLoader);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k2, V v3) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v3);
        int iHash = hash(k2);
        return segmentFor(iHash).replace(k2, iHash, v3);
    }

    public static class Segment<K, V> extends ReentrantLock {

        @GuardedBy("this")
        final Queue<ReferenceEntry<K, V>> accessQueue;
        volatile int count;

        @CheckForNull
        final ReferenceQueue<K> keyReferenceQueue;

        @Weak
        final LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<ReferenceEntry<K, V>> recencyQueue;
        final AbstractCache.StatsCounter statsCounter;

        @CheckForNull
        volatile AtomicReferenceArray<ReferenceEntry<K, V>> table;
        int threshold;

        @GuardedBy("this")
        long totalWeight;

        @CheckForNull
        final ReferenceQueue<V> valueReferenceQueue;

        @GuardedBy("this")
        final Queue<ReferenceEntry<K, V>> writeQueue;

        public Segment(LocalCache<K, V> localCache, int i7, long j6, AbstractCache.StatsCounter statsCounter) {
            this.map = localCache;
            this.maxSegmentWeight = j6;
            this.statsCounter = (AbstractCache.StatsCounter) Preconditions.checkNotNull(statsCounter);
            initTable(newEntryArray(i7));
            this.keyReferenceQueue = localCache.usesKeyReferences() ? new ReferenceQueue<>() : null;
            this.valueReferenceQueue = localCache.usesValueReferences() ? new ReferenceQueue<>() : null;
            this.recencyQueue = localCache.usesAccessQueue() ? new ConcurrentLinkedQueue<>() : LocalCache.discardingQueue();
            this.writeQueue = localCache.usesWriteQueue() ? new WriteQueue<>() : LocalCache.discardingQueue();
            this.accessQueue = localCache.usesAccessQueue() ? new AccessQueue<>() : LocalCache.discardingQueue();
        }

        public void cleanUp() {
            runLockedCleanup(this.map.ticker.read());
            runUnlockedCleanup();
        }

        public void clear() throws Throwable {
            if (this.count == 0) {
                return;
            }
            lock();
            try {
                preWriteCleanup(this.map.ticker.read());
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                for (int i7 = 0; i7 < atomicReferenceArray.length(); i7++) {
                    for (ReferenceEntry<K, V> next = atomicReferenceArray.get(i7); next != null; next = next.getNext()) {
                        if (next.getValueReference().isActive()) {
                            K key = next.getKey();
                            V v3 = next.getValueReference().get();
                            try {
                                enqueueNotification(key, next.getHash(), v3, next.getValueReference().getWeight(), (key == null || v3 == null) ? RemovalCause.COLLECTED : RemovalCause.EXPLICIT);
                            } catch (Throwable th) {
                                th = th;
                                unlock();
                                postWriteCleanup();
                                throw th;
                            }
                        }
                    }
                }
                for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                    atomicReferenceArray.set(i10, null);
                }
                clearReferenceQueues();
                this.writeQueue.clear();
                this.accessQueue.clear();
                this.readCount.set(0);
                this.modCount++;
                this.count = 0;
                unlock();
                postWriteCleanup();
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public void clearKeyReferenceQueue() {
            while (this.keyReferenceQueue.poll() != null) {
            }
        }

        public void clearReferenceQueues() {
            if (this.map.usesKeyReferences()) {
                clearKeyReferenceQueue();
            }
            if (this.map.usesValueReferences()) {
                clearValueReferenceQueue();
            }
        }

        public void clearValueReferenceQueue() {
            while (this.valueReferenceQueue.poll() != null) {
            }
        }

        public boolean containsKey(Object obj, int i7) {
            try {
                if (this.count == 0) {
                    return false;
                }
                ReferenceEntry<K, V> liveEntry = getLiveEntry(obj, i7, this.map.ticker.read());
                if (liveEntry == null) {
                    return false;
                }
                return liveEntry.getValueReference().get() != null;
            } finally {
                postReadCleanup();
            }
        }

        @VisibleForTesting
        public boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    long j6 = this.map.ticker.read();
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i7 = 0; i7 < length; i7++) {
                        for (ReferenceEntry<K, V> next = atomicReferenceArray.get(i7); next != null; next = next.getNext()) {
                            V liveValue = getLiveValue(next, j6);
                            if (liveValue != null && this.map.valueEquivalence.equivalent(obj, liveValue)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                postReadCleanup();
            }
        }

        @GuardedBy("this")
        public ReferenceEntry<K, V> copyEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            if (referenceEntry.getKey() == null) {
                return null;
            }
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            V v3 = valueReference.get();
            if (v3 == null && valueReference.isActive()) {
                return null;
            }
            ReferenceEntry<K, V> referenceEntryCopyEntry = this.map.entryFactory.copyEntry(this, referenceEntry, referenceEntry2);
            referenceEntryCopyEntry.setValueReference(valueReference.copyFor(this.valueReferenceQueue, v3, referenceEntryCopyEntry));
            return referenceEntryCopyEntry;
        }

        @GuardedBy("this")
        public void drainKeyReferenceQueue() throws Throwable {
            int i7 = 0;
            do {
                Reference<? extends K> referencePoll = this.keyReferenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimKey((ReferenceEntry) referencePoll);
                i7++;
            } while (i7 != 16);
        }

        @GuardedBy("this")
        public void drainRecencyQueue() {
            while (true) {
                ReferenceEntry<K, V> referenceEntryPoll = this.recencyQueue.poll();
                if (referenceEntryPoll == null) {
                    return;
                }
                if (this.accessQueue.contains(referenceEntryPoll)) {
                    this.accessQueue.add(referenceEntryPoll);
                }
            }
        }

        @GuardedBy("this")
        public void drainReferenceQueues() throws Throwable {
            if (this.map.usesKeyReferences()) {
                drainKeyReferenceQueue();
            }
            if (this.map.usesValueReferences()) {
                drainValueReferenceQueue();
            }
        }

        @GuardedBy("this")
        public void drainValueReferenceQueue() throws Throwable {
            int i7 = 0;
            do {
                Reference<? extends V> referencePoll = this.valueReferenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimValue((ValueReference) referencePoll);
                i7++;
            } while (i7 != 16);
        }

        @GuardedBy("this")
        public void enqueueNotification(@CheckForNull K k2, int i7, @CheckForNull V v3, int i10, RemovalCause removalCause) {
            this.totalWeight -= (long) i10;
            if (removalCause.wasEvicted()) {
                this.statsCounter.recordEviction();
            }
            if (this.map.removalNotificationQueue != LocalCache.DISCARDING_QUEUE) {
                this.map.removalNotificationQueue.offer(RemovalNotification.create(k2, v3, removalCause));
            }
        }

        @GuardedBy("this")
        public void evictEntries(ReferenceEntry<K, V> referenceEntry) {
            if (this.map.evictsBySize()) {
                drainRecencyQueue();
                if (referenceEntry.getValueReference().getWeight() > this.maxSegmentWeight && !removeEntry(referenceEntry, referenceEntry.getHash(), RemovalCause.SIZE)) {
                    throw new AssertionError();
                }
                while (this.totalWeight > this.maxSegmentWeight) {
                    ReferenceEntry<K, V> nextEvictable = getNextEvictable();
                    if (!removeEntry(nextEvictable, nextEvictable.getHash(), RemovalCause.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        @GuardedBy("this")
        public void expand() {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i7 = this.count;
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArrayNewEntryArray = newEntryArray(length << 1);
            this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
            int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
            for (int i10 = 0; i10 < length; i10++) {
                ReferenceEntry<K, V> next = atomicReferenceArray.get(i10);
                if (next != null) {
                    ReferenceEntry<K, V> next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(hash, next);
                    } else {
                        ReferenceEntry<K, V> referenceEntry = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                referenceEntry = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayNewEntryArray.set(hash, referenceEntry);
                        while (next != referenceEntry) {
                            int hash3 = next.getHash() & length2;
                            ReferenceEntry<K, V> referenceEntryCopyEntry = copyEntry(next, atomicReferenceArrayNewEntryArray.get(hash3));
                            if (referenceEntryCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(hash3, referenceEntryCopyEntry);
                            } else {
                                removeCollectedEntry(next);
                                i7--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.table = atomicReferenceArrayNewEntryArray;
            this.count = i7;
        }

        @GuardedBy("this")
        public void expireEntries(long j6) {
            ReferenceEntry<K, V> referenceEntryPeek;
            ReferenceEntry<K, V> referenceEntryPeek2;
            drainRecencyQueue();
            do {
                referenceEntryPeek = this.writeQueue.peek();
                if (referenceEntryPeek == null || !this.map.isExpired(referenceEntryPeek, j6)) {
                    do {
                        referenceEntryPeek2 = this.accessQueue.peek();
                        if (referenceEntryPeek2 == null || !this.map.isExpired(referenceEntryPeek2, j6)) {
                            return;
                        }
                    } while (removeEntry(referenceEntryPeek2, referenceEntryPeek2.getHash(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (removeEntry(referenceEntryPeek, referenceEntryPeek.getHash(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        public V get(K k2, int i7, CacheLoader<? super K, V> cacheLoader) throws Throwable {
            K k8;
            ReferenceEntry<K, V> entry;
            Preconditions.checkNotNull(k2);
            Preconditions.checkNotNull(cacheLoader);
            try {
                try {
                    try {
                        if (this.count != 0 && (entry = getEntry(k2, i7)) != null) {
                            long j6 = this.map.ticker.read();
                            V liveValue = getLiveValue(entry, j6);
                            if (liveValue != null) {
                                recordRead(entry, j6);
                                this.statsCounter.recordHits(1);
                                V vScheduleRefresh = scheduleRefresh(entry, k2, i7, liveValue, j6, cacheLoader);
                                postReadCleanup();
                                return vScheduleRefresh;
                            }
                            k8 = k2;
                            ValueReference<K, V> valueReference = entry.getValueReference();
                            if (valueReference.isLoading()) {
                                V vWaitForLoadingValue = waitForLoadingValue(entry, k8, valueReference);
                                postReadCleanup();
                                return vWaitForLoadingValue;
                            }
                            ExecutionException executionException = e;
                            Throwable cause = executionException.getCause();
                            if (cause instanceof Error) {
                                throw new ExecutionError((Error) cause);
                            }
                            if (cause instanceof RuntimeException) {
                                throw new UncheckedExecutionException(cause);
                            }
                            throw executionException;
                        }
                        k8 = k2;
                        V vLockedGetOrLoad = lockedGetOrLoad(k8, i7, cacheLoader);
                        postReadCleanup();
                        return vLockedGetOrLoad;
                    } catch (ExecutionException e10) {
                        e = e10;
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    postReadCleanup();
                    throw th2;
                }
            } catch (ExecutionException e11) {
                e = e11;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                postReadCleanup();
                throw th4;
            }
        }

        public V getAndRecordStats(K k2, int i7, LoadingValueReference<K, V> loadingValueReference, ListenableFuture<V> listenableFuture) throws Throwable {
            V v3;
            try {
                v3 = (V) Uninterruptibles.getUninterruptibly(listenableFuture);
                try {
                    if (v3 != null) {
                        this.statsCounter.recordLoadSuccess(loadingValueReference.elapsedNanos());
                        storeLoadedValue(k2, i7, loadingValueReference, v3);
                        return v3;
                    }
                    String strValueOf = String.valueOf(k2);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35);
                    sb2.append("CacheLoader returned null for key ");
                    sb2.append(strValueOf);
                    sb2.append(Consts.DOT);
                    throw new CacheLoader.InvalidCacheLoadException(sb2.toString());
                } catch (Throwable th) {
                    th = th;
                    if (v3 == null) {
                        this.statsCounter.recordLoadException(loadingValueReference.elapsedNanos());
                        removeLoadingValue(k2, i7, loadingValueReference);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                v3 = null;
            }
        }

        @CheckForNull
        public ReferenceEntry<K, V> getEntry(Object obj, int i7) {
            for (ReferenceEntry<K, V> first = getFirst(i7); first != null; first = first.getNext()) {
                if (first.getHash() == i7) {
                    K key = first.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return first;
                    }
                }
            }
            return null;
        }

        public ReferenceEntry<K, V> getFirst(int i7) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i7 & (atomicReferenceArray.length() - 1));
        }

        @CheckForNull
        public ReferenceEntry<K, V> getLiveEntry(Object obj, int i7, long j6) {
            ReferenceEntry<K, V> entry = getEntry(obj, i7);
            if (entry == null) {
                return null;
            }
            if (!this.map.isExpired(entry, j6)) {
                return entry;
            }
            tryExpireEntries(j6);
            return null;
        }

        public V getLiveValue(ReferenceEntry<K, V> referenceEntry, long j6) {
            if (referenceEntry.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v3 = referenceEntry.getValueReference().get();
            if (v3 == null) {
                tryDrainReferenceQueues();
                return null;
            }
            if (!this.map.isExpired(referenceEntry, j6)) {
                return v3;
            }
            tryExpireEntries(j6);
            return null;
        }

        @GuardedBy("this")
        public ReferenceEntry<K, V> getNextEvictable() {
            for (ReferenceEntry<K, V> referenceEntry : this.accessQueue) {
                if (referenceEntry.getValueReference().getWeight() > 0) {
                    return referenceEntry;
                }
            }
            throw new AssertionError();
        }

        public void initTable(AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            if (!this.map.customWeigher()) {
                int i7 = this.threshold;
                if (i7 == this.maxSegmentWeight) {
                    this.threshold = i7 + 1;
                }
            }
            this.table = atomicReferenceArray;
        }

        @CheckForNull
        public LoadingValueReference<K, V> insertLoadingValueReference(K k2, int i7, boolean z3) {
            lock();
            try {
                long j6 = this.map.ticker.read();
                preWriteCleanup(j6);
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i7;
                ReferenceEntry<K, V> referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                for (ReferenceEntry next = referenceEntry; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i7 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        if (!valueReference.isLoading() && (!z3 || j6 - next.getWriteTime() >= this.map.refreshNanos)) {
                            this.modCount++;
                            LoadingValueReference<K, V> loadingValueReference = new LoadingValueReference<>(valueReference);
                            next.setValueReference(loadingValueReference);
                            return loadingValueReference;
                        }
                        return null;
                    }
                }
                this.modCount++;
                LoadingValueReference<K, V> loadingValueReference2 = new LoadingValueReference<>();
                ReferenceEntry<K, V> referenceEntryNewEntry = newEntry(k2, i7, referenceEntry);
                referenceEntryNewEntry.setValueReference(loadingValueReference2);
                atomicReferenceArray.set(length, referenceEntryNewEntry);
                return loadingValueReference2;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public ListenableFuture<V> loadAsync(final K k2, final int i7, final LoadingValueReference<K, V> loadingValueReference, CacheLoader<? super K, V> cacheLoader) {
            final ListenableFuture<V> listenableFutureLoadFuture = loadingValueReference.loadFuture(k2, cacheLoader);
            listenableFutureLoadFuture.addListener(new Runnable() { // from class: com.google.common.cache.LocalCache.Segment.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Segment.this.getAndRecordStats(k2, i7, loadingValueReference, listenableFutureLoadFuture);
                    } catch (Throwable th) {
                        LocalCache.logger.log(Level.WARNING, "Exception thrown during refresh", th);
                        loadingValueReference.setException(th);
                    }
                }
            }, MoreExecutors.directExecutor());
            return listenableFutureLoadFuture;
        }

        public V loadSync(K k2, int i7, LoadingValueReference<K, V> loadingValueReference, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return getAndRecordStats(k2, i7, loadingValueReference, loadingValueReference.loadFuture(k2, cacheLoader));
        }

        public V lockedGetOrLoad(K k2, int i7, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            LoadingValueReference<K, V> loadingValueReference;
            boolean z3;
            ValueReference<K, V> valueReference;
            V vLoadSync;
            int i10 = i7;
            lock();
            try {
                long j6 = this.map.ticker.read();
                preWriteCleanup(j6);
                int i11 = this.count - 1;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i10 & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> referenceEntryNewEntry = referenceEntry;
                while (true) {
                    loadingValueReference = null;
                    if (referenceEntryNewEntry == null) {
                        z3 = true;
                        valueReference = null;
                        break;
                    }
                    long j10 = j6;
                    K key = referenceEntryNewEntry.getKey();
                    if (referenceEntryNewEntry.getHash() == i10 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        valueReference = referenceEntryNewEntry.getValueReference();
                        if (!valueReference.isLoading()) {
                            V v3 = valueReference.get();
                            if (v3 == null) {
                                enqueueNotification(key, i10, v3, valueReference.getWeight(), RemovalCause.COLLECTED);
                                i10 = i7;
                            } else {
                                if (!this.map.isExpired(referenceEntryNewEntry, j10)) {
                                    recordLockedRead(referenceEntryNewEntry, j10);
                                    this.statsCounter.recordHits(1);
                                    unlock();
                                    postWriteCleanup();
                                    return v3;
                                }
                                i10 = i7;
                                enqueueNotification(key, i10, v3, valueReference.getWeight(), RemovalCause.EXPIRED);
                            }
                            this.writeQueue.remove(referenceEntryNewEntry);
                            this.accessQueue.remove(referenceEntryNewEntry);
                            this.count = i11;
                            z3 = true;
                            break;
                        }
                        z3 = false;
                        break;
                    }
                    referenceEntryNewEntry = referenceEntryNewEntry.getNext();
                    j6 = j10;
                }
                if (z3) {
                    loadingValueReference = new LoadingValueReference<>();
                    if (referenceEntryNewEntry == null) {
                        referenceEntryNewEntry = newEntry(k2, i10, referenceEntry);
                        referenceEntryNewEntry.setValueReference(loadingValueReference);
                        atomicReferenceArray.set(length, referenceEntryNewEntry);
                    } else {
                        referenceEntryNewEntry.setValueReference(loadingValueReference);
                    }
                }
                unlock();
                postWriteCleanup();
                if (!z3) {
                    return waitForLoadingValue(referenceEntryNewEntry, k2, valueReference);
                }
                try {
                    synchronized (referenceEntryNewEntry) {
                        vLoadSync = loadSync(k2, i10, loadingValueReference, cacheLoader);
                    }
                    this.statsCounter.recordMisses(1);
                    return vLoadSync;
                } catch (Throwable th) {
                    this.statsCounter.recordMisses(1);
                    throw th;
                }
            } catch (Throwable th2) {
                unlock();
                postWriteCleanup();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @GuardedBy("this")
        public ReferenceEntry<K, V> newEntry(K k2, int i7, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            return this.map.entryFactory.newEntry(this, Preconditions.checkNotNull(k2), i7, referenceEntry);
        }

        public AtomicReferenceArray<ReferenceEntry<K, V>> newEntryArray(int i7) {
            return new AtomicReferenceArray<>(i7);
        }

        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                cleanUp();
            }
        }

        public void postWriteCleanup() {
            runUnlockedCleanup();
        }

        @GuardedBy("this")
        public void preWriteCleanup(long j6) {
            runLockedCleanup(j6);
        }

        @CheckForNull
        public V put(K k2, int i7, V v3, boolean z3) {
            ReferenceEntry<K, V> referenceEntry;
            int i10;
            lock();
            try {
                long j6 = this.map.ticker.read();
                preWriteCleanup(j6);
                if (this.count + 1 > this.threshold) {
                    expand();
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i7 & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry2;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i7 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v4 = valueReference.get();
                        if (v4 != null) {
                            long j10 = j6;
                            ReferenceEntry<K, V> referenceEntry3 = next;
                            if (z3) {
                                recordLockedRead(referenceEntry3, j10);
                                return v4;
                            }
                            this.modCount++;
                            enqueueNotification(k2, i7, v4, valueReference.getWeight(), RemovalCause.REPLACED);
                            setValue(referenceEntry3, k2, v3, j10);
                            evictEntries(referenceEntry3);
                            return v4;
                        }
                        this.modCount++;
                        if (valueReference.isActive()) {
                            enqueueNotification(k2, i7, v4, valueReference.getWeight(), RemovalCause.COLLECTED);
                            ReferenceEntry<K, V> referenceEntry4 = next;
                            setValue(referenceEntry4, k2, v3, j6);
                            i10 = this.count;
                            referenceEntry = referenceEntry4;
                        } else {
                            ReferenceEntry<K, V> referenceEntry5 = next;
                            setValue(referenceEntry5, k2, v3, j6);
                            referenceEntry = referenceEntry5;
                            i10 = this.count + 1;
                        }
                        this.count = i10;
                        evictEntries(referenceEntry);
                        return null;
                    }
                    long j11 = j6;
                    next = next.getNext();
                    j6 = j11;
                }
                this.modCount++;
                ReferenceEntry<K, V> referenceEntryNewEntry = newEntry(k2, i7, referenceEntry2);
                setValue(referenceEntryNewEntry, k2, v3, j6);
                atomicReferenceArray.set(length, referenceEntryNewEntry);
                this.count++;
                evictEntries(referenceEntryNewEntry);
                return null;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public boolean reclaimKey(ReferenceEntry<K, V> referenceEntry, int i7) throws Throwable {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i7;
                ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry2;
                while (next != null) {
                    if (next == referenceEntry) {
                        this.modCount++;
                        ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry2, next, next.getKey(), i7, next.getValueReference().get(), next.getValueReference(), RemovalCause.COLLECTED);
                        int i10 = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i10;
                        unlock();
                        postWriteCleanup();
                        return true;
                    }
                    int i11 = i7;
                    try {
                        next = next.getNext();
                        i7 = i11;
                    } catch (Throwable th) {
                        th = th;
                    }
                    th = th;
                    Throwable th2 = th;
                    unlock();
                    postWriteCleanup();
                    throw th2;
                }
                unlock();
                postWriteCleanup();
                return false;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public boolean reclaimValue(K k2, int i7, ValueReference<K, V> valueReference) throws Throwable {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i7;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i7 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        if (next.getValueReference() != valueReference) {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                postWriteCleanup();
                            }
                            return false;
                        }
                        this.modCount++;
                        ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key, i7, valueReference.get(), valueReference, RemovalCause.COLLECTED);
                        int i10 = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i10;
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            postWriteCleanup();
                        }
                        return true;
                    }
                    int i11 = i7;
                    ValueReference<K, V> valueReference2 = valueReference;
                    try {
                        next = next.getNext();
                        i7 = i11;
                        valueReference = valueReference2;
                    } catch (Throwable th) {
                        th = th;
                    }
                    th = th;
                    Throwable th2 = th;
                    unlock();
                    if (isHeldByCurrentThread()) {
                        throw th2;
                    }
                    postWriteCleanup();
                    throw th2;
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    postWriteCleanup();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @GuardedBy("this")
        public void recordLockedRead(ReferenceEntry<K, V> referenceEntry, long j6) {
            if (this.map.recordsAccess()) {
                referenceEntry.setAccessTime(j6);
            }
            this.accessQueue.add(referenceEntry);
        }

        public void recordRead(ReferenceEntry<K, V> referenceEntry, long j6) {
            if (this.map.recordsAccess()) {
                referenceEntry.setAccessTime(j6);
            }
            this.recencyQueue.add(referenceEntry);
        }

        @GuardedBy("this")
        public void recordWrite(ReferenceEntry<K, V> referenceEntry, int i7, long j6) {
            drainRecencyQueue();
            this.totalWeight += (long) i7;
            if (this.map.recordsAccess()) {
                referenceEntry.setAccessTime(j6);
            }
            if (this.map.recordsWrite()) {
                referenceEntry.setWriteTime(j6);
            }
            this.accessQueue.add(referenceEntry);
            this.writeQueue.add(referenceEntry);
        }

        @CheckForNull
        public V refresh(K k2, int i7, CacheLoader<? super K, V> cacheLoader, boolean z3) {
            LoadingValueReference<K, V> loadingValueReferenceInsertLoadingValueReference = insertLoadingValueReference(k2, i7, z3);
            if (loadingValueReferenceInsertLoadingValueReference == null) {
                return null;
            }
            ListenableFuture<V> listenableFutureLoadAsync = loadAsync(k2, i7, loadingValueReferenceInsertLoadingValueReference, cacheLoader);
            if (listenableFutureLoadAsync.isDone()) {
                try {
                    return (V) Uninterruptibles.getUninterruptibly(listenableFutureLoadAsync);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        @CheckForNull
        public V remove(Object obj, int i7) throws Throwable {
            Throwable th;
            RemovalCause removalCause;
            lock();
            try {
                preWriteCleanup(this.map.ticker.read());
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i7;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i7 && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v3 = valueReference.get();
                        if (v3 == null) {
                            if (!valueReference.isActive()) {
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        } else {
                            try {
                                removalCause = RemovalCause.EXPLICIT;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.modCount++;
                        ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key, i7, v3, valueReference, removalCause2);
                        int i10 = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i10;
                        unlock();
                        postWriteCleanup();
                        return v3;
                    }
                    int i11 = i7;
                    try {
                        next = next.getNext();
                        i7 = i11;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    th = th3;
                    th = th;
                    unlock();
                    postWriteCleanup();
                    throw th;
                }
                unlock();
                postWriteCleanup();
                return null;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        @GuardedBy("this")
        public void removeCollectedEntry(ReferenceEntry<K, V> referenceEntry) {
            enqueueNotification(referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry.getValueReference().get(), referenceEntry.getValueReference().getWeight(), RemovalCause.COLLECTED);
            this.writeQueue.remove(referenceEntry);
            this.accessQueue.remove(referenceEntry);
        }

        @VisibleForTesting
        @GuardedBy("this")
        public boolean removeEntry(ReferenceEntry<K, V> referenceEntry, int i7, RemovalCause removalCause) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i7;
            ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
            for (ReferenceEntry<K, V> next = referenceEntry2; next != null; next = next.getNext()) {
                if (next == referenceEntry) {
                    this.modCount++;
                    ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry2, next, next.getKey(), i7, next.getValueReference().get(), next.getValueReference(), removalCause);
                    int i10 = this.count - 1;
                    atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                    this.count = i10;
                    return true;
                }
            }
            return false;
        }

        @CheckForNull
        @GuardedBy("this")
        public ReferenceEntry<K, V> removeEntryFromChain(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            int i7 = this.count;
            ReferenceEntry<K, V> next = referenceEntry2.getNext();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = copyEntry(referenceEntry, next);
                if (referenceEntryCopyEntry != null) {
                    next = referenceEntryCopyEntry;
                } else {
                    removeCollectedEntry(referenceEntry);
                    i7--;
                }
                referenceEntry = referenceEntry.getNext();
            }
            this.count = i7;
            return next;
        }

        public boolean removeLoadingValue(K k2, int i7, LoadingValueReference<K, V> loadingValueReference) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i7;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i7 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        if (next.getValueReference() != loadingValueReference) {
                            break;
                        }
                        if (loadingValueReference.isActive()) {
                            next.setValueReference(loadingValueReference.getOldValue());
                        } else {
                            atomicReferenceArray.set(length, removeEntryFromChain(referenceEntry, next));
                        }
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        @CheckForNull
        @GuardedBy("this")
        public ReferenceEntry<K, V> removeValueFromChain(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, @CheckForNull K k2, int i7, V v3, ValueReference<K, V> valueReference, RemovalCause removalCause) {
            enqueueNotification(k2, i7, v3, valueReference.getWeight(), removalCause);
            this.writeQueue.remove(referenceEntry2);
            this.accessQueue.remove(referenceEntry2);
            if (!valueReference.isLoading()) {
                return removeEntryFromChain(referenceEntry, referenceEntry2);
            }
            valueReference.notifyNewValue(null);
            return referenceEntry;
        }

        public boolean replace(K k2, int i7, V v3, V v4) {
            int i10 = i7;
            lock();
            try {
                long j6 = this.map.ticker.read();
                preWriteCleanup(j6);
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i10 & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry;
                while (next != null) {
                    ReferenceEntry<K, V> referenceEntry2 = next;
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() == i10 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        long j10 = j6;
                        ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                        V v10 = valueReference.get();
                        if (v10 != null) {
                            if (!this.map.valueEquivalence.equivalent(v3, v10)) {
                                recordLockedRead(referenceEntry2, j10);
                                break;
                            }
                            this.modCount++;
                            enqueueNotification(k2, i7, v10, valueReference.getWeight(), RemovalCause.REPLACED);
                            setValue(referenceEntry2, k2, v4, j10);
                            evictEntries(referenceEntry2);
                            unlock();
                            postWriteCleanup();
                            return true;
                        }
                        if (!valueReference.isActive()) {
                            break;
                        }
                        this.modCount++;
                        ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, referenceEntry2, key, i10, v10, valueReference, RemovalCause.COLLECTED);
                        int i11 = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i11;
                        break;
                    }
                    ReferenceEntry<K, V> referenceEntry3 = referenceEntry;
                    long j11 = j6;
                    next = referenceEntry2.getNext();
                    referenceEntry = referenceEntry3;
                    i10 = i7;
                    j6 = j11;
                }
                unlock();
                postWriteCleanup();
                return false;
            } catch (Throwable th) {
                unlock();
                postWriteCleanup();
                throw th;
            }
        }

        public void runLockedCleanup(long j6) {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                    expireEntries(j6);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public void runUnlockedCleanup() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.map.processPendingNotifications();
        }

        public V scheduleRefresh(ReferenceEntry<K, V> referenceEntry, K k2, int i7, V v3, long j6, CacheLoader<? super K, V> cacheLoader) {
            V vRefresh;
            return (!this.map.refreshes() || j6 - referenceEntry.getWriteTime() <= this.map.refreshNanos || referenceEntry.getValueReference().isLoading() || (vRefresh = refresh(k2, i7, cacheLoader, true)) == null) ? v3 : vRefresh;
        }

        @GuardedBy("this")
        public void setValue(ReferenceEntry<K, V> referenceEntry, K k2, V v3, long j6) {
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            int iWeigh = this.map.weigher.weigh(k2, v3);
            Preconditions.checkState(iWeigh >= 0, "Weights must be non-negative");
            referenceEntry.setValueReference(this.map.valueStrength.referenceValue(this, referenceEntry, v3, iWeigh));
            recordWrite(referenceEntry, iWeigh, j6);
            valueReference.notifyNewValue(v3);
        }

        public boolean storeLoadedValue(K k2, int i7, LoadingValueReference<K, V> loadingValueReference, V v3) {
            lock();
            try {
                long j6 = this.map.ticker.read();
                preWriteCleanup(j6);
                int i10 = this.count + 1;
                if (i10 > this.threshold) {
                    expand();
                    i10 = this.count + 1;
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i7 & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i7 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v4 = valueReference.get();
                        if (loadingValueReference != valueReference && (v4 != null || valueReference == LocalCache.UNSET)) {
                            enqueueNotification(k2, i7, v3, 0, RemovalCause.REPLACED);
                            return false;
                        }
                        this.modCount++;
                        if (loadingValueReference.isActive()) {
                            enqueueNotification(k2, i7, v4, loadingValueReference.getWeight(), v4 == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                            i10--;
                        }
                        ReferenceEntry<K, V> referenceEntry2 = next;
                        setValue(referenceEntry2, k2, v3, j6);
                        this.count = i10;
                        evictEntries(referenceEntry2);
                        return true;
                    }
                }
                this.modCount++;
                ReferenceEntry<K, V> referenceEntryNewEntry = newEntry(k2, i7, referenceEntry);
                setValue(referenceEntryNewEntry, k2, v3, j6);
                atomicReferenceArray.set(length, referenceEntryNewEntry);
                this.count = i10;
                evictEntries(referenceEntryNewEntry);
                return true;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        public void tryExpireEntries(long j6) {
            if (tryLock()) {
                try {
                    expireEntries(j6);
                } finally {
                    unlock();
                }
            }
        }

        public V waitForLoadingValue(ReferenceEntry<K, V> referenceEntry, K k2, ValueReference<K, V> valueReference) throws ExecutionException {
            if (!valueReference.isLoading()) {
                throw new AssertionError();
            }
            Preconditions.checkState(!Thread.holdsLock(referenceEntry), "Recursive load of: %s", k2);
            try {
                V vWaitForValue = valueReference.waitForValue();
                if (vWaitForValue != null) {
                    recordRead(referenceEntry, this.map.ticker.read());
                    this.statsCounter.recordMisses(1);
                    return vWaitForValue;
                }
                String strValueOf = String.valueOf(k2);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35);
                sb2.append("CacheLoader returned null for key ");
                sb2.append(strValueOf);
                sb2.append(Consts.DOT);
                throw new CacheLoader.InvalidCacheLoadException(sb2.toString());
            } catch (Throwable th) {
                this.statsCounter.recordMisses(1);
                throw th;
            }
        }

        @CheckForNull
        public V get(Object obj, int i7) {
            try {
                if (this.count != 0) {
                    long j6 = this.map.ticker.read();
                    ReferenceEntry<K, V> liveEntry = getLiveEntry(obj, i7, j6);
                    if (liveEntry == null) {
                        return null;
                    }
                    V v3 = liveEntry.getValueReference().get();
                    if (v3 != null) {
                        recordRead(liveEntry, j6);
                        return scheduleRefresh(liveEntry, liveEntry.getKey(), i7, v3, j6, this.map.defaultLoader);
                    }
                    tryDrainReferenceQueues();
                }
                return null;
            } finally {
                postReadCleanup();
            }
        }

        public boolean remove(Object obj, int i7, Object obj2) throws Throwable {
            Throwable th;
            RemovalCause removalCause;
            lock();
            try {
                preWriteCleanup(this.map.ticker.read());
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i7;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i7 && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v3 = valueReference.get();
                        if (this.map.valueEquivalence.equivalent(obj2, v3)) {
                            try {
                                removalCause = RemovalCause.EXPLICIT;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            if (v3 != null || !valueReference.isActive()) {
                                break;
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.modCount++;
                        ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key, i7, v3, valueReference, removalCause2);
                        int i10 = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i10;
                        boolean z3 = removalCause2 == RemovalCause.EXPLICIT;
                        unlock();
                        postWriteCleanup();
                        return z3;
                    }
                    int i11 = i7;
                    try {
                        next = next.getNext();
                        i7 = i11;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    th = th3;
                    th = th;
                    unlock();
                    postWriteCleanup();
                    throw th;
                }
                unlock();
                postWriteCleanup();
                return false;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        @CheckForNull
        public V replace(K k2, int i7, V v3) {
            lock();
            try {
                long j6 = this.map.ticker.read();
                preWriteCleanup(j6);
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i7 & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i7 && key != null && this.map.keyEquivalence.equivalent(k2, key)) {
                        long j10 = j6;
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v4 = valueReference.get();
                        if (v4 == null) {
                            if (!valueReference.isActive()) {
                                break;
                            }
                            this.modCount++;
                            ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key, i7, v4, valueReference, RemovalCause.COLLECTED);
                            int i10 = this.count - 1;
                            atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                            this.count = i10;
                            break;
                        }
                        ReferenceEntry<K, V> referenceEntry2 = next;
                        this.modCount++;
                        enqueueNotification(k2, i7, v4, valueReference.getWeight(), RemovalCause.REPLACED);
                        setValue(referenceEntry2, k2, v3, j10);
                        evictEntries(referenceEntry2);
                        unlock();
                        postWriteCleanup();
                        return v4;
                    }
                    ReferenceEntry<K, V> referenceEntry3 = referenceEntry;
                    long j11 = j6;
                    next = next.getNext();
                    referenceEntry = referenceEntry3;
                    j6 = j11;
                }
                unlock();
                postWriteCleanup();
                return null;
            } catch (Throwable th) {
                unlock();
                postWriteCleanup();
                throw th;
            }
        }
    }
}
