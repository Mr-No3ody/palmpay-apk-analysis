package p383zc;

import J3.a;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.jara_packet.api.JaraPacketApiService;
import com.transsnet.palmpay.jara_packet.bean.resp.CommentResp;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnRankContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends j implements ReferEarnRankContract.Presenter {
    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnRankContract.Presenter
    public final void queryComment() {
        ReferEarnRankContract.View view = (ReferEarnRankContract.View) this.f27351a;
        o oVar = new o(1, null);
        final int i7 = 0;
        Function1 function1 = new Function1(this) { // from class: zc.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f44654b;

            {
                this.f44654b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        CommonBeanResult<CommentResp> response = (CommonBeanResult) obj;
                        Intrinsics.checkNotNullParameter(response, "response");
                        boolean zIsSuccess = response.isSuccess();
                        r rVar = this.f44654b;
                        if (zIsSuccess) {
                            ((ReferEarnRankContract.View) rVar.f27351a).commentListResult(response);
                        } else {
                            ReferEarnRankContract.View view2 = (ReferEarnRankContract.View) rVar.f27351a;
                            String respMsg = response.getRespMsg();
                            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                            view2.showToastDialog(respMsg);
                        }
                        break;
                    default:
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            ReferEarnRankContract.View view3 = (ReferEarnRankContract.View) this.f44654b.f27351a;
                            Intrinsics.e(str);
                            view3.showToastDialog(str);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        };
        final int i10 = 1;
        a.D(this, view, oVar, function1, new Function1(this) { // from class: zc.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f44654b;

            {
                this.f44654b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        CommonBeanResult<CommentResp> response = (CommonBeanResult) obj;
                        Intrinsics.checkNotNullParameter(response, "response");
                        boolean zIsSuccess = response.isSuccess();
                        r rVar = this.f44654b;
                        if (zIsSuccess) {
                            ((ReferEarnRankContract.View) rVar.f27351a).commentListResult(response);
                        } else {
                            ReferEarnRankContract.View view2 = (ReferEarnRankContract.View) rVar.f27351a;
                            String respMsg = response.getRespMsg();
                            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                            view2.showToastDialog(respMsg);
                        }
                        break;
                    default:
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            ReferEarnRankContract.View view3 = (ReferEarnRankContract.View) this.f44654b.f27351a;
                            Intrinsics.e(str);
                            view3.showToastDialog(str);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, false, false);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnRankContract.Presenter
    public final void queryPersonalRank() {
        ((JaraPacketApiService) p254qc.a.f41475a.f35518b).queryPersonalRank().k(f.f42629b).i(b.a()).subscribe(new p(this));
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnRankContract.Presenter
    public final void queryRankList() {
        ((JaraPacketApiService) p254qc.a.f41475a.f35518b).queryRankList(1, 10).k(f.f42629b).i(b.a()).subscribe(new q(this));
    }
}
