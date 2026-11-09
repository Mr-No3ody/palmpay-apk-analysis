package p141j9;

import com.transsnet.palmpay.airtime.ui.ScheduleTopUpTaskManagerActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpTaskManagerActivity f38424b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(ScheduleTopUpTaskManagerActivity scheduleTopUpTaskManagerActivity, int i7) {
        super(0);
        this.f38423a = i7;
        this.f38424b = scheduleTopUpTaskManagerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38423a) {
            case 0:
                return this.f38424b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f38424b.getViewModelStore();
            default:
                return this.f38424b.getDefaultViewModelCreationExtras();
        }
    }
}
