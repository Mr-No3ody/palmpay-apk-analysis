package com.transsnet.palmpay.core.bean.rsp;

import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR.\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/TransactionFilterResp;", "", "<init>", "()V", "status", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/core/bean/rsp/TransactionFilterResp$FilterBean;", "Lkotlin/collections/ArrayList;", "getStatus", "()Ljava/util/ArrayList;", "setStatus", "(Ljava/util/ArrayList;)V", "conditions", "getConditions", "setConditions", "paymentType", "Lcom/transsnet/palmpay/core/bean/rsp/TransactionFilterResp$PaymentTypeBean;", "getPaymentType", "()Lcom/transsnet/palmpay/core/bean/rsp/TransactionFilterResp$PaymentTypeBean;", "setPaymentType", "(Lcom/transsnet/palmpay/core/bean/rsp/TransactionFilterResp$PaymentTypeBean;)V", "PaymentTypeBean", "FilterBean", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransactionFilterResp {

    @Nullable
    private ArrayList<FilterBean> conditions;

    @Nullable
    private PaymentTypeBean paymentType;

    @Nullable
    private ArrayList<FilterBean> status;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/TransactionFilterResp$FilterBean;", "", "<init>", "()V", "code", "", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "name", "getName", "setName", "defaultChoose", "", "getDefaultChoose", "()Z", "setDefaultChoose", "(Z)V", "childTypeParam", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getChildTypeParam", "()Ljava/util/ArrayList;", "setChildTypeParam", "(Ljava/util/ArrayList;)V", "isSelected", "setSelected", "all", "getAll", "setAll", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterBean {
        private boolean all;

        @Nullable
        private ArrayList<FilterBean> childTypeParam;

        @Nullable
        private String code;
        private boolean defaultChoose;
        private boolean isSelected;

        @Nullable
        private String name;

        public final boolean getAll() {
            return this.all;
        }

        @Nullable
        public final ArrayList<FilterBean> getChildTypeParam() {
            return this.childTypeParam;
        }

        @Nullable
        public final String getCode() {
            return this.code;
        }

        public final boolean getDefaultChoose() {
            return this.defaultChoose;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final void setAll(boolean z3) {
            this.all = z3;
        }

        public final void setChildTypeParam(@Nullable ArrayList<FilterBean> arrayList) {
            this.childTypeParam = arrayList;
        }

        public final void setCode(@Nullable String str) {
            this.code = str;
        }

        public final void setDefaultChoose(boolean z3) {
            this.defaultChoose = z3;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setSelected(boolean z3) {
            this.isSelected = z3;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR.\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/TransactionFilterResp$PaymentTypeBean;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "conditions", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/core/bean/rsp/TransactionFilterResp$FilterBean;", "Lkotlin/collections/ArrayList;", "getConditions", "()Ljava/util/ArrayList;", "setConditions", "(Ljava/util/ArrayList;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentTypeBean {

        @Nullable
        private ArrayList<FilterBean> conditions;

        @Nullable
        private String name;

        @Nullable
        public final ArrayList<FilterBean> getConditions() {
            return this.conditions;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final void setConditions(@Nullable ArrayList<FilterBean> arrayList) {
            this.conditions = arrayList;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }
    }

    @Nullable
    public final ArrayList<FilterBean> getConditions() {
        return this.conditions;
    }

    @Nullable
    public final PaymentTypeBean getPaymentType() {
        return this.paymentType;
    }

    @Nullable
    public final ArrayList<FilterBean> getStatus() {
        return this.status;
    }

    public final void setConditions(@Nullable ArrayList<FilterBean> arrayList) {
        this.conditions = arrayList;
    }

    public final void setPaymentType(@Nullable PaymentTypeBean paymentTypeBean) {
        this.paymentType = paymentTypeBean;
    }

    public final void setStatus(@Nullable ArrayList<FilterBean> arrayList) {
        this.status = arrayList;
    }
}
