package V5;

import C0.G;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ObjectConstructor f10041b;

    public p(ObjectConstructor objectConstructor, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f10041b = objectConstructor;
    }

    @Override // V5.o
    public final Object c() {
        return this.f10041b.construct();
    }

    @Override // V5.o
    public final void e(Object obj, com.nimbusds.jose.shaded.gson.stream.b bVar, n nVar) throws IllegalAccessException {
        Object objA = nVar.f10035i.a(bVar);
        if (objA == null && nVar.f10038l) {
            return;
        }
        Field field = nVar.f10028b;
        if (nVar.f10032f) {
            r.a(obj, field);
        } else if (nVar.f10039m) {
            throw new com.nimbusds.jose.shaded.gson.p(G.o("Cannot set value of 'static final' ", X5.c.d(field, false)), 10, false);
        }
        field.set(obj, objA);
    }

    @Override // V5.o
    public final Object d(Object obj) {
        return obj;
    }
}
