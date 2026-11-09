package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {

    @GwtIncompatible
    private static final long serialVersionUID = 0;

    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient ImmutableListMultimap<V, K> inverse;

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public ImmutableListMultimap<K, V> build() {
            return (ImmutableListMultimap) super.build();
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> combine(ImmutableMultimap.Builder<K, V> builder) {
            super.combine((ImmutableMultimap.Builder) builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderKeysBy(Comparator<? super K> comparator) {
            super.orderKeysBy((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderValuesBy(Comparator<? super V> comparator) {
            super.orderValuesBy((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k2, V v3) {
            super.put((Object) k2, (Object) v3);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K k2, Iterable<? extends V> iterable) {
            super.putAll((Object) k2, (Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K k2, V... vArr) {
            super.putAll((Object) k2, (Object[]) vArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            super.putAll((Multimap) multimap);
            return this;
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i7) {
        super(immutableMap, i7);
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return of();
        }
        if (multimap instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) multimap;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), null);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            ImmutableList immutableListCopyOf = comparator == null ? ImmutableList.copyOf((Collection) value) : ImmutableList.sortedCopyOf(comparator, value);
            if (!immutableListCopyOf.isEmpty()) {
                builder.put(key, immutableListCopyOf);
                size = immutableListCopyOf.size() + size;
            }
        }
        return new ImmutableListMultimap<>(builder.buildOrThrow(), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableListMultimap<V, K> invert() {
        Builder builder = builder();
        UnmodifiableIterator it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.put(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> immutableListMultimapBuild = builder.build();
        immutableListMultimapBuild.inverse = this;
        return immutableListMultimapBuild;
    }

    public static <K, V> ImmutableListMultimap<K, V> of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i7 = objectInputStream.readInt();
        if (i7 < 0) {
            throw new InvalidObjectException(com.airbnb.lottie.model.layer.d.g(29, i7, "Invalid key count "));
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object object = objectInputStream.readObject();
            int i12 = objectInputStream.readInt();
            if (i12 <= 0) {
                throw new InvalidObjectException(com.airbnb.lottie.model.layer.d.g(31, i12, "Invalid value count "));
            }
            ImmutableList.Builder builder2 = ImmutableList.builder();
            for (int i13 = 0; i13 < i12; i13++) {
                builder2.add(objectInputStream.readObject());
            }
            builder.put(object, builder2.build());
            i10 += i12;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set(this, builder.buildOrThrow());
            ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set(this, i10);
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultimap(this, objectOutputStream);
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k2, V v3) {
        Builder builder = builder();
        builder.put((Object) k2, (Object) v3);
        return builder.build();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> immutableListMultimapInvert = invert();
        this.inverse = immutableListMultimapInvert;
        return immutableListMultimapInvert;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableList<V> get(K k2) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k2);
        return immutableList == null ? ImmutableList.of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableList<V> removeAll(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableList<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k2, V v3, K k8, V v4) {
        Builder builder = builder();
        builder.put((Object) k2, (Object) v3);
        builder.put((Object) k8, (Object) v4);
        return builder.build();
    }

    @Beta
    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder().putAll((Iterable) iterable).build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10) {
        Builder builder = builder();
        builder.put((Object) k2, (Object) v3);
        builder.put((Object) k8, (Object) v4);
        builder.put((Object) k10, (Object) v10);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11) {
        Builder builder = builder();
        builder.put((Object) k2, (Object) v3);
        builder.put((Object) k8, (Object) v4);
        builder.put((Object) k10, (Object) v10);
        builder.put((Object) k11, (Object) v11);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12) {
        Builder builder = builder();
        builder.put((Object) k2, (Object) v3);
        builder.put((Object) k8, (Object) v4);
        builder.put((Object) k10, (Object) v10);
        builder.put((Object) k11, (Object) v11);
        builder.put((Object) k12, (Object) v12);
        return builder.build();
    }
}
