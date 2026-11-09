package Ce;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.ui.fragment.BankAccountFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.ui.view.HomeScrollView;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ce.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC0160b implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1465b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0160b(Object obj, int i7) {
        this.f1464a = i7;
        this.f1465b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v3) {
        Object obj = this.f1465b;
        switch (this.f1464a) {
            case 0:
                androidx.fragment.app.Z childFragmentManager = ((BankAccountFragment) obj).getChildFragmentManager();
                C1161a c1161aE = N8.q0.e(childFragmentManager, childFragmentManager);
                c1161aE.e(v3.getId(), (Fragment) ARouter.getInstance().build("/coreImpl/add_account_fragment").withBoolean("me_bind_bank_card", true).navigation(), "BankAccountFragment");
                c1161aE.j();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(v3, "v");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(v3, "v");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(v3, "v");
                Eg.g gVar = (Eg.g) obj;
                gVar.f2441b = true;
                androidx.camera.core.impl.utils.futures.i iVar = new androidx.camera.core.impl.utils.futures.i(6, gVar, v3);
                WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                v3.postOnAnimation(iVar);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v3) {
        ViewTreeObserver viewTreeObserver;
        HomeScrollView homeScrollView;
        ViewTreeObserver viewTreeObserver2;
        Object obj = this.f1465b;
        switch (this.f1464a) {
            case 0:
                break;
            case 1:
                Intrinsics.checkNotNullParameter(v3, "v");
                int i7 = HomeFragmentHomeTab.f35093A0;
                HomeFragmentHomeTab homeFragmentHomeTab = (HomeFragmentHomeTab) obj;
                HomeScrollView homeScrollViewW = homeFragmentHomeTab.w();
                if (homeScrollViewW != null && (viewTreeObserver = homeScrollViewW.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnScrollChangedListener(homeFragmentHomeTab);
                    break;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(v3, "v");
                HomePalmZoneTabV2 homePalmZoneTabV2 = (HomePalmZoneTabV2) obj;
                Bc.i iVar = homePalmZoneTabV2.f35139L;
                if (iVar != null && (homeScrollView = (HomeScrollView) iVar.f729g) != null && (viewTreeObserver2 = homeScrollView.getViewTreeObserver()) != null) {
                    viewTreeObserver2.removeOnScrollChangedListener(homePalmZoneTabV2);
                    break;
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(v3, "v");
                ((Eg.g) obj).f2441b = false;
                break;
            case 4:
                ((U4.i) obj).x();
                break;
            case 5:
                androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) obj;
                ViewTreeObserver viewTreeObserver3 = gVar.f12405Z;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        gVar.f12405Z = v3.getViewTreeObserver();
                    }
                    gVar.f12405Z.removeGlobalOnLayoutListener(gVar.f12413j);
                }
                v3.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                androidx.appcompat.view.menu.v vVar = (androidx.appcompat.view.menu.v) obj;
                ViewTreeObserver viewTreeObserver4 = vVar.f12491A;
                if (viewTreeObserver4 != null) {
                    if (!viewTreeObserver4.isAlive()) {
                        vVar.f12491A = v3.getViewTreeObserver();
                    }
                    vVar.f12491A.removeGlobalOnLayoutListener(vVar.f12504j);
                }
                v3.removeOnAttachStateChangeListener(this);
                break;
            default:
                ((U4.i) obj).x();
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
