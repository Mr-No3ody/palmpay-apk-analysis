package I9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.cash_in.ui.view.ModelFundPaymentResultProgress;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.r;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f4285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f4286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ModelFundPaymentResultProgress f4287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ModelFundPaymentResultProgress modelFundPaymentResultProgress, View view) {
        super(view, 0);
        this.f4287g = modelFundPaymentResultProgress;
        this.f4285e = (TextView) this.f4276b.findViewById(p366y9.b.tvCountDown);
        this.f4286f = (TextView) this.f4276b.findViewById(p366y9.b.tvPendingMsg);
        ImageView imageView = (ImageView) this.f4276b.findViewById(p366y9.b.ivIcon);
        if (BaseApplication.isNG()) {
            return;
        }
        imageView.setImageResource(r.cv_result_pending);
    }

    @Override // I9.c
    public final void a(int i7) {
        d dVar;
        super.a(i7);
        if (i7 == 0 || (dVar = this.f4287g.f27080f) == null) {
            return;
        }
        this.f4285e.removeCallbacks(dVar);
    }
}
