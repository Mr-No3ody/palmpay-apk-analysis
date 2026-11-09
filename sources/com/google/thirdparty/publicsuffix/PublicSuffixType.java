package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible
public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY('!', '?');

    private final char innerNodeCode;
    private final char leafNodeCode;

    PublicSuffixType(char c6, char c10) {
        this.innerNodeCode = c6;
        this.leafNodeCode = c10;
    }

    public static PublicSuffixType fromCode(char c6) {
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.getInnerNodeCode() == c6 || publicSuffixType.getLeafNodeCode() == c6) {
                return publicSuffixType;
            }
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("No enum corresponding to given code: ");
        sb2.append(c6);
        throw new IllegalArgumentException(sb2.toString());
    }

    public char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    public char getLeafNodeCode() {
        return this.leafNodeCode;
    }
}
