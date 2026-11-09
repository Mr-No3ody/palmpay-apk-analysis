package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import Ac.h;
import Bc.C0107d;
import L6.b;
import O6.c;
import O6.d;
import Pa.h0;
import Pe.s0;
import V8.w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransHistroyDownReq;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.viewmodule.TransactionHistoryViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p102ge.P;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/trans_history_down_load")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/TransactionHistoryDownloadActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/TransactionHistoryViewModel;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionHistoryDownloadActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionHistoryDownloadActivity.kt\ncom/transsnet/palmpay/ui/activity/TransactionHistoryDownloadActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n115#2,8:182\n145#2:190\n1#3:191\n*S KotlinDebug\n*F\n+ 1 TransactionHistoryDownloadActivity.kt\ncom/transsnet/palmpay/ui/activity/TransactionHistoryDownloadActivity\n*L\n125#1:182,8\n125#1:190\n*E\n"})
public final class TransactionHistoryDownloadActivity extends BaseMvvmActivity<TransactionHistoryViewModel> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f34576g = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TransHistroyDownReq f34577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f34579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0107d f34580f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startAct(@NotNull Context context, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            context.startActivity(new Intent(context, TransactionHistoryDownloadActivity.f34576g.getClass()), bundle);
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundDark), true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_transaction_download, (ViewGroup) null, false);
        int i7 = e.editMail;
        EditText editText = (EditText) p059e1.a.m(i7, viewInflate);
        if (editText != null) {
            i7 = e.ivDelete;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
            if (iconicsImageView != null) {
                i7 = e.titleBar;
                if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = e.tvConfirm;
                    PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                    if (ppButton != null) {
                        C0107d c0107d = new C0107d((LinearLayout) viewInflate, editText, iconicsImageView, ppButton, 4);
                        this.f34580f = c0107d;
                        return c0107d;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m(String str, boolean z3) {
        int i7 = z3 ? k.core_success : h.main_request_failed;
        c cVar = new c(this);
        cVar.e(i7);
        cVar.d(h.main_ok_i_know, null);
        cVar.f6598d = str;
        d dVarA = cVar.a();
        this.f34579e = dVarA;
        dVarA.setOnDismissListener(new h0(this, 1, z3));
        d dVar = this.f34579e;
        if (dVar != null) {
            dVar.show();
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        TransactionHistoryViewModel transactionHistoryViewModel;
        super.onActivityResult(i7, i10, intent);
        if (i7 == 392 && i10 == -1) {
            showLoadingDialog(true);
            TransHistroyDownReq req = this.f34577c;
            if (req == null || (transactionHistoryViewModel = (TransactionHistoryViewModel) l()) == null) {
                return;
            }
            Intrinsics.checkNotNullParameter(req, "req");
            p140j8.f.s(transactionHistoryViewModel, new s0(req, null), transactionHistoryViewModel.f35405e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((TransactionHistoryViewModel) l()).f35405e;
        if (lVar != null) {
            lVar.e(this, new T8.f(new w(this, 11), (char) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        String email;
        super.setupView();
        fillDisplayCutOutEdge();
        if (getIntent() != null) {
            this.f34577c = (TransHistroyDownReq) getIntent().getParcelableExtra("extra_data");
            this.f34578d = getIntent().getIntExtra("includeAddress", 0);
        }
        if (this.f34577c == null) {
            finish();
            return;
        }
        C0107d c0107d = this.f34580f;
        if (c0107d != null) {
            ((PpButton) c0107d.f683e).setOnClickListener(new P(this, 0));
        }
        C0107d c0107d2 = this.f34580f;
        if (c0107d2 != null) {
            ((EditText) c0107d2.f681c).addTextChangedListener(new R3.e(this, 15));
        }
        User user = BaseApplication.get().getUser();
        if (user != null && (email = user.getEmail()) != null) {
            C0107d c0107d3 = this.f34580f;
            if (c0107d3 != null) {
                ((EditText) c0107d3.f681c).setText(email);
            }
            C0107d c0107d4 = this.f34580f;
            if (c0107d4 != null) {
                ((PpButton) c0107d4.f683e).setEnabled(true);
            }
        }
        C0107d c0107d5 = this.f34580f;
        if (c0107d5 != null) {
            ((IconicsImageView) c0107d5.f682d).setOnClickListener(new P(this, 1));
        }
    }
}
