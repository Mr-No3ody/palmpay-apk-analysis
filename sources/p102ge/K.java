package p102ge;

import F6.d;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.transsnet.palmpay.ui.activity.RateAppActivity;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class K implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RateAppActivity.RateFragment f37195b;

    public /* synthetic */ K(RateAppActivity.RateFragment rateFragment, int i7) {
        this.f37194a = i7;
        this.f37195b = rateFragment;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        RateAppActivity.RateFragment rateFragment = this.f37195b;
        switch (this.f37194a) {
            case 0:
                RateAppActivity.RateFragment.a aVar = RateAppActivity.RateFragment.f34562d;
                ToastUtils.showShort("You have already rated. Thank you for your participation", new Object[0]);
                d.c("feedbackLog", "feedback: mReviewInfo complete---->");
                rateFragment.g();
                break;
            default:
                RateAppActivity.RateFragment.a aVar2 = RateAppActivity.RateFragment.f34562d;
                d.c("feedbackLog", "feedback: complete---->");
                rateFragment.g();
                break;
        }
    }
}
