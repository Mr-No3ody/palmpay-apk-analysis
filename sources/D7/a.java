package D7;

import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1687a;

    static {
        int[] iArr = new int[RefreshState.values().length];
        f1687a = iArr;
        try {
            iArr[RefreshState.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1687a[RefreshState.PullDownToRefresh.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
