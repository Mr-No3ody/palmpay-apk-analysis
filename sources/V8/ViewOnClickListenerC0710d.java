package V8;

import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.bean.rsp.CountryRegionList;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAddressFragment;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.util.KeyboardUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0710d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationAddressFragment f10124b;

    public /* synthetic */ ViewOnClickListenerC0710d(IdentityVerificationAddressFragment identityVerificationAddressFragment, int i7) {
        this.f10123a = i7;
        this.f10124b = identityVerificationAddressFragment;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0188  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView;
        List list;
        String editContent;
        List list2;
        int i7;
        List<CountryRegionList> list3;
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        IdentityVerificationAddressFragment identityVerificationAddressFragment = this.f10124b;
        switch (this.f10123a) {
            case 0:
                int i10 = IdentityVerificationAddressFragment.f26156Q;
                if (!r0.U0()) {
                    I8.p pVar = (I8.p) identityVerificationAddressFragment.f27335j;
                    if (pVar != null && (textView = pVar.f4184o) != null) {
                        textView.setEnabled(false);
                    }
                    identityVerificationAddressFragment.z();
                    identityVerificationAddressFragment.y();
                    break;
                }
                break;
            case 1:
                int i11 = IdentityVerificationAddressFragment.f26156Q;
                KeyboardUtils.hideSoftInput(identityVerificationAddressFragment.getActivity());
                List list4 = identityVerificationAddressFragment.f26166w;
                if (list4 == null || list4.isEmpty()) {
                    IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) identityVerificationAddressFragment.f27333i;
                    if (identityVerificationViewModel != null) {
                        identityVerificationViewModel.j(true);
                    }
                } else {
                    identityVerificationAddressFragment.D();
                }
                break;
            case 2:
                int i12 = IdentityVerificationAddressFragment.f26156Q;
                KeyboardUtils.hideSoftInput(identityVerificationAddressFragment.getActivity());
                I8.p pVar2 = (I8.p) identityVerificationAddressFragment.f27335j;
                if (TextUtils.isEmpty(IdentityVerificationAddressFragment.v(pVar2 != null ? pVar2.f4177c : null)) || (list = identityVerificationAddressFragment.f26166w) == null || list.isEmpty()) {
                    I8.p pVar3 = (I8.p) identityVerificationAddressFragment.f27335j;
                    if (pVar3 != null) {
                        PpFormVertical ppFormVertical = pVar3.f4177c;
                        String string = identityVerificationAddressFragment.getString(F8.h.ac_msg_set_state_first);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        ppFormVertical.setBottomText(p220oa.h.B(string, identityVerificationAddressFragment.getActivity(), null, Integer.valueOf(L6.b.ppColorError), null, null, null, 1018));
                    }
                    break;
                } else {
                    List list5 = identityVerificationAddressFragment.f26166w;
                    if (list5 != null && !list5.isEmpty()) {
                        String str = (String) identityVerificationAddressFragment.w().get(identityVerificationAddressFragment.f26158B);
                        ArrayList arrayList = new ArrayList();
                        if (identityVerificationAddressFragment.f26166w != null && !TextUtils.isEmpty(str)) {
                            List<CountryRegionList> list6 = identityVerificationAddressFragment.f26166w;
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
                        I8.p pVar4 = (I8.p) identityVerificationAddressFragment.f27335j;
                        editContent = pVar4 != null ? pVar4.f4178d.getEditContent() : null;
                        int i13 = identityVerificationAddressFragment.f26160H;
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
                        com.transsnet.palmpay.custom_view.dialog.p pVar5 = new com.transsnet.palmpay.custom_view.dialog.p(identityVerificationAddressFragment.requireContext());
                        pVar5.b(p025ba.k.core_select);
                        pVar5.a((CharSequence[]) arrayList.toArray(new String[0]), i13, new DialogInterfaceOnClickListenerC0709c(identityVerificationAddressFragment, arrayList));
                        pVar5.show();
                        break;
                    }
                }
                break;
            case 3:
                int i15 = IdentityVerificationAddressFragment.f26156Q;
                KeyboardUtils.hideSoftInput(identityVerificationAddressFragment.getActivity());
                I8.p pVar6 = (I8.p) identityVerificationAddressFragment.f27335j;
                if (TextUtils.isEmpty(IdentityVerificationAddressFragment.v(pVar6 != null ? pVar6.f4177c : null)) || (list2 = identityVerificationAddressFragment.f26166w) == null || list2.isEmpty()) {
                    I8.p pVar7 = (I8.p) identityVerificationAddressFragment.f27335j;
                    if (pVar7 != null) {
                        PpFormVertical ppFormVertical2 = pVar7.f4177c;
                        String string2 = identityVerificationAddressFragment.getString(F8.h.ac_msg_set_state_first);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        ppFormVertical2.setBottomText(p220oa.h.B(string2, identityVerificationAddressFragment.getActivity(), null, Integer.valueOf(L6.b.ppColorError), null, null, null, 1018));
                    }
                    break;
                } else {
                    I8.p pVar8 = (I8.p) identityVerificationAddressFragment.f27335j;
                    if (TextUtils.isEmpty(IdentityVerificationAddressFragment.v(pVar8 != null ? pVar8.f4178d : null))) {
                        I8.p pVar9 = (I8.p) identityVerificationAddressFragment.f27335j;
                        if (pVar9 != null) {
                            PpFormVertical ppFormVertical3 = pVar9.f4178d;
                            String string3 = identityVerificationAddressFragment.getString(F8.h.ac_msg_set_city_first);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            ppFormVertical3.setBottomText(p220oa.h.B(string3, identityVerificationAddressFragment.getActivity(), null, Integer.valueOf(L6.b.ppColorError), null, null, null, 1018));
                        }
                        break;
                    } else {
                        List list7 = identityVerificationAddressFragment.f26159C;
                        if (list7 != null && !list7.isEmpty()) {
                            List list8 = identityVerificationAddressFragment.f26159C;
                            Intrinsics.e(list8);
                            String areaName2 = ((CountryRegionList) list8.get(identityVerificationAddressFragment.f26160H)).areaName;
                            Intrinsics.checkNotNullExpressionValue(areaName2, "areaName");
                            ArrayList arrayList2 = new ArrayList();
                            if (identityVerificationAddressFragment.f26159C != null && !TextUtils.isEmpty(areaName2)) {
                                List<CountryRegionList> list9 = identityVerificationAddressFragment.f26159C;
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
                            I8.p pVar10 = (I8.p) identityVerificationAddressFragment.f27335j;
                            editContent = pVar10 != null ? pVar10.f4179e.getEditContent() : null;
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
                            com.transsnet.palmpay.custom_view.dialog.p pVar11 = new com.transsnet.palmpay.custom_view.dialog.p(identityVerificationAddressFragment.requireContext());
                            pVar11.b(p025ba.k.core_select);
                            pVar11.a((CharSequence[]) arrayList2.toArray(new String[0]), i7, new DialogInterfaceOnClickListenerC0709c(arrayList2, identityVerificationAddressFragment));
                            pVar11.show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                int i16 = IdentityVerificationAddressFragment.f26156Q;
                if (!r0.U0()) {
                    I8.p pVar12 = (I8.p) identityVerificationAddressFragment.f27335j;
                    if (pVar12 != null) {
                        pVar12.f4184o.setEnabled(false);
                    }
                    IdentityVerificationActivity identityVerificationActivityX = identityVerificationAddressFragment.x();
                    if (identityVerificationActivityX != null && (checkIdentifyReqN = identityVerificationActivityX.n()) != null) {
                        checkIdentifyReqN.areaName = null;
                        checkIdentifyReqN.areaCode = null;
                        checkIdentifyReqN.stateCode = null;
                        checkIdentifyReqN.stateName = null;
                        checkIdentifyReqN.lgaName = null;
                        checkIdentifyReqN.lgaCode = null;
                        checkIdentifyReqN.street = null;
                    }
                    IdentityVerificationActivity identityVerificationActivityX2 = identityVerificationAddressFragment.x();
                    if (identityVerificationActivityX2 != null) {
                        ApplyBalanceV2Req applyBalanceV2ReqM = identityVerificationActivityX2.m();
                        applyBalanceV2ReqM.areaName = null;
                        applyBalanceV2ReqM.areaCode = null;
                        applyBalanceV2ReqM.stateCode = null;
                        applyBalanceV2ReqM.stateName = null;
                        applyBalanceV2ReqM.lgaName = null;
                        applyBalanceV2ReqM.lgaCode = null;
                        applyBalanceV2ReqM.street = null;
                    }
                    IdentityVerificationActivity identityVerificationActivityX3 = identityVerificationAddressFragment.x();
                    if (identityVerificationActivityX3 != null && (addUserExtraInfoReqL = identityVerificationActivityX3.l()) != null) {
                        addUserExtraInfoReqL.areaName = null;
                        addUserExtraInfoReqL.areaCode = null;
                        addUserExtraInfoReqL.stateCode = null;
                        addUserExtraInfoReqL.stateName = null;
                        addUserExtraInfoReqL.lgaName = null;
                        addUserExtraInfoReqL.lgaCode = null;
                        addUserExtraInfoReqL.street = null;
                        addUserExtraInfoReqL.verifyType = null;
                        addUserExtraInfoReqL.verifyNum = null;
                    }
                    identityVerificationAddressFragment.y();
                    break;
                }
                break;
            default:
                identityVerificationAddressFragment.f26165v = true;
                androidx.fragment.app.E activity = identityVerificationAddressFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
        }
    }
}
