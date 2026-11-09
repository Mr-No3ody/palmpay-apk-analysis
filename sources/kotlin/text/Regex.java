package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "", "input", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "b", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,401:1\n22#2,3:402\n1#3:405\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n103#1:402,3\n*E\n"})
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f39001a;

    /* JADX INFO: renamed from: kotlin.text.Regex$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int ensureUnicodeCase(int i7) {
            return (i7 & 2) != 0 ? i7 | 64 : i7;
        }

        @NotNull
        public final String escape(@NotNull String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            String strQuote = Pattern.quote(literal);
            Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
            return strQuote;
        }

        @NotNull
        public final String escapeReplacement(@NotNull String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            String strQuoteReplacement = Matcher.quoteReplacement(literal);
            Intrinsics.checkNotNullExpressionValue(strQuoteReplacement, "quoteReplacement(...)");
            return strQuoteReplacement;
        }

        @NotNull
        public final Regex fromLiteral(@NotNull String pattern) {
            Intrinsics.checkNotNullParameter(pattern, "literal");
            q option = q.LITERAL;
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(option, "option");
            Pattern patternCompile = Pattern.compile(pattern, Regex.INSTANCE.ensureUnicodeCase(option.f39038a));
            Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }

        private Companion() {
        }
    }

    public Regex(Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f39001a = nativePattern;
    }

    public final o a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f39001a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new o(matcher, input);
        }
        return null;
    }

    public final boolean b(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f39001a.matcher(input).matches();
    }

    public final List c(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        int iEnd = 0;
        StringsKt__StringsKt.s(0);
        Matcher matcher = this.f39001a.matcher(input);
        if (!matcher.find()) {
            return C1849p.c(input.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String strReplaceAll = this.f39001a.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f39001a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
