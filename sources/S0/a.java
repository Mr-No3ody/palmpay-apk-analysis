package S0;

import M.f;
import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcelable;
import com.alibaba.android.arouter.utils.Consts;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f8628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f8629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f8630c;

    public a(f fVar, f fVar2, f fVar3) {
        this.f8628a = fVar;
        this.f8629b = fVar2;
        this.f8630c = fVar3;
    }

    public abstract b a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        f fVar = this.f8630c;
        Class cls2 = (Class) fVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(q0.l(cls.getPackage().getName(), Consts.DOT, cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        fVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        f fVar = this.f8628a;
        Method method = (Method) fVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        fVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        f fVar = this.f8629b;
        Method method = (Method) fVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, a.class);
        fVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i7);

    public final Parcelable f(Parcelable parcelable, int i7) {
        if (!e(i7)) {
            return parcelable;
        }
        return ((b) this).f8632e.readParcelable(b.class.getClassLoader());
    }

    public final VersionedParcelable g() {
        String string = ((b) this).f8632e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (VersionedParcelable) c(string).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract void h(int i7);

    public final void i(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            ((b) this).f8632e.writeString(null);
            return;
        }
        try {
            ((b) this).f8632e.writeString(b(versionedParcelable.getClass()).getName());
            b bVarA = a();
            try {
                d(versionedParcelable.getClass()).invoke(null, versionedParcelable, bVarA);
                int i7 = bVarA.f8636i;
                if (i7 >= 0) {
                    int i10 = bVarA.f8631d.get(i7);
                    Parcel parcel = bVarA.f8632e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(iDataPosition - i10);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (!(e13.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
                }
                throw ((RuntimeException) e13.getCause());
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
