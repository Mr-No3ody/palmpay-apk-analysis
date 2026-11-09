package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000bJ\b\u0010\u001e\u001a\u00020\u000bH\u0016R\u0016\u0010\u0006\u001a\u00020\u00038AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "", "props", "Lcom/facebook/react/bridge/ReadableMap;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "backingMap", "internal_backingMap", "()Lcom/facebook/react/bridge/ReadableMap;", "toMap", "", "", "hasKey", "", "name", "isNull", "getBoolean", GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, "getDouble", "", "getFloat", "", "getInt", "", "getString", "getArray", "Lcom/facebook/react/bridge/ReadableArray;", "getMap", "getDynamic", "Lcom/facebook/react/bridge/Dynamic;", "toString", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactStylesDiffMap {

    @NotNull
    private final ReadableMap backingMap;

    public ReactStylesDiffMap(@NotNull ReadableMap props) {
        Intrinsics.checkNotNullParameter(props, "props");
        this.backingMap = props;
    }

    @Nullable
    public final ReadableArray getArray(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.backingMap.getArray(name);
    }

    public final boolean getBoolean(@NotNull String name, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.backingMap.isNull(name) ? z3 : this.backingMap.getBoolean(name);
    }

    public final double getDouble(@NotNull String name, double d2) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.backingMap.isNull(name) ? d2 : this.backingMap.getDouble(name);
    }

    @NotNull
    public final Dynamic getDynamic(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.backingMap.getDynamic(name);
    }

    public final float getFloat(@NotNull String name, float f10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.backingMap.isNull(name) ? f10 : (float) this.backingMap.getDouble(name);
    }

    public final int getInt(@NotNull String name, int i7) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.backingMap.isNull(name) ? i7 : this.backingMap.getInt(name);
    }

    @Nullable
    public final ReadableMap getMap(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.backingMap.getMap(name);
    }

    @Nullable
    public final String getString(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.backingMap.getString(name);
    }

    public final boolean hasKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.backingMap.hasKey(name);
    }

    @JvmName(name = "internal_backingMap")
    @NotNull
    /* JADX INFO: renamed from: internal_backingMap, reason: from getter */
    public final ReadableMap getBackingMap() {
        return this.backingMap;
    }

    public final boolean isNull(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.backingMap.isNull(name);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        return this.backingMap.toHashMap();
    }

    @NotNull
    public String toString() {
        return "{ ReactStylesDiffMap: " + this.backingMap + " }";
    }
}
