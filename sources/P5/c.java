package P5;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map f6943g = Collections.unmodifiableMap(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f6944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f6945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f6947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f6948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Z5.b f6949f;

    public c(k kVar, f fVar, String str, HashSet hashSet, HashMap map, Z5.b bVar) {
        this.f6944a = kVar;
        this.f6945b = fVar;
        this.f6946c = str;
        if (hashSet != null) {
            this.f6947d = Collections.unmodifiableSet(new HashSet(hashSet));
        } else {
            this.f6947d = null;
        }
        if (map != null) {
            this.f6948e = Collections.unmodifiableMap(new HashMap(map));
        } else {
            this.f6948e = f6943g;
        }
        this.f6949f = bVar;
    }

    public final String toString() {
        l lVar = (l) this;
        com.nimbusds.jose.shaded.gson.m mVar = Z5.c.f11523a;
        HashMap map = new HashMap();
        map.putAll(lVar.f6948e);
        k kVar = lVar.f6944a;
        if (kVar != null) {
            map.put("alg", kVar.f6936a);
        }
        f fVar = lVar.f6945b;
        if (fVar != null) {
            map.put("typ", fVar.f6952a);
        }
        String str = lVar.f6946c;
        if (str != null) {
            map.put("cty", str);
        }
        Set set = lVar.f6947d;
        if (set != null && !set.isEmpty()) {
            map.put("crit", new ArrayList(set));
        }
        URI uri = lVar.f6937i;
        if (uri != null) {
            map.put("jku", uri.toString());
        }
        T5.d dVar = lVar.f6938j;
        if (dVar != null) {
            map.put("jwk", dVar.c());
        }
        URI uri2 = lVar.f6939o;
        if (uri2 != null) {
            map.put("x5u", uri2.toString());
        }
        Z5.b bVar = lVar.f6940p;
        if (bVar != null) {
            map.put("x5t", bVar.f11522a);
        }
        Z5.b bVar2 = lVar.t;
        if (bVar2 != null) {
            map.put("x5t#S256", bVar2.f11522a);
        }
        List list = lVar.f6941v;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Z5.a) it.next()).f11522a);
            }
            map.put("x5c", arrayList);
        }
        String str2 = lVar.f6942w;
        if (str2 != null) {
            map.put("kid", str2);
        }
        if (!lVar.f6989A) {
            map.put("b64", Boolean.FALSE);
        }
        return Z5.c.h(map);
    }
}
