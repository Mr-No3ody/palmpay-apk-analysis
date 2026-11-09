package Fe;

import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.req.GetMsgByTypeReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.ui.mvp.contract.PaymentMessageListContract;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class T extends com.transsnet.palmpay.core.base.j implements PaymentMessageListContract.Presenter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f2749f = {"1000", PushMessage.MESSAGE_TYPE_CASH_IN, "1002", "1003", PushMessage.MESSAGE_TYPE_RECEIVE_MONEY, PushMessage.MESSAGE_TYPE_CASH_OUT, PushMessage.MESSAGE_TYPE_QRCODE_COLLECT, "1008", "1009", "1010", "1011", "1013", "1015", "1016", "1017", "1018", "1019", "1020", "1021", "1022", "1023", "1024", "1025", "1026", "1027", "1029", "1030", "1031", "1032", "1033", "1034", "1035", "1036", "1037", "1038", "1039", "1040", "1041", "1042", "1043", "1044", "1045", "1046", "1047", "1048", "1049", "1050", "1051", "1052", "1053", "1054", "1056", "1057", "1060", "1114", "1115", "1116", "1117", "1118", "1119", "1120", "1121", "1122", "1123", "1124", "1125", "1126", "1127", "1128", "1133", "1134", "1135", "1137", "1138", "1139", "1150", "1151", "1200", "1201", "1202", "1203", "1204", "1205", "1206", "1207", "1208", "1209", "1210", "1211", "1212", "1215", "1216", "1217", "1218", "1222", "1301", "1302", "1500", "1501", "1502", "1506", "1507", "1508", "1509", "1510", "1512", "1513", "1514", "1515", "1516", "1526", "1528", "1602", "1603", PushMessage.MESSAGE_TYPE_REQUEST_CONTACT, PushMessage.MESSAGE_TYPE_ACCEPT_CONTACT, "3067", "3128", "3129", "3150", "3151", "3152", "3153", "3154", "3155", "3157", PushMessage.MESSAGE_TYPE_BENEFICIARY_BILLPAYMENT_REMIND, "P0046"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f2750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashSet f2751e;

    @Override // com.transsnet.palmpay.ui.mvp.contract.PaymentMessageListContract.Presenter
    public final void loadMessageList(int i7, boolean z3) {
        loadMessageList(1, i7, z3);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PaymentMessageListContract.Presenter
    public final void loadMessageList(Integer num, int i7, boolean z3) {
        GetMsgByTypeReq getMsgByTypeReq = new GetMsgByTypeReq();
        getMsgByTypeReq.pageNum = i7;
        getMsgByTypeReq.pageSize = 10;
        if (num != null) {
            getMsgByTypeReq.msgType = num;
        }
        getMsgByTypeReq.count = Boolean.FALSE;
        if (z3) {
            ((PaymentMessageListContract.View) this.f27351a).showLoading(true);
        }
        String strB = Pa.H.b(getMsgByTypeReq);
        df.d dVarC = ((PayApiService) p324va.c.f43141a.f14621b).getMessagesByTypeV2(getMsgByTypeReq).c(new Pa.a0(strB, 0));
        if (i7 != 1) {
            strB = "";
        }
        df.d.d(Pa.r0.H1(GetMsgRsp.class, strB), dVarC).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new S(this, z3, i7));
    }
}
