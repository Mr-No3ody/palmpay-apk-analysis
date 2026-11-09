package p102ge;

import F6.d;
import android.widget.Toast;
import androidx.activity.z;
import com.didiglobal.booster.instrument.ShadowToast;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p025ba.a;

/* JADX INFO: renamed from: ge.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1745s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f37231b;

    public /* synthetic */ C1745s(HomeActivity homeActivity, int i7) {
        this.f37230a = i7;
        this.f37231b = homeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HomeActivity homeActivity = this.f37231b;
        switch (this.f37230a) {
            case 0:
                z addCallback = (z) obj;
                HomeActivity.a aVar = HomeActivity.f34463H;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                d.h(homeActivity.TAG, 3, d0.q("addOnBackPressedCallback: ", homeActivity.isTaskRoot()));
                if (homeActivity.f34466B == 0 || System.currentTimeMillis() - homeActivity.f34466B > 2000) {
                    homeActivity.f34466B = System.currentTimeMillis();
                    ShadowToast.show(Toast.makeText(homeActivity, "Click again to exit", 0));
                } else if (homeActivity.isTaskRoot()) {
                    homeActivity.finishAfterTransition();
                } else {
                    ActivityUtils.finishAllActivities(0, a.core_anim_slide_bottom_out);
                }
                return Unit.f38893a;
            default:
                String key = (String) obj;
                HomeActivity.a aVar2 = HomeActivity.f34463H;
                Intrinsics.checkNotNullParameter(key, "key");
                return homeActivity.getQueryParameter(key);
        }
    }
}
