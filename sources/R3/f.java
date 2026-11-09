package R3;

import android.view.View;
import androidx.fragment.app.E;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckWithFaceRecognitionFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlexiBankCheckWithFaceRecognitionFragment f7923b;

    public /* synthetic */ f(FlexiBankCheckWithFaceRecognitionFragment flexiBankCheckWithFaceRecognitionFragment, int i7) {
        this.f7922a = i7;
        this.f7923b = flexiBankCheckWithFaceRecognitionFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FlexiBankCheckWithFaceRecognitionFragment flexiBankCheckWithFaceRecognitionFragment = this.f7923b;
        switch (this.f7922a) {
            case 0:
                FlexiBankCheckWithFaceRecognitionFragment.a aVar = FlexiBankCheckWithFaceRecognitionFragment.f22037H;
                if ((flexiBankCheckWithFaceRecognitionFragment.getActivity() instanceof FlexiBankPayVerificationActivity) && !flexiBankCheckWithFaceRecognitionFragment.f22040C) {
                    E activity = flexiBankCheckWithFaceRecognitionFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity");
                    ((FlexiBankPayVerificationActivity) activity).g();
                } else {
                    E activity2 = flexiBankCheckWithFaceRecognitionFragment.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
                break;
            case 1:
                FlexiBankCheckWithFaceRecognitionFragment.a aVar2 = FlexiBankCheckWithFaceRecognitionFragment.f22037H;
                flexiBankCheckWithFaceRecognitionFragment.r();
                break;
            case 2:
                FlexiBankCheckWithFaceRecognitionFragment.a aVar3 = FlexiBankCheckWithFaceRecognitionFragment.f22037H;
                FlexiBankPayVerificationActivity flexiBankPayVerificationActivityN = flexiBankCheckWithFaceRecognitionFragment.n();
                if (flexiBankPayVerificationActivityN != null) {
                    flexiBankPayVerificationActivityN.verifyPayMethod("", 24);
                }
                break;
            case 3:
                FlexiBankCheckWithFaceRecognitionFragment.a aVar4 = FlexiBankCheckWithFaceRecognitionFragment.f22037H;
                FlexiBankPayVerificationActivity flexiBankPayVerificationActivityN2 = flexiBankCheckWithFaceRecognitionFragment.n();
                if (flexiBankPayVerificationActivityN2 != null) {
                    flexiBankPayVerificationActivityN2.verifyPayMethod("", 24);
                }
                break;
            case 4:
                FlexiBankCheckWithFaceRecognitionFragment.a aVar5 = FlexiBankCheckWithFaceRecognitionFragment.f22037H;
                flexiBankCheckWithFaceRecognitionFragment.r();
                break;
            default:
                FlexiBankCheckWithFaceRecognitionFragment.a aVar6 = FlexiBankCheckWithFaceRecognitionFragment.f22037H;
                E activity3 = flexiBankCheckWithFaceRecognitionFragment.getActivity();
                if (activity3 != null) {
                    activity3.finish();
                }
                break;
        }
    }
}
