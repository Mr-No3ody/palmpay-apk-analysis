package com.transsnet.palmpay.custom_view.utils;

import C0.G;
import F6.d;
import G7.c;
import G7.g;
import G7.q;
import L6.b;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.ColorRes;
import androidx.camera.video.u;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.custom_view.input.MaxLengthFilter;
import com.transsnet.palmpay.util.ScreenUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p267r9.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000e\u001aá\u0001\u0010\u001f\u001a\u00020\u001e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010$\u001a\u00020#*\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b$\u0010%\u001aM\u0010.\u001a\u00020#*\u00020!2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00060*j\b\u0012\u0004\u0012\u00020\u0006`+2\b\b\u0002\u0010-\u001a\u00020\b¢\u0006\u0004\b.\u0010/\u001a\u001b\u00102\u001a\u00020\u0006*\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103\u001a\u001b\u00104\u001a\u00020\u0001*\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b4\u00105\u001a\u0011\u00106\u001a\u00020\b*\u00020\u0001¢\u0006\u0004\b6\u00107\u001a%\u00109\u001a\u00020\u0006*\u00020\u00012\b\u00101\u001a\u0004\u0018\u0001002\b\b\u0001\u00108\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:\u001a#\u00109\u001a\u00020\u0006*\u00020\u00012\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00108\u001a\u00020\u0001¢\u0006\u0004\b9\u0010;\u001a\u0011\u0010=\u001a\u00020\u0001*\u00020<¢\u0006\u0004\b=\u0010>\u001a\u0011\u0010?\u001a\u00020\u0001*\u00020\u0006¢\u0006\u0004\b?\u0010@\u001a\u0011\u0010A\u001a\u00020\u0001*\u00020\u0006¢\u0006\u0004\bA\u0010@\u001a\u0011\u0010B\u001a\u00020\u0001*\u00020<¢\u0006\u0004\bB\u0010>\u001a\u0011\u0010C\u001a\u00020\u0006*\u00020<¢\u0006\u0004\bC\u0010D\u001a\u0011\u0010E\u001a\u00020\u0006*\u00020<¢\u0006\u0004\bE\u0010D\"\u0015\u0010H\u001a\u00020\u0006*\u00020\n8F¢\u0006\u0006\u001a\u0004\bF\u0010G\"\u0015\u0010H\u001a\u00020\u0006*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bF\u0010I¨\u0006J"}, d2 = {"Landroid/view/View;", "", "desc", "Landroidx/lifecycle/LifecycleOwner;", "lifecycle", "anchorView", "", "gravity", "", "isWidthPercent", "", "widthRatio", "width", "height", "textColor", "textSize", "LG7/c;", "arrowPositionRules", "arrowSize", "arrowOffset", "textGravity", "isVisibleArrow", "Landroid/graphics/drawable/Drawable;", "arrowDrawable", ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, "cornerRadius", ViewProps.BACKGROUND_COLOR, "LG7/q;", "balloonAnimation", "Lcom/skydoves/balloon/Balloon;", "showBalloon", "(Landroid/view/View;Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroid/view/View;IZFIIIFLG7/c;IIIZLandroid/graphics/drawable/Drawable;IIFILG7/q;)Lcom/skydoves/balloon/Balloon;", "Landroid/widget/EditText;", ReactTextInputShadowNode.PROP_TEXT, "", "setTextAndSelection", "(Landroid/widget/EditText;Ljava/lang/String;)V", "", "s", ViewProps.START, "before", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "splitCounts", "autoMaxLength", "dealInputAccountWithSpace", "(Landroid/widget/EditText;Ljava/lang/CharSequence;IILjava/util/ArrayList;Z)V", "Landroid/content/Context;", "context", "colorInt", "(ILandroid/content/Context;)I", "string", "(ILandroid/content/Context;)Ljava/lang/String;", "isValidHexColor", "(Ljava/lang/String;)Z", "defaultColor", "hexToColorInt", "(Ljava/lang/String;Landroid/content/Context;I)I", "(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)I", "", "toDayOfMonth", "(J)Ljava/lang/String;", "toDayOfMonthByIndex", "(I)Ljava/lang/String;", "toDayOfWeekByIndex", "toDayOfWeek", "getDayIndexOfWeek", "(J)I", "getDayIndexOfMonth", "getDp", "(F)I", "dp", "(I)I", "lib_views_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonViewExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonViewExt.kt\ncom/transsnet/palmpay/custom_view/utils/CommonViewExtKt\n+ 2 Balloon.kt\ncom/skydoves/balloon/BalloonKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,329:1\n139#2:330\n13472#3,2:331\n1869#4,2:333\n1878#4,3:335\n1878#4,3:338\n*S KotlinDebug\n*F\n+ 1 CommonViewExt.kt\ncom/transsnet/palmpay/custom_view/utils/CommonViewExtKt\n*L\n80#1:330\n153#1:331,2\n159#1:333,2\n171#1:335,3\n187#1:338,3\n*E\n"})
public final class CommonViewExtKt {
    public static final int colorInt(int i7, @Nullable Context context) {
        if (context == null) {
            context = (Context) a.f41645a.f4463a;
        }
        return context.getColor(i7);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x013e  */
    public static final void dealInputAccountWithSpace(@NotNull EditText editText, @Nullable CharSequence charSequence, int i7, int i10, @NotNull ArrayList<Integer> splitCounts, boolean z3) {
        int i11;
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(splitCounts, "splitCounts");
        if (charSequence == null) {
            return;
        }
        int i12 = 1;
        if (z3) {
            InputFilter[] filters = editText.getFilters();
            Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
            int maxLength = 0;
            for (InputFilter inputFilter : filters) {
                if (inputFilter instanceof MaxLengthFilter) {
                    maxLength = ((MaxLengthFilter) inputFilter).getMaxLength();
                }
            }
            int size = splitCounts.size() - 1;
            Iterator<T> it = splitCounts.iterator();
            while (it.hasNext()) {
                size += ((Number) it.next()).intValue();
            }
            if (size > 0 && size != maxLength) {
                editText.setFilters(new MaxLengthFilter[]{new MaxLengthFilter(size)});
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int length = charSequence.length();
        int i13 = 0;
        while (i13 < length) {
            int i14 = charSequence.charAt(i13) == ' ' ? i12 : 0;
            int i15 = 0;
            int i16 = 0;
            for (Object obj : splitCounts) {
                int i17 = i15 + 1;
                if (i15 < 0) {
                    C1850q.k();
                    throw null;
                }
                int iIntValue = ((Number) obj).intValue();
                if (i15 != splitCounts.size() - 1) {
                    if (i15 != 0) {
                        iIntValue++;
                    }
                    i16 += iIntValue;
                    i14 = (i14 == 0 || i13 == i16) ? 0 : i12;
                }
                i15 = i17;
            }
            if (i14 != 0) {
                i11 = i12;
            } else {
                sb2.append(charSequence.charAt(i13));
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                for (Object obj2 : splitCounts) {
                    int i21 = i19 + 1;
                    if (i19 < 0) {
                        C1850q.k();
                        throw null;
                    }
                    int iIntValue2 = ((Number) obj2).intValue();
                    int i22 = i12;
                    if (i19 != splitCounts.size() - 1) {
                        i20 += iIntValue2 + 1;
                        i18 = (i18 != 0 || sb2.length() == i20) ? i22 : 0;
                    }
                    i19 = i21;
                    i12 = i22;
                }
                i11 = i12;
                if (i18 != 0 && sb2.charAt(sb2.length() - 1) != ' ') {
                    sb2.insert(sb2.length() - 1, ' ');
                }
            }
            i13++;
            i12 = i11;
        }
        int i23 = i12;
        if (Intrinsics.c(sb2.toString(), charSequence.toString())) {
            return;
        }
        int i24 = i7 + 1;
        try {
            if (sb2.charAt(i7) == ' ') {
                if (i10 == 0) {
                    i24 = i7 + 2;
                } else {
                    i24 = i7;
                }
            } else if (i10 == i23) {
                i24 = i7;
            }
            editText.setText(sb2.toString());
            editText.setSelection(i24);
        } catch (Exception e10) {
            d.c("dealInputAccountWithSpace", "onTextChanged: ", e10);
        }
    }

    public static /* synthetic */ void dealInputAccountWithSpace$default(EditText editText, CharSequence charSequence, int i7, int i10, ArrayList arrayList, boolean z3, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z3 = true;
        }
        dealInputAccountWithSpace(editText, charSequence, i7, i10, arrayList, z3);
    }

    public static final int getDayIndexOfMonth(long j6) {
        Date date = new Date(j6);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5);
    }

    public static final int getDayIndexOfWeek(long j6) {
        Date date = new Date(j6);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i7 = calendar.get(7) - 1;
        if (i7 == 0) {
            return 7;
        }
        return i7;
    }

    public static final int getDp(float f10) {
        return ScreenUtils.dip2px(f10);
    }

    public static final int hexToColorInt(@NotNull String str, @Nullable Context context, @ColorRes int i7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return isValidHexColor(str) ? Color.parseColor(str) : colorInt(i7, context);
        } catch (Exception unused) {
            return colorInt(b.ppColorTextNormal, context);
        }
    }

