package Cd;

import Pa.n0;
import Pa.r0;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.send_money.ui.fragment.AddMobileContactFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddMobileContactFragment f1362b;

    public /* synthetic */ e(AddMobileContactFragment addMobileContactFragment, int i7) {
        this.f1361a = i7;
        this.f1362b = addMobileContactFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v3) {
        TextView textView;
        AddMobileContactFragment addMobileContactFragment = this.f1362b;
        switch (this.f1361a) {
            case 0:
                int i7 = AddMobileContactFragment.f33662C;
                ARouter.getInstance().build("/contact/local").navigation(addMobileContactFragment.requireActivity(), 1);
                n0.g().l("PalmPay_SendMoneyMobile_Btn_Contacts");
                break;
            case 1:
                int i10 = AddMobileContactFragment.f33662C;
                Intrinsics.checkNotNullParameter(v3, "v");
                addMobileContactFragment.w(v3);
                break;
            case 2:
                int i11 = AddMobileContactFragment.f33662C;
                Intrinsics.checkNotNullParameter(v3, "v");
                addMobileContactFragment.w(v3);
                break;
            case 3:
                int i12 = AddMobileContactFragment.f33662C;
                ARouter.getInstance().build("/contact/local").navigation(addMobileContactFragment.requireActivity(), 1);
                n0.g().l("PalmPay_SendMoneyMobile_Btn_Contacts");
                break;
            default:
                int i13 = AddMobileContactFragment.f33662C;
                Intrinsics.checkNotNullParameter(v3, "v");
                addMobileContactFragment.getClass();
                int iQ = r0.q(v3.getTag().toString());
                if (addMobileContactFragment.t != iQ) {
                    addMobileContactFragment.x(false);
                    addMobileContactFragment.t = iQ;
                    addMobileContactFragment.x(true);
                }
                p223od.l lVar = (p223od.l) addMobileContactFragment.f27335j;
                if (lVar != null && (textView = lVar.f40422v) != null) {
                    textView.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
