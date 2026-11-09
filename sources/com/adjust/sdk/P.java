package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f19341g;

    public P(ActivityState activityState) {
        this.f19335a = -1;
        this.f19336b = -1;
        this.f19337c = -1;
        this.f19338d = -1L;
        this.f19339e = -1L;
        this.f19340f = null;
        this.f19341g = null;
        if (activityState == null) {
            return;
        }
        this.f19335a = activityState.eventCount;
        this.f19336b = activityState.sessionCount;
        this.f19337c = activityState.subsessionCount;
        this.f19338d = activityState.timeSpent;
        this.f19339e = activityState.sessionLength;
        this.f19340f = activityState.uuid;
        this.f19341g = activityState.pushToken;
    }
}
