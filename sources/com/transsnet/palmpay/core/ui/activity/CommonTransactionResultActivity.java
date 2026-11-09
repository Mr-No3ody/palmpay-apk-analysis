package com.transsnet.palmpay.core.ui.activity;

import Pa.r0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "通用交易结果页面", path = "/core/common_transaction_result")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/CommonTransactionResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Lja/a;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommonTransactionResultActivity extends BaseMvvmVBActivity<BaseViewModel, p142ja.a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f27482g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f27484e = 0L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27485f;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(p025ba.g.core_activity_common_transaction_result, (ViewGroup) null, false);
        int i7 = p025ba.e.llBottom;
        if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = p025ba.e.modelResultHeaderView;
            TransactionResultHeaderModel transactionResultHeaderModel = (TransactionResultHeaderModel) p059e1.a.m(i7, viewInflate);
            if (transactionResultHeaderModel != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                int i10 = p025ba.e.titleBar;
                PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i10, viewInflate);
                if (ppTitleBar != null) {
                    i10 = p025ba.e.tvCompleteBtn;
                    TextView textView = (TextView) p059e1.a.m(i10, viewInflate);
                    if (textView != null) {
                        p142ja.a aVar = new p142ja.a(linearLayout, transactionResultHeaderModel, ppTitleBar, textView);
                        Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                        return aVar;
                    }
                }
                i7 = i10;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ImageView backImageView;
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        p142ja.a aVar = (p142ja.a) this.f27334c;
        if (aVar != null && (backImageView = aVar.f38446c.getBackImageView()) != null) {
            final int i7 = 0;
            backImageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.v

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CommonTransactionResultActivity f27813b;

                {
                    this.f27813b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommonTransactionResultActivity commonTransactionResultActivity = this.f27813b;
                    switch (i7) {
                        case 0:
                            int i10 = CommonTransactionResultActivity.f27482g;
                            commonTransactionResultActivity.finish();
                            break;
                        default:
                            int i11 = CommonTransactionResultActivity.f27482g;
                            commonTransactionResultActivity.finish();
                            break;
                    }
                }
            });
        }
        p142ja.a aVar2 = (p142ja.a) this.f27334c;
        if (aVar2 != null) {
            final int i10 = 1;
            aVar2.f38447d.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.v

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CommonTransactionResultActivity f27813b;

                {
                    this.f27813b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommonTransactionResultActivity commonTransactionResultActivity = this.f27813b;
                    switch (i10) {
                        case 0:
                            int i11 = CommonTransactionResultActivity.f27482g;
                            commonTransactionResultActivity.finish();
                            break;
                        default:
                            int i12 = CommonTransactionResultActivity.f27482g;
                            commonTransactionResultActivity.finish();
                            break;
                    }
                }
            });
        }
        p142ja.a aVar3 = (p142ja.a) this.f27334c;
        if (aVar3 != null) {
            TransactionResultHeaderModel transactionResultHeaderModel = aVar3.f38445b;
            Long l5 = this.f27484e;
            transactionResultHeaderModel.c(r0.B(l5 != null ? l5.longValue() : 0L, true));
        }
        String str = this.f27483d;
        if (str == null) {
            str = "";
        }
        Integer num = 1;
        if (str.equals(num.toString())) {
            p142ja.a aVar4 = (p142ja.a) this.f27334c;
            if (aVar4 != null) {
                aVar4.f38445b.d(p025ba.k.core_successful);
            }
            p142ja.a aVar5 = (p142ja.a) this.f27334c;
            if (aVar5 != null) {
                aVar5.f38445b.g(TransactionResultHeaderModel.a.successIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
            }
        } else {
            Integer num2 = 2;
            if (str.equals(num2.toString())) {
                p142ja.a aVar6 = (p142ja.a) this.f27334c;
                if (aVar6 != null) {
                    aVar6.f38445b.e(getString(p025ba.k.core_transaction_failed));
                }
                p142ja.a aVar7 = (p142ja.a) this.f27334c;
                if (aVar7 != null) {
                    aVar7.f38445b.g(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                }
            } else {
                p142ja.a aVar8 = (p142ja.a) this.f27334c;
                if (aVar8 != null) {
                    aVar8.f38445b.e(getString(com.transsnet.palmpay.custom_view.v.cv_processing));
                }
                p142ja.a aVar9 = (p142ja.a) this.f27334c;
                if (aVar9 != null) {
                    aVar9.f38445b.g(TransactionResultHeaderModel.a.processingIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                }
            }
        }
        r0.O1("TRANSACTION_PAGE_REDIRECTION_SUCCESSFUL", "", null);
    }
}
