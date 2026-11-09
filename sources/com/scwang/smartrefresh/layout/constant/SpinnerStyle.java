package com.scwang.smartrefresh.layout.constant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SpinnerStyle {
    public static final SpinnerStyle FixedBehind;
    public static final SpinnerStyle FixedFront;
    public static final SpinnerStyle MatchLayout;
    public static final SpinnerStyle Scale;
    public static final SpinnerStyle Translate;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SpinnerStyle[] f25107a;

    static {
        SpinnerStyle spinnerStyle = new SpinnerStyle("Translate", 0);
        Translate = spinnerStyle;
        SpinnerStyle spinnerStyle2 = new SpinnerStyle("Scale", 1);
        Scale = spinnerStyle2;
        SpinnerStyle spinnerStyle3 = new SpinnerStyle("FixedBehind", 2);
        FixedBehind = spinnerStyle3;
        SpinnerStyle spinnerStyle4 = new SpinnerStyle("FixedFront", 3);
        FixedFront = spinnerStyle4;
        SpinnerStyle spinnerStyle5 = new SpinnerStyle("MatchLayout", 4);
        MatchLayout = spinnerStyle5;
        f25107a = new SpinnerStyle[]{spinnerStyle, spinnerStyle2, spinnerStyle3, spinnerStyle4, spinnerStyle5};
    }

    public static SpinnerStyle valueOf(String str) {
        return (SpinnerStyle) Enum.valueOf(SpinnerStyle.class, str);
    }

    public static SpinnerStyle[] values() {
        return (SpinnerStyle[]) f25107a.clone();
    }
}
