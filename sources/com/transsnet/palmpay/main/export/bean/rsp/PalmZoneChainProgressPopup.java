package com.transsnet.palmpay.main.export.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneChainProgressPopup;", "", "<init>", "()V", "scenario", "", "title", "message", "hasRewardToday", "", "Ljava/lang/Boolean;", "todayRewardText", "hasRewardTomorrow", "tomorrowRewardDisplay", "Lcom/transsnet/palmpay/main/export/bean/rsp/RewardDisplay;", "showTomorrowBadge", "activityContinueTomorrow", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmZoneChainProgressPopup {

    @JvmField
    @Nullable
    public Boolean activityContinueTomorrow;

    @JvmField
    @Nullable
    public Boolean hasRewardToday;

    @JvmField
    @Nullable
    public Boolean hasRewardTomorrow;

    @JvmField
    @Nullable
    public String message;

    @JvmField
    @Nullable
    public String scenario;

    @JvmField
    @Nullable
    public Boolean showTomorrowBadge;

    @JvmField
    @Nullable
    public String title;

    @JvmField
    @Nullable
    public String todayRewardText;

    @JvmField
    @Nullable
    public RewardDisplay tomorrowRewardDisplay;
}
