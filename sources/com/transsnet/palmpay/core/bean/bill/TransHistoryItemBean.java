package com.transsnet.palmpay.core.bean.bill;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010'\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b(\u0010*¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/core/bean/bill/TransHistoryItemBean;", "Ljava/io/Serializable;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "<init>", "()V", "orderNo", "", "payId", "memberId", "amount", "", "Ljava/lang/Long;", "displayAmount", "orderStatus", "transType", "subTransTypeCode", "title", "subTitle", "createTime", "updateTime", "iconUrl", "merchantNo", "businessType", "", "Ljava/lang/Integer;", "payerAccountType", "redirect", "customLinkH5", "customLinkAndroid", "getCustomLinkAndroid", "()Ljava/lang/String;", "setCustomLinkAndroid", "(Ljava/lang/String;)V", "itemType", "getItemType", "()I", "setItemType", "(I)V", "inComeAmount", "payOutAmount", "isHeader", "", "()Z", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransHistoryItemBean implements Serializable, MultiItemEntity {
    public static final int ITEM_TYPE_NORMAL = 0;
    public static final int ITEM_TYPE_TITLE = 1;

    @JvmField
    @Nullable
    public Long amount;

    @JvmField
    @Nullable
    public Integer businessType;

    @JvmField
    @Nullable
    public Long createTime;

    @Nullable
    private String customLinkAndroid;

    @JvmField
    @Nullable
    public String customLinkH5;

    @JvmField
    @Nullable
    public String displayAmount;

    @JvmField
    @Nullable
    public String iconUrl;

    @JvmField
    @Nullable
    public Long inComeAmount;
    private int itemType;

    @JvmField
    @Nullable
    public String memberId;

    @JvmField
    @Nullable
    public String merchantNo;

    @JvmField
    @Nullable
    public String orderNo;

    @JvmField
    @Nullable
    public String orderStatus;

    @JvmField
    @Nullable
    public String payId;

    @JvmField
    @Nullable
    public Long payOutAmount;

    @JvmField
    @Nullable
    public Integer payerAccountType;

    @JvmField
    @Nullable
    public String redirect;

    @JvmField
    @Nullable
    public String subTitle;

    @JvmField
    @Nullable
    public String subTransTypeCode;

    @JvmField
    @Nullable
    public String title;

    @JvmField
    @Nullable
    public String transType;

    @JvmField
    @Nullable
    public Long updateTime;

    @Nullable
    public final String getCustomLinkAndroid() {
        return this.customLinkAndroid;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    public final boolean isHeader() {
        return getItemType() == 1;
    }

    public final void setCustomLinkAndroid(@Nullable String str) {
        this.customLinkAndroid = str;
    }

    public void setItemType(int i7) {
        this.itemType = i7;
    }
}
