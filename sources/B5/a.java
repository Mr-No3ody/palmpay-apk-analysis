package B5;

import J1.o;
import android.view.ViewGroup;
import com.adjust.sdk.ActivityHandler;
import com.bumptech.glide.manager.l;
import com.bumptech.glide.manager.m;
import com.imuxuan.floatingview.FloatingMagnetView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f369c;

    public /* synthetic */ a(Object obj, boolean z3, int i7) {
        this.f367a = i7;
        this.f369c = obj;
        this.f368b = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f367a) {
            case 0:
                FloatingMagnetView floatingMagnetView = (FloatingMagnetView) this.f369c;
                ViewGroup viewGroup = (ViewGroup) floatingMagnetView.getParent();
                if (viewGroup != null) {
                    floatingMagnetView.f23554i = viewGroup.getWidth() - floatingMagnetView.getWidth();
                    floatingMagnetView.f23555j = viewGroup.getHeight();
                }
                floatingMagnetView.a(floatingMagnetView.f23557p, this.f368b);
                break;
            case 1:
                ((ActivityHandler) this.f369c).setAskingAttributionI(this.f368b);
                break;
            default:
                l lVar = (l) this.f369c;
                lVar.getClass();
                o.a();
                m mVar = lVar.f21054a;
                boolean z3 = mVar.f21055a;
                boolean z8 = this.f368b;
                mVar.f21055a = z8;
                if (z3 != z8) {
                    mVar.f21056b.onConnectivityChanged(z8);
                }
                break;
        }
    }

    public a(boolean z3, ActivityHandler activityHandler) {
        this.f367a = 1;
        this.f369c = activityHandler;
        this.f368b = z3;
    }
}
