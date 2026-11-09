package p024b9;

import Bc.C0104a;
import F8.h;
import L6.b;
import android.text.TextUtils;
import android.view.View;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.rsp.CountryRegionList;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepAddressEditFragment;
import com.transsnet.palmpay.custom_view.dialog.p;
import com.transsnet.palmpay.util.KeyboardUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p051d9.C1628z;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UpgradeTier3StepAddressEditFragment f18805b;

    public /* synthetic */ f(UpgradeTier3StepAddressEditFragment upgradeTier3StepAddressEditFragment, int i7) {
        this.f18804a = i7;
        this.f18805b = upgradeTier3StepAddressEditFragment;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x011d  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List list;
        String editContent;
        List list2;
        int i7;
        List<CountryRegionList> list3;
        UpgradeTier3StepAddressEditFragment upgradeTier3StepAddressEditFragment = this.f18805b;
        switch (this.f18804a) {
            case 0:
                int i10 = UpgradeTier3StepAddressEditFragment.f26283C;
                C1628z c1628z = (C1628z) upgradeTier3StepAddressEditFragment.f27328i;
                if (c1628z != null) {
                    c1628z.getIdIdentityList(true);
                }
                break;
            case 1:
                int i11 = UpgradeTier3StepAddressEditFragment.f26283C;
                KeyboardUtils.hideSoftInput(upgradeTier3StepAddressEditFragment.getActivity());
                List list4 = upgradeTier3StepAddressEditFragment.f26288p;
                if (list4 == null || list4.isEmpty()) {
                    C1628z c1628z2 = (C1628z) upgradeTier3StepAddressEditFragment.f27328i;
                    if (c1628z2 != null) {
                        c1628z2.queryRegionList(true);
                    }
                } else {
                    upgradeTier3StepAddressEditFragment.z();
                }
                break;
            case 2:
                int i12 = UpgradeTier3StepAddressEditFragment.f26283C;
                KeyboardUtils.hideSoftInput(upgradeTier3StepAddressEditFragment.getActivity());
                C0104a c0104a = upgradeTier3StepAddressEditFragment.f26286j;
                if (TextUtils.isEmpty(UpgradeTier3StepAddressEditFragment.v(c0104a != null ? (PpFormVertical) c0104a.f654f : null)) || (list = upgradeTier3StepAddressEditFragment.f26288p) == null || list.isEmpty()) {
                    C0104a c0104a2 = upgradeTier3StepAddressEditFragment.f26286j;
                    if (c0104a2 != null) {
                        PpFormVertical ppFormVertical = (PpFormVertical) c0104a2.f654f;
                        String string = upgradeTier3StepAddressEditFragment.getString(h.ac_msg_set_state_first);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        ppFormVertical.setBottomText(p220oa.h.B(string, null, null, Integer.valueOf(b.ppColorError), null, null, null, 1019));
                    }
                    break;
                } else {
                    List list5 = upgradeTier3StepAddressEditFragment.f26288p;
                    if (list5 != null && !list5.isEmpty()) {
                        String str = (String) upgradeTier3StepAddressEditFragment.t.get(upgradeTier3StepAddressEditFragment.f26289v);
                        ArrayList arrayList = new ArrayList();
                        if (upgradeTier3StepAddressEditFragment.f26288p != null && !TextUtils.isEmpty(str)) {
                            List<CountryRegionList> list6 = upgradeTier3StepAddressEditFragment.f26288p;
                            Intrinsics.e(list6);
                            for (CountryRegionList countryRegionList : list6) {
                                if (Intrinsics.c(str, countryRegionList.areaName)) {
                                    Iterator<CountryRegionList> it = countryRegionList.children.iterator();
                                    while (it.hasNext()) {
                                        String areaName = it.next().areaName;
                                        Intrinsics.checkNotNullExpressionValue(areaName, "areaName");
                                        arrayList.add(areaName);
                                    }
                                }
                            }
                        }
                        C0104a c0104a3 = upgradeTier3StepAddressEditFragment.f26286j;
                        editContent = c0104a3 != null ? ((PpFormVertical) c0104a3.f655g).getEditContent() : null;
                        int i13 = upgradeTier3StepAddressEditFragment.f26284A;
                        if (!TextUtils.isEmpty(editContent)) {
                            Iterator it2 = arrayList.iterator();
                            int i14 = 0;
                            while (it2.hasNext() && !Intrinsics.c((String) it2.next(), editContent)) {
                                i14++;
                            }
                            if (i14 < arrayList.size()) {
                                i13 = i14;
                            }
                        }
                        p pVar = new p(upgradeTier3StepAddressEditFragment.requireContext());
                        pVar.b(k.core_select);
                        pVar.a((CharSequence[]) arrayList.toArray(new String[0]), i13, new e(upgradeTier3StepAddressEditFragment, arrayList));
                        pVar.show();
                        break;
                    }
                }
                break;
            case 3:
                int i15 = UpgradeTier3StepAddressEditFragment.f26283C;
                KeyboardUtils.hideSoftInput(upgradeTier3StepAddressEditFragment.getActivity());
                C0104a c0104a4 = upgradeTier3StepAddressEditFragment.f26286j;
                if (TextUtils.isEmpty(UpgradeTier3StepAddressEditFragment.v(c0104a4 != null ? (PpFormVertical) c0104a4.f654f : null)) || (list2 = upgradeTier3StepAddressEditFragment.f26288p) == null || list2.isEmpty()) {
                    C0104a c0104a5 = upgradeTier3StepAddressEditFragment.f26286j;
                    if (c0104a5 != null) {
                        PpFormVertical ppFormVertical2 = (PpFormVertical) c0104a5.f654f;
                        String string2 = upgradeTier3StepAddressEditFragment.getString(h.ac_msg_set_state_first);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        ppFormVertical2.setBottomText(p220oa.h.B(string2, null, null, Integer.valueOf(b.ppColorError), null, null, null, 1019));
                    }
                    break;
                } else {
                    C0104a c0104a6 = upgradeTier3StepAddressEditFragment.f26286j;
                    if (TextUtils.isEmpty(UpgradeTier3StepAddressEditFragment.v(c0104a6 != null ? (PpFormVertical) c0104a6.f655g : null))) {
                        C0104a c0104a7 = upgradeTier3StepAddressEditFragment.f26286j;
                        if (c0104a7 != null) {
                            PpFormVertical ppFormVertical3 = (PpFormVertical) c0104a7.f655g;
                            String string3 = upgradeTier3StepAddressEditFragment.getString(h.ac_msg_set_city_first);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            ppFormVertical3.setBottomText(p220oa.h.B(string3, null, null, Integer.valueOf(b.ppColorError), null, null, null, 1019));
                        }
                        break;
                    } else {
                        List list7 = upgradeTier3StepAddressEditFragment.f26290w;
                        if (list7 != null && !list7.isEmpty()) {
                            List list8 = upgradeTier3StepAddressEditFragment.f26290w;
                            Intrinsics.e(list8);
                            String areaName2 = ((CountryRegionList) list8.get(upgradeTier3StepAddressEditFragment.f26284A)).areaName;
                            Intrinsics.checkNotNullExpressionValue(areaName2, "areaName");
                            ArrayList arrayList2 = new ArrayList();
                            if (upgradeTier3StepAddressEditFragment.f26290w != null && !TextUtils.isEmpty(areaName2)) {
                                List<CountryRegionList> list9 = upgradeTier3StepAddressEditFragment.f26290w;
                                Intrinsics.e(list9);
                                for (CountryRegionList countryRegionList2 : list9) {
                                    if (Intrinsics.c(areaName2, countryRegionList2.areaName) && (list3 = countryRegionList2.children) != null) {
                                        Iterator<CountryRegionList> it3 = list3.iterator();
                                        while (it3.hasNext()) {
                                            String areaName3 = it3.next().areaName;
                                            Intrinsics.checkNotNullExpressionValue(areaName3, "areaName");
                                            arrayList2.add(areaName3);
                                        }
                                    }
                                }
                            }
                            C0104a c0104a8 = upgradeTier3StepAddressEditFragment.f26286j;
                            editContent = c0104a8 != null ? ((PpFormVertical) c0104a8.f656i).getEditContent() : null;
                            if (TextUtils.isEmpty(editContent)) {
                                i7 = 0;
                            } else {
                                Iterator it4 = arrayList2.iterator();
                                i7 = 0;
                                while (it4.hasNext() && !Intrinsics.c(editContent, (String) it4.next())) {
                                    i7++;
                                }
                                if (i7 >= arrayList2.size()) {
                                    i7 = 0;
                                }
                            }
                            p pVar2 = new p(upgradeTier3StepAddressEditFragment.requireContext());
                            pVar2.b(k.core_select);
                            pVar2.a((CharSequence[]) arrayList2.toArray(new String[0]), i7, new e(arrayList2, upgradeTier3StepAddressEditFragment));
                            pVar2.show();
                            break;
                        }
                    }
                }
                break;
            default:
                int i16 = UpgradeTier3StepAddressEditFragment.f26283C;
                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityW = upgradeTier3StepAddressEditFragment.w();
                if (palmPayLevelUpTier3V2ActivityW != null) {
                    palmPayLevelUpTier3V2ActivityW.onBackPressed();
                }
                break;
        }
    }
}
