package com.facebook.react.bridge;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/react/bridge/ReactCxxErrorHandler;", "", "<init>", "()V", "handleErrorFunc", "Ljava/lang/reflect/Method;", "handlerObject", "setHandleErrorFunc", "", "handleError", "message", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactCxxErrorHandler {

    @NotNull
    public static final ReactCxxErrorHandler INSTANCE = new ReactCxxErrorHandler();

    @Nullable
    private static Method handleErrorFunc;

    @Nullable
    private static Object handlerObject;

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactCxxErrorHandler", LegacyArchitectureLogLevel.WARNING);
    }

    private ReactCxxErrorHandler() {
    }

    @JvmStatic
    @DoNotStrip
    private static final void handleError(String message) {
        Method method = handleErrorFunc;
        if (method != null) {
            try {
                method.invoke(handlerObject, new Object[]{new Exception(message)});
            } catch (Exception e10) {
                p229p2.a.i("ReactCxxErrorHandler", "Failed to invoke error handler function", e10);
                Unit unit = Unit.f38893a;
            }
        }
    }

    @JvmStatic
    @DoNotStrip
    public static final void setHandleErrorFunc(@Nullable Object handlerObject2, @Nullable Method handleErrorFunc2) {
        handlerObject = handlerObject2;
        handleErrorFunc = handleErrorFunc2;
    }
}
