package j4;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f38281d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f38282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup.LayoutParams f38284c;

    public b(View view) {
        if (view != null) {
            this.f38282a = view;
            view.getViewTreeObserver().addOnGlobalLayoutListener(new Be.c(this, 12));
            this.f38284c = view.getLayoutParams();
        }
    }
}
