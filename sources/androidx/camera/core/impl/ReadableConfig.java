package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface ReadableConfig extends Config {
    @Override // androidx.camera.core.impl.Config
    default boolean containsOption(@NonNull V v3) {
        return getConfig().containsOption(v3);
    }

    @Override // androidx.camera.core.impl.Config
    default void findOptions(@NonNull String str, @NonNull Config.OptionMatcher optionMatcher) {
        getConfig().findOptions(str, optionMatcher);
    }

    @NonNull
    Config getConfig();

    @Override // androidx.camera.core.impl.Config
    @NonNull
    default W getOptionPriority(@NonNull V v3) {
        return getConfig().getOptionPriority(v3);
    }

    @Override // androidx.camera.core.impl.Config
    @NonNull
    default Set<W> getPriorities(@NonNull V v3) {
        return getConfig().getPriorities(v3);
    }

    @Override // androidx.camera.core.impl.Config
    @NonNull
    default Set<V> listOptions() {
        return getConfig().listOptions();
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    default <ValueT> ValueT retrieveOption(@NonNull V v3) {
        return (ValueT) getConfig().retrieveOption(v3);
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    default <ValueT> ValueT retrieveOptionWithPriority(@NonNull V v3, @NonNull W w3) {
        return (ValueT) getConfig().retrieveOptionWithPriority(v3, w3);
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    default <ValueT> ValueT retrieveOption(@NonNull V v3, @Nullable ValueT valuet) {
        return (ValueT) getConfig().retrieveOption(v3, valuet);
    }
}
