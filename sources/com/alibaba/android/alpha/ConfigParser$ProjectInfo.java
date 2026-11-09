package com.alibaba.android.alpha;

/* JADX INFO: loaded from: classes.dex */
public class ConfigParser$ProjectInfo {
    public int mode;
    public String processName;
    public Task project;

    public ConfigParser$ProjectInfo(Task task, int i7, String str) {
        this.project = task;
        this.mode = i7;
        this.processName = str;
    }
}
