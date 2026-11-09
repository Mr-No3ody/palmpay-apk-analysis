package p7;

import C9.V;
import Pa.i0;
import android.os.Handler;
import android.os.StrictMode;
import com.facebook.datasource.DataSubscriber;
import com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelView;
import com.google.api.Service;
import com.hjq.toast.config.IToast;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import com.transsnet.palmpay.main.export.bean.req.ThirdAuthorizationCodeReq;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdPartyMerchantListResp;
import com.transsnet.palmpay.send_money.ui.activity.QrcodeScanActivity;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateV2Activity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferHomeActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferPaymentSelectActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableOrderListActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankAccountActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayHomeActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.TransferViaUssdActivity;
import com.transsnet.palmpay.ui.activity.settings.PersonalActivityV2;
import com.transsnet.palmpay.ui.activity.settings.SettingsActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import com.transsnet.palmpay.ui.activity.welcome.WelcomeNewUserActivity;
import com.transsnet.palmpay.ui.dialog.MerchantAuthorizationDialog;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.coroutines.Continuation;
import p025ba.k;
import p141j9.B;
import p355xf.o;
import p355xf.q;
import p377z5.j;
import retrofit2.r;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41269c;

    public /* synthetic */ h(int i7, Object obj, Object obj2) {
        this.f41267a = i7;
        this.f41269c = obj;
        this.f41268b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 17;
        int i10 = 14;
        int i11 = 0;
        Object[] objArr = 0;
        Object obj = this.f41268b;
        Object obj2 = this.f41269c;
        switch (this.f41267a) {
            case 0:
                i iVar = (i) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    iVar.a();
                }
            case 1:
                ((Handler) obj).post(new B((QrcodeScanActivity) obj2, 8));
                return;
            case 2:
                ((Handler) obj).post(new B((TradeRecordDetailActivity) obj2, 9));
                return;
            case 3:
                ((Handler) obj).post(new B((TransferResultActivity) obj2, 10));
                return;
            case 4:
                Continuation continuationB = Ef.f.b((r) obj);
                o oVar = q.f43977a;
                continuationB.resumeWith(androidx.camera.core.impl.utils.executor.g.f((Throwable) obj2));
                return;
            case 5:
                ((Handler) obj).post(new B((BettingHomeActivity) obj2, 13));
                return;
            case 6:
                ((Handler) obj).post(new B((PayShopPaymentResultActivity) obj2, i10));
                return;
            case 7:
                ((Handler) obj).post(new B((PersonalActivityV2) obj2, i7));
                return;
            case 8:
                ((Handler) obj).post(new B((SettingsActivity) obj2, 18));
                return;
            case 9:
                ThirdPartyMerchantActivity thirdPartyMerchantActivity = ((p297te.h) obj2).f42614a;
                int i12 = ThirdPartyMerchantActivity.f34991g;
                ThirdAuthorizationCodeReq thirdAuthorizationCodeReq = (ThirdAuthorizationCodeReq) obj;
                if (ThirdAuthorizationCodeReq.SCOPE_TYPE_BASE.equals(thirdAuthorizationCodeReq.getScope()) || ThirdAuthorizationCodeReq.SCOPE_TYPE_SUPER.equals(thirdAuthorizationCodeReq.getScope())) {
                    thirdPartyMerchantActivity.m(thirdAuthorizationCodeReq, thirdAuthorizationCodeReq.getCallbackID());
                    return;
                }
                ThirdPartyMerchantListResp.ThirdPartyMerchant thirdPartyMerchant = thirdPartyMerchantActivity.f34994c;
                String merchantName = thirdPartyMerchant != null ? thirdPartyMerchant.getMerchantName() : thirdAuthorizationCodeReq.getMerchantId();
                String string = thirdPartyMerchantActivity.getString("0".equals(thirdAuthorizationCodeReq.getPrivateLevel()) ? k.core_merchant_authorization_info_1 : k.core_merchant_authorization_info_2);
                p185ma.e eVar = new p185ma.e(thirdPartyMerchantActivity, i10);
                V v3 = new V(thirdPartyMerchantActivity, i7, thirdAuthorizationCodeReq, objArr == true ? 1 : 0);
                MerchantAuthorizationDialog merchantAuthorizationDialog = new MerchantAuthorizationDialog(thirdPartyMerchantActivity, Ac.f.main_merchant_authorization_dialog);
                merchantAuthorizationDialog.setAvatar(null);
                merchantAuthorizationDialog.setMerchantNameDesc(thirdPartyMerchantActivity.getString(k.core_merchant_name_format, merchantName));
                merchantAuthorizationDialog.setMessage(string);
                merchantAuthorizationDialog.setNegativeButtonListener(eVar);
                merchantAuthorizationDialog.setPositiveButtonListener(v3);
                merchantAuthorizationDialog.setCancelable(false);
                merchantAuthorizationDialog.setCanceledOnTouchOutside(false);
                if (i0.W(thirdPartyMerchantActivity)) {
                    merchantAuthorizationDialog.show();
                    return;
                }
                return;
            case 10:
                ThirdPartyMerchantActivity thirdPartyMerchantActivity2 = ((p297te.h) obj2).f42614a;
                int i13 = ThirdPartyMerchantActivity.f34991g;
                O6.c cVar = new O6.c(thirdPartyMerchantActivity2);
                cVar.e(k.core_title_error_info);
                cVar.f6598d = (String) obj;
                cVar.f6605k = true;
                cVar.f6600f = thirdPartyMerchantActivity2.getString(k.core_confirm);
                cVar.f6602h = null;
                O6.d dVarA = cVar.a();
                if (i0.W(thirdPartyMerchantActivity2)) {
                    dVarA.setCancelable(false);
                    dVarA.setCanceledOnTouchOutside(false);
                    dVarA.show();
                    return;
                }
                return;
            case 11:
                ((Handler) obj).post(new B((ScheduleTransferCreateActivity) obj2, 21));
                return;
            case 12:
                ((Handler) obj).post(new B((ScheduleTransferCreateV2Activity) obj2, 22));
                return;
            case 13:
                ((Handler) obj).post(new B((ScheduleTransferHomeActivity) obj2, 23));
                return;
            case 14:
                ((Handler) obj).post(new B((ScheduleTransferPaymentSelectActivity) obj2, 24));
                return;
            case 15:
                ((Handler) obj).post(new B((WelcomeNewUserActivity) obj2, 25));
                return;
            case 16:
                FlexiBankWheelView flexiBankWheelView = (FlexiBankWheelView) obj;
                flexiBankWheelView.setWheelData((List) obj2);
                super/*android.widget.ListView*/.setSelection(flexiBankWheelView.f22285f);
                FlexiBankWheelView.b(flexiBankWheelView, true);
                return;
            case 17:
                ((Handler) obj).post(new B((ScheduleTransferForBankUnstableDetailActivity) obj2, 26));
                return;
            case 18:
                ((Handler) obj).post(new B((ScheduleTransferForBankUnstableOrderListActivity) obj2, 27));
                return;
            case 19:
                ((Handler) obj).post(new B((SelectBankForToBankActivity) obj2, 28));
                return;
            case 20:
                ((Handler) obj).post(new B((TransferToBankAccountActivity) obj2, 29));
                return;
            case 21:
                ((Handler) obj).post(new p353xd.B((TransferToBankInputAmountActivity) obj2, i11));
                return;
            case 22:
                p359y1.a aVar = (p359y1.a) obj2;
                if (aVar.f44026d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) obj).run();
                    return;
                } catch (Throwable th) {
                    aVar.f44025c.handle(th);
                    return;
                }
            case 23:
                ((DataSubscriber) obj).onProgressUpdate((p360y2.b) obj2);
                return;
            case 24:
                ((Handler) obj).post(new p353xd.B((TransferToPalmPayHomeActivity) obj2, 2));
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((Handler) obj).post(new p353xd.B((TransferToPalmPayInputAmountActivity) obj2, 3));
                return;
            case 26:
                p377z5.k kVar = (p377z5.k) obj2;
                WeakReference weakReference = kVar.f44477b;
                IToast iToast = weakReference != null ? (IToast) weakReference.get() : null;
                if (iToast != null) {
                    iToast.cancel();
                }
                j jVar = (j) obj;
                IToast iToastCreateToast = kVar.createToast(jVar);
                kVar.f44477b = new WeakReference(iToastCreateToast);
                iToastCreateToast.setDuration(jVar.f44471b);
                iToastCreateToast.setText(jVar.f44470a);
                iToastCreateToast.show();
                return;
            default:
                ((Handler) obj).post(new p353xd.B((TransferViaUssdActivity) obj2, 6));
                return;
        }
    }

    public /* synthetic */ h(Object obj, int i7, Object obj2, boolean z3) {
        this.f41267a = i7;
        this.f41268b = obj;
        this.f41269c = obj2;
    }
}
