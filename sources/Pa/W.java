package Pa;

import java.util.Set;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f7052a = new V(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f7053b;

    static {
        String[] elements = {"FinanceEarnings", "CashboxPlusHome", "SafeBoxHome", "TargetSaving", "TrialCashHome", "InsuranceHome", "MutualFundHome", "PointHome", "PalmPrizeDetail", "FixedSavingsApplyAdvance", "FixedSavingsChooseBeforBreak", "EmailAlertSettings"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f7053b = C1847n.A(elements);
    }
}
