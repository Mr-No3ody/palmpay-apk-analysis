package V5;

import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.z;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements TypeAdapterFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9998a;

    public /* synthetic */ a(int i7) {
        this.f9998a = i7;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final z create(com.nimbusds.jose.shaded.gson.m mVar, com.nimbusds.jose.shaded.gson.reflect.a aVar) {
        switch (this.f9998a) {
            case 0:
                Type type = aVar.f23690b;
                boolean z3 = type instanceof GenericArrayType;
                if (!z3 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z3 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new b(mVar, mVar.d(new com.nimbusds.jose.shaded.gson.reflect.a(genericComponentType)), com.nimbusds.jose.shaded.gson.internal.d.g(genericComponentType));
            case 1:
                if (aVar.f23689a == Date.class) {
                    return new d();
                }
                return null;
            case 2:
                Class superclass = aVar.f23689a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new j(superclass);
            case 3:
                if (aVar.f23689a == java.sql.Date.class) {
                    return new Y5.a(0);
                }
                return null;
            case 4:
                if (aVar.f23689a == Time.class) {
                    return new Y5.a(1);
                }
                return null;
            default:
                if (aVar.f23689a != Timestamp.class) {
                    return null;
                }
                mVar.getClass();
                return new Y5.a(mVar.d(new com.nimbusds.jose.shaded.gson.reflect.a(Date.class)));
        }
    }
}
