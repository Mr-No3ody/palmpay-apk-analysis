package D7;

import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f1690b;

    static {
        int[] iArr = new int[SpinnerStyle.values().length];
        f1690b = iArr;
        try {
            iArr[SpinnerStyle.Translate.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1690b[SpinnerStyle.Scale.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[RefreshState.values().length];
        f1689a = iArr2;
        try {
            iArr2[RefreshState.TwoLevelReleased.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f1689a[RefreshState.TwoLevel.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f1689a[RefreshState.TwoLevelFinish.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f1689a[RefreshState.PullDownToRefresh.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
