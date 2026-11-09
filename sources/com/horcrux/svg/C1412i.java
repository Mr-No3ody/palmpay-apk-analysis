package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1412i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1412i f23472p = new C1412i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f23473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReadableMap f23476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f23477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f23479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f23482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c0 f23483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final double f23484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final double f23485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final double f23486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f23487o;

    public C1412i() {
        this.f23476d = null;
        this.f23474b = "";
        this.f23475c = 1;
        this.f23477e = b0.Normal;
        this.f23478f = 400;
        this.f23479g = "";
        this.f23480h = "";
        this.f23481i = 1;
        this.f23482j = 1;
        this.f23483k = c0.None;
        this.f23487o = false;
        this.f23484l = 0.0d;
        this.f23473a = 12.0d;
        this.f23485m = 0.0d;
        this.f23486n = 0.0d;
    }

    public static double b(ReadableMap readableMap, String str, double d2, double d10, double d11) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) * d2 : p264r5.a.j(d11, d2, d10, readableMap.getString(str));
    }

    public final void a(C1412i c1412i, double d2) {
        long jRound = Math.round(d2);
        if (jRound < 1 || jRound > 1000) {
            this.f23478f = c1412i.f23478f;
            this.f23477e = c1412i.f23477e;
            return;
        }
        int i7 = (int) jRound;
        this.f23478f = i7;
        b0[] b0VarArr = AbstractC1411h.f23470a;
        this.f23477e = AbstractC1411h.f23470a[Math.round(i7 / 100.0f)];
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c A[PHI: r1
      0x006c: PHI (r1v63 int) = (r1v62 int), (r1v68 int) binds: [B:27:0x0076, B:21:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    public C1412i(ReadableMap readableMap, C1412i c1412i, double d2) {
        int i7;
        String string;
        String string2;
        int i10;
        c0 c0Var;
        double dB;
        double dB2;
        int i11;
        int i12 = 3;
        boolean z3 = true;
        double d10 = c1412i.f23473a;
        if (readableMap.hasKey(ViewProps.FONT_SIZE)) {
            this.f23473a = b(readableMap, ViewProps.FONT_SIZE, 1.0d, d10, d10);
        } else {
            this.f23473a = d10;
        }
        if (readableMap.hasKey(ViewProps.FONT_WEIGHT)) {
            if (readableMap.getType(ViewProps.FONT_WEIGHT) == ReadableType.Number) {
                a(c1412i, readableMap.getDouble(ViewProps.FONT_WEIGHT));
            } else {
                String string3 = readableMap.getString(ViewProps.FONT_WEIGHT);
                HashMap map = b0.f23439v;
                if (map.containsKey(string3)) {
                    b0 b0Var = (b0) map.get(string3);
                    b0[] b0VarArr = AbstractC1411h.f23470a;
                    int i13 = 700;
                    if (b0Var == b0.Bolder) {
                        i11 = c1412i.f23478f;
                        if (i11 < 350) {
                            i13 = 400;
                        } else if (i11 >= 550) {
                            i13 = 900;
                            if (i11 >= 900) {
                                i13 = i11;
                            }
                        }
                    } else if (b0Var == b0.Lighter) {
                        i11 = c1412i.f23478f;
                        if (i11 < 100) {
                            i13 = i11;
                        } else if (i11 < 550) {
                            i13 = 100;
                        } else if (i11 < 750) {
                            i13 = 400;
                        }
                    } else {
                        i13 = AbstractC1411h.f23471b[b0Var.ordinal()];
                    }
                    this.f23478f = i13;
                    this.f23477e = AbstractC1411h.f23470a[Math.round(i13 / 100.0f)];
                } else if (string3 != null) {
                    a(c1412i, Double.parseDouble(string3));
                } else {
                    this.f23478f = c1412i.f23478f;
                    this.f23477e = c1412i.f23477e;
                }
            }
        } else {
            this.f23478f = c1412i.f23478f;
            this.f23477e = c1412i.f23477e;
        }
        this.f23476d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : c1412i.f23476d;
        this.f23474b = readableMap.hasKey(ViewProps.FONT_FAMILY) ? readableMap.getString(ViewProps.FONT_FAMILY) : c1412i.f23474b;
        if (readableMap.hasKey(ViewProps.FONT_STYLE)) {
            String string4 = readableMap.getString(ViewProps.FONT_STYLE);
            if (string4 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string4.equals("normal")) {
                i7 = 1;
            } else if (string4.equals("italic")) {
                i7 = 2;
            } else {
                if (!string4.equals("oblique")) {
                    throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.FontStyle.".concat(string4));
                }
                i7 = 3;
            }
        } else {
            i7 = c1412i.f23475c;
        }
        this.f23475c = i7;
        if (readableMap.hasKey("fontFeatureSettings")) {
            string = readableMap.getString("fontFeatureSettings");
        } else {
            string = c1412i.f23479g;
        }
        this.f23479g = string;
        if (readableMap.hasKey("fontVariationSettings")) {
            string2 = readableMap.getString("fontVariationSettings");
        } else {
            string2 = c1412i.f23480h;
        }
        this.f23480h = string2;
        if (readableMap.hasKey("fontVariantLigatures")) {
            String string5 = readableMap.getString("fontVariantLigatures");
            if (string5 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string5.equals("normal")) {
                i10 = 1;
            } else {
                if (!string5.equals(ViewProps.NONE)) {
                    throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.FontVariantLigatures.".concat(string5));
                }
                i10 = 2;
            }
        } else {
            i10 = c1412i.f23481i;
        }
        this.f23481i = i10;
        if (readableMap.hasKey("textAnchor")) {
            String string6 = readableMap.getString("textAnchor");
            if (string6 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string6.equals(ViewProps.START)) {
                i12 = 1;
            } else if (string6.equals("middle")) {
                i12 = 2;
            } else if (!string6.equals(ViewProps.END)) {
                throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextAnchor.".concat(string6));
            }
        } else {
            i12 = c1412i.f23482j;
        }
        this.f23482j = i12;
        if (readableMap.hasKey("textDecoration")) {
            String string7 = readableMap.getString("textDecoration");
            HashMap map2 = c0.f23446c;
            if (map2.containsKey(string7)) {
                c0Var = (c0) map2.get(string7);
            } else {
                throw new IllegalArgumentException(C0.G.o("Unknown String Value: ", string7));
            }
        } else {
            c0Var = c1412i.f23483k;
        }
        this.f23483k = c0Var;
        boolean zHasKey = readableMap.hasKey("kerning");
        if (!zHasKey && !c1412i.f23487o) {
            z3 = false;
        }
        this.f23487o = z3;
        this.f23484l = zHasKey ? b(readableMap, "kerning", d2, this.f23473a, 0.0d) : c1412i.f23484l;
        if (readableMap.hasKey("wordSpacing")) {
            dB = b(readableMap, "wordSpacing", d2, this.f23473a, 0.0d);
        } else {
            dB = c1412i.f23485m;
        }
        this.f23485m = dB;
        if (readableMap.hasKey(ViewProps.LETTER_SPACING)) {
            dB2 = b(readableMap, ViewProps.LETTER_SPACING, d2, this.f23473a, 0.0d);
        } else {
            dB2 = c1412i.f23486n;
        }
        this.f23486n = dB2;
    }
}
