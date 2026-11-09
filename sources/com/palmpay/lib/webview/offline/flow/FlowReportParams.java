package com.palmpay.lib.webview.offline.flow;

/* JADX INFO: loaded from: classes3.dex */
public class FlowReportParams {
    private String mBisName;
    private String mDownloadMsg;
    private long mDownloadStartTime;
    private long mDownloadTime;
    private boolean mIsBrokenDown;
    private String mQueryMsg;
    private int mQueryResult;
    private long mQueryStartTime;
    private long mQueryTime;
    private long mUnZipStartTime;
    private String mUnzipMsg;
    private long mUnzipTime;
    private long mZipSize;
    private int mDownloadResult = 1;
    private int mUnzipResult = 1;

    public FlowReportParams(String str) {
        this.mBisName = str;
    }

    public void downloadResult(boolean z3, String str) {
        this.mDownloadTime = System.currentTimeMillis() - this.mDownloadStartTime;
        this.mDownloadResult = z3 ? 0 : -1;
        this.mDownloadMsg = str;
    }

    public void downloadStart() {
        this.mDownloadStartTime = System.currentTimeMillis();
    }

    public String getBisName() {
        return this.mBisName;
    }

    public String getDownloadMsg() {
        return this.mDownloadMsg;
    }

    public int getDownloadResult() {
        return this.mDownloadResult;
    }

    public long getDownloadTime() {
        return this.mDownloadTime;
    }

    public String getQueryMsg() {
        return this.mQueryMsg;
    }

    public int getQueryResult() {
        return this.mQueryResult;
    }

    public long getQueryTime() {
        return this.mQueryTime;
    }

    public String getUnzipMsg() {
        return this.mUnzipMsg;
    }

    public int getUnzipResult() {
        return this.mUnzipResult;
    }

    public long getUnzipTime() {
        return this.mUnzipTime;
    }

    public long getZipSize() {
        return this.mZipSize;
    }

    public boolean isBrokenDown() {
        return this.mIsBrokenDown;
    }

    public void queryEnd() {
        this.mQueryTime = System.currentTimeMillis() - this.mQueryStartTime;
    }

    public void queryStart() {
        this.mQueryStartTime = System.currentTimeMillis();
    }

    public void setQueryResult(boolean z3, String str) {
        this.mQueryResult = z3 ? 0 : -1;
        this.mQueryMsg = str;
    }

    public void unZipEnd(boolean z3, String str) {
        this.mUnzipTime = System.currentTimeMillis() - this.mUnZipStartTime;
        this.mUnzipResult = z3 ? 0 : -1;
        this.mUnzipMsg = str;
    }

    public void unZipStart() {
        this.mUnZipStartTime = System.currentTimeMillis();
    }

    public void zipSize(long j6) {
        this.mZipSize = j6;
    }

    public void isBrokenDown(boolean z3) {
        this.mIsBrokenDown = z3;
    }
}
