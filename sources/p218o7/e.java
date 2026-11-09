package p218o7;

import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import androidx.core.app.M;
import com.permissionx.guolindev.request.ChainTask;
import com.permissionx.guolindev.request.InvisibleFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InvisibleFragment f40072b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(InvisibleFragment invisibleFragment, int i7) {
        super(0);
        this.f40071a = i7;
        this.f40072b = invisibleFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40071a) {
            case 0:
                int i7 = Build.VERSION.SDK_INT;
                InvisibleFragment invisibleFragment = this.f40072b;
                if (i7 < 26) {
                    ChainTask chainTask = invisibleFragment.f24647c;
                    if (chainTask == null) {
                        Intrinsics.n("task");
                        throw null;
                    }
                    chainTask.finish();
                } else if (invisibleFragment.requireActivity().getPackageManager().canRequestPackageInstalls()) {
                    ChainTask chainTask2 = invisibleFragment.f24647c;
                    if (chainTask2 == null) {
                        Intrinsics.n("task");
                        throw null;
                    }
                    chainTask2.finish();
                } else if (invisibleFragment.f24646b == null) {
                    Intrinsics.n("pb");
                    throw null;
                }
                return Unit.f38893a;
            case 1:
                int i10 = Build.VERSION.SDK_INT;
                InvisibleFragment invisibleFragment2 = this.f40072b;
                if (i10 < 30) {
                    ChainTask chainTask3 = invisibleFragment2.f24647c;
                    if (chainTask3 == null) {
                        Intrinsics.n("task");
                        throw null;
                    }
                    chainTask3.finish();
                } else if (Environment.isExternalStorageManager()) {
                    ChainTask chainTask4 = invisibleFragment2.f24647c;
                    if (chainTask4 == null) {
                        Intrinsics.n("task");
                        throw null;
                    }
                    chainTask4.finish();
                } else if (invisibleFragment2.f24646b == null) {
                    Intrinsics.n("pb");
                    throw null;
                }
                return Unit.f38893a;
            case 2:
                int i11 = Build.VERSION.SDK_INT;
                InvisibleFragment invisibleFragment3 = this.f40072b;
                if (i11 < 26) {
                    ChainTask chainTask5 = invisibleFragment3.f24647c;
                    if (chainTask5 == null) {
                        Intrinsics.n("task");
                        throw null;
                    }
                    chainTask5.finish();
                } else if (new M(invisibleFragment3.requireContext()).f15943b.areNotificationsEnabled()) {
                    ChainTask chainTask6 = invisibleFragment3.f24647c;
                    if (chainTask6 == null) {
                        Intrinsics.n("task");
                        throw null;
                    }
                    chainTask6.finish();
                } else if (invisibleFragment3.f24646b == null) {
                    Intrinsics.n("pb");
                    throw null;
                }
                return Unit.f38893a;
            case 3:
                InvisibleFragment invisibleFragment4 = this.f40072b;
                if (Settings.System.canWrite(invisibleFragment4.requireContext())) {
                    ChainTask chainTask7 = invisibleFragment4.f24647c;
                    if (chainTask7 == null) {
                        Intrinsics.n("task");
                        throw null;
                    }
                    chainTask7.finish();
                } else {
                    h hVar = invisibleFragment4.f24646b;
                    if (hVar == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    if (hVar == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                }
                return Unit.f38893a;
            case 4:
                InvisibleFragment invisibleFragment5 = this.f40072b;
                if (invisibleFragment5.f()) {
                    invisibleFragment5.h(new e(invisibleFragment5, 0));
                }
                return Unit.f38893a;
            case 5:
                InvisibleFragment invisibleFragment6 = this.f40072b;
                if (invisibleFragment6.f()) {
                    invisibleFragment6.h(new e(invisibleFragment6, 1));
                }
                return Unit.f38893a;
            case 6:
                InvisibleFragment invisibleFragment7 = this.f40072b;
                if (invisibleFragment7.f()) {
                    invisibleFragment7.h(new e(invisibleFragment7, 2));
                }
                return Unit.f38893a;
            case 7:
                this.f40072b.g();
                return Unit.f38893a;
            default:
                InvisibleFragment invisibleFragment8 = this.f40072b;
                if (invisibleFragment8.f()) {
                    invisibleFragment8.h(new e(invisibleFragment8, 3));
                }
                return Unit.f38893a;
        }
    }
}
