package com.facebook.react.bridge;

import C0.G;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\nH\u0007¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/bridge/JSONArguments;", "", "<init>", "()V", "fromJSONObject", "Lcom/facebook/react/bridge/ReadableMap;", "obj", "Lorg/json/JSONObject;", "fromJSONObjectString", "objStr", "", "fromJSONArray", "Lcom/facebook/react/bridge/ReadableArray;", "arr", "Lorg/json/JSONArray;", "fromJSONArrayString", "arrStr", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJSONArguments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSONArguments.kt\ncom/facebook/react/bridge/JSONArguments\n+ 2 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n+ 3 ReadableArrayBuilder.kt\ncom/facebook/react/bridge/ReadableArrayBuilderKt\n*L\n1#1,116:1\n30#2,3:117\n24#3,3:120\n*S KotlinDebug\n*F\n+ 1 JSONArguments.kt\ncom/facebook/react/bridge/JSONArguments\n*L\n36#1:117,3\n81#1:120,3\n*E\n"})
public final class JSONArguments {

    @NotNull
    public static final JSONArguments INSTANCE = new JSONArguments();

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("JSONArguments", LegacyArchitectureLogLevel.ERROR);
    }

    private JSONArguments() {
    }

    @JvmStatic
    @NotNull
    public static final ReadableArray fromJSONArray(@NotNull JSONArray arr) throws JSONException {
        Intrinsics.checkNotNullParameter(arr, "arr");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
        ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
        int length = arr.length();
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = arr.get(i7);
            if (obj instanceof JSONObject) {
                readableArrayBuilder.add(fromJSONObject((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                readableArrayBuilder.add(fromJSONArray((JSONArray) obj));
            } else if (obj instanceof String) {
                readableArrayBuilder.add((String) obj);
            } else if (obj instanceof Boolean) {
                readableArrayBuilder.add(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                readableArrayBuilder.add(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                readableArrayBuilder.add(((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                readableArrayBuilder.add((int) ((Number) obj).longValue());
            } else {
                if (!arr.isNull(i7)) {
                    throw new JSONException(G.m(i7, "Unexpected value when parsing JSON array. index: "));
                }
                readableArrayBuilder.addNull();
            }
        }
        return writableArrayCreateArray;
    }

    @JvmStatic
    @NotNull
    public static final ReadableArray fromJSONArrayString(@NotNull String arrStr) throws JSONException {
        Intrinsics.checkNotNullParameter(arrStr, "arrStr");
        return fromJSONArray(new JSONArray(arrStr));
    }

    @JvmStatic
    @NotNull
    public static final ReadableMap fromJSONObject(@NotNull JSONObject obj) throws JSONException {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Iterator<String> itKeys = obj.keys();
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj2 = obj.get(next);
            if (obj2 instanceof JSONObject) {
                Intrinsics.e(next);
                readableMapBuilder.put(next, fromJSONObject((JSONObject) obj2));
            } else if (obj2 instanceof JSONArray) {
                Intrinsics.e(next);
                readableMapBuilder.put(next, fromJSONArray((JSONArray) obj2));
            } else if (obj2 instanceof String) {
                Intrinsics.e(next);
                readableMapBuilder.put(next, (String) obj2);
            } else if (obj2 instanceof Boolean) {
                Intrinsics.e(next);
                readableMapBuilder.put(next, ((Boolean) obj2).booleanValue());
            } else if (obj2 instanceof Integer) {
                Intrinsics.e(next);
                readableMapBuilder.put(next, ((Number) obj2).intValue());
            } else if (obj2 instanceof Double) {
                Intrinsics.e(next);
                readableMapBuilder.put(next, ((Number) obj2).doubleValue());
            } else if (obj2 instanceof Long) {
                Intrinsics.e(next);
                readableMapBuilder.put(next, (int) ((Number) obj2).longValue());
            } else {
                if (!obj.isNull(next)) {
                    throw new JSONException(G.o("Unexpected value when parsing JSON object. key: ", next));
                }
                Intrinsics.e(next);
                readableMapBuilder.putNull(next);
            }
        }
        return writableMapCreateMap;
    }

    @JvmStatic
    @NotNull
    public static final ReadableMap fromJSONObjectString(@NotNull String objStr) throws JSONException {
        Intrinsics.checkNotNullParameter(objStr, "objStr");
        return fromJSONObject(new JSONObject(objStr));
    }
}
