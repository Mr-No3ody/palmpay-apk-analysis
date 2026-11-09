package com.facebook.react.modules.network;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.firebase.messaging.Constants;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J4\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J*\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J$\u0010\u0011\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J$\u0010\u0011\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0012H\u0007J.\u0010\u0013\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J6\u0010\u0018\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/modules/network/ResponseUtil;", "", "<init>", "()V", "onDataSend", "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "requestId", "", ReactProgressBarViewManager.PROP_PROGRESS, "", "total", "onIncrementalDataReceived", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "onDataReceivedProgress", "onDataReceived", "Lcom/facebook/react/bridge/WritableMap;", "onRequestError", "error", "e", "", "onRequestSuccess", "onResponseReceived", "statusCode", "headers", "url", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResponseUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseUtil.kt\ncom/facebook/react/modules/network/ResponseUtil\n+ 2 ReadableArrayBuilder.kt\ncom/facebook/react/bridge/ReadableArrayBuilderKt\n*L\n1#1,134:1\n24#2,3:135\n24#2,3:138\n24#2,3:141\n24#2,3:144\n24#2,3:147\n24#2,3:150\n*S KotlinDebug\n*F\n+ 1 ResponseUtil.kt\ncom/facebook/react/modules/network/ResponseUtil\n*L\n27#1:135,3\n44#1:138,3\n61#1:141,3\n72#1:144,3\n97#1:147,3\n110#1:150,3\n*E\n"})
public final class ResponseUtil {

    @NotNull
    public static final ResponseUtil INSTANCE = new ResponseUtil();

    private ResponseUtil() {
    }

    @JvmStatic
    public static final void onDataReceived(@Nullable ReactApplicationContext reactContext, int requestId, @Nullable WritableMap data) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(requestId);
            writableArrayCreateArray.pushMap(data);
            Unit unit = Unit.f38893a;
            reactContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray);
        }
    }

    @JvmStatic
    public static final void onDataReceivedProgress(@Nullable ReactApplicationContext reactContext, int requestId, long progress, long total) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add((int) progress);
            readableArrayBuilder.add((int) total);
            Unit unit = Unit.f38893a;
            reactContext.emitDeviceEvent("didReceiveNetworkDataProgress", writableArrayCreateArray);
        }
    }

    @JvmStatic
    public static final void onDataSend(@Nullable ReactApplicationContext reactContext, int requestId, long progress, long total) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add((int) progress);
            readableArrayBuilder.add((int) total);
            Unit unit = Unit.f38893a;
            reactContext.emitDeviceEvent("didSendNetworkData", writableArrayCreateArray);
        }
    }

    @JvmStatic
    public static final void onIncrementalDataReceived(@Nullable ReactApplicationContext reactContext, int requestId, @Nullable String data, long progress, long total) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add(data);
            readableArrayBuilder.add((int) progress);
            readableArrayBuilder.add((int) total);
            Unit unit = Unit.f38893a;
            reactContext.emitDeviceEvent("didReceiveNetworkIncrementalData", writableArrayCreateArray);
        }
    }

    @JvmStatic
    public static final void onRequestError(@Nullable ReactApplicationContext reactContext, int requestId, @Nullable String error, @Nullable Throwable e10) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add(error);
            if (Intrinsics.c(e10 != null ? e10.getClass() : null, SocketTimeoutException.class)) {
                readableArrayBuilder.add(true);
            }
            Unit unit = Unit.f38893a;
            reactContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    @JvmStatic
    public static final void onRequestSuccess(@Nullable ReactApplicationContext reactContext, int requestId) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.addNull();
            Unit unit = Unit.f38893a;
            reactContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    @JvmStatic
    public static final void onResponseReceived(@Nullable ReactApplicationContext reactContext, int requestId, int statusCode, @Nullable WritableMap headers, @Nullable String url) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(requestId);
            writableArrayCreateArray.pushInt(statusCode);
            writableArrayCreateArray.pushMap(headers);
            writableArrayCreateArray.pushString(url);
            Unit unit = Unit.f38893a;
            reactContext.emitDeviceEvent("didReceiveNetworkResponse", writableArrayCreateArray);
        }
    }

    @JvmStatic
    public static final void onDataReceived(@Nullable ReactApplicationContext reactContext, int requestId, @Nullable String data) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add(data);
            Unit unit = Unit.f38893a;
            reactContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray);
        }
    }
}
