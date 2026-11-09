package com.palmpay.lib.liveness.cache;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/palmpay/lib/liveness/cache/ICacheService;", "", "saveDataString", "", "key", "", "value", "getDataString", "defaultValue", "saveDataBoolean", "", "getDataBoolean", "remove", "clearAll", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ICacheService {
    void clearAll();

    boolean getDataBoolean(@NotNull String key, boolean defaultValue);

    @Nullable
    String getDataString(@NotNull String key, @Nullable String defaultValue);

    void remove(@NotNull String key);

    void saveDataBoolean(@NotNull String key, boolean value);

    void saveDataString(@NotNull String key, @Nullable String value);
}
