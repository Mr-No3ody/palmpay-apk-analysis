package B7;

import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f548a;

    static {
        int[] iArr = new int[RefreshState.values().length];
        f548a = iArr;
        try {
            iArr[RefreshState.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f548a[RefreshState.PullDownToRefresh.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f548a[RefreshState.PullUpToLoad.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f548a[RefreshState.PullDownCanceled.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f548a[RefreshState.PullUpCanceled.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f548a[RefreshState.ReleaseToRefresh.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f548a[RefreshState.ReleaseToLoad.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f548a[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f548a[RefreshState.RefreshReleased.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f548a[RefreshState.LoadReleased.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f548a[RefreshState.Refreshing.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f548a[RefreshState.Loading.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f548a[RefreshState.RefreshFinish.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f548a[RefreshState.LoadFinish.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f548a[RefreshState.TwoLevelReleased.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f548a[RefreshState.TwoLevelFinish.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f548a[RefreshState.TwoLevel.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
    }
}
