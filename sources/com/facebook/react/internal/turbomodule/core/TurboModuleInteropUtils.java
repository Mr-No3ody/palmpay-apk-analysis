package com.facebook.react.internal.turbomodule.core;

import C0.G;
import N8.q0;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\fJ;\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\n2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J$\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J\u0014\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J/\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\nH\u0002¢\u0006\u0002\u0010\u001cJ;\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\n2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0002\u0010\u0014¨\u0006 "}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils;", "", "<init>", "()V", "getMethodDescriptorsFromModule", "", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;", "module", "Lcom/facebook/react/bridge/NativeModule;", "getMethodsFromModule", "", "Ljava/lang/reflect/Method;", "(Lcom/facebook/react/bridge/NativeModule;)[Ljava/lang/reflect/Method;", "createJniSignature", "", "moduleName", "methodName", "paramClasses", "Ljava/lang/Class;", "returnClass", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;", "convertParamClassToJniType", "paramClass", "convertReturnClassToJniType", "convertClassToJniType", "cls", "getJsArgCount", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)I", "createJSIReturnKind", "MethodDescriptor", "ParsingException", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTurboModuleInteropUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TurboModuleInteropUtils.kt\ncom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n1#2:295\n*E\n"})
public final class TurboModuleInteropUtils {

