package P3;

import android.view.View;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlexiBankPayVerificationActivity f6903b;

    public /* synthetic */ m(FlexiBankPayVerificationActivity flexiBankPayVerificationActivity, int i7) {
        this.f6902a = i7;
        this.f6903b = flexiBankPayVerificationActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FlexiBankPayVerificationActivity flexiBankPayVerificationActivity = this.f6903b;
        switch (this.f6902a) {
            case 0:
                int i7 = FlexiBankPayVerificationActivity.f21971Y;
                org.greenrobot.eventbus.c.b().f(new Y3.a(MessageEvent.EVENT_PAY_ERROR_CFRONT_TCE));
                flexiBankPayVerificationActivity.finish();
                break;
            case 1:
                int i10 = FlexiBankPayVerificationActivity.f21971Y;
                flexiBankPayVerificationActivity.finish();
                break;
            default:
                int i11 = FlexiBankPayVerificationActivity.f21971Y;
                flexiBankPayVerificationActivity.finish();
                break;
        }
    }
}
