package com.palmpay.lib.bridge.param;

import C0.G;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/palmpay/lib/bridge/param/BridgeRequestParam;", "", "group", "", "id", "args", "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;)V", "getArgs", "()Lcom/google/gson/JsonObject;", "getGroup", "()Ljava/lang/String;", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "path", "toString", "lib_bridge_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class BridgeRequestParam {

    @Nullable
    private final JsonObject args;

    @NotNull
    private final String group;

    @NotNull
    private final String id;

    public BridgeRequestParam(@NotNull String group, @NotNull String id2, @Nullable JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.group = group;
        this.id = id2;
        this.args = jsonObject;
    }

    public static /* synthetic */ BridgeRequestParam copy$default(BridgeRequestParam bridgeRequestParam, String str, String str2, JsonObject jsonObject, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bridgeRequestParam.group;
        }
        if ((i7 & 2) != 0) {
            str2 = bridgeRequestParam.id;
        }
        if ((i7 & 4) != 0) {
            jsonObject = bridgeRequestParam.args;
        }
        return bridgeRequestParam.copy(str, str2, jsonObject);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getArgs() {
        return this.args;
    }

    @NotNull
    public final BridgeRequestParam copy(@NotNull String group, @NotNull String id2, @Nullable JsonObject args) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new BridgeRequestParam(group, id2, args);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BridgeRequestParam)) {
            return false;
        }
        BridgeRequestParam bridgeRequestParam = (BridgeRequestParam) other;
        return Intrinsics.c(this.group, bridgeRequestParam.group) && Intrinsics.c(this.id, bridgeRequestParam.id) && Intrinsics.c(this.args, bridgeRequestParam.args);
    }

    @Nullable
    public final JsonObject getArgs() {
        return this.args;
    }

    @NotNull
    public final String getGroup() {
        return this.group;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iC = G.c(this.group.hashCode() * 31, 31, this.id);
        JsonObject jsonObject = this.args;
        return iC + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    @NotNull
    public final String path() {
        return "/" + this.group + '/' + this.id;
    }

    @NotNull
    public String toString() {
        return "BridgeRequestParam(group=" + this.group + ", id=" + this.id + ", args=" + this.args + ')';
    }
}
