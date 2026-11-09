package com.scwang.smartrefresh.layout.constant;

/* JADX INFO: loaded from: classes3.dex */
public enum DimensionStatus {
    DefaultUnNotify(false),
    Default(true),
    XmlWrapUnNotify(false),
    XmlWrap(true),
    XmlExactUnNotify(false),
    XmlExact(true),
    XmlLayoutUnNotify(false),
    XmlLayout(true),
    CodeExactUnNotify(false),
    CodeExact(true),
    DeadLockUnNotify(false),
    DeadLock(true);

    public final boolean notified;

    DimensionStatus(boolean z3) {
        this.notified = z3;
    }

    public boolean canReplaceWith(DimensionStatus dimensionStatus) {
        if (ordinal() >= dimensionStatus.ordinal()) {
            return (!this.notified || CodeExact == this) && ordinal() == dimensionStatus.ordinal();
        }
        return true;
    }

    public boolean gteReplaceWith(DimensionStatus dimensionStatus) {
        return ordinal() >= dimensionStatus.ordinal();
    }

    public DimensionStatus notified() {
        return !this.notified ? values()[ordinal() + 1] : this;
    }

    public DimensionStatus unNotify() {
        if (!this.notified) {
            return this;
        }
        DimensionStatus dimensionStatus = values()[ordinal() - 1];
        return !dimensionStatus.notified ? dimensionStatus : DefaultUnNotify;
    }
}
