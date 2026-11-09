package Ad;

import Pa.n0;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.util.SPUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends com.transsnet.palmpay.custom_view.dialog.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final G f164i = new G(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p353xd.C f170g;

    public static void b(String str) {
        ClickEvent clickEvent = new ClickEvent(str);
        User user = BaseApplication.get().getUser();
        n0.g().k(clickEvent.add("memberId", user != null ? user.getMemberId() : null));
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.a, android.app.Dialog
    public final void show() {
        SPUtils.get().put("finance_guidance_last_day", f164i.todayString());
        int i7 = SPUtils.get().getInt("finance_guidance_week_count", 0);
        if (i7 < 3) {
            SPUtils.get().put("finance_guidance_week_count", i7 + 1);
        }
        n0 n0VarG = n0.g();
        ViewEvent viewEvent = new ViewEvent("TransferSavingPopup_view");
        User user = BaseApplication.get().getUser();
        n0VarG.u(viewEvent.add("memberId", user != null ? user.getMemberId() : null));
        super.show();
    }
}
