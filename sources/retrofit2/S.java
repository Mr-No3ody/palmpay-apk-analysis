package retrofit2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class S implements ParameterizedType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f41890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f41891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f41892c;

    public S(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            U.d(type3);
        }
        this.f41890a = type;
        this.f41891b = type2;
        this.f41892c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && U.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f41892c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f41890a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f41891b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f41892c) ^ this.f41891b.hashCode();
        Type type = this.f41890a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f41892c;
        int length = typeArr.length;
        Type type = this.f41891b;
        if (length == 0) {
            return U.t(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(U.t(type));
        sb2.append("<");
        sb2.append(U.t(typeArr[0]));
        for (int i7 = 1; i7 < typeArr.length; i7++) {
            sb2.append(", ");
            sb2.append(U.t(typeArr[i7]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
