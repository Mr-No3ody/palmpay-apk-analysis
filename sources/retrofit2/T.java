package retrofit2;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements WildcardType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f41893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f41894b;

    public T(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            U.d(typeArr[0]);
            this.f41894b = null;
            this.f41893a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        U.d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f41894b = typeArr2[0];
        this.f41893a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && U.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f41894b;
        return type != null ? new Type[]{type} : U.f41895a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f41893a};
    }

    public final int hashCode() {
        Type type = this.f41894b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f41893a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f41894b;
        if (type != null) {
            return "? super " + U.t(type);
        }
        Type type2 = this.f41893a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + U.t(type2);
    }
}
