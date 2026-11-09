package com.facebook.react.bridge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\fJ\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rJ\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0011J'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0015J'\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/bridge/ReadableMapBuilder;", "", "map", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "(Lcom/facebook/react/bridge/WritableMap;)V", "put", "", "key", "", "value", "", "", "", "", "putNull", "Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/bridge/ReadableArray;", "putMap", "builder", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "putArray", "Lcom/facebook/react/bridge/ReadableArrayBuilder;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReadableMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilder\n+ 2 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n+ 3 ReadableArrayBuilder.kt\ncom/facebook/react/bridge/ReadableArrayBuilderKt\n*L\n1#1,76:1\n30#2,3:77\n24#3,3:80\n*S KotlinDebug\n*F\n+ 1 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilder\n*L\n69#1:77,3\n73#1:80,3\n*E\n"})
public final class ReadableMapBuilder {

    @NotNull
    private final WritableMap map;

    public ReadableMapBuilder(@NotNull WritableMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    public final void put(@NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.putString(key, value);
    }

    public final void putArray(@NotNull String key, @NotNull Function1<? super ReadableArrayBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builder, "builder");
        WritableMap writableMap = this.map;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
        builder.invoke(new ReadableArrayBuilder(writableArrayCreateArray));
        writableMap.putArray(key, writableArrayCreateArray);
    }

    public final void putMap(@NotNull String key, @NotNull Function1<? super ReadableMapBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builder, "builder");
        WritableMap writableMap = this.map;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        builder.invoke(new ReadableMapBuilder(writableMapCreateMap));
        writableMap.putMap(key, writableMapCreateMap);
    }

    public final void putNull(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.putNull(key);
    }

    public final void put(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.putInt(key, value);
    }

    public final void put(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.putBoolean(key, value);
    }

    public final void put(@NotNull String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.putDouble(key, value);
    }

    public final void put(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.putDouble(key, value);
    }

    public final void put(@NotNull String key, @NotNull ReadableMap value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.map.putMap(key, value);
    }

    public final void put(@NotNull String key, @NotNull ReadableArray value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.map.putArray(key, value);
    }
}
