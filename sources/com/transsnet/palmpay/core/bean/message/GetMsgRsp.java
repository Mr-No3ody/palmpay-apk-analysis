package com.transsnet.palmpay.core.bean.message;

import Pa.C0525w;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GetMsgRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public List<ListBean> list;

        public static class ListBean {
            public String androidVersion;
            public String content;
            public MsgContentBean contentBean;
            public long createtime;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            public long f27367id;
            public String msgObjectId;
            public String msgScene;
            private int msgType;
            private String notificationType;
            public String title;

            public MsgContentBean getContent() {
                if (this.contentBean == null) {
                    try {
                        C0525w c0525wF = C0525w.f();
                        String str = this.content;
                        c0525wF.getClass();
                        MsgContentBean msgContentBean = (MsgContentBean) C0525w.d(str, MsgContentBean.class);
                        if (TextUtils.isEmpty(msgContentBean.title)) {
                            msgContentBean.title = this.title;
                        }
                        this.contentBean = msgContentBean;
                    } catch (Exception unused) {
                    }
                }
                return this.contentBean;
            }

            public String getNotificationType() {
                return TextUtils.isEmpty(this.notificationType) ? String.valueOf(this.msgType) : this.notificationType;
            }

            public void setNotificationType(String notificationType) {
                this.notificationType = notificationType;
            }
        }
    }
}
