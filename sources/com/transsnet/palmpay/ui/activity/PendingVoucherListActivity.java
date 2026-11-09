package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.ui.activity.PendingVoucherListActivity;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/pending_voucher_list")
public class PendingVoucherListActivity extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f34550j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f34553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f34554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f34555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f34556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f34557g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f34558i;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_pending_voucher_list;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        requestLayoutFullScreen();
        this.f34557g = findViewById(e.viewMoneyTransfer);
        this.f34558i = findViewById(e.viewLuckyMoney);
        TextView textView = (TextView) findViewById(e.textViewMoneyTransferNo);
        this.f34553c = textView;
        int i7 = this.f34551a;
        if (i7 > 0) {
            textView.setText(String.valueOf(i7));
        } else {
            this.f34557g.setVisibility(8);
        }
        this.f34554d = (TextView) findViewById(e.textViewGo1);
        TextView textView2 = (TextView) findViewById(e.textViewLuckMoneyNo);
        this.f34555e = textView2;
        int i10 = this.f34552b;
        if (i10 > 0) {
            textView2.setText(String.valueOf(i10));
        } else {
            this.f34558i.setVisibility(8);
        }
        this.f34556f = (TextView) findViewById(e.textViewGo2);
        final int i11 = 0;
        ((ImageView) findViewById(e.imageViewClose)).setOnClickListener(new View.OnClickListener(this) { // from class: ge.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingVoucherListActivity f37193b;

            {
                this.f37193b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PendingVoucherListActivity pendingVoucherListActivity = this.f37193b;
                switch (i11) {
                    case 0:
                        int i12 = PendingVoucherListActivity.f34550j;
                        pendingVoucherListActivity.finish();
                        break;
                    case 1:
                        int i13 = PendingVoucherListActivity.f34550j;
                        pendingVoucherListActivity.getClass();
                        ARouter.getInstance().build("/send/money").navigation();
                        pendingVoucherListActivity.finish();
                        break;
                    default:
                        int i14 = PendingVoucherListActivity.f34550j;
                        pendingVoucherListActivity.finish();
                        break;
                }
            }
        });
        final int i12 = 1;
        this.f34554d.setOnClickListener(new View.OnClickListener(this) { // from class: ge.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingVoucherListActivity f37193b;

            {
                this.f37193b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PendingVoucherListActivity pendingVoucherListActivity = this.f37193b;
                switch (i12) {
                    case 0:
                        int i13 = PendingVoucherListActivity.f34550j;
                        pendingVoucherListActivity.finish();
                        break;
                    case 1:
                        int i14 = PendingVoucherListActivity.f34550j;
                        pendingVoucherListActivity.getClass();
                        ARouter.getInstance().build("/send/money").navigation();
                        pendingVoucherListActivity.finish();
                        break;
                    default:
                        int i15 = PendingVoucherListActivity.f34550j;
                        pendingVoucherListActivity.finish();
                        break;
                }
            }
        });
        final int i13 = 2;
        this.f34556f.setOnClickListener(new View.OnClickListener(this) { // from class: ge.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingVoucherListActivity f37193b;

            {
                this.f37193b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PendingVoucherListActivity pendingVoucherListActivity = this.f37193b;
                switch (i13) {
                    case 0:
                        int i14 = PendingVoucherListActivity.f34550j;
                        pendingVoucherListActivity.finish();
                        break;
                    case 1:
                        int i15 = PendingVoucherListActivity.f34550j;
                        pendingVoucherListActivity.getClass();
                        ARouter.getInstance().build("/send/money").navigation();
                        pendingVoucherListActivity.finish();
                        break;
                    default:
                        int i16 = PendingVoucherListActivity.f34550j;
                        pendingVoucherListActivity.finish();
                        break;
                }
            }
        });
    }
}