    @NotNull
    public static final TurboModuleInteropUtils INSTANCE = new TurboModuleInteropUtils();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;", "", "methodName", "", "jniSignature", "jsiReturnKind", "jsArgCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MethodDescriptor {

        @DoNotStrip
        @JvmField
        @NotNull
        public final String jniSignature;

        @DoNotStrip
        @JvmField
        public final int jsArgCount;

        @DoNotStrip
        @JvmField
        @NotNull
        public final String jsiReturnKind;

        @DoNotStrip
        @JvmField
        @NotNull
        public final String methodName;

        public MethodDescriptor(@NotNull String methodName, @NotNull String jniSignature, @NotNull String jsiReturnKind, int i7) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(jniSignature, "jniSignature");
            Intrinsics.checkNotNullParameter(jsiReturnKind, "jsiReturnKind");
            this.methodName = methodName;
            this.jniSignature = jniSignature;
            this.jsiReturnKind = jsiReturnKind;
            this.jsArgCount = i7;
        }
    }

    private TurboModuleInteropUtils() {
    }

    private final String convertClassToJniType(Class<?> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return q0.k("L", y.j(canonicalName, '.', '/'), ";");
        }
        throw new IllegalArgumentException("Class must have a canonical name");
    }

    private final String convertParamClassToJniType(String moduleName, String methodName, Class<?> paramClass) {
        if (Intrinsics.c(paramClass, Boolean.TYPE)) {
            return "Z";
        }
        if (Intrinsics.c(paramClass, Integer.TYPE)) {
            return "I";
        }
        if (Intrinsics.c(paramClass, Double.TYPE)) {
            return "D";
        }
        if (Intrinsics.c(paramClass, Float.TYPE)) {
            return "F";
        }
        if (Intrinsics.c(paramClass, Boolean.class) || Intrinsics.c(paramClass, Integer.class) || Intrinsics.c(paramClass, Double.class) || Intrinsics.c(paramClass, Float.class) || Intrinsics.c(paramClass, String.class) || Intrinsics.c(paramClass, Callback.class) || Intrinsics.c(paramClass, Promise.class) || Intrinsics.c(paramClass, ReadableMap.class) || Intrinsics.c(paramClass, ReadableArray.class) || Intrinsics.c(paramClass, Dynamic.class)) {
            return convertClassToJniType(paramClass);
        }
        throw new ParsingException(moduleName, methodName, G.o("Unable to parse JNI signature. Detected unsupported parameter class: ", paramClass.getCanonicalName()));
    }

    private final String convertReturnClassToJniType(String moduleName, String methodName, Class<?> returnClass) {
        if (Intrinsics.c(returnClass, Boolean.TYPE)) {
            return "Z";
        }
        if (Intrinsics.c(returnClass, Integer.TYPE)) {
            return "I";
        }
        if (Intrinsics.c(returnClass, Double.TYPE)) {
            return "D";
        }
        if (Intrinsics.c(returnClass, Float.TYPE)) {
            return "F";
        }
        if (Intrinsics.c(returnClass, Void.TYPE)) {
            return "V";
        }
        if (Intrinsics.c(returnClass, Boolean.class) || Intrinsics.c(returnClass, Integer.class) || Intrinsics.c(returnClass, Double.class) || Intrinsics.c(returnClass, Float.class) || Intrinsics.c(returnClass, String.class) || Intrinsics.c(returnClass, WritableMap.class) || Intrinsics.c(returnClass, WritableArray.class) || Intrinsics.c(returnClass, Map.class)) {
            return convertClassToJniType(returnClass);
        }
        throw new ParsingException(moduleName, methodName, G.o("Unable to parse JNI signature. Detected unsupported return class: ", returnClass.getCanonicalName()));
    }

    private final String createJSIReturnKind(String moduleName, String methodName, Class<?>[] paramClasses, Class<?> returnClass) {
        for (int i7 = 0; i7 < paramClasses.length; i7++) {
            if (Intrinsics.c(paramClasses[i7], Promise.class)) {
                if (i7 == paramClasses.length - 1) {
                    return "PromiseKind";
                }
                throw new ParsingException(moduleName, methodName, "Unable to parse JSI return kind. Promises must be used as last parameter only.");
            }
        }
        if (Intrinsics.c(returnClass, Boolean.TYPE) || Intrinsics.c(returnClass, Boolean.class)) {
            return "BooleanKind";
        }
        if (Intrinsics.c(returnClass, Double.TYPE) || Intrinsics.c(returnClass, Double.class) || Intrinsics.c(returnClass, Float.TYPE) || Intrinsics.c(returnClass, Float.class) || Intrinsics.c(returnClass, Integer.TYPE) || Intrinsics.c(returnClass, Integer.class)) {
            return "NumberKind";
        }
        if (Intrinsics.c(returnClass, String.class)) {
            return "StringKind";
        }
        if (Intrinsics.c(returnClass, Void.TYPE)) {
            return "VoidKind";
        }
        if (Intrinsics.c(returnClass, WritableMap.class) || Intrinsics.c(returnClass, Map.class)) {
            return "ObjectKind";
        }
        if (Intrinsics.c(returnClass, WritableArray.class)) {
            return "ArrayKind";
        }
        throw new ParsingException(moduleName, methodName, G.o("Unable to parse JSI return kind. Detected unsupported return class: ", returnClass.getCanonicalName()));
    }

    private final String createJniSignature(String moduleName, String methodName, Class<?>[] paramClasses, Class<?> returnClass) {
        StringBuilder sb2 = new StringBuilder("(");
        for (Class<?> cls : paramClasses) {
            sb2.append(convertParamClassToJniType(moduleName, methodName, cls));
        }
        sb2.append(")");
        sb2.append(convertReturnClassToJniType(moduleName, methodName, returnClass));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final int getJsArgCount(String moduleName, String methodName, Class<?>[] paramClasses) {
        for (int i7 = 0; i7 < paramClasses.length; i7++) {
            if (Intrinsics.c(paramClasses[i7], Promise.class)) {
                if (i7 == paramClasses.length - 1) {
                    return paramClasses.length - 1;
                }
                throw new ParsingException(moduleName, methodName, "Unable to parse JavaScript arg count. Promises must be used as last parameter only.");
            }
        }
        return paramClasses.length;
    }

    @JvmStatic
    @NotNull
    public static final List<MethodDescriptor> getMethodDescriptorsFromModule(@NotNull NativeModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        Method[] methodsFromModule = INSTANCE.getMethodsFromModule(module);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Method method : methodsFromModule) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            String name = module.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String name2 = method.getName();
            if (reactMethod != null || "getConstants".equals(name2)) {
                if (hashSet.contains(name2)) {
                    throw new ParsingException(name, G.o("Module exports two methods to JavaScript with the same name: \"", name2));
                }
                Intrinsics.e(name2);
                hashSet.add(name2);
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                if ("getConstants".equals(name2)) {
                    if (!Intrinsics.c(returnType, Map.class)) {
                        throw new ParsingException(name, "getConstants must return a Map");
                    }
                } else if (reactMethod != null) {
                    boolean zIsBlockingSynchronousMethod = reactMethod.isBlockingSynchronousMethod();
                    Class cls = Void.TYPE;
                    if ((zIsBlockingSynchronousMethod && Intrinsics.c(returnType, cls)) || (!reactMethod.isBlockingSynchronousMethod() && !Intrinsics.c(returnType, cls))) {
                        throw new ParsingException(name, "TurboModule system assumes returnType == void iff the method is synchronous.");
                    }
                }
                TurboModuleInteropUtils turboModuleInteropUtils = INSTANCE;
                Intrinsics.e(parameterTypes);
                Intrinsics.e(returnType);
                arrayList.add(new MethodDescriptor(name2, turboModuleInteropUtils.createJniSignature(name, name2, parameterTypes, returnType), turboModuleInteropUtils.createJSIReturnKind(name, name2, parameterTypes, returnType), turboModuleInteropUtils.getJsArgCount(name, name2, parameterTypes)));
            }
        }
        return arrayList;
    }

    private final Method[] getMethodsFromModule(NativeModule module) {
        Class<?> cls = module.getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null) {
            superclass = null;
        }
        if (superclass != null && TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        return declaredMethods;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$ParsingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "moduleName", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "methodName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ParsingException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingException(@NotNull String moduleName, @NotNull String message) {
            super(F.d(new StringBuilder("Unable to parse @ReactMethod annotations from native module: "), moduleName, ". Details: ", message));
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            Intrinsics.checkNotNullParameter(message, "message");
        }

        public ParsingException(@NotNull String moduleName, @NotNull String methodName, @NotNull String message) {
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(message, "message");
            StringBuilder sb2 = new StringBuilder("Unable to parse @ReactMethod annotation from native module method: ");
            u.x(sb2, moduleName, Consts.DOT, methodName, "(). Details: ");
            sb2.append(message);
            super(sb2.toString());
        }
    }
}
