package C0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f923b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(F f10, int i7) {
        super(0);
        this.f922a = i7;
        this.f923b = f10;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        switch (this.f922a) {
            case 0:
                Pair pair = (Pair) this.f923b.f937j.getValue();
                return (pair == null || (list = (List) pair.f38891a) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f923b.f928a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb2 = new StringBuilder();
                Intrinsics.e(fragment);
                F.a(fragment, arrayList, sb2);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "fragRegex.toString()");
                return new Pair(arrayList, string);
            case 2:
                String str2 = (String) this.f923b.f939l.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                Pair pair2 = (Pair) this.f923b.f937j.getValue();
                if (pair2 != null) {
                    return (String) pair2.f38892b;
                }
                return null;
            case 4:
                String str3 = this.f923b.f928a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                String str4 = this.f923b.f941n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            case 6:
                String str5 = this.f923b.f932e;
                if (str5 != null) {
                    return Pattern.compile(str5, 2);
                }
                return null;
            default:
                F f10 = this.f923b;
                f10.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) f10.f934g.getValue()).booleanValue()) {
                    String str6 = f10.f928a;
                    Uri uri = Uri.parse(str6);
                    for (String paramName : uri.getQueryParameterNames()) {
                        StringBuilder sb3 = new StringBuilder();
                        List<String> queryParams = uri.getQueryParameters(paramName);
                        if (queryParams.size() > 1) {
                            throw new IllegalArgumentException(G.q("Query parameter ", paramName, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
                        String queryParam = (String) CollectionsKt.firstOrNull(queryParams);
                        if (queryParam == null) {
                            f10.f936i = true;
                            queryParam = paramName;
                        }
                        Matcher matcher = F.f927r.matcher(queryParam);
                        C c6 = new C();
                        int iEnd = 0;
                        while (matcher.find()) {
                            String name = matcher.group(1);
                            Intrinsics.f(name, "null cannot be cast to non-null type kotlin.String");
                            Intrinsics.checkNotNullParameter(name, "name");
                            c6.f921b.add(name);
                            Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                            String strSubstring = queryParam.substring(iEnd, matcher.start());
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb3.append(Pattern.quote(strSubstring));
                            sb3.append("(.+?)?");
                            iEnd = matcher.end();
                        }
                        if (iEnd < queryParam.length()) {
                            Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                            String strSubstring2 = queryParam.substring(iEnd);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                            sb3.append(Pattern.quote(strSubstring2));
                        }
                        String string2 = sb3.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "argRegex.toString()");
                        c6.f920a = kotlin.text.y.k(string2, ".*", "\\E.*\\Q");
                        Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                        linkedHashMap.put(paramName, c6);
                    }
                }
                return linkedHashMap;
        }
    }
}
