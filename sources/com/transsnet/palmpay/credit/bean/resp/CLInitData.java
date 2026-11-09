package com.transsnet.palmpay.credit.bean.resp;

import com.transsnet.palmpay.credit.bean.req.ContactData;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLInitData;", "", "applyId", "", "lockToNoLockSuccessCount", "", "flagCreditLimit", "repeatContacts", "", "Lcom/transsnet/palmpay/credit/bean/req/ContactData;", "sceneType", "", "creditSceneRouteBindingFailTimes", "blockItem", "Lcom/transsnet/palmpay/credit/bean/resp/BlockItem;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/resp/BlockItem;)V", "getApplyId", "()Ljava/lang/String;", "getLockToNoLockSuccessCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFlagCreditLimit", "getRepeatContacts", "()Ljava/util/List;", "getSceneType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreditSceneRouteBindingFailTimes", "getBlockItem", "()Lcom/transsnet/palmpay/credit/bean/resp/BlockItem;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLInitData {

    @Nullable
    private final String applyId;

    @Nullable
    private final BlockItem blockItem;

    @Nullable
    private final Integer creditSceneRouteBindingFailTimes;

    @Nullable
    private final Long flagCreditLimit;

    @Nullable
    private final Long lockToNoLockSuccessCount;

    @Nullable
    private final List<ContactData> repeatContacts;

    @Nullable
    private final Integer sceneType;

    public CLInitData(@Nullable String str, @Nullable Long l5, @Nullable Long l6, @Nullable List<ContactData> list, @Nullable Integer num, @Nullable Integer num2, @Nullable BlockItem blockItem) {
        this.applyId = str;
        this.lockToNoLockSuccessCount = l5;
        this.flagCreditLimit = l6;
        this.repeatContacts = list;
        this.sceneType = num;
        this.creditSceneRouteBindingFailTimes = num2;
        this.blockItem = blockItem;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    public final BlockItem getBlockItem() {
        return this.blockItem;
    }

    @Nullable
    public final Integer getCreditSceneRouteBindingFailTimes() {
        return this.creditSceneRouteBindingFailTimes;
    }

    @Nullable
    public final Long getFlagCreditLimit() {
        return this.flagCreditLimit;
    }

    @Nullable
    public final Long getLockToNoLockSuccessCount() {
        return this.lockToNoLockSuccessCount;
    }

    @Nullable
    public final List<ContactData> getRepeatContacts() {
        return this.repeatContacts;
    }

    @Nullable
    public final Integer getSceneType() {
        return this.sceneType;
    }
}
