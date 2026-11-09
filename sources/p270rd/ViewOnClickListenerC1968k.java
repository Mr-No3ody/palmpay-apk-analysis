package p270rd;

import Pa.i0;
import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.core.bean.rsp.ParseInstalmentsQrcodeRsp;
import com.transsnet.palmpay.credit.ui.activity.InputAmountActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopHomeActivity;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: rd.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC1968k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParseInstalmentsQrcodeRsp.DataBean f41755b;

    public /* synthetic */ ViewOnClickListenerC1968k(ParseInstalmentsQrcodeRsp.DataBean dataBean, int i7) {
        this.f41754a = i7;
        this.f41755b = dataBean;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        ParseInstalmentsQrcodeRsp.DataBean dataBean = this.f41755b;
        switch (this.f41754a) {
            case 0:
                int i7 = PayShopInputAmountActivity.f33176p;
                String str2 = dataBean.jumpUrl;
                if (str2 != null) {
                    str = TextUtils.isEmpty(str2) ? null : str2;
                    if (str != null) {
                        i0.b0(str);
                    }
                }
                break;
            case 1:
                int i10 = WithdrawInputAmountActivity.f33293p;
                String str3 = dataBean.jumpUrl;
                if (str3 != null) {
                    str = TextUtils.isEmpty(str3) ? null : str3;
                    if (str != null) {
                        i0.b0(str);
                    }
                }
                break;
            case 2:
                KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                String str4 = dataBean.jumpUrl;
                if (str4 != null) {
                    str = TextUtils.isEmpty(str4) ? null : str4;
                    if (str != null) {
                        i0.b0(str);
                    }
                }
                break;
            default:
                int i11 = PayShopHomeActivity.f28705p0;
                i0.b0(dataBean.url);
                break;
        }
    }
}
