package Ce;

import com.palmpay.lib.apm.LibApm;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.util.MainUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.TimeUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ce.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0172n extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f1504a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0172n(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f1504a = homeFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0172n(this.f1504a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0172n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        HomeFragment homeFragment = this.f1504a;
        if (!MainUtils.checkPostNotificationsPermission(homeFragment.getActivity())) {
            Intrinsics.checkNotNullParameter("main_sp_check_notification", "key");
            if (!TimeUtils.isToday(SPUtils.getInstance(p059e1.a.G("main_sp_check_notification")).getLong("main_sp_check_notification"))) {
                if (LibApm.INSTANCE.isWarmStart() && homeFragment.getActivity() != null) {
                    O6.c cVar = new O6.c(homeFragment.getActivity());
                    cVar.f6614u = 3;
                    cVar.f("Enable Notifications");
                    cVar.f6598d = "Enable notifications to receive payment status update and the latest news";
                    ViewOnClickListenerC0159a viewOnClickListenerC0159a = new ViewOnClickListenerC0159a(homeFragment, 2);
                    cVar.f6600f = "Enable";
                    cVar.f6602h = viewOnClickListenerC0159a;
                    cVar.c(p025ba.k.core_not_now, null);
                    O6.d dVarG = cVar.g();
                    HomeActivity homeActivity = (HomeActivity) homeFragment.getActivity();
                    if (homeActivity != null) {
                        homeActivity.showDialog(dVarG, 99);
                    }
                    p059e1.a.V(System.currentTimeMillis(), "main_sp_check_notification");
                }
                return Unit.f38893a;
            }
        }
        return Unit.f38893a;
    }
}
