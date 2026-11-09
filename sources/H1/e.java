package H1;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Integer f3583d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3585b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f3586c;

    public e(View view) {
        this.f3584a = view;
    }

    public final int a(int i7, int i10, int i11) {
        int i12 = i10 - i11;
        if (i12 > 0) {
            return i12;
        }
        int i13 = i7 - i11;
        if (i13 > 0) {
            return i13;
        }
        View view = this.f3584a;
        if (view.isLayoutRequested() || i10 != -2) {
            return 0;
        }
        Context context = view.getContext();
        if (f3583d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            J1.g.c(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f3583d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f3583d.intValue();
    }
}
