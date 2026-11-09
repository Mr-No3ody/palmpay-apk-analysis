package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f23101id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int id2, java.lang.reflect.Field caseField, java.lang.reflect.Field valueField) {
        this.f23101id = id2;
        this.caseField = caseField;
        this.valueField = valueField;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f23101id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
