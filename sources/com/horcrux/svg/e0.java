package com.horcrux.svg;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23456a;

    static {
        int[] iArr = new int[SVGLength$UnitType.values().length];
        f23456a = iArr;
        try {
            iArr[SVGLength$UnitType.EMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23456a[SVGLength$UnitType.EXS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f23456a[SVGLength$UnitType.CM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f23456a[SVGLength$UnitType.MM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f23456a[SVGLength$UnitType.IN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f23456a[SVGLength$UnitType.PT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f23456a[SVGLength$UnitType.PC.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
