package com.transsnet.palmpay.managemoney.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PlanStatusFactory;", "", "<init>", "()V", "Companion", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlanStatusFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PlanStatusFactory$Companion;", "", "<init>", "()V", "produce", "Lcom/transsnet/palmpay/managemoney/bean/PlanStatus;", "planStatus", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlanStatus produce(int planStatus) {
            if (planStatus == 1) {
                return new PlanStatus.Processing();
            }
            if (planStatus == 2) {
                return new PlanStatus.Active();
            }
            if (planStatus == 3) {
                return new PlanStatus.Withheld();
            }
            if (planStatus != 4) {
                return planStatus != 5 ? new PlanStatus.Processing() : new PlanStatus.Break();
            }
            return new PlanStatus.Paid();
        }

        private Companion() {
        }
    }
}
