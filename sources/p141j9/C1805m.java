package p141j9;

import C0.K;
import C0.P;
import Pd.c;
import androidx.activity.z;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1805m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpHomeActivity f38416b;

    public /* synthetic */ C1805m(ScheduleTopUpHomeActivity scheduleTopUpHomeActivity, int i7) {
        this.f38415a = i7;
        this.f38416b = scheduleTopUpHomeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        P p3;
        K kE;
        P p10;
        K kE2;
        ScheduleTopUpHomeActivity scheduleTopUpHomeActivity = this.f38416b;
        switch (this.f38415a) {
            case 0:
                z addCallback = (z) obj;
                int i7 = ScheduleTopUpHomeActivity.f26471i;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                scheduleTopUpHomeActivity.finish();
                break;
            default:
                List list = (List) obj;
                int i10 = ScheduleTopUpHomeActivity.f26471i;
                Intrinsics.e(list);
                if (list.isEmpty()) {
                    P p11 = scheduleTopUpHomeActivity.f26475g;
                    if ((p11 == null || (kE = p11.e()) == null || kE.f961i != c.fragmentGuide) && (p3 = scheduleTopUpHomeActivity.f26475g) != null) {
                        p3.h(c.fragmentGuide, null, null);
                    }
                } else {
                    P p12 = scheduleTopUpHomeActivity.f26475g;
                    if ((p12 == null || (kE2 = p12.e()) == null || kE2.f961i != c.fragmentManager) && (p10 = scheduleTopUpHomeActivity.f26475g) != null) {
                        p10.h(c.fragmentManager, null, null);
                    }
                }
                break;
        }
        return Unit.f38893a;
    }
}
