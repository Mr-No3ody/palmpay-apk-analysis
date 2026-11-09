package C7;

import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1242a;

    static {
        int[] iArr = new int[RefreshState.values().length];
        f1242a = iArr;
        try {
            iArr[RefreshState.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1242a[RefreshState.PullUpToLoad.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1242a[RefreshState.Loading.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f1242a[RefreshState.LoadReleased.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f1242a[RefreshState.ReleaseToLoad.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f1242a[RefreshState.Refreshing.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
