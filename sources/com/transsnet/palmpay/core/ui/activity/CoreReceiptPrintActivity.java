package com.transsnet.palmpay.core.ui.activity;

import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.common.net.HttpHeaders;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/CoreReceiptPrintActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "Ljava/io/File;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "<init>", "()V", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CoreReceiptPrintActivity extends BaseActivity implements CompleteCallback<File>, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ScrollView f27576A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ModelItemFee f27577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ModelItemFee f27578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModelItemFee f27579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ModelItemFee f27580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ModelItemFee f27581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ModelItemFee f27582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ModelItemFee f27583g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ModelItemFee f27584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ModelItemFee f27585j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ModelItemFee f27586o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ModelItemFee f27587p;
    public ModelItemFee t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f27588v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ModelItemFee f27589w;

    public static void l(ModelItemFee modelItemFee, String str) {
        if (TextUtils.isEmpty(str)) {
            p220oa.h.s(modelItemFee, false);
        } else {
            p220oa.h.s(modelItemFee, true);
            modelItemFee.setContent(str);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return L9.b.core_activity_core_receipt_print;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ModelItemFee modelItemFee = this.f27577a;
        if (modelItemFee == null) {
            Intrinsics.n("mItem1");
            throw null;
        }
        l(modelItemFee, getIntent().getStringExtra("TransactionID"));
        ModelItemFee modelItemFee2 = this.f27578b;
        if (modelItemFee2 == null) {
            Intrinsics.n("mItem2");
            throw null;
        }
        l(modelItemFee2, getIntent().getStringExtra("Payee"));
        ModelItemFee modelItemFee3 = this.f27579c;
        if (modelItemFee3 == null) {
            Intrinsics.n("mItem3");
            throw null;
        }
        l(modelItemFee3, getIntent().getStringExtra("PayeeNIF"));
        long longExtra = getIntent().getLongExtra(HttpHeaders.DATE, System.currentTimeMillis());
        ModelItemFee modelItemFee4 = this.f27580d;
        if (modelItemFee4 == null) {
            Intrinsics.n("mItem4");
            throw null;
        }
        l(modelItemFee4, TimeUtils.millis2String(longExtra, new SimpleDateFormat("yyyy/MM/dd")));
        ModelItemFee modelItemFee5 = this.f27581e;
        if (modelItemFee5 == null) {
            Intrinsics.n("mItem5");
            throw null;
        }
        l(modelItemFee5, getIntent().getStringExtra("TransactionType"));
        long longExtra2 = getIntent().getLongExtra("TransactionAmount", 0L);
        ModelItemFee modelItemFee6 = this.f27582f;
        if (modelItemFee6 == null) {
            Intrinsics.n("mItem6");
            throw null;
        }
        l(modelItemFee6, r0.A(longExtra2));
        ModelItemFee modelItemFee7 = this.f27583g;
        if (modelItemFee7 == null) {
            Intrinsics.n("mItem7");
            throw null;
        }
        l(modelItemFee7, getIntent().getStringExtra("PaymentMethod"));
        ModelItemFee modelItemFee8 = this.f27584i;
        if (modelItemFee8 == null) {
            Intrinsics.n("mItem8");
            throw null;
        }
        l(modelItemFee8, getIntent().getStringExtra("PayerName"));
        ModelItemFee modelItemFee9 = this.f27585j;
        if (modelItemFee9 == null) {
            Intrinsics.n("mItem9");
            throw null;
        }
        l(modelItemFee9, getIntent().getStringExtra("PayerNIF"));
        ModelItemFee modelItemFee10 = this.f27586o;
        if (modelItemFee10 == null) {
            Intrinsics.n("mItem10");
            throw null;
        }
        l(modelItemFee10, getIntent().getStringExtra("PayerAccountNumber"));
        long longExtra3 = getIntent().getLongExtra("CashbackUsed", 0L);
        ModelItemFee modelItemFee11 = this.f27587p;
        if (modelItemFee11 == null) {
            Intrinsics.n("mItem11");
            throw null;
        }
        l(modelItemFee11, String.valueOf(longExtra3));
        long longExtra4 = getIntent().getLongExtra("Fees", 0L);
        ModelItemFee modelItemFee12 = this.t;
        if (modelItemFee12 == null) {
            Intrinsics.n("mItem12");
            throw null;
        }
        l(modelItemFee12, r0.A(longExtra4));
        TextView textView = this.f27588v;
        if (textView == null) {
            Intrinsics.n("mItem13");
            throw null;
        }
        textView.setText(getIntent().getStringExtra("Narration"));
        ModelItemFee modelItemFee13 = this.f27589w;
        if (modelItemFee13 != null) {
            l(modelItemFee13, getIntent().getStringExtra("Status"));
        } else {
            Intrinsics.n("mItem14");
            throw null;
        }
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(File[] fileArr) {
        File[] objects = fileArr;
        Intrinsics.checkNotNullParameter(objects, "objects");
        if (objects[0] != null) {
            ToastUtils.showLong(p025ba.k.core_msg_save_receipt_to_gallery);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ScrollView scrollView = this.f27576A;
        if (scrollView == null) {
            Intrinsics.n("mViewRoot");
            throw null;
        }
        r0.K1(null, 685, this, scrollView);
        ScrollView scrollView2 = this.f27576A;
        if (scrollView2 != null) {
            scrollView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            Intrinsics.n("mViewRoot");
            throw null;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ScrollView scrollView = this.f27576A;
        if (scrollView != null) {
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        } else {
            Intrinsics.n("mViewRoot");
            throw null;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f27577a = (ModelItemFee) findViewById(L9.a.item1);
        this.f27578b = (ModelItemFee) findViewById(L9.a.item2);
        this.f27579c = (ModelItemFee) findViewById(L9.a.item3);
        this.f27580d = (ModelItemFee) findViewById(L9.a.item4);
        this.f27581e = (ModelItemFee) findViewById(L9.a.item5);
        this.f27582f = (ModelItemFee) findViewById(L9.a.item6);
        this.f27583g = (ModelItemFee) findViewById(L9.a.item7);
        this.f27584i = (ModelItemFee) findViewById(L9.a.item8);
        this.f27585j = (ModelItemFee) findViewById(L9.a.item9);
        this.f27586o = (ModelItemFee) findViewById(L9.a.item10);
        this.f27587p = (ModelItemFee) findViewById(L9.a.item11);
        this.t = (ModelItemFee) findViewById(L9.a.item12);
        this.f27588v = (TextView) findViewById(L9.a.item13);
        this.f27589w = (ModelItemFee) findViewById(L9.a.item14);
        this.f27576A = (ScrollView) findViewById(L9.a.viewRoot);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
    }
}
