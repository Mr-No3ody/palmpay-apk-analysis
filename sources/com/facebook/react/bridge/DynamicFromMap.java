package com.facebook.react.bridge;

import Ab.y;
import androidx.core.util.Pools$SimplePool;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016JK\u0010\u001a\u001a\u0002H\u001b\"\u0004\b\u0000\u0010\u001b26\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001e\u0012\b\b\u0006\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001e\u0012\b\b\u0006\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u0002H\u001b0\u001dH\u0002¢\u0006\u0002\u0010\u001fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/facebook/react/bridge/DynamicFromMap;", "Lcom/facebook/react/bridge/Dynamic;", "<init>", "()V", "map", "Lcom/facebook/react/bridge/ReadableMap;", "name", "", "recycle", "", "isNull", "", "()Z", "asBoolean", "asDouble", "", "asInt", "", "asString", "asArray", "Lcom/facebook/react/bridge/ReadableArray;", "asMap", "type", "Lcom/facebook/react/bridge/ReadableType;", "getType", "()Lcom/facebook/react/bridge/ReadableType;", "accessMapSafely", "T", "executor", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDynamicFromMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicFromMap.kt\ncom/facebook/react/bridge/DynamicFromMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
public final class DynamicFromMap implements Dynamic {

    @NotNull
    private static final String DYNAMIC_VALUE_RECYCLED_FAILURE_MESSAGE = "This dynamic value has been recycled";

    @Nullable
    private ReadableMap map;

    @Nullable
    private String name;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ThreadLocal<Pools$SimplePool> pool = new ThreadLocal<Pools$SimplePool>() { // from class: com.facebook.react.bridge.DynamicFromMap$Companion$pool$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Pools$SimplePool initialValue() {
            return new Pools$SimplePool(10);
        }
    };

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tR\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/bridge/DynamicFromMap$Companion;", "", "<init>", "()V", "pool", "Ljava/lang/ThreadLocal;", "Landroidx/core/util/Pools$SimplePool;", "Lcom/facebook/react/bridge/DynamicFromMap;", "DYNAMIC_VALUE_RECYCLED_FAILURE_MESSAGE", "", "create", "map", "Lcom/facebook/react/bridge/ReadableMap;", "name", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DynamicFromMap create(@NotNull ReadableMap map, @NotNull String name) {
            DynamicFromMap dynamicFromMap;
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(name, "name");
            Pools$SimplePool pools$SimplePool = (Pools$SimplePool) DynamicFromMap.pool.get();
            if (pools$SimplePool == null || (dynamicFromMap = (DynamicFromMap) pools$SimplePool.acquire()) == null) {
                dynamicFromMap = new DynamicFromMap(null);
            }
            dynamicFromMap.map = map;
            dynamicFromMap.name = name;
            return dynamicFromMap;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DynamicFromMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_isNull_$lambda$0(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.isNull(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableType _get_type_$lambda$7(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getType(name);
    }

    private final <T> T accessMapSafely(Function2<? super ReadableMap, ? super String, ? extends T> executor) {
        String str = this.name;
        if (str == null) {
            throw new IllegalStateException(DYNAMIC_VALUE_RECYCLED_FAILURE_MESSAGE);
        }
        ReadableMap readableMap = this.map;
        if (readableMap != null) {
            return executor.invoke(readableMap, str);
        }
        throw new IllegalStateException(DYNAMIC_VALUE_RECYCLED_FAILURE_MESSAGE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableArray asArray$lambda$5(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getArray(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBoolean$lambda$1(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getBoolean(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double asDouble$lambda$2(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getDouble(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt$lambda$3(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getInt(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableMap asMap$lambda$6(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getMap(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String asString$lambda$4(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getString(name);
    }

    @Override // com.facebook.react.bridge.Dynamic
    @Nullable
    public ReadableArray asArray() {
        return (ReadableArray) accessMapSafely(new y(19));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        return ((Boolean) accessMapSafely(new y(16))).booleanValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        return ((Number) accessMapSafely(new y(21))).doubleValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        return ((Number) accessMapSafely(new y(15))).intValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    @Nullable
    public ReadableMap asMap() {
        return (ReadableMap) accessMapSafely(new y(14));
    }

    @Override // com.facebook.react.bridge.Dynamic
    @Nullable
    public String asString() {
        return (String) accessMapSafely(new y(17));
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableType getType() {
        return (ReadableType) accessMapSafely(new y(18));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        return ((Boolean) accessMapSafely(new y(20))).booleanValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
        this.map = null;
        this.name = null;
        Pools$SimplePool pools$SimplePool = pool.get();
        if (pools$SimplePool != null) {
            pools$SimplePool.release(this);
        }
    }

    private DynamicFromMap() {
    }
}
