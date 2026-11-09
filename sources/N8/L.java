package N8;

import com.transsnet.palmpay.account.ui.activity.PrivacyAccountNoSettingsActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class L implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PrivacyAccountNoSettingsActivity f6162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PrivacyAccountNoSettingsActivity f6163c;

    public /* synthetic */ L(PrivacyAccountNoSettingsActivity privacyAccountNoSettingsActivity, PrivacyAccountNoSettingsActivity privacyAccountNoSettingsActivity2, int i7) {
        this.f6161a = i7;
        this.f6162b = privacyAccountNoSettingsActivity;
        this.f6163c = privacyAccountNoSettingsActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String accountNumber;
        PrivacyAccountNoSettingsActivity privacyAccountNoSettingsActivity = this.f6162b;
        switch (this.f6161a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    privacyAccountNoSettingsActivity.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    privacyAccountNoSettingsActivity.showLoadingDialog(false, true);
                    CommonStringResult commonStringResult = (CommonStringResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    BaseApplication.get().getUser().setAccountNumber(commonStringResult.data);
                    p156ka.a userDataSource = BaseApplication.get().getUserDataSource();
                    User user = BaseApplication.get().getUser();
                    userDataSource.getClass();
                    p156ka.a.c(user);
                    int i7 = PrivacyAccountNoSettingsActivity.f25966d;
                    PrivacyAccountNoSettingsActivity privacyAccountNoSettingsActivity2 = this.f6163c;
                    privacyAccountNoSettingsActivity2.n();
                    io.fastkv.n.O(privacyAccountNoSettingsActivity2, 0, null, null, null, null, null, privacyAccountNoSettingsActivity2.getString(F8.h.ac_msg_create_account_no, Pa.i0.n(commonStringResult.data, false)), Integer.valueOf(p025ba.k.core_confirm), null, null, null, null, null, null, false, 0, 8388223);
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    privacyAccountNoSettingsActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    privacyAccountNoSettingsActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    privacyAccountNoSettingsActivity.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    privacyAccountNoSettingsActivity.showLoadingDialog(false, true);
                    User user2 = BaseApplication.get().getUser();
                    int i10 = PrivacyAccountNoSettingsActivity.f25966d;
                    PrivacyAccountNoSettingsActivity privacyAccountNoSettingsActivity3 = this.f6163c;
                    I8.b bVar = (I8.b) privacyAccountNoSettingsActivity3.f27334c;
                    if (bVar == null || !bVar.f4041c.isChecked()) {
                        I8.b bVar2 = (I8.b) privacyAccountNoSettingsActivity3.f27334c;
                        if (bVar2 == null || !bVar2.f4042d.isChecked()) {
                            accountNumber = "";
                        } else {
                            User user3 = BaseApplication.get().getUser();
                            if (user3 != null) {
                                accountNumber = user3.getAccountNumber();
                            } else {
                                accountNumber = null;
                            }
                        }
                    } else {
                        User user4 = BaseApplication.get().getUser();
                        if (user4 != null) {
                            accountNumber = user4.getPhoneNumber();
                        } else {
                            accountNumber = null;
                        }
                    }
                    user2.setDisplayAccountNumber(accountNumber);
                    p156ka.a userDataSource2 = BaseApplication.get().getUserDataSource();
                    User user5 = BaseApplication.get().getUser();
                    userDataSource2.getClass();
                    p156ka.a.c(user5);
                    org.greenrobot.eventbus.c.b().f(new MessageEvent(4));
                    privacyAccountNoSettingsActivity3.finish();
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    privacyAccountNoSettingsActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    privacyAccountNoSettingsActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
