package p310ub;

import android.view.View;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcPromotionActivity;
import p071ef.b;
import p221ob.c;
import p294tb.C2055q;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class B0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcPromotionActivity f42739b;

    public /* synthetic */ B0(OcPromotionActivity ocPromotionActivity, int i7) {
        this.f42738a = i7;
        this.f42739b = ocPromotionActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OcPromotionActivity ocPromotionActivity = this.f42739b;
        switch (this.f42738a) {
            case 0:
                int i7 = OcPromotionActivity.f29641j;
                ocPromotionActivity.finish();
                break;
            case 1:
                int i10 = OcPromotionActivity.f29641j;
                ocPromotionActivity.showLoadingDialog(true);
                c.f40268a.getInstance().getClass();
                c.a().okCardMainPage("0").k(f.f42629b).i(b.a()).subscribe(new C2055q(ocPromotionActivity, 23));
                break;
            default:
                int i11 = OcPromotionActivity.f29641j;
                ocPromotionActivity.finish();
                break;
        }
    }
}
