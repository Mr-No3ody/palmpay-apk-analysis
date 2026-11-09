package com.microsoft.codepush.react;

/* JADX INFO: loaded from: classes3.dex */
public enum CodePushUpdateState {
    RUNNING(0),
    PENDING(1),
    LATEST(2);

    private final int value;

    CodePushUpdateState(int i7) {
        this.value = i7;
    }

    public int getValue() {
        return this.value;
    }
}
