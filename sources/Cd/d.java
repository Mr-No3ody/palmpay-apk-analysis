package Cd;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.fragment.app.g0;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.ui.activity.AddBankCardAccountActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcSelectContactsActivity;
import com.transsnet.palmpay.credit.ui.fragment.BeneficiariesListFragment;
import com.transsnet.palmpay.credit.ui.fragment.MobileContactsListFragment;
import com.transsnet.palmpay.send_money.ui.fragment.AddBankAccountFragment;
import com.transsnet.palmpay.send_money.ui.fragment.AddBeneficiaryFragment;
import com.transsnet.palmpay.send_money.ui.fragment.AddMobileContactFragment;
import com.transsnet.palmpay.ui.activity.bankcard.BankCardAndAccountActivity;
import com.transsnet.palmpay.ui.fragment.BankAccountFragment;
import com.transsnet.palmpay.ui.fragment.BankCardFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1360j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Z z3, int i7) {
        super(z3);
        this.f1359i = i7;
        this.f1360j = obj;
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        switch (this.f1359i) {
        }
        return 2;
    }

    @Override // androidx.viewpager.widget.a
    public final CharSequence e(int i7) {
        switch (this.f1359i) {
            case 0:
                AddBeneficiaryFragment addBeneficiaryFragment = (AddBeneficiaryFragment) this.f1360j;
                if (i7 == 0) {
                    return addBeneficiaryFragment.getString(p159kd.h.sm_mobile_contacts);
                }
                if (i7 == 1) {
                    return addBeneficiaryFragment.getString(p159kd.h.sm_bank_account);
                }
                if (i7 != 2) {
                    return null;
                }
                return addBeneficiaryFragment.getString(p159kd.h.sm_mobile_wallet);
            case 1:
                AddBankCardAccountActivity addBankCardAccountActivity = (AddBankCardAccountActivity) this.f1360j;
                if (i7 == 0) {
                    return addBankCardAccountActivity.getString(p025ba.k.core_bank_card);
                }
                if (i7 != 1) {
                    return null;
                }
                return addBankCardAccountActivity.getString(p025ba.k.core_bank_account);
            case 2:
                BankCardAndAccountActivity bankCardAndAccountActivity = (BankCardAndAccountActivity) this.f1360j;
                if (i7 == 0) {
                    return bankCardAndAccountActivity.getString(Ac.h.main_bank_card);
                }
                if (i7 != 1) {
                    return null;
                }
                return bankCardAndAccountActivity.getString(Ac.h.main_bank_account);
            default:
                if (i7 == 0) {
                    return "Beneficiaries";
                }
                if (i7 != 1) {
                    return null;
                }
                return "Local Contact";
        }
    }

    @Override // androidx.fragment.app.g0
    public final Fragment n(int i7) {
        Fragment addMobileContactFragment;
        Fragment fragment;
        Fragment beneficiariesListFragment;
        switch (this.f1359i) {
            case 0:
                AddBeneficiaryFragment addBeneficiaryFragment = (AddBeneficiaryFragment) this.f1360j;
                if (addBeneficiaryFragment.f33659i.get(i7) != null) {
                    return (Fragment) addBeneficiaryFragment.f33659i.get(i7);
                }
                if (i7 == 0) {
                    addMobileContactFragment = new AddMobileContactFragment();
                    addBeneficiaryFragment.f33659i.put(i7, addMobileContactFragment);
                } else {
                    if (i7 != 1) {
                        return null;
                    }
                    addMobileContactFragment = new AddBankAccountFragment();
                    addBeneficiaryFragment.f33659i.put(i7, addMobileContactFragment);
                }
                return addMobileContactFragment;
            case 1:
                AddBankCardAccountActivity addBankCardAccountActivity = (AddBankCardAccountActivity) this.f1360j;
                if (addBankCardAccountActivity.f27416e.get(i7) != null) {
                    Object obj = addBankCardAccountActivity.f27416e.get(i7);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    return (Fragment) obj;
                }
                if (i7 == 0) {
                    Object objNavigation = ARouter.getInstance().build("/coreImpl/add_new_fragment").with(addBankCardAccountActivity.getIntent().getExtras()).navigation();
                    Intrinsics.f(objNavigation, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                    fragment = (Fragment) objNavigation;
                    addBankCardAccountActivity.f27416e.put(i7, fragment);
                } else {
                    Object objNavigation2 = ARouter.getInstance().build("/coreImpl/add_account_fragment").with(addBankCardAccountActivity.getIntent().getExtras()).navigation();
                    Intrinsics.f(objNavigation2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                    fragment = (Fragment) objNavigation2;
                    addBankCardAccountActivity.f27416e.put(i7, fragment);
                }
                return fragment;
            case 2:
                BankCardAndAccountActivity bankCardAndAccountActivity = (BankCardAndAccountActivity) this.f1360j;
                if (bankCardAndAccountActivity.f34639d.get(i7) != null) {
                    return (Fragment) bankCardAndAccountActivity.f34639d.get(i7);
                }
                if (i7 == 0) {
                    BankCardFragment bankCardFragment = new BankCardFragment();
                    bankCardAndAccountActivity.f34639d.put(0, bankCardFragment);
                    return bankCardFragment;
                }
                if (i7 != 1) {
                    return null;
                }
                BankAccountFragment bankAccountFragment = new BankAccountFragment();
                bankCardAndAccountActivity.f34639d.put(1, bankAccountFragment);
                return bankAccountFragment;
            default:
                OcSelectContactsActivity ocSelectContactsActivity = (OcSelectContactsActivity) this.f1360j;
                if (ocSelectContactsActivity.f29864f.get(i7) != null) {
                    return (Fragment) ocSelectContactsActivity.f29864f.get(i7);
                }
                if (i7 == 0) {
                    beneficiariesListFragment = new BeneficiariesListFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("oc_contact_type", ocSelectContactsActivity.f29861c);
                    beneficiariesListFragment.setArguments(bundle);
                    ocSelectContactsActivity.f29864f.put(i7, beneficiariesListFragment);
                } else {
                    if (i7 != 1) {
                        return null;
                    }
                    beneficiariesListFragment = new MobileContactsListFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("oc_contact_type", ocSelectContactsActivity.f29861c);
                    beneficiariesListFragment.setArguments(bundle2);
                    ocSelectContactsActivity.f29864f.put(i7, beneficiariesListFragment);
                }
                return beneficiariesListFragment;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AddBankCardAccountActivity addBankCardAccountActivity, Z z3) {
        super(z3);
        this.f1359i = 1;
        this.f1360j = addBankCardAccountActivity;
        Intrinsics.e(z3);
    }
}
