package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {

    @CheckForNull
    private List<Present<V>> values;

    public static final class ListFuture<V> extends CollectionFuture<V, List<V>> {
        public ListFuture(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z3) {
            super(immutableCollection, z3);
            init();
        }

        @Override // com.google.common.util.concurrent.CollectionFuture
        public List<V> combine(List<Present<V>> list) {
            ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
            Iterator<Present<V>> it = list.iterator();
            while (it.hasNext()) {
                Present<V> next = it.next();
                arrayListNewArrayListWithCapacity.add(next != null ? next.value : null);
            }
            return Collections.unmodifiableList(arrayListNewArrayListWithCapacity);
        }
    }

    public static final class Present<V> {
        V value;

        public Present(V v3) {
            this.value = v3;
        }
    }

    public CollectionFuture(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z3) {
        super(immutableCollection, z3, true);
        List<Present<V>> listNewArrayListWithCapacity = immutableCollection.isEmpty() ? Collections.EMPTY_LIST : Lists.newArrayListWithCapacity(immutableCollection.size());
        for (int i7 = 0; i7 < immutableCollection.size(); i7++) {
            listNewArrayListWithCapacity.add(null);
        }
        this.values = listNewArrayListWithCapacity;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void collectOneValue(int i7, @ParametricNullness V v3) {
        List<Present<V>> list = this.values;
        if (list != null) {
            list.set(i7, new Present<>(v3));
        }
    }

    public abstract C combine(List<Present<V>> list);

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void handleAllCompleted() {
        List<Present<V>> list = this.values;
        if (list != null) {
            set(combine(list));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public void releaseResources(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.releaseResources(releaseResourcesReason);
        this.values = null;
    }
}
