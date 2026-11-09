package com.facebook.hermes.intl;

import N2.a;
import U2.A;
import U2.AbstractC0610a;
import U2.B;
import U2.r;
import U2.s;
import U2.t;
import U2.u;
import U2.v;
import U2.w;
import U2.x;
import U2.y;
import U2.z;
import android.icu.util.Currency;
import com.adjust.sdk.Constants;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public class NumberFormat {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f21380v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f21381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f21383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f21384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f21386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f21390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f21391k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f21392l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v f21393m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w f21394n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f21395o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f21396p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f21397q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f21398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f21399s;
    public final ILocaleObject t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ILocaleObject f21400u;

    /* JADX WARN: Code duplicated, block: B:42:0x0177  */
    /* JADX WARN: Code duplicated, block: B:43:0x0198 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x019a  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0313  */
    /* JADX WARN: Code duplicated, block: B:87:0x035c  */
    /* JADX WARN: Code duplicated, block: B:90:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:92:0x03a4  */
    @DoNotStrip
    public NumberFormat(List<String> list, Map<String, Object> map) throws B {
        int i7;
        Object objD;
        x xVar;
        Double dValueOf;
        Double dValueOf2;
        Object objC;
        Object objC2;
        boolean z3;
        u uVar;
        Object objD2;
        String str;
        this.f21382b = null;
        this.f21383c = s.f9163a;
        this.f21384d = t.f9166a;
        this.f21385e = null;
        this.f21387g = true;
        this.f21388h = -1;
        this.f21389i = -1;
        this.f21390j = -1;
        this.f21391k = -1;
        this.f21392l = -1;
        this.f21394n = w.f9177a;
        this.f21397q = null;
        this.f21398r = null;
        this.t = null;
        this.f21400u = null;
        a aVar = new a();
        this.f21395o = aVar;
        HashMap map2 = new HashMap();
        map2.put("localeMatcher", AbstractC0610a.d(map, "localeMatcher", 2, AbstractC0610a.f9116a, "best fit"));
        A a3 = AbstractC0610a.f9120e;
        Object objD3 = AbstractC0610a.d(map, "numberingSystem", 2, a3, a3);
        if (!(objD3 instanceof A)) {
            String str2 = (String) objD3;
            if (!AbstractC0610a.i(0, str2.length() - 1, str2, 3, 8)) {
                throw new B("Invalid numbering system !", 0);
            }
        }
        map2.put("nu", objD3);
        HashMap mapK = AbstractC0610a.k(list, map2, Collections.singletonList("nu"));
        ILocaleObject iLocaleObject = (ILocaleObject) mapK.get("locale");
        this.t = iLocaleObject;
        this.f21400u = iLocaleObject.cloneObject();
        Object objC3 = AbstractC0610a.c("nu", mapK);
        if (objC3 instanceof z) {
            this.f21396p = true;
            this.f21397q = aVar.getDefaultNumberingSystem(this.t);
        } else {
            this.f21396p = false;
            this.f21397q = (String) objC3;
        }
        this.f21381a = (x) AbstractC0610a.l(x.class, (String) AbstractC0610a.d(map, "style", 2, new String[]{"decimal", "percent", FirebaseAnalytics.Param.CURRENCY, "unit"}, "decimal"));
        Object objD4 = AbstractC0610a.d(map, FirebaseAnalytics.Param.CURRENCY, 2, a3, a3);
        boolean z8 = objD4 instanceof A;
        x xVar2 = x.f9181c;
        if (z8) {
            if (this.f21381a == xVar2) {
                throw new B("Expected currency style !", 0);
            }
        } else if (!a((String) objD4).matches("^[A-Z][A-Z][A-Z]$")) {
            throw new B("Malformed currency code !", 0);
        }
        Object objD5 = AbstractC0610a.d(map, "currencyDisplay", 2, new String[]{"symbol", "narrowSymbol", "code", "name"}, "symbol");
        Object objD6 = AbstractC0610a.d(map, "currencySign", 2, new String[]{"accounting", "standard"}, "standard");
        Object objD7 = AbstractC0610a.d(map, "unit", 2, a3, a3);
        boolean z10 = objD7 instanceof A;
        x xVar3 = x.f9182d;
        if (!z10) {
            String str3 = (String) objD7;
            String[] strArr = f21380v;
            if (Arrays.binarySearch(strArr, str3) < 0) {
                i7 = 5;
                int iIndexOf = str3.indexOf("-per-");
                if (iIndexOf < 0 || str3.indexOf("-per-", iIndexOf + 1) >= 0 || Arrays.binarySearch(strArr, str3.substring(0, iIndexOf)) < 0 || Arrays.binarySearch(strArr, str3.substring(iIndexOf + 5)) < 0) {
                    throw new B("Malformed unit identifier !", 0);
                }
            }
            objD = AbstractC0610a.d(map, "unitDisplay", 2, new String[]{Constants.LONG, "short", "narrow"}, "short");
            xVar = this.f21381a;
            if (xVar == xVar2) {
                this.f21382b = a((String) objD4);
                this.f21383c = (s) AbstractC0610a.l(s.class, (String) objD5);
                this.f21384d = (t) AbstractC0610a.l(t.class, (String) objD6);
            } else if (xVar == xVar3) {
                this.f21385e = (String) objD7;
                this.f21386f = (y) AbstractC0610a.l(y.class, (String) objD);
            }
            if (this.f21381a == xVar2) {
                try {
                    double defaultFractionDigits = Currency.getInstance(this.f21382b).getDefaultFractionDigits();
                    dValueOf = Double.valueOf(defaultFractionDigits);
                    dValueOf2 = Double.valueOf(defaultFractionDigits);
                } catch (IllegalArgumentException unused) {
                    throw new B("Invalid currency code !", 0);
                }
            } else {
                dValueOf = Double.valueOf(0.0d);
                if (this.f21381a == x.f9180b) {
                    dValueOf2 = Double.valueOf(0.0d);
                } else {
                    dValueOf2 = Double.valueOf(3.0d);
                }
            }
            this.f21398r = (u) AbstractC0610a.l(u.class, (String) AbstractC0610a.d(map, "notation", 2, new String[]{"standard", "scientific", "engineering", "compact"}, "standard"));
            Object objB = AbstractC0610a.b("minimumIntegerDigits", AbstractC0610a.c("minimumIntegerDigits", map), Double.valueOf(1.0d), Double.valueOf(21.0d), Double.valueOf(1.0d));
            Object objC4 = AbstractC0610a.c("minimumFractionDigits", map);
            Object objC5 = AbstractC0610a.c("maximumFractionDigits", map);
            objC = AbstractC0610a.c("minimumSignificantDigits", map);
            Double d2 = dValueOf2;
            objC2 = AbstractC0610a.c("maximumSignificantDigits", map);
            Double d10 = dValueOf;
            this.f21388h = (int) Math.floor(((Double) objB).doubleValue());
            z3 = objC instanceof A;
            uVar = u.f9171c;
            if (z3 || !(objC2 instanceof A)) {
                this.f21393m = v.f9173a;
                Object objB2 = AbstractC0610a.b("minimumSignificantDigits", objC, Double.valueOf(1.0d), Double.valueOf(21.0d), Double.valueOf(1.0d));
                Object objB3 = AbstractC0610a.b("maximumSignificantDigits", objC2, objB2, Double.valueOf(21.0d), Double.valueOf(21.0d));
                this.f21391k = (int) Math.floor(((Double) objB2).doubleValue());
                this.f21392l = (int) Math.floor(((Double) objB3).doubleValue());
            } else {
                boolean z11 = objC4 instanceof A;
                v vVar = v.f9174b;
                if (z11 && (objC5 instanceof A)) {
                    u uVar2 = this.f21398r;
                    if (uVar2 == uVar) {
                        this.f21393m = v.f9175c;
                    } else if (uVar2 == u.f9170b) {
                        this.f21393m = vVar;
                        this.f21390j = i7;
                    } else {
                        this.f21393m = vVar;
                        this.f21389i = (int) Math.floor(d10.doubleValue());
                        this.f21390j = (int) Math.floor(d2.doubleValue());
                    }
                } else {
                    this.f21393m = vVar;
                    Object objB4 = AbstractC0610a.b("minimumFractionDigits", objC4, Double.valueOf(0.0d), Double.valueOf(20.0d), a3);
                    Object objB5 = AbstractC0610a.b("maximumFractionDigits", objC5, Double.valueOf(0.0d), Double.valueOf(20.0d), a3);
                    if (objB4 instanceof A) {
                        objB4 = Double.valueOf(Math.min(d10.doubleValue(), ((Double) objB5).doubleValue()));
                    } else if (objB5 instanceof A) {
                        objB5 = Double.valueOf(Math.max(d2.doubleValue(), ((Double) objB4).doubleValue()));
                    } else if (((Double) objB4).doubleValue() > ((Double) objB5).doubleValue()) {
                        throw new B("minimumFractionDigits is greater than maximumFractionDigits", 0);
                    }
                    this.f21389i = (int) Math.floor(((Double) objB4).doubleValue());
                    this.f21390j = (int) Math.floor(((Double) objB5).doubleValue());
                }
            }
            objD2 = AbstractC0610a.d(map, "compactDisplay", 2, new String[]{"short", Constants.LONG}, "short");
            if (this.f21398r == uVar) {
                this.f21399s = (r) AbstractC0610a.l(r.class, (String) objD2);
            }
            this.f21387g = ((Boolean) AbstractC0610a.d(map, "useGrouping", 1, a3, Boolean.TRUE)).booleanValue();
            this.f21394n = (w) AbstractC0610a.l(w.class, (String) AbstractC0610a.d(map, "signDisplay", 2, new String[]{"auto", ReactScrollViewHelper.OVER_SCROLL_NEVER, ReactScrollViewHelper.OVER_SCROLL_ALWAYS, "exceptZero"}, "auto"));
            ILocaleObject iLocaleObject2 = this.t;
            if (this.f21396p) {
                str = "";
            } else {
                str = this.f21397q;
            }
            aVar.configure(iLocaleObject2, str, this.f21381a, this.f21384d, this.f21398r, this.f21399s);
            aVar.setCurrency(this.f21382b, this.f21383c);
            aVar.setGrouping(this.f21387g);
            aVar.setMinIntergerDigits(this.f21388h);
            aVar.setSignificantDigits(this.f21393m, this.f21391k, this.f21392l);
            aVar.setFractionDigits(this.f21393m, this.f21389i, this.f21390j);
            aVar.setSignDisplay(this.f21394n);
            aVar.setUnits(this.f21385e, this.f21386f);
        }
        if (this.f21381a == xVar3) {
            throw new B("Expected unit !", 0);
        }
        i7 = 5;
        objD = AbstractC0610a.d(map, "unitDisplay", 2, new String[]{Constants.LONG, "short", "narrow"}, "short");
        xVar = this.f21381a;
        if (xVar == xVar2) {
            this.f21382b = a((String) objD4);
            this.f21383c = (s) AbstractC0610a.l(s.class, (String) objD5);
            this.f21384d = (t) AbstractC0610a.l(t.class, (String) objD6);
        } else if (xVar == xVar3) {
            this.f21385e = (String) objD7;
            this.f21386f = (y) AbstractC0610a.l(y.class, (String) objD);
        }
        if (this.f21381a == xVar2) {
            double defaultFractionDigits2 = Currency.getInstance(this.f21382b).getDefaultFractionDigits();
            dValueOf = Double.valueOf(defaultFractionDigits2);
            dValueOf2 = Double.valueOf(defaultFractionDigits2);
        } else {
            dValueOf = Double.valueOf(0.0d);
            if (this.f21381a == x.f9180b) {
                dValueOf2 = Double.valueOf(0.0d);
            } else {
                dValueOf2 = Double.valueOf(3.0d);
            }
        }
        this.f21398r = (u) AbstractC0610a.l(u.class, (String) AbstractC0610a.d(map, "notation", 2, new String[]{"standard", "scientific", "engineering", "compact"}, "standard"));
        Object objB6 = AbstractC0610a.b("minimumIntegerDigits", AbstractC0610a.c("minimumIntegerDigits", map), Double.valueOf(1.0d), Double.valueOf(21.0d), Double.valueOf(1.0d));
        Object objC6 = AbstractC0610a.c("minimumFractionDigits", map);
        Object objC7 = AbstractC0610a.c("maximumFractionDigits", map);
        objC = AbstractC0610a.c("minimumSignificantDigits", map);
        Double d11 = dValueOf2;
        objC2 = AbstractC0610a.c("maximumSignificantDigits", map);
        Double d12 = dValueOf;
        this.f21388h = (int) Math.floor(((Double) objB6).doubleValue());
        z3 = objC instanceof A;
        uVar = u.f9171c;
        if (z3) {
            this.f21393m = v.f9173a;
            Object objB7 = AbstractC0610a.b("minimumSignificantDigits", objC, Double.valueOf(1.0d), Double.valueOf(21.0d), Double.valueOf(1.0d));
            Object objB8 = AbstractC0610a.b("maximumSignificantDigits", objC2, objB7, Double.valueOf(21.0d), Double.valueOf(21.0d));
            this.f21391k = (int) Math.floor(((Double) objB7).doubleValue());
            this.f21392l = (int) Math.floor(((Double) objB8).doubleValue());
        } else {
            this.f21393m = v.f9173a;
            Object objB9 = AbstractC0610a.b("minimumSignificantDigits", objC, Double.valueOf(1.0d), Double.valueOf(21.0d), Double.valueOf(1.0d));
            Object objB10 = AbstractC0610a.b("maximumSignificantDigits", objC2, objB9, Double.valueOf(21.0d), Double.valueOf(21.0d));
            this.f21391k = (int) Math.floor(((Double) objB9).doubleValue());
            this.f21392l = (int) Math.floor(((Double) objB10).doubleValue());
        }
        objD2 = AbstractC0610a.d(map, "compactDisplay", 2, new String[]{"short", Constants.LONG}, "short");
        if (this.f21398r == uVar) {
            this.f21399s = (r) AbstractC0610a.l(r.class, (String) objD2);
        }
        this.f21387g = ((Boolean) AbstractC0610a.d(map, "useGrouping", 1, a3, Boolean.TRUE)).booleanValue();
        this.f21394n = (w) AbstractC0610a.l(w.class, (String) AbstractC0610a.d(map, "signDisplay", 2, new String[]{"auto", ReactScrollViewHelper.OVER_SCROLL_NEVER, ReactScrollViewHelper.OVER_SCROLL_ALWAYS, "exceptZero"}, "auto"));
        ILocaleObject iLocaleObject3 = this.t;
        if (this.f21396p) {
            str = "";
        } else {
            str = this.f21397q;
        }
        aVar.configure(iLocaleObject3, str, this.f21381a, this.f21384d, this.f21398r, this.f21399s);
        aVar.setCurrency(this.f21382b, this.f21383c);
        aVar.setGrouping(this.f21387g);
        aVar.setMinIntergerDigits(this.f21388h);
        aVar.setSignificantDigits(this.f21393m, this.f21391k, this.f21392l);
        aVar.setFractionDigits(this.f21393m, this.f21389i, this.f21390j);
        aVar.setSignDisplay(this.f21394n);
        aVar.setUnits(this.f21385e, this.f21386f);
    }

    public static String a(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < 'a' || cCharAt > 'z') {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt - ' '));
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
        return this.f21395o.format(d2);
    }

    @DoNotStrip
    public List<Map<String, String>> formatToParts(double d2) throws B {
        ArrayList arrayList = new ArrayList();
        a aVar = this.f21395o;
        AttributedCharacterIterator toParts = aVar.formatToParts(d2);
        StringBuilder sb2 = new StringBuilder();
        for (char cFirst = toParts.first(); cFirst != 65535; cFirst = toParts.next()) {
            sb2.append(cFirst);
            if (toParts.getIndex() + 1 == toParts.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = toParts.getAttributes().keySet().iterator();
                String strFieldToString = it.hasNext() ? aVar.fieldToString(it.next(), d2) : "literal";
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
        linkedHashMap.put("locale", this.f21400u.toCanonicalTag());
        linkedHashMap.put("numberingSystem", this.f21397q);
        linkedHashMap.put("style", this.f21381a.toString());
        x xVar = this.f21381a;
        if (xVar == x.f9181c) {
            linkedHashMap.put(FirebaseAnalytics.Param.CURRENCY, this.f21382b);
            linkedHashMap.put("currencyDisplay", this.f21383c.toString());
            linkedHashMap.put("currencySign", this.f21384d.toString());
        } else if (xVar == x.f9182d) {
            linkedHashMap.put("unit", this.f21385e);
            linkedHashMap.put("unitDisplay", this.f21386f.toString());
        }
        int i7 = this.f21388h;
        if (i7 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i7));
        }
        v vVar = this.f21393m;
        if (vVar == v.f9173a) {
            int i10 = this.f21392l;
            if (i10 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i10));
            }
            int i11 = this.f21391k;
            if (i11 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i11));
            }
        } else if (vVar == v.f9174b) {
            int i12 = this.f21389i;
            if (i12 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i12));
            }
            int i13 = this.f21390j;
            if (i13 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i13));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f21387g));
        linkedHashMap.put("notation", this.f21398r.toString());
        if (this.f21398r == u.f9171c) {
            linkedHashMap.put("compactDisplay", this.f21399s.toString());
        }
        linkedHashMap.put("signDisplay", this.f21394n.toString());
        return linkedHashMap;
    }
}
