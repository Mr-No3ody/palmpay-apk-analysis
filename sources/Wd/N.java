package Wd;

import Pa.i0;
import Rd.C0602s;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.airtime.ui.AirtimeBillDetailActivity;
import com.transsnet.palmpay.airtime.ui.TopUpRecordActivity;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.ui.activity.JambHomeActivity;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class N extends p177m.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseMvvmActivity f10728b;

    public /* synthetic */ N(BaseMvvmActivity baseMvvmActivity, int i7) {
        this.f10727a = i7;
        this.f10728b = baseMvvmActivity;
    }

    @Override // p177m.b
    public final Intent createIntent(Context context, Object obj) {
        switch (this.f10727a) {
            case 0:
                Unit input = (Unit) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                Intent intentC = Pa.F.c(context, ARouter.getInstance().build("/contact/all").withString("orderType", "0"));
                Intrinsics.e(intentC);
                return intentC;
            default:
                String orderID = (String) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(orderID, "orderID");
                Intent intent = new Intent((TopUpRecordActivity) this.f10728b, (Class<?>) AirtimeBillDetailActivity.class);
                intent.putExtra("orderNo", orderID);
                return intent;
        }
    }

    @Override // p177m.b
    public final Object parseResult(int i7, Intent intent) {
        ModelNumberInputLayout modelNumberInputLayout;
        switch (this.f10727a) {
            case 0:
                if (intent != null) {
                    String stringExtra = intent.getStringExtra("PHONE_NUMBER");
                    intent.getStringExtra("contact_name");
                    intent.getStringExtra("contact_tag");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        int i10 = JambHomeActivity.f34222B;
                        C0602s c0602s = (C0602s) ((JambHomeActivity) this.f10728b).f27334c;
                        if (c0602s != null && (modelNumberInputLayout = c0602s.f8477f) != null) {
                            modelNumberInputLayout.setNumber(i0.j(stringExtra));
                        }
                    }
                }
                return Integer.valueOf(i7);
            default:
                if (i7 != -1 || intent == null) {
                    return null;
                }
                return intent.getStringExtra("orderNo");
        }
    }
}
