package p176lg;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.D;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(with = u.class)
public final class s extends j implements Map<String, j>, KMappedMarker {

    @NotNull
    public static final r Companion = new r(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f39394a;

    public s(Map content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f39394a = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j compute(String str, BiFunction<? super String, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j computeIfAbsent(String str, Function<? super String, ? extends j> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j computeIfPresent(String str, BiFunction<? super String, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f39394a.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j value = (j) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f39394a.containsValue(value);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, j>> entrySet() {
        return this.f39394a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return Intrinsics.c(this.f39394a, obj);
    }

    @Override // java.util.Map
    public final j get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return (j) this.f39394a.get(key);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f39394a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f39394a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f39394a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j merge(String str, j jVar, BiFunction<? super j, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j put(String str, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends j> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j putIfAbsent(String str, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final j remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j replace(String str, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f39394a.size();
    }

    public final String toString() {
        return CollectionsKt.J(this.f39394a.entrySet(), ",", "{", "}", new D(2), 24);
    }

    @Override // java.util.Map
    public final Collection<j> values() {
        return this.f39394a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, j jVar, j jVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
