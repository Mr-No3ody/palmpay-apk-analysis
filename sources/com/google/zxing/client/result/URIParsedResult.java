package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes3.dex */
public final class URIParsedResult extends ParsedResult {
    private final String title;
    private final String uri;

    public URIParsedResult(String str, String str2) {
        super(ParsedResultType.URI);
        this.uri = massageURI(str);
        this.title = str2;
    }

    private static boolean isColonFollowedByPortNumber(String str, int i7) {
        int i10 = i7 + 1;
        int iIndexOf = str.indexOf(47, i10);
        if (iIndexOf < 0) {
            iIndexOf = str.length();
        }
        return ResultParser.isSubstringOfDigits(str, i10, iIndexOf - i10);
    }

    private static String massageURI(String str) {
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(58);
        return (iIndexOf < 0 || isColonFollowedByPortNumber(strTrim, iIndexOf)) ? "http://".concat(strTrim) : strTrim;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(30);
        ParsedResult.maybeAppend(this.title, sb2);
        ParsedResult.maybeAppend(this.uri, sb2);
        return sb2.toString();
    }

    public String getTitle() {
        return this.title;
    }

    public String getURI() {
        return this.uri;
    }

    @Deprecated
    public boolean isPossiblyMaliciousURI() {
        return URIResultParser.isPossiblyMaliciousURI(this.uri);
    }
}
