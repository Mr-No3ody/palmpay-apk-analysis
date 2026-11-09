package com.google.zxing.oned.rss.expanded;

import com.google.maps.android.BuildConfig;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class ExpandedPair {
    private final FinderPattern finderPattern;
    private final DataCharacter leftChar;
    private final DataCharacter rightChar;

    public ExpandedPair(DataCharacter dataCharacter, DataCharacter dataCharacter2, FinderPattern finderPattern) {
        this.leftChar = dataCharacter;
        this.rightChar = dataCharacter2;
        this.finderPattern = finderPattern;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExpandedPair)) {
            return false;
        }
        ExpandedPair expandedPair = (ExpandedPair) obj;
        return Objects.equals(this.leftChar, expandedPair.leftChar) && Objects.equals(this.rightChar, expandedPair.rightChar) && Objects.equals(this.finderPattern, expandedPair.finderPattern);
    }

    public FinderPattern getFinderPattern() {
        return this.finderPattern;
    }

    public DataCharacter getLeftChar() {
        return this.leftChar;
    }

    public DataCharacter getRightChar() {
        return this.rightChar;
    }

    public int hashCode() {
        return (Objects.hashCode(this.leftChar) ^ Objects.hashCode(this.rightChar)) ^ Objects.hashCode(this.finderPattern);
    }

    public boolean mustBeLast() {
        return this.rightChar == null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.leftChar);
        sb2.append(" , ");
        sb2.append(this.rightChar);
        sb2.append(" : ");
        FinderPattern finderPattern = this.finderPattern;
        sb2.append(finderPattern == null ? BuildConfig.TRAVIS : Integer.valueOf(finderPattern.getValue()));
        sb2.append(" ]");
        return sb2.toString();
    }
}
