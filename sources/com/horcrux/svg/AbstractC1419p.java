package com.horcrux.svg;

import com.facebook.react.bridge.ReadableType;

/* JADX INFO: renamed from: com.horcrux.svg.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1419p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23542a;

    static {
        int[] iArr = new int[ReadableType.values().length];
        f23542a = iArr;
        try {
            iArr[ReadableType.Number.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23542a[ReadableType.String.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f23542a[ReadableType.Array.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
