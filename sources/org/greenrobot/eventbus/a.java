package org.greenrobot.eventbus;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f41045a;

    static {
        int[] iArr = new int[ThreadMode.values().length];
        f41045a = iArr;
        try {
            iArr[ThreadMode.POSTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f41045a[ThreadMode.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f41045a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f41045a[ThreadMode.BACKGROUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f41045a[ThreadMode.ASYNC.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
