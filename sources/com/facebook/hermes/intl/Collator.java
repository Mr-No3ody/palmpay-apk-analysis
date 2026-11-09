package com.facebook.hermes.intl;

import U2.A;
import U2.AbstractC0610a;
import U2.B;
import U2.E;
import U2.EnumC0611b;
import U2.EnumC0612c;
import U2.EnumC0613d;
import U2.z;
import android.icu.text.RuleBasedCollator;
import com.facebook.proguard.annotations.DoNotStrip;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public class Collator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0613d f21350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0612c f21351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EnumC0611b f21355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ILocaleObject f21356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ILocaleObject f21357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2085k0 f21358i;

    @DoNotStrip
    public Collator(List<String> list, Map<String, Object> map) throws B {
        Object obj = GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT;
        this.f21353d = GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT;
        C2085k0 c2085k0 = new C2085k0(8, false);
        c2085k0.f42878b = null;
        this.f21358i = c2085k0;
        this.f21350a = (EnumC0613d) AbstractC0610a.l(EnumC0613d.class, (String) AbstractC0610a.d(map, "usage", 2, AbstractC0610a.f9119d, "sort"));
        HashMap map2 = new HashMap();
        map2.put("localeMatcher", AbstractC0610a.d(map, "localeMatcher", 2, AbstractC0610a.f9116a, "best fit"));
        A a3 = AbstractC0610a.f9120e;
        Object objD = AbstractC0610a.d(map, "numeric", 1, a3, a3);
        map2.put("kn", objD instanceof A ? objD : String.valueOf(((Boolean) objD).booleanValue()));
        map2.put("kf", AbstractC0610a.d(map, "caseFirst", 2, AbstractC0610a.f9118c, a3));
        HashMap mapK = AbstractC0610a.k(list, map2, Arrays.asList("co", "kf", "kn"));
        ILocaleObject iLocaleObject = (ILocaleObject) mapK.get("locale");
        this.f21356g = iLocaleObject;
        this.f21357h = iLocaleObject.cloneObject();
        Object objC = AbstractC0610a.c("co", mapK);
        this.f21353d = (String) (objC instanceof z ? obj : objC);
        Object objC2 = AbstractC0610a.c("kn", mapK);
        if (objC2 instanceof z) {
            this.f21354e = false;
        } else {
            this.f21354e = Boolean.parseBoolean((String) objC2);
        }
        String strC = AbstractC0610a.c("kf", mapK);
        this.f21355f = (EnumC0611b) AbstractC0610a.l(EnumC0611b.class, (String) (strC instanceof z ? "false" : strC));
        if (this.f21350a == EnumC0613d.f9130b) {
            ArrayList<String> unicodeExtensions = this.f21356g.getUnicodeExtensions("collation");
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it = unicodeExtensions.iterator();
            while (it.hasNext()) {
                arrayList.add(E.b(it.next()));
            }
            arrayList.add(E.b(FirebaseAnalytics.Event.SEARCH));
            this.f21356g.setUnicodeExtensions("co", arrayList);
        }
        Object objD2 = AbstractC0610a.d(map, "sensitivity", 2, AbstractC0610a.f9117b, a3);
        if (!(objD2 instanceof A)) {
            this.f21351b = (EnumC0612c) AbstractC0610a.l(EnumC0612c.class, (String) objD2);
        } else if (this.f21350a == EnumC0613d.f9129a) {
            this.f21351b = EnumC0612c.f9126d;
        } else {
            this.f21351b = EnumC0612c.f9127e;
        }
        this.f21352c = ((Boolean) AbstractC0610a.d(map, "ignorePunctuation", 1, a3, Boolean.FALSE)).booleanValue();
        C2085k0 c2085k1 = this.f21358i;
        c2085k1.configure(this.f21356g);
        c2085k1.setNumericAttribute(this.f21354e);
        c2085k1.setCaseFirstAttribute(this.f21355f);
        c2085k1.setSensitivity(this.f21351b);
        c2085k1.setIgnorePunctuation(this.f21352c);
    }

    @DoNotStrip
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws B {
        return ((String) AbstractC0610a.d(map, "localeMatcher", 2, AbstractC0610a.f9116a, "best fit")).equals("best fit") ? Arrays.asList(AbstractC0610a.f((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(AbstractC0610a.j((String[]) list.toArray(new String[list.size()])));
    }

    @DoNotStrip
    public double compare(String str, String str2) {
        return ((RuleBasedCollator) this.f21358i.f42878b).compare(str, str2);
    }

    @DoNotStrip
    public Map<String, Object> resolvedOptions() throws B {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f21357h.toCanonicalTag().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f21350a.toString());
        EnumC0612c enumC0612c = this.f21351b;
        if (enumC0612c == EnumC0612c.f9127e) {
            linkedHashMap.put("sensitivity", this.f21358i.getSensitivity().toString());
        } else {
            linkedHashMap.put("sensitivity", enumC0612c.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f21352c));
        linkedHashMap.put("collation", this.f21353d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f21354e));
        linkedHashMap.put("caseFirst", this.f21355f.toString());
        return linkedHashMap;
    }
}
