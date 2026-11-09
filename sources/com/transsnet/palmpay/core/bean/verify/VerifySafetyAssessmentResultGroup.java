package com.transsnet.palmpay.core.bean.verify;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/bean/verify/VerifySafetyAssessmentResultGroup;", "", "<init>", "()V", "contentTitle", "", FirebaseAnalytics.Param.CONTENT, "", "itemType", "", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifySafetyAssessmentResultGroup {
    public static final int TYPE_GROUP = 1;
    public static final int TYPE_ITEM = 2;

    @JvmField
    @Nullable
    public List<String> content;

    @JvmField
    @Nullable
    public String contentTitle;

    @JvmField
    public int itemType = 1;
}
