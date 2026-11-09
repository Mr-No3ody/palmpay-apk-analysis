package J3;

import android.content.Context;
import android.content.Intent;
import com.flexibank.sdk.cashier.bean.FlexiBankPayByOrderResp;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankCashierCommonPreviewActivity;
import com.flexibank.sdk.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p177m.b {
    @Override // p177m.b
    public final Intent createIntent(Context context, Object obj) {
        d input = (d) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        k kVar = k.f22317a;
        k.d();
        Intent intentPutExtra = new Intent(context, (Class<?>) FlexiBankCashierCommonPreviewActivity.class).putExtra("mOrderNo", input.f4494a).putExtra("mTransType", input.f4495b).putExtra("mSubTransType", input.f4496c).putExtra("mOrderAmount", input.f4497d).putExtra("mCustomerId", input.f4498e).putExtra("mPayeeAccountType", input.f4499f).putExtra("mCalculationExtInfo", input.f4500g).putExtra("flexibank_sdk_show_cashier_preview", input.f4502i);
        List list = input.f4501h;
        ArrayList arrayList = new ArrayList(r.l(list, 10));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                throw null;
            }
            throw new ClassCastException();
        }
        Intent intentPutParcelableArrayListExtra = intentPutExtra.putParcelableArrayListExtra("mExtras", new ArrayList<>(arrayList));
        Intrinsics.checkNotNullExpressionValue(intentPutParcelableArrayListExtra, "putParcelableArrayListExtra(...)");
        return intentPutParcelableArrayListExtra;
    }

    @Override // p177m.b
    public final Object parseResult(int i7, Intent intent) {
        if (i7 != -1 || intent == null) {
            return new e(f.f4512b, null, null, null, null, null, null, null, 254);
        }
        String stringExtra = intent.getStringExtra("flexibank_sdk_error_code");
        if (stringExtra != null && stringExtra.length() != 0) {
            return new e(f.f4513c, null, null, null, null, null, stringExtra, intent.getStringExtra("flexibank_sdk_error_msg"), 62);
        }
        FlexiBankPayByOrderResp.DataBean dataBean = (FlexiBankPayByOrderResp.DataBean) intent.getParcelableExtra("flexibank_sdk_pay_result");
        return dataBean == null ? new e(f.f4513c, null, null, null, null, null, null, "Cashier returned no payment result", 126) : new e(f.f4511a, dataBean.getOrderNo(), Integer.valueOf(dataBean.getPayStatus()), dataBean.getPayStatusDesc(), dataBean.getChannelTransactionId(), dataBean.getBusinessData(), null, dataBean.getErrorMsg(), 64);
    }
}
