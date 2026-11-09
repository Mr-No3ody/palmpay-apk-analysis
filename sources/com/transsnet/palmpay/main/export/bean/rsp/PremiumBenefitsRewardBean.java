package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/PremiumBenefitsRewardBean;", "", "<init>", "()V", "rewardVipCardDTO", "Lcom/transsnet/palmpay/main/export/bean/rsp/RewardVipCardBean;", "rewardTrialVipDTO", "Lcom/transsnet/palmpay/main/export/bean/rsp/RewardTrialVipBean;", "benefitVOList", "", "Lcom/transsnet/palmpay/main/export/bean/rsp/PremiumBenefitsItemBean;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PremiumBenefitsRewardBean {

    @JvmField
    @Nullable
    public List<PremiumBenefitsItemBean> benefitVOList;

    @JvmField
    @Nullable
    public RewardTrialVipBean rewardTrialVipDTO;

    @JvmField
    @Nullable
    public RewardVipCardBean rewardVipCardDTO;
}
