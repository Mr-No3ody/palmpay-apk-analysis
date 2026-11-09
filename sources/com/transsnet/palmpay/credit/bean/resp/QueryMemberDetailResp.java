package com.transsnet.palmpay.credit.bean.resp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class QueryMemberDetailResp extends CommonResult {
    public Data data;

    public static class Data implements Serializable {
        public String accountNo;
        public String accountTierTips;
        public boolean agent;
        public String agentMemberId;
        public boolean authen;
        public String birthday;
        public String bvn;
        public String cardNo;
        public String countryCode;
        public long createTime;
        public String email;
        public String facebookName;
        public String firstName;
        public String fullName;
        public String gender;
        public String headPortrait;
        public String headSubTitle;
        public String headTitle;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public int f28641id;
        public boolean isBeneficiary;
        public boolean isSelected;
        public int keywordType;
        public String lastName;
        public String memberId;
        public String memberName;
        public String memberStatus;
        public String middleName;
        public String mobileMoneyAccountTier;
        public String nickName;
        public boolean owner;
        public String palmPayTag;
        public String partnerAccountNo;
        public String phone;
        public String pinStatus;
        public String remark;
        public String userEmail;
    }
}
