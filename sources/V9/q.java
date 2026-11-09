package V9;

import C0.AbstractC0130w;
import C0.U;
import N8.C0463g;
import Pa.n0;
import Wf.AbstractC0780y;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.camera2.internal.C0942n;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.github.chrisbanes.photoview.OnPhotoTapListener;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInConfirmPinFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithFaceFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithSmsFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithTouchIdFragment;
import com.transsnet.palmpay.account.ui.fragment.security.SecurityModeSettingsFragment;
import com.transsnet.palmpay.contacts.ui.activity.AllContactsActivity;
import com.transsnet.palmpay.contacts.ui.activity.ContactProfileActivity;
import com.transsnet.palmpay.contacts.ui.activity.EditCloseContactsActivity;
import com.transsnet.palmpay.contacts.ui.activity.FindInviteFriendsActivity;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayContactsListActivity;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayLinkFavesFriendsActivity;
import com.transsnet.palmpay.contacts.ui.fragment.CloseContactsFragment;
import com.transsnet.palmpay.core.bean.CloseContactBean;
import com.transsnet.palmpay.core.bean.CloseContactBeanV2;
import com.transsnet.palmpay.core.bean.CloseContactTag;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.viewmodel.OnClaimRewardListener;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import com.transsnet.palmpay.core.web.WebJsCallback;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.custom_view.bean.OrderDetailItemBean;
import com.transsnet.palmpay.custom_view.interfac.OnOrderDetailItemClickListener;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.AboutDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayBalancePaymentDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayDepositDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.photograph.PhotoViewerActivity;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.bean.QueryRecommendReq;
import com.transsnet.palmpay.teller.bean.WAECOperatorBean;
import com.transsnet.palmpay.teller.ui.activity.BeneficiariesActivity;
import com.transsnet.palmpay.teller.ui.activity.BillPaymentOrderDetailActivity;
import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import com.transsnet.palmpay.teller.ui.activity.JambHomeActivity;
import com.transsnet.palmpay.teller.ui.activity.WaecHomeActivity;
import com.transsnet.palmpay.teller.ui.dialog.BillerCouponListDialog;
import com.transsnet.palmpay.teller.ui.dialog.InputPaymentItemAmountDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerNewDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickMobileNetWorkDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentHomeNGFragment;
import com.transsnet.palmpay.teller.viewmodel.BeneficiariesListViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p051d9.C1623u;
import p086fe.C1666g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements BaseRecyclerViewAdapter$ItemViewOnClickListener, Consumer, Argument2Callback, PinEntryView.OnPinEnteredListener, P2PButton.OnP2PButtonClickListener, OnOrderDetailItemClickListener, OnClaimRewardListener, PpAmountEditText.OnTextInputListener, OnItemChildClickListener, OnItemClickListener, TabLayoutMediator.TabConfigurationStrategy, OnPhotoTapListener, CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10216b;

    public /* synthetic */ q(Object obj, int i7) {
        this.f10215a = i7;
        this.f10216b = obj;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        String string;
        String str = "";
        Object obj2 = this.f10216b;
        switch (this.f10215a) {
            case 0:
                ((EditCloseContactsActivity) obj2).f27200b.setEditText(((CloseContactTag) obj).tag);
                break;
            case 1:
                int i7 = FindInviteFriendsActivity.f27212i;
                ((FindInviteFriendsActivity) obj2).m();
                break;
            case 3:
                PalmPayContact palmPayContact = (PalmPayContact) obj;
                PalmPayContactsListActivity palmPayContactsListActivity = (PalmPayContactsListActivity) obj2;
                if (palmPayContact == null) {
                    int i10 = PalmPayContactsListActivity.f27233e;
                    palmPayContactsListActivity.getClass();
                } else if ("askCard".equals(palmPayContactsListActivity.f27237d)) {
                    ARouter.getInstance().build("/june/conversation_page").withString("remote_member_id", palmPayContact.getContactsMemberId()).withString("contact_name", palmPayContact.getFullName()).withString("SEND_OR_ASK", "ask").navigation();
                } else if (!"sendCard".equals(palmPayContactsListActivity.f27237d)) {
                    ContactProfileActivity.n(palmPayContactsListActivity, palmPayContact);
                } else {
                    ARouter.getInstance().build("/june/conversation_page").withString("remote_member_id", palmPayContact.getContactsMemberId()).withString("contact_name", palmPayContact.getFullName()).withString("SEND_OR_ASK", "send").navigation();
                }
                break;
            case 4:
                PalmPayContact palmPayContact2 = (PalmPayContact) obj;
                int i11 = PalmPayLinkFavesFriendsActivity.f27245e;
                if (palmPayContact2 != null) {
                    ContactProfileActivity.n((PalmPayLinkFavesFriendsActivity) obj2, palmPayContact2);
                    break;
                }
                break;
            case 13:
                CloseContactBean closeContactBean = (CloseContactBean) obj;
                int i12 = BeneficiariesActivity.f34148v;
                BeneficiariesActivity beneficiariesActivity = (BeneficiariesActivity) obj2;
                if (view.getId() == Pd.c.mbri_more_iv) {
                    Yd.c cVar = new Yd.c(beneficiariesActivity, new p1.d(18, beneficiariesActivity, closeContactBean));
                    Intrinsics.checkNotNullParameter(view, "view");
                    cVar.getContentView().measure(View.MeasureSpec.makeMeasureSpec(view.getRootView().getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                    cVar.setWidth(cVar.getContentView().getMeasuredWidth());
                    cVar.showAsDropDown(view, Nf.b.b(34.0f * view.getResources().getDisplayMetrics().density) - (view.getWidth() / 2), -Nf.b.b(10.0f * view.getResources().getDisplayMetrics().density), 5);
                } else if (closeContactBean != null) {
                    beneficiariesActivity.f34156o = closeContactBean.customerId;
                    beneficiariesActivity.f34157p = closeContactBean.businessAmount;
                    QueryRecommendReq req = new QueryRecommendReq();
                    String str2 = closeContactBean.businessType;
                    if (str2 != null && (string = str2.toString()) != null) {
                        str = string;
                    }
                    req.businessType = str;
                    req.institutionName = closeContactBean.billerName;
                    req.itemName = closeContactBean.paymentItemName;
                    req.paymentItemId = closeContactBean.itemId;
                    req.billerId = closeContactBean.billerId;
                    req.categoryId = beneficiariesActivity.f34152f;
                    req.icon = closeContactBean.icon;
                    req.businessAmount = closeContactBean.businessAmount;
                    BeneficiariesListViewModel beneficiariesListViewModel = (BeneficiariesListViewModel) beneficiariesActivity.l();
                    beneficiariesListViewModel.getClass();
                    Intrinsics.checkNotNullParameter(req, "req");
                    AbstractC0780y.m(V.h(beneficiariesListViewModel), null, null, new C1666g(beneficiariesListViewModel, req, null), 3);
                }
                break;
            case 19:
                CloseContactBeanV2 closeContactBeanV2 = (CloseContactBeanV2) obj;
                CloseContactsFragment closeContactsFragment = (CloseContactsFragment) obj2;
                closeContactsFragment.getClass();
                int id2 = view.getId();
                if (id2 == R9.d.ccci_edit_iv) {
                    ARouter.getInstance().build("/contact/edit_close_contact").withInt("KEY_EDIT_MODEL", 1).withParcelable("KEY_CONTACT_BEAN", closeContactBeanV2).navigation();
                    break;
                } else if (id2 == R9.d.ccci_root) {
                    if (closeContactsFragment.getActivity() instanceof AllContactsActivity ? ((AllContactsActivity) closeContactsFragment.getActivity()).f27153i : false) {
                        Intent intent = new Intent();
                        String strReplaceAll = closeContactBeanV2.phone.replaceAll(" ", "");
                        intent.putExtra("PHONE_NUMBER", strReplaceAll);
                        intent.putExtra("contact_name", "");
                        intent.putExtra("contact_tag", closeContactBeanV2.tag);
                        intent.putExtra("result", strReplaceAll);
                        closeContactsFragment.f27319c.setResult(-1, intent);
                        closeContactsFragment.f27319c.finish();
                        break;
                    }
                }
                break;
            case 22:
                PickBillerDialog.initViews$lambda$2((PickBillerDialog) obj2, view, (BillerListItemBean) obj, viewHolder);
                break;
            case 24:
                PickMobileNetWorkDialog.initViews$lambda$1((PickMobileNetWorkDialog) obj2, view, (WAECOperatorBean) obj, viewHolder);
                break;
            default:
                PickPaymentItemDialog.initViews$lambda$7((PickPaymentItemDialog) obj2, view, (PaymentItemBean) obj, viewHolder);
                break;
        }
    }

    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        Object obj = this.f10216b;
        switch (this.f10215a) {
            case 16:
                int i7 = JambHomeActivity.f34222B;
                ((JambHomeActivity) obj).u();
                break;
            case 17:
                int i10 = WaecHomeActivity.f34237Q;
                ((WaecHomeActivity) obj).x();
                break;
            case 21:
                InputPaymentItemAmountDialog.initViews$lambda$5((InputPaymentItemAmountDialog) obj, str);
                break;
            default:
                int i11 = BillPaymentHomeNGFragment.f34279r0;
                ((BillPaymentHomeNGFragment) obj).H();
                break;
        }
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i7 = FindInviteFriendsActivity.f27212i;
        ((C0463g) this.f10216b).invoke(obj);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k kVar) {
        C0942n c0942n = (C0942n) this.f10216b;
        c0942n.f13601c = kVar;
        return "RequestCompleteListener[" + c0942n + "]";
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        LogInActivity logInActivityU;
        LogInActivity logInActivityU2;
        PreCheckPhoneRsp preCheckPhoneRsp;
        LogInReq logInReq;
        LogInActivity logInActivityV;
        LogInActivity logInActivityV2;
        PreCheckPhoneRsp preCheckPhoneRsp2;
        switch (this.f10215a) {
            case 5:
                WebJsCallback webJsCallback = (WebJsCallback) this.f10216b;
                int iIntValue = ((Integer) obj).intValue();
                Intent intent = (Intent) obj2;
                int i7 = WebJsCallback.t;
                if (iIntValue == -1 && intent != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("name", intent.getStringExtra("contact_name"));
                        jSONObject.put("number", intent.getStringExtra("PHONE_NUMBER"));
                        HashMap map = new HashMap();
                        map.put("cbId", webJsCallback.f28613d);
                        map.put("fnName", "getContactInfo");
                        map.put("result", jSONObject);
                        webJsCallback.a(map);
                        break;
                    } catch (Exception unused) {
                    }
                    webJsCallback.f28613d = null;
                    break;
                }
                break;
            case 6:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int i10 = LogInConfirmPinFragment.f26190v;
                boolean zIsEmpty = TextUtils.isEmpty((String) obj);
                LogInConfirmPinFragment logInConfirmPinFragment = (LogInConfirmPinFragment) this.f10216b;
                if ((!zIsEmpty || (zBooleanValue && (logInActivityU2 = logInConfirmPinFragment.u()) != null && (preCheckPhoneRsp = logInActivityU2.t) != null && !preCheckPhoneRsp.needNameVerify)) && (logInActivityU = logInConfirmPinFragment.u()) != null) {
                    logInActivityU.v();
                }
                break;
            case 7:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                int i11 = LogInWithFaceFragment.f26205B;
                boolean zIsEmpty2 = TextUtils.isEmpty((String) obj);
                LogInWithFaceFragment logInWithFaceFragment = (LogInWithFaceFragment) this.f10216b;
                if (!zIsEmpty2 && zBooleanValue2) {
                    boolean z3 = logInWithFaceFragment.f26208j;
                    U u6 = new U(false, false, F8.d.fragment_login_with_face, false, false, -1, -1, -1, -1);
                    if (!z3) {
                        LogInActivity logInActivityT = logInWithFaceFragment.t();
                        if (!TextUtils.isEmpty((logInActivityT == null || (logInReq = logInActivityT.f25888b) == null) ? null : logInReq.pin)) {
                            LogInActivity logInActivityT2 = logInWithFaceFragment.t();
                            if (logInActivityT2 != null) {
                                logInActivityT2.v();
                            }
                        } else {
                            AbstractC0130w abstractC0130w = logInWithFaceFragment.f26212w;
                            if (abstractC0130w != null) {
                                abstractC0130w.h(F8.d.fragment_login_set_pin, null, u6);
                            }
                        }
                    } else {
                        LogInActivity logInActivityT3 = logInWithFaceFragment.t();
                        AbstractC0130w abstractC0130w2 = logInWithFaceFragment.f26212w;
                        LogInActivity logInActivityT4 = logInWithFaceFragment.t();
                        L8.a.a(logInActivityT3, abstractC0130w2, u6, logInActivityT4 != null ? logInActivityT4.f25879B : null, null);
                    }
                } else {
                    AbstractC0130w abstractC0130w3 = logInWithFaceFragment.f26212w;
                    if (abstractC0130w3 != null) {
                        abstractC0130w3.j();
                    }
                }
                break;
            case 8:
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                Intent intent2 = (Intent) obj2;
                int i12 = SecurityModeSettingsFragment.f26245p;
                SecurityModeSettingsFragment securityModeSettingsFragment = (SecurityModeSettingsFragment) this.f10216b;
                if (iIntValue2 != -1) {
                    D3.a.N("enable", "fail", "user_cancelled");
                    securityModeSettingsFragment.v();
                } else {
                    if (intent2 != null) {
                        try {
                            io.fastkv.n.I(intent2.getStringExtra("_cipher_vector"), intent2.getStringExtra("_encrypt_text"));
                        } catch (Exception unused2) {
                            Z4.c cVar = n0.f7107i;
                            D3.a.N("enable", "fail", "sdk_error");
                            securityModeSettingsFragment.v();
                            return;
                        }
                    }
                    io.fastkv.n.G();
                    io.fastkv.n.M(true);
                    D3.a.N("enable", "success", null);
                    androidx.fragment.app.E activity = securityModeSettingsFragment.getActivity();
                    if (activity != null) {
                        String string = securityModeSettingsFragment.getString(F8.h.ac_enabled_successfully);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        p220oa.h.z(activity, string, null, null, 61);
                    }
                    securityModeSettingsFragment.v();
                }
                break;
            case 9:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                int i13 = LogInWithTouchIdFragment.f26230C;
                boolean zIsEmpty3 = TextUtils.isEmpty((String) obj);
                LogInWithTouchIdFragment logInWithTouchIdFragment = (LogInWithTouchIdFragment) this.f10216b;
                if ((!zIsEmpty3 || (zBooleanValue3 && (logInActivityV2 = logInWithTouchIdFragment.v()) != null && (preCheckPhoneRsp2 = logInActivityV2.t) != null && !preCheckPhoneRsp2.needNameVerify)) && (logInActivityV = logInWithTouchIdFragment.v()) != null) {
                    logInActivityV.v();
                }
                break;
        }
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton.OnP2PButtonClickListener
    public void onClick() {
        switch (this.f10215a) {
            case 10:
                ((AboutDialog) this.f10216b).lambda$initViews$1();
                break;
            case 11:
                ((PayBalancePaymentDialog) this.f10216b).lambda$initViews$1();
                break;
            default:
                ((PayDepositDialog) this.f10216b).lambda$initViews$1();
                break;
        }
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i7) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.setText(((Z6.i) this.f10216b).f11563w[i7]);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j jVar, View view, int i7) {
        BillerCouponListDialog.initViews$lambda$2((BillerCouponListDialog) this.f10216b, jVar, view, i7);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        PickBillerNewDialog.initViews$lambda$2((PickBillerNewDialog) this.f10216b, jVar, view, i7);
    }

    @Override // com.github.chrisbanes.photoview.OnPhotoTapListener
    public void onPhotoTap(ImageView imageView, float f10, float f11) {
        PhotoViewerActivity photoViewerActivity = (PhotoViewerActivity) this.f10216b;
        if (photoViewerActivity.f33083b.getVisibility() == 0) {
            photoViewerActivity.f33083b.setVisibility(8);
        } else {
            photoViewerActivity.f33083b.setVisibility(0);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String code) {
        OneTimeCodeV5View oneTimeCodeV5View;
        int i7 = LogInWithSmsFragment.f26222C;
        Intrinsics.checkNotNullParameter(code, "code");
        if (TextUtils.isEmpty(code) || code.length() < 4) {
            return;
        }
        LogInWithSmsFragment logInWithSmsFragment = (LogInWithSmsFragment) this.f10216b;
        C1623u c1623u = (C1623u) logInWithSmsFragment.f27328i;
        if (c1623u != null) {
            String strV = logInWithSmsFragment.v();
            Bc.i iVar = logInWithSmsFragment.f26223A;
            c1623u.checkSmsCode(strV, (iVar == null || (oneTimeCodeV5View = (OneTimeCodeV5View) iVar.f725c) == null) ? null : oneTimeCodeV5View.getSecurityEmail(), code, 2);
        }
    }

    @Override // com.transsnet.palmpay.core.viewmodel.OnClaimRewardListener
    public void onShowLoading(boolean z3) {
        int i7 = BillerTransactionResultActivity.f34181Y;
        ((BillerTransactionResultActivity) this.f10216b).showLoadingDialog(z3);
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnOrderDetailItemClickListener
    public void onClick(OrderDetailItemBean it) {
        BillPaymentOrderDetailActivity.a aVar = BillPaymentOrderDetailActivity.f34162i;
        Intrinsics.checkNotNullParameter(it, "it");
        Integer style = it.getStyle();
        if (style != null && style.intValue() == 1004) {
            ActivityUtils.startActivity(Pa.F.a((BillPaymentOrderDetailActivity) this.f10216b, it.getAndroidUrl()));
        }
    }
}
