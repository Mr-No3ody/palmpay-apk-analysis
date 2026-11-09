package com.transsnet.palmpay.credit.ui.activity.transferbyloan;

import Jb.N;
import Ya.f;
import Za.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.TransferByLoanConfirmedPayloadExtras;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.core.bean.TransferByLoanResult;
import com.transsnet.palmpay.credit.viewmodel.TransferByLoanViewModel;
import java.io.Serializable;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p141j9.s;
import p294tb.I;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/transfer_by_loan_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/transferbyloan/TransferByLoanActivity;", "LZa/b;", "Lcom/transsnet/palmpay/credit/ui/activity/transferbyloan/TransferByLoanResultConsumer;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferByLoanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferByLoanActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/transferbyloan/TransferByLoanActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,184:1\n260#2,10:185\n296#2:195\n*S KotlinDebug\n*F\n+ 1 TransferByLoanActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/transferbyloan/TransferByLoanActivity\n*L\n53#1:185,10\n53#1:195\n*E\n"})
public final class TransferByLoanActivity extends b implements TransferByLoanResultConsumer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f29927e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f29928f = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29929d = C2131j.b(new p325vb.a(this, 0));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int onActivityStopped$lambda$1(int i7) {
            int i10 = i7 - 1;
            if (i10 < 0) {
                return 0;
            }
            return i10;
        }

        @NotNull
        public final Intent intent(@NotNull Context context, @NotNull TransferByLoanOpenParams params) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(params, "params");
            Intent intent = new Intent(context, (Class<?>) TransferByLoanActivity.class);
            intent.putExtra("extra_open_params", params);
            return intent;
        }

        public final boolean isActive() {
            return TransferByLoanActivity.f29928f.get() > 0;
        }

        public final void onActivityStarted() {
            TransferByLoanActivity.f29928f.incrementAndGet();
        }

        public final void onActivityStopped() {
            TransferByLoanActivity.f29928f.updateAndGet(new p325vb.b());
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_transfer_by_loan_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((TransferByLoanViewModel) this.f29929d.getValue()).f30931e;
        if (lVar != null) {
            lVar.e(this, new s(new p141j9.t(this, this, 27), 0, 0));
        }
    }

    public final void m() {
        setResult(0, new Intent().putExtra("cancel_reason", "close_cashier"));
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        if (!isChangingConfigurations()) {
            J3.a.f4490b = null;
            J3.a.f4491c = null;
            J3.a.f4492d = false;
        }
        super.onDestroy();
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        super.onStart();
        f29927e.onActivityStarted();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onStop() {
        f29927e.onActivityStopped();
        super.onStop();
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.transferbyloan.TransferByLoanResultConsumer
    public final void onTransferByLoanResult(TransferByLoanResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String status = result.getStatus();
        int iHashCode = status.hashCode();
        if (iHashCode != -1281977283) {
            if (iHashCode != -804109473) {
                if (iHashCode == 476588369 && status.equals(TransferByLoanResult.STATUS_CANCELLED)) {
                    setResult(0);
                }
            } else if (status.equals(TransferByLoanResult.STATUS_CONFIRMED)) {
                Map<String, ? extends Object> payload = result.getPayload();
                Intrinsics.checkNotNullParameter(payload, "payload");
                setResult(-1, TransferByLoanConfirmedPayloadExtras.INSTANCE.toIntent(payload));
            }
        } else if (status.equals(TransferByLoanResult.STATUS_FAILED)) {
            m();
            return;
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (bundle != null) {
            return;
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("extra_open_params");
        TransferByLoanOpenParams params = serializableExtra instanceof TransferByLoanOpenParams ? (TransferByLoanOpenParams) serializableExtra : null;
        if (params == null) {
            m();
            return;
        }
        String cashierContextId = params.getCashierContextId();
        J3.a.f4490b = UUID.randomUUID().toString();
        if (cashierContextId == null || StringsKt.F(cashierContextId)) {
            cashierContextId = null;
        }
        J3.a.f4491c = cashierContextId;
        J3.a.f4492d = false;
        t tVar = this.f29929d;
        ((TransferByLoanViewModel) tVar.getValue()).e();
        TransferByLoanViewModel transferByLoanViewModel = (TransferByLoanViewModel) tVar.getValue();
        transferByLoanViewModel.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        p140j8.f.s(transferByLoanViewModel, new N(transferByLoanViewModel, params, null), transferByLoanViewModel.f30931e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(true);
        getOnBackPressedDispatcher().a(this, new I(this, 4));
    }
}
