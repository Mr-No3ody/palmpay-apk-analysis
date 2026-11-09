package com.transsnet.palmpay.account.ui.fragment.identify;

import C0.AbstractC0130w;
import Ce.H;
import F8.d;
import F8.h;
import Fd.G;
import Fe.h0;
import I8.n;
import L6.b;
import Pa.r0;
import V8.l;
import V8.o;
import V8.q;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.Barrier;
import androidx.fragment.app.E;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.bean.rsp.CheckIdentifyRsp;
import com.transsnet.palmpay.account.bean.rsp.IdentityVerificationItem;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.bean.rsp.UploadAppsFlyerRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.dialog.GetBvnMethodDialog;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.core.viewmodel.c;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.RegexUtils;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p025ba.k;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationStep1Fragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/IdentityVerificationViewModel;", "LI8/n;", "Landroid/text/TextWatcher;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdentityVerificationStep1Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityVerificationStep1Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationStep1Fragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,915:1\n171#2,12:916\n215#2:928\n171#2,12:929\n215#2:941\n629#3,11:942\n1869#4,2:953\n*S KotlinDebug\n*F\n+ 1 IdentityVerificationStep1Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationStep1Fragment\n*L\n129#1:916,12\n129#1:928\n188#1:929,12\n188#1:941\n578#1:942,11\n678#1:953,2\n*E\n"})
public final class IdentityVerificationStep1Fragment extends BaseMvvmVBFragment<IdentityVerificationViewModel, n> implements TextWatcher, CustomActionCallback, IAutoTrack, View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f26173w = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC0130w f26175p;
    public int t = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f26176v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static void B(TextView textView, int i7) {
        if (i7 != 3) {
            if (i7 == 4 && textView != null) {
                textView.setText(k.core_nin);
            }
        } else if (textView != null) {
            textView.setText(k.core_bvn);
        }
        if (textView != null) {
            textView.setSelected(false);
        }
        if (textView != null) {
            textView.setTag(Integer.valueOf(i7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u(IdentityVerificationStep1Fragment identityVerificationStep1Fragment, CommonBeanResult commonBeanResult) {
        PreCheckPhoneRsp preCheckPhoneRsp;
        PreCheckPhoneRsp preCheckPhoneRsp2;
        PreCheckPhoneRsp preCheckPhoneRsp3;
        IdentityVerificationActivity identityVerificationActivityA = identityVerificationStep1Fragment.A();
        if (identityVerificationActivityA != null && (preCheckPhoneRsp3 = identityVerificationActivityA.f25869i) != null && preCheckPhoneRsp3.needFaceAfterVerifyNumber) {
            AbstractC0130w abstractC0130w = identityVerificationStep1Fragment.f26175p;
            if (abstractC0130w != null) {
                abstractC0130w.h(d.fragment_identity_verification_step_face_2, ((CheckIdentifyRsp) commonBeanResult.data).saveAddressToBundle(new Bundle()), null);
                return;
            }
            return;
        }
        CheckIdentifyRsp checkIdentifyRsp = (CheckIdentifyRsp) commonBeanResult.data;
        if (TextUtils.isEmpty(checkIdentifyRsp != null ? checkIdentifyRsp.verifyToken : null)) {
            AbstractC0130w abstractC0130w2 = identityVerificationStep1Fragment.f26175p;
            if (abstractC0130w2 != null) {
                abstractC0130w2.h(d.fragment_identity_verification_step2, null, null);
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityA2 = identityVerificationStep1Fragment.A();
        ApplyBalanceV2Req applyBalanceV2ReqM = identityVerificationActivityA2 != null ? identityVerificationActivityA2.m() : null;
        if (applyBalanceV2ReqM != null) {
            CheckIdentifyRsp checkIdentifyRsp2 = (CheckIdentifyRsp) commonBeanResult.data;
            applyBalanceV2ReqM.verifyToken = checkIdentifyRsp2 != null ? checkIdentifyRsp2.verifyToken : null;
        }
        IdentityVerificationActivity identityVerificationActivityA3 = identityVerificationStep1Fragment.A();
        if (identityVerificationActivityA3 != null && (preCheckPhoneRsp2 = identityVerificationActivityA3.f25869i) != null && preCheckPhoneRsp2.needIndustry) {
            Bundle bundle = new Bundle();
            bundle.putString("_token", ((CheckIdentifyRsp) commonBeanResult.data).verifyToken);
            AbstractC0130w abstractC0130w3 = identityVerificationStep1Fragment.f26175p;
            if (abstractC0130w3 != null) {
                abstractC0130w3.h(d.fragment_identity_verification_step_profile, ((CheckIdentifyRsp) commonBeanResult.data).saveAddressToBundle(bundle), null);
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityA4 = identityVerificationStep1Fragment.A();
        if (identityVerificationActivityA4 != null && (preCheckPhoneRsp = identityVerificationActivityA4.f25869i) != null && preCheckPhoneRsp.needAddress) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("_token", ((CheckIdentifyRsp) commonBeanResult.data).verifyToken);
            ((CheckIdentifyRsp) commonBeanResult.data).saveAddressToBundle(bundle2);
            AbstractC0130w abstractC0130w4 = identityVerificationStep1Fragment.f26175p;
            if (abstractC0130w4 != null) {
                abstractC0130w4.h(d.fragment_identity_verification_step_address, bundle2, null);
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityA5 = identityVerificationStep1Fragment.A();
        if (!Intrinsics.c(identityVerificationActivityA5 != null ? identityVerificationActivityA5.f25866e : null, "FROM_REGISITER_PAGE")) {
            IdentityVerificationActivity identityVerificationActivityA6 = identityVerificationStep1Fragment.A();
            if (identityVerificationActivityA6 != null) {
                identityVerificationActivityA6.t(((CheckIdentifyRsp) commonBeanResult.data).verifyToken);
                return;
            }
            return;
        }
        n nVar = (n) identityVerificationStep1Fragment.f27335j;
        if (nVar != null) {
            nVar.f4159g.b(true);
        }
        IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) identityVerificationStep1Fragment.f27333i;
        if (identityVerificationViewModel != null) {
            identityVerificationViewModel.e(applyBalanceV2ReqM);
        }
    }

    public static final void v(IdentityVerificationStep1Fragment identityVerificationStep1Fragment, CommonBeanResult commonBeanResult) {
        if ("VL000115".equalsIgnoreCase(commonBeanResult.getRespCode()) || "40060418".equalsIgnoreCase(commonBeanResult.getRespCode())) {
            E activity = identityVerificationStep1Fragment.getActivity();
            if (activity != null) {
                io.fastkv.n.O(activity, 2, null, identityVerificationStep1Fragment.getString(h.ac_verification_channel_upgrade), null, null, null, commonBeanResult.getRespMsg(), null, "Switch to BVN", new l(identityVerificationStep1Fragment, 0), Integer.valueOf(k.core_retry), null, null, null, false, 0, 8384890);
                return;
            }
            return;
        }
        if ("VL000116".equalsIgnoreCase(commonBeanResult.getRespCode()) || "40060419".equalsIgnoreCase(commonBeanResult.getRespCode())) {
            E activity2 = identityVerificationStep1Fragment.getActivity();
            if (activity2 != null) {
                io.fastkv.n.O(activity2, 2, null, identityVerificationStep1Fragment.getString(h.ac_verification_channel_upgrade), null, null, null, commonBeanResult.getRespMsg(), null, "Switch to NIN", new l(identityVerificationStep1Fragment, 1), Integer.valueOf(k.core_retry), null, null, null, false, 0, 8384890);
                return;
            }
            return;
        }
        E activity3 = identityVerificationStep1Fragment.getActivity();
        if (activity3 != null) {
            io.fastkv.n.O(activity3, 0, Integer.valueOf(k.core_title_attention), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(k.core_retry), null, null, null, null, null, null, false, 0, 8388221);
        }
    }

    public static final void w(IdentityVerificationStep1Fragment identityVerificationStep1Fragment) {
        if (BaseApplication.hasLogin()) {
            V v3 = V.f10828a;
            f fVar = I.f10809a;
            AbstractC0780y.m(v3, e.f19009c, null, new q(2, null), 2);
        }
    }

    public final IdentityVerificationActivity A() {
        E e10 = this.f27319c;
        if (!(e10 instanceof IdentityVerificationActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity");
        return (IdentityVerificationActivity) e10;
    }

    public final void C(AddUserExtraInfoReq addUserExtraInfoReq, IdentityVerificationItem identityVerificationItem) {
        n nVar;
        n nVar2;
        n nVar3 = (n) this.f27335j;
        addUserExtraInfoReq.verifyNum = nVar3 != null ? nVar3.f4156d.getEditContent() : null;
        addUserExtraInfoReq.verifyType = Integer.valueOf(identityVerificationItem.verifyType);
        addUserExtraInfoReq.firstName = null;
        addUserExtraInfoReq.lastName = null;
        addUserExtraInfoReq.middleName = null;
        addUserExtraInfoReq.gender = null;
        addUserExtraInfoReq.birthday = null;
        if (!TextUtils.isEmpty(identityVerificationItem.regex) && RegexUtils.isMatch(identityVerificationItem.regex, addUserExtraInfoReq.verifyNum) != identityVerificationItem.pass && (nVar2 = (n) this.f27335j) != null) {
            PpFormVertical ppFormVertical = nVar2.f4156d;
            String str = identityVerificationItem.regexMsg;
            ppFormVertical.setBottomText(str != null ? p220oa.h.B(str, getActivity(), null, Integer.valueOf(b.ppColorError), null, null, null, 1018) : null);
        }
        if (identityVerificationItem.verifyType == 3) {
            String bvn = addUserExtraInfoReq.verifyNum;
            Intrinsics.checkNotNullExpressionValue(bvn, "verifyNum");
            Intrinsics.checkNotNullParameter(bvn, "bvn");
            if ((TextUtils.isEmpty(bvn) || bvn.length() != 11) && (nVar = (n) this.f27335j) != null) {
                PpFormVertical ppFormVertical2 = nVar.f4156d;
                String string = getString(h.ac_msg_invalid_bvn);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ppFormVertical2.setBottomText(p220oa.h.B(string, getActivity(), null, Integer.valueOf(b.ppColorError), null, null, null, 1018));
            }
        }
    }

    public final void D(AddUserExtraInfoReq addUserExtraInfoReq) {
        n nVar = (n) this.f27335j;
        addUserExtraInfoReq.verifyNum = nVar != null ? nVar.f4156d.getEditContent() : null;
        IdentityVerificationItem identityVerificationItemZ = z(Integer.valueOf(this.t));
        if (identityVerificationItemZ != null) {
            addUserExtraInfoReq.verifyType = Integer.valueOf(identityVerificationItemZ.verifyType);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public final void E(int i7) {
        Object tag;
        Object tag2;
        Iterable iterableF;
        IdentityVerificationItem identityVerificationItem;
        n nVar = (n) this.f27335j;
        if (nVar == null || (tag = nVar.f4164v.getTag()) == null) {
            tag = -1;
        }
        n nVar2 = (n) this.f27335j;
        if (nVar2 == null || (tag2 = nVar2.f4165w.getTag()) == null) {
            tag2 = -1;
        }
        IdentityVerificationActivity identityVerificationActivityA = A();
        Integer numValueOf = null;
        if (identityVerificationActivityA == null) {
            iterableF = z.f38935a;
        } else {
            PreCheckPhoneRsp preCheckPhoneRsp = identityVerificationActivityA.f25869i;
            List<IdentityVerificationItem> list = preCheckPhoneRsp != null ? preCheckPhoneRsp.nameVerifyMethods : null;
            if (list != null) {
                iterableF = C1850q.f(list);
            } else {
                iterableF = z.f38935a;
            }
        }
        Iterator it = iterableF.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            IdentityVerificationActivity identityVerificationActivityA2 = A();
            if (identityVerificationActivityA2 != null) {
                PreCheckPhoneRsp preCheckPhoneRsp2 = identityVerificationActivityA2.f25869i;
                List<IdentityVerificationItem> list2 = preCheckPhoneRsp2 != null ? preCheckPhoneRsp2.nameVerifyMethods : null;
                if (list2 != null && (identityVerificationItem = list2.get(iIntValue)) != null && identityVerificationItem.verifyType == i7) {
                    numValueOf = Integer.valueOf(iIntValue);
                    break;
                }
            }
        }
        int iIntValue2 = numValueOf != null ? numValueOf.intValue() : -1;
        if (tag.equals(Integer.valueOf(i7))) {
            n nVar3 = (n) this.f27335j;
            if (nVar3 != null) {
                nVar3.f4164v.setSelected(true);
            }
            n nVar4 = (n) this.f27335j;
            if (nVar4 != null) {
                nVar4.f4165w.setSelected(false);
            }
            this.t = iIntValue2;
        }
        if (tag2.equals(Integer.valueOf(i7))) {
            n nVar5 = (n) this.f27335j;
            if (nVar5 != null) {
                nVar5.f4164v.setSelected(false);
            }
            n nVar6 = (n) this.f27335j;
            if (nVar6 != null) {
                nVar6.f4165w.setSelected(true);
            }
            this.t = iIntValue2;
        }
        F(this.t);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    public final void F(int i7) {
        n nVar;
        n nVar2;
        AppCompatEditText editText;
        AppCompatEditText editText2;
        IdentityVerificationItem identityVerificationItemZ = z(Integer.valueOf(i7));
        if (identityVerificationItemZ != null) {
            n nVar3 = (n) this.f27335j;
            if (nVar3 != null) {
                nVar3.f4156d.setEditContent("");
            }
            n nVar4 = (n) this.f27335j;
            if (nVar4 != null) {
                p220oa.h.s(nVar4.f4156d, identityVerificationItemZ.verifyType != 5);
            }
            n nVar5 = (n) this.f27335j;
            if (nVar5 != null) {
                p220oa.h.s(nVar5.f4162o, identityVerificationItemZ.verifyType != 5);
            }
            int i10 = identityVerificationItemZ.verifyType;
            if (i10 == 3 || i10 == 4) {
                if (TextUtils.isEmpty(identityVerificationItemZ.regex)) {
                    nVar = (n) this.f27335j;
                    if (nVar != null) {
                        editText.setInputType(524289);
                    }
                    nVar2 = (n) this.f27335j;
                    if (nVar2 != null) {
                        nVar2.f4156d.setInputFilters(new InputFilter[]{new Tb.c(identityVerificationItemZ.maxLength, 0), new Tb.b("[`~!@#$%^&*()+=|{}':;'\\[\\]<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’、？]\n")});
                    }
                } else {
                    String str = identityVerificationItemZ.regex;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = identityVerificationItemZ.maxLength; i11 > 0; i11--) {
                        sb2.append("0");
                    }
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    if (Pattern.matches(str, string)) {
                        String str2 = identityVerificationItemZ.regex;
                        StringBuilder sb3 = new StringBuilder("A");
                        for (int i12 = identityVerificationItemZ.maxLength; i12 > 1; i12--) {
                            sb3.append("0");
                        }
                        String string2 = sb3.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        if (Pattern.matches(str2, string2)) {
                            nVar = (n) this.f27335j;
                            if (nVar != null && (editText = nVar.f4156d.getEditText()) != null) {
                                editText.setInputType(524289);
                            }
                            nVar2 = (n) this.f27335j;
                            if (nVar2 != null) {
                                nVar2.f4156d.setInputFilters(new InputFilter[]{new Tb.c(identityVerificationItemZ.maxLength, 0), new Tb.b("[`~!@#$%^&*()+=|{}':;'\\[\\]<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’、？]\n")});
                            }
                        } else {
                            n nVar6 = (n) this.f27335j;
                            if (nVar6 != null && (editText2 = nVar6.f4156d.getEditText()) != null) {
                                editText2.setInputType(2);
                            }
                            n nVar7 = (n) this.f27335j;
                            if (nVar7 != null) {
                                nVar7.f4156d.setInputFilters(new InputFilter[]{new Tb.c(identityVerificationItemZ.maxLength, 0), new Tb.b(2)});
                            }
                        }
                    } else {
                        nVar = (n) this.f27335j;
                        if (nVar != null) {
                            editText.setInputType(524289);
                        }
                        nVar2 = (n) this.f27335j;
                        if (nVar2 != null) {
                            nVar2.f4156d.setInputFilters(new InputFilter[]{new Tb.c(identityVerificationItemZ.maxLength, 0), new Tb.b("[`~!@#$%^&*()+=|{}':;'\\[\\]<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’、？]\n")});
                        }
                    }
                }
                if (identityVerificationItemZ.verifyType == 3) {
                    n nVar8 = (n) this.f27335j;
                    if (nVar8 != null) {
                        p220oa.h.s(nVar8.f4160i, true);
                    }
                    n nVar9 = (n) this.f27335j;
                    if (nVar9 != null) {
                        nVar9.f4160i.setText("Forgot BVN?");
                    }
                    n nVar10 = (n) this.f27335j;
                    if (nVar10 != null) {
                        nVar10.f4162o.setText("BVN Number");
                    }
                    n nVar11 = (n) this.f27335j;
                    if (nVar11 != null) {
                        nVar11.f4156d.setHintText(p220oa.h.B("Please enter 11 digits BVN number", getContext(), null, null, 16, null, null, 1014));
                    }
                } else {
                    n nVar12 = (n) this.f27335j;
                    if (nVar12 != null) {
                        p220oa.h.s(nVar12.f4160i, true);
                    }
                    n nVar13 = (n) this.f27335j;
                    if (nVar13 != null) {
                        nVar13.f4160i.setText("Forgot NIN?");
                    }
                    n nVar14 = (n) this.f27335j;
                    if (nVar14 != null) {
                        nVar14.f4162o.setText("NIN Number");
                    }
                    n nVar15 = (n) this.f27335j;
                    if (nVar15 != null) {
                        nVar15.f4156d.setHintText(p220oa.h.B("Please enter 11 digits NIN number", getContext(), null, null, 16, null, null, 1014));
                    }
                }
            }
            x();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        PpButton ppButton;
        PpFormVertical ppFormVertical;
        PpButton ppButton2;
        PpFormVertical ppFormVertical2;
        String editContent;
        PpFormVertical ppFormVertical3;
        n nVar;
        boolean z3;
        n nVar2;
        PpButton ppButton3;
        c cVar;
        n nVar3;
        PpFormVertical ppFormVertical4;
        PpButton ppButton4;
        IdentityVerificationItem identityVerificationItemZ = z(Integer.valueOf(this.t));
        if (identityVerificationItemZ != null) {
            int i7 = identityVerificationItemZ.verifyType;
            if (i7 == 3 || i7 == 4) {
                n nVar4 = (n) this.f27335j;
                if (!TextUtils.isEmpty((nVar4 == null || (ppFormVertical3 = nVar4.f4156d) == null) ? null : ppFormVertical3.getEditContent())) {
                    n nVar5 = (n) this.f27335j;
                    if (((nVar5 == null || (ppFormVertical2 = nVar5.f4156d) == null || (editContent = ppFormVertical2.getEditContent()) == null) ? 0 : editContent.length()) >= 11) {
                        nVar = (n) this.f27335j;
                        if (nVar != null || (ppButton4 = nVar.f4159g) == null || ppButton4.isEnabled()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            cVar = this.f26176v;
                            if (cVar != null) {
                                cVar.d();
                            }
                            nVar3 = (n) this.f27335j;
                            if (nVar3 != null && (ppFormVertical4 = nVar3.f4156d) != null) {
                                Intrinsics.checkNotNullParameter(ppFormVertical4, "<this>");
                                try {
                                    Object systemService = ppFormVertical4.getContext().getSystemService("input_method");
                                    Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                    ((InputMethodManager) systemService).hideSoftInputFromWindow(ppFormVertical4.getWindowToken(), 0);
                                } catch (RuntimeException unused) {
                                }
                            }
                        }
                        nVar2 = (n) this.f27335j;
                        if (nVar2 != null && (ppButton3 = nVar2.f4159g) != null) {
                            ppButton3.setEnabled(true);
                        }
                    }
                }
                n nVar6 = (n) this.f27335j;
                if (nVar6 != null && (ppButton2 = nVar6.f4159g) != null) {
                    ppButton2.setEnabled(false);
                }
            } else {
                nVar = (n) this.f27335j;
                if (nVar != null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (z3) {
                    cVar = this.f26176v;
                    if (cVar != null) {
                        cVar.d();
                    }
                    nVar3 = (n) this.f27335j;
                    if (nVar3 != null) {
                        Intrinsics.checkNotNullParameter(ppFormVertical4, "<this>");
                        Object systemService2 = ppFormVertical4.getContext().getSystemService("input_method");
                        Intrinsics.f(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((InputMethodManager) systemService2).hideSoftInputFromWindow(ppFormVertical4.getWindowToken(), 0);
                    }
                }
                nVar2 = (n) this.f27335j;
                if (nVar2 != null) {
                    ppButton3.setEnabled(true);
                }
            }
        } else {
            n nVar7 = (n) this.f27335j;
            if (nVar7 != null && (ppButton = nVar7.f4159g) != null) {
                ppButton.setEnabled(false);
            }
        }
        n nVar8 = (n) this.f27335j;
        if (nVar8 == null || (ppFormVertical = nVar8.f4156d) == null) {
            return;
        }
        ppFormVertical.setBottomText(null);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        String.valueOf(charSequence);
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "IDVerification";
    }

    @Override // com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        if (this.f26174o) {
            return false;
        }
        E activity = getActivity();
        if (activity != null) {
            p220oa.h.h(activity, "SignUpVerificationPopup");
        }
        IdentityVerificationActivity identityVerificationActivityA = A();
        SignUpRetainDialogConfig configByPosition = identityVerificationActivityA != null ? UploadAppsFlyerRsp.getConfigByPosition(SignUpRetainDialogConfig.DIALOG_POSITION_ID, identityVerificationActivityA.f25874w) : null;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = androidx.lifecycle.V.f(this);
        f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new V8.n(this, configByPosition, null), 2);
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        Iterable iterableF;
        IdentityVerificationActivity identityVerificationActivityA;
        CheckIdentifyReq checkIdentifyReqN;
        Integer num;
        CheckIdentifyReq checkIdentifyReqN2;
        IdentityVerificationActivity identityVerificationActivityA2;
        CheckIdentifyReq checkIdentifyReqN3;
        Integer num2;
        CheckIdentifyReq checkIdentifyReqN4;
        Integer numValueOf;
        IdentityVerificationItem identityVerificationItem;
        n nVar;
        IdentityVerificationActivity identityVerificationActivityA3 = A();
        if (identityVerificationActivityA3 != null && Intrinsics.c(identityVerificationActivityA3.f25866e, "FROM_REGISITER_PAGE") && (nVar = (n) this.f27335j) != null) {
            nVar.f4155c.setSlotId("9BD3D0A7458341C7A004F3804F4F68F6");
        }
        n nVar2 = (n) this.f27335j;
        if (nVar2 != null) {
            p220oa.h.c(nVar2.f4164v);
        }
        n nVar3 = (n) this.f27335j;
        if (nVar3 != null) {
            p220oa.h.c(nVar3.f4165w);
        }
        IdentityVerificationActivity identityVerificationActivityA4 = A();
        if (identityVerificationActivityA4 == null) {
            iterableF = z.f38935a;
        } else {
            PreCheckPhoneRsp preCheckPhoneRsp = identityVerificationActivityA4.f25869i;
            List<IdentityVerificationItem> list = preCheckPhoneRsp != null ? preCheckPhoneRsp.nameVerifyMethods : null;
            if (list != null) {
                iterableF = C1850q.f(list);
            } else {
                iterableF = z.f38935a;
            }
        }
        Iterator it = iterableF.iterator();
        Integer numValueOf2 = null;
        Integer numValueOf3 = null;
        Integer num3 = null;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            IdentityVerificationActivity identityVerificationActivityA5 = A();
            if (identityVerificationActivityA5 == null) {
                numValueOf = null;
            } else {
                PreCheckPhoneRsp preCheckPhoneRsp2 = identityVerificationActivityA5.f25869i;
                List<IdentityVerificationItem> list2 = preCheckPhoneRsp2 != null ? preCheckPhoneRsp2.nameVerifyMethods : null;
                if (list2 == null || (identityVerificationItem = list2.get(iIntValue)) == null) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(identityVerificationItem.verifyType);
                }
            }
            if (numValueOf != null && 4 == numValueOf.intValue()) {
                numValueOf2 = Integer.valueOf(iIntValue);
            }
            if (numValueOf != null && 3 == numValueOf.intValue()) {
                numValueOf3 = Integer.valueOf(iIntValue);
            }
            if (num3 == null) {
                num3 = numValueOf;
            }
            if (numValueOf != null) {
                n nVar4 = (n) this.f27335j;
                if (nVar4 == null || nVar4.f4164v.getVisibility() != 8) {
                    n nVar5 = (n) this.f27335j;
                    if (nVar5 != null && nVar5.f4165w.getVisibility() == 8) {
                        n nVar6 = (n) this.f27335j;
                        B(nVar6 != null ? nVar6.f4165w : null, numValueOf.intValue());
                        n nVar7 = (n) this.f27335j;
                        if (nVar7 != null) {
                            p220oa.h.C(nVar7.f4165w);
                        }
                    }
                } else {
                    n nVar8 = (n) this.f27335j;
                    B(nVar8 != null ? nVar8.f4164v : null, numValueOf.intValue());
                    n nVar9 = (n) this.f27335j;
                    if (nVar9 != null) {
                        p220oa.h.s(nVar9.f4157e, true);
                    }
                    n nVar10 = (n) this.f27335j;
                    if (nVar10 != null) {
                        p220oa.h.C(nVar10.f4164v);
                    }
                }
            }
        }
        if (numValueOf2 != null && (identityVerificationActivityA2 = A()) != null && (checkIdentifyReqN3 = identityVerificationActivityA2.n()) != null && (num2 = checkIdentifyReqN3.verifyType) != null && num2.intValue() == 4) {
            E(4);
            n nVar11 = (n) this.f27335j;
            if (nVar11 != null) {
                PpFormVertical ppFormVertical = nVar11.f4156d;
                IdentityVerificationActivity identityVerificationActivityA6 = A();
                ppFormVertical.setEditContent((identityVerificationActivityA6 == null || (checkIdentifyReqN4 = identityVerificationActivityA6.n()) == null) ? null : checkIdentifyReqN4.verifyNum);
            }
        } else if (numValueOf3 != null && (identityVerificationActivityA = A()) != null && (checkIdentifyReqN = identityVerificationActivityA.n()) != null && (num = checkIdentifyReqN.verifyType) != null && num.intValue() == 3) {
            E(3);
            n nVar12 = (n) this.f27335j;
            if (nVar12 != null) {
                PpFormVertical ppFormVertical2 = nVar12.f4156d;
                IdentityVerificationActivity identityVerificationActivityA7 = A();
                ppFormVertical2.setEditContent((identityVerificationActivityA7 == null || (checkIdentifyReqN2 = identityVerificationActivityA7.n()) == null) ? null : checkIdentifyReqN2.verifyNum);
            }
        } else if (num3 != null) {
            E(num3.intValue());
        }
        n nVar13 = (n) this.f27335j;
        if (nVar13 != null) {
            nVar13.f4164v.setOnClickListener(new l(this, 4));
        }
        n nVar14 = (n) this.f27335j;
        if (nVar14 != null) {
            nVar14.f4165w.setOnClickListener(new l(this, 5));
        }
        n nVar15 = (n) this.f27335j;
        if (nVar15 != null) {
            nVar15.f4160i.setOnClickListener(this);
        }
        n nVar16 = (n) this.f27335j;
        if (nVar16 != null) {
            nVar16.f4154b.setOnClickListener(this);
        }
        IdentityVerificationActivity identityVerificationActivityA8 = A();
        if (identityVerificationActivityA8 != null && identityVerificationActivityA8.q()) {
            n nVar17 = (n) this.f27335j;
            if (nVar17 != null) {
                nVar17.t.setText(CommonViewExtKt.string(h.ac_upgrade_account, getContext()));
            }
            n nVar18 = (n) this.f27335j;
            if (nVar18 != null) {
                nVar18.f4161j.setText("According to CBN latest regulations, please verify your BVN/NIN before using your PalmPay account. PalmPay will protect your information security.");
            }
        }
        n nVar19 = (n) this.f27335j;
        if (nVar19 != null) {
            nVar19.f4156d.f24415j.setVisibility(8);
        }
        n nVar20 = (n) this.f27335j;
        if (nVar20 != null) {
            nVar20.f4156d.setEditTextWatcher(this);
        }
        n nVar21 = (n) this.f27335j;
        if (nVar21 != null) {
            nVar21.f4159g.setOnClickListener(this);
        }
        IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = identityVerificationViewModel != null ? identityVerificationViewModel.f26423g : null;
        if (lVar != null) {
            lVar.e(this, new G(new o(this, this, 0), 20));
        }
        IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = identityVerificationViewModel2 != null ? identityVerificationViewModel2.f26424i : null;
        if (lVar2 == null) {
            return 0;
        }
        lVar2.e(this, new G(new o(this, this, 1), 20));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        Window window;
        Window window2;
        AddUserExtraInfoReq addUserExtraInfoReqL;
        n nVar;
        CheckIdentifyReq checkIdentifyReqN;
        n nVar2;
        int i7 = this.t;
        if (i7 != -1) {
            F(i7);
            IdentityVerificationActivity identityVerificationActivityA = A();
            if (identityVerificationActivityA != null && (checkIdentifyReqN = identityVerificationActivityA.n()) != null && !TextUtils.isEmpty(checkIdentifyReqN.verifyNum) && (nVar2 = (n) this.f27335j) != null) {
                nVar2.f4156d.setEditContent(checkIdentifyReqN.verifyNum);
            }
            IdentityVerificationActivity identityVerificationActivityA2 = A();
            if (identityVerificationActivityA2 != null && (addUserExtraInfoReqL = identityVerificationActivityA2.l()) != null && !TextUtils.isEmpty(addUserExtraInfoReqL.verifyNum) && (nVar = (n) this.f27335j) != null) {
                nVar.f4156d.setEditContent(addUserExtraInfoReqL.verifyNum);
            }
        }
        IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
        if (identityVerificationViewModel != null) {
            identityVerificationViewModel.j(false);
        }
        E activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            window2.setSoftInputMode(19);
        }
        Handler handlerJ = j();
        Intrinsics.checkNotNullExpressionValue(handlerJ, "getUIHandler(...)");
        E activity2 = getActivity();
        View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            decorView.post(new H(handlerJ, 8, this, this));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        IdentityVerificationActivity identityVerificationActivityA = A();
        if (identityVerificationActivityA != null) {
            IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
            int i7 = IdentityVerificationActivity.f25861A;
            identityVerificationActivityA.s(identityVerificationViewModel, new h0(14));
        }
        this.f26175p = NavHostFragment.f17502e.findNavController(this);
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PpButton ppButton;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = d.tvForgotBvn;
        if (numValueOf == null || numValueOf.intValue() != i7) {
            int i10 = d.btnGet;
            if (numValueOf == null || numValueOf.intValue() != i10) {
                int i11 = d.textViewNext;
                if (numValueOf == null || numValueOf.intValue() != i11 || r0.U0()) {
                    return;
                }
                y();
                return;
            }
        }
        n nVar = (n) this.f27335j;
        if (nVar == null || (ppButton = nVar.f4159g) == null || !ppButton.a()) {
            IdentityVerificationItem identityVerificationItemZ = z(Integer.valueOf(this.t));
            if (identityVerificationItemZ == null || identityVerificationItemZ.verifyType != 4) {
                new GetBvnMethodDialog(getContext(), this.f26175p).show();
                return;
            }
            PhoneUtils.dial("*346" + Uri.encode("#"));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        c cVar = this.f26176v;
        if (cVar != null) {
            cVar.e();
        }
        this.f26176v = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        super.onPause();
        IdentityVerificationActivity identityVerificationActivityA = A();
        if (identityVerificationActivityA != null && (checkIdentifyReqN = identityVerificationActivityA.n()) != null) {
            D(checkIdentifyReqN);
        }
        IdentityVerificationActivity identityVerificationActivityA2 = A();
        if (identityVerificationActivityA2 == null || (addUserExtraInfoReqL = identityVerificationActivityA2.l()) == null) {
            return;
        }
        D(addUserExtraInfoReqL);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        TextView textView;
        PpFormVertical ppFormVertical;
        super.onResume();
        IdentityVerificationActivity identityVerificationActivityA = A();
        if (!TextUtils.isEmpty(identityVerificationActivityA != null ? identityVerificationActivityA.f25870j : null)) {
            E(3);
            n nVar = (n) this.f27335j;
            if (nVar != null && (ppFormVertical = nVar.f4156d) != null) {
                IdentityVerificationActivity identityVerificationActivityA2 = A();
                ppFormVertical.setEditContent(identityVerificationActivityA2 != null ? identityVerificationActivityA2.f25870j : null);
            }
            IdentityVerificationActivity identityVerificationActivityA3 = A();
            if (identityVerificationActivityA3 != null) {
                identityVerificationActivityA3.f25870j = null;
            }
            y();
        }
        IdentityVerificationActivity identityVerificationActivityA4 = A();
        if (identityVerificationActivityA4 == null || !identityVerificationActivityA4.q()) {
            IdentityVerificationActivity identityVerificationActivityA5 = A();
            if (identityVerificationActivityA5 != null) {
                identityVerificationActivityA5.setTitle("");
                return;
            }
            return;
        }
        n nVar2 = (n) this.f27335j;
        if (nVar2 == null || (textView = nVar2.t) == null) {
            return;
        }
        textView.setText(CommonViewExtKt.string(h.ac_upgrade_account, getContext()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putInt("mIdentityIndex", this.t);
        super.onSaveInstanceState(outState);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        n nVar;
        PpFormVertical ppFormVertical;
        super.onViewStateRestored(bundle);
        if (this.t < 0) {
            int i7 = bundle != null ? bundle.getInt("mIdentityIndex", -1) : -1;
            this.t = i7;
            if (i7 < 0 || (nVar = (n) this.f27335j) == null || (ppFormVertical = nVar.f4156d) == null) {
                return;
            }
            p220oa.h.s(ppFormVertical, true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, com.transsnet.palmpay.core.base.IBaseView
    public final void showLoadingDialog(boolean z3) {
        PpFormVertical ppFormVertical;
        AppCompatEditText editText;
        PpButton ppButton;
        n nVar = (n) this.f27335j;
        if (nVar != null && (ppButton = nVar.f4159g) != null) {
            ppButton.b(z3);
        }
        n nVar2 = (n) this.f27335j;
        if (nVar2 == null || (ppFormVertical = nVar2.f4156d) == null || (editText = ppFormVertical.getEditText()) == null) {
            return;
        }
        editText.setEnabled(!z3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(F8.e.ac_fragment_identity_verification_step1, viewGroup, false);
        int i7 = d.btnGet;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = d.cornerAd;
            SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
            if (singleAdView != null) {
                i7 = d.inputIdNo;
                PpFormVertical ppFormVertical = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                if (ppFormVertical != null) {
                    i7 = d.ivThumb;
                    IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                    if (iconicsImageView != null && (viewM = p059e1.a.m((i7 = d.securityKeyBoard), viewInflate)) != null) {
                        i7 = d.textViewNext;
                        PpButton ppButton2 = (PpButton) p059e1.a.m(i7, viewInflate);
                        if (ppButton2 != null) {
                            i7 = d.topBarrier;
                            if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = d.tvForgotBvn;
                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = d.tvMessage;
                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        i7 = d.tvName;
                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView3 != null) {
                                            i7 = d.tvSubTitle;
                                            TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView4 != null) {
                                                i7 = d.tvTitle;
                                                TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView5 != null) {
                                                    i7 = d.tvType1;
                                                    TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView6 != null) {
                                                        i7 = d.tvType2;
                                                        TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                        if (textView7 != null) {
                                                            n nVar = new n((FrameLayout) viewInflate, ppButton, singleAdView, ppFormVertical, iconicsImageView, viewM, ppButton2, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                            Intrinsics.checkNotNullExpressionValue(nVar, "inflate(...)");
                                                            return nVar;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (java.util.regex.Pattern.matches(r2, r0) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep1Fragment.x():void");
    }

    public final void y() {
        PpButton ppButton;
        PpButton ppButton2;
        PreCheckPhoneRsp preCheckPhoneRsp;
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        E activity = getActivity();
        if (activity != null) {
            p220oa.h.g(activity, "SignUpVerificationButton");
        }
        IdentityVerificationItem identityVerificationItemZ = z(Integer.valueOf(this.t));
        if (identityVerificationItemZ != null) {
            IdentityVerificationActivity identityVerificationActivityA = A();
            if (identityVerificationActivityA != null && (checkIdentifyReqN = identityVerificationActivityA.n()) != null) {
                C(checkIdentifyReqN, identityVerificationItemZ);
            }
            IdentityVerificationActivity identityVerificationActivityA2 = A();
            if (identityVerificationActivityA2 != null && (addUserExtraInfoReqL = identityVerificationActivityA2.l()) != null) {
                C(addUserExtraInfoReqL, identityVerificationItemZ);
            }
            IdentityVerificationActivity identityVerificationActivityA3 = A();
            if (identityVerificationActivityA3 == null || !identityVerificationActivityA3.q()) {
                n nVar = (n) this.f27335j;
                if (nVar != null && (ppButton = nVar.f4159g) != null) {
                    ppButton.b(true);
                }
                IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
                if (identityVerificationViewModel != null) {
                    IdentityVerificationActivity identityVerificationActivityA4 = A();
                    identityVerificationViewModel.f(identityVerificationActivityA4 != null ? identityVerificationActivityA4.n() : null);
                    return;
                }
                return;
            }
            IdentityVerificationActivity identityVerificationActivityA5 = A();
            if (identityVerificationActivityA5 != null && (preCheckPhoneRsp = identityVerificationActivityA5.f25869i) != null && preCheckPhoneRsp.needFaceAfterVerifyNumber) {
                AbstractC0130w abstractC0130w = this.f26175p;
                if (abstractC0130w != null) {
                    abstractC0130w.h(d.fragment_identity_verification_step_face_2, null, null);
                    return;
                }
                return;
            }
            n nVar2 = (n) this.f27335j;
            if (nVar2 != null && (ppButton2 = nVar2.f4159g) != null) {
                ppButton2.b(true);
            }
            IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel2 != null) {
                IdentityVerificationActivity identityVerificationActivityA6 = A();
                identityVerificationViewModel2.d(identityVerificationActivityA6 != null ? identityVerificationActivityA6.l() : null);
            }
        }
    }

    public final IdentityVerificationItem z(Integer num) {
        IdentityVerificationActivity identityVerificationActivityA = A();
        if (identityVerificationActivityA != null) {
            PreCheckPhoneRsp preCheckPhoneRsp = identityVerificationActivityA.f25869i;
            List<IdentityVerificationItem> list = preCheckPhoneRsp != null ? preCheckPhoneRsp.nameVerifyMethods : null;
            if (list != null) {
                if (list.isEmpty() || num.intValue() >= list.size() || num.intValue() < 0) {
                    list = null;
                }
                if (list != null) {
                    return list.get(num.intValue());
                }
            }
        }
        return null;
    }
}
