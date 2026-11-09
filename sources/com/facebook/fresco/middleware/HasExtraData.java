package com.facebook.fresco.middleware;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\t\u0010\fJ\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00062\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/fresco/middleware/HasExtraData;", "", "E", "", "key", "value", "", "putExtra", "(Ljava/lang/String;Ljava/lang/Object;)V", "getExtra", "(Ljava/lang/String;)Ljava/lang/Object;", "valueIfNotFound", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lcom/facebook/fresco/middleware/Extras;", "getExtras", "()Ljava/util/Map;", "extras", "putExtras", "(Ljava/util/Map;)V", "middleware_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HasExtraData {
    @Nullable
    <E> E getExtra(@NotNull String key);

    @Nullable
    <E> E getExtra(@NotNull String key, @Nullable E valueIfNotFound);

    @NotNull
    Map<String, Object> getExtras();

    <E> void putExtra(@NotNull String key, @Nullable E value);

    void putExtras(@NotNull Map<String, ? extends Object> extras);
}
