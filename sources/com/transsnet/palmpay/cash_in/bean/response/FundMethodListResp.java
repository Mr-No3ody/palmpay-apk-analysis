package com.transsnet.palmpay.cash_in.bean.response;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001Bg\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/response/FundMethodListResp;", "", "bankMethods", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/cash_in/bean/response/FundViewBean;", "Lkotlin/collections/ArrayList;", "ppMethods", "cashBoxMethods", "rewardDTO", "Lcom/transsnet/palmpay/cash_in/bean/response/CashHomeRewardsInfo;", "<init>", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/transsnet/palmpay/cash_in/bean/response/CashHomeRewardsInfo;)V", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FundMethodListResp {

    @JvmField
    @Nullable
    public final ArrayList<FundViewBean> bankMethods;

    @JvmField
    @Nullable
    public final ArrayList<FundViewBean> cashBoxMethods;

    @JvmField
    @Nullable
    public final ArrayList<FundViewBean> ppMethods;

    @JvmField
    @Nullable
    public final CashHomeRewardsInfo rewardDTO;

    public FundMethodListResp(@Nullable ArrayList<FundViewBean> arrayList, @Nullable ArrayList<FundViewBean> arrayList2, @Nullable ArrayList<FundViewBean> arrayList3, @Nullable CashHomeRewardsInfo cashHomeRewardsInfo) {
        this.bankMethods = arrayList;
        this.ppMethods = arrayList2;
        this.cashBoxMethods = arrayList3;
        this.rewardDTO = cashHomeRewardsInfo;
    }

    public /* synthetic */ FundMethodListResp(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CashHomeRewardsInfo cashHomeRewardsInfo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, arrayList2, arrayList3, (i7 & 8) != 0 ? null : cashHomeRewardsInfo);
    }
}
