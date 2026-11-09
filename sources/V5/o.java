package V5;

import com.nimbusds.jose.shaded.gson.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f10040a;

    public o(LinkedHashMap linkedHashMap) {
        this.f10040a = linkedHashMap;
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final Object a(com.nimbusds.jose.shaded.gson.stream.b bVar) throws IOException {
        if (bVar.w() == 9) {
            bVar.s();
            return null;
        }
        Object objC = c();
        try {
            bVar.b();
            while (bVar.j()) {
                n nVar = (n) this.f10040a.get(bVar.q());
                if (nVar == null || !nVar.f10031e) {
                    bVar.C();
                } else {
                    e(objC, bVar, nVar);
                }
            }
            bVar.f();
            return d(objC);
        } catch (IllegalAccessException e10) {
            p264r5.a aVar = X5.c.f11002a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalStateException e11) {
            throw new com.nimbusds.jose.shaded.gson.p(10, e11);
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final void b(com.nimbusds.jose.shaded.gson.stream.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.i();
            return;
        }
        cVar.c();
        try {
            Iterator it = this.f10040a.values().iterator();
            while (it.hasNext()) {
                ((n) it.next()).a(cVar, obj);
            }
            cVar.f();
        } catch (IllegalAccessException e10) {
            p264r5.a aVar = X5.c.f11002a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, com.nimbusds.jose.shaded.gson.stream.b bVar, n nVar);
}
