package com.transsnet.palmpay.custom_view.smarttablayout;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements SmartTabLayout.TabColorizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f31704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f31705b;

    @Override // com.transsnet.palmpay.custom_view.smarttablayout.SmartTabLayout.TabColorizer
    public final int getDividerColor(int i7) {
        int[] iArr = this.f31705b;
        return iArr[i7 % iArr.length];
    }

    @Override // com.transsnet.palmpay.custom_view.smarttablayout.SmartTabLayout.TabColorizer
    public final int getIndicatorColor(int i7) {
        int[] iArr = this.f31704a;
        return iArr[i7 % iArr.length];
    }
}
