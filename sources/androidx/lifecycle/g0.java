package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g0 f17455c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f17454b = new f0(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f17456d = c0.f17441b;

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public a0 create(Class modelClass) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Object objNewInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n                modelC…wInstance()\n            }");
            return (a0) objNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(androidx.camera.video.u.l(modelClass, "Cannot create an instance of "), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(androidx.camera.video.u.l(modelClass, "Cannot create an instance of "), e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(androidx.camera.video.u.l(modelClass, "Cannot create an instance of "), e12);
        }
    }
}
