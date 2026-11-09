package com.palmpay.lib.ui.picker.picker;

import Ba.a;
import L6.b;
import L6.c;
import N8.C0463g;
import X6.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.palmpay.lib.ui.picker.picker.PickerView;
import com.palmpay.lib.ui.picker.wheel.listener.OnItemSelectedListener;
import com.palmpay.lib.ui.picker.wheel.view.WheelView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p183m6.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\fJ-\u0010\u001f\u001a\u00020\n2\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u001d¢\u0006\u0004\b\u001f\u0010 J3\u0010\u001f\u001a\u00020\n2$\u0010\"\u001a \u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0!¢\u0006\u0004\b\u001f\u0010#R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010/\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R0\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020201\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R6\u0010A\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020201\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R<\u0010I\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020201\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/palmpay/lib/ui/picker/picker/PickerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "cyclic", "", "setCyclic", "(Z)V", "", "textColorCenter", "setTextColorCenter", "(I)V", "textColorOut", "setTextColorOut", "size", "setTextSize", "", "lineSpacingMultiplier", "setLineSpacingMultiplier", "(F)V", "visibleCount", "setItemsVisibleCount", "alphaGradient", "setAlphaGradient", "Lkotlin/Function3;", "onItemSelectedListener", "setOnItemSelectedListener", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/Function4;", "onTypeItemSelectedListener", "(Lkotlin/jvm/functions/Function4;)V", "Lcom/palmpay/lib/ui/picker/wheel/view/WheelView;", "a", "Lcom/palmpay/lib/ui/picker/wheel/view/WheelView;", "getOneWheelView", "()Lcom/palmpay/lib/ui/picker/wheel/view/WheelView;", "oneWheelView", "b", "getTowWheelView", "towWheelView", "c", "getThreeWheelView", "threeWheelView", "Lkotlin/Function0;", "", "", "d", "Lkotlin/jvm/functions/Function0;", "getGetOneData", "()Lkotlin/jvm/functions/Function0;", "setGetOneData", "(Lkotlin/jvm/functions/Function0;)V", "getOneData", "Lkotlin/Function1;", "e", "Lkotlin/jvm/functions/Function1;", "getGetTowData", "()Lkotlin/jvm/functions/Function1;", "setGetTowData", "(Lkotlin/jvm/functions/Function1;)V", "getTowData", "Lkotlin/Function2;", "f", "Lkotlin/jvm/functions/Function2;", "getGetThreeData", "()Lkotlin/jvm/functions/Function2;", "setGetThreeData", "(Lkotlin/jvm/functions/Function2;)V", "getThreeData", "lib_ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class PickerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final WheelView oneWheelView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final WheelView towWheelView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final WheelView threeWheelView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Function0 getOneData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Function1 getTowData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Function2 getThreeData;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24492g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24494j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function3 f24495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function4 f24496p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PickerView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void d(PickerView pickerView, Function0 function0, C0463g c0463g, a aVar, int i7) {
        if ((i7 & 2) != 0) {
            c0463g = null;
        }
        if ((i7 & 4) != 0) {
            aVar = null;
        }
        pickerView.c(function0, c0463g, aVar, Boolean.FALSE);
    }

    public static /* synthetic */ void f(PickerView pickerView, Function0 function0, h hVar, int i7) {
        if ((i7 & 2) != 0) {
            hVar = null;
        }
        pickerView.e(function0, hVar, null);
    }

    public final void a() {
        Function0 function0 = this.getOneData;
        WheelView wheelView = this.oneWheelView;
        if (function0 != null) {
            Intrinsics.e(function0);
            wheelView.setAdapter(new j((List) function0.invoke()));
        }
        Function1 function1 = this.getTowData;
        WheelView wheelView2 = this.towWheelView;
        if (function1 != null) {
            Intrinsics.e(function1);
            wheelView2.setAdapter(new j((List) function1.invoke(Integer.valueOf(wheelView.getCurrentItem()))));
        }
        Function2 function2 = this.getThreeData;
        if (function2 != null) {
            Intrinsics.e(function2);
            this.threeWheelView.setAdapter(new j((List) function2.invoke(Integer.valueOf(wheelView.getCurrentItem()), Integer.valueOf(wheelView2.getCurrentItem()))));
        }
    }

    public final void b(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            WheelView wheelView = this.oneWheelView;
            wheelView.setCurrentItem(iIntValue);
            wheelView.d();
        }
    }

    public void c(Function0 function0, Function1 function1, Function2 function2, Boolean bool) {
        this.getOneData = function0;
        this.getTowData = function1;
        this.getThreeData = function2;
        WheelView wheelView = this.oneWheelView;
        if (indexOfChild(wheelView) == -1) {
            addView(wheelView);
        }
        WheelView wheelView2 = this.threeWheelView;
        if (function2 == null) {
            if (indexOfChild(wheelView2) != -1) {
                removeView(wheelView2);
            }
        } else if (indexOfChild(wheelView2) == -1) {
            addView(wheelView2);
        }
        WheelView wheelView3 = this.towWheelView;
        if (function1 == null) {
            if (indexOfChild(wheelView3) != -1) {
                removeView(wheelView3);
            }
        } else if (indexOfChild(wheelView3) == -1) {
            addView(wheelView3);
        }
        a();
    }

    public final void e(Function0 function0, Function1 function1, a aVar) {
        this.getOneData = function0;
        this.getTowData = function1;
        this.getThreeData = aVar;
        WheelView wheelView = this.oneWheelView;
        if (indexOfChild(wheelView) == -1) {
            addView(wheelView);
        }
        WheelView wheelView2 = this.towWheelView;
        if (function1 == null) {
            if (indexOfChild(wheelView2) != -1) {
                removeView(wheelView2);
            }
        } else if (indexOfChild(wheelView2) == -1) {
            addView(wheelView2);
        }
        WheelView wheelView3 = this.threeWheelView;
        if (aVar == null) {
            if (indexOfChild(wheelView3) != -1) {
                removeView(wheelView3);
            }
        } else if (indexOfChild(wheelView3) == -1) {
            addView(wheelView3);
        }
        a();
    }

    @Nullable
    public final Function0<List<Object>> getGetOneData() {
        return this.getOneData;
    }

    @Nullable
    public final Function2<Integer, Integer, List<Object>> getGetThreeData() {
        return this.getThreeData;
    }

    @Nullable
    public final Function1<Integer, List<Object>> getGetTowData() {
        return this.getTowData;
    }

    @NotNull
    public final WheelView getOneWheelView() {
        return this.oneWheelView;
    }

    @NotNull
    public final WheelView getThreeWheelView() {
        return this.threeWheelView;
    }

    @NotNull
    public final WheelView getTowWheelView() {
        return this.towWheelView;
    }

    public final void setAlphaGradient(boolean alphaGradient) {
        this.oneWheelView.setAlphaGradient(alphaGradient);
        this.towWheelView.setAlphaGradient(alphaGradient);
        this.threeWheelView.setAlphaGradient(alphaGradient);
    }

    public final void setCyclic(boolean cyclic) {
        this.oneWheelView.setCyclic(cyclic);
        this.towWheelView.setCyclic(cyclic);
        this.threeWheelView.setCyclic(cyclic);
    }

    public final void setGetOneData(@Nullable Function0<? extends List<? extends Object>> function0) {
        this.getOneData = function0;
    }

    public final void setGetThreeData(@Nullable Function2<? super Integer, ? super Integer, ? extends List<? extends Object>> function2) {
        this.getThreeData = function2;
    }

    public final void setGetTowData(@Nullable Function1<? super Integer, ? extends List<? extends Object>> function1) {
        this.getTowData = function1;
    }

    public final void setItemsVisibleCount(int visibleCount) {
        this.oneWheelView.setItemsVisibleCount(visibleCount);
        this.towWheelView.setItemsVisibleCount(visibleCount);
        this.threeWheelView.setItemsVisibleCount(visibleCount);
    }

    public final void setLineSpacingMultiplier(float lineSpacingMultiplier) {
        this.oneWheelView.setLineSpacingMultiplier(lineSpacingMultiplier);
        this.towWheelView.setLineSpacingMultiplier(lineSpacingMultiplier);
        this.threeWheelView.setLineSpacingMultiplier(lineSpacingMultiplier);
    }

    public final void setOnItemSelectedListener(@NotNull Function3<? super Integer, ? super Integer, ? super Integer, Unit> onItemSelectedListener) {
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "onItemSelectedListener");
        this.f24495o = onItemSelectedListener;
    }

    public final void setTextColorCenter(int textColorCenter) {
        this.oneWheelView.setTextColorCenter(textColorCenter);
        this.towWheelView.setTextColorCenter(textColorCenter);
        this.threeWheelView.setTextColorCenter(textColorCenter);
    }

    public final void setTextColorOut(int textColorOut) {
        this.oneWheelView.setTextColorOut(textColorOut);
        this.towWheelView.setTextColorOut(textColorOut);
        this.threeWheelView.setTextColorOut(textColorOut);
    }

    public final void setTextSize(int size) {
        this.oneWheelView.setTextSize(size);
        this.towWheelView.setTextSize(size);
        this.threeWheelView.setTextSize(size);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        WheelView wheelView = new WheelView(context);
        this.oneWheelView = wheelView;
        WheelView wheelView2 = new WheelView(context);
        this.towWheelView = wheelView2;
        WheelView wheelView3 = new WheelView(context);
        this.threeWheelView = wheelView3;
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, L6.j.PpPickerView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f24492g = typedArrayObtainStyledAttributes.getColor(L6.j.PpPickerView_PickerView_text_out_color, getContext().getColor(b.pp_time_item_out_color));
        this.f24493i = typedArrayObtainStyledAttributes.getColor(L6.j.PpPickerView_PickerView_text_color, getContext().getColor(b.pp_time_item_color));
        this.f24494j = typedArrayObtainStyledAttributes.getDimensionPixelSize(L6.j.PpPickerView_PickerView_text_size, getContext().getResources().getDimensionPixelSize(c.pp_pick_wheel_text_size));
        typedArrayObtainStyledAttributes.recycle();
        final int i7 = 2;
        wheelView.setOnItemSelectedListener(new OnItemSelectedListener(this) { // from class: X6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickerView f11009b;

            {
                this.f11009b = this;
            }

            @Override // com.palmpay.lib.ui.picker.wheel.listener.OnItemSelectedListener
            public final void onItemSelected(int i10) {
                switch (i7) {
                    case 0:
                        PickerView pickerView = this.f11009b;
                        Function4 function4 = pickerView.f24496p;
                        WheelView wheelView4 = pickerView.oneWheelView;
                        WheelView wheelView5 = pickerView.threeWheelView;
                        if (function4 != null) {
                            function4.invoke(2, Integer.valueOf(wheelView4.getCurrentItem()), Integer.valueOf(i10), Integer.valueOf(wheelView5.getCurrentItem()));
                        }
                        Function2 function2 = pickerView.getThreeData;
                        WheelView wheelView6 = pickerView.towWheelView;
                        if (function2 != null) {
                            wheelView5.setAdapter(new p183m6.j((List) function2.invoke(Integer.valueOf(wheelView4.getCurrentItem()), Integer.valueOf(wheelView6.getCurrentItem()))));
                            wheelView5.d();
                        }
                        Function3 function3 = pickerView.f24495o;
                        if (function3 != null) {
                            function3.invoke(Integer.valueOf(wheelView4.getCurrentItem()), Integer.valueOf(i10), Integer.valueOf(wheelView5.getCurrentItem()));
                        }
                        wheelView6.setCurrentItem(i10);
                        break;
                    case 1:
                        PickerView pickerView2 = this.f11009b;
                        Function4 function5 = pickerView2.f24496p;
                        WheelView wheelView7 = pickerView2.towWheelView;
                        WheelView wheelView8 = pickerView2.oneWheelView;
                        if (function5 != null) {
                            function5.invoke(3, Integer.valueOf(wheelView8.getCurrentItem()), Integer.valueOf(wheelView7.getCurrentItem()), Integer.valueOf(i10));
                        }
                        Function3 function6 = pickerView2.f24495o;
                        if (function6 != null) {
                            function6.invoke(Integer.valueOf(wheelView8.getCurrentItem()), Integer.valueOf(wheelView7.getCurrentItem()), Integer.valueOf(i10));
                        }
                        pickerView2.threeWheelView.setCurrentItem(i10);
                        break;
                    default:
                        PickerView pickerView3 = this.f11009b;
                        Function4 function7 = pickerView3.f24496p;
                        WheelView wheelView9 = pickerView3.threeWheelView;
                        WheelView wheelView10 = pickerView3.towWheelView;
                        if (function7 != null) {
                            function7.invoke(1, Integer.valueOf(i10), Integer.valueOf(wheelView10.getCurrentItem()), Integer.valueOf(wheelView9.getCurrentItem()));
                        }
                        Function1 function1 = pickerView3.getTowData;
                        if (function1 != null) {
                            wheelView10.setAdapter(new p183m6.j((List) function1.invoke(Integer.valueOf(pickerView3.oneWheelView.getCurrentItem()))));
                            wheelView10.d();
                        }
                        Function3 function8 = pickerView3.f24495o;
                        if (function8 != null) {
                            function8.invoke(Integer.valueOf(i10), Integer.valueOf(wheelView10.getCurrentItem()), Integer.valueOf(wheelView9.getCurrentItem()));
                        }
                        break;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        wheelView.setLayoutParams(layoutParams);
        final int i10 = 0;
        wheelView2.setOnItemSelectedListener(new OnItemSelectedListener(this) { // from class: X6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickerView f11009b;

            {
                this.f11009b = this;
            }

            @Override // com.palmpay.lib.ui.picker.wheel.listener.OnItemSelectedListener
            public final void onItemSelected(int i11) {
                switch (i10) {
                    case 0:
                        PickerView pickerView = this.f11009b;
                        Function4 function4 = pickerView.f24496p;
                        WheelView wheelView4 = pickerView.oneWheelView;
                        WheelView wheelView5 = pickerView.threeWheelView;
                        if (function4 != null) {
                            function4.invoke(2, Integer.valueOf(wheelView4.getCurrentItem()), Integer.valueOf(i11), Integer.valueOf(wheelView5.getCurrentItem()));
                        }
                        Function2 function2 = pickerView.getThreeData;
                        WheelView wheelView6 = pickerView.towWheelView;
                        if (function2 != null) {
                            wheelView5.setAdapter(new p183m6.j((List) function2.invoke(Integer.valueOf(wheelView4.getCurrentItem()), Integer.valueOf(wheelView6.getCurrentItem()))));
                            wheelView5.d();
                        }
                        Function3 function3 = pickerView.f24495o;
                        if (function3 != null) {
                            function3.invoke(Integer.valueOf(wheelView4.getCurrentItem()), Integer.valueOf(i11), Integer.valueOf(wheelView5.getCurrentItem()));
                        }
                        wheelView6.setCurrentItem(i11);
                        break;
                    case 1:
                        PickerView pickerView2 = this.f11009b;
                        Function4 function5 = pickerView2.f24496p;
                        WheelView wheelView7 = pickerView2.towWheelView;
                        WheelView wheelView8 = pickerView2.oneWheelView;
                        if (function5 != null) {
                            function5.invoke(3, Integer.valueOf(wheelView8.getCurrentItem()), Integer.valueOf(wheelView7.getCurrentItem()), Integer.valueOf(i11));
                        }
                        Function3 function6 = pickerView2.f24495o;
                        if (function6 != null) {
                            function6.invoke(Integer.valueOf(wheelView8.getCurrentItem()), Integer.valueOf(wheelView7.getCurrentItem()), Integer.valueOf(i11));
                        }
                        pickerView2.threeWheelView.setCurrentItem(i11);
                        break;
                    default:
                        PickerView pickerView3 = this.f11009b;
                        Function4 function7 = pickerView3.f24496p;
                        WheelView wheelView9 = pickerView3.threeWheelView;
                        WheelView wheelView10 = pickerView3.towWheelView;
                        if (function7 != null) {
                            function7.invoke(1, Integer.valueOf(i11), Integer.valueOf(wheelView10.getCurrentItem()), Integer.valueOf(wheelView9.getCurrentItem()));
                        }
                        Function1 function1 = pickerView3.getTowData;
                        if (function1 != null) {
                            wheelView10.setAdapter(new p183m6.j((List) function1.invoke(Integer.valueOf(pickerView3.oneWheelView.getCurrentItem()))));
                            wheelView10.d();
                        }
                        Function3 function8 = pickerView3.f24495o;
                        if (function8 != null) {
                            function8.invoke(Integer.valueOf(i11), Integer.valueOf(wheelView10.getCurrentItem()), Integer.valueOf(wheelView9.getCurrentItem()));
                        }
                        break;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        wheelView2.setLayoutParams(layoutParams2);
        final int i11 = 1;
        wheelView3.setOnItemSelectedListener(new OnItemSelectedListener(this) { // from class: X6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickerView f11009b;

            {
                this.f11009b = this;
            }

            @Override // com.palmpay.lib.ui.picker.wheel.listener.OnItemSelectedListener
            public final void onItemSelected(int i12) {
                switch (i11) {
                    case 0:
                        PickerView pickerView = this.f11009b;
                        Function4 function4 = pickerView.f24496p;
                        WheelView wheelView4 = pickerView.oneWheelView;
                        WheelView wheelView5 = pickerView.threeWheelView;
                        if (function4 != null) {
                            function4.invoke(2, Integer.valueOf(wheelView4.getCurrentItem()), Integer.valueOf(i12), Integer.valueOf(wheelView5.getCurrentItem()));
                        }
                        Function2 function2 = pickerView.getThreeData;
                        WheelView wheelView6 = pickerView.towWheelView;
                        if (function2 != null) {
                            wheelView5.setAdapter(new p183m6.j((List) function2.invoke(Integer.valueOf(wheelView4.getCurrentItem()), Integer.valueOf(wheelView6.getCurrentItem()))));
                            wheelView5.d();
                        }
                        Function3 function3 = pickerView.f24495o;
                        if (function3 != null) {
                            function3.invoke(Integer.valueOf(wheelView4.getCurrentItem()), Integer.valueOf(i12), Integer.valueOf(wheelView5.getCurrentItem()));
                        }
                        wheelView6.setCurrentItem(i12);
                        break;
                    case 1:
                        PickerView pickerView2 = this.f11009b;
                        Function4 function5 = pickerView2.f24496p;
                        WheelView wheelView7 = pickerView2.towWheelView;
                        WheelView wheelView8 = pickerView2.oneWheelView;
                        if (function5 != null) {
                            function5.invoke(3, Integer.valueOf(wheelView8.getCurrentItem()), Integer.valueOf(wheelView7.getCurrentItem()), Integer.valueOf(i12));
                        }
                        Function3 function6 = pickerView2.f24495o;
                        if (function6 != null) {
                            function6.invoke(Integer.valueOf(wheelView8.getCurrentItem()), Integer.valueOf(wheelView7.getCurrentItem()), Integer.valueOf(i12));
                        }
                        pickerView2.threeWheelView.setCurrentItem(i12);
                        break;
                    default:
                        PickerView pickerView3 = this.f11009b;
                        Function4 function7 = pickerView3.f24496p;
                        WheelView wheelView9 = pickerView3.threeWheelView;
                        WheelView wheelView10 = pickerView3.towWheelView;
                        if (function7 != null) {
                            function7.invoke(1, Integer.valueOf(i12), Integer.valueOf(wheelView10.getCurrentItem()), Integer.valueOf(wheelView9.getCurrentItem()));
                        }
                        Function1 function1 = pickerView3.getTowData;
                        if (function1 != null) {
                            wheelView10.setAdapter(new p183m6.j((List) function1.invoke(Integer.valueOf(pickerView3.oneWheelView.getCurrentItem()))));
                            wheelView10.d();
                        }
                        Function3 function8 = pickerView3.f24495o;
                        if (function8 != null) {
                            function8.invoke(Integer.valueOf(i12), Integer.valueOf(wheelView10.getCurrentItem()), Integer.valueOf(wheelView9.getCurrentItem()));
                        }
                        break;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.weight = 1.0f;
        wheelView3.setLayoutParams(layoutParams3);
        setCyclic(false);
        setTextColorCenter(this.f24493i);
        setTextColorOut(this.f24492g);
        setTextSize(this.f24494j);
        setLineSpacingMultiplier(2.4f);
        setItemsVisibleCount(5);
        setAlphaGradient(true);
    }

    public final void setOnItemSelectedListener(@NotNull Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> onTypeItemSelectedListener) {
        Intrinsics.checkNotNullParameter(onTypeItemSelectedListener, "onTypeItemSelectedListener");
        this.f24496p = onTypeItemSelectedListener;
    }
}
