package F5;

import C0.G;
import N8.q0;
import Pa.i0;
import Pa.n0;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2591a;

    public /* synthetic */ b(int i7) {
        this.f2591a = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2591a) {
            case 0:
                System.exit(0);
                break;
            case 1:
                com.palmpay.lib.apm.launchcounter.util.d.x(null, "PalmPayPremium");
                n0.g().k(((ClickEvent) G.f("PremiumBenefits", "event_type", "Click_Event")).add("element_name", "PremiumBenefits_Reward_More"));
                break;
            case 4:
                q0.u("/contact/new_contacts_list");
                break;
            case 5:
                q0.u("/contact/new_contacts_list");
                break;
            case 6:
                i0.b0("/#/activity/faq/bind-card");
                break;
            case 8:
                User user = BaseApplication.getInstance().getUser();
                if (user != null && (user.shouldApplyForBalance() || user.getSvaStatus() == 2)) {
                    q0.u("/account/ask_apply_for_balance");
                } else {
                    ARouter.getInstance().build("/coreImpl/add_new_card").withBoolean("real_name_auth", true).navigation();
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
