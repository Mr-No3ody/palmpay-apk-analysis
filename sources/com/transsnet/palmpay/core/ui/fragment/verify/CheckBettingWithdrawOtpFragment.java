package com.transsnet.palmpay.core.ui.fragment.verify;

import Ab.i;
import Ja.RunnableC0336i;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.req.SendBettingOTPReq;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBettingWithdrawOtpFragment;
import java.lang.ref.WeakReference;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public class CheckBettingWithdrawOtpFragment extends BaseFragment {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f27960A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RunnableC0336i f27961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27962j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f27963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f27964p;
    public ImageView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AppCompatEditText f27965v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f27966w;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_fragment_check_betting_withdraw_otp;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.t = (ImageView) this.f27318b.findViewById(e.cbw_close);
        this.f27965v = (AppCompatEditText) this.f27318b.findViewById(e.cbw_edittext);
        this.f27966w = (TextView) this.f27318b.findViewById(e.cbw_time_count);
        this.f27960A = (TextView) this.f27318b.findViewById(e.cbw_withdraw);
        this.f27965v.addTextChangedListener(new i(this, 19));
        final int i7 = 0;
        this.f27960A.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBettingWithdrawOtpFragment f4655b;

            {
                this.f4655b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        CheckBettingWithdrawOtpFragment checkBettingWithdrawOtpFragment = this.f4655b;
                        ((PayVerificationCallback) checkBettingWithdrawOtpFragment.getActivity()).verifyPayMethodWithReference(checkBettingWithdrawOtpFragment.f27965v.getText().toString(), 15, checkBettingWithdrawOtpFragment.f27964p);
                        break;
                    case 1:
                        androidx.fragment.app.E activity = this.f4655b.getActivity();
                        if (!(activity instanceof PayVerificationActivity)) {
                            activity.finish();
                        } else {
                            ((PayVerificationActivity) activity).n();
                        }
                        break;
                    default:
                        CheckBettingWithdrawOtpFragment checkBettingWithdrawOtpFragment2 = this.f4655b;
                        checkBettingWithdrawOtpFragment2.showLoadingDialog(true);
                        SendBettingOTPReq sendBettingOTPReq = new SendBettingOTPReq();
                        sendBettingOTPReq.setAmount(Long.valueOf(checkBettingWithdrawOtpFragment2.f27963o));
                        sendBettingOTPReq.setOrderNo(checkBettingWithdrawOtpFragment2.f27962j);
                        ((PayApiService) p324va.c.f43141a.f14621b).sendBettingOTP(sendBettingOTPReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Ab.D(checkBettingWithdrawOtpFragment2, 14));
                        break;
                }
            }
        });
        final int i10 = 1;
        this.t.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBettingWithdrawOtpFragment f4655b;

            {
                this.f4655b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        CheckBettingWithdrawOtpFragment checkBettingWithdrawOtpFragment = this.f4655b;
                        ((PayVerificationCallback) checkBettingWithdrawOtpFragment.getActivity()).verifyPayMethodWithReference(checkBettingWithdrawOtpFragment.f27965v.getText().toString(), 15, checkBettingWithdrawOtpFragment.f27964p);
                        break;
                    case 1:
                        androidx.fragment.app.E activity = this.f4655b.getActivity();
                        if (!(activity instanceof PayVerificationActivity)) {
                            activity.finish();
                        } else {
                            ((PayVerificationActivity) activity).n();
                        }
                        break;
                    default:
                        CheckBettingWithdrawOtpFragment checkBettingWithdrawOtpFragment2 = this.f4655b;
                        checkBettingWithdrawOtpFragment2.showLoadingDialog(true);
                        SendBettingOTPReq sendBettingOTPReq = new SendBettingOTPReq();
                        sendBettingOTPReq.setAmount(Long.valueOf(checkBettingWithdrawOtpFragment2.f27963o));
                        sendBettingOTPReq.setOrderNo(checkBettingWithdrawOtpFragment2.f27962j);
                        ((PayApiService) p324va.c.f43141a.f14621b).sendBettingOTP(sendBettingOTPReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Ab.D(checkBettingWithdrawOtpFragment2, 14));
                        break;
                }
            }
        });
        TextView textView = this.f27966w;
        RunnableC0336i runnableC0336i = new RunnableC0336i(0);
        runnableC0336i.f4657b = new WeakReference(textView);
        this.f27961i = runnableC0336i;
        final int i11 = 2;
        this.f27966w.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBettingWithdrawOtpFragment f4655b;

            {
                this.f4655b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        CheckBettingWithdrawOtpFragment checkBettingWithdrawOtpFragment = this.f4655b;
                        ((PayVerificationCallback) checkBettingWithdrawOtpFragment.getActivity()).verifyPayMethodWithReference(checkBettingWithdrawOtpFragment.f27965v.getText().toString(), 15, checkBettingWithdrawOtpFragment.f27964p);
                        break;
                    case 1:
                        androidx.fragment.app.E activity = this.f4655b.getActivity();
                        if (!(activity instanceof PayVerificationActivity)) {
                            activity.finish();
                        } else {
                            ((PayVerificationActivity) activity).n();
                        }
                        break;
                    default:
                        CheckBettingWithdrawOtpFragment checkBettingWithdrawOtpFragment2 = this.f4655b;
                        checkBettingWithdrawOtpFragment2.showLoadingDialog(true);
                        SendBettingOTPReq sendBettingOTPReq = new SendBettingOTPReq();
                        sendBettingOTPReq.setAmount(Long.valueOf(checkBettingWithdrawOtpFragment2.f27963o));
                        sendBettingOTPReq.setOrderNo(checkBettingWithdrawOtpFragment2.f27962j);
                        ((PayApiService) p324va.c.f43141a.f14621b).sendBettingOTP(sendBettingOTPReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Ab.D(checkBettingWithdrawOtpFragment2, 14));
                        break;
                }
            }
        });
        this.f27966w.performClick();
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f27962j = getArguments().getString("_order_no");
            getArguments().getString("transType");
            getArguments().getLong("payAmount");
            this.f27963o = getArguments().getLong("orderAmount");
            getArguments().getLong("feeAmount");
        }
    }
}
