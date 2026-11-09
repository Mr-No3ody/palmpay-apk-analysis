package Lb;

import La.i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f5620a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f5621b = C2131j.b(new i(4));

    public static boolean a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return true;
    }
}
