package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes3.dex */
final class BlockParsedResult {
    private final DecodedInformation decodedInformation;
    private final boolean finished;

    public BlockParsedResult() {
        this(null, false);
    }

    public DecodedInformation getDecodedInformation() {
        return this.decodedInformation;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public BlockParsedResult(DecodedInformation decodedInformation, boolean z3) {
        this.finished = z3;
        this.decodedInformation = decodedInformation;
    }
}
