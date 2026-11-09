package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface MutableConfig extends Config {
    <ValueT> void insertOption(@NonNull V v3, @NonNull W w3, @Nullable ValueT valuet);

    <ValueT> void insertOption(@NonNull V v3, @Nullable ValueT valuet);

    @Nullable
    <ValueT> ValueT removeOption(@NonNull V v3);
}
