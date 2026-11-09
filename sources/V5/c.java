package V5;

import com.nimbusds.jose.shaded.gson.JsonDeserializer;
import com.nimbusds.jose.shaded.gson.JsonSerializer;
import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.annotations.JsonAdapter;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.z;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements TypeAdapterFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F1.f f10004b;

    public /* synthetic */ c(F1.f fVar, int i7) {
        this.f10003a = i7;
        this.f10004b = fVar;
    }

    public static z a(F1.f fVar, com.nimbusds.jose.shaded.gson.m mVar, com.nimbusds.jose.shaded.gson.reflect.a aVar, JsonAdapter jsonAdapter) {
        z zVarCreate;
        Object objConstruct = fVar.b(new com.nimbusds.jose.shaded.gson.reflect.a(jsonAdapter.value())).construct();
        boolean zNullSafe = jsonAdapter.nullSafe();
        if (objConstruct instanceof z) {
            zVarCreate = (z) objConstruct;
        } else if (objConstruct instanceof TypeAdapterFactory) {
            zVarCreate = ((TypeAdapterFactory) objConstruct).create(mVar, aVar);
        } else {
            boolean z3 = objConstruct instanceof JsonSerializer;
            if (!z3 && !(objConstruct instanceof JsonDeserializer)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objConstruct.getClass().getName() + " as a @JsonAdapter for " + com.nimbusds.jose.shaded.gson.internal.d.i(aVar.f23690b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            t tVar = new t(z3 ? (JsonSerializer) objConstruct : null, objConstruct instanceof JsonDeserializer ? (JsonDeserializer) objConstruct : null, mVar, aVar, zNullSafe);
            zNullSafe = false;
            zVarCreate = tVar;
        }
        return (zVarCreate == null || !zNullSafe) ? zVarCreate : new com.nimbusds.jose.shaded.gson.k(zVarCreate, 2);
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final z create(com.nimbusds.jose.shaded.gson.m mVar, com.nimbusds.jose.shaded.gson.reflect.a aVar) {
        Type[] actualTypeArguments;
        Type type = Object.class;
        F1.f fVar = this.f10004b;
        switch (this.f10003a) {
            case 0:
                Type type2 = aVar.f23690b;
                Class cls = aVar.f23689a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                com.nimbusds.jose.shaded.gson.internal.d.b(Collection.class.isAssignableFrom(cls));
                Type typeH = com.nimbusds.jose.shaded.gson.internal.d.h(type2, cls, com.nimbusds.jose.shaded.gson.internal.d.f(type2, cls, Collection.class), new HashMap());
                type = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
                return new b(mVar, type, mVar.d(new com.nimbusds.jose.shaded.gson.reflect.a(type)), fVar.b(aVar));
            case 1:
                JsonAdapter jsonAdapter = (JsonAdapter) aVar.f23689a.getAnnotation(JsonAdapter.class);
                if (jsonAdapter == null) {
                    return null;
                }
                return a(fVar, mVar, aVar, jsonAdapter);
            default:
                Type type3 = aVar.f23690b;
                Class cls2 = aVar.f23689a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    com.nimbusds.jose.shaded.gson.internal.d.b(Map.class.isAssignableFrom(cls2));
                    Type typeH2 = com.nimbusds.jose.shaded.gson.internal.d.h(type3, cls2, com.nimbusds.jose.shaded.gson.internal.d.f(type3, cls2, Map.class), new HashMap());
                    actualTypeArguments = typeH2 instanceof ParameterizedType ? ((ParameterizedType) typeH2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                z zVarD = (type4 == Boolean.TYPE || type4 == Boolean.class) ? w.f10065c : mVar.d(new com.nimbusds.jose.shaded.gson.reflect.a(type4));
                z zVarD2 = mVar.d(new com.nimbusds.jose.shaded.gson.reflect.a(actualTypeArguments[1]));
                ObjectConstructor objectConstructorB = fVar.b(aVar);
                Type[] typeArr = actualTypeArguments;
                return new j(this, mVar, typeArr[0], zVarD, typeArr[1], zVarD2, objectConstructorB);
        }
    }
}
