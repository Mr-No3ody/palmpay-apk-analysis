package com.transsnet.palmpay.ui.activity.qr;

import Ac.e;
import Ac.f;
import Fe.f0;
import O6.d;
import Pa.i0;
import V9.C0714c;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.didiglobal.booster.instrument.ShadowHandlerThread;
import com.didiglobal.booster.instrument.ShadowThread;
import com.transsnet.analysis.utils.GsonUtil;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.PayMerchantOrderPushData;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.req.QrcodeGenerateReq;
import com.transsnet.palmpay.core.bean.rsp.QrcodeGenerateResp;
import com.transsnet.palmpay.core.dialog.SelectPayMethodDialog;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import com.transsnet.palmpay.core.viewmodel.ModelPreviewPaymentMethodItem;
import com.transsnet.palmpay.ui.activity.qr.QrCodePayMoneyFragment;
import com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView;
import com.transsnet.palmpay.util.MediaContentObserver;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import p071ef.b;
import p141j9.B;
import p271re.h;
import p271re.i;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/qrcode/pay")
public class QrCodePayMoneyFragment extends BaseMVPFragment<f0> implements ReceiveMoneyContract$IView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Handler f34882A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Bitmap f34883B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f34884C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public d f34885H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SelectPayMethodDialog f34886L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public List f34887M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public PaymentMethod f34888Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MediaContentObserver f34889X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MediaContentObserver f34890Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ShadowHandlerThread f34891Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f34892j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f34894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f34895p;
    public ModelPreviewPaymentMethodItem t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ViewGroup f34900v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f34901w;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f34893k0 = 120000;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f34896p0 = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final B f34897q0 = new B(this, 11);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final h f34898r0 = new h(this);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final i f34899s0 = new i(this);

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_qr_code_pay_money_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        c.b().j(this);
        this.f34887M = new ArrayList();
        SelectPayMethodDialog selectPayMethodDialog = new SelectPayMethodDialog(getContext());
        this.f34886L = selectPayMethodDialog;
        selectPayMethodDialog.setCallBack(this.f34899s0);
        this.f34886L.setShowFooter(false);
        showLoadingDialog(true);
        ((AccountApiService) p324va.c.f43141a.f14623d).queryPaymentMethod().k(p298tf.f.f42629b).i(b.a()).subscribe(new C0714c(this, 23));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        showLoadingDialog(true);
        BaseApplication.getInstance().getUser();
        ((f0) this.f27328i).generateQrcodeData(new QrcodeGenerateReq("1", String.valueOf(1)), false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f34901w = (LinearLayout) this.f27318b.findViewById(e.spma_auth_area);
        this.f34900v = (ViewGroup) this.f27318b.findViewById(e.receive_money_container);
        this.t = (ModelPreviewPaymentMethodItem) this.f27318b.findViewById(e.spma_pay_method);
        this.f34895p = (TextView) this.f27318b.findViewById(e.spma_refresh_tv);
        this.f34894o = (TextView) this.f27318b.findViewById(e.spma_enable_tv);
        this.f34892j = (ImageView) this.f27318b.findViewById(e.receive_money_qrcode);
        final int i7 = 0;
        this.f34894o.setOnClickListener(new View.OnClickListener(this) { // from class: re.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrCodePayMoneyFragment f41795b;

            {
                this.f41795b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f41795b.v(view);
                        break;
                    case 1:
                        this.f41795b.v(view);
                        break;
                    default:
                        this.f41795b.v(view);
                        break;
                }
            }
        });
        final int i10 = 1;
        this.t.setOnClickListener(new View.OnClickListener(this) { // from class: re.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrCodePayMoneyFragment f41795b;

            {
                this.f41795b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f41795b.v(view);
                        break;
                    case 1:
                        this.f41795b.v(view);
                        break;
                    default:
                        this.f41795b.v(view);
                        break;
                }
            }
        });
        final int i11 = 2;
        this.f34895p.setOnClickListener(new View.OnClickListener(this) { // from class: re.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrCodePayMoneyFragment f41795b;

            {
                this.f41795b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f41795b.v(view);
                        break;
                    case 1:
                        this.f41795b.v(view);
                        break;
                    default:
                        this.f41795b.v(view);
                        break;
                }
            }
        });
        try {
            ShadowHandlerThread shadowHandlerThread = this.f34891Z;
            if (shadowHandlerThread != null && shadowHandlerThread.isAlive()) {
                return 0;
            }
        } catch (Exception unused) {
        }
        ShadowHandlerThread shadowHandlerThread2 = new ShadowHandlerThread("Screenshot_Observer", "\u200bcom.transsnet.palmpay.ui.activity.qr.QrCodePayMoneyFragment");
        this.f34891Z = shadowHandlerThread2;
        ShadowThread.setThreadName(shadowHandlerThread2, "\u200bcom.transsnet.palmpay.ui.activity.qr.QrCodePayMoneyFragment").start();
        this.f34882A = new Handler(this.f34891Z.getLooper());
        Context context = getContext();
        Uri uri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        this.f34889X = new MediaContentObserver(context, uri, this.f34882A);
        Context context2 = getContext();
        Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        this.f34890Y = new MediaContentObserver(context2, uri2, this.f34882A);
        if (getActivity() != null) {
            ContentResolver contentResolver = getActivity().getContentResolver();
            contentResolver.registerContentObserver(uri, false, this.f34889X);
            contentResolver.registerContentObserver(uri2, false, this.f34890Y);
        }
        MediaContentObserver mediaContentObserver = this.f34889X;
        h hVar = this.f34898r0;
        mediaContentObserver.setCallBack(hVar);
        this.f34890Y.setCallBack(hVar);
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 11) {
            getActivity().finish();
        } else if (i7 == 17 && i10 == -1) {
            SPUtils.getInstance().put("AUTH_PAY_QRCODE", true);
            this.f34901w.setVisibility(8);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
        w();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        w();
        super.onDestroyView();
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView
    public final void onFail(String str) {
        showLoadingDialog(false);
        ToastUtils.showShort(str);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent messageEvent) {
        if (messageEvent.getEventType() == 275 && (messageEvent.getEventObj() instanceof PaymentMethod)) {
            PaymentMethod paymentMethod = (PaymentMethod) messageEvent.getEventObj();
            this.f34888Q = paymentMethod;
            this.t.setPaymentMethod(paymentMethod);
            u();
            this.f34886L.onAddNewCard(paymentMethod);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f34884C = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (iArr.length <= 0) {
            return;
        }
        for (int i10 : iArr) {
            if (i10 != 0) {
                ToastUtils.showShort(Ac.h.main_denied_permission_save_qrcode);
                return;
            }
        }
        if (i7 == 10) {
            ((f0) this.f27328i).saveQrcodeImg(this.f34883B);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f34884C = true;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onTransferPushMessage(PushMessage pushMessage) {
        PushMessage.Content content;
        if (this.f34884C && (content = pushMessage.content) != null && PushMessage.MESSAGE_TYPE_QRCODE_COLLECT.equals(content.messageType)) {
            ARouter.getInstance().build("/sm/receive_money_result").withString("business_info", pushMessage.content.businessInfo).navigation();
            return;
        }
        PushMessage.Content content2 = pushMessage.content;
        if (content2 == null || !PushMessage.MESSAGE_TYPE_MERCHANT_ACQ_B_SCAN_C.equals(content2.messageType)) {
            return;
        }
        PayMerchantOrderPushData payMerchantOrderPushData = (PayMerchantOrderPushData) GsonUtil.get().fromJson(pushMessage.content.businessInfo, PayMerchantOrderPushData.class);
        Context context = getContext();
        String str = payMerchantOrderPushData.orderId;
        int i7 = QrcodePayMoneySuccessActivity.f34920C;
        context.startActivity(new Intent(context, (Class<?>) QrcodePayMoneySuccessActivity.class).putExtra("orderNo", str));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView
    public final void queryRefreshDurationSuccess(long j6) {
        this.f34893k0 = j6 * 1000;
        Handler handler = this.f34882A;
        B b7 = this.f34897q0;
        handler.removeCallbacks(b7);
        this.f34882A.postDelayed(b7, this.f34893k0);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView
    public final void showQrcodeData(QrcodeGenerateResp qrcodeGenerateResp) {
        showLoadingDialog(false);
        ((f0) this.f27328i).generateQrcodeImg(qrcodeGenerateResp.data.qrcodeKey);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView
    public final void showQrcodeImg(Bitmap bitmap) {
        showLoadingDialog(false);
        this.f34900v.setVisibility(0);
        this.f34883B = bitmap;
        this.f34892j.setImageBitmap(bitmap);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView
    public final void showSaveResult(String str) {
        ToastUtils.showShort(getString(Ac.h.main_qrcode_save_in) + str);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView
    public final void showSetAmountQrcodeImg(Bitmap bitmap, QrcodeGenerateReq qrcodeGenerateReq) {
        showLoadingDialog(false);
        this.f34900v.setVisibility(0);
        this.f34883B = bitmap;
        this.f34892j.setImageBitmap(bitmap);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new f0();
    }

    public final void u() {
        PaymentMethod paymentMethod = this.f34888Q;
        if (paymentMethod == null) {
            return;
        }
        QrcodeGenerateReq qrcodeGenerateReq = new QrcodeGenerateReq("1", String.valueOf(paymentMethod.payType));
        PaymentMethod paymentMethod2 = this.f34888Q;
        int i7 = paymentMethod2.payType;
        if (i7 == 2) {
            qrcodeGenerateReq.setPayerAccountId(paymentMethod2.accountId);
            qrcodeGenerateReq.setPayerBankCode(this.f34888Q.bankCode);
        } else if (i7 == 7) {
            qrcodeGenerateReq.setPayerAccountId(paymentMethod2.cardNo);
            qrcodeGenerateReq.setPayerBankCode(this.f34888Q.bankCode);
        }
        ((f0) this.f27328i).generateQrcodeData(qrcodeGenerateReq, false);
    }

    public final void v(View view) {
        int id2 = view.getId();
        if (id2 == e.spma_enable_tv) {
            startActivityForResult(i0.q(getActivity()), 17);
            return;
        }
        if (id2 != e.spma_pay_method) {
            if (id2 == e.spma_refresh_tv) {
                if (this.f34888Q == null) {
                    ((f0) this.f27328i).generateQrcodeData(new QrcodeGenerateReq("1", String.valueOf(1)), false);
                    return;
                } else {
                    u();
                    return;
                }
            }
            return;
        }
        List<PaymentMethod> list = this.f34887M;
        if (list != null) {
            this.f34886L.setPayMethods(list);
            PaymentMethod paymentMethod = this.f34888Q;
            if (paymentMethod != null) {
                this.f34886L.setSelectedPayMethod(paymentMethod);
            }
        }
        this.f34886L.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w() {
        Handler handler = this.f34882A;
        if (handler != null) {
            handler.removeCallbacks(this.f34897q0);
            this.f34882A = null;
        }
        MediaContentObserver mediaContentObserver = this.f34889X;
        if (mediaContentObserver != null) {
            mediaContentObserver.setCallBack(null);
        }
        MediaContentObserver mediaContentObserver2 = this.f34890Y;
        if (mediaContentObserver2 != null) {
            mediaContentObserver2.setCallBack(null);
        }
        if (getActivity() != null) {
            try {
                ContentResolver contentResolver = getActivity().getContentResolver();
                MediaContentObserver mediaContentObserver3 = this.f34889X;
                if (mediaContentObserver3 != null) {
                    contentResolver.unregisterContentObserver(mediaContentObserver3);
                }
                MediaContentObserver mediaContentObserver4 = this.f34890Y;
                if (mediaContentObserver4 != null) {
                    contentResolver.unregisterContentObserver(mediaContentObserver4);
                }
            } catch (Exception unused) {
            } finally {
                this.f34889X = null;
                this.f34890Y = null;
            }
        } else {
            this.f34889X = null;
            this.f34890Y = null;
        }
        try {
            ShadowHandlerThread shadowHandlerThread = this.f34891Z;
            if (shadowHandlerThread != null && shadowHandlerThread.isAlive()) {
                this.f34891Z.quitSafely();
            }
        } catch (Exception unused2) {
        } finally {
            this.f34891Z = null;
        }
    }
}
