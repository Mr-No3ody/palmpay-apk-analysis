package com.transsnet.palmpay.core.interfaces;

import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.transsnet.palmpay.core.bean.JumpLinkInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\nJ]\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/core/interfaces/ILoanCreditService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Landroidx/fragment/app/Z;", "fragmentManager", "", "loanProduct", "channelEnum", "applyId", "", "startCredit", "(Landroidx/fragment/app/Z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "loanAmount", "", "sceneSource", "Lcom/transsnet/palmpay/core/bean/JumpLinkInfo;", "jumpLinkInfo", "borrowRoutePath", "productSubIdOverride", "startBorrow", "(Landroidx/fragment/app/Z;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Lcom/transsnet/palmpay/core/bean/JumpLinkInfo;Ljava/lang/String;Ljava/lang/Integer;)V", "checkPermission", "(Landroidx/fragment/app/Z;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ILoanCreditService extends IProvider {
    void checkPermission(@NotNull Z fragmentManager);

    void startBorrow(@NotNull Z fragmentManager, @Nullable String loanProduct, @Nullable Long loanAmount, @Nullable Integer sceneSource, @Nullable JumpLinkInfo jumpLinkInfo, @Nullable String borrowRoutePath, @Nullable Integer productSubIdOverride);

    void startCredit(@NotNull Z fragmentManager, @Nullable String loanProduct, @Nullable String channelEnum, @Nullable String applyId);
}
