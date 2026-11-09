package com.transsnet.palmpay.credit.bean.req;

import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class QueryMemberDetailReq implements SingleLiveData$Params {
    private String keyword;
    private int keywordType;
    private String memberId;
    private String phone;
    private List<String> sources;
    private String userEmail;

    public QueryMemberDetailReq() {
    }

    public String getKeyword() {
        return this.keyword;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public String getPhone() {
        return this.phone;
    }

    public List<String> getSources() {
        return this.sources;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setMemberId(String str) {
        this.memberId = str;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public void setSources(List<String> list) {
        this.sources = list;
    }

    public void setUserEmail(String str) {
        this.userEmail = str;
    }

    public QueryMemberDetailReq(String str) {
        this.keyword = str;
    }

    public QueryMemberDetailReq(String str, int i7) {
        this.keyword = str;
        this.keywordType = i7;
    }
}
