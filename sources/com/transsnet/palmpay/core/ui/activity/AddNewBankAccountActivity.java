package com.transsnet.palmpay.core.ui.activity;

import N8.q0;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountSelectBankFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/add_new_bank_account")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/AddNewBankAccountActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddNewBankAccountActivity extends BaseActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27417d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f27418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f27419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27420c;

    public AddNewBankAccountActivity() {
        final int i7 = 0;
        this.f27418a = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewBankAccountActivity f27746b;

            {
                this.f27746b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewBankAccountActivity addNewBankAccountActivity = this.f27746b;
                switch (i7) {
                    case 0:
                        int i10 = AddNewBankAccountActivity.f27417d;
                        return (TextView) addNewBankAccountActivity.findViewById(L9.a.tvMessage);
                    default:
                        int i11 = AddNewBankAccountActivity.f27417d;
                        return (TextView) addNewBankAccountActivity.findViewById(L9.a.tvTitle);
                }
            }
        });
        final int i10 = 1;
        this.f27419b = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewBankAccountActivity f27746b;

            {
                this.f27746b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewBankAccountActivity addNewBankAccountActivity = this.f27746b;
                switch (i10) {
                    case 0:
                        int i11 = AddNewBankAccountActivity.f27417d;
                        return (TextView) addNewBankAccountActivity.findViewById(L9.a.tvMessage);
                    default:
                        int i12 = AddNewBankAccountActivity.f27417d;
                        return (TextView) addNewBankAccountActivity.findViewById(L9.a.tvTitle);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return L9.b.core_activity_add_new_bank_account_v2;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        Fragment fragmentD = getSupportFragmentManager().D(L9.a.fragmentContainer);
        if (fragmentD instanceof AddBankAccountSelectBankFragment) {
            finish();
            return;
        }
        getSupportFragmentManager().S();
        if (fragmentD instanceof AddBankAccountOtpFragment) {
            ((TextView) this.f27419b.getValue()).setText(p025ba.k.core_bind_bank_account_title);
            ((TextView) this.f27418a.getValue()).setText(p025ba.k.core_msg_select_bank_account);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        androidx.fragment.app.Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(L9.a.fragmentContainer, new AddBankAccountSelectBankFragment(), null);
        c1161aE.c(null);
        c1161aE.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
    }
}
