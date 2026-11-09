package D7;

import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1688a;

    static {
        int[] iArr = new int[RefreshState.values().length];
        f1688a = iArr;
        try {
            iArr[RefreshState.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1688a[RefreshState.PullDownToRefresh.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1688a[RefreshState.Refreshing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f1688a[RefreshState.RefreshReleased.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f1688a[RefreshState.ReleaseToRefresh.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f1688a[RefreshState.ReleaseToTwoLevel.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f1688a[RefreshState.Loading.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
