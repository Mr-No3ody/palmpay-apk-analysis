package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f39031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f39033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public K f39034d;

    public o(Matcher matcher, String input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f39031a = matcher;
        this.f39032b = input;
        this.f39033c = new n(this);
    }

    @Override // kotlin.text.MatchResult
    public final l getDestructured() {
        Intrinsics.checkNotNullParameter(this, "match");
        return new l();
    }

    @Override // kotlin.text.MatchResult
    public final List getGroupValues() {
        if (this.f39034d == null) {
            this.f39034d = new K(this);
        }
        K k2 = this.f39034d;
        Intrinsics.e(k2);
        return k2;
    }

    @Override // kotlin.text.MatchResult
    public final MatchGroupCollection getGroups() {
        return this.f39033c;
    }

    @Override // kotlin.text.MatchResult
    public final IntRange getRange() {
        Matcher matcher = this.f39031a;
        return kotlin.ranges.b.f(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String strGroup = this.f39031a.group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public final MatchResult next() {
        Matcher matcher = this.f39031a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        String str = this.f39032b;
        if (iEnd > str.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(str);
        Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new o(matcher2, str);
        }
        return null;
    }
}
