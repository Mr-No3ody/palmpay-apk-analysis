package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class QueryRecipientRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public List<RecordBean> list;
    }

    public static class RecordBean {
        public String accountNo;
        public String agentMemberId;
        public boolean authen;
        public int businessType;
        public String cashBackPictureUrl;
        public String fullName;
        public String headPortrait;
        public String memberId;
        public String originalMemberId;
        public String phone;
        public int recipientType;
        public String transferNotes;
    }
}
