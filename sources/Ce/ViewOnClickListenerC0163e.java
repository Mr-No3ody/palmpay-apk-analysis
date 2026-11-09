package Ce;

import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.ui.fragment.BankCardFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ce.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0163e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankCardFragment f1476b;

    public /* synthetic */ ViewOnClickListenerC0163e(BankCardFragment bankCardFragment, int i7) {
        this.f1475a = i7;
        this.f1476b = bankCardFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BankCardFragment bankCardFragment = this.f1476b;
        switch (this.f1475a) {
            case 0:
                int i7 = BankCardFragment.f35064B;
                ARouter aRouter = ARouter.getInstance();
                Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                Postcard postcardBuild = ARouter.getInstance().build("/account/authentication");
                Intrinsics.checkNotNullExpressionValue(postcardBuild, "build(...)");
                Pa.r0.x(aRouter, bankCardFragment, postcardBuild, 2);
                break;
            default:
                int i10 = BankCardFragment.f35064B;
                bankCardFragment.getClass();
                Pa.n0.g().q(new ClickEvent("banksandcardsPageaddnewcardClick"));
                ARouter.getInstance().build("/coreImpl/add_new_card").withBoolean("me_bind_bank_card", true).navigation();
                break;
        }
    }
}
