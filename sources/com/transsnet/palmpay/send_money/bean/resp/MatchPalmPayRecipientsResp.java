package com.transsnet.palmpay.send_money.bean.resp;

import Pa.r0;
import android.text.TextUtils;
import com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\n\u0010#\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010$\u001a\u0004\u0018\u00010\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/MatchPalmPayRecipientsResp;", "Lcom/transsnet/palmpay/send_money/impl/MatchRecipientsImpl;", "<init>", "()V", "headPortrait", "", "getHeadPortrait", "()Ljava/lang/String;", "setHeadPortrait", "(Ljava/lang/String;)V", "fullName", "getFullName", "setFullName", "phone", "getPhone", "setPhone", "accountNo", "getAccountNo", "setAccountNo", "ppAccountNo", "getPpAccountNo", "setPpAccountNo", "accountMark", "getAccountMark", "setAccountMark", "businessType", "", "getBusinessType", "()Ljava/lang/Integer;", "setBusinessType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIcon", "getName", "getAccount", "getBankName", "getAccountMask", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MatchPalmPayRecipientsResp implements MatchRecipientsImpl {

    @Nullable
    private String accountMark;

    @Nullable
    private String accountNo;

    @Nullable
    private Integer businessType;

    @Nullable
    private String fullName;

    @Nullable
    private String headPortrait;

    @Nullable
    private String phone;

    @Nullable
    private String ppAccountNo;

    @Override // com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl
    @NotNull
    public String getAccount() {
        Integer num;
        Integer num2;
        String strW;
        String strW2;
        String strW3;
        Integer num3 = this.businessType;
        if ((num3 == null || num3.intValue() != 2) && (((num = this.businessType) == null || num.intValue() != 5) && ((num2 = this.businessType) == null || num2.intValue() != 4))) {
            String str = this.accountNo;
            return (str == null || (strW = r0.w(str)) == null) ? "" : strW;
        }
        if (TextUtils.isEmpty(this.ppAccountNo)) {
            String str2 = this.phone;
            return (str2 == null || (strW3 = r0.w(str2)) == null) ? "" : strW3;
        }
        String str3 = this.ppAccountNo;
        return (str3 == null || (strW2 = r0.w(str3)) == null) ? "" : strW2;
    }

    @Nullable
    public final String getAccountMark() {
        return this.accountMark;
    }

    @Override // com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl
    @Nullable
    public String getAccountMask() {
        return this.accountMark;
    }

    @Nullable
    public final String getAccountNo() {
        return this.accountNo;
    }

    @Override // com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl
    @Nullable
    /* JADX INFO: renamed from: getBankName */
    public String getRecipientBankName() {
        return null;
    }

    @Nullable
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final String getHeadPortrait() {
        return this.headPortrait;
    }

    @Override // com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl
    @Nullable
    /* JADX INFO: renamed from: getIcon */
    public String getRecipientHeadImage() {
        return this.headPortrait;
    }

    @Override // com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl
    @Nullable
    /* JADX INFO: renamed from: getName */
    public String getRecipientNickname() {
        return this.fullName;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getPpAccountNo() {
        return this.ppAccountNo;
    }

    public final void setAccountMark(@Nullable String str) {
        this.accountMark = str;
    }

    public final void setAccountNo(@Nullable String str) {
        this.accountNo = str;
    }

    public final void setBusinessType(@Nullable Integer num) {
        this.businessType = num;
    }

    public final void setFullName(@Nullable String str) {
        this.fullName = str;
    }

    public final void setHeadPortrait(@Nullable String str) {
        this.headPortrait = str;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setPpAccountNo(@Nullable String str) {
        this.ppAccountNo = str;
    }
}
