package T5;

import C0.G;
import java.io.Serializable;
import java.net.URI;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f8978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f8979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f8980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P5.a f8981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final URI f8983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Z5.b f8984g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Z5.b f8985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedList f8986j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Date f8987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Date f8988p;
    public final Date t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedList f8989v;

    public d(h hVar, i iVar, LinkedHashSet linkedHashSet, P5.a aVar, String str, URI uri, Z5.b bVar, Z5.b bVar2, LinkedList linkedList, Date date, Date date2, Date date3) {
        X509Certificate x509CertificateY;
        if (hVar == null) {
            throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
        }
        this.f8978a = hVar;
        Map map = j.f9006a;
        if (iVar != null && linkedHashSet != null) {
            Map map2 = j.f9006a;
            if (map2.containsKey(iVar) && !((Set) map2.get(iVar)).containsAll(linkedHashSet)) {
                throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
            }
        }
        this.f8979b = iVar;
        this.f8980c = linkedHashSet;
        this.f8981d = aVar;
        this.f8982e = str;
        this.f8983f = uri;
        this.f8984g = bVar;
        this.f8985i = bVar2;
        if (linkedList != null && linkedList.isEmpty()) {
            throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
        }
        this.f8986j = linkedList;
        LinkedList linkedList2 = null;
        if (linkedList != null) {
            try {
                LinkedList linkedList3 = new LinkedList();
                for (int i7 = 0; i7 < linkedList.size(); i7++) {
                    if (linkedList.get(i7) != null) {
                        try {
                            x509CertificateY = D3.a.y(((Z5.a) linkedList.get(i7)).a());
                        } catch (CertificateException unused) {
                            x509CertificateY = null;
                        }
                        if (x509CertificateY == null) {
                            throw new ParseException(G.m(i7, "Invalid X.509 certificate at position "), 0);
                        }
                        linkedList3.add(x509CertificateY);
                    }
                }
                linkedList2 = linkedList3;
            } catch (ParseException e10) {
                throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e10.getMessage(), e10);
            }
        }
        this.f8989v = linkedList2;
        this.f8987o = date;
        this.f8988p = date2;
        this.t = date3;
    }

    public final List a() {
        LinkedList linkedList = this.f8989v;
        if (linkedList == null) {
            return null;
        }
        return Collections.unmodifiableList(linkedList);
    }

    public abstract boolean b();

    public HashMap c() {
        com.nimbusds.jose.shaded.gson.m mVar = Z5.c.f11523a;
        HashMap map = new HashMap();
        map.put("kty", this.f8978a.f9002a);
        i iVar = this.f8979b;
        if (iVar != null) {
            map.put("use", iVar.f9005a);
        }
        LinkedHashSet linkedHashSet = this.f8980c;
        if (linkedHashSet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((g) it.next()).f8997a);
            }
            map.put("key_ops", arrayList);
        }
        P5.a aVar = this.f8981d;
        if (aVar != null) {
            map.put("alg", aVar.f6936a);
        }
        String str = this.f8982e;
        if (str != null) {
            map.put("kid", str);
        }
        URI uri = this.f8983f;
        if (uri != null) {
            map.put("x5u", uri.toString());
        }
        Z5.b bVar = this.f8984g;
        if (bVar != null) {
            map.put("x5t", bVar.f11522a);
        }
        Z5.b bVar2 = this.f8985i;
        if (bVar2 != null) {
            map.put("x5t#S256", bVar2.f11522a);
        }
        LinkedList linkedList = this.f8986j;
        if (linkedList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Z5.a) it2.next()).f11522a);
            }
            map.put("x5c", arrayList2);
        }
        Date date = this.f8987o;
        if (date != null) {
            map.put("exp", Long.valueOf(date.getTime() / 1000));
        }
        Date date2 = this.f8988p;
        if (date2 != null) {
            map.put("nbf", Long.valueOf(date2.getTime() / 1000));
        }
        Date date3 = this.t;
        if (date3 != null) {
            map.put("iat", Long.valueOf(date3.getTime() / 1000));
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f8978a, dVar.f8978a) && Objects.equals(this.f8979b, dVar.f8979b) && Objects.equals(this.f8980c, dVar.f8980c) && Objects.equals(this.f8981d, dVar.f8981d) && Objects.equals(this.f8982e, dVar.f8982e) && Objects.equals(this.f8983f, dVar.f8983f) && Objects.equals(this.f8984g, dVar.f8984g) && Objects.equals(this.f8985i, dVar.f8985i) && Objects.equals(this.f8986j, dVar.f8986j) && Objects.equals(this.f8987o, dVar.f8987o) && Objects.equals(this.f8988p, dVar.f8988p) && Objects.equals(this.t, dVar.t);
    }

    public int hashCode() {
        Date date = this.t;
        return Objects.hash(this.f8978a, this.f8979b, this.f8980c, this.f8981d, this.f8982e, this.f8983f, this.f8984g, this.f8985i, this.f8986j, this.f8987o, this.f8988p, date, null);
    }

    public final String toString() {
        return Z5.c.h(c());
    }
}
