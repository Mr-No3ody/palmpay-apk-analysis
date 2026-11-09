package V5;

import com.nimbusds.jose.shaded.gson.annotations.SerializedName;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10020d;

    public j(c cVar, com.nimbusds.jose.shaded.gson.m mVar, Type type, z zVar, Type type2, z zVar2, ObjectConstructor objectConstructor) {
        this.f10017a = 0;
        this.f10018b = new j(mVar, zVar, type);
        this.f10019c = new j(mVar, zVar2, type2);
        this.f10020d = objectConstructor;
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final Object a(com.nimbusds.jose.shaded.gson.stream.b bVar) throws IOException {
        switch (this.f10017a) {
            case 0:
                int iW = bVar.w();
                if (iW == 9) {
                    bVar.s();
                    return null;
                }
                Map map = (Map) ((ObjectConstructor) this.f10020d).construct();
                j jVar = (j) this.f10019c;
                j jVar2 = (j) this.f10018b;
                z zVar = (z) jVar.f10019c;
                z zVar2 = (z) jVar2.f10019c;
                if (iW == 1) {
                    bVar.a();
                    while (bVar.j()) {
                        bVar.a();
                        Object objA = zVar2.a(bVar);
                        if (map.put(objA, zVar.a(bVar)) != null) {
                            throw new com.nimbusds.jose.shaded.gson.p("duplicate key: " + objA, 10, false);
                        }
                        bVar.e();
                    }
                    bVar.e();
                } else {
                    bVar.b();
                    while (bVar.j()) {
                        com.nimbusds.jose.shaded.gson.stream.a.f23693a.getClass();
                        com.nimbusds.jose.shaded.gson.stream.a.a(bVar);
                        Object objA2 = zVar2.a(bVar);
                        if (map.put(objA2, zVar.a(bVar)) != null) {
                            throw new com.nimbusds.jose.shaded.gson.p("duplicate key: " + objA2, 10, false);
                        }
                    }
                    bVar.f();
                }
                return map;
            case 1:
                return ((z) this.f10019c).a(bVar);
            default:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                String strU = bVar.u();
                Enum r3 = (Enum) ((HashMap) this.f10018b).get(strU);
                return r3 == null ? (Enum) ((HashMap) this.f10019c).get(strU) : r3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    @Override // com.nimbusds.jose.shaded.gson.z
    public final void b(com.nimbusds.jose.shaded.gson.stream.c cVar, Object obj) throws IOException {
        z zVarC;
        switch (this.f10017a) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    cVar.i();
                } else {
                    j jVar = (j) this.f10019c;
                    cVar.c();
                    for (Map.Entry entry : map.entrySet()) {
                        cVar.g(String.valueOf(entry.getKey()));
                        jVar.b(cVar, entry.getValue());
                    }
                    cVar.f();
                }
                break;
            case 1:
                Type type = (Type) this.f10020d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                z zVar = (z) this.f10019c;
                if (type2 != type) {
                    z zVarD = ((com.nimbusds.jose.shaded.gson.m) this.f10018b).d(new com.nimbusds.jose.shaded.gson.reflect.a(type2));
                    if (zVarD instanceof o) {
                        z zVar2 = zVar;
                        while ((zVar2 instanceof s) && (zVarC = ((s) zVar2).c()) != zVar2) {
                            zVar2 = zVarC;
                        }
                        if (zVar2 instanceof o) {
                            zVar = zVarD;
                        }
                    } else {
                        zVar = zVarD;
                    }
                }
                zVar.b(cVar, obj);
                break;
            default:
                Enum r10 = (Enum) obj;
                cVar.p(r10 == null ? null : (String) ((HashMap) this.f10020d).get(r10));
                break;
        }
    }

    public j(com.nimbusds.jose.shaded.gson.m mVar, z zVar, Type type) {
        this.f10017a = 1;
        this.f10018b = mVar;
        this.f10019c = zVar;
        this.f10020d = type;
    }

    public j(Class cls) {
        this.f10017a = 2;
        this.f10018b = new HashMap();
        this.f10019c = new HashMap();
        this.f10020d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new v(cls))) {
                Enum r10 = (Enum) field.get(null);
                String strName = r10.name();
                String string = r10.toString();
                SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                if (serializedName != null) {
                    strName = serializedName.value();
                    for (String str : serializedName.alternate()) {
                        ((HashMap) this.f10018b).put(str, r10);
                    }
                }
                ((HashMap) this.f10018b).put(strName, r10);
                ((HashMap) this.f10019c).put(string, r10);
                ((HashMap) this.f10020d).put(r10, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }
}
