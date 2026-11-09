package com.google.zxing.pdf417;

/* JADX INFO: loaded from: classes3.dex */
public final class PDF417ResultMetadata {
    private String addressee;
    private String fileId;
    private String fileName;
    private boolean lastSegment;
    private int[] optionalData;
    private int segmentIndex;
    private String sender;
    private int segmentCount = -1;
    private long fileSize = -1;
    private long timestamp = -1;
    private int checksum = -1;

    public String getAddressee() {
        return this.addressee;
    }

    public int getChecksum() {
        return this.checksum;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    @Deprecated
    public int[] getOptionalData() {
        return this.optionalData;
    }

    public int getSegmentCount() {
        return this.segmentCount;
    }

    public int getSegmentIndex() {
        return this.segmentIndex;
    }

    public String getSender() {
        return this.sender;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean isLastSegment() {
        return this.lastSegment;
    }

    public void setAddressee(String str) {
        this.addressee = str;
    }

    public void setChecksum(int i7) {
        this.checksum = i7;
    }

    public void setFileId(String str) {
        this.fileId = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileSize(long j6) {
        this.fileSize = j6;
    }

    public void setLastSegment(boolean z3) {
        this.lastSegment = z3;
    }

    @Deprecated
    public void setOptionalData(int[] iArr) {
        this.optionalData = iArr;
    }

    public void setSegmentCount(int i7) {
        this.segmentCount = i7;
    }

    public void setSegmentIndex(int i7) {
        this.segmentIndex = i7;
    }

    public void setSender(String str) {
        this.sender = str;
    }

    public void setTimestamp(long j6) {
        this.timestamp = j6;
    }
}
