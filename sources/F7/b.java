package F7;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f2618e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2620g;

    public static int a(int i7, int i10, int i11, int i12, RecyclerView.State state) {
        int i13;
        int i14 = i11 * i12;
        if (i10 != 0) {
            return i7 + 1;
        }
        int i15 = i7 % i14;
        if (i15 == i14 - 1) {
            return i7 + 1;
        }
        int i16 = i15 / i12;
        return (i16 != i11 + (-1) && ((i13 = i7 + i12) < state.getItemCount() || i7 % i12 == i12 + (-1))) ? i13 : (i7 - (i16 * i12)) + 1;
    }

    public static int b(int i7, int i10, int i11, int i12) {
        int i13 = i11 * i12;
        if (i10 != 0) {
            return i7 - 1;
        }
        int i14 = i7 % i13;
        if (i14 == 0) {
            return i7 - 1;
        }
        if (i14 / i12 != 0) {
            return i7 - i12;
        }
        return ((i11 - 1) * i12) + (i7 - 1);
    }
}
