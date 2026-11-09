package com.bumptech.glide.module;

import android.content.Context;
import androidx.camera.video.u;
import com.bumptech.glide.j;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements RegistersComponents {
    public static GlideModule a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof GlideModule) {
                    return (GlideModule) objNewInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (IllegalAccessException e10) {
                b(cls, e10);
                throw null;
            } catch (InstantiationException e11) {
                b(cls, e11);
                throw null;
            } catch (NoSuchMethodException e12) {
                b(cls, e12);
                throw null;
            } catch (InvocationTargetException e13) {
                b(cls, e13);
                throw null;
            }
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(u.l(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    @Override // com.bumptech.glide.module.RegistersComponents
    public void registerComponents(Context context, com.bumptech.glide.b bVar, j jVar) {
    }
}
