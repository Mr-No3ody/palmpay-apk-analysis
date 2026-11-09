package com.transsnet.palmpay.managemoney.bean;

import Jc.a;
import Jc.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PlanStatus;", "", "<init>", "()V", "getPlanStatusText", "", "getPlanStatusColor", "Active", "Withheld", "Paid", "Processing", "Break", "Lcom/transsnet/palmpay/managemoney/bean/PlanStatus$Active;", "Lcom/transsnet/palmpay/managemoney/bean/PlanStatus$Break;", "Lcom/transsnet/palmpay/managemoney/bean/PlanStatus$Paid;", "Lcom/transsnet/palmpay/managemoney/bean/PlanStatus$Processing;", "Lcom/transsnet/palmpay/managemoney/bean/PlanStatus$Withheld;", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class PlanStatus {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PlanStatus$Active;", "Lcom/transsnet/palmpay/managemoney/bean/PlanStatus;", "<init>", "()V", "getPlanStatusText", "", "getPlanStatusColor", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Active extends PlanStatus {
        public Active() {
            super(null);
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PlanStatus
        public int getPlanStatusColor() {
            return a.mm_color_6306b2;
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PlanStatus
        public int getPlanStatusText() {
            return f.mm_plan_status_investing;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PlanStatus$Break;", "Lcom/transsnet/palmpay/managemoney/bean/PlanStatus;", "<init>", "()V", "getPlanStatusText", "", "getPlanStatusColor", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Break extends PlanStatus {
        public Break() {
            super(null);
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PlanStatus
        public int getPlanStatusColor() {
            return a.mm_color_ffaa0c;
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PlanStatus
        public int getPlanStatusText() {
            return f.mm_plan_status_break;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PlanStatus$Paid;", "Lcom/transsnet/palmpay/managemoney/bean/PlanStatus;", "<init>", "()V", "getPlanStatusText", "", "getPlanStatusColor", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Paid extends PlanStatus {
        public Paid() {
            super(null);
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PlanStatus
        public int getPlanStatusColor() {
            return a.mm_color_38d79f;
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PlanStatus
        public int getPlanStatusText() {
            return f.mm_plan_status_paid;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PlanStatus$Processing;", "Lcom/transsnet/palmpay/managemoney/bean/PlanStatus;", "<init>", "()V", "getPlanStatusText", "", "getPlanStatusColor", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Processing extends PlanStatus {
        public Processing() {
            super(null);
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PlanStatus
        public int getPlanStatusColor() {
            return a.mm_color_ffaa0c;
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PlanStatus
        public int getPlanStatusText() {
            return f.mm_plan_status_processing;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PlanStatus$Withheld;", "Lcom/transsnet/palmpay/managemoney/bean/PlanStatus;", "<init>", "()V", "getPlanStatusText", "", "getPlanStatusColor", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Withheld extends PlanStatus {
        public Withheld() {
            super(null);
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PlanStatus
        public int getPlanStatusColor() {
            return a.mm_color_fe5455;
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PlanStatus
        public int getPlanStatusText() {
            return f.mm_plan_status_hold;
        }
    }

    public /* synthetic */ PlanStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getPlanStatusColor();

    public abstract int getPlanStatusText();

    private PlanStatus() {
    }
}
