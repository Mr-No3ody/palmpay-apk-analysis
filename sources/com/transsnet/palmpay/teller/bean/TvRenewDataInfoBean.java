package com.transsnet.palmpay.teller.bean;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001e\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010)\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u001e\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00103\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR\u001c\u00106\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR\u001c\u00109\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR\u001e\u0010<\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b=\u0010%\"\u0004\b>\u0010'R.\u0010?\u001a\u0016\u0012\u0004\u0012\u00020A\u0018\u00010@j\n\u0012\u0004\u0012\u00020A\u0018\u0001`BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010G\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\bH\u0010%\"\u0004\bI\u0010'R\u001e\u0010J\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\bK\u0010/\"\u0004\bL\u00101¨\u0006N"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/TvRenewDataInfoBean;", "Ljava/io/Serializable;", "<init>", "()V", "viewPic", "", "getViewPic", "()Ljava/lang/String;", "setViewPic", "(Ljava/lang/String;)V", "viewDoc", "getViewDoc", "setViewDoc", "paymentItemId", "getPaymentItemId", "setPaymentItemId", "billerName", "getBillerName", "setBillerName", "billerId", "getBillerId", "setBillerId", "accountNumber", "getAccountNumber", "setAccountNumber", "accountNmberTitleName", "getAccountNmberTitleName", "setAccountNmberTitleName", "paymentItemName", "getPaymentItemName", "setPaymentItemName", "billerIcon", "getBillerIcon", "setBillerIcon", "accountAmount", "", "getAccountAmount", "()Ljava/lang/Long;", "setAccountAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "needReNewPayAmount", "getNeedReNewPayAmount", "setNeedReNewPayAmount", "available", "", "getAvailable", "()Ljava/lang/Boolean;", "setAvailable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "fullName", "getFullName", "setFullName", "referenceId", "getReferenceId", "setReferenceId", "address", "getAddress", "setAddress", "minAmount", "getMinAmount", "setMinAmount", "items", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/teller/bean/TvRenewDataInfoBean$Item;", "Lkotlin/collections/ArrayList;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "renewalAmount", "getRenewalAmount", "setRenewalAmount", "onlyRenewal", "getOnlyRenewal", "setOnlyRenewal", "Item", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TvRenewDataInfoBean implements Serializable {

    @Nullable
    private String address;

    @Nullable
    private Boolean available;

    @Nullable
    private String fullName;

    @Nullable
    private ArrayList<Item> items;

    @Nullable
    private Long minAmount;

    @Nullable
    private Boolean onlyRenewal;

    @Nullable
    private String referenceId;

    @Nullable
    private Long renewalAmount;

    @Nullable
    private String viewPic = "";

    @Nullable
    private String viewDoc = "";

    @Nullable
    private String paymentItemId = "";

    @Nullable
    private String billerName = "";

    @Nullable
    private String billerId = "";

    @Nullable
    private String accountNumber = "";

    @Nullable
    private String accountNmberTitleName = "";

    @Nullable
    private String paymentItemName = "";

    @Nullable
    private String billerIcon = "";

    @Nullable
    private Long accountAmount = 0L;

    @Nullable
    private Long needReNewPayAmount = 0L;

    public TvRenewDataInfoBean() {
        Boolean bool = Boolean.FALSE;
        this.available = bool;
        this.minAmount = 0L;
        this.renewalAmount = 0L;
        this.onlyRenewal = bool;
    }

    @Nullable
    public final Long getAccountAmount() {
        return this.accountAmount;
    }

    @Nullable
    public final String getAccountNmberTitleName() {
        return this.accountNmberTitleName;
    }

    @Nullable
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final Boolean getAvailable() {
        return this.available;
    }

    @Nullable
    public final String getBillerIcon() {
        return this.billerIcon;
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final ArrayList<Item> getItems() {
        return this.items;
    }

    @Nullable
    public final Long getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    public final Long getNeedReNewPayAmount() {
        return this.needReNewPayAmount;
    }

    @Nullable
    public final Boolean getOnlyRenewal() {
        return this.onlyRenewal;
    }

    @Nullable
    public final String getPaymentItemId() {
        return this.paymentItemId;
    }

    @Nullable
    public final String getPaymentItemName() {
        return this.paymentItemName;
    }

    @Nullable
    public final String getReferenceId() {
        return this.referenceId;
    }

    @Nullable
    public final Long getRenewalAmount() {
        return this.renewalAmount;
    }

    @Nullable
    public final String getViewDoc() {
        return this.viewDoc;
    }

    @Nullable
    public final String getViewPic() {
        return this.viewPic;
    }

    public final void setAccountAmount(@Nullable Long l5) {
        this.accountAmount = l5;
    }

    public final void setAccountNmberTitleName(@Nullable String str) {
        this.accountNmberTitleName = str;
    }

    public final void setAccountNumber(@Nullable String str) {
        this.accountNumber = str;
    }

    public final void setAddress(@Nullable String str) {
        this.address = str;
    }

    public final void setAvailable(@Nullable Boolean bool) {
        this.available = bool;
    }

    public final void setBillerIcon(@Nullable String str) {
        this.billerIcon = str;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setFullName(@Nullable String str) {
        this.fullName = str;
    }

    public final void setItems(@Nullable ArrayList<Item> arrayList) {
        this.items = arrayList;
    }

    public final void setMinAmount(@Nullable Long l5) {
        this.minAmount = l5;
    }

    public final void setNeedReNewPayAmount(@Nullable Long l5) {
        this.needReNewPayAmount = l5;
    }

    public final void setOnlyRenewal(@Nullable Boolean bool) {
        this.onlyRenewal = bool;
    }

    public final void setPaymentItemId(@Nullable String str) {
        this.paymentItemId = str;
    }

    public final void setPaymentItemName(@Nullable String str) {
        this.paymentItemName = str;
    }

    public final void setReferenceId(@Nullable String str) {
        this.referenceId = str;
    }

    public final void setRenewalAmount(@Nullable Long l5) {
        this.renewalAmount = l5;
    }

    public final void setViewDoc(@Nullable String str) {
        this.viewDoc = str;
    }

    public final void setViewPic(@Nullable String str) {
        this.viewPic = str;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0002\u0010\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/TvRenewDataInfoBean$Item;", "Ljava/io/Serializable;", "<init>", "()V", "key", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getValue", "setValue", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Serializable {

        @Nullable
        private String key;

        @Nullable
        private String value;

        public Item() {
            this.key = "";
            this.value = "";
        }

        @Nullable
        public final String getKey() {
            return this.key;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public final void setKey(@Nullable String str) {
            this.key = str;
        }

        public final void setValue(@Nullable String str) {
            this.value = str;
        }

        public Item(@Nullable String str, @Nullable String str2) {
            this();
            this.key = str;
            this.value = str2;
        }
    }
}
