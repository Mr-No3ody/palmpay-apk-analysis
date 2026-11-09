package androidx.work.impl.constraints.trackers;

import V0.C;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X.c f18507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18508g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, androidx.work.impl.utils.taskexecutor.a taskExecutor, int i7) {
        super(context, taskExecutor);
        this.f18508g = i7;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f18507f = new X.c(this, 2);
    }

    @Override // androidx.work.impl.constraints.trackers.e
    public final Object a() {
        switch (this.f18508g) {
            case 0:
                Intent intentRegisterReceiver = this.f18513b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    C.c().a(b.f18509a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent intentRegisterReceiver2 = this.f18513b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    C.c().a(c.f18510a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                boolean z3 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                Intent intentRegisterReceiver3 = this.f18513b.registerReceiver(null, e());
                boolean z8 = true;
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z8 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z8 = false;
                    }
                }
                return Boolean.valueOf(z8);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.e
    public final void c() {
        C c6 = C.c();
        int i7 = d.f18511a;
        c6.getClass();
        this.f18513b.registerReceiver(this.f18507f, e());
    }

    @Override // androidx.work.impl.constraints.trackers.e
    public final void d() {
        C c6 = C.c();
        int i7 = d.f18511a;
        c6.getClass();
        this.f18513b.unregisterReceiver(this.f18507f);
    }

    public final IntentFilter e() {
        switch (this.f18508g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
