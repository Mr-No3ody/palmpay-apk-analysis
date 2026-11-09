package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C1847n;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f17427a = C1850q.h(Application.class, T.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f17428b = C1849p.c(T.class);

    public static final Constructor a(List signature, Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "constructor.parameterTypes");
            List listY = C1847n.y(parameterTypes);
            if (Intrinsics.c(signature, listY)) {
                return constructor;
            }
            if (signature.size() == listY.size() && listY.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final a0 b(Class modelClass, Constructor constructor, Object... params) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            return (a0) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(androidx.camera.video.u.l(modelClass, "Failed to access "), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(androidx.camera.video.u.l(modelClass, "An exception happened in constructor of "), e12.getCause());
        }
    }
}
