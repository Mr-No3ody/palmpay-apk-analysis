package p383zc;

import Ce.C0181x;
import J3.a;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract;
import kotlin.jvm.internal.Intrinsics;
import p323v9.d;
import x9.u;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends j implements ReferEarnHomePageContract.Presenter {
    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.Presenter
    public final void commentList() {
        a.D(this, (ReferEarnHomePageContract.View) this.f27351a, new d(1, null), new b(this, 7), new b(this, 8), false, false);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.Presenter
    public final void queryOrderLatest() {
        a.D(this, (ReferEarnHomePageContract.View) this.f27351a, new e(1, null), new b(this, 0), new d(9), false, false);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.Presenter
    public final void queryReInviteList() {
        a.D(this, (ReferEarnHomePageContract.View) this.f27351a, new f(1, null), new b(this, 5), new d(8), false, false);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.Presenter
    public final void queryReferEarnHome() {
        a.D(this, (ReferEarnHomePageContract.View) this.f27351a, new g(1, null), new b(this, 9), new d(11), false, true);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.Presenter
    public final void queryReferEarnPop() {
        a.D(this, this.f27351a, new h(1, null), new b(this, 3), new b(this, 4), false, true);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.Presenter
    public final void queryReferEarnRecords(String id2, int i7, int i10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        a.D(this, (ReferEarnHomePageContract.View) this.f27351a, new i(id2, i7, i10, null), new b(this, 6), new d(10), false, false);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.Presenter
    public final void queryReferEarnSms(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        a.B(this, (ReferEarnHomePageContract.View) this.f27351a, new u(9), new C0181x(phone, 4), new d(7), false, true);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.Presenter
    public final void queryReferEarnWithDrawEnable(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a.D(this, this.f27351a, new j(str, null), new c(this, str, 2), new b(this, 10), false, true);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.Presenter
    public final void referEarnWithDrawCreate(String str) {
        a.D(this, this.f27351a, new k(str, null), new b(this, 1), new b(this, 2), false, true);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.Presenter
    public final void updateReInviteIsInvite(Long l5, String str) {
        if (l5 != null) {
            a.D(this, (ReferEarnHomePageContract.View) this.f27351a, new l(l5, null), new c(this, str, 0), new c(this, str, 1), false, false);
            return;
        }
        ReferEarnHomePageContract.View view = (ReferEarnHomePageContract.View) this.f27351a;
        if (view != null) {
            view.onUpdateReInviteIsInviteDone(str);
        }
    }
}
