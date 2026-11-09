package com.transsnet.palmpay.custom_view.utils;

import Ad.C0058e;
import android.app.Activity;
import android.graphics.Rect;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.flexbox.FlexItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005\u001a \u0010\u0006\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\u0010\b\u001a\u00020\t\"\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0005*\u00020\u0005\u001a\n\u0010\u000b\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\f\u001a\u00020\u0002*\u00020\u0002\u001aP\u0010\r\u001a\u00020\u000e*\u00020\u000f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00112!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0011¨\u0006\u0017"}, d2 = {"toDrawableUri", "Landroid/net/Uri;", "", "formatHtmlText", "Landroid/text/Spanned;", "", "formatWithSeparator", "separator", "sections", "", "formatWithPhone", "invertColor", "darkColor", "softKeyBoardChangeListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/app/Activity;", "funShow", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "i", "", "funHide", "lib_views_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CommonExtKt {
    public static final int darkColor(int i7) {
        return ((int) (((i7 & 255) * 0.7f) + 0.5f)) | ((-16777216) & i7) | (((int) ((((i7 >> 16) & 255) * 0.7f) + 0.5f)) << 16) | (((int) ((((i7 >> 8) & 255) * 0.7f) + 0.5f)) << 8);
    }

    @NotNull
    public static final Spanned formatHtmlText(@Nullable String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    Spanned spannedFromHtml = Html.fromHtml(str, 63);
                    Intrinsics.e(spannedFromHtml);
                    return spannedFromHtml;
                }
            } catch (Exception unused) {
                return new SpannedString("");
            }
        }
        return new SpannedString("");
    }

    @NotNull
    public static final String formatWithPhone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return formatWithSeparator(str, " ", 3, 4, 4);
    }

    @NotNull
    public static final String formatWithSeparator(@NotNull String str, @NotNull String separator, @NotNull int... sections) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(sections, "sections");
        return C1847n.w(sections, separator, new C0058e(27, new D(), str), 30);
    }

    public static /* synthetic */ String formatWithSeparator$default(String str, String str2, int[] iArr, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str2 = " ";
        }
        return formatWithSeparator(str, str2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence formatWithSeparator$lambda$0(D d2, String str, int i7) {
        int i10 = d2.f38949a;
        int i11 = i7 + i10;
        if (i10 < 0 || i11 > str.length()) {
            return "";
        }
        String strSubstring = str.substring(d2.f38949a, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        d2.f38949a = i11;
        return strSubstring;
    }

    public static final int invertColor(int i7) {
        return ((i7 & FlexItem.MAX_SIZE) ^ FlexItem.MAX_SIZE) | ((-16777216) & i7);
    }

    @NotNull
    public static final ViewTreeObserver.OnGlobalLayoutListener softKeyBoardChangeListener(@NotNull Activity activity, @NotNull final Function1<? super Integer, Unit> funShow, @NotNull final Function1<? super Integer, Unit> funHide) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(funShow, "funShow");
        Intrinsics.checkNotNullParameter(funHide, "funHide");
        final D d2 = new D();
        final View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.transsnet.palmpay.custom_view.utils.CommonExtKt$softKeyBoardChangeListener$listener$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                int iHeight = rect.height();
                D d10 = d2;
                int i7 = d10.f38949a;
                if (i7 == 0) {
                    d10.f38949a = iHeight;
                    return;
                }
                if (i7 == iHeight) {
                    return;
                }
                if (i7 - iHeight > 200) {
                    funShow.invoke(Integer.valueOf(i7 - iHeight));
                    d2.f38949a = iHeight;
                } else if (iHeight - i7 > 200) {
                    funHide.invoke(Integer.valueOf(i7 - iHeight));
                    d2.f38949a = iHeight;
                }
            }
        };
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        return onGlobalLayoutListener;
    }

    @NotNull
    public static final Uri toDrawableUri(int i7) {
        Uri uri = Uri.parse("android.resource://com.transsnet.palmpay/" + i7);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        return uri;
    }
}
