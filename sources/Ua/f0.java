package Ua;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.viewmodel.ModelPaymentResultProgress;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends I9.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f9400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f9401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f9402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ModelPaymentResultProgress f9403h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ModelPaymentResultProgress modelPaymentResultProgress, View view) {
        super(view, 1);
        this.f9403h = modelPaymentResultProgress;
        this.f9400e = (TextView) this.f4276b.findViewById(p025ba.e.tvCountDown);
        this.f9401f = (TextView) this.f4276b.findViewById(p025ba.e.tvPendingMsg);
        ImageView imageView = (ImageView) this.f4276b.findViewById(p025ba.e.ivIcon);
        this.f9402g = (TextView) this.f4276b.findViewById(p025ba.e.tvClaimCoupon);
        if (BaseApplication.isNG()) {
            return;
        }
        imageView.setImageResource(com.transsnet.palmpay.custom_view.r.cv_result_pending);
    }

    @Override // I9.c
    public final void a(int i7) {
        I9.d dVar;
        super.a(i7);
        if (i7 == 0 || (dVar = this.f9403h.f28406f) == null) {
            return;
        }
        this.f9400e.removeCallbacks(dVar);
    }

    public final void b(long j6) {
        ModelPaymentResultProgress modelPaymentResultProgress = this.f9403h;
        I9.d dVar = modelPaymentResultProgress.f28406f;
        if (dVar != null) {
            this.f9400e.removeCallbacks(dVar);
        }
        TextView textView = this.f9400e;
        if (j6 <= 0) {
            textView.setText(p025ba.k.core_pending);
            return;
        }
        I9.d dVar2 = new I9.d(1);
        dVar2.f4280b = new WeakReference(textView);
        dVar2.f4281c = new WeakReference(this.f9401f);
        dVar2.f4282d = j6;
        modelPaymentResultProgress.f28406f = dVar2;
        textView.postDelayed(dVar2, 500L);
    }
}
