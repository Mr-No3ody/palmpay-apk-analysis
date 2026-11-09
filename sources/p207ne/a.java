package p207ne;

import Pe.P;
import Pe.U;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountDetailActivity;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.viewmodule.MinorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MinorAccountDetailActivity f39936b;

    public /* synthetic */ a(MinorAccountDetailActivity minorAccountDetailActivity, int i7) {
        this.f39935a = i7;
        this.f39936b = minorAccountDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MinorAccountDetailActivity minorAccountDetailActivity = this.f39936b;
        switch (this.f39935a) {
            case 0:
                int i7 = MinorAccountDetailActivity.f34759g;
                MinorViewModel minorViewModel = (MinorViewModel) minorAccountDetailActivity.l();
                String teenMemberId = minorAccountDetailActivity.o();
                minorViewModel.getClass();
                Intrinsics.checkNotNullParameter(teenMemberId, "teenMemberId");
                f.s(minorViewModel, new U(teenMemberId, null), minorViewModel.f35383o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return Unit.f38893a;
            case 1:
                int i10 = MinorAccountDetailActivity.f34759g;
                String stringExtra = minorAccountDetailActivity.getIntent().getStringExtra("teenMemberId");
                if (stringExtra != null) {
                    return stringExtra;
                }
                ToastUtils.showLong("param is not null", new Object[0]);
                minorAccountDetailActivity.finish();
                return "";
            default:
                int i11 = MinorAccountDetailActivity.f34759g;
                MinorViewModel minorViewModel2 = (MinorViewModel) minorAccountDetailActivity.l();
                String teenMemberId2 = minorAccountDetailActivity.o();
                minorViewModel2.getClass();
                Intrinsics.checkNotNullParameter(teenMemberId2, "teenMemberId");
                f.s(minorViewModel2, new P(teenMemberId2, null), minorViewModel2.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return Unit.f38893a;
        }
    }
}
