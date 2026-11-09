package p383zc;

import N8.r;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.req.CommonShareReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.jara_packet.api.JaraPacketApiService;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract;
import kotlin.jvm.internal.Intrinsics;
import p051d9.C1605b;
import p071ef.b;
import p254qc.a;
import p298tf.f;
import p323v9.d;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends j implements ReferEarnResolveContract.Presenter {
    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract.Presenter
    public final void queryReferEarnById(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ((JaraPacketApiService) a.f41475a.f35518b).queryReferEarnById(id2, Boolean.TRUE).k(f.f42629b).i(b.a()).subscribe(new t(this));
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract.Presenter
    public final void queryReferEarnRecords(String id2, int i7) {
        Intrinsics.checkNotNullParameter(id2, "id");
        J3.a.D(this, (ReferEarnResolveContract.View) this.f27351a, new u(i7, id2, null), new s(this, 3), new d(12), false, false);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract.Presenter
    public final void queryReferEarnWithDrawEnable(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        if (id2.length() == 0) {
            return;
        }
        J3.a.D(this, (ReferEarnResolveContract.View) this.f27351a, new v(id2, null), new C1605b(19, this, id2), new s(this, 2), false, true);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract.Presenter
    public final void queryResolveConfig() {
        ((JaraPacketApiService) a.f41475a.f35518b).queryResolveConfig().k(f.f42629b).i(b.a()).subscribe(new w(this));
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract.Presenter
    public final void referEarnWithDrawCreate(String str) {
        J3.a.D(this, (ReferEarnResolveContract.View) this.f27351a, new x(str, null), new s(this, 0), new s(this, 1), false, true);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract.Presenter
    public final void remindFriendsBySms(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        ((PayApiService) c.f43141a.f14621b).commonShare(new CommonShareReq(18)).i(b.a()).k(f.f42629b).subscribe(new r(16, phone, this));
    }
}
