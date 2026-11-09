package com.transsnet.palmpay.core.bean.message;

import Pa.C0525w;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class MsgContentBean {
    public String bulkNo;
    public String businessInfo;
    public String linkUrl;
    public String messageType;
    public MessageTypeBase msgObj;
    public String noticeMsg;
    public String notificationType;
    public String orderId;
    public String outsideInsideNotificationInfo;
    public String title;
    public String transScene;
    public String transType;

    public MessageTypeBase getMsgObj() {
        if (TextUtils.isEmpty(this.outsideInsideNotificationInfo)) {
            return null;
        }
        if (this.msgObj == null) {
            Class cls = MessageTypeCommon.class;
            if (!String.valueOf(1).equalsIgnoreCase(this.notificationType)) {
                if (String.valueOf(2).equalsIgnoreCase(this.notificationType)) {
                    cls = MessageTypeActivity.class;
                } else if (String.valueOf(3).equalsIgnoreCase(this.notificationType)) {
                    cls = MessageTypeAnnouncement.class;
                } else if (String.valueOf(0).equalsIgnoreCase(this.notificationType)) {
                    cls = MessageTypePayment.class;
                }
            }
            try {
                C0525w c0525wF = C0525w.f();
                String str = this.outsideInsideNotificationInfo;
                c0525wF.getClass();
                this.msgObj = (MessageTypeBase) C0525w.d(str, cls);
            } catch (Exception unused) {
            }
        }
        return this.msgObj;
    }
}
