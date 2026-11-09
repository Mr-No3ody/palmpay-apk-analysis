package com.transsnet.palmpay.core.interfaces;

import androidx.fragment.app.E;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/interfaces/ITransferByLoanService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Landroidx/fragment/app/E;", "activity", "Lcom/transsnet/palmpay/core/bean/TransferByLoanOpenParams;", "params", "", "launch", "(Landroidx/fragment/app/E;Lcom/transsnet/palmpay/core/bean/TransferByLoanOpenParams;)V", "", "isTrialOpen", "()Z", "Companion", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ITransferByLoanService extends IProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int REQUEST_CODE_FLEXI_CASH_LOAN = 1002;

    @NotNull
    public static final String SHEET_TAG = "TransferByLoanSheet";

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.interfaces.ITransferByLoanService$a, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int REQUEST_CODE_FLEXI_CASH_LOAN = 1002;

        @NotNull
        public static final String SHEET_TAG = "TransferByLoanSheet";

        private Companion() {
        }
    }

    boolean isTrialOpen();

    void launch(@NotNull E activity, @NotNull TransferByLoanOpenParams params);
}
