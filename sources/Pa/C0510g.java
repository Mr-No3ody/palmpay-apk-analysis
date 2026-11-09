package Pa;

import android.R;
import android.annotation.SuppressLint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pa.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0510g {
    public /* synthetic */ C0510g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @SuppressLint({"ResourceAsColor"})
    public final void highlightText(@NotNull TextView textView, @NotNull String content, @Nullable List<String> list, int i7) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(content, "content");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(content);
        if (list != null) {
            for (String str : list) {
                int iE = StringsKt.E(content, str, 0, false, 6);
                while (iE != -1) {
                    int length = str.length() + iE;
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i7), iE, length, 33);
                    iE = StringsKt.E(content, str, length, false, 4);
                }
            }
        }
        textView.setText(spannableStringBuilder);
    }

    public final void richText(@NotNull TextView tv, @NotNull String str, @Nullable String str2, @ColorInt int i7) {
        Intrinsics.checkNotNullParameter(tv, "tv");
        Intrinsics.checkNotNullParameter(str, "str");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (TextUtils.isEmpty(str2)) {
            tv.setText(str);
            return;
        }
        Matcher matcher = Pattern.compile(str2, 2).matcher(str);
        Intrinsics.e(str2);
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{str2}, false, 0, 6, null);
        int i10 = 0;
        int length = listSplit$default.toArray(new String[0]).length - 1;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            tv.setHighlightColor(tv.getResources().getColor(R.color.transparent));
            if (i10 < length) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i7), iStart, iEnd, 33);
            }
            i10++;
        }
        tv.setText(spannableStringBuilder);
        tv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private C0510g() {
    }

    public final void richText(@Nullable TextView textView, @Nullable String str, @Nullable String str2, @Nullable CharacterStyle characterStyle) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str == null ? "" : str);
        if (TextUtils.isEmpty(str2)) {
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        Pattern patternCompile = Pattern.compile(str2, 2);
        if (str == null) {
            str = "";
        }
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (textView != null) {
                textView.setHighlightColor(CommonViewExtKt.colorInt(R.color.transparent, textView.getContext()));
            }
            spannableStringBuilder.setSpan(characterStyle, iStart, iEnd, 33);
        }
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        }
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void richText(@NotNull TextView tv, @Nullable String str, @NotNull List<String> regExpList, @NotNull CharacterStyle... spans) {
        Intrinsics.checkNotNullParameter(tv, "tv");
        Intrinsics.checkNotNullParameter(regExpList, "regExpList");
        Intrinsics.checkNotNullParameter(spans, "spans");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int size = regExpList.size();
        for (int i7 = 0; i7 < size; i7++) {
            String str2 = regExpList.get(i7);
            if (!TextUtils.isEmpty(str2)) {
                Matcher matcher = Pattern.compile(str2, 2).matcher(str);
                int i10 = 0;
                while (matcher.find()) {
                    int iStart = matcher.start();
                    int iEnd = matcher.end();
                    tv.setHighlightColor(tv.getResources().getColor(R.color.transparent));
                    if (i10 < spans.length) {
                        spannableStringBuilder.setSpan(spans[i10], iStart, iEnd, 33);
                    }
                    i10++;
                }
            }
        }
        tv.setMovementMethod(LinkMovementMethod.getInstance());
        tv.setText(spannableStringBuilder);
    }
}
