package retrofit2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements GenericArrayType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f41889a;

    public Q(Type type) {
        this.f41889a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && U.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f41889a;
    }

    public final int hashCode() {
        return this.f41889a.hashCode();
    }

    public final String toString() {
        return U.t(this.f41889a) + "[]";
    }
}
