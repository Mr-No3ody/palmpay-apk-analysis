package com.transsnet.palmpay.core.ui.fragment.verify;

import B5.c;
import Ja.N;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.bill.TransTypeUtils;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.custom_view.countdown.TransactionCountdownView;
import p025ba.e;
import p025ba.g;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
public class QueryTransactionResultFragment extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f28056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28057j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CheckPayReq f28058o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f28059p;
    public TransactionCountdownView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f28060v = new Handler();

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_fragment_query_transaction_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        this.f28056i = SystemClock.elapsedRealtime();
        t();
        this.f28060v.postDelayed(new c(this, 10), 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        TransactionCountdownView transactionCountdownView = (TransactionCountdownView) this.f27318b.findViewById(e.countDownView);
        this.t = transactionCountdownView;
        transactionCountdownView.setMaxCountdown(this.f28057j);
        this.t.setCurrentCountDown(this.f28057j);
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            int i7 = getArguments().getInt("_wait_time", 10);
            this.f28057j = i7;
            if (i7 <= 0) {
                this.f28057j = 10;
            }
            this.f28058o = (CheckPayReq) getArguments().getSerializable("_checkpayreq");
            this.f28059p = getArguments().getBoolean("_use_new_pay_check", false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f28060v.removeCallbacksAndMessages(null);
    }

    public final void t() {
        ((TransTypeUtils.isUseNewCashierDesk(this.f28058o.transType) || this.f28059p) ? ((PayApiService) p324va.c.f43141a.f14621b).queryNewPayResult(this.f28058o) : ((PayApiService) p324va.c.f43141a.f14621b).queryPayResult(this.f28058o)).k(f.f42629b).i(b.a()).subscribe(new N(this));
    }
}
