package vh;

import Da.d;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f43213b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f43212a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f43214c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43215d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f43216e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f43217f = -16777217;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f43218g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f43219h = -16777217;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f43220i = -1;

    public static void a(Toast toast, TextView textView) {
        View view = toast.getView();
        int i7 = f43218g;
        if (i7 != -1) {
            view.setBackgroundResource(i7);
            textView.setBackgroundColor(0);
            return;
        }
        int i10 = f43217f;
        if (i10 != -16777217) {
            Drawable background = view.getBackground();
            Drawable background2 = textView.getBackground();
            if (background != null && background2 != null) {
                background.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                textView.setBackgroundColor(0);
            } else if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            } else if (background2 != null) {
                background2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            } else {
                view.setBackgroundColor(i10);
            }
        }
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f43212a.post(new d(str, 7));
    }
}
