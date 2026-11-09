package H0;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AbstractC0838p;
import androidx.appcompat.app.AbstractC0839q;
import androidx.appcompat.app.AbstractC0841t;
import androidx.appcompat.app.I;
import androidx.core.app.AbstractC1037f;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.adjust.sdk.AdjustInstance;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3566b;

    public /* synthetic */ e(Context context, int i7) {
        this.f3565a = i7;
        this.f3566b = context;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.core.os.h hVar;
        Object systemService;
        Context context;
        switch (this.f3565a) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new e(this.f3566b, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(this.f3566b, 2));
                break;
            case 2:
                d.s(this.f3566b, new G0.g(0), d.f3555a, false);
                break;
            case 3:
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 33) {
                    Context context2 = this.f3566b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i7 >= 33) {
                            M.g gVar = AbstractC0841t.f12320g;
                            gVar.getClass();
                            M.b bVar = new M.b(gVar);
                            while (true) {
                                if (bVar.hasNext()) {
                                    AbstractC0841t abstractC0841t = (AbstractC0841t) ((WeakReference) bVar.next()).get();
                                    if (abstractC0841t != null && (context = ((I) abstractC0841t).f12144p) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                hVar = new androidx.core.os.h(new androidx.core.os.i(AbstractC0839q.a(systemService)));
                            } else {
                                hVar = androidx.core.os.h.f16097b;
                            }
                        } else {
                            hVar = AbstractC0841t.f12316c;
                            if (hVar == null) {
                                hVar = androidx.core.os.h.f16097b;
                            }
                        }
                        if (hVar.c()) {
                            String strE = AbstractC1037f.e(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                AbstractC0839q.b(systemService2, AbstractC0838p.a(strE));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AbstractC0841t.f12319f = true;
                break;
            default:
                AdjustInstance.lambda$setSendingReferrersAsNotSent$2(this.f3566b);
                break;
        }
    }

    public /* synthetic */ e(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f3565a = 0;
        this.f3566b = context;
    }
}
