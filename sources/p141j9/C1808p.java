package p141j9;

import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: j9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1808p extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpHomeActivity f38422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1808p(ScheduleTopUpHomeActivity scheduleTopUpHomeActivity, int i7) {
        super(0);
        this.f38421a = i7;
        this.f38422b = scheduleTopUpHomeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38421a) {
            case 0:
                return this.f38422b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f38422b.getViewModelStore();
            default:
                return this.f38422b.getDefaultViewModelCreationExtras();
        }
    }
}
