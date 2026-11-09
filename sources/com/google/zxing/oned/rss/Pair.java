package com.google.zxing.oned.rss;

/* JADX INFO: loaded from: classes3.dex */
final class Pair extends DataCharacter {
    private int count;
    private final FinderPattern finderPattern;

    public Pair(int i7, int i10, FinderPattern finderPattern) {
        super(i7, i10);
        this.finderPattern = finderPattern;
    }

    public int getCount() {
        return this.count;
    }

    public FinderPattern getFinderPattern() {
        return this.finderPattern;
    }

    public void incrementCount() {
        this.count++;
    }
}
