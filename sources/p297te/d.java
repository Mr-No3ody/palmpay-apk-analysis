package p297te;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.transsnet.palmpay.core.bean.message.TPMerchantPaymentMsg;
import com.transsnet.palmpay.core.util.PayStringUtils$OperatorType;
import com.transsnet.palmpay.core.util.PayStringUtils$USSDCode;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.TPMerchantPaymentResultActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import org.greenrobot.eventbus.c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TPMerchantPaymentResultActivity f42609b;

    public /* synthetic */ d(TPMerchantPaymentResultActivity tPMerchantPaymentResultActivity, int i7) {
        this.f42608a = i7;
        this.f42609b = tPMerchantPaymentResultActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        byte b7 = 0;
        TPMerchantPaymentResultActivity tPMerchantPaymentResultActivity = this.f42609b;
        switch (this.f42608a) {
            case 0:
                int i7 = TPMerchantPaymentResultActivity.f34980p;
                tPMerchantPaymentResultActivity.l(view);
                break;
            case 1:
                int i10 = TPMerchantPaymentResultActivity.f34980p;
                tPMerchantPaymentResultActivity.l(view);
                break;
            case 2:
                int i11 = TPMerchantPaymentResultActivity.f34980p;
                tPMerchantPaymentResultActivity.getClass();
                c.b().f(new TPMerchantPaymentMsg(tPMerchantPaymentResultActivity.f34988i));
                if (ActivityUtils.isActivityExistsInStack((Class<?>) ThirdPartyMerchantActivity.class)) {
                    ActivityUtils.finishToActivity((Class<?>) ThirdPartyMerchantActivity.class, false);
                }
                break;
            default:
                int i12 = TPMerchantPaymentResultActivity.f34980p;
                Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
                if (activityIsActivityExistsInStack != null) {
                    ActivityUtils.finishToActivity(activityIsActivityExistsInStack, false);
                }
                StringBuilder sb2 = new StringBuilder("tel:");
                String payerWalletChannel = tPMerchantPaymentResultActivity.f34990o.getPayerWalletChannel();
                payerWalletChannel.getClass();
                switch (payerWalletChannel.hashCode()) {
                    case -1334844874:
                        if (!payerWalletChannel.equals(PayStringUtils$OperatorType.VODAFONE)) {
                            b7 = -1;
                        }
                        break;
                    case 76679:
                        b7 = !payerWalletChannel.equals(PayStringUtils$OperatorType.MTN) ? (byte) -1 : (byte) 1;
                        break;
                    case 2574877:
                        b7 = !payerWalletChannel.equals(PayStringUtils$OperatorType.AIRTELTIGO) ? (byte) -1 : (byte) 2;
                        break;
                    default:
                        b7 = -1;
                        break;
                }
                switch (b7) {
                    case 0:
                        str = PayStringUtils$USSDCode.VODAFONE;
                        break;
                    case 1:
                        str = PayStringUtils$USSDCode.MTN;
                        break;
                    case 2:
                        str = PayStringUtils$USSDCode.AIRTELTIGO;
                        break;
                    default:
                        str = "";
                        break;
                }
                sb2.append(Uri.encode(str));
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(sb2.toString()));
                intent.setFlags(268435456);
                tPMerchantPaymentResultActivity.startActivity(intent);
                break;
        }
    }
}
