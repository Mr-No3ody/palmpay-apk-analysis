package V5;

import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.z;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9999d = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10000a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10002c;

    public b(u uVar, Class cls) {
        this.f10001b = uVar;
        this.f10002c = cls;
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final Object a(com.nimbusds.jose.shaded.gson.stream.b bVar) throws IOException {
        switch (this.f10000a) {
            case 0:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                bVar.a();
                while (bVar.j()) {
                    arrayList.add(((z) ((j) this.f10001b).f10019c).a(bVar));
                }
                bVar.e();
                int size = arrayList.size();
                Class cls = (Class) this.f10002c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i7 = 0; i7 < size; i7++) {
                    Array.set(objNewInstance, i7, arrayList.get(i7));
                }
                return objNewInstance;
            case 1:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                Collection collection = (Collection) ((ObjectConstructor) this.f10002c).construct();
                bVar.a();
                while (bVar.j()) {
                    collection.add(((z) ((j) this.f10001b).f10019c).a(bVar));
                }
                bVar.e();
                return collection;
            default:
                Object objA = ((u) this.f10001b).f10059c.a(bVar);
                if (objA != null) {
                    Class cls2 = (Class) this.f10002c;
                    if (!cls2.isInstance(objA)) {
                        throw new com.nimbusds.jose.shaded.gson.p("Expected a " + cls2.getName() + " but was " + objA.getClass().getName() + "; at path " + bVar.i(), 10, false);
                    }
                }
                return objA;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final void b(com.nimbusds.jose.shaded.gson.stream.c cVar, Object obj) throws IOException {
        switch (this.f10000a) {
            case 0:
                if (obj == null) {
                    cVar.i();
                } else {
                    cVar.b();
                    int length = Array.getLength(obj);
                    for (int i7 = 0; i7 < length; i7++) {
                        ((j) this.f10001b).b(cVar, Array.get(obj, i7));
                    }
                    cVar.e();
                }
                break;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    cVar.i();
                } else {
                    cVar.b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((j) this.f10001b).b(cVar, it.next());
                    }
                    cVar.e();
                }
                break;
            default:
                ((u) this.f10001b).f10059c.b(cVar, obj);
                break;
        }
    }

    public b(com.nimbusds.jose.shaded.gson.m mVar, z zVar, Class cls) {
        this.f10001b = new j(mVar, zVar, cls);
        this.f10002c = cls;
    }

    public b(com.nimbusds.jose.shaded.gson.m mVar, Type type, z zVar, ObjectConstructor objectConstructor) {
        this.f10001b = new j(mVar, zVar, type);
        this.f10002c = objectConstructor;
    }
}
