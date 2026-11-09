package com.horcrux.svg;

/* JADX INFO: renamed from: com.horcrux.svg.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1416m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23531a;

    static {
        int[] iArr = new int[SVGLength$UnitType.values().length];
        f23531a = iArr;
        try {
            iArr[SVGLength$UnitType.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23531a[SVGLength$UnitType.PX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f23531a[SVGLength$UnitType.PERCENTAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f23531a[SVGLength$UnitType.EMS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f23531a[SVGLength$UnitType.EXS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f23531a[SVGLength$UnitType.CM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f23531a[SVGLength$UnitType.MM.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f23531a[SVGLength$UnitType.IN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f23531a[SVGLength$UnitType.PT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f23531a[SVGLength$UnitType.PC.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f23531a[SVGLength$UnitType.UNKNOWN.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
