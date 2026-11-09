package p207ne;

import Ac.h;
import L6.b;
import android.view.View;
import androidx.fragment.app.Z;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.custom_view.dialog.c;
import com.transsnet.palmpay.custom_view.dialog.v;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MinorAccountDetailActivity f39944b;

    public /* synthetic */ e(MinorAccountDetailActivity minorAccountDetailActivity, int i7) {
        this.f39943a = i7;
        this.f39944b = minorAccountDetailActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MinorAccountDetailActivity minorAccountDetailActivity = this.f39944b;
        switch (this.f39943a) {
            case 0:
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, new v(minorAccountDetailActivity.getString(h.main_minor_extend_authorization)), new v(minorAccountDetailActivity.getString(h.main_minor_extend_confirm), 14.0f, b.ppColorTextNormal), new c(minorAccountDetailActivity.getString(k.core_cancel)), new c(minorAccountDetailActivity.getString(h.main_minor_extend), new a(minorAccountDetailActivity, 2)), null, 16, null);
                Z supportFragmentManager = minorAccountDetailActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showCommonTipsDialog");
                break;
            case 1:
                minorAccountDetailActivity.p();
                break;
            default:
                int i7 = MinorAccountDetailActivity.f34759g;
                d.H("/sm/palmpay_personal_transfer", "MEMBER_ID", minorAccountDetailActivity.o());
                break;
        }
    }
}
