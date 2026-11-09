package com.facebook.hermes.intl;

import Ab.r;
import U2.A;
import U2.AbstractC0610a;
import U2.B;
import U2.EnumC0614e;
import U2.f;
import U2.g;
import U2.h;
import U2.i;
import U2.j;
import U2.k;
import U2.l;
import U2.m;
import U2.n;
import U2.o;
import U2.p;
import U2.q;
import U2.z;
import com.adjust.sdk.Constants;
import com.facebook.proguard.annotations.DoNotStrip;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public class DateTimeFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f21359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ILocaleObject f21360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ILocaleObject f21361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f21365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f21366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f21367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f21368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f21369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f21370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f21371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f21372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f21373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f21374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f21375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f21376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f21377s;
    public final EnumC0614e t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n f21378u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f21379v;

    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    @DoNotStrip
    public DateTimeFormat(List<String> list, Map<String, Object> map) throws B {
        boolean z3;
        int i7;
        String defaultTimeZone;
        this.f21360b = null;
        this.f21361c = null;
        this.f21379v = null;
        r rVar = new r(6, false);
        rVar.f139b = null;
        this.f21359a = rVar;
        List listAsList = Arrays.asList("ca", "nu", "hc");
        if (!(map instanceof HashMap)) {
            throw new B("Invalid options object !", 0);
        }
        String[] strArr = {"weekday", "year", "month", "day"};
        boolean z8 = true;
        for (int i10 = 0; i10 < 4; i10++) {
            if (!(AbstractC0610a.c(strArr[i10], map) instanceof A)) {
                z8 = false;
            }
        }
        String[] strArr2 = {"hour", "minute", "second"};
        for (int i11 = 0; i11 < 3; i11++) {
            if (!(AbstractC0610a.c(strArr2[i11], map) instanceof A)) {
                z8 = false;
            }
        }
        if (AbstractC0610a.c("dateStyle", map) instanceof A) {
            z3 = AbstractC0610a.c("timeStyle", map) instanceof A ? z8 : false;
        }
        if (z3) {
            String[] strArr3 = {"year", "month", "day"};
            for (int i12 = 0; i12 < 3; i12++) {
                ((HashMap) map).put(strArr3[i12], "numeric");
            }
        }
        HashMap map2 = new HashMap();
        map2.put("localeMatcher", AbstractC0610a.d(map, "localeMatcher", 2, AbstractC0610a.f9116a, "best fit"));
        A a3 = AbstractC0610a.f9120e;
        Object objD = AbstractC0610a.d(map, "calendar", 2, a3, a3);
        if (!(objD instanceof A)) {
            String str = (String) objD;
            if (!AbstractC0610a.i(0, str.length() - 1, str, 3, 8)) {
                throw new B("Invalid calendar option !", 0);
            }
        }
        map2.put("ca", objD);
        Object objD2 = AbstractC0610a.d(map, "numberingSystem", 2, a3, a3);
        if (!(objD2 instanceof A)) {
            String str2 = (String) objD2;
            if (!AbstractC0610a.i(0, str2.length() - 1, str2, 3, 8)) {
                throw new B("Invalid numbering system !", 0);
            }
        }
        map2.put("nu", objD2);
        Object objD3 = AbstractC0610a.d(map, "hour12", 1, a3, a3);
        boolean z10 = objD3 instanceof A;
        map2.put("hc", z10 ? AbstractC0610a.d(map, "hourCycle", 2, new String[]{"h11", "h12", "h23", "h24"}, a3) : AbstractC0610a.f9121f);
        HashMap mapK = AbstractC0610a.k(list, map2, listAsList);
        ILocaleObject iLocaleObject = (ILocaleObject) mapK.get("locale");
        this.f21360b = iLocaleObject;
        this.f21361c = iLocaleObject.cloneObject();
        Object objC = AbstractC0610a.c("ca", mapK);
        boolean z11 = objC instanceof z;
        r rVar2 = this.f21359a;
        if (z11) {
            this.f21362d = true;
            this.f21363e = rVar2.getDefaultCalendarName(this.f21360b);
        } else {
            this.f21362d = false;
            this.f21363e = (String) objC;
        }
        Object objC2 = AbstractC0610a.c("nu", mapK);
        if (objC2 instanceof z) {
            i7 = 0;
            this.f21364f = true;
            this.f21365g = rVar2.getDefaultNumberingSystem(this.f21360b);
        } else {
            i7 = 0;
            this.f21364f = false;
            this.f21365g = (String) objC2;
        }
        Object objC3 = AbstractC0610a.c("hc", mapK);
        Object objC4 = AbstractC0610a.c(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, map);
        if (objC4 instanceof A) {
            defaultTimeZone = rVar2.getDefaultTimeZone(this.f21360b);
        } else {
            String string = objC4.toString();
            String[] availableIDs = TimeZone.getAvailableIDs();
            int length = availableIDs.length;
            while (true) {
                if (i7 >= length) {
                    throw new B("Invalid timezone name!", 0);
                }
                String str3 = availableIDs[i7];
                if (a(str3).equals(a(string))) {
                    defaultTimeZone = str3;
                    break;
                }
                i7++;
            }
        }
        this.f21379v = defaultTimeZone;
        this.f21368j = (h) AbstractC0610a.l(h.class, (String) AbstractC0610a.d(map, "formatMatcher", 2, new String[]{"basic", "best fit"}, "best fit"));
        this.f21369k = (p) AbstractC0610a.l(p.class, AbstractC0610a.d(map, "weekday", 2, new String[]{Constants.LONG, "short", "narrow"}, a3));
        this.f21370l = (g) AbstractC0610a.l(g.class, AbstractC0610a.d(map, "era", 2, new String[]{Constants.LONG, "short", "narrow"}, a3));
        this.f21371m = (q) AbstractC0610a.l(q.class, AbstractC0610a.d(map, "year", 2, new String[]{"numeric", "2-digit"}, a3));
        this.f21372n = (l) AbstractC0610a.l(l.class, AbstractC0610a.d(map, "month", 2, new String[]{"numeric", "2-digit", Constants.LONG, "short", "narrow"}, a3));
        this.f21373o = (f) AbstractC0610a.l(f.class, AbstractC0610a.d(map, "day", 2, new String[]{"numeric", "2-digit"}, a3));
        Object objD4 = AbstractC0610a.d(map, "hour", 2, new String[]{"numeric", "2-digit"}, a3);
        this.f21374p = (i) AbstractC0610a.l(i.class, objD4);
        this.f21375q = (k) AbstractC0610a.l(k.class, AbstractC0610a.d(map, "minute", 2, new String[]{"numeric", "2-digit"}, a3));
        this.f21376r = (m) AbstractC0610a.l(m.class, AbstractC0610a.d(map, "second", 2, new String[]{"numeric", "2-digit"}, a3));
        this.f21377s = (o) AbstractC0610a.l(o.class, AbstractC0610a.d(map, "timeZoneName", 2, new String[]{Constants.LONG, "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, a3));
        this.t = (EnumC0614e) AbstractC0610a.l(EnumC0614e.class, AbstractC0610a.d(map, "dateStyle", 2, new String[]{"full", Constants.LONG, "medium", "short"}, a3));
        Object objD5 = AbstractC0610a.d(map, "timeStyle", 2, new String[]{"full", Constants.LONG, "medium", "short"}, a3);
        this.f21378u = (n) AbstractC0610a.l(n.class, objD5);
        if ((objD4 instanceof A) && (objD5 instanceof A)) {
            this.f21367i = j.f9145e;
        } else {
            j defaultHourCycle = rVar2.getDefaultHourCycle(this.f21360b);
            j jVar = objC3 instanceof z ? defaultHourCycle : (j) AbstractC0610a.l(j.class, objC3);
            if (!z10) {
                boolean zBooleanValue = ((Boolean) objD3).booleanValue();
                j jVar2 = j.f9143c;
                j jVar3 = j.f9141a;
                jVar = zBooleanValue ? (defaultHourCycle == jVar3 || defaultHourCycle == jVar2) ? jVar3 : j.f9142b : (defaultHourCycle == jVar3 || defaultHourCycle == jVar2) ? jVar2 : j.f9144d;
            }
            this.f21367i = jVar;
        }
        this.f21366h = objD3;
        this.f21359a.configure(this.f21360b, this.f21362d ? "" : this.f21363e, this.f21364f ? "" : this.f21365g, this.f21368j, this.f21369k, this.f21370l, this.f21371m, this.f21372n, this.f21373o, this.f21374p, this.f21375q, this.f21376r, this.f21377s, this.f21367i, this.f21379v, this.t, this.f21378u, objD3);
    }

    public static String a(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < 'A' || cCharAt > 'Z') {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt + ' '));
            }
        }
        return sb2.toString();
    }

    @DoNotStrip
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws B {
        String str = (String) AbstractC0610a.d(map, "localeMatcher", 2, AbstractC0610a.f9116a, "best fit");
        String[] strArr = new String[list.size()];
        return str.equals("best fit") ? Arrays.asList(AbstractC0610a.f((String[]) list.toArray(strArr))) : Arrays.asList(AbstractC0610a.j((String[]) list.toArray(strArr)));
    }

    @DoNotStrip
    public String format(double d2) throws B {
        return this.f21359a.format(d2);
    }

    @DoNotStrip
    public List<Map<String, String>> formatToParts(double d2) throws B {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f21359a;
        AttributedCharacterIterator toParts = rVar.formatToParts(d2);
        StringBuilder sb2 = new StringBuilder();
        for (char cFirst = toParts.first(); cFirst != 65535; cFirst = toParts.next()) {
            sb2.append(cFirst);
            if (toParts.getIndex() + 1 == toParts.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = toParts.getAttributes().keySet().iterator();
                String strFieldToString = it.hasNext() ? rVar.fieldToString(it.next(), sb2.toString()) : "literal";
                String string = sb2.toString();
                sb2.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strFieldToString);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @DoNotStrip
    public Map<String, Object> resolvedOptions() throws B {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f21361c.toCanonicalTag());
        linkedHashMap.put("numberingSystem", this.f21365g);
        linkedHashMap.put("calendar", this.f21363e);
        linkedHashMap.put(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, this.f21379v);
        j jVar = this.f21367i;
        if (jVar != j.f9145e) {
            linkedHashMap.put("hourCycle", jVar.toString());
            j jVar2 = this.f21367i;
            if (jVar2 == j.f9141a || jVar2 == j.f9142b) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        p pVar = this.f21369k;
        if (pVar != p.f9157a) {
            linkedHashMap.put("weekday", pVar.toString());
        }
        g gVar = this.f21370l;
        if (gVar != g.f9136a) {
            linkedHashMap.put("era", gVar.toString());
        }
        q qVar = this.f21371m;
        if (qVar != q.f9159a) {
            linkedHashMap.put("year", qVar.toString());
        }
        l lVar = this.f21372n;
        if (lVar != l.f9149a) {
            linkedHashMap.put("month", lVar.toString());
        }
        f fVar = this.f21373o;
        if (fVar != f.f9134a) {
            linkedHashMap.put("day", fVar.toString());
        }
        i iVar = this.f21374p;
        if (iVar != i.f9139a) {
            linkedHashMap.put("hour", iVar.toString());
        }
        k kVar = this.f21375q;
        if (kVar != k.f9147a) {
            linkedHashMap.put("minute", kVar.toString());
        }
        m mVar = this.f21376r;
        if (mVar != m.f9151a) {
            linkedHashMap.put("second", mVar.toString());
        }
        o oVar = this.f21377s;
        if (oVar != o.f9155a) {
            linkedHashMap.put("timeZoneName", oVar.toString());
        }
        EnumC0614e enumC0614e = this.t;
        if (enumC0614e != EnumC0614e.f9132a) {
            linkedHashMap.put("dateStyle", enumC0614e.toString());
        }
        n nVar = this.f21378u;
        if (nVar != n.f9153a) {
            linkedHashMap.put("timeStyle", nVar.toString());
        }
        return linkedHashMap;
    }
}