    public static final boolean isValidHexColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$").b(str);
    }

    public static final void setTextAndSelection(@NotNull EditText editText, @Nullable String str) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.setText(str);
        Editable text = editText.getText();
        editText.setSelection(text != null ? text.length() : 0);
    }

    @NotNull
    public static final Balloon showBalloon(@NotNull View view, @NotNull String value, @NotNull LifecycleOwner lifecycle, @NotNull View anchorView, int i7, boolean z3, float f10, int i10, int i11, int i12, float f11, @NotNull c arrowPositionRules, int i13, int i14, int i15, boolean z8, @Nullable Drawable drawable, int i16, int i17, float f12, int i18, @NotNull q balloonAnimation) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(value, "desc");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(arrowPositionRules, "arrowPositionRules");
        Intrinsics.checkNotNullParameter(balloonAnimation, "balloonAnimation");
        Context context = anchorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        g gVar = new g(context);
        if (z3) {
            gVar.f3092d = f10;
        } else {
            if (i10 <= 0 && i10 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The width of the balloon must bigger than zero.");
            }
            gVar.f3090b = G.b(1, i10);
        }
        if (i11 <= 0 && i11 != Integer.MIN_VALUE) {
            throw new IllegalArgumentException("The height of the balloon must bigger than zero.");
        }
        gVar.f3093e = G.b(1, i11);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        gVar.f3109v = value;
        Intrinsics.checkNotNullParameter(context, "<this>");
        gVar.f3110w = context.getColor(i12);
        gVar.f3111x = f11;
        gVar.c(arrowPositionRules);
        gVar.d(i13);
        gVar.e(i14);
        gVar.f3112y = i15;
        gVar.f3099k = z8;
        gVar.f3105q = drawable == null ? null : drawable.mutate();
        if (drawable != null && gVar.f3101m == Integer.MIN_VALUE) {
            gVar.f3101m = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        float f13 = i16;
        gVar.f3095g = G.b(1, f13);
        gVar.f3097i = G.b(1, f13);
        float f14 = i17;
        gVar.f3094f = G.b(1, f14);
        gVar.f3096h = G.b(1, f14);
        gVar.g(f12);
        Intrinsics.checkNotNullParameter(context, "<this>");
        gVar.t = context.getColor(i18);
        gVar.f(balloonAnimation);
        gVar.f3076O = lifecycle;
        gVar.a();
        Balloon balloonA = gVar.a();
        if (i7 == 80) {
            p002a.a.B(anchorView, balloonA);
            return balloonA;
        }
        p002a.a.C(anchorView, balloonA);
        return balloonA;
    }

    @NotNull
    public static final String string(int i7, @Nullable Context context) {
        String string;
        return (context == null || (string = context.getString(i7)) == null) ? "" : string;
    }

    @NotNull
    public static final String toDayOfMonth(long j6) {
        String str = new SimpleDateFormat("d", Locale.ENGLISH).format(new Date(j6));
        Intrinsics.e(str);
        int i7 = Integer.parseInt(str);
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 31) {
                        switch (i7) {
                            case 21:
                                break;
                            case 22:
                                break;
                            case 23:
                                break;
                            default:
                                return str.concat("th");
                        }
                    }
                }
                return str.concat("rd");
            }
            return str.concat("nd");
        }
        return str.concat("st");
    }

    @NotNull
    public static final String toDayOfMonthByIndex(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 31) {
                        switch (i7) {
                            case 21:
                                break;
                            case 22:
                                break;
                            case 23:
                                break;
                            default:
                                return u.g(i7, "th");
                        }
                    }
                }
                return u.g(i7, "rd");
            }
            return u.g(i7, "nd");
        }
        return u.g(i7, "st");
    }

    @NotNull
    public static final String toDayOfWeek(long j6) {
        String str = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(new Date(j6));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String toDayOfWeekByIndex(int i7) {
        return (1 > i7 || i7 >= 8) ? "" : (String) C1850q.h("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday").get(i7 - 1);
    }

    public static final int getDp(int i7) {
        return ScreenUtils.dip2px(i7);
    }

    public static final int hexToColorInt(@NotNull String str, @Nullable Context context, @NotNull String defaultColor) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(defaultColor, "defaultColor");
        try {
            if (isValidHexColor(str)) {
                return Color.parseColor(str);
            }
            return Color.parseColor(defaultColor);
        } catch (Exception unused) {
            return Color.parseColor("#6F7B85");
        }
    }
}
