package p285sc;

import Z4.e;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnOrderLatestResp;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.model.ReferEarnTextSwitcherModel;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p103gf.a;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ReferEarnHomePageActivity f42223g;

    public /* synthetic */ k(ReferEarnHomePageActivity referEarnHomePageActivity, int i7) {
        this.f42222f = i7;
        this.f42223g = referEarnHomePageActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42222f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                a aVar = this.f42223g.f31881Y;
                if (aVar != null) {
                    aVar.add(d2);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                a aVar2 = this.f42223g.f31880X;
                if (aVar2 != null) {
                    aVar2.add(d2);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42222f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f42222f) {
            case 0:
                Object value = this.f42223g.f31883b.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setText((String) obj);
                break;
            default:
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42223g;
                referEarnHomePageActivity.f31879Q++;
                View nextView = referEarnHomePageActivity.n().getNextView();
                Intrinsics.f(nextView, "null cannot be cast to non-null type com.transsnet.palmpay.jara_packet.ui.model.ReferEarnTextSwitcherModel");
                ReferEarnTextSwitcherModel referEarnTextSwitcherModel = (ReferEarnTextSwitcherModel) nextView;
                int i7 = referEarnHomePageActivity.f31879Q;
                ArrayList arrayList = referEarnHomePageActivity.f31882Z;
                if (i7 < 0) {
                    referEarnHomePageActivity.f31879Q = arrayList.size() - 1;
                } else if (i7 >= arrayList.size()) {
                    referEarnHomePageActivity.f31879Q = 0;
                }
                if (arrayList.size() != 0) {
                    Object obj2 = arrayList.get(referEarnHomePageActivity.f31879Q);
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    referEarnTextSwitcherModel.setModel((ReferEarnOrderLatestResp) obj2);
                }
                referEarnHomePageActivity.n().setInAnimation(referEarnHomePageActivity, p236pc.a.slide_in_bottom);
                referEarnHomePageActivity.n().setOutAnimation(referEarnHomePageActivity, p236pc.a.slide_out_top);
                referEarnHomePageActivity.n().showNext();
                break;
        }
    }

    private final void R(String str) {
    }
}
