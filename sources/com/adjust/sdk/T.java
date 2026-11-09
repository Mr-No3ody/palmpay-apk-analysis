package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19346a;

    static {
        int[] iArr = new int[ActivityKind.values().length];
        f19346a = iArr;
        try {
            iArr[ActivityKind.SESSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f19346a[ActivityKind.CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f19346a[ActivityKind.ATTRIBUTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f19346a[ActivityKind.EVENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f19346a[ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f19346a[ActivityKind.THIRD_PARTY_SHARING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
