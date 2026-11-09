package p328ve;

import Ac.e;
import Ac.h;
import C0.G;
import F6.d;
import Kb.c;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.api.Service;
import com.google.common.base.Ascii;
import com.google.protobuf.DescriptorProtos;
import com.luck.picture.lib.config.PictureConfig;
import com.transsnet.palmpay.bean.BulkBundleMsg;
import com.transsnet.palmpay.bean.ChargeBackMsg;
import com.transsnet.palmpay.bean.CommonPaymentMsg;
import com.transsnet.palmpay.bean.CompensateMsg;
import com.transsnet.palmpay.bean.InterBankMsg;
import com.transsnet.palmpay.bean.MerchantMsg;
import com.transsnet.palmpay.bean.RefundMsg;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.message.BindBankCardMsg;
import com.transsnet.palmpay.core.bean.message.BusinessInfoBean;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.core.bean.message.MessageTypeBase;
import com.transsnet.palmpay.core.bean.message.MessageTypePayment;
import com.transsnet.palmpay.core.bean.message.MoneyOrderBean;
import com.transsnet.palmpay.core.bean.message.MsgContentBean;
import com.transsnet.palmpay.core.bean.message.PointMessageBean;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.core.config.BillBusinessType;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.ui.fragment.MessageListFragment;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.StringUtils;
import com.transsnet.palmpay.util.constant.RegexConstants;
import java.util.HashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p025ba.k;
import we.a;
import we.b;
import we.f;
import we.g;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends c implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f43198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MessageListFragment f43199f;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        GetMsgRsp.DataBean.ListBean listBean = (GetMsgRsp.DataBean.ListBean) this.f4985b.get(i7);
        if (String.valueOf(0).equals(listBean.getNotificationType())) {
            MsgContentBean content = listBean.getContent();
            return (content == null || TextUtils.isEmpty(content.outsideInsideNotificationInfo)) ? 1 : 2;
        }
        if (String.valueOf(1).equals(listBean.getNotificationType())) {
            return 0;
        }
        if (String.valueOf(2).equals(listBean.getNotificationType())) {
            return 4;
        }
        return String.valueOf(3).equals(listBean.getNotificationType()) ? 3 : 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        String strReplace;
        byte b7;
        byte b10;
        PalmPayContact palmPayContact;
        GetMsgRsp.DataBean.ListBean bean = (GetMsgRsp.DataBean.ListBean) this.f4985b.get(i7);
        viewHolder.itemView.setTag(e.main_tag_object, bean);
        String strOptString = null;
        CommonPaymentMsg commonPaymentMsg = null;
        RefundMsg refundMsg = null;
        BulkBundleMsg bulkBundleMsg = null;
        ChargeBackMsg chargeBackMsg = null;
        InterBankMsg interBankMsg = null;
        if (!(viewHolder instanceof f)) {
            if (!(viewHolder instanceof g)) {
                if (viewHolder instanceof a) {
                    ((a) viewHolder).a(bean);
                    return;
                } else if (viewHolder instanceof we.c) {
                    ((we.c) viewHolder).a(bean);
                    return;
                } else {
                    if (viewHolder instanceof b) {
                        ((b) viewHolder).a(bean);
                    }
                    return;
                }
            }
            g gVar = (g) viewHolder;
            Intrinsics.checkNotNullParameter(bean, "bean");
            MsgContentBean content = bean.getContent();
            MessageTypeBase msgObj = content != null ? content.getMsgObj() : null;
            if (msgObj instanceof MessageTypePayment) {
                MessageTypePayment messageTypePayment = (MessageTypePayment) msgObj;
                r0.h1(gVar.f43472a, messageTypePayment.insideIcon, r.cv_palmpay_logo_5);
                gVar.f43473b.setText(messageTypePayment.insideTitle);
                gVar.f43476e.setText(messageTypePayment.insideLowerLeftTitle);
                gVar.f43477f.setText(messageTypePayment.insideLowerLeftValue);
                gVar.f43474c.setText(messageTypePayment.insideStatus);
                int i10 = messageTypePayment.insideAmountType;
                TextView textView = gVar.f43475d;
                if (i10 == 0) {
                    textView.setText(new SpanUtils().append(BaseApplication.getCurrencySymbol() + " ").setFontSize(SizeUtils.sp2px(14.0f)).append(r0.A(messageTypePayment.insideAmount)).setFontSize(SizeUtils.sp2px(32.0f)).create());
                } else if (i10 != 1) {
                    textView.setText(String.valueOf(messageTypePayment.insideAmount));
                } else {
                    textView.setText(G.i("P ").setFontSize(SizeUtils.sp2px(14.0f)).append(String.valueOf(messageTypePayment.insideAmount)).setFontSize(SizeUtils.sp2px(32.0f)).create());
                }
                try {
                    if (RegexUtils.isMatch(RegexConstants.REGEX_VALID_COLOR, ((MessageTypePayment) msgObj).insideAmountColor)) {
                        textView.setTextColor(Color.parseColor(((MessageTypePayment) msgObj).insideAmountColor));
                    } else {
                        textView.setTextColor(gVar.f43480j);
                    }
                } catch (Exception unused) {
                }
                boolean zIsEmpty = TextUtils.isEmpty(messageTypePayment.insideLowerRightBtnText);
                TextView textView2 = gVar.f43479i;
                if (zIsEmpty) {
                    textView2.setText(k.core_view);
                } else {
                    textView2.setText(messageTypePayment.insideLowerRightBtnText);
                }
            }
            gVar.f43478g.setText(r0.R(bean.createtime));
            return;
        }
        f fVar = (f) viewHolder;
        String str = bean.msgScene;
        String str2 = bean.content;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        fVar.f43463b.setText(r0.R(bean.createtime));
        Context context = fVar.f43470j;
        int color = context.getResources().getColor(L6.b.ppColorPrimary);
        TextView textView3 = fVar.f43464c;
        textView3.setTextColor(color);
        TextView textView4 = fVar.f43467f;
        textView4.setText("");
        TextView textView5 = fVar.f43462a;
        textView5.setText("");
        textView3.setText("");
        fVar.f43465d.setText(k.core_amount);
        MsgContentBean msgContentBean = bean.contentBean;
        String str3 = f.f43461p;
        if (msgContentBean == null) {
            return;
        }
        try {
            strReplace = msgContentBean.businessInfo.replace("\\", "");
        } catch (Exception e10) {
            d.c(str3, "getBusinessInfoJson: ", e10);
            strReplace = "";
        }
        String str4 = msgContentBean.messageType;
        if (TextUtils.isEmpty(strReplace) || TextUtils.isEmpty(str4)) {
            return;
        }
        d.h(str3, 3, G.o("update: messageType: ", str4));
        d.h(str3, 3, "update: businessJson: " + strReplace);
        d.h(str3, 3, "update: noticeMsg: " + msgContentBean.noticeMsg);
        if (TextUtils.isEmpty(msgContentBean.title)) {
            textView5.setText(msgContentBean.noticeMsg);
        } else {
            textView5.setText(msgContentBean.title);
        }
        int i11 = e.main_tag_message_type;
        View view = fVar.f43469i;
        view.setTag(i11, null);
        view.setTag(e.main_tag_extra_data, null);
        view.setTag(e.main_tag_order_number, null);
        view.setTag(e.main_tag_trans_type, msgContentBean.transType);
        fVar.f43468g.setVisibility(0);
        HashMap map = fVar.f43471o;
        String str5 = map != null ? (String) map.get(str4) : "";
        if (TextUtils.isEmpty(str5)) {
            str5 = "PalmPay";
        }
        fVar.f43466e.setText(str5);
        textView4.setTextColor(context.getResources().getColor(L6.b.ppColorTextPrimary));
        str4.getClass();
        switch (str4.hashCode()) {
            case 1507423:
                b7 = !str4.equals("1000") ? (byte) -1 : (byte) 0;
                break;
            case 1507424:
                b7 = !str4.equals(PushMessage.MESSAGE_TYPE_CASH_IN) ? (byte) -1 : (byte) 1;
                break;
            case 1507425:
                b7 = !str4.equals("1002") ? (byte) -1 : (byte) 2;
                break;
            case 1507426:
                b7 = !str4.equals("1003") ? (byte) -1 : (byte) 3;
                break;
            case 1507428:
                b7 = !str4.equals(PushMessage.MESSAGE_TYPE_CASH_OUT) ? (byte) -1 : (byte) 4;
                break;
            case 1507430:
                b7 = !str4.equals(PushMessage.MESSAGE_TYPE_QRCODE_COLLECT) ? (byte) -1 : (byte) 5;
                break;
            case 1507431:
                b7 = !str4.equals("1008") ? (byte) -1 : (byte) 6;
                break;
            case 1507432:
                b7 = !str4.equals("1009") ? (byte) -1 : (byte) 7;
                break;
            case 1507454:
                b7 = !str4.equals("1010") ? (byte) -1 : (byte) 8;
                break;
            case 1507455:
                b7 = !str4.equals("1011") ? (byte) -1 : (byte) 9;
                break;
            case 1507457:
                b7 = !str4.equals("1013") ? (byte) -1 : (byte) 10;
                break;
            case 1507459:
                b7 = !str4.equals("1015") ? (byte) -1 : Ascii.VT;
                break;
            case 1507460:
                b7 = !str4.equals("1016") ? (byte) -1 : Ascii.FF;
                break;
            case 1507461:
                b7 = !str4.equals("1017") ? (byte) -1 : Ascii.CR;
                break;
            case 1507462:
                b7 = !str4.equals("1018") ? (byte) -1 : Ascii.SO;
                break;
            case 1507463:
                b7 = !str4.equals("1019") ? (byte) -1 : Ascii.SI;
                break;
            case 1507485:
                b7 = !str4.equals("1020") ? (byte) -1 : Ascii.DLE;
                break;
            case 1507486:
                b7 = !str4.equals("1021") ? (byte) -1 : (byte) 17;
                break;
            case 1507487:
                b7 = !str4.equals("1022") ? (byte) -1 : Ascii.DC2;
                break;
            case 1507488:
                b7 = !str4.equals("1023") ? (byte) -1 : (byte) 19;
                break;
            case 1507489:
                b7 = !str4.equals("1024") ? (byte) -1 : Ascii.DC4;
                break;
            case 1507490:
                b7 = !str4.equals("1025") ? (byte) -1 : Ascii.NAK;
                break;
            case 1507491:
                b7 = !str4.equals("1026") ? (byte) -1 : Ascii.SYN;
                break;
            case 1507492:
                b7 = !str4.equals("1027") ? (byte) -1 : Ascii.ETB;
                break;
            case 1507494:
                b7 = !str4.equals("1029") ? (byte) -1 : Ascii.CAN;
                break;
            case 1507516:
                b7 = !str4.equals("1030") ? (byte) -1 : Ascii.EM;
                break;
            case 1507517:
                b7 = !str4.equals("1031") ? (byte) -1 : Ascii.SUB;
                break;
            case 1507518:
                b7 = !str4.equals("1032") ? (byte) -1 : Ascii.ESC;
                break;
            case 1507519:
                b7 = !str4.equals("1033") ? (byte) -1 : Ascii.FS;
                break;
            case 1507520:
                b7 = !str4.equals("1034") ? (byte) -1 : Ascii.GS;
                break;
            case 1507521:
                b7 = !str4.equals("1035") ? (byte) -1 : Ascii.RS;
                break;
            case 1507522:
                b7 = !str4.equals("1036") ? (byte) -1 : Ascii.US;
                break;
            case 1507523:
                b7 = !str4.equals("1037") ? (byte) -1 : (byte) 32;
                break;
            case 1507524:
                b7 = !str4.equals("1038") ? (byte) -1 : (byte) 33;
                break;
            case 1507525:
                b7 = !str4.equals("1039") ? (byte) -1 : (byte) 34;
                break;
            case 1507547:
                b7 = !str4.equals("1040") ? (byte) -1 : (byte) 35;
                break;
            case 1507548:
                b7 = !str4.equals("1041") ? (byte) -1 : (byte) 36;
                break;
            case 1507549:
                b7 = !str4.equals("1042") ? (byte) -1 : (byte) 37;
                break;
            case 1507550:
                b7 = !str4.equals("1043") ? (byte) -1 : (byte) 38;
                break;
            case 1507551:
                b7 = !str4.equals("1044") ? (byte) -1 : (byte) 39;
                break;
            case 1507552:
                b7 = !str4.equals("1045") ? (byte) -1 : (byte) 40;
                break;
            case 1507553:
                b7 = !str4.equals("1046") ? (byte) -1 : (byte) 41;
                break;
            case 1507554:
                b7 = !str4.equals("1047") ? (byte) -1 : (byte) 42;
                break;
            case 1507555:
                b7 = !str4.equals("1048") ? (byte) -1 : (byte) 43;
                break;
            case 1507556:
                b7 = !str4.equals("1049") ? (byte) -1 : (byte) 44;
                break;
            case 1507578:
                b7 = !str4.equals("1050") ? (byte) -1 : (byte) 45;
                break;
            case 1507581:
                b7 = !str4.equals("1053") ? (byte) -1 : (byte) 46;
                break;
            case 1507584:
                b7 = !str4.equals("1056") ? (byte) -1 : (byte) 47;
                break;
            case 1507609:
                b7 = !str4.equals("1060") ? (byte) -1 : (byte) 48;
                break;
            case 1509345:
                b7 = !str4.equals("1200") ? (byte) -1 : (byte) 49;
                break;
            case 1509346:
                b7 = !str4.equals("1201") ? (byte) -1 : (byte) 50;
                break;
            case 1509347:
                b7 = !str4.equals("1202") ? (byte) -1 : (byte) 51;
                break;
            case 1509348:
                b7 = !str4.equals("1203") ? (byte) -1 : (byte) 52;
                break;
            case 1509349:
                b7 = !str4.equals("1204") ? (byte) -1 : (byte) 53;
                break;
            case 1509351:
                b7 = !str4.equals("1206") ? (byte) -1 : (byte) 54;
                break;
            case 1509353:
                b7 = !str4.equals("1208") ? (byte) -1 : (byte) 55;
                break;
            case 1509376:
                b7 = !str4.equals("1210") ? (byte) -1 : (byte) 56;
                break;
            case 1509378:
                b7 = !str4.equals("1212") ? (byte) -1 : (byte) 57;
                break;
            case 1509381:
                b7 = !str4.equals("1215") ? (byte) -1 : (byte) 58;
                break;
            case 1509382:
                b7 = !str4.equals("1216") ? (byte) -1 : (byte) 59;
                break;
            case 1509383:
                b7 = !str4.equals("1217") ? (byte) -1 : (byte) 60;
                break;
            case 1509384:
                b7 = !str4.equals("1218") ? (byte) -1 : (byte) 61;
                break;
            case 1509409:
                b7 = !str4.equals("1222") ? (byte) -1 : (byte) 62;
                break;
            case 75390072:
                b7 = !str4.equals(PushMessage.MESSAGE_TYPE_RECEIVE_MONEY) ? (byte) -1 : (byte) 63;
                break;
            default:
                b7 = -1;
                break;
        }
        switch (b7) {
            case 0:
            case 41:
                fVar.l(strReplace);
                break;
            case 1:
                fVar.m(strReplace);
                break;
            case 2:
                fVar.n(strReplace);
                break;
            case 3:
                fVar.o(strReplace);
                break;
            case 4:
                fVar.p(strReplace);
                break;
            case 5:
                fVar.q(strReplace);
                break;
            case 6:
                fVar.r(strReplace);
                break;
            case 7:
                fVar.s(strReplace);
                break;
            case 8:
                fVar.t(strReplace);
                break;
            case 9:
                fVar.u(strReplace);
                break;
            case 10:
                MoneyOrderBean moneyOrderBeanG = f.g(strReplace);
                if (moneyOrderBeanG != null) {
                    textView3.setText(f.a(moneyOrderBeanG.recipientAmount));
                    if (!TextUtils.isEmpty(moneyOrderBeanG.title)) {
                        textView5.setText(moneyOrderBeanG.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG.orderId);
                    textView4.setText(f.k(moneyOrderBeanG));
                    break;
                }
                break;
            case 11:
                fVar.v(strReplace);
                break;
            case 12:
                MoneyOrderBean moneyOrderBeanG2 = f.g(strReplace);
                if (moneyOrderBeanG2 != null) {
                    textView3.setText(f.a(moneyOrderBeanG2.recipientAmount));
                    if (!TextUtils.isEmpty(moneyOrderBeanG2.title)) {
                        textView5.setText(moneyOrderBeanG2.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG2.orderId);
                    textView4.setText(f.k(moneyOrderBeanG2));
                    break;
                }
                break;
            case 13:
                MoneyOrderBean moneyOrderBeanG3 = f.g(strReplace);
                if (moneyOrderBeanG3 != null) {
                    textView3.setText(f.a(moneyOrderBeanG3.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG3.title)) {
                        textView5.setText(moneyOrderBeanG3.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG3.orderId);
                    textView4.setText(f.j(moneyOrderBeanG3));
                    break;
                }
                break;
            case 14:
                MoneyOrderBean moneyOrderBeanG4 = f.g(strReplace);
                if (moneyOrderBeanG4 != null) {
                    textView3.setText(f.a(moneyOrderBeanG4.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG4.title)) {
                        textView5.setText(moneyOrderBeanG4.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG4.orderId);
                    textView4.setText(f.k(moneyOrderBeanG4));
                    break;
                }
                break;
            case 15:
                MoneyOrderBean moneyOrderBeanG5 = f.g(strReplace);
                if (moneyOrderBeanG5 != null) {
                    textView3.setText(f.a(moneyOrderBeanG5.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG5.title)) {
                        textView5.setText(moneyOrderBeanG5.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG5.orderId);
                    textView4.setText(f.k(moneyOrderBeanG5));
                    break;
                }
                break;
            case 16:
                MoneyOrderBean moneyOrderBeanG6 = f.g(strReplace);
                if (moneyOrderBeanG6 != null) {
                    textView3.setText(fVar.e(moneyOrderBeanG6.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG6.title)) {
                        textView5.setText(moneyOrderBeanG6.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG6.orderId);
                    textView4.setText(f.k(moneyOrderBeanG6));
                    break;
                }
                break;
            case 17:
                MoneyOrderBean moneyOrderBeanG7 = f.g(strReplace);
                if (moneyOrderBeanG7 != null) {
                    textView3.setText(f.a(moneyOrderBeanG7.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG7.title)) {
                        textView5.setText(moneyOrderBeanG7.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG7.orderId);
                    textView4.setText(f.k(moneyOrderBeanG7));
                    break;
                }
                break;
            case 18:
                MoneyOrderBean moneyOrderBeanG8 = f.g(strReplace);
                if (moneyOrderBeanG8 != null) {
                    textView3.setText(f.a(moneyOrderBeanG8.recipientAmount));
                    if (!TextUtils.isEmpty(moneyOrderBeanG8.title)) {
                        textView5.setText(moneyOrderBeanG8.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG8.orderId);
                    textView4.setText(f.k(moneyOrderBeanG8));
                    break;
                }
                break;
            case 19:
                MoneyOrderBean moneyOrderBeanG9 = f.g(strReplace);
                if (moneyOrderBeanG9 != null) {
                    textView3.setText(f.a(moneyOrderBeanG9.recipientAmount));
                    if (!TextUtils.isEmpty(moneyOrderBeanG9.title)) {
                        textView5.setText(moneyOrderBeanG9.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG9.orderId);
                    textView4.setText(f.k(moneyOrderBeanG9));
                    break;
                }
                break;
            case 20:
            case 46:
                MoneyOrderBean moneyOrderBeanG10 = f.g(strReplace);
                if (moneyOrderBeanG10 != null) {
                    textView3.setText(f.a(moneyOrderBeanG10.payAmount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG10.title)) {
                        textView5.setText(moneyOrderBeanG10.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG10.orderId);
                    textView4.setText(f.j(moneyOrderBeanG10));
                    break;
                }
                break;
            case 21:
                MoneyOrderBean moneyOrderBeanG11 = f.g(strReplace);
                if (moneyOrderBeanG11 != null) {
                    textView3.setText(f.a(moneyOrderBeanG11.payAmount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG11.title)) {
                        textView5.setText(moneyOrderBeanG11.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG11.orderId);
                    textView4.setText(f.j(moneyOrderBeanG11));
                    break;
                }
                break;
            case 22:
                MoneyOrderBean moneyOrderBeanG12 = f.g(strReplace);
                if (moneyOrderBeanG12 != null) {
                    textView3.setText(f.a(moneyOrderBeanG12.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG12.title)) {
                        textView5.setText(moneyOrderBeanG12.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG12.orderId);
                    textView4.setText(f.j(moneyOrderBeanG12));
                    break;
                }
                break;
            case 23:
                MoneyOrderBean moneyOrderBeanG13 = f.g(strReplace);
                if (moneyOrderBeanG13 != null) {
                    textView3.setText(f.a(moneyOrderBeanG13.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG13.title)) {
                        textView5.setText(moneyOrderBeanG13.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG13.orderId);
                    textView4.setText(f.j(moneyOrderBeanG13));
                    break;
                }
                break;
            case 24:
                BusinessInfoBean businessInfoBeanC = f.c(strReplace);
                if (businessInfoBeanC != null) {
                    textView3.setText(f.a(businessInfoBeanC.payAmount));
                    if (!TextUtils.isEmpty(businessInfoBeanC.title)) {
                        textView5.setText(businessInfoBeanC.title);
                    }
                    if (TextUtils.isEmpty(businessInfoBeanC.counterpartyName)) {
                        textView4.setText(r0.D0(businessInfoBeanC.phone));
                    } else if (!Pattern.matches("[0-9]*", businessInfoBeanC.counterpartyName)) {
                        textView4.setText(businessInfoBeanC.counterpartyName);
                    } else {
                        textView4.setText(r0.D0(businessInfoBeanC.counterpartyName));
                    }
                    break;
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                MoneyOrderBean moneyOrderBeanG14 = f.g(strReplace);
                if (moneyOrderBeanG14 != null) {
                    textView3.setText(fVar.e(moneyOrderBeanG14.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG14.title)) {
                        textView5.setText(moneyOrderBeanG14.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG14.orderId);
                    textView4.setText(i0.g(StringUtils.null2Length0(moneyOrderBeanG14.recipientBankName), moneyOrderBeanG14.recipientBankAccount));
                    break;
                }
                break;
            case 26:
                BusinessInfoBean businessInfoBeanC2 = f.c(strReplace);
                if (businessInfoBeanC2 != null) {
                    textView3.setText(fVar.e(businessInfoBeanC2.amount));
                    if (!TextUtils.isEmpty(businessInfoBeanC2.title)) {
                        textView5.setText(businessInfoBeanC2.title);
                    }
                    view.setTag(e.main_tag_order_number, businessInfoBeanC2.orderNo);
                    String strH = i0.h(StringUtils.null2Length0(businessInfoBeanC2.bankName), businessInfoBeanC2.collectNo);
                    if (businessInfoBeanC2.payeeAccountType == 6) {
                        strH = i0.g(StringUtils.null2Length0(businessInfoBeanC2.bankName), businessInfoBeanC2.collectNo);
                    }
                    if (TextUtils.isEmpty(strH)) {
                        int i12 = businessInfoBeanC2.payeeAccountType;
                        if (i12 == 6) {
                            strH = context.getResources().getString(h.main_bank_account);
                        } else if (i12 == 8 || i12 == 13) {
                            strH = context.getResources().getString(h.main_mobile_wallet);
                        } else if (i12 == 5 || i12 == 12) {
                            strH = context.getResources().getString(h.main_bank_card);
                        }
                    }
                    textView4.setText(strH);
                    break;
                }
                break;
            case 27:
            case 28:
            case 29:
            case 50:
            case 51:
            case 52:
            case 53:
                PointMessageBean pointMessageBeanI = f.i(strReplace);
                if (pointMessageBeanI != null) {
                    textView3.setText(fVar.h(pointMessageBeanI.amount));
                    if (!TextUtils.isEmpty(pointMessageBeanI.title)) {
                        textView5.setText(pointMessageBeanI.title);
                    }
                    if (!TextUtils.isEmpty(pointMessageBeanI.nickName)) {
                        textView4.setText(pointMessageBeanI.nickName);
                    } else {
                        textView4.setText(r0.Y(pointMessageBeanI.phone));
                    }
                    break;
                }
                break;
            case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                PointMessageBean pointMessageBeanI2 = f.i(strReplace);
                if (pointMessageBeanI2 != null) {
                    textView3.setText(fVar.h(pointMessageBeanI2.amount));
                    if (!TextUtils.isEmpty(pointMessageBeanI2.title)) {
                        textView5.setText(pointMessageBeanI2.title);
                    }
                    textView4.setText("Group reward");
                    break;
                }
                break;
            case 31:
            case 32:
            case 44:
                BusinessInfoBean businessInfoBeanC3 = f.c(strReplace);
                if (businessInfoBeanC3 != null) {
                    textView3.setText(fVar.e(businessInfoBeanC3.payAmount));
                    if (!TextUtils.isEmpty(businessInfoBeanC3.title)) {
                        textView5.setText(businessInfoBeanC3.title);
                    }
                    view.setTag(e.main_tag_order_number, businessInfoBeanC3.orderNo);
                    textView4.setText(r0.D0(businessInfoBeanC3.phone));
                    break;
                }
                break;
            case 33:
                MoneyOrderBean moneyOrderBeanG15 = f.g(strReplace);
                if (moneyOrderBeanG15 != null) {
                    textView3.setText(fVar.e(moneyOrderBeanG15.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG15.title)) {
                        textView5.setText(moneyOrderBeanG15.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG15.orderId);
                    textView4.setText(i0.g(StringUtils.null2Length0(moneyOrderBeanG15.recipientBankName), moneyOrderBeanG15.recipientBankAccount));
                    break;
                }
                break;
            case 34:
                BusinessInfoBean businessInfoBeanC4 = f.c(strReplace);
                if (businessInfoBeanC4 != null) {
                    textView3.setText(fVar.e(businessInfoBeanC4.amount));
                    if (!TextUtils.isEmpty(businessInfoBeanC4.title)) {
                        textView5.setText(businessInfoBeanC4.title);
                    }
                    view.setTag(e.main_tag_order_number, businessInfoBeanC4.orderNo);
                    String strH2 = i0.h(StringUtils.null2Length0(businessInfoBeanC4.bankName), businessInfoBeanC4.payerNo);
                    if (businessInfoBeanC4.payerAccountType == 6) {
                        strH2 = i0.g(StringUtils.null2Length0(businessInfoBeanC4.bankName), businessInfoBeanC4.payerNo);
                    }
                    if (TextUtils.isEmpty(strH2)) {
                        int i13 = businessInfoBeanC4.payerAccountType;
                        if (i13 == 6) {
                            strH2 = context.getResources().getString(h.main_bank_account);
                        } else if (i13 == 8 || i13 == 13) {
                            strH2 = context.getResources().getString(h.main_mobile_wallet);
                        } else if (i13 == 5 || i13 == 12) {
                            strH2 = context.getResources().getString(h.main_bank_card);
                        }
                    }
                    textView4.setText(strH2);
                    break;
                }
                break;
            case 35:
                MoneyOrderBean moneyOrderBeanG16 = f.g(strReplace);
                if (moneyOrderBeanG16 != null) {
                    textView3.setText(fVar.e(moneyOrderBeanG16.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG16.title)) {
                        textView5.setText(moneyOrderBeanG16.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG16.orderId);
                    textView4.setText(f.j(moneyOrderBeanG16));
                    break;
                }
                break;
            case 36:
                BusinessInfoBean businessInfoBeanC5 = f.c(strReplace);
                if (businessInfoBeanC5 != null) {
                    textView3.setText(f.a(businessInfoBeanC5.amount));
                    if (!TextUtils.isEmpty(businessInfoBeanC5.title)) {
                        textView5.setText(businessInfoBeanC5.title);
                    }
                    view.setTag(e.main_tag_order_number, businessInfoBeanC5.orderNo);
                    textView4.setText(context.getResources().getString(h.main_mobile_wallet));
                    break;
                }
                break;
            case 37:
                BusinessInfoBean businessInfoBeanC6 = f.c(strReplace);
                if (businessInfoBeanC6 != null) {
                    textView3.setText(fVar.e(businessInfoBeanC6.amount));
                    if (!TextUtils.isEmpty(businessInfoBeanC6.title)) {
                        textView5.setText(businessInfoBeanC6.title);
                    }
                    view.setTag(e.main_tag_order_number, businessInfoBeanC6.orderNo);
                    textView4.setText(context.getResources().getString(h.main_mobile_wallet));
                    break;
                }
                break;
            case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                MoneyOrderBean moneyOrderBeanG17 = f.g(strReplace);
                if (moneyOrderBeanG17 != null) {
                    textView3.setText(f.a(moneyOrderBeanG17.payAmount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG17.title)) {
                        textView5.setText(moneyOrderBeanG17.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG17.orderId);
                    textView4.setText(context.getResources().getString(h.main_mobile_wallet));
                    break;
                }
                break;
            case 39:
                MoneyOrderBean moneyOrderBeanG18 = f.g(strReplace);
                if (moneyOrderBeanG18 != null) {
                    textView3.setText(fVar.e(moneyOrderBeanG18.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG18.title)) {
                        textView5.setText(moneyOrderBeanG18.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG18.orderId);
                    textView4.setText(context.getResources().getString(h.main_mobile_wallet));
                    break;
                }
                break;
            case 40:
                MoneyOrderBean moneyOrderBeanG19 = f.g(strReplace);
                if (moneyOrderBeanG19 != null) {
                    textView3.setText(fVar.e(moneyOrderBeanG19.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG19.title)) {
                        textView5.setText(moneyOrderBeanG19.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG19.orderId);
                    textView4.setText(context.getResources().getString(h.main_mobile_wallet));
                    break;
                }
                break;
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                MoneyOrderBean moneyOrderBeanG20 = f.g(strReplace);
                if (moneyOrderBeanG20 != null) {
                    textView3.setText(f.a(moneyOrderBeanG20.payAmount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG20.title)) {
                        textView5.setText(moneyOrderBeanG20.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG20.orderId);
                    textView4.setText(moneyOrderBeanG20.recipientNickname);
                    break;
                }
                break;
            case 43:
                MoneyOrderBean moneyOrderBeanG21 = f.g(strReplace);
                if (moneyOrderBeanG21 != null) {
                    textView3.setText(f.a(moneyOrderBeanG21.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG21.title)) {
                        textView5.setText(moneyOrderBeanG21.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG21.orderId);
                    textView4.setText(moneyOrderBeanG21.senderNickname);
                    break;
                }
                break;
            case 45:
                MoneyOrderBean moneyOrderBeanG22 = f.g(strReplace);
                if (moneyOrderBeanG22 != null) {
                    textView3.setText(f.a(moneyOrderBeanG22.amount.longValue()));
                    if (!TextUtils.isEmpty(moneyOrderBeanG22.title)) {
                        textView5.setText(moneyOrderBeanG22.title);
                    }
                    view.setTag(e.main_tag_message_type, "1050");
                    textView4.setText(moneyOrderBeanG22.senderNickname);
                    break;
                }
                break;
            case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                try {
                    C0525w.f().getClass();
                    chargeBackMsg = (ChargeBackMsg) C0525w.d(strReplace, ChargeBackMsg.class);
                } catch (Exception e11) {
                    d.c(str3, "update1056: ", e11);
                }
                if (chargeBackMsg != null) {
                    if (!TextUtils.isEmpty(chargeBackMsg.title)) {
                        textView5.setText(chargeBackMsg.title);
                    }
                    textView3.setText(f.a(chargeBackMsg.amount.longValue()));
                    textView4.setText(AppUtils.getAppName());
                    view.setTag(e.main_tag_order_number, chargeBackMsg.orderNo);
                    break;
                }
                break;
            case 48:
                try {
                    C0525w.f().getClass();
                    interBankMsg = (InterBankMsg) C0525w.d(strReplace, InterBankMsg.class);
                } catch (Exception e12) {
                    d.c(str3, "update1060: ", e12);
                }
                if (interBankMsg != null) {
                    if (!TextUtils.isEmpty(interBankMsg.title)) {
                        textView5.setText(interBankMsg.title);
                    }
                    textView3.setText(f.a(interBankMsg.amount));
                    textView4.setText(interBankMsg.senderName);
                    view.setTag(e.main_tag_order_number, interBankMsg.orderNo);
                    break;
                }
                break;
            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                PointMessageBean pointMessageBeanI3 = f.i(strReplace);
                if (pointMessageBeanI3 != null) {
                    textView3.setText(fVar.h(pointMessageBeanI3.amount));
                    if (!TextUtils.isEmpty(pointMessageBeanI3.title)) {
                        textView5.setText(pointMessageBeanI3.title);
                    }
                    textView4.setText("Incentive rewards");
                    break;
                }
                break;
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                PointMessageBean pointMessageBeanI4 = f.i(strReplace);
                if (pointMessageBeanI4 != null) {
                    textView3.setText(fVar.h(pointMessageBeanI4.amount));
                    if (!TextUtils.isEmpty(pointMessageBeanI4.title)) {
                        textView5.setText(pointMessageBeanI4.title);
                    }
                    textView4.setText(AppUtils.getAppName());
                    break;
                }
                break;
            case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                fVar.w(false);
                break;
            case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                fVar.w(true);
                break;
            case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                MoneyOrderBean moneyOrderBeanG23 = f.g(strReplace);
                if (moneyOrderBeanG23 != null) {
                    textView3.setText(f.a(moneyOrderBeanG23.recipientAmount));
                    if (!TextUtils.isEmpty(moneyOrderBeanG23.title)) {
                        textView5.setText(moneyOrderBeanG23.title);
                    }
                    view.setTag(e.main_tag_order_number, moneyOrderBeanG23.orderId);
                    textView4.setText(StringUtils.null2Length0(f.k(moneyOrderBeanG23)));
                    break;
                }
                break;
            default:
                switch (str4.hashCode()) {
                    case 1508419:
                        b10 = !str4.equals("1114") ? (byte) -1 : (byte) 0;
                        break;
                    case 1508420:
                        b10 = !str4.equals("1115") ? (byte) -1 : (byte) 1;
                        break;
                    case 1508421:
                        b10 = !str4.equals("1116") ? (byte) -1 : (byte) 2;
                        break;
                    case 1508422:
                        b10 = !str4.equals("1117") ? (byte) -1 : (byte) 3;
                        break;
                    case 1508423:
                        b10 = !str4.equals("1118") ? (byte) -1 : (byte) 4;
                        break;
                    case 1508424:
                        b10 = !str4.equals("1119") ? (byte) -1 : (byte) 5;
                        break;
                    case 1508446:
                        b10 = !str4.equals("1120") ? (byte) -1 : (byte) 6;
                        break;
                    case 1508447:
                        b10 = !str4.equals("1121") ? (byte) -1 : (byte) 7;
                        break;
                    case 1508448:
                        b10 = !str4.equals("1122") ? (byte) -1 : (byte) 8;
                        break;
                    case 1508449:
                        b10 = !str4.equals("1123") ? (byte) -1 : (byte) 9;
                        break;
                    case 1508450:
                        b10 = !str4.equals("1124") ? (byte) -1 : (byte) 10;
                        break;
                    case 1508451:
                        b10 = !str4.equals("1125") ? (byte) -1 : Ascii.VT;
                        break;
                    case 1508452:
                        b10 = !str4.equals("1126") ? (byte) -1 : Ascii.FF;
                        break;
                    case 1508453:
                        b10 = !str4.equals("1127") ? (byte) -1 : Ascii.CR;
                        break;
                    case 1508454:
                        b10 = !str4.equals("1128") ? (byte) -1 : Ascii.SO;
                        break;
                    case 1508480:
                        b10 = !str4.equals("1133") ? (byte) -1 : Ascii.SI;
                        break;
                    case 1508481:
                        b10 = !str4.equals("1134") ? (byte) -1 : Ascii.DLE;
                        break;
                    case 1508482:
                        b10 = !str4.equals("1135") ? (byte) -1 : (byte) 17;
                        break;
                    case 1508484:
                        b10 = !str4.equals("1137") ? (byte) -1 : Ascii.DC2;
                        break;
                    case 1508485:
                        b10 = !str4.equals("1138") ? (byte) -1 : (byte) 19;
                        break;
                    case 1508486:
                        b10 = !str4.equals("1139") ? (byte) -1 : Ascii.DC4;
                        break;
                    case 1508539:
                        b10 = !str4.equals("1150") ? (byte) -1 : Ascii.NAK;
                        break;
                    case 1508540:
                        b10 = !str4.equals("1151") ? (byte) -1 : Ascii.SYN;
                        break;
                    case 1509350:
                        b10 = !str4.equals("1205") ? (byte) -1 : Ascii.ETB;
                        break;
                    case 1509352:
                        b10 = !str4.equals("1207") ? (byte) -1 : Ascii.CAN;
                        break;
                    case 1509354:
                        b10 = !str4.equals("1209") ? (byte) -1 : Ascii.EM;
                        break;
                    case 1509377:
                        b10 = !str4.equals("1211") ? (byte) -1 : Ascii.SUB;
                        break;
                    case 1510307:
                        b10 = !str4.equals("1301") ? (byte) -1 : Ascii.ESC;
                        break;
                    case 1510308:
                        b10 = !str4.equals("1302") ? (byte) -1 : Ascii.FS;
                        break;
                    case 1512228:
                        b10 = !str4.equals("1500") ? (byte) -1 : Ascii.GS;
                        break;
                    case 1512229:
                        b10 = !str4.equals("1501") ? (byte) -1 : Ascii.RS;
                        break;
                    case 1512230:
                        b10 = !str4.equals("1502") ? (byte) -1 : Ascii.US;
                        break;
                    case 1512234:
                        b10 = !str4.equals("1506") ? (byte) -1 : (byte) 32;
                        break;
                    case 1512235:
                        b10 = !str4.equals("1507") ? (byte) -1 : (byte) 33;
                        break;
                    case 1512236:
                        b10 = !str4.equals("1508") ? (byte) -1 : (byte) 34;
                        break;
                    case 1512237:
                        b10 = !str4.equals("1509") ? (byte) -1 : (byte) 35;
                        break;
                    case 1512259:
                        b10 = !str4.equals("1510") ? (byte) -1 : (byte) 36;
                        break;
                    case 1512296:
                        b10 = !str4.equals("1526") ? (byte) -1 : (byte) 37;
                        break;
                    case 1512298:
                        b10 = !str4.equals("1528") ? (byte) -1 : (byte) 38;
                        break;
                    case 1568121:
                        b10 = !str4.equals("3150") ? (byte) -1 : (byte) 39;
                        break;
                    case 1568122:
                        b10 = !str4.equals("3151") ? (byte) -1 : (byte) 40;
                        break;
                    case 1568123:
                        b10 = !str4.equals("3152") ? (byte) -1 : (byte) 41;
                        break;
                    case 1568124:
                        b10 = !str4.equals("3153") ? (byte) -1 : (byte) 42;
                        break;
                    case 1568125:
                        b10 = !str4.equals("3154") ? (byte) -1 : (byte) 43;
                        break;
                    case 1568126:
                        b10 = !str4.equals("3155") ? (byte) -1 : (byte) 44;
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 6:
                    case 12:
                    case 15:
                    case 17:
                    case 18:
                    case 21:
                    case 40:
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    case 44:
                        fVar.x(strReplace, true);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 13:
                    case 14:
                    case 16:
                    case 19:
                    case 22:
                    case 39:
                    case 41:
                    case 43:
                        fVar.x(strReplace, false);
                        break;
                    case 20:
                    case 29:
                    case 32:
                    case 35:
                    case 36:
                    case 37:
                        MerchantMsg merchantMsgF = f.f(strReplace);
                        if (merchantMsgF != null) {
                            if (!TextUtils.isEmpty(merchantMsgF.title)) {
                                textView5.setText(merchantMsgF.title);
                            }
                            textView3.setText(f.a(merchantMsgF.payAmount));
                            textView4.setText(merchantMsgF.merchantName);
                            view.setTag(e.main_tag_order_number, merchantMsgF.orderNo);
                            break;
                        }
                        break;
                    case 23:
                    case 24:
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    case 26:
                        BusinessInfoBean businessInfoBeanC7 = f.c(strReplace);
                        if (businessInfoBeanC7 != null) {
                            textView3.setText(f.a(businessInfoBeanC7.amount));
                            if (!TextUtils.isEmpty(businessInfoBeanC7.title)) {
                                textView5.setText(businessInfoBeanC7.title);
                            }
                            textView4.setText(AppUtils.getAppName());
                            break;
                        }
                        break;
                    case 27:
                        BindBankCardMsg bindBankCardMsgB = f.b(strReplace);
                        if (bindBankCardMsgB != null) {
                            textView3.setText(f.a(bindBankCardMsgB.amount));
                            if (!TextUtils.isEmpty(bindBankCardMsgB.title)) {
                                textView5.setText(bindBankCardMsgB.title);
                            }
                            textView4.setText(i0.h(bindBankCardMsgB.bankName, bindBankCardMsgB.bankCardNo));
                            break;
                        }
                        break;
                    case 28:
                        BindBankCardMsg bindBankCardMsgB2 = f.b(strReplace);
                        if (bindBankCardMsgB2 != null) {
                            textView3.setText(h.main_declined);
                            textView3.setTextColor(context.getResources().getColor(L6.b.ppColorTextDisable));
                            if (!TextUtils.isEmpty(bindBankCardMsgB2.title)) {
                                textView5.setText(bindBankCardMsgB2.title);
                            }
                            textView4.setText(i0.h(bindBankCardMsgB2.bankName, bindBankCardMsgB2.bankCardNo));
                            break;
                        }
                        break;
                    case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    case 31:
                    case 33:
                    case 34:
                        MerchantMsg merchantMsgF2 = f.f(strReplace);
                        if (merchantMsgF2 != null) {
                            if (!TextUtils.isEmpty(merchantMsgF2.title)) {
                                textView5.setText(merchantMsgF2.title);
                            }
                            textView3.setText(fVar.e(merchantMsgF2.payAmount));
                            textView4.setText(merchantMsgF2.merchantName);
                            view.setTag(e.main_tag_order_number, merchantMsgF2.orderNo);
                            break;
                        }
                        break;
                    case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                        try {
                            C0525w.f().getClass();
                            bulkBundleMsg = (BulkBundleMsg) C0525w.d(strReplace, BulkBundleMsg.class);
                        } catch (Exception e13) {
                            d.c(str3, "update1528: ", e13);
                        }
                        if (bulkBundleMsg != null) {
                            if (!TextUtils.isEmpty(bulkBundleMsg.title)) {
                                textView5.setText(bulkBundleMsg.title);
                            }
                            textView3.setText(f.a(bulkBundleMsg.amount));
                            textView4.setText(bulkBundleMsg.merchantName);
                            view.setTag(e.main_tag_order_number, bulkBundleMsg.orderNo);
                            break;
                        }
                        break;
                    default:
                        switch (str4) {
                            case "1051":
                            case "1052":
                            case "1054":
                            case "1057":
                            case "1514":
                                try {
                                    C0525w.f().getClass();
                                    refundMsg = (RefundMsg) C0525w.d(strReplace, RefundMsg.class);
                                } catch (Exception e14) {
                                    d.c(str3, "getRefundMsgBean: ", e14);
                                }
                                if (refundMsg != null) {
                                    if (!TextUtils.isEmpty(refundMsg.title)) {
                                        textView5.setText(refundMsg.title);
                                    }
                                    textView3.setText(f.a(refundMsg.amount));
                                    textView4.setText(AppUtils.getAppName());
                                    view.setTag(e.main_tag_order_number, refundMsg.orderId);
                                    break;
                                }
                                break;
                            case "1516":
                                PointMessageBean pointMessageBeanI5 = f.i(strReplace);
                                if (pointMessageBeanI5 != null) {
                                    textView3.setText(fVar.h(pointMessageBeanI5.amount));
                                    if (!TextUtils.isEmpty(pointMessageBeanI5.title)) {
                                        textView5.setText(pointMessageBeanI5.title);
                                    }
                                    view.setTag(e.main_tag_order_number, pointMessageBeanI5.orderNo);
                                    view.setTag(e.main_tag_message_type, "1516");
                                    textView4.setText(AppUtils.getAppName());
                                    break;
                                }
                                break;
                            case "1602":
                                CompensateMsg compensateMsgD = f.d(strReplace);
                                if (compensateMsgD != null) {
                                    if (!TextUtils.isEmpty(compensateMsgD.title)) {
                                        textView5.setText(compensateMsgD.title);
                                    }
                                    textView3.setText(f.a(compensateMsgD.amount));
                                    textView4.setText(AppUtils.getAppName());
                                    break;
                                }
                                break;
                            case "1603":
                                CompensateMsg compensateMsgD2 = f.d(strReplace);
                                if (compensateMsgD2 != null) {
                                    if (!TextUtils.isEmpty(compensateMsgD2.title)) {
                                        textView5.setText(compensateMsgD2.title);
                                    }
                                    textView3.setText(fVar.h(compensateMsgD2.amount));
                                    textView4.setText(AppUtils.getAppName());
                                    break;
                                }
                                break;
                            case "1700":
                            case "1701":
                                try {
                                    C0525w.f().getClass();
                                    palmPayContact = (PalmPayContact) C0525w.d(strReplace, PalmPayContact.class);
                                    try {
                                        strOptString = new JSONObject(strReplace).optString("title");
                                    } catch (Exception e15) {
                                        e = e15;
                                        d.c(str3, "update1700: ", e);
                                    }
                                    break;
                                } catch (Exception e16) {
                                    e = e16;
                                    palmPayContact = null;
                                }
                                if (palmPayContact != null) {
                                    if (!TextUtils.isEmpty(strOptString)) {
                                        textView5.setText(strOptString);
                                    }
                                    view.setTag(e.main_tag_message_type, str4);
                                    if (PushMessage.MESSAGE_TYPE_REQUEST_CONTACT.equalsIgnoreCase(str4)) {
                                        textView3.setText(h.main_request);
                                    } else if (PushMessage.MESSAGE_TYPE_ACCEPT_CONTACT.equalsIgnoreCase(str4)) {
                                        textView3.setText(h.main_accepted);
                                        view.setTag(e.main_tag_extra_data, palmPayContact);
                                    }
                                    textView4.setText(palmPayContact.getAlias());
                                    break;
                                }
                                break;
                            default:
                                switch (str4) {
                                    case "3067":
                                    case "3128":
                                    case "3129":
                                        try {
                                            C0525w.f().getClass();
                                            commonPaymentMsg = (CommonPaymentMsg) C0525w.d(strReplace, CommonPaymentMsg.class);
                                        } catch (Exception e17) {
                                            d.c(str3, "update3067: ", e17);
                                        }
                                        if (commonPaymentMsg != null) {
                                            textView3.setText(f.a(commonPaymentMsg.amount));
                                            if (!TextUtils.isEmpty(commonPaymentMsg.title)) {
                                                textView5.setText(commonPaymentMsg.title);
                                            }
                                            view.setTag(e.main_tag_order_number, commonPaymentMsg.orderNo);
                                            textView4.setText(k.core_pre_pay_limit);
                                            break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GetMsgRsp.DataBean.ListBean listBean;
        if (this.f43199f == null || (listBean = (GetMsgRsp.DataBean.ListBean) view.getTag(e.main_tag_object)) == null) {
            return;
        }
        Integer num = (Integer) view.getTag(e.main_tag_view_type);
        this.f43199f.OnItemClick(view, listBean, num != null ? num.intValue() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        RecyclerView.ViewHolder cVar;
        Context context = this.f4984a;
        if (1 == i7) {
            View viewInflate = LayoutInflater.from(context).inflate(Ac.f.main_layout_payment_message_list_item, viewGroup, false);
            HashMap map = this.f43198e;
            f fVar = new f(viewInflate);
            fVar.f43469i = viewInflate;
            fVar.f43470j = viewInflate.getContext();
            fVar.f43471o = map;
            fVar.f43462a = (TextView) viewInflate.findViewById(e.textViewTitle);
            fVar.f43463b = (TextView) viewInflate.findViewById(e.textViewDate);
            fVar.f43465d = (TextView) viewInflate.findViewById(e.textViewState);
            fVar.f43464c = (TextView) viewInflate.findViewById(e.textViewAmount);
            fVar.f43466e = (TextView) viewInflate.findViewById(e.textViewLine10);
            fVar.f43467f = (TextView) viewInflate.findViewById(e.textViewLine11);
            fVar.f43468g = viewInflate.findViewById(e.viewLine1);
            cVar = fVar;
        } else if (2 == i7) {
            cVar = new g(LayoutInflater.from(context).inflate(Ac.f.main_layout_payment_message_list_item, viewGroup, false));
        } else if (4 == i7) {
            cVar = new a(LayoutInflater.from(context).inflate(Ac.f.main_layout_news_message_list_item, viewGroup, false));
        } else if (3 == i7) {
            cVar = new b(LayoutInflater.from(context).inflate(Ac.f.main_layout_news_message_list_item, viewGroup, false));
        } else {
            cVar = new we.c(LayoutInflater.from(context).inflate(Ac.f.main_layout_common_message_list_item, viewGroup, false));
        }
        cVar.itemView.setTag(e.main_tag_view_type, Integer.valueOf(i7));
        cVar.itemView.setOnClickListener(this);
        return cVar;
    }
}
