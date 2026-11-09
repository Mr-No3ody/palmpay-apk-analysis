package com.transsnet.palmpay.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004J:\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042*\u0010\r\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000ej\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u000fJ2\u0010\u0010\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000ej\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u000f2\u0006\u0010\f\u001a\u00020\u0004J&\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0012j\b\u0012\u0004\u0012\u00020\u0004`\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/util/WebUtil;", "", "()V", "AND_MARK", "", "EQUAL_MARK", "QUESTION_MARK", "addParam", "url", "param", "paramValue", "addParams", "urlParam", "params", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getParamsMap", "parseUrlJson", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "keyPreloadH5List", "baseH5Url", "lib_util_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebUtil.kt\ncom/transsnet/palmpay/util/WebUtil\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,128:1\n107#2:129\n79#2,22:130\n107#2:156\n79#2,22:157\n107#2:183\n79#2,22:184\n107#2:206\n79#2,22:207\n1855#3,2:152\n1855#3,2:154\n37#4,2:179\n37#4,2:181\n*S KotlinDebug\n*F\n+ 1 WebUtil.kt\ncom/transsnet/palmpay/util/WebUtil\n*L\n34#1:129\n34#1:130,22\n76#1:156\n76#1:157,22\n96#1:183\n96#1:184,22\n99#1:206\n99#1:207,22\n45#1:152,2\n53#1:154,2\n89#1:179,2\n92#1:181,2\n*E\n"})
public final class WebUtil {

    @NotNull
    private static final String AND_MARK = "&";

    @NotNull
    private static final String EQUAL_MARK = "=";

    @NotNull
    public static final WebUtil INSTANCE = new WebUtil();

    @NotNull
    private static final String QUESTION_MARK = "?";

    private WebUtil() {
    }

    @NotNull
    public final String addParam(@NotNull String url, @NotNull String param, @Nullable String paramValue) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(param, "param");
        if (TextUtils.isEmpty(url) || TextUtils.isEmpty(param)) {
            return url;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(param, paramValue);
        return INSTANCE.addParams(url, linkedHashMap);
    }

    @NotNull
    public final String addParams(@NotNull String urlParam, @Nullable LinkedHashMap<String, String> params) {
        String strSubstring;
        Object objK;
        Set<Map.Entry<String, String>> setEntrySet;
        Intrinsics.checkNotNullParameter(urlParam, "urlParam");
        if (!TextUtils.isEmpty(urlParam)) {
            if ((params != null ? params.size() : 0) > 0) {
                int length = urlParam.length() - 1;
                int i7 = 0;
                boolean z3 = false;
                while (i7 <= length) {
                    boolean z8 = Intrinsics.h(urlParam.charAt(!z3 ? i7 : length), 32) <= 0;
                    if (z3) {
                        if (!z8) {
                            break;
                        }
                        length--;
                    } else if (z8) {
                        i7++;
                    } else {
                        z3 = true;
                    }
                }
                String string = urlParam.subSequence(i7, length + 1).toString();
                int iE = StringsKt.E(string, QUESTION_MARK, 0, false, 6);
                if (iE > -1) {
                    strSubstring = string.substring(0, iE);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    strSubstring = string;
                }
                LinkedHashMap paramsMap = getParamsMap(string);
                if (paramsMap == null) {
                    paramsMap = new LinkedHashMap();
                }
                if (params != null && (setEntrySet = params.entrySet()) != null) {
                    Iterator<T> it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key, "it.key");
                        paramsMap.put(key, entry.getValue());
                    }
                }
                if (paramsMap.size() <= 0) {
                    return strSubstring;
                }
                StringBuilder sb2 = new StringBuilder(strSubstring);
                sb2.append(QUESTION_MARK);
                Set<Map.Entry> setEntrySet2 = paramsMap.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet2, "paramsMapInUrl.entries");
                for (Map.Entry entry2 : setEntrySet2) {
                    sb2.append((String) entry2.getKey());
                    sb2.append(EQUAL_MARK);
                    String str = (String) entry2.getValue();
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    Set setEntrySet3 = paramsMap.entrySet();
                    Intrinsics.checkNotNullExpressionValue(setEntrySet3, "paramsMapInUrl.entries");
                    Intrinsics.checkNotNullParameter(setEntrySet3, "<this>");
                    if (setEntrySet3 instanceof List) {
                        objK = CollectionsKt.K((List) setEntrySet3);
                    } else {
                        Iterator it2 = setEntrySet3.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                        Object next = it2.next();
                        while (it2.hasNext()) {
                            next = it2.next();
                        }
                        objK = next;
                    }
                    if (!entry2.equals(objK)) {
                        sb2.append(AND_MARK);
                    }
                }
                String string2 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "paramBuffer.toString()");
                return string2;
            }
        }
        return urlParam;
    }

    @Nullable
    public final LinkedHashMap<String, String> getParamsMap(@NotNull String urlParam) {
        Intrinsics.checkNotNullParameter(urlParam, "urlParam");
        if (TextUtils.isEmpty(urlParam)) {
            return null;
        }
        int length = urlParam.length() - 1;
        int i7 = 0;
        boolean z3 = false;
        while (i7 <= length) {
            boolean z8 = Intrinsics.h(urlParam.charAt(!z3 ? i7 : length), 32) <= 0;
            if (z3) {
                if (!z8) {
                    break;
                }
                length--;
            } else if (z8) {
                i7++;
            } else {
                z3 = true;
            }
        }
        String string = urlParam.subSequence(i7, length + 1).toString();
        int length2 = string.length();
        int iE = StringsKt.E(string, QUESTION_MARK, 0, false, 6);
        if (iE <= -1 || length2 - 1 == iE) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(string.substring(0, iE), "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring = string.substring(iE + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        if (TextUtils.isEmpty(strSubstring)) {
            return null;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (String str : (String[]) StringsKt__StringsKt.split$default(strSubstring, new String[]{AND_MARK}, false, 0, 6, null).toArray(new String[0])) {
            if (!TextUtils.isEmpty(str)) {
                String[] strArr = (String[]) StringsKt__StringsKt.split$default(str, new String[]{EQUAL_MARK}, false, 0, 6, null).toArray(new String[0]);
                String str2 = strArr[0];
                if (!TextUtils.isEmpty(str2)) {
                    if (strArr.length > 1) {
                        int length3 = str2.length() - 1;
                        int i10 = 0;
                        boolean z10 = false;
                        while (i10 <= length3) {
                            boolean z11 = Intrinsics.h(str2.charAt(!z10 ? i10 : length3), 32) <= 0;
                            if (z10) {
                                if (!z11) {
                                    break;
                                }
                                length3--;
                            } else if (z11) {
                                i10++;
                            } else {
                                z10 = true;
                            }
                        }
                        linkedHashMap.put(str2.subSequence(i10, length3 + 1).toString(), strArr[1]);
                    } else {
                        int length4 = str2.length() - 1;
                        int i11 = 0;
                        boolean z12 = false;
                        while (i11 <= length4) {
                            boolean z13 = Intrinsics.h(str2.charAt(!z12 ? i11 : length4), 32) <= 0;
                            if (z12) {
                                if (!z13) {
                                    break;
                                }
                                length4--;
                            } else if (z13) {
                                i11++;
                            } else {
                                z12 = true;
                            }
                        }
                        linkedHashMap.put(str2.subSequence(i11, length4 + 1).toString(), "");
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final ArrayList<String> parseUrlJson(@NotNull String keyPreloadH5List, @NotNull String baseH5Url) {
        Intrinsics.checkNotNullParameter(keyPreloadH5List, "keyPreloadH5List");
        Intrinsics.checkNotNullParameter(baseH5Url, "baseH5Url");
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONObject(keyPreloadH5List).getJSONArray("list");
            if (jSONArray != null && jSONArray.length() > 0) {
                int length = jSONArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    arrayList.add(baseH5Url + jSONArray.optString(i7));
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
