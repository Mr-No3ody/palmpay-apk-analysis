package p377z5;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.view.WindowManager;
import com.google.firebase.perf.util.Constants;
import p294tb.RunnableC2060w;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f44461b;

    public /* synthetic */ h(i iVar, int i7) {
        this.f44460a = i7;
        this.f44461b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar;
        switch (this.f44460a) {
            case 0:
                i iVar = this.f44461b;
                m mVar2 = iVar.f44464b;
                Activity activity = mVar2.f44486a;
                WindowManager windowManager = null;
                if (activity == null) {
                    Application application = mVar2.f44487b;
                    if (application != null) {
                        windowManager = (WindowManager) application.getSystemService("window");
                    }
                } else if (!activity.isDestroyed()) {
                    windowManager = mVar2.f44486a.getWindowManager();
                }
                if (windowManager == null) {
                    return;
                }
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                layoutParams.format = -3;
                layoutParams.flags = 152;
                layoutParams.packageName = iVar.f44465c;
                b bVar = iVar.f44463a;
                layoutParams.gravity = bVar.f44447c;
                layoutParams.x = bVar.f44449e;
                layoutParams.y = bVar.f44450f;
                layoutParams.verticalMargin = bVar.f44452h;
                layoutParams.horizontalMargin = bVar.f44451g;
                layoutParams.windowAnimations = R.style.Animation.Toast;
                if (iVar.f44467e) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        layoutParams.type = 2038;
                        layoutParams.flags = 152 & (-17);
                    } else {
                        layoutParams.type = 2003;
                    }
                }
                try {
                    windowManager.addView(bVar.f44445a, layoutParams);
                    i.f44462h.postDelayed(new RunnableC2060w(this, 7), bVar.f44448d == 1 ? 3500 : Constants.MAX_URL_LENGTH);
                    m mVar3 = iVar.f44464b;
                    mVar3.f44488c = iVar;
                    Activity activity2 = mVar3.f44486a;
                    if (activity2 != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            activity2.registerActivityLifecycleCallbacks(mVar3);
                        } else {
                            activity2.getApplication().registerActivityLifecycleCallbacks(mVar3);
                        }
                    }
                    iVar.f44466d = true;
                    i.a(iVar, bVar.f44445a);
                    return;
                } catch (WindowManager.BadTokenException | IllegalStateException e10) {
                    e10.printStackTrace();
                    return;
                }
            default:
                i iVar2 = this.f44461b;
                try {
                    m mVar4 = iVar2.f44464b;
                    Activity activity3 = mVar4.f44486a;
                    WindowManager windowManager2 = null;
                    if (activity3 == null) {
                        Application application2 = mVar4.f44487b;
                        if (application2 != null) {
                            windowManager2 = (WindowManager) application2.getSystemService("window");
                        }
                    } else if (!activity3.isDestroyed()) {
                        windowManager2 = mVar4.f44486a.getWindowManager();
                    }
                    if (windowManager2 == null) {
                        mVar = iVar2.f44464b;
                    } else {
                        windowManager2.removeViewImmediate(iVar2.f44463a.f44445a);
                        mVar = iVar2.f44464b;
                    }
                } catch (IllegalArgumentException e11) {
                    e11.printStackTrace();
                    mVar = iVar2.f44464b;
                } finally {
                    iVar2.f44464b.a();
                    iVar2.f44466d = false;
                }
                mVar.a();
                return;
        }
    }
}
