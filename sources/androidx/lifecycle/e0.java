package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends g0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static e0 f17447g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Application f17449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d0 f17446f = new d0(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c0 f17448h = c0.f17440a;

    public e0(Application application) {
        this.f17449e = application;
    }

    public final a0 a(Class cls, Application application) {
        if (!AbstractC1193c.class.isAssignableFrom(cls)) {
            return super.create(cls);
        }
        try {
            a0 a0Var = (a0) cls.getConstructor(Application.class).newInstance(application);
            Intrinsics.checkNotNullExpressionValue(a0Var, "{\n                try {\n…          }\n            }");
            return a0Var;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(androidx.camera.video.u.l(cls, "Cannot create an instance of "), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(androidx.camera.video.u.l(cls, "Cannot create an instance of "), e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(androidx.camera.video.u.l(cls, "Cannot create an instance of "), e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(androidx.camera.video.u.l(cls, "Cannot create an instance of "), e13);
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final a0 create(Class modelClass, z0.b extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.f17449e != null) {
            return create(modelClass);
        }
        Application application = (Application) extras.a(f17448h);
        if (application != null) {
            return a(modelClass, application);
        }
        if (AbstractC1193c.class.isAssignableFrom(modelClass)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.create(modelClass);
    }

    @Override // androidx.lifecycle.g0, androidx.lifecycle.ViewModelProvider$Factory
    public final a0 create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.f17449e;
        if (application != null) {
            return a(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
