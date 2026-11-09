package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes3.dex */
public final class SMSParsedResult extends ParsedResult {
    private final String body;
    private final String[] numbers;
    private final String subject;
    private final String[] vias;

    public SMSParsedResult(String str, String str2, String str3, String str4) {
        super(ParsedResultType.SMS);
        this.numbers = new String[]{str};
        this.vias = new String[]{str2};
        this.subject = str3;
        this.body = str4;
    }

    public String getBody() {
        return this.body;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(100);
        ParsedResult.maybeAppend(this.numbers, sb2);
        ParsedResult.maybeAppend(this.subject, sb2);
        ParsedResult.maybeAppend(this.body, sb2);
        return sb2.toString();
    }

    public String[] getNumbers() {
        return this.numbers;
    }

    public String getSMSURI() {
        StringBuilder sb2 = new StringBuilder("sms:");
        boolean z3 = true;
        for (int i7 = 0; i7 < this.numbers.length; i7++) {
            if (z3) {
                z3 = false;
            } else {
                sb2.append(',');
            }
            sb2.append(this.numbers[i7]);
            String[] strArr = this.vias;
            if (strArr != null && strArr[i7] != null) {
                sb2.append(";via=");
                sb2.append(this.vias[i7]);
            }
        }
        boolean z8 = this.body != null;
        boolean z10 = this.subject != null;
        if (z8 || z10) {
            sb2.append('?');
            if (z8) {
                sb2.append("body=");
                sb2.append(this.body);
            }
            if (z10) {
                if (z8) {
                    sb2.append('&');
                }
                sb2.append("subject=");
                sb2.append(this.subject);
            }
        }
        return sb2.toString();
    }

    public String getSubject() {
        return this.subject;
    }

    public String[] getVias() {
        return this.vias;
    }

    public SMSParsedResult(String[] strArr, String[] strArr2, String str, String str2) {
        super(ParsedResultType.SMS);
        this.numbers = strArr;
        this.vias = strArr2;
        this.subject = str;
        this.body = str2;
    }
}
