package De;

import Bc.C0104a;
import Bc.f;
import I8.p;
import android.content.DialogInterface;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.rsp.CountryRegionList;
import com.transsnet.palmpay.account.bean.rsp.GuardianRelationListBean;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianRelationShipFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAddressFragment;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepAddressEditFragment;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.ui.fragment.settings.PaymentSettingsFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f1872b;

    public /* synthetic */ d(BaseFragment baseFragment, int i7) {
        this.f1871a = i7;
        this.f1872b = baseFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        CountryRegionList countryRegionList;
        PpFormVertical ppFormVertical3;
        PpFormVertical ppFormVertical4;
        CountryRegionList countryRegionList2;
        List<CountryRegionList> list = null;
        BaseFragment baseFragment = this.f1872b;
        switch (this.f1871a) {
            case 0:
                PaymentSettingsFragment paymentSettingsFragment = (PaymentSettingsFragment) baseFragment;
                int i10 = PaymentSettingsFragment.f35271C;
                dialogInterface.dismiss();
                try {
                    int[] iArr = paymentSettingsFragment.f35273B;
                    Intrinsics.e(iArr);
                    paymentSettingsFragment.w(iArr[i7]);
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                AddGuardianRelationShipFragment addGuardianRelationShipFragment = (AddGuardianRelationShipFragment) baseFragment;
                addGuardianRelationShipFragment.f26136p = i7;
                f fVar = addGuardianRelationShipFragment.t;
                if (fVar != null && (ppFormVertical = (PpFormVertical) fVar.f700f) != null) {
                    ppFormVertical.setEditContent(((GuardianRelationListBean) addGuardianRelationShipFragment.A().get(addGuardianRelationShipFragment.f26136p)).relationName);
                    break;
                }
                break;
            case 2:
                if (dialogInterface != null) {
                    int i11 = IdentityVerificationAddressFragment.f26156Q;
                    dialogInterface.dismiss();
                }
                IdentityVerificationAddressFragment identityVerificationAddressFragment = (IdentityVerificationAddressFragment) baseFragment;
                if (identityVerificationAddressFragment.f26158B != i7) {
                    identityVerificationAddressFragment.f26160H = 0;
                    p pVar = (p) identityVerificationAddressFragment.f27335j;
                    if (pVar != null && (ppFormVertical4 = pVar.f4178d) != null) {
                        ppFormVertical4.setEditContent("");
                    }
                    p pVar2 = (p) identityVerificationAddressFragment.f27335j;
                    if (pVar2 != null && (ppFormVertical3 = pVar2.f4179e) != null) {
                        ppFormVertical3.setEditContent("");
                    }
                }
                identityVerificationAddressFragment.f26158B = i7;
                identityVerificationAddressFragment.f26163o = null;
                identityVerificationAddressFragment.f26164p = null;
                identityVerificationAddressFragment.t = null;
                List list2 = identityVerificationAddressFragment.f26166w;
                if (list2 != null && (countryRegionList = (CountryRegionList) list2.get(i7)) != null) {
                    list = countryRegionList.children;
                }
                identityVerificationAddressFragment.f26159C = list;
                p pVar3 = (p) identityVerificationAddressFragment.f27335j;
                if (pVar3 != null && (ppFormVertical2 = pVar3.f4177c) != null) {
                    ppFormVertical2.setEditContent((String) identityVerificationAddressFragment.w().get(identityVerificationAddressFragment.f26158B));
                    break;
                }
                break;
            default:
                if (dialogInterface != null) {
                    int i12 = UpgradeTier3StepAddressEditFragment.f26283C;
                    dialogInterface.dismiss();
                }
                UpgradeTier3StepAddressEditFragment upgradeTier3StepAddressEditFragment = (UpgradeTier3StepAddressEditFragment) baseFragment;
                if (upgradeTier3StepAddressEditFragment.f26289v != i7) {
                    upgradeTier3StepAddressEditFragment.f26284A = 0;
                    C0104a c0104a = upgradeTier3StepAddressEditFragment.f26286j;
                    if (c0104a != null) {
                        ((PpFormVertical) c0104a.f655g).setEditContent("");
                    }
                    C0104a c0104a2 = upgradeTier3StepAddressEditFragment.f26286j;
                    if (c0104a2 != null) {
                        ((PpFormVertical) c0104a2.f656i).setEditContent("");
                    }
                }
                upgradeTier3StepAddressEditFragment.f26289v = i7;
                List list3 = upgradeTier3StepAddressEditFragment.f26288p;
                if (list3 != null && (countryRegionList2 = (CountryRegionList) list3.get(i7)) != null) {
                    list = countryRegionList2.children;
                }
                upgradeTier3StepAddressEditFragment.f26290w = list;
                C0104a c0104a3 = upgradeTier3StepAddressEditFragment.f26286j;
                if (c0104a3 != null) {
                    ((PpFormVertical) c0104a3.f654f).setEditContent((String) upgradeTier3StepAddressEditFragment.t.get(upgradeTier3StepAddressEditFragment.f26289v));
                }
                break;
        }
    }
}
