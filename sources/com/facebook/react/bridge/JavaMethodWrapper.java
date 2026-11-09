package com.facebook.react.bridge;

import C0.G;
import E.AbstractC0198c;
import N8.q0;
import android.os.Trace;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 32\u00020\u0001:\u000223B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010!\u001a\u00020\"H\u0002J/\u0010%\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010'J)\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\r2\u0010\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rH\u0002¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0011H\u0002J\u0018\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0002J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010 \u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010#\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b$\u0010\u0015¨\u00064"}, d2 = {"Lcom/facebook/react/bridge/JavaMethodWrapper;", "Lcom/facebook/react/bridge/JavaModuleWrapper$NativeMethod;", "moduleWrapper", "Lcom/facebook/react/bridge/JavaModuleWrapper;", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "isSync", "", "<init>", "(Lcom/facebook/react/bridge/JavaModuleWrapper;Ljava/lang/reflect/Method;Z)V", "getMethod", "()Ljava/lang/reflect/Method;", "parameterTypes", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "paramLength", "", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "argumentsProcessed", "argumentExtractors", "Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "[Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "internalSignature", "arguments", "", "[Ljava/lang/Object;", "jsArgumentsNeeded", "processArguments", "", "signature", "getSignature", "buildSignature", "paramTypes", "(Ljava/lang/reflect/Method;[Ljava/lang/Class;Z)Ljava/lang/String;", "buildArgumentExtractors", "([Ljava/lang/Class;)[Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "calculateJSArgumentsNeeded", "getAffectedRange", "startIndex", "invoke", "jsInstance", "Lcom/facebook/react/bridge/JSInstance;", "parameters", "Lcom/facebook/react/bridge/ReadableArray;", "ArgumentExtractor", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJavaMethodWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaMethodWrapper.kt\ncom/facebook/react/bridge/JavaMethodWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,400:1\n1#2:401\n*E\n"})
public final class JavaMethodWrapper implements JavaModuleWrapper.NativeMethod {

    @NotNull
    private static final ArgumentExtractor<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY;

    @NotNull
    private static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN;

    @NotNull
    private static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK;

    @NotNull
    private static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE;

    @NotNull
    private static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC;

    @NotNull
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT;

    @NotNull
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER;

    @NotNull
    private static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP;

    @NotNull
    private static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE;

    @NotNull
    private static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean DEBUG;

    @Nullable
    private ArgumentExtractor<?>[] argumentExtractors;

    @Nullable
    private Object[] arguments;
    private boolean argumentsProcessed;

    @Nullable
    private String internalSignature;
    private int jsArgumentsNeeded;

    @NotNull
    private final Method method;

    @NotNull
    private final JavaModuleWrapper moduleWrapper;
    private final int paramLength;

    @NotNull
    private final Class<?>[] parameterTypes;

    @NotNull
    private String type;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J'\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "T", "", "<init>", "()V", "getJSArgumentsNeeded", "", "extractArgument", "jsInstance", "Lcom/facebook/react/bridge/JSInstance;", "jsArguments", "Lcom/facebook/react/bridge/ReadableArray;", "atIndex", "(Lcom/facebook/react/bridge/JSInstance;Lcom/facebook/react/bridge/ReadableArray;I)Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ArgumentExtractor<T> {
        @Nullable
        public abstract T extractArgument(@NotNull JSInstance jsInstance, @NotNull ReadableArray jsArguments, int atIndex);

