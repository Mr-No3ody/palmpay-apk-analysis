package com.microsoft.codepush.react;

/* JADX INFO: loaded from: classes3.dex */
public enum CodePushInstallMode {
    IMMEDIATE(0),
    ON_NEXT_RESTART(1),
    ON_NEXT_RESUME(2),
    ON_NEXT_SUSPEND(3);

    private final int value;

    CodePushInstallMode(int i7) {
        this.value = i7;
    }

    public int getValue() {
        return this.value;
    }
}
