package Da;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import androidx.core.app.AbstractC1036e;
import androidx.core.app.C1035d;
import androidx.core.app.RunnableC1034c;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.callback.ShowDialogCallback;
import com.transsnet.palmpay.core.rnbridge.bridge.HideLoadingBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.ShowLoadingBridge;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.util.ActivityUtils;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f1745b;

    public /* synthetic */ f(Activity activity, int i7) {
        this.f1744a = i7;
        this.f1745b = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r10;
        ?? r11;
        ?? r12;
        Activity activity = this.f1745b;
        switch (this.f1744a) {
            case 0:
                PPRNBridge.dismissFlexiCashLoading$lambda$41$lambda$40(activity);
                return;
            case 1:
                if (activity.isFinishing()) {
                    return;
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 28) {
                    Class cls = AbstractC1036e.f15969a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC1036e.f15969a;
                C1035d c1035d = 27;
                ?? r13 = 26;
                boolean z3 = i7 == 26 || i7 == 27;
                Method method = AbstractC1036e.f15974f;
                if ((!z3 || method != null) && (AbstractC1036e.f15973e != null || AbstractC1036e.f15972d != null)) {
                    try {
                        Object obj2 = AbstractC1036e.f15971c.get(activity);
                        if (obj2 != null && (obj = AbstractC1036e.f15970b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            c1035d = new C1035d(activity);
                            application.registerActivityLifecycleCallbacks(c1035d);
                            r13 = AbstractC1036e.f15975g;
                            r13.post(new RunnableC1034c(c1035d, obj2));
                            application = (i7 == 26 || i7 == 27) ? 1 : 0;
                            try {
                                if (application != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        r12 = application;
                                        r11 = c1035d;
                                        r10 = r13;
                                        r10.post(new RunnableC1034c(1, r12, r11));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                r13.post(new RunnableC1034c(1, application, c1035d));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                r12 = application;
                                r11 = c1035d;
                                r10 = r13;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 2:
                HideLoadingBridge.onHandle$lambda$1$lambda$0(activity);
                return;
            case 3:
                ShowLoadingBridge.onHandle$lambda$1$lambda$0(activity);
                return;
            case 4:
                ShowLoadingBridge.onDestroy$lambda$3$lambda$2(activity);
                return;
            default:
                LinkedHashSet<Object> linkedHashSet = new LinkedHashSet();
                if (activity != null) {
                    linkedHashSet.add(activity);
                }
                Activity topActivity = ActivityUtils.getTopActivity();
                if (topActivity != null) {
                    linkedHashSet.add(topActivity);
                }
                List<Activity> activityList = ActivityUtils.getActivityList();
                if (activityList != null) {
                    for (Activity activity2 : activityList) {
                        if (activity2.getClass().getName().equals("com.transsnet.palmpay.core.ui.activity.PPRNActivity")) {
                            linkedHashSet.add(activity2);
                        }
                    }
                }
                for (Object obj3 : linkedHashSet) {
                    if (obj3 instanceof BaseActivity) {
                        ((BaseActivity) obj3).showLoadingDialog(false);
                    } else if (obj3 instanceof ShowDialogCallback) {
                        ((ShowDialogCallback) obj3).showLoadingDialog(false);
                    }
                    if (obj3.getClass().getName().equals("com.transsnet.palmpay.core.ui.activity.PPRNActivity")) {
                        try {
                            obj3.getClass().getMethod("dismissLoadingDialog", new Class[0]).invoke(obj3, new Object[0]);
                        } catch (Exception unused2) {
                        }
                    }
                }
                return;
        }
    }
}