        public int getJSArgumentsNeeded() {
            return 1;
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002J\u0014\u0010\u001e\u001a\u00020\u001b2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002J\u0014\u0010 \u001a\u00020\u001b2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/facebook/react/bridge/JavaMethodWrapper$Companion;", "", "<init>", "()V", "ARGUMENT_EXTRACTOR_BOOLEAN", "Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "", "ARGUMENT_EXTRACTOR_DOUBLE", "", "ARGUMENT_EXTRACTOR_FLOAT", "", "ARGUMENT_EXTRACTOR_INTEGER", "", "ARGUMENT_EXTRACTOR_STRING", "", "ARGUMENT_EXTRACTOR_ARRAY", "Lcom/facebook/react/bridge/ReadableArray;", "ARGUMENT_EXTRACTOR_DYNAMIC", "Lcom/facebook/react/bridge/Dynamic;", "ARGUMENT_EXTRACTOR_MAP", "Lcom/facebook/react/bridge/ReadableMap;", "ARGUMENT_EXTRACTOR_CALLBACK", "Lcom/facebook/react/bridge/Callback;", "ARGUMENT_EXTRACTOR_PROMISE", "Lcom/facebook/react/bridge/Promise;", "DEBUG", "paramTypeToChar", "", "paramClass", "Ljava/lang/Class;", "returnTypeToChar", "returnClass", "commonTypeToChar", "typeClass", "createInvokeExceptionMessage", "traceName", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final char commonTypeToChar(Class<?> typeClass) {
            if (Intrinsics.c(typeClass, Boolean.TYPE)) {
                return 'z';
            }
            if (Intrinsics.c(typeClass, Boolean.class)) {
                return 'Z';
            }
            if (Intrinsics.c(typeClass, Integer.TYPE)) {
                return 'i';
            }
            if (Intrinsics.c(typeClass, Integer.class)) {
                return 'I';
            }
            if (Intrinsics.c(typeClass, Double.TYPE)) {
                return 'd';
            }
            if (Intrinsics.c(typeClass, Double.class)) {
                return 'D';
            }
            if (Intrinsics.c(typeClass, Float.TYPE)) {
                return 'f';
            }
            if (Intrinsics.c(typeClass, Float.class)) {
                return 'F';
            }
            return Intrinsics.c(typeClass, String.class) ? 'S' : (char) 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createInvokeExceptionMessage(String traceName) {
            return G.o("Could not invoke ", traceName);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final char paramTypeToChar(Class<?> paramClass) {
            char cCommonTypeToChar = commonTypeToChar(paramClass);
            if (cCommonTypeToChar != 0) {
                return cCommonTypeToChar;
            }
            if (Intrinsics.c(paramClass, Callback.class)) {
                return 'X';
            }
            if (Intrinsics.c(paramClass, Promise.class)) {
                return 'P';
            }
            if (Intrinsics.c(paramClass, ReadableMap.class)) {
                return 'M';
            }
            if (Intrinsics.c(paramClass, ReadableArray.class)) {
                return 'A';
            }
            if (Intrinsics.c(paramClass, Dynamic.class)) {
                return 'Y';
            }
            throw new RuntimeException("Got unknown param class: ".concat(paramClass.getSimpleName()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final char returnTypeToChar(Class<?> returnClass) {
            char cCommonTypeToChar = commonTypeToChar(returnClass);
            if (cCommonTypeToChar != 0) {
                return cCommonTypeToChar;
            }
            if (Intrinsics.c(returnClass, Void.TYPE)) {
                return 'v';
            }
            if (Intrinsics.c(returnClass, WritableMap.class)) {
                return 'M';
            }
            if (Intrinsics.c(returnClass, WritableArray.class)) {
                return 'A';
            }
            throw new RuntimeException("Got unknown return class: ".concat(returnClass.getSimpleName()));
        }

        private Companion() {
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("JavaMethodWrapper", LegacyArchitectureLogLevel.ERROR);
        ARGUMENT_EXTRACTOR_BOOLEAN = new ArgumentExtractor<Boolean>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_BOOLEAN$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Boolean extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
                Intrinsics.checkNotNullParameter(jsArguments, "jsArguments");
                return Boolean.valueOf(jsArguments.getBoolean(atIndex));
            }
        };
        ARGUMENT_EXTRACTOR_DOUBLE = new ArgumentExtractor<Double>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_DOUBLE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Double extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
                Intrinsics.checkNotNullParameter(jsArguments, "jsArguments");
                return Double.valueOf(jsArguments.getDouble(atIndex));
            }
        };
        ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_FLOAT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Float extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
                Intrinsics.checkNotNullParameter(jsArguments, "jsArguments");
                return Float.valueOf((float) jsArguments.getDouble(atIndex));
            }
        };
        ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_INTEGER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Integer extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
                Intrinsics.checkNotNullParameter(jsArguments, "jsArguments");
                return Integer.valueOf((int) jsArguments.getDouble(atIndex));
            }
        };
        ARGUMENT_EXTRACTOR_STRING = new ArgumentExtractor<String>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_STRING$1
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public String extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
                Intrinsics.checkNotNullParameter(jsArguments, "jsArguments");
                return jsArguments.getString(atIndex);
            }
        };
        ARGUMENT_EXTRACTOR_ARRAY = new ArgumentExtractor<ReadableArray>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_ARRAY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public ReadableArray extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
                Intrinsics.checkNotNullParameter(jsArguments, "jsArguments");
                return jsArguments.getArray(atIndex);
            }
        };
        ARGUMENT_EXTRACTOR_DYNAMIC = new ArgumentExtractor<Dynamic>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_DYNAMIC$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Dynamic extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
                Intrinsics.checkNotNullParameter(jsArguments, "jsArguments");
                return DynamicFromArray.INSTANCE.create(jsArguments, atIndex);
            }
        };
        ARGUMENT_EXTRACTOR_MAP = new ArgumentExtractor<ReadableMap>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_MAP$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public ReadableMap extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
                Intrinsics.checkNotNullParameter(jsArguments, "jsArguments");
                return jsArguments.getMap(atIndex);
            }
        };
        ARGUMENT_EXTRACTOR_CALLBACK = new ArgumentExtractor<Callback>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_CALLBACK$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Callback extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
                Intrinsics.checkNotNullParameter(jsArguments, "jsArguments");
                if (jsArguments.isNull(atIndex)) {
                    return null;
                }
                return new CallbackImpl(jsInstance, (int) jsArguments.getDouble(atIndex));
            }
        };
        ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor<Promise>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_PROMISE$1
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public int getJSArgumentsNeeded() {
                return 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Promise extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
                Intrinsics.checkNotNullParameter(jsArguments, "jsArguments");
                return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jsInstance, jsArguments, atIndex), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jsInstance, jsArguments, atIndex + 1));
            }
        };
        p375z2.a tag = A2.a.f32b;
        Intrinsics.checkNotNullParameter(tag, "tag");
        DEBUG = false;
    }

    public JavaMethodWrapper(@NotNull JavaModuleWrapper moduleWrapper, @NotNull Method method, boolean z3) {
        Intrinsics.checkNotNullParameter(moduleWrapper, "moduleWrapper");
        Intrinsics.checkNotNullParameter(method, "method");
        this.moduleWrapper = moduleWrapper;
        this.method = method;
        this.type = BaseJavaModule.METHOD_TYPE_ASYNC;
        method.setAccessible(true);
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        this.parameterTypes = parameterTypes;
        int length = parameterTypes.length;
        this.paramLength = length;
        if (z3) {
            setType(BaseJavaModule.METHOD_TYPE_SYNC);
        } else {
            if (length <= 0 || !Intrinsics.c(parameterTypes[length - 1], Promise.class)) {
                return;
            }
            setType(BaseJavaModule.METHOD_TYPE_PROMISE);
        }
    }

    private final ArgumentExtractor<?>[] buildArgumentExtractors(Class<?>[] paramTypes) {
        ArgumentExtractor<?> argumentExtractor;
        int length = paramTypes.length;
        ArgumentExtractor<?>[] argumentExtractorArr = new ArgumentExtractor[length];
        int jSArgumentsNeeded = 0;
        while (jSArgumentsNeeded < paramTypes.length) {
            Class<?> cls = paramTypes[jSArgumentsNeeded];
            if (Intrinsics.c(cls, Boolean.class) || Intrinsics.c(cls, Boolean.TYPE)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_BOOLEAN;
            } else if (Intrinsics.c(cls, Integer.class) || Intrinsics.c(cls, Integer.TYPE)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (Intrinsics.c(cls, Double.class) || Intrinsics.c(cls, Double.TYPE)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_DOUBLE;
            } else if (Intrinsics.c(cls, Float.class) || Intrinsics.c(cls, Float.TYPE)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (Intrinsics.c(cls, String.class)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_STRING;
            } else if (Intrinsics.c(cls, Callback.class)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_CALLBACK;
            } else if (Intrinsics.c(cls, Promise.class)) {
                if (jSArgumentsNeeded != paramTypes.length - 1) {
                    throw new IllegalStateException("Promise must be used as last parameter only");
                }
                argumentExtractor = ARGUMENT_EXTRACTOR_PROMISE;
            } else if (Intrinsics.c(cls, ReadableMap.class)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_MAP;
            } else if (Intrinsics.c(cls, ReadableArray.class)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_ARRAY;
            } else {
                if (!Intrinsics.c(cls, Dynamic.class)) {
                    throw new RuntimeException("Got unknown argument class: ".concat(cls.getSimpleName()));
                }
                argumentExtractor = ARGUMENT_EXTRACTOR_DYNAMIC;
            }
            argumentExtractorArr[jSArgumentsNeeded] = argumentExtractor;
            jSArgumentsNeeded += argumentExtractor.getJSArgumentsNeeded();
        }
        Intrinsics.checkNotNullParameter(argumentExtractorArr, "<this>");
        for (int i7 = 0; i7 < length; i7++) {
            if (argumentExtractorArr[i7] == null) {
                throw new IllegalArgumentException("null element found in " + argumentExtractorArr + '.');
            }
        }
        return argumentExtractorArr;
    }

    private final String buildSignature(Method method, Class<?>[] paramTypes, boolean isSync) {
        StringBuilder sb2 = new StringBuilder(paramTypes.length + 2);
        if (isSync) {
            Companion companion = INSTANCE;
            Class<?> returnType = method.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            sb2.append(companion.returnTypeToChar(returnType));
            sb2.append('.');
        } else {
            sb2.append("v.");
        }
        int length = paramTypes.length;
        for (int i7 = 0; i7 < length; i7++) {
            Class<?> cls = paramTypes[i7];
            if (Intrinsics.c(cls, Promise.class) && i7 != paramTypes.length - 1) {
                throw new IllegalStateException("Promise must be used as last parameter only");
            }
            sb2.append(INSTANCE.paramTypeToChar(cls));
        }
        return sb2.toString();
    }

    private final int calculateJSArgumentsNeeded() {
        ArgumentExtractor<?>[] argumentExtractorArr = this.argumentExtractors;
        if (argumentExtractorArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int jSArgumentsNeeded = 0;
        for (ArgumentExtractor<?> argumentExtractor : argumentExtractorArr) {
            jSArgumentsNeeded += argumentExtractor.getJSArgumentsNeeded();
        }
        return jSArgumentsNeeded;
    }

    private final String getAffectedRange(int startIndex, int jsArgumentsNeeded) {
        if (jsArgumentsNeeded <= 1) {
            return String.valueOf(startIndex);
        }
        return startIndex + "-" + ((jsArgumentsNeeded + startIndex) - 1);
    }

    private final void processArguments() {
        if (this.argumentsProcessed) {
            return;
        }
        d dVarD = AbstractC0198c.d("processArguments");
        dVarD.c(this.moduleWrapper.getName() + Consts.DOT + this.method.getName(), FirebaseAnalytics.Param.METHOD);
        dVarD.e();
        try {
            this.argumentsProcessed = true;
            this.argumentExtractors = buildArgumentExtractors(this.parameterTypes);
            this.internalSignature = buildSignature(this.method, this.parameterTypes, Intrinsics.c(getType(), BaseJavaModule.METHOD_TYPE_SYNC));
            this.arguments = new Object[this.parameterTypes.length];
            this.jsArgumentsNeeded = calculateJSArgumentsNeeded();
        } finally {
            Trace.endSection();
        }
    }

    @NotNull
    public final Method getMethod() {
        return this.method;
    }

    @Nullable
    public final String getSignature() {
        if (!this.argumentsProcessed) {
            processArguments();
        }
        String str = this.internalSignature;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.react.bridge.JavaModuleWrapper.NativeMethod
    @NotNull
    public String getType() {
        return this.type;
    }

    @Override // com.facebook.react.bridge.JavaModuleWrapper.NativeMethod
    public void invoke(@NotNull JSInstance jsInstance, @NotNull ReadableArray parameters) {
        Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        String strY = q0.y(this.moduleWrapper.getName(), Consts.DOT, this.method.getName());
        d dVarD = AbstractC0198c.d("callJavaModuleMethod");
        dVarD.c(strY, FirebaseAnalytics.Param.METHOD);
        dVarD.e();
        if (DEBUG) {
            p375z2.a tag = A2.a.f32b;
            Object[] args = {this.moduleWrapper.getName(), this.method.getName()};
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter("JS->Java: %s.%s()", "message");
            Intrinsics.checkNotNullParameter(args, "args");
        }
        try {
            if (!this.argumentsProcessed) {
                processArguments();
            }
            Object[] objArr = this.arguments;
            if (objArr == null) {
                throw new IllegalArgumentException("processArguments failed: 'arguments' is null.");
            }
            ArgumentExtractor<?>[] argumentExtractorArr = this.argumentExtractors;
            if (argumentExtractorArr == null) {
                throw new IllegalArgumentException("processArguments failed: 'argumentExtractors' is null.");
            }
            if (this.jsArgumentsNeeded != parameters.size()) {
                throw new NativeArgumentsParseException(strY + " got " + parameters.size() + " arguments, expected " + this.jsArgumentsNeeded);
            }
            int jSArgumentsNeeded = 0;
            for (int i7 = 0; i7 < argumentExtractorArr.length; i7++) {
                try {
                    try {
                        objArr[i7] = argumentExtractorArr[i7].extractArgument(jsInstance, parameters, jSArgumentsNeeded);
                        jSArgumentsNeeded += argumentExtractorArr[i7].getJSArgumentsNeeded();
                    } catch (UnexpectedNativeTypeException e10) {
                        throw new NativeArgumentsParseException(e10.getMessage() + " (constructing arguments for " + strY + " at argument index " + getAffectedRange(jSArgumentsNeeded, argumentExtractorArr[i7].getJSArgumentsNeeded()) + ")", e10);
                    }
                } catch (NullPointerException e11) {
                    throw new NativeArgumentsParseException(e11.getMessage() + " (constructing arguments for " + strY + " at argument index " + getAffectedRange(jSArgumentsNeeded, argumentExtractorArr[i7].getJSArgumentsNeeded()) + ")", e11);
                }
            }
            try {
                try {
                    this.method.invoke(this.moduleWrapper.getModule(), Arrays.copyOf(objArr, objArr.length));
                    Trace.endSection();
                } catch (IllegalArgumentException e12) {
                    throw new RuntimeException(INSTANCE.createInvokeExceptionMessage(strY), e12);
                }
            } catch (IllegalAccessException e13) {
                throw new RuntimeException(INSTANCE.createInvokeExceptionMessage(strY), e13);
            } catch (InvocationTargetException e14) {
                if (!(e14.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException(INSTANCE.createInvokeExceptionMessage(strY), e14);
                }
                Throwable cause = e14.getCause();
                Intrinsics.f(cause, "null cannot be cast to non-null type java.lang.RuntimeException");
                throw ((RuntimeException) cause);
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }
}
