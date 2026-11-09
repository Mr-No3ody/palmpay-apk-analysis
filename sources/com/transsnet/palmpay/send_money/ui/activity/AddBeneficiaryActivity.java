package com.transsnet.palmpay.send_money.ui.activity;

import C0.G;
import L6.b;
import Pa.C0525w;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.ui.fragment.AddBeneficiaryFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankAddBankAccountFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayAddMobileAccountFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068ec.d;
import p159kd.e;
import p159kd.f;
import p159kd.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/add_beneficiary")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/AddBeneficiaryActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddBeneficiaryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddBeneficiaryActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/AddBeneficiaryActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
public final class AddBeneficiaryActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33147b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33148a = C2131j.b(new d(this, 11));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void startActForAll(@NotNull Context context) {
            context.startActivity(G.e(context, "context", context, AddBeneficiaryActivity.class).putExtra("beneficiary_type", 0));
        }

        @JvmStatic
        public final void startActForBank(@NotNull Context context) {
            context.startActivity(G.e(context, "context", context, AddBeneficiaryActivity.class).putExtra("beneficiary_type", 2));
        }

        @JvmStatic
        public final void startActForBankEdit(@NotNull Context context, @Nullable RecipientListResp.RecipientBean recipientBean) {
            context.startActivity(G.e(context, "context", context, AddBeneficiaryActivity.class).putExtra("beneficiary_type", 2).putExtra("beneficiary_bean", recipientBean));
        }

        @JvmStatic
        public final void startActForMobile(@NotNull Context context) {
            context.startActivity(G.e(context, "context", context, AddBeneficiaryActivity.class).putExtra("beneficiary_type", 1));
        }

        @JvmStatic
        public final void startActForMobileEdit(@NotNull Context context, @Nullable RecipientListResp.RecipientBean recipientBean) {
            context.startActivity(G.e(context, "context", context, AddBeneficiaryActivity.class).putExtra("beneficiary_type", 1).putExtra("beneficiary_bean", recipientBean));
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_add_beneficiary_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        int intExtra = getIntent().getIntExtra("beneficiary_type", 0);
        String stringExtra = getIntent().getStringExtra("beneficiary_bean");
        Z supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1161a c1161a = new C1161a(supportFragmentManager);
        Intrinsics.checkNotNullExpressionValue(c1161a, "beginTransaction(...)");
        t tVar = this.f33148a;
        if (intExtra == 0) {
            ((PpTitleBar) tVar.getValue()).setTitle(r0.H0(h.sm_add_beneficiaries));
            c1161a.e(e.content_view, new AddBeneficiaryFragment(), "fragment_tag");
            c1161a.h(true);
            return;
        }
        if (intExtra != 1) {
            if (intExtra != 2) {
                return;
            }
            ((PpTitleBar) tVar.getValue()).setTitle(r0.H0(h.sm_add_favorite));
            C0525w.f().getClass();
            RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) C0525w.d(stringExtra, RecipientListResp.RecipientBean.class);
            TransferToBankAddBankAccountFragment transferToBankAddBankAccountFragmentNewInstance = TransferToBankAddBankAccountFragment.f33758M.newInstance();
            transferToBankAddBankAccountFragmentNewInstance.f33765p = recipientBean;
            c1161a.e(e.content_view, transferToBankAddBankAccountFragmentNewInstance, "fragment_tag");
            c1161a.h(true);
            return;
        }
        ((PpTitleBar) tVar.getValue()).setTitle(r0.H0(h.sm_add_favorite));
        C0525w.f().getClass();
        RecipientListResp.RecipientBean recipientBean2 = (RecipientListResp.RecipientBean) C0525w.d(stringExtra, RecipientListResp.RecipientBean.class);
        ((PpTitleBar) tVar.getValue()).setTitle(r0.H0(h.sm_add_mobile_contact));
        int i7 = e.content_view;
        TransferToPalmPayAddMobileAccountFragment transferToPalmPayAddMobileAccountFragmentNewInstance = TransferToPalmPayAddMobileAccountFragment.f33787L.newInstance();
        transferToPalmPayAddMobileAccountFragmentNewInstance.f33793p = recipientBean2;
        Unit unit = Unit.f38893a;
        c1161a.e(i7, transferToPalmPayAddMobileAccountFragmentNewInstance, "fragment_tag");
        c1161a.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        Fragment fragmentE = getSupportFragmentManager().E("fragment_tag");
        if (fragmentE == null || !fragmentE.isAdded()) {
            return;
        }
        fragmentE.onActivityResult(i7, i10, intent);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }
}
