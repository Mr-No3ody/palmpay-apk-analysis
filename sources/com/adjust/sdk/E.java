package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19312a;

    static {
        int[] iArr = new int[ActivityKind.values().length];
        f19312a = iArr;
        try {
            iArr[ActivityKind.SESSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f19312a[ActivityKind.EVENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f19312a[ActivityKind.CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f19312a[ActivityKind.ATTRIBUTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f19312a[ActivityKind.INFO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f19312a[ActivityKind.GDPR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f19312a[ActivityKind.AD_REVENUE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f19312a[ActivityKind.SUBSCRIPTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f19312a[ActivityKind.THIRD_PARTY_SHARING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f19312a[ActivityKind.MEASUREMENT_CONSENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f19312a[ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
