package com.transsnet.palmpay.main.export.bean.rsp;

import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u001a\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardTasksRsp;", "", "<init>", "()V", "title", "", "total", "", "Ljava/lang/Integer;", "finishedTotal", "taskList", "", "Lcom/transsnet/palmpay/main/export/bean/PalmZoneTaskBean;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeRewardTasksRsp {

    @JvmField
    @Nullable
    public List<? extends PalmZoneTaskBean> taskList;

    @JvmField
    @Nullable
    public String title;

    @JvmField
    @Nullable
    public Integer total = 0;

    @JvmField
    @Nullable
    public Integer finishedTotal = 0;
}
