package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1420q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f23543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SVGLength$UnitType f23544b;

    public C1420q() {
        this.f23543a = 0.0d;
        this.f23544b = SVGLength$UnitType.UNKNOWN;
    }

    public static ArrayList a(Dynamic dynamic) {
        int i7 = AbstractC1419p.f23542a[dynamic.getType().ordinal()];
        if (i7 == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new C1420q(dynamic.asDouble()));
            return arrayList;
        }
        int i10 = 0;
        if (i7 == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(",", " ").split(" ");
            ArrayList arrayList2 = new ArrayList(strArrSplit.length);
            int length = strArrSplit.length;
            while (i10 < length) {
                arrayList2.add(new C1420q(strArrSplit[i10]));
                i10++;
            }
            return arrayList2;
        }
        if (i7 != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList arrayList3 = new ArrayList(size);
        while (i10 < size) {
            arrayList3.add(b(readableArrayAsArray.getDynamic(i10)));
            i10++;
        }
        return arrayList3;
    }

    public static C1420q b(Dynamic dynamic) {
        int i7 = AbstractC1419p.f23542a[dynamic.getType().ordinal()];
        if (i7 != 1) {
            return i7 != 2 ? new C1420q() : new C1420q(dynamic.asString());
        }
        return new C1420q(dynamic.asDouble());
    }

    public static String c(Dynamic dynamic) {
        int i7 = AbstractC1419p.f23542a[dynamic.getType().ordinal()];
        if (i7 == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i7 != 2) {
            return null;
        }
        return dynamic.asString();
    }

    public C1420q(double d2) {
        this.f23543a = d2;
        this.f23544b = SVGLength$UnitType.NUMBER;
    }

    public C1420q(String str) {
        byte b7 = 2;
        String strTrim = str.trim();
        int length = strTrim.length();
        int i7 = length - 1;
        if (length != 0 && !strTrim.equals("normal")) {
            if (strTrim.codePointAt(i7) == 37) {
                this.f23544b = SVGLength$UnitType.PERCENTAGE;
                this.f23543a = Double.valueOf(strTrim.substring(0, i7)).doubleValue();
                return;
            }
            int i10 = length - 2;
            if (i10 > 0) {
                String strSubstring = strTrim.substring(i10);
                strSubstring.getClass();
                switch (strSubstring.hashCode()) {
                    case 3178:
                        b7 = !strSubstring.equals("cm") ? (byte) -1 : (byte) 0;
                        break;
                    case 3240:
                        b7 = !strSubstring.equals("em") ? (byte) -1 : (byte) 1;
                        break;
                    case 3251:
                        if (!strSubstring.equals("ex")) {
                            b7 = -1;
                        }
                        break;
                    case 3365:
                        b7 = !strSubstring.equals("in") ? (byte) -1 : (byte) 3;
                        break;
                    case 3488:
                        b7 = !strSubstring.equals("mm") ? (byte) -1 : (byte) 4;
                        break;
                    case 3571:
                        b7 = !strSubstring.equals("pc") ? (byte) -1 : (byte) 5;
                        break;
                    case 3588:
                        b7 = !strSubstring.equals("pt") ? (byte) -1 : (byte) 6;
                        break;
                    case 3592:
                        b7 = !strSubstring.equals("px") ? (byte) -1 : (byte) 7;
                        break;
                    default:
                        b7 = -1;
                        break;
                }
                switch (b7) {
                    case 0:
                        this.f23544b = SVGLength$UnitType.CM;
                        length = i10;
                        break;
                    case 1:
                        this.f23544b = SVGLength$UnitType.EMS;
                        length = i10;
                        break;
                    case 2:
                        this.f23544b = SVGLength$UnitType.EXS;
                        length = i10;
                        break;
                    case 3:
                        this.f23544b = SVGLength$UnitType.IN;
                        length = i10;
                        break;
                    case 4:
                        this.f23544b = SVGLength$UnitType.MM;
                        length = i10;
                        break;
                    case 5:
                        this.f23544b = SVGLength$UnitType.PC;
                        length = i10;
                        break;
                    case 6:
                        this.f23544b = SVGLength$UnitType.PT;
                        length = i10;
                        break;
                    case 7:
                        this.f23544b = SVGLength$UnitType.NUMBER;
                        length = i10;
                        break;
                    default:
                        this.f23544b = SVGLength$UnitType.NUMBER;
                        break;
                }
                this.f23543a = Double.valueOf(strTrim.substring(0, length)).doubleValue();
                return;
            }
            this.f23544b = SVGLength$UnitType.NUMBER;
            this.f23543a = Double.valueOf(strTrim).doubleValue();
            return;
        }
        this.f23544b = SVGLength$UnitType.UNKNOWN;
        this.f23543a = 0.0d;
    }
}
