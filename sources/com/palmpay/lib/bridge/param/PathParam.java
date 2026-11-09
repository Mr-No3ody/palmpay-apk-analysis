package com.palmpay.lib.bridge.param;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003J-\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/palmpay/lib/bridge/param/PathParam;", "", "path", "", "params", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getParams", "()Ljava/util/Map;", "getPath", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_bridge_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PathParam {

    @NotNull
    private final Map<String, Object> params;

    @Nullable
    private final String path;

    public PathParam(@Nullable String str, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.path = str;
        this.params = params;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PathParam copy$default(PathParam pathParam, String str, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = pathParam.path;
        }
        if ((i7 & 2) != 0) {
            map = pathParam.params;
        }
        return pathParam.copy(str, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.params;
    }

    @NotNull
    public final PathParam copy(@Nullable String path, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new PathParam(path, params);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PathParam)) {
            return false;
        }
        PathParam pathParam = (PathParam) other;
        return Intrinsics.c(this.path, pathParam.path) && Intrinsics.c(this.params, pathParam.params);
    }

    @NotNull
    public final Map<String, Object> getParams() {
        return this.params;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.path;
        return this.params.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "PathParam(path=" + this.path + ", params=" + this.params + ')';
    }
}
