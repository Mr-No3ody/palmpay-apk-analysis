package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22597b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f22596a = i7;
        this.f22597b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i7, boolean z3) {
        switch (this.f22596a) {
            case 0:
                ((TimePickerTextInputPresenter) this.f22597b).lambda$setupPeriodToggle$0(materialButtonToggleGroup, i7, z3);
                break;
            default:
                ((TimePickerView) this.f22597b).lambda$new$0(materialButtonToggleGroup, i7, z3);
                break;
        }
    }
}
