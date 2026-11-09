package com.transsnet.palmpay.credit.bean.req;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/OcAddContactReq;", "", "applyId", "", "contacts", "", "Lcom/transsnet/palmpay/credit/bean/req/ContactData;", "socialMediaInfo", "Lcom/transsnet/palmpay/credit/bean/req/SocialMediaInfo;", "loanProduct", "operateType", "personalInfo", "Lcom/transsnet/palmpay/credit/bean/req/PersonalInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/transsnet/palmpay/credit/bean/req/SocialMediaInfo;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/req/PersonalInfo;)V", "getApplyId", "()Ljava/lang/String;", "getContacts", "()Ljava/util/List;", "getSocialMediaInfo", "()Lcom/transsnet/palmpay/credit/bean/req/SocialMediaInfo;", "getLoanProduct", "getOperateType", "getPersonalInfo", "()Lcom/transsnet/palmpay/credit/bean/req/PersonalInfo;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcAddContactReq {

    @Nullable
    private final String applyId;

    @Nullable
    private final List<ContactData> contacts;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final String operateType;

    @Nullable
    private final PersonalInfo personalInfo;

    @Nullable
    private final SocialMediaInfo socialMediaInfo;

    public OcAddContactReq(@Nullable String str, @Nullable List<ContactData> list, @Nullable SocialMediaInfo socialMediaInfo, @Nullable String str2, @Nullable String str3, @Nullable PersonalInfo personalInfo) {
        this.applyId = str;
        this.contacts = list;
        this.socialMediaInfo = socialMediaInfo;
        this.loanProduct = str2;
        this.operateType = str3;
        this.personalInfo = personalInfo;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    public final List<ContactData> getContacts() {
        return this.contacts;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final String getOperateType() {
        return this.operateType;
    }

    @Nullable
    public final PersonalInfo getPersonalInfo() {
        return this.personalInfo;
    }

    @Nullable
    public final SocialMediaInfo getSocialMediaInfo() {
        return this.socialMediaInfo;
    }
}
