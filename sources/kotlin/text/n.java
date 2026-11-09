package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC1834a;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends AbstractC1834a implements MatchNamedGroupCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f39030a;

    public n(o oVar) {
        this.f39030a = oVar;
    }

    @Override // kotlin.collections.AbstractC1834a
    public final int a() {
        return this.f39030a.f39031a.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractC1834a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return super.contains((MatchGroup) obj);
        }
        return false;
    }

    @Override // kotlin.text.MatchGroupCollection
    public final MatchGroup get(int i7) {
        o oVar = this.f39030a;
        Matcher matcher = oVar.f39031a;
        IntRange intRangeF = kotlin.ranges.b.f(matcher.start(i7), matcher.end(i7));
        if (intRangeF.f38977a < 0) {
            return null;
        }
        String strGroup = oVar.f39031a.group(i7);
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRangeF);
    }

    @Override // kotlin.collections.AbstractC1834a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Sf.r(Sf.p.f(CollectionsKt.y(C1850q.f(this)), new Function1() { // from class: kotlin.text.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f39029a.get(((Integer) obj).intValue());
            }
        }));
    }

    @Override // kotlin.text.MatchNamedGroupCollection
    public final MatchGroup get(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Matcher matchResult = this.f39030a.f39031a;
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, "name");
        if (matchResult == null) {
            matchResult = null;
        }
        if (matchResult != null) {
            int iStart = matchResult.start(name);
            IntRange intRange = new IntRange(iStart, matchResult.end(name) - 1, 1);
            if (iStart < 0) {
                return null;
            }
            String strGroup = matchResult.group(name);
            Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
            return new MatchGroup(strGroup, intRange);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
