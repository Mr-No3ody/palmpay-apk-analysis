package p218o7;

import com.permissionx.guolindev.request.ChainTask;
import com.permissionx.guolindev.request.InvisibleFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f40069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InvisibleFragment f40070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(boolean z3, InvisibleFragment invisibleFragment, int i7) {
        super(0);
        this.f40068a = i7;
        this.f40069b = z3;
        this.f40070c = invisibleFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40068a) {
            case 0:
                InvisibleFragment invisibleFragment = this.f40070c;
                if (this.f40069b) {
                    h hVar = invisibleFragment.f24646b;
                    if (hVar == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    hVar.f40081f.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                    h hVar2 = invisibleFragment.f24646b;
                    if (hVar2 == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    hVar2.f40082g.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                    h hVar3 = invisibleFragment.f24646b;
                    if (hVar3 == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    hVar3.f40083h.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                    ChainTask chainTask = invisibleFragment.f24647c;
                    if (chainTask == null) {
                        Intrinsics.n("task");
                        throw null;
                    }
                    chainTask.finish();
                } else {
                    invisibleFragment.shouldShowRequestPermissionRationale("android.permission.ACCESS_BACKGROUND_LOCATION");
                    if (invisibleFragment.f24646b == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    ChainTask chainTask2 = invisibleFragment.f24647c;
                    if (chainTask2 == null) {
                        Intrinsics.n("task");
                        throw null;
                    }
                    chainTask2.finish();
                }
                return Unit.f38893a;
            default:
                InvisibleFragment invisibleFragment2 = this.f40070c;
                if (this.f40069b) {
                    h hVar4 = invisibleFragment2.f24646b;
                    if (hVar4 == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    hVar4.f40081f.add("android.permission.BODY_SENSORS_BACKGROUND");
                    h hVar5 = invisibleFragment2.f24646b;
                    if (hVar5 == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    hVar5.f40082g.remove("android.permission.BODY_SENSORS_BACKGROUND");
                    h hVar6 = invisibleFragment2.f24646b;
                    if (hVar6 == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    hVar6.f40083h.remove("android.permission.BODY_SENSORS_BACKGROUND");
                    ChainTask chainTask3 = invisibleFragment2.f24647c;
                    if (chainTask3 == null) {
                        Intrinsics.n("task");
                        throw null;
                    }
                    chainTask3.finish();
                } else {
                    invisibleFragment2.shouldShowRequestPermissionRationale("android.permission.BODY_SENSORS_BACKGROUND");
                    if (invisibleFragment2.f24646b == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    ChainTask chainTask4 = invisibleFragment2.f24647c;
                    if (chainTask4 == null) {
                        Intrinsics.n("task");
                        throw null;
                    }
                    chainTask4.finish();
                }
                return Unit.f38893a;
        }
    }
}
