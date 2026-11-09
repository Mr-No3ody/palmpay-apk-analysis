package com.transsnet.palmpay.ui.fragment;

import Ac.e;
import Ac.f;
import Ac.h;
import C9.C0139f;
import Fe.f0;
import Pa.F;
import Pa.T;
import Pa.r0;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.luck.picture.lib.config.SelectMimeType;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.req.QrcodeGenerateReq;
import com.transsnet.palmpay.core.bean.rsp.QrcodeGenerateResp;
import com.transsnet.palmpay.ui.fragment.QrReceiveMoneyFragment;
import com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView;
import com.transsnet.palmpay.util.ToastUtils;
import defpackage.a;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;

/* JADX INFO: loaded from: classes4.dex */
public class QrReceiveMoneyFragment extends BaseMVPFragment<f0> implements ReceiveMoneyContract$IView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f35236A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Bitmap f35237B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f35238C;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f35239j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f35241p;
    public TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f35242v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewGroup f35243w;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_receive_money_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        c.b().j(this);
        return 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        showLoadingDialog(true);
        ((f0) this.f27328i).generateQrcodeData(new QrcodeGenerateReq("2", String.valueOf(1)), false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f35243w = (ViewGroup) this.f27318b.findViewById(e.receive_money_container);
        this.f35242v = (TextView) this.f27318b.findViewById(e.receive_money_remark);
        this.t = (TextView) this.f27318b.findViewById(e.receive_money_num);
        this.f35241p = (ImageView) this.f27318b.findViewById(e.receive_money_qrcode);
        this.f35240o = (TextView) this.f27318b.findViewById(e.save_qrcode);
        TextView textView = (TextView) this.f27318b.findViewById(e.set_money);
        this.f35239j = textView;
        final int i7 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: Ce.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrReceiveMoneyFragment f1497b;

            {
                this.f1497b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f1497b.v(view);
                        break;
                    default:
                        this.f1497b.v(view);
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f35240o.setOnClickListener(new View.OnClickListener(this) { // from class: Ce.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrReceiveMoneyFragment f1497b;

            {
                this.f1497b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f1497b.v(view);
                        break;
                    default:
                        this.f1497b.v(view);
                        break;
                }
            }
        });
        return 1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 != 1 || i10 != -1) {
            if (i7 == 11) {
                getActivity().finish();
                return;
            }
            return;
        }
        showLoadingDialog(true);
        String stringExtra = intent.getStringExtra("extra_amount");
        String stringExtra2 = intent.getStringExtra("receive_remark");
        QrcodeGenerateReq qrcodeGenerateReq = new QrcodeGenerateReq("2", String.valueOf(1));
        if (!TextUtils.isEmpty(stringExtra2)) {
            qrcodeGenerateReq.setRecipientRemark(stringExtra2);
        }
        qrcodeGenerateReq.setAmount(r0.f(Double.parseDouble(stringExtra)));
        ((f0) this.f27328i).generateQrcodeData(qrcodeGenerateReq, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView
    public final void onFail(String str) {
        showLoadingDialog(false);
        ToastUtils.showShort(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f35238C = false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f35238C = true;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onTransferPushMessage(PushMessage pushMessage) {
        PushMessage.Content content;
        if (this.f35238C && (content = pushMessage.content) != null && PushMessage.MESSAGE_TYPE_QRCODE_COLLECT.equals(content.messageType)) {
            ARouter.getInstance().build("/sm/receive_money_result").withString("business_info", pushMessage.content.businessInfo).navigation();
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView
    public final void queryRefreshDurationSuccess(long j6) {
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView
    public final void showQrcodeData(QrcodeGenerateResp qrcodeGenerateResp) {
        showLoadingDialog(false);
        ((f0) this.f27328i).generateQrcodeImg(qrcodeGenerateResp.data.qrcodeKey);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView
    public final void showQrcodeImg(Bitmap bitmap) {
        showLoadingDialog(false);
        this.f35236A = false;
        u();
        this.f35237B = bitmap;
        this.f35241p.setImageBitmap(bitmap);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView
    public final void showSaveResult(String str) {
        if (!(getActivity() instanceof BaseActivity)) {
            ToastUtils.showShort(getString(h.main_qrcode_save_in));
            return;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 > 28) {
            ToastUtils.showShort(getString(h.main_qrcode_save_in));
            return;
        }
        File src = new File(str);
        BaseActivity baseActivity = (BaseActivity) getActivity();
        C0139f callback = new C0139f(this, 4);
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(SelectMimeType.SYSTEM_IMAGE, "mimeType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intent intentI = r0.i(src.getName(), SelectMimeType.SYSTEM_IMAGE);
        WeakReference weakReference = new WeakReference(callback);
        WeakReference weakReference2 = new WeakReference(baseActivity);
        if (i7 <= 28) {
            p038ca.e f28604i = baseActivity.getF28604i();
            if (f28604i != null) {
                f28604i.f(intentI, new a(weakReference2, 5, weakReference, src));
                Unit unit = Unit.f38893a;
                return;
            }
            return;
        }
        BaseActivity baseActivity2 = (BaseActivity) weakReference2.get();
        if (baseActivity2 != null) {
            T.b(-4).execute(new Da.h(src, 7, baseActivity2, weakReference));
            if (Unit.f38893a != null) {
                return;
            }
        }
        Function1 function1 = (Function1) weakReference.get();
        if (function1 != null) {
            function1.invoke(null);
            Unit unit2 = Unit.f38893a;
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView
    public final void showSetAmountQrcodeImg(Bitmap bitmap, QrcodeGenerateReq qrcodeGenerateReq) {
        showLoadingDialog(false);
        this.f35236A = true;
        u();
        this.t.setText(r0.L(10, 30, 30, qrcodeGenerateReq.getAmount()));
        if (!TextUtils.isEmpty(qrcodeGenerateReq.getRecipientRemark())) {
            this.f35242v.setText(qrcodeGenerateReq.getRecipientRemark());
        }
        this.f35237B = bitmap;
        this.f35241p.setImageBitmap(bitmap);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new f0();
    }

    public final void u() {
        if (this.f35236A) {
            this.f35243w.setVisibility(0);
            this.t.setVisibility(0);
            this.f35242v.setVisibility(0);
            this.f35239j.setText(h.main_clear_amount_text);
            return;
        }
        this.f35243w.setVisibility(0);
        this.t.setText("");
        this.t.setVisibility(4);
        this.f35242v.setText("");
        this.f35242v.setVisibility(4);
        this.f35239j.setText(h.main_set_amount_text);
    }

    public final void v(View view) {
        int id2 = view.getId();
        if (id2 != e.set_money) {
            if (id2 == e.save_qrcode) {
                ((f0) this.f27328i).saveQrcodeImg(this.f35237B);
            }
        } else if (this.f35236A) {
            showLoadingDialog(true);
            ((f0) this.f27328i).generateQrcodeData(new QrcodeGenerateReq("2", String.valueOf(1)), false);
        } else {
            Intent intentC = F.c(getContext(), ARouter.getInstance().build("/sm/set_amount"));
            if (intentC != null) {
                startActivityForResult(intentC, 1);
            }
        }
    }
}
