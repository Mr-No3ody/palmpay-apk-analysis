package com.transsnet.palmpay.managemoney.bean;

import L6.b;
import com.transsnet.palmpay.custom_view.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PayStatus;", "", "<init>", "()V", "getStatusText", "", "getStatusColor", "getStatsDrawableRes", "Companion", "Success", "Processing", "Failed", "Lcom/transsnet/palmpay/managemoney/bean/PayStatus$Failed;", "Lcom/transsnet/palmpay/managemoney/bean/PayStatus$Processing;", "Lcom/transsnet/palmpay/managemoney/bean/PayStatus$Success;", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class PayStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PayStatus$Companion;", "", "<init>", "()V", "newInstance", "Lcom/transsnet/palmpay/managemoney/bean/PayStatus;", "payStatus", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PayStatus newInstance(int payStatus) {
            if (payStatus != 1) {
                return payStatus != 2 ? Processing.INSTANCE : Failed.INSTANCE;
            }
            return Success.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PayStatus$Failed;", "Lcom/transsnet/palmpay/managemoney/bean/PayStatus;", "<init>", "()V", "getStatusText", "", "getStatusColor", "getStatsDrawableRes", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Failed extends PayStatus {

        @NotNull
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PayStatus
        public int getStatsDrawableRes() {
            return r.cv_icon_failed_small;
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PayStatus
        public int getStatusColor() {
            return b.ppColorSuccess;
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PayStatus
        public int getStatusText() {
            return k.core_failed;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PayStatus$Processing;", "Lcom/transsnet/palmpay/managemoney/bean/PayStatus;", "<init>", "()V", "getStatusText", "", "getStatusColor", "getStatsDrawableRes", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Processing extends PayStatus {

        @NotNull
        public static final Processing INSTANCE = new Processing();

        private Processing() {
            super(null);
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PayStatus
        public int getStatsDrawableRes() {
            return r.cv_icon_processing_small;
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PayStatus
        public int getStatusColor() {
            return b.ppColorSuccess;
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PayStatus
        public int getStatusText() {
            return k.core_processing;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PayStatus$Success;", "Lcom/transsnet/palmpay/managemoney/bean/PayStatus;", "<init>", "()V", "getStatusText", "", "getStatusColor", "getStatsDrawableRes", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Success extends PayStatus {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PayStatus
        public int getStatsDrawableRes() {
            return r.cv_icon_success_small;
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PayStatus
        public int getStatusColor() {
            return b.ppColorSuccess;
        }

        @Override // com.transsnet.palmpay.managemoney.bean.PayStatus
        public int getStatusText() {
            return k.core_successful;
        }
    }

    public /* synthetic */ PayStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getStatsDrawableRes();

    public abstract int getStatusColor();

    public abstract int getStatusText();

    private PayStatus() {
    }
}
