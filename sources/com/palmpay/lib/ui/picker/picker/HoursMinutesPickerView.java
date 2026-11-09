package com.palmpay.lib.ui.picker.picker;

import Ba.a;
import C0.G;
import N8.C0463g;
import X6.c;
import android.content.Context;
import android.util.AttributeSet;
import com.palmpay.lib.ui.picker.picker.model.TimePickerBean;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/palmpay/lib/ui/picker/picker/HoursMinutesPickerView;", "Lcom/palmpay/lib/ui/picker/picker/PickerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getHourList", "()I", "getMinuteList", "getAmPmList", "lib_ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HoursMinutesPickerView extends PickerView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f24480A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f24481B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f24482C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f24483H;
    public final Calendar t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f24484v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f24485w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoursMinutesPickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.t = Calendar.getInstance();
        this.f24484v = new ArrayList();
        this.f24485w = new ArrayList();
        this.f24480A = new ArrayList();
        g();
    }

    private final int getAmPmList() {
        ArrayList arrayList = this.f24480A;
        arrayList.clear();
        arrayList.add(new TimePickerBean("AM", 0));
        arrayList.add(new TimePickerBean("PM", 1));
        int i7 = this.t.get(9);
        this.f24483H = i7;
        return i7;
    }

    private final int getHourList() {
        ArrayList arrayList = this.f24484v;
        arrayList.clear();
        for (int i7 = 1; i7 < 13; i7++) {
            arrayList.add(new TimePickerBean(String.valueOf(i7), Integer.valueOf(i7)));
        }
        int i10 = this.t.get(10);
        this.f24481B = i10;
        return i10;
    }

    private final int getMinuteList() {
        ArrayList arrayList = this.f24485w;
        arrayList.clear();
        for (int i7 = 0; i7 < 60; i7++) {
            String strValueOf = String.valueOf(i7);
            if (i7 < 10) {
                strValueOf = G.m(i7, "0");
            }
            arrayList.add(new TimePickerBean(strValueOf, Integer.valueOf(i7)));
        }
        int i10 = this.t.get(12);
        this.f24482C = i10;
        return i10;
    }

    @Override // com.palmpay.lib.ui.picker.picker.PickerView
    public final void c(Function0 function0, Function1 function1, Function2 function2, Boolean bool) {
        setGetOneData(function0);
        setGetTowData(function1);
        setGetThreeData(function2);
        if (function2 == null) {
            if (indexOfChild(getThreeWheelView()) != -1) {
                removeView(getThreeWheelView());
            }
        } else if (indexOfChild(getThreeWheelView()) == -1) {
            addView(getThreeWheelView());
        }
        if (function1 == null) {
            if (indexOfChild(getTowWheelView()) != -1) {
                removeView(getTowWheelView());
            }
        } else if (indexOfChild(getTowWheelView()) == -1) {
            addView(getTowWheelView());
        }
        if (indexOfChild(getOneWheelView()) == -1) {
            addView(getOneWheelView());
        }
        a();
    }

    public final void g() {
        getHourList();
        getMinuteList();
        getAmPmList();
        PickerView.d(this, new c(this, 0), new C0463g(this, 23), new a(this, 19), 8);
        getThreeWheelView().setCurrentItem(this.f24481B);
        getTowWheelView().setCurrentItem(this.f24482C);
        getOneWheelView().setCurrentItem(this.f24483H);
        getOneWheelView().d();
    }
}
