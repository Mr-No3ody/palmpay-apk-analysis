package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {

    @Beta
    public class StandardDescendingMap extends Maps.DescendingMap<K, V> {
        public StandardDescendingMap() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public Iterator<Map.Entry<K, V>> entryIterator() {
            return new Iterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.1

                @CheckForNull
                private Map.Entry<K, V> nextOrNull;

                @CheckForNull
                private Map.Entry<K, V> toRemove = null;

                {
                    this.nextOrNull = StandardDescendingMap.this.forward().lastEntry();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.nextOrNull != null;
                }

                @Override // java.util.Iterator
                public void remove() {
                    if (this.toRemove == null) {
                        throw new IllegalStateException("no calls to next() since the last call to remove()");
                    }
                    StandardDescendingMap.this.forward().remove(this.toRemove.getKey());
                    this.toRemove = null;
                }

                @Override // java.util.Iterator
                public Map.Entry<K, V> next() {
                    Map.Entry<K, V> entry = this.nextOrNull;
                    if (entry == null) {
                        throw new NoSuchElementException();
                    }
                    this.toRemove = entry;
                    this.nextOrNull = StandardDescendingMap.this.forward().lowerEntry(this.nextOrNull.getKey());
                    return entry;
                }
            };
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public NavigableMap<K, V> forward() {
            return ForwardingNavigableMap.this;
        }
    }

    @Beta
    public class StandardNavigableKeySet extends Maps.NavigableKeySet<K, V> {
        public StandardNavigableKeySet(ForwardingNavigableMap forwardingNavigableMap) {
            super(forwardingNavigableMap);
        }
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k2) {
        return delegate().ceilingEntry(k2);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K ceilingKey(@ParametricNullness K k2) {
        return delegate().ceilingKey(k2);
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract NavigableMap<K, V> delegate();

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return delegate().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return delegate().descendingMap();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> floorEntry(@ParametricNullness K k2) {
        return delegate().floorEntry(k2);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K floorKey(@ParametricNullness K k2) {
        return delegate().floorKey(k2);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(@ParametricNullness K k2, boolean z3) {
        return delegate().headMap(k2, z3);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> higherEntry(@ParametricNullness K k2) {
        return delegate().higherEntry(k2);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K higherKey(@ParametricNullness K k2) {
        return delegate().higherKey(k2);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lowerEntry(@ParametricNullness K k2) {
        return delegate().lowerEntry(k2);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K lowerKey(@ParametricNullness K k2) {
        return delegate().lowerKey(k2);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return delegate().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> pollFirstEntry() {
        return delegate().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> pollLastEntry() {
        return delegate().pollLastEntry();
    }

    @CheckForNull
    public Map.Entry<K, V> standardCeilingEntry(@ParametricNullness K k2) {
        return tailMap(k2, true).firstEntry();
    }

    @CheckForNull
    public K standardCeilingKey(@ParametricNullness K k2) {
        return (K) Maps.keyOrNull(ceilingEntry(k2));
    }

    @Beta
    public NavigableSet<K> standardDescendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @CheckForNull
    public Map.Entry<K, V> standardFirstEntry() {
        return (Map.Entry) Iterables.getFirst(entrySet(), null);
    }

    public K standardFirstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @CheckForNull
    public Map.Entry<K, V> standardFloorEntry(@ParametricNullness K k2) {
        return headMap(k2, true).lastEntry();
    }

    @CheckForNull
    public K standardFloorKey(@ParametricNullness K k2) {
        return (K) Maps.keyOrNull(floorEntry(k2));
    }

    public SortedMap<K, V> standardHeadMap(@ParametricNullness K k2) {
        return headMap(k2, false);
    }

    @CheckForNull
    public Map.Entry<K, V> standardHigherEntry(@ParametricNullness K k2) {
        return tailMap(k2, false).firstEntry();
    }

    @CheckForNull
    public K standardHigherKey(@ParametricNullness K k2) {
        return (K) Maps.keyOrNull(higherEntry(k2));
    }

    @CheckForNull
    public Map.Entry<K, V> standardLastEntry() {
        return (Map.Entry) Iterables.getFirst(descendingMap().entrySet(), null);
    }

    public K standardLastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @CheckForNull
    public Map.Entry<K, V> standardLowerEntry(@ParametricNullness K k2) {
        return headMap(k2, false).lastEntry();
    }

    @CheckForNull
    public K standardLowerKey(@ParametricNullness K k2) {
        return (K) Maps.keyOrNull(lowerEntry(k2));
    }

    @CheckForNull
    public Map.Entry<K, V> standardPollFirstEntry() {
        return (Map.Entry) Iterators.pollNext(entrySet().iterator());
    }

    @CheckForNull
    public Map.Entry<K, V> standardPollLastEntry() {
        return (Map.Entry) Iterators.pollNext(descendingMap().entrySet().iterator());
    }

    @Override // com.google.common.collect.ForwardingSortedMap
    public SortedMap<K, V> standardSubMap(@ParametricNullness K k2, @ParametricNullness K k8) {
        return subMap(k2, true, k8, false);
    }

    public SortedMap<K, V> standardTailMap(@ParametricNullness K k2) {
        return tailMap(k2, true);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(@ParametricNullness K k2, boolean z3, @ParametricNullness K k8, boolean z8) {
        return delegate().subMap(k2, z3, k8, z8);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(@ParametricNullness K k2, boolean z3) {
        return delegate().tailMap(k2, z3);
    }
}
