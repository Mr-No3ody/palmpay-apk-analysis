package com.transsnet.analysis.data.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes3.dex */
@Entity(tableName = "events")
public class EventsEntity {
    public long create_time;
    public String data;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @PrimaryKey(autoGenerate = true)
    public long f25682id;
    public int type;
}
