package p261r1;

import com.alibaba.android.arouter.facade.enums.RouteType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f41537a;

    static {
        int[] iArr = new int[RouteType.values().length];
        f41537a = iArr;
        try {
            iArr[RouteType.ACTIVITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f41537a[RouteType.PROVIDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f41537a[RouteType.BOARDCAST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f41537a[RouteType.CONTENT_PROVIDER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f41537a[RouteType.FRAGMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f41537a[RouteType.METHOD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f41537a[RouteType.SERVICE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
