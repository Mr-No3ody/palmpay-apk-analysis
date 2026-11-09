package Uc;

import Pa.AbstractC0512i;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.api.Service;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInSelectVerifyMethodFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithRiskControlSmsFragment;
import com.transsnet.palmpay.contacts.ui.activity.AllContactsSearchActivity;
import com.transsnet.palmpay.contacts.ui.activity.FindInviteFriendsActivity;
import com.transsnet.palmpay.contacts.ui.activity.LinkFaveNoticeListActivity;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayContactsListActivity;
import com.transsnet.palmpay.contacts.ui.dialog.AddLinkFaveNotPPUserDialog;
import com.transsnet.palmpay.contacts.ui.fragment.MobileContactsListFragment;
import com.transsnet.palmpay.contacts.ui.fragment.PalmPayContactsListFragment;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.custom_view.dialog.TipsDialog;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem1;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelPaymentPromotionItem;
import com.transsnet.palmpay.p2pcash.ui.atm.TransactionDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.AboutDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayByNoticeDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.ReservationTimeDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.StatusDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.view.DateItemView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PInputAmountView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PNearByAgentView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.ReasonItemView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.TimeItemView;
import com.transsnet.palmpay.teller.ui.activity.AgentOrderDetailActivity;
import com.transsnet.palmpay.teller.ui.activity.BillPaymentOrderDetailActivity;
import com.transsnet.palmpay.teller.ui.activity.BillerRelayPageActivity;
import com.transsnet.palmpay.teller.ui.dialog.BillerCouponListDialog;
import com.transsnet.palmpay.teller.ui.dialog.BillerRenewalItemDialog;
import com.transsnet.palmpay.teller.viewmodel.AgentOrderDetailViewModel;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p086fe.C1654a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class I0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9561b;

    public /* synthetic */ I0(Object obj, int i7) {
        this.f9560a = i7;
        this.f9561b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText;
        Editable text;
        int i7 = 0;
        Object obj = this.f9561b;
        switch (this.f9560a) {
            case 0:
                ((TransactionDetailPage) obj).onBackPressed();
                break;
            case 1:
                int i10 = FindInviteFriendsActivity.f27212i;
                int id2 = view.getId();
                FindInviteFriendsActivity findInviteFriendsActivity = (FindInviteFriendsActivity) obj;
                if (id2 != R9.d.ivDelete) {
                    if (id2 == R9.d.viewInvite) {
                        Pa.n0.g().m("invite_page_element_click", "Share to intive", "");
                        findInviteFriendsActivity.m();
                    }
                    break;
                } else {
                    Bc.k kVar = findInviteFriendsActivity.f27217g;
                    if (kVar != null && (editText = (EditText) kVar.f751e) != null && (text = editText.getText()) != null) {
                        text.clear();
                        break;
                    }
                }
                break;
            case 2:
                int i11 = LinkFaveNoticeListActivity.f27218f;
                if (view.getId() == R9.d.ivBack) {
                    ((LinkFaveNoticeListActivity) obj).finish();
                }
                break;
            case 3:
                int i12 = PalmPayContactsListActivity.f27233e;
                ((PalmPayContactsListActivity) obj).goBackToHome();
                break;
            case 4:
                ClipboardUtils.copyText(((ModelBillDetailTextItem) obj).f31444d.getText().toString());
                ToastUtils.showShort(com.transsnet.palmpay.custom_view.v.cv_copy_successful);
                break;
            case 5:
                ModelBillDetailTextItem1 modelBillDetailTextItem1 = (ModelBillDetailTextItem1) obj;
                ModelBillDetailTextItem1.OnTipsClickCallback onTipsClickCallback = modelBillDetailTextItem1.f31464w;
                if (onTipsClickCallback != null) {
                    onTipsClickCallback.onTipsClick();
                    break;
                } else if (!TextUtils.isEmpty(modelBillDetailTextItem1.t)) {
                    Context context = modelBillDetailTextItem1.f31417a;
                    int i13 = modelBillDetailTextItem1.f31463v;
                    String string = modelBillDetailTextItem1.t.toString();
                    TipsDialog tipsDialog = new TipsDialog(context, com.transsnet.palmpay.custom_view.t.cv_tips_dialog);
                    tipsDialog.setMessage(string);
                    tipsDialog.setButtonText(null);
                    tipsDialog.setMessageGravity(i13);
                    tipsDialog.show();
                    break;
                }
                break;
            case 6:
                int i14 = ModelBillDetailTitle.f31465v;
                Context context2 = ((ModelBillDetailTitle) obj).f31417a;
                if (context2 instanceof Activity) {
                    ((Activity) context2).finish();
                }
                break;
            case 7:
                KProperty[] kPropertyArr = ModelPaymentPromotionItem.f31544o;
                ((ModelPaymentPromotionItem.OnPromotionItemListener) obj).onPromotionItemClick();
                break;
            case 8:
                androidx.fragment.app.E activity = ((LogInSelectVerifyMethodFragment) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
            case 9:
                int i15 = LogInWithRiskControlSmsFragment.t;
                LogInActivity logInActivityV = ((LogInWithRiskControlSmsFragment) obj).v();
                if (logInActivityV != null) {
                    logInActivityV.onBackPressed();
                }
                break;
            case 10:
                W9.v vVar = (W9.v) obj;
                int adapterPosition = vVar.getAdapterPosition();
                W9.B b7 = vVar.f10651d;
                BaseRecyclerViewAdapter$ItemViewOnClickListener baseRecyclerViewAdapter$ItemViewOnClickListener = b7.f4986c;
                if (baseRecyclerViewAdapter$ItemViewOnClickListener != null && b7.f4985b != null) {
                    baseRecyclerViewAdapter$ItemViewOnClickListener.OnItemViewOnClick(view, b7.getItem(adapterPosition), vVar);
                    break;
                }
                break;
            case 11:
                W9.y yVar = (W9.y) obj;
                int adapterPosition2 = yVar.getAdapterPosition();
                W9.A a3 = yVar.f10656e;
                BaseRecyclerViewAdapter$ItemViewOnClickListener baseRecyclerViewAdapter$ItemViewOnClickListener2 = a3.f4986c;
                if (baseRecyclerViewAdapter$ItemViewOnClickListener2 != null && a3.f4985b != null) {
                    baseRecyclerViewAdapter$ItemViewOnClickListener2.OnItemViewOnClick(view, a3.getItem(adapterPosition2), yVar);
                    break;
                }
                break;
            case 12:
                ((AboutDialog) obj).lambda$initViews$0(view);
                break;
            case 13:
                ((PayByNoticeDialog) obj).lambda$initViews$0(view);
                break;
            case 14:
                ((ReservationTimeDialog) obj).dismiss();
                break;
            case 15:
                ((StatusDialog) obj).lambda$initViews$0(view);
                break;
            case 16:
                AgentOrderDetailActivity agentOrderDetailActivity = (AgentOrderDetailActivity) obj;
                String orderNo = agentOrderDetailActivity.f34140d;
                if (orderNo != null) {
                    AgentOrderDetailViewModel agentOrderDetailViewModel = (AgentOrderDetailViewModel) agentOrderDetailActivity.l();
                    agentOrderDetailViewModel.getClass();
                    Intrinsics.checkNotNullParameter(orderNo, "orderNo");
                    p140j8.f.v(agentOrderDetailViewModel, new C1654a(orderNo, null), agentOrderDetailViewModel.f34383e, 0L);
                }
                break;
            case 17:
                BillPaymentOrderDetailActivity.a aVar = BillPaymentOrderDetailActivity.f34162i;
                ((BillPaymentOrderDetailActivity) obj).n();
                break;
            case 18:
                int i16 = BillerRelayPageActivity.f34167j;
                if (!Pa.r0.U0()) {
                    BillerRelayPageActivity billerRelayPageActivity = (BillerRelayPageActivity) obj;
                    Wf.t0 t0Var = billerRelayPageActivity.f34168d;
                    if (t0Var != null) {
                        t0Var.cancel((CancellationException) null);
                    }
                    billerRelayPageActivity.finish();
                    break;
                }
                break;
            case 19:
                AddLinkFaveNotPPUserDialog.initViews$lambda$0((AddLinkFaveNotPPUserDialog) obj, view);
                break;
            case 20:
                int i17 = DateItemView.f32973i;
                DateItemView dateItemView = (DateItemView) obj;
                ViewGroup viewGroup = (ViewGroup) dateItemView.getParent();
                int childCount = viewGroup.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = viewGroup.getChildAt(i18);
                    if (childAt instanceof DateItemView) {
                        DateItemView dateItemView2 = (DateItemView) childAt;
                        if (dateItemView2 == dateItemView) {
                            dateItemView2.f32975b.setCardBackgroundColor(dateItemView2.f32974a.getColor(Sc.a.p2p_theme_color));
                            dateItemView2.f32976c.setTextColor(-1);
                            dateItemView2.f32977d.setTextColor(-1);
                            DateItemView.Listener listener = dateItemView.f32979f;
                            if (listener != null) {
                                listener.onSelect(dateItemView2.f32978e);
                            }
                        } else if (dateItemView2.f32980g) {
                            dateItemView2.a();
                        } else {
                            dateItemView2.setEnable(false);
                        }
                    }
                }
                break;
            case 21:
                P2PButton p2PButton = (P2PButton) obj;
                if (p2PButton.f32998g == 1 && !p2PButton.f32999i) {
                    p2PButton.f32999i = true;
                    p2PButton.postDelayed(new Xc.e(p2PButton, 1), 500L);
                    P2PButton.OnP2PButtonClickListener onP2PButtonClickListener = p2PButton.f33000j;
                    if (onP2PButtonClickListener != null) {
                        onP2PButtonClickListener.onClick();
                    }
                    break;
                }
                break;
            case 22:
                ((P2PInputAmountView) obj).f33007c.setText("");
                break;
            case 23:
                int i19 = P2PNearByAgentView.f33022g;
                P2PNearByAgentView p2PNearByAgentView = (P2PNearByAgentView) obj;
                ViewGroup viewGroup2 = (ViewGroup) p2PNearByAgentView.getParent();
                while (i7 < viewGroup2.getChildCount()) {
                    View childAt2 = viewGroup2.getChildAt(i7);
                    if (childAt2 instanceof P2PNearByAgentView) {
                        P2PNearByAgentView p2PNearByAgentView2 = (P2PNearByAgentView) childAt2;
                        if (p2PNearByAgentView2 == p2PNearByAgentView) {
                            p2PNearByAgentView2.f33024b.setImageResource(Sc.d.p2p_select_img);
                            P2PNearByAgentView.Listener listener2 = p2PNearByAgentView.f33027e;
                            if (listener2 != null) {
                                listener2.onSelect(p2PNearByAgentView2.f33028f);
                            }
                        } else {
                            p2PNearByAgentView2.f33024b.setImageResource(Sc.d.p2p_unselect_img);
                        }
                    }
                    i7++;
                }
                break;
            case 24:
                int i20 = ReasonItemView.f33044e;
                ReasonItemView reasonItemView = (ReasonItemView) obj;
                ViewGroup viewGroup3 = (ViewGroup) reasonItemView.getParent();
                int childCount2 = viewGroup3.getChildCount();
                while (i7 < childCount2) {
                    View childAt3 = viewGroup3.getChildAt(i7);
                    if (childAt3 instanceof ReasonItemView) {
                        ReasonItemView reasonItemView2 = (ReasonItemView) childAt3;
                        if (reasonItemView2 == reasonItemView) {
                            reasonItemView.f33046b.setImageResource(Sc.d.p2p_select_img);
                            ReasonItemView.Listener listener3 = reasonItemView.f33048d;
                            if (listener3 != null) {
                                listener3.onSelect(reasonItemView.f33047c);
                            }
                        } else {
                            reasonItemView2.f33046b.setImageResource(Sc.d.p2p_unselect_img);
                        }
                    }
                    i7++;
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                TimeItemView timeItemView = (TimeItemView) obj;
                if (timeItemView.f33069g) {
                    ViewGroup viewGroup4 = (ViewGroup) timeItemView.getParent();
                    int childCount3 = viewGroup4.getChildCount();
                    for (int i21 = 0; i21 < childCount3; i21++) {
                        View childAt4 = viewGroup4.getChildAt(i21);
                        if (childAt4 instanceof TimeItemView) {
                            TimeItemView timeItemView2 = (TimeItemView) childAt4;
                            if (timeItemView2 == timeItemView) {
                                timeItemView2.f33065c.setImageResource(Sc.d.p2p_select_img);
                                TimeItemView.Listener listener4 = timeItemView.f33066d;
                                if (listener4 != null) {
                                    listener4.onSelect(timeItemView2.f33067e, timeItemView2.f33068f);
                                }
                            } else if (timeItemView2.f33069g) {
                                timeItemView2.f33065c.setImageResource(Sc.d.p2p_unselect_img);
                            } else {
                                timeItemView2.setEnable(false);
                            }
                        }
                    }
                    break;
                }
                break;
            case 26:
                MobileContactsListFragment mobileContactsListFragment = (MobileContactsListFragment) obj;
                AbstractC0512i.a(mobileContactsListFragment.f27277v);
                androidx.fragment.app.E e10 = mobileContactsListFragment.f27319c;
                View view2 = mobileContactsListFragment.f27274j;
                int i22 = AllContactsSearchActivity.f27155g;
                e10.startActivityForResult(new Intent(e10, (Class<?>) AllContactsSearchActivity.class), 100, ActivityOptions.makeSceneTransitionAnimation(e10, view2, "searchTransition").toBundle());
                break;
            case 27:
                PalmPayContactsListFragment palmPayContactsListFragment = (PalmPayContactsListFragment) obj;
                AbstractC0512i.a(palmPayContactsListFragment.t);
                androidx.fragment.app.E e11 = palmPayContactsListFragment.f27319c;
                View view3 = palmPayContactsListFragment.f27281o;
                int i23 = AllContactsSearchActivity.f27155g;
                e11.startActivityForResult(new Intent(e11, (Class<?>) AllContactsSearchActivity.class), 100, ActivityOptions.makeSceneTransitionAnimation(e11, view3, "searchTransition").toBundle());
                break;
            case 28:
                ((BillerCouponListDialog) obj).dismiss();
                break;
            default:
                ((BillerRenewalItemDialog) obj).dismiss();
                break;
        }
    }
}
