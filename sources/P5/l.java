package P5;

import N8.q0;
import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Set f6988B;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f6989A;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        f6988B = Collections.unmodifiableSet(hashSet);
    }

    public l(k kVar, f fVar, String str, HashSet hashSet, URI uri, T5.d dVar, URI uri2, Z5.b bVar, Z5.b bVar2, LinkedList linkedList, String str2, boolean z3, HashMap map, Z5.b bVar3) {
        super(kVar, fVar, str, hashSet, uri, dVar, uri2, bVar, bVar2, linkedList, str2, map, bVar3);
        if (kVar == null) {
            throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
        }
        if (kVar.f6936a.equals(a.f6935b.f6936a)) {
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
        this.f6989A = z3;
    }

    public static l a(Z5.b bVar) throws ParseException {
        a kVar;
        String str;
        T5.d kVar2;
        ArrayList arrayList;
        List list;
        Map mapG = Z5.c.g(20000, new String(bVar.a(), Z5.e.f11524a));
        String str2 = "alg";
        String strD = Z5.c.d("alg", mapG);
        if (strD == null) {
            throw new ParseException("Missing \"alg\" in header JSON object", 0);
        }
        a aVar = a.f6935b;
        if (strD.equals(aVar.f6936a)) {
            kVar = aVar;
        } else if (mapG.containsKey("enc")) {
            kVar = g.f6963c;
            if (!strD.equals(kVar.f6936a)) {
                kVar = g.f6964d;
                if (!strD.equals(kVar.f6936a)) {
                    kVar = g.f6965e;
                    if (!strD.equals(kVar.f6936a)) {
                        kVar = g.f6966f;
                        if (!strD.equals(kVar.f6936a)) {
                            kVar = g.f6967g;
                            if (!strD.equals(kVar.f6936a)) {
                                kVar = g.f6968i;
                                if (!strD.equals(kVar.f6936a)) {
                                    kVar = g.f6969j;
                                    if (!strD.equals(kVar.f6936a)) {
                                        kVar = g.f6971o;
                                        if (!strD.equals(kVar.f6936a)) {
                                            kVar = g.f6972p;
                                            if (!strD.equals(kVar.f6936a)) {
                                                kVar = g.t;
                                                if (!strD.equals(kVar.f6936a)) {
                                                    kVar = g.f6973v;
                                                    if (!strD.equals(kVar.f6936a)) {
                                                        kVar = g.f6974w;
                                                        if (!strD.equals(kVar.f6936a)) {
                                                            kVar = g.f6953A;
                                                            if (!strD.equals(kVar.f6936a)) {
                                                                kVar = g.f6954B;
                                                                if (!strD.equals(kVar.f6936a)) {
                                                                    kVar = g.f6955C;
                                                                    if (!strD.equals(kVar.f6936a)) {
                                                                        kVar = g.f6956H;
                                                                        if (!strD.equals(kVar.f6936a)) {
                                                                            kVar = g.f6957L;
                                                                            if (!strD.equals(kVar.f6936a)) {
                                                                                kVar = g.f6958M;
                                                                                if (!strD.equals(kVar.f6936a)) {
                                                                                    kVar = g.f6959Q;
                                                                                    if (!strD.equals(kVar.f6936a)) {
                                                                                        kVar = g.f6960X;
                                                                                        if (!strD.equals(kVar.f6936a)) {
                                                                                            kVar = g.f6961Y;
                                                                                            if (!strD.equals(kVar.f6936a)) {
                                                                                                kVar = g.f6962Z;
                                                                                                if (!strD.equals(kVar.f6936a)) {
                                                                                                    kVar = g.f6970k0;
                                                                                                    if (!strD.equals(kVar.f6936a)) {
                                                                                                        kVar = new g(strD);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            kVar = k.f6977c;
            if (!strD.equals(kVar.f6936a)) {
                kVar = k.f6978d;
                if (!strD.equals(kVar.f6936a)) {
                    kVar = k.f6979e;
                    if (!strD.equals(kVar.f6936a)) {
                        kVar = k.f6980f;
                        if (!strD.equals(kVar.f6936a)) {
                            kVar = k.f6981g;
                            if (!strD.equals(kVar.f6936a)) {
                                kVar = k.f6982i;
                                if (!strD.equals(kVar.f6936a)) {
                                    kVar = k.f6983j;
                                    if (!strD.equals(kVar.f6936a)) {
                                        kVar = k.f6984o;
                                        if (!strD.equals(kVar.f6936a)) {
                                            kVar = k.f6985p;
                                            if (!strD.equals(kVar.f6936a)) {
                                                kVar = k.t;
                                                if (!strD.equals(kVar.f6936a)) {
                                                    kVar = k.f6986v;
                                                    if (!strD.equals(kVar.f6936a)) {
                                                        kVar = k.f6987w;
                                                        if (!strD.equals(kVar.f6936a)) {
                                                            kVar = k.f6975A;
                                                            if (!strD.equals(kVar.f6936a)) {
                                                                kVar = k.f6976B;
                                                                if (!strD.equals(kVar.f6936a)) {
                                                                    kVar = new k(strD);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!(kVar instanceof k)) {
            throw new ParseException("Not a JWS header", 0);
        }
        k kVar3 = (k) kVar;
        if (kVar3.f6936a.equals(aVar.f6936a)) {
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
        Iterator it = mapG.keySet().iterator();
        boolean zBooleanValue = true;
        f fVar = null;
        String str3 = null;
        HashSet hashSet = null;
        URI uriF = null;
        T5.d dVar = null;
        URI uriF2 = null;
        Z5.b bVar2 = null;
        Z5.b bVar3 = null;
        LinkedList linkedListJ = null;
        String str4 = null;
        HashMap map = null;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (!str2.equals(str5)) {
                if ("typ".equals(str5)) {
                    String str6 = (String) Z5.c.b(mapG, str5, String.class);
                    if (str6 != null) {
                        fVar = new f(str6);
                    }
                } else if ("cty".equals(str5)) {
                    str3 = (String) Z5.c.b(mapG, str5, String.class);
                } else if ("crit".equals(str5)) {
                    List listE = Z5.c.e(str5, mapG);
                    if (listE != null) {
                        hashSet = new HashSet(listE);
                    }
                } else if ("jku".equals(str5)) {
                    uriF = Z5.c.f(str5, mapG);
                } else {
                    f fVar2 = fVar;
                    if ("jwk".equals(str5)) {
                        Map map2 = (Map) Z5.c.b(mapG, str5, Map.class);
                        if (map2 == null) {
                            map2 = null;
                        } else {
                            Iterator it2 = map2.keySet().iterator();
                            while (it2.hasNext()) {
                                String str7 = str3;
                                if (!(it2.next() instanceof String)) {
                                    throw new ParseException(q0.k("JSON object member with key ", str5, " not a JSON object"), 0);
                                }
                                str3 = str7;
                            }
                        }
                        str = str3;
                        if (map2 == null) {
                            dVar = null;
                        } else {
                            String str8 = (String) Z5.c.b(map2, "kty", String.class);
                            if (str8 == null) {
                                throw new ParseException("Missing key type \"kty\" parameter", 0);
                            }
                            T5.h hVarA = T5.h.a(str8);
                            T5.h hVar = T5.h.f8998b;
                            if (hVarA == hVar) {
                                Set set = T5.b.f8969H;
                                if (!hVar.equals(p377z5.l.w(map2))) {
                                    throw new ParseException("The key type \"kty\" must be EC", 0);
                                }
                                try {
                                    T5.a aVarA = T5.a.a((String) Z5.c.b(map2, "crv", String.class));
                                    Z5.b bVarA = Z5.c.a("x", map2);
                                    Z5.b bVarA2 = Z5.c.a("y", map2);
                                    Z5.b bVarA3 = Z5.c.a("d", map2);
                                    if (bVarA3 == null) {
                                        try {
                                            kVar2 = new T5.b(aVarA, bVarA, bVarA2, p377z5.l.x(map2), p377z5.l.v(map2), p377z5.l.s(map2), (String) Z5.c.b(map2, "kid", String.class), Z5.c.f("x5u", map2), Z5.c.a("x5t", map2), Z5.c.a("x5t#S256", map2), p377z5.l.z(map2), p377z5.l.t(map2), p377z5.l.y(map2), p377z5.l.u(map2));
                                        } catch (IllegalArgumentException e10) {
                                            throw new ParseException(e10.getMessage(), 0);
                                        }
                                    } else {
                                        kVar2 = new T5.b(aVarA, bVarA, bVarA2, bVarA3, p377z5.l.x(map2), p377z5.l.v(map2), p377z5.l.s(map2), (String) Z5.c.b(map2, "kid", String.class), Z5.c.f("x5u", map2), Z5.c.a("x5t", map2), Z5.c.a("x5t#S256", map2), p377z5.l.z(map2), p377z5.l.t(map2), p377z5.l.y(map2), p377z5.l.u(map2));
                                    }
                                } catch (IllegalArgumentException e11) {
                                    throw new ParseException(e11.getMessage(), 0);
                                }
                            } else {
                                T5.h hVar2 = T5.h.f8999c;
                                if (hVarA != hVar2) {
                                    T5.h hVar3 = T5.h.f9000d;
                                    if (hVarA != hVar3) {
                                        T5.h hVar4 = T5.h.f9001e;
                                        if (hVarA != hVar4) {
                                            throw new ParseException("Unsupported key type \"kty\" parameter: " + hVarA, 0);
                                        }
                                        Set set2 = T5.k.f9007L;
                                        if (!hVar4.equals(p377z5.l.w(map2))) {
                                            throw new ParseException("The key type kty must be " + hVar4.f9002a, 0);
                                        }
                                        try {
                                            T5.a aVarA2 = T5.a.a((String) Z5.c.b(map2, "crv", String.class));
                                            Z5.b bVarA4 = Z5.c.a("x", map2);
                                            Z5.b bVarA5 = Z5.c.a("d", map2);
                                            if (bVarA5 == null) {
                                                try {
                                                    kVar2 = new T5.k(aVarA2, bVarA4, p377z5.l.x(map2), p377z5.l.v(map2), p377z5.l.s(map2), (String) Z5.c.b(map2, "kid", String.class), Z5.c.f("x5u", map2), Z5.c.a("x5t", map2), Z5.c.a("x5t#S256", map2), p377z5.l.z(map2), p377z5.l.t(map2), p377z5.l.y(map2), p377z5.l.u(map2));
                                                } catch (IllegalArgumentException e12) {
                                                    throw new ParseException(e12.getMessage(), 0);
                                                }
                                            } else {
                                                kVar2 = new T5.k(aVarA2, bVarA4, bVarA5, p377z5.l.x(map2), p377z5.l.v(map2), p377z5.l.s(map2), (String) Z5.c.b(map2, "kid", String.class), Z5.c.f("x5u", map2), Z5.c.a("x5t", map2), Z5.c.a("x5t#S256", map2), p377z5.l.z(map2), p377z5.l.t(map2), p377z5.l.y(map2), p377z5.l.u(map2));
                                            }
                                        } catch (IllegalArgumentException e13) {
                                            throw new ParseException(e13.getMessage(), 0);
                                        }
                                    } else {
                                        if (!hVar3.equals(p377z5.l.w(map2))) {
                                            throw new ParseException("The key type kty must be " + hVar3.f9002a, 0);
                                        }
                                        try {
                                            kVar2 = new T5.l(Z5.c.a("k", map2), p377z5.l.x(map2), p377z5.l.v(map2), p377z5.l.s(map2), (String) Z5.c.b(map2, "kid", String.class), Z5.c.f("x5u", map2), Z5.c.a("x5t", map2), Z5.c.a("x5t#S256", map2), p377z5.l.z(map2), p377z5.l.t(map2), p377z5.l.y(map2), p377z5.l.u(map2));
                                        } catch (IllegalArgumentException e14) {
                                            throw new ParseException(e14.getMessage(), 0);
                                        }
                                    }
                                } else {
                                    if (!hVar2.equals(p377z5.l.w(map2))) {
                                        throw new ParseException("The key type \"kty\" must be RSA", 0);
                                    }
                                    Z5.b bVarA6 = Z5.c.a("n", map2);
                                    Z5.b bVarA7 = Z5.c.a("e", map2);
                                    Z5.b bVarA8 = Z5.c.a("d", map2);
                                    Z5.b bVarA9 = Z5.c.a("p", map2);
                                    Z5.b bVarA10 = Z5.c.a("q", map2);
                                    Z5.b bVarA11 = Z5.c.a("dp", map2);
                                    Z5.b bVarA12 = Z5.c.a("dq", map2);
                                    Z5.b bVarA13 = Z5.c.a("qi", map2);
                                    if (!map2.containsKey("oth") || (list = (List) Z5.c.b(map2, "oth", List.class)) == null) {
                                        arrayList = null;
                                    } else {
                                        ArrayList arrayList2 = new ArrayList(list.size());
                                        for (Iterator it3 = list.iterator(); it3.hasNext(); it3 = it3) {
                                            Object next = it3.next();
                                            if (next instanceof Map) {
                                                Map map3 = (Map) next;
                                                try {
                                                    arrayList2.add(new T5.m(Z5.c.a("r", map3), Z5.c.a("dq", map3), Z5.c.a("t", map3)));
                                                } catch (IllegalArgumentException e15) {
                                                    throw new ParseException(e15.getMessage(), 0);
                                                }
                                            }
                                        }
                                        arrayList = arrayList2;
                                    }
                                    try {
                                        kVar2 = new T5.n(bVarA6, bVarA7, bVarA8, bVarA9, bVarA10, bVarA11, bVarA12, bVarA13, arrayList, p377z5.l.x(map2), p377z5.l.v(map2), p377z5.l.s(map2), (String) Z5.c.b(map2, "kid", String.class), Z5.c.f("x5u", map2), Z5.c.a("x5t", map2), Z5.c.a("x5t#S256", map2), p377z5.l.z(map2), p377z5.l.t(map2), p377z5.l.y(map2), p377z5.l.u(map2));
                                    } catch (IllegalArgumentException e16) {
                                        throw new ParseException(e16.getMessage(), 0);
                                    }
                                }
                            }
                            if (kVar2.b()) {
                                throw new ParseException("Non-public key in jwk header parameter", 0);
                            }
                            dVar = kVar2;
                        }
                        if (dVar != null && dVar.b()) {
                            throw new IllegalArgumentException("The JWK must be public");
                        }
                    } else {
                        str = str3;
                        hashSet = hashSet;
                        uriF = uriF;
                        if ("x5u".equals(str5)) {
                            uriF2 = Z5.c.f(str5, mapG);
                        } else if ("x5t".equals(str5)) {
                            String str9 = (String) Z5.c.b(mapG, str5, String.class);
                            bVar2 = str9 == null ? null : new Z5.b(str9);
                        } else if ("x5t#S256".equals(str5)) {
                            String str10 = (String) Z5.c.b(mapG, str5, String.class);
                            bVar3 = str10 == null ? null : new Z5.b(str10);
                        } else if ("x5c".equals(str5)) {
                            linkedListJ = p118hf.a.J((List) Z5.c.b(mapG, str5, List.class));
                        } else if ("kid".equals(str5)) {
                            str4 = (String) Z5.c.b(mapG, str5, String.class);
                        } else if ("b64".equals(str5)) {
                            Boolean bool = (Boolean) Z5.c.b(mapG, str5, Boolean.class);
                            if (bool == null) {
                                throw new ParseException(q0.k("JSON object member with key ", str5, " is missing or null"), 0);
                            }
                            zBooleanValue = bool.booleanValue();
                        } else {
                            Object obj = mapG.get(str5);
                            if (f6988B.contains(str5)) {
                                throw new IllegalArgumentException(q0.k("The parameter name \"", str5, "\" matches a registered name"));
                            }
                            if (map == null) {
                                map = new HashMap();
                            }
                            HashMap map4 = map;
                            map4.put(str5, obj);
                            map = map4;
                        }
                    }
                    hashSet = hashSet;
                    fVar = fVar2;
                    str3 = str;
                    uriF = uriF;
                }
            }
            str2 = str2;
            it = it;
            kVar3 = kVar3;
        }
        return new l(kVar3, fVar, str3, hashSet, uriF, dVar, uriF2, bVar2, bVar3, linkedListJ, str4, zBooleanValue, map, bVar);
    }
}
