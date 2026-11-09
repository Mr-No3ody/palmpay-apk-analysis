package com.transsnet.palmpay.ui.fragment;

import Ac.e;
import Ac.f;
import Ac.h;
import Ae.j;
import C0.G;
import Ea.a;
import F6.d;
import Fe.T;
import L6.b;
import N8.q0;
import Pa.C0525w;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Qb.c;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.MsgContentBean;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.ui.adapter.MessageListAdapter$ItemOnClickListener;
import com.transsnet.palmpay.ui.mvp.contract.PaymentMessageListContract;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p025ba.k;
import p328ve.p;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/MessageListFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "LFe/T;", "Lcom/transsnet/palmpay/ui/mvp/contract/PaymentMessageListContract$View;", "Lcom/transsnet/palmpay/ui/adapter/MessageListAdapter$ItemOnClickListener;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageListFragment extends BaseMVPFragment<T> implements PaymentMessageListContract.View, MessageListAdapter$ItemOnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f35224A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f35225B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f35226C;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f35227j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f35228o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f35229p;
    public final String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f35230v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35231w;

    public MessageListFragment() {
        this((Object) null);
    }

    @Override // com.transsnet.palmpay.ui.adapter.MessageListAdapter$ItemOnClickListener
    public final void OnItemClick(View view, GetMsgRsp.DataBean.ListBean data, int i7) {
        String strJ;
        String strJ2;
        String str = this.f27317a;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            String strJ3 = TextUtils.isEmpty(data.contentBean.outsideInsideNotificationInfo) ? data.contentBean.noticeMsg : C0525w.j(data.contentBean.outsideInsideNotificationInfo, "insideContent");
            n0 n0VarG = n0.g();
            ClickEvent clickEventAdd = new ClickEvent("Message_Center_Click").add(LogConstants.Autotrack.ELEMENT_PUSH_MSG_TYPE, data.contentBean.messageType).add(LogConstants.Autotrack.ELEMENT_CONTENT, strJ3);
            MsgContentBean msgContentBean = data.contentBean;
            n0VarG.k(clickEventAdd.add(LogConstants.Autotrack.ELEMENT_PUSH_BATCH_NO, msgContentBean != null ? msgContentBean.bulkNo : null).add(LogConstants.Autotrack.ELEMENT_EXTRA_ID, String.valueOf(data.f27367id)));
            if (!TextUtils.isEmpty(data.androidVersion)) {
                String androidVersion = data.androidVersion;
                Intrinsics.checkNotNullExpressionValue(androidVersion, "androidVersion");
                if (Integer.parseInt(androidVersion) > this.f35225B) {
                    i0.b0("/#/activity/betting/update");
                    return;
                }
            }
        } catch (Exception e10) {
            d.c(str, "OnItemViewOnClick: ", e10);
        }
        if (i7 != 1 && i7 != 2) {
            boolean zC = Intrinsics.c(data.msgScene, "1616");
            String str2 = this.f35230v;
            if (!zC && !Intrinsics.c(data.msgScene, "1617")) {
                String strJ4 = C0525w.j(data.content, str2);
                Intrinsics.checkNotNullExpressionValue(strJ4, "getJsonString(...)");
                v(strJ4);
                return;
            }
            String msgScene = data.msgScene;
            Intrinsics.checkNotNullExpressionValue(msgScene, "msgScene");
            if (TextUtils.isEmpty(C0525w.j(data.content, str2))) {
                return;
            }
            String strJ5 = C0525w.j(data.content, this.t);
            Long lI = C0525w.i(strJ5, "expireTime");
            if (lI == null || lI.longValue() < System.currentTimeMillis()) {
                ToastUtils.showLong(h.main_activity_is_over);
                return;
            }
            if ("1617".equals(msgScene)) {
                strJ = C0525w.j(strJ5, "sendMemberId");
                Intrinsics.checkNotNullExpressionValue(strJ, "getJsonString(...)");
                strJ2 = C0525w.j(strJ5, "sendMemberNickName");
                Intrinsics.checkNotNullExpressionValue(strJ2, "getJsonString(...)");
            } else {
                strJ = C0525w.j(strJ5, "askerMemberId");
                Intrinsics.checkNotNullExpressionValue(strJ, "getJsonString(...)");
                strJ2 = C0525w.j(strJ5, "askerMemberNickName");
                Intrinsics.checkNotNullExpressionValue(strJ2, "getJsonString(...)");
            }
            if (TextUtils.isEmpty(strJ)) {
                return;
            }
            G.z("/june/conversation_page", "remote_member_id", strJ, "contact_name", strJ2);
            return;
        }
        Object tag = view.getTag(e.main_tag_trans_type);
        Object tag2 = view.getTag(e.main_tag_order_number);
        String str3 = tag != null ? (String) tag : null;
        String str4 = tag2 != null ? (String) tag2 : null;
        if (TextUtils.isEmpty(str3)) {
            str3 = data.getContent().transType;
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = data.getContent().orderId;
        }
        d.h(str, 3, G.p("handleOldPaymentMessage: ", str3, " order ", str4));
        if ((TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? false : a.e(str3, str4, "")) {
            return;
        }
        Object tag3 = view.getTag(e.main_tag_message_type);
        String str5 = tag3 != null ? (String) tag3 : null;
        if (PushMessage.MESSAGE_TYPE_REQUEST_CONTACT.equalsIgnoreCase(str5)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/contact/new_contacts_list");
            return;
        }
        if (PushMessage.MESSAGE_TYPE_ACCEPT_CONTACT.equalsIgnoreCase(str5)) {
            Object tag4 = view.getTag(e.main_tag_extra_data);
            if (tag4 instanceof PalmPayContact) {
                ARouter.getInstance().build("/contact/profile").withSerializable("contact", (Serializable) tag4).navigation();
                return;
            }
            return;
        }
        if ("1050".equalsIgnoreCase(str5)) {
            q0.u("/send/money");
            return;
        }
        if ("1516".equalsIgnoreCase(str5)) {
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            q0.v("/main/points_billdetail", "LOYALTY_ORDER_ID", str4);
        } else {
            String strJ6 = C0525w.j(data.content, "linkUrl");
            Intrinsics.checkNotNullExpressionValue(strJ6, "getJsonString(...)");
            v(strJ6);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_fragment_message_list;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        this.f35231w = 1;
        T t = (T) this.f27328i;
        if (t != null) {
            int i7 = this.f35227j;
            t.loadMessageList(i7 == Integer.MAX_VALUE ? null : Integer.valueOf(i7), this.f35231w, true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        this.f35225B = BaseApplication.get().getVersionCode();
        this.f35228o = this.f27318b.findViewById(e.emptyView);
        p pVar = new p(getContext());
        pVar.f43198e = new HashMap();
        int i7 = k.core_mobile_number;
        Context context = pVar.f4984a;
        String string = context.getString(i7);
        String string2 = context.getString(k.core_receiver);
        String string3 = context.getString(k.core_sender);
        String string4 = context.getString(k.core_payer);
        String string5 = context.getString(k.core_platform);
        pVar.f43198e.put("1000", string);
        pVar.f43198e.put(PushMessage.MESSAGE_TYPE_CASH_IN, "Payment method");
        pVar.f43198e.put("1002", string2);
        pVar.f43198e.put("1003", string2);
        pVar.f43198e.put(PushMessage.MESSAGE_TYPE_RECEIVE_MONEY, string3);
        pVar.f43198e.put(PushMessage.MESSAGE_TYPE_CASH_OUT, string2);
        pVar.f43198e.put(PushMessage.MESSAGE_TYPE_QRCODE_COLLECT, string3);
        pVar.f43198e.put("1008", string2);
        pVar.f43198e.put("1009", string2);
        pVar.f43198e.put("1010", string2);
        pVar.f43198e.put("1011", string2);
        pVar.f43198e.put("1013", string3);
        pVar.f43198e.put("1015", string4);
        pVar.f43198e.put("1016", string4);
        pVar.f43198e.put("1017", "Requester");
        pVar.f43198e.put("1018", string4);
        pVar.f43198e.put("1019", string4);
        pVar.f43198e.put("1021", string3);
        pVar.f43198e.put("1022", string3);
        pVar.f43198e.put("1023", string3);
        pVar.f43198e.put("1024", string2);
        pVar.f43198e.put("1025", string2);
        pVar.f43198e.put("1026", "Requester");
        pVar.f43198e.put("1027", "Requester");
        pVar.f43198e.put("1029", string4);
        pVar.f43198e.put("1030", string2);
        pVar.f43198e.put("1031", string2);
        pVar.f43198e.put("1032", "Invitee");
        pVar.f43198e.put("1033", string4);
        pVar.f43198e.put("1034", "Invitee");
        pVar.f43198e.put("1035", "Reward terms");
        pVar.f43198e.put("1036", string);
        pVar.f43198e.put("1037", string);
        pVar.f43198e.put("1038", string2);
        pVar.f43198e.put("1039", "Payment method");
        pVar.f43198e.put("1040", string2);
        pVar.f43198e.put("1041", string2);
        pVar.f43198e.put("1042", string2);
        pVar.f43198e.put("1043", string2);
        pVar.f43198e.put("1044", string2);
        pVar.f43198e.put("1045", string2);
        pVar.f43198e.put("1046", string);
        pVar.f43198e.put("1047", string2);
        pVar.f43198e.put("1048", string3);
        pVar.f43198e.put("1049", string);
        pVar.f43198e.put("1050", string3);
        pVar.f43198e.put("1051", string5);
        pVar.f43198e.put("1052", string5);
        pVar.f43198e.put("1053", string3);
        pVar.f43198e.put("1054", string5);
        pVar.f43198e.put("1056", string5);
        pVar.f43198e.put("1057", string5);
        pVar.f43198e.put("1060", "Transfer person");
        pVar.f43198e.put("1061", "Applicant");
        pVar.f43198e.put("1062", "Applicant");
        pVar.f43198e.put("1063", "Payment method");
        pVar.f43198e.put("1064", "Payment method");
        pVar.f43198e.put("1065", "Withdrawal account");
        pVar.f43198e.put("1066", "Withdrawal account");
        pVar.f43198e.put(PushMessage.MESSAGE_TYPE_PALMPAY_RECEIVE_MONEY_BYQRCODE, string3);
        pVar.f43198e.put("1072", string2);
        pVar.f43198e.put("1073", string2);
        pVar.f43198e.put("1100", "Applicant");
        pVar.f43198e.put("1101", "Applicant");
        pVar.f43198e.put("1102", "Applicant");
        pVar.f43198e.put("1103", "Applicant");
        pVar.f43198e.put("1104", "Applicant");
        pVar.f43198e.put("1105", "Applicant");
        pVar.f43198e.put("1106", "Applicant");
        pVar.f43198e.put("1107", "Applicant");
        pVar.f43198e.put("1108", "Applicant");
        pVar.f43198e.put("1109", string4);
        pVar.f43198e.put("1110", string4);
        pVar.f43198e.put("1111", string4);
        pVar.f43198e.put("1112", string4);
        pVar.f43198e.put("1113", string4);
        pVar.f43198e.put("1114", "Biller");
        pVar.f43198e.put("1115", "Biller");
        pVar.f43198e.put("1116", "Biller");
        pVar.f43198e.put("1117", "Biller");
        pVar.f43198e.put("1118", "Biller");
        pVar.f43198e.put("1119", "Biller");
        pVar.f43198e.put("1120", "Biller");
        pVar.f43198e.put("1121", "Biller");
        pVar.f43198e.put("1122", "Biller");
        pVar.f43198e.put("1123", "Biller");
        pVar.f43198e.put("1124", "Biller");
        pVar.f43198e.put("1125", "Biller");
        pVar.f43198e.put("1126", "Biller");
        pVar.f43198e.put("1127", "Biller");
        pVar.f43198e.put("1128", "Biller");
        pVar.f43198e.put("1129", "Applicant");
        pVar.f43198e.put("1130", "Applicant");
        pVar.f43198e.put("1133", "Biller");
        pVar.f43198e.put("1134", "Biller");
        pVar.f43198e.put("1135", "Biller");
        pVar.f43198e.put("1137", "Biller");
        pVar.f43198e.put("1138", "Biller");
        pVar.f43198e.put("1139", string5);
        pVar.f43198e.put("1140", "Applicant");
        pVar.f43198e.put("1141", "Applicant");
        pVar.f43198e.put("1200", "Reward terms");
        pVar.f43198e.put("1201", "Inviter");
        pVar.f43198e.put("1202", "Invitee");
        pVar.f43198e.put("1203", "Inviter");
        pVar.f43198e.put("1204", "Invitee");
        pVar.f43198e.put("1205", string5);
        pVar.f43198e.put("1206", string5);
        pVar.f43198e.put("1207", string5);
        pVar.f43198e.put("1208", string5);
        pVar.f43198e.put("1209", string5);
        pVar.f43198e.put("1210", string5);
        pVar.f43198e.put("1211", string5);
        pVar.f43198e.put("1212", string5);
        pVar.f43198e.put("1213", string5);
        pVar.f43198e.put("1214", string5);
        pVar.f43198e.put("1215", string5);
        pVar.f43198e.put("1216", string5);
        pVar.f43198e.put("1217", "Applicant");
        pVar.f43198e.put("1218", "Applicant");
        pVar.f43198e.put("1219", string5);
        pVar.f43198e.put("1222", string5);
        pVar.f43198e.put("1246", "Payment method");
        pVar.f43198e.put("1301", "Applicant");
        pVar.f43198e.put("1302", "Applicant");
        pVar.f43198e.put("1303", "Applicant");
        pVar.f43198e.put("1304", "Applicant");
        pVar.f43198e.put("1305", "Applicant");
        pVar.f43198e.put("1306", "Applicant");
        pVar.f43198e.put("1314", "PalmPay user");
        pVar.f43198e.put("1315", string2);
        pVar.f43198e.put("1340", string5);
        pVar.f43198e.put("1341", string5);
        pVar.f43198e.put("1400", "Customer");
        pVar.f43198e.put("1401", "Customer");
        pVar.f43198e.put("1402", "Supporter");
        pVar.f43198e.put("1403", "Supporter");
        pVar.f43198e.put("1404", "Customer");
        pVar.f43198e.put("1405", "Customer");
        pVar.f43198e.put("1406", "Supporter");
        pVar.f43198e.put("1407", "Supporter");
        pVar.f43198e.put("1408", "Customer");
        pVar.f43198e.put("1409", "Customer");
        pVar.f43198e.put("1410", "Customer");
        pVar.f43198e.put("1411", "Customer");
        pVar.f43198e.put("1412", "Supporter");
        pVar.f43198e.put("1413", "Supporter");
        pVar.f43198e.put("1414", "Customer");
        pVar.f43198e.put("1415", "Customer");
        pVar.f43198e.put("1416", "Supporter");
        pVar.f43198e.put("1417", "Supporter");
        pVar.f43198e.put("1418", "Applicant");
        pVar.f43198e.put("1419", "Applicant");
        pVar.f43198e.put("1421", "Supporter");
        pVar.f43198e.put("1422", "Supporter");
        pVar.f43198e.put("1430", string2);
        pVar.f43198e.put("1437", string2);
        pVar.f43198e.put("1500", "Merchant");
        pVar.f43198e.put("1501", "Merchant");
        pVar.f43198e.put("1502", "Merchant");
        pVar.f43198e.put("1503", "Merchant");
        pVar.f43198e.put("1504", "Merchant");
        pVar.f43198e.put("1506", "Merchant");
        pVar.f43198e.put("1507", "Merchant");
        pVar.f43198e.put("1508", "Merchant");
        pVar.f43198e.put("1509", "Merchant");
        pVar.f43198e.put("1510", "Merchant");
        pVar.f43198e.put("1512", "Quantity");
        pVar.f43198e.put("1513", "Quantity");
        pVar.f43198e.put("1514", string5);
        pVar.f43198e.put("1515", string3);
        pVar.f43198e.put("1516", string5);
        pVar.f43198e.put("1520", "Merchant");
        pVar.f43198e.put("1521", "Merchant");
        pVar.f43198e.put("1526", "Merchant");
        pVar.f43198e.put("1528", "Merchant");
        pVar.f43198e.put("1602", string3);
        pVar.f43198e.put("1603", "Reward terms");
        pVar.f43198e.put("1605", string5);
        pVar.f43198e.put(PushMessage.MESSAGE_TYPE_REQUEST_CONTACT, "PalmPay user");
        pVar.f43198e.put(PushMessage.MESSAGE_TYPE_ACCEPT_CONTACT, "PalmPay user");
        pVar.f43198e.put("3067", string2);
        pVar.f43198e.put("3128", string2);
        pVar.f43198e.put("3129", string2);
        pVar.f43198e.put("3150", "Biller");
        pVar.f43198e.put("3151", "Biller");
        pVar.f43198e.put("3152", "Biller");
        pVar.f43198e.put("3153", "Biller");
        pVar.f43198e.put("3154", "Biller");
        pVar.f43198e.put("3155", "Biller");
        pVar.f43198e.put("3192", "Offer");
        pVar.f43198e.put("3193", "Offer");
        this.f35229p = pVar;
        pVar.f43199f = this;
        View view = this.f35228o;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(e.textViewMessage);
            ImageView imageView = (ImageView) view.findViewById(e.imageViewIcon);
            textView.setText(h.main_no_nofitications);
            textView.setTextColor(getResources().getColor(b.ppColorTextPrimary));
            imageView.setImageResource(r.cv_empty_no_transaction_history);
        }
        SwipeRecyclerView swipeRecyclerViewU = u();
        if (swipeRecyclerViewU != null && (recyclerView3 = swipeRecyclerViewU.getRecyclerView()) != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        SwipeRecyclerView swipeRecyclerViewU2 = u();
        if (swipeRecyclerViewU2 != null && (recyclerView2 = swipeRecyclerViewU2.getRecyclerView()) != null) {
            recyclerView2.setItemViewCacheSize(4);
        }
        c cVar = new c(12, 0, 16, 16);
        cVar.f7664c = SizeUtils.dp2px(0);
        SwipeRecyclerView swipeRecyclerViewU3 = u();
        if (swipeRecyclerViewU3 != null && (recyclerView = swipeRecyclerViewU3.getRecyclerView()) != null) {
            recyclerView.addItemDecoration(cVar);
        }
        SwipeRecyclerView swipeRecyclerViewU4 = u();
        if (swipeRecyclerViewU4 != null) {
            swipeRecyclerViewU4.setAdapter(this.f35229p);
        }
        SwipeRecyclerView swipeRecyclerViewU5 = u();
        if (swipeRecyclerViewU5 != null) {
            swipeRecyclerViewU5.setRefreshEnable(true);
        }
        SwipeRecyclerView swipeRecyclerViewU6 = u();
        if (swipeRecyclerViewU6 != null) {
            swipeRecyclerViewU6.setEmptyView(this.f35228o);
        }
        SwipeRecyclerView swipeRecyclerViewU7 = u();
        if (swipeRecyclerViewU7 != null) {
            swipeRecyclerViewU7.setOnLoadListener(new Ce.i0(this));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PaymentMessageListContract.View
    public final void setTotalPage(int i7) {
        this.f35224A = i7;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PaymentMessageListContract.View
    public final void showMessageList(List list) {
        GetMsgRsp.DataBean.ListBean listBean;
        if (this.f35231w == 1 && list != null && (!list.isEmpty()) && (listBean = (GetMsgRsp.DataBean.ListBean) list.get(0)) != null) {
            p367ya.a aVarD = p367ya.a.d();
            long j6 = listBean.f27367id;
            aVarD.getClass();
            SPUtils.getInstance().put("LastReadMessageId_" + this.f35227j, j6);
            G.u(MessageEvent.EVENT_UPDATE_UNREAD_MESSAGE_COUNT, org.greenrobot.eventbus.c.b());
        }
        p pVar = this.f35229p;
        if (pVar != null) {
            pVar.f4985b = list;
        }
        if (pVar != null) {
            pVar.notifyDataSetChanged();
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PaymentMessageListContract.View
    public final void stopLoadMore() {
        SwipeRecyclerView swipeRecyclerViewU = u();
        if (swipeRecyclerViewU != null) {
            swipeRecyclerViewU.setRefreshing(false);
        }
        SwipeRecyclerView swipeRecyclerViewU2 = u();
        if (swipeRecyclerViewU2 != null) {
            swipeRecyclerViewU2.c();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        T t = new T();
        t.f2750d = new ArrayList();
        t.f2751e = new HashSet();
        String[] strArr = T.f2749f;
        for (int i7 = 0; i7 < 128; i7++) {
            t.f2751e.add(strArr[i7]);
        }
        return t;
    }

    public final SwipeRecyclerView u() {
        return (SwipeRecyclerView) this.f35226C.getValue();
    }

    public final void v(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ("com.transsnet.palmpay.action.coupons".equals(str) || StringsKt.A(str, "coupon_list_page", false)) {
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
            return;
        }
        Intent intentA = F.a(requireContext(), str);
        if (intentA != null) {
            ActivityUtils.startActivity(intentA);
        }
    }

    public MessageListFragment(int i7) {
        this.f35227j = i7;
        this.t = "businessInfo";
        this.f35230v = "linkUrl";
        this.f35226C = C2131j.b(new j(this, 6));
    }

    public /* synthetic */ MessageListFragment(Object obj) {
        this(Integer.MAX_VALUE);
    }
}
