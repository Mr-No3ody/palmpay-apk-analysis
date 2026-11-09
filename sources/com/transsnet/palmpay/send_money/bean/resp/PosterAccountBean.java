package com.transsnet.palmpay.send_money.bean.resp;

import android.text.TextUtils;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/PosterAccountBean;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "Ljava/io/Serializable;", "<init>", "()V", "mappingAccountNo", "", "getMappingAccountNo", "()Ljava/lang/String;", "setMappingAccountNo", "(Ljava/lang/String;)V", "bizId", "getBizId", "setBizId", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "accountName", "getAccountName", "setAccountName", "accountType", "", "getAccountType", "()Ljava/lang/Integer;", "setAccountType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isMerchant", "", "()Z", "setMerchant", "(Z)V", "itemType", "getItemType", "()I", "Companion", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PosterAccountBean implements MultiItemEntity, Serializable {
    public static final int PAY_ME_ACCOUNT_TYPE_MERCHANT = 2;
    public static final int PAY_ME_ACCOUNT_TYPE_NORMAL = 0;
    public static final int PAY_ME_ACCOUNT_TYPE_SUB = 1;
    public static final int PAY_ME_TYPE_EMPTY = 0;
    public static final int PAY_ME_TYPE_NORMAL = 1;

    @Nullable
    private String accountName;

    @Nullable
    private Integer accountType;

    @Nullable
    private String bizId;
    private boolean isMerchant;

    @Nullable
    private String mappingAccountNo;

    @Nullable
    private String phoneNumber;

    @Nullable
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getBizId() {
        return this.bizId;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return !TextUtils.isEmpty(this.mappingAccountNo) ? 1 : 0;
    }

    @Nullable
    public final String getMappingAccountNo() {
        return this.mappingAccountNo;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: isMerchant, reason: from getter */
    public final boolean getIsMerchant() {
        return this.isMerchant;
    }

    public final void setAccountName(@Nullable String str) {
        this.accountName = str;
    }

    public final void setAccountType(@Nullable Integer num) {
        this.accountType = num;
    }

    public final void setBizId(@Nullable String str) {
        this.bizId = str;
    }

    public final void setMappingAccountNo(@Nullable String str) {
        this.mappingAccountNo = str;
    }

    public final void setMerchant(boolean z3) {
        this.isMerchant = z3;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.phoneNumber = str;
    }
}
